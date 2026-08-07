package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgeg {
    private final zzgsx zza;
    private final List zzb;
    private final zzglo zzc;

    private zzgeg(zzgsx zzgsx, List list) {
        this.zza = zzgsx;
        this.zzb = list;
        this.zzc = zzglo.zza;
    }

    /* synthetic */ zzgeg(zzgsx zzgsx, List list, zzglo zzglo, zzgef zzgef) {
        this.zza = zzgsx;
        this.zzb = list;
        this.zzc = zzglo;
    }

    static final zzgeg zza(zzgsx zzgsx) throws GeneralSecurityException {
        zzh(zzgsx);
        return new zzgeg(zzgsx, zzg(zzgsx));
    }

    public static final zzgeg zzb(zzgek zzgek) throws GeneralSecurityException {
        zzged zzged = new zzged();
        zzgeb zzgeb = new zzgeb(zzgek, (zzgef) null);
        zzgeb.zzd();
        zzgeb.zzc();
        zzged.zza(zzgeb);
        return zzged.zzb();
    }

    private final Object zzf(zzgky zzgky, Class cls, Class cls2) throws GeneralSecurityException {
        int i = zzger.zza;
        zzgsx zzgsx = this.zza;
        int zzb2 = zzgsx.zzb();
        int i2 = 0;
        boolean z = false;
        boolean z2 = true;
        for (zzgsv zzgsv : zzgsx.zzh()) {
            if (zzgsv.zzk() == 3) {
                if (!zzgsv.zzj()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(zzgsv.zza())}));
                } else if (zzgsv.zzf() == zzgtp.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(zzgsv.zza())}));
                } else if (zzgsv.zzk() != 2) {
                    if (zzgsv.zza() == zzb2) {
                        if (!z) {
                            z = true;
                        } else {
                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                        }
                    }
                    z2 &= zzgsv.zzb().zzb() == zzgsj.ASYMMETRIC_PUBLIC;
                    i2++;
                } else {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(zzgsv.zza())}));
                }
            }
        }
        if (i2 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        } else if (z || z2) {
            zzgnc zzb3 = zzgnf.zzb(cls2);
            zzb3.zzc(this.zzc);
            for (int i3 = 0; i3 < this.zzb.size(); i3++) {
                zzgsv zzd = this.zza.zzd(i3);
                if (zzd.zzk() == 3) {
                    zzgee zzgee = (zzgee) this.zzb.get(i3);
                    if (zzgee != null) {
                        zzgdx zza2 = zzgee.zza();
                        try {
                            Object zzb4 = zzgky.zzb(zza2, cls2);
                            if (zzd.zza() == this.zza.zzb()) {
                                zzb3.zzb(zzb4, zza2, zzd);
                            } else {
                                zzb3.zza(zzb4, zza2, zzd);
                            }
                        } catch (GeneralSecurityException e) {
                            String obj = cls2.toString();
                            String zzg = zzd.zzb().zzg();
                            throw new GeneralSecurityException("Unable to get primitive " + obj + " for key of type " + zzg + ", see https://developers.google.com/tink/faq/registration_errors", e);
                        }
                    } else {
                        String zzg2 = zzd.zzb().zzg();
                        throw new GeneralSecurityException("Key parsing of key with index " + i3 + " and type_url " + zzg2 + " failed, unable to get primitive");
                    }
                }
            }
            return zzgky.zzc(zzb3.zzd(), cls);
        } else {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }

    private static List zzg(zzgsx zzgsx) {
        zzgdx zzgdx;
        zzgdz zzgdz;
        ArrayList arrayList = new ArrayList(zzgsx.zza());
        for (zzgsv zzgsv : zzgsx.zzh()) {
            int zza2 = zzgsv.zza();
            try {
                zzgnh zza3 = zzgnh.zza(zzgsv.zzb().zzg(), zzgsv.zzb().zzf(), zzgsv.zzb().zzb(), zzgsv.zzf(), zzgsv.zzf() == zzgtp.RAW ? null : Integer.valueOf(zzgsv.zza()));
                zzgmk zzc2 = zzgmk.zzc();
                zzgeo zza4 = zzgeo.zza();
                if (!zzc2.zzj(zza3)) {
                    zzgdx = new zzglk(zza3, zza4);
                } else {
                    zzgdx = zzc2.zza(zza3, zza4);
                }
                int zzk = zzgsv.zzk() - 2;
                if (zzk == 1) {
                    zzgdz = zzgdz.zza;
                } else if (zzk == 2) {
                    zzgdz = zzgdz.zzb;
                } else if (zzk == 3) {
                    zzgdz = zzgdz.zzc;
                } else {
                    throw new GeneralSecurityException("Unknown key status");
                }
                arrayList.add(new zzgee(zzgdx, zzgdz, zza2, zza2 == zzgsx.zzb(), (zzgef) null));
            } catch (GeneralSecurityException unused) {
                arrayList.add((Object) null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* access modifiers changed from: private */
    public static void zzh(zzgsx zzgsx) throws GeneralSecurityException {
        if (zzgsx == null || zzgsx.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public final String toString() {
        int i = zzger.zza;
        zzgsy zza2 = zzgtc.zza();
        zzgsx zzgsx = this.zza;
        zza2.zzb(zzgsx.zzb());
        for (zzgsv zzgsv : zzgsx.zzh()) {
            zzgsz zza3 = zzgta.zza();
            zza3.zzc(zzgsv.zzb().zzg());
            zza3.zzd(zzgsv.zzk());
            zza3.zzb(zzgsv.zzf());
            zza3.zza(zzgsv.zza());
            zza2.zza((zzgta) zza3.zzbr());
        }
        return ((zzgtc) zza2.zzbr()).toString();
    }

    /* access modifiers changed from: package-private */
    public final zzgsx zzc() {
        return this.zza;
    }

    public final Object zzd(zzgdr zzgdr, Class cls) throws GeneralSecurityException {
        zzgky zzgky = (zzgky) zzgdr;
        Class zza2 = zzgky.zza(cls);
        if (zza2 != null) {
            return zzf(zzgky, cls, zza2);
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(String.valueOf(cls.getName())));
    }
}
