package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzged {
    private final List zza = new ArrayList();
    private final zzglo zzb = zzglo.zza;
    private boolean zzc = false;

    /* access modifiers changed from: private */
    public final void zzd() {
        for (zzgeb zzi : this.zza) {
            zzi.zza = false;
        }
    }

    public final zzged zza(zzgeb zzgeb) {
        if (zzgeb.zzf == null) {
            if (zzgeb.zza) {
                zzd();
            }
            zzgeb.zzf = this;
            this.zza.add(zzgeb);
            return this;
        }
        throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
    }

    public final zzgeg zzb() throws GeneralSecurityException {
        byte b;
        int i;
        if (!this.zzc) {
            char c = 1;
            this.zzc = true;
            List list = this.zza;
            zzgst zzc2 = zzgsx.zzc();
            ArrayList arrayList = new ArrayList(list.size());
            List list2 = this.zza;
            char c2 = 0;
            int i2 = 0;
            while (i2 < list2.size() - 1) {
                int i3 = i2 + 1;
                if (((zzgeb) list2.get(i2)).zze != zzgec.zza || ((zzgeb) list2.get(i3)).zze == zzgec.zza) {
                    i2 = i3;
                } else {
                    throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                }
            }
            HashSet hashSet = new HashSet();
            Integer num = null;
            for (zzgeb zzgeb : this.zza) {
                zzgdz unused = zzgeb.zzb;
                if (zzgeb.zze != null) {
                    int i4 = 4;
                    if (zzgeb.zze == zzgec.zza) {
                        b = 0;
                        while (true) {
                            if (b != 0 && !hashSet.contains(Integer.valueOf(b))) {
                                break;
                            }
                            SecureRandom secureRandom = new SecureRandom();
                            byte[] bArr = new byte[i4];
                            byte b2 = 0;
                            while (b2 == 0) {
                                secureRandom.nextBytes(bArr);
                                b2 = ((bArr[2] & 255) << 8) | ((bArr[c2] & 255) << Ascii.CAN) | ((bArr[c] & 255) << Ascii.DLE) | (bArr[3] & 255);
                                c2 = 0;
                                i4 = 4;
                            }
                            b = b2;
                        }
                    } else {
                        zzgec unused2 = zzgeb.zze;
                        b = 0;
                    }
                    Integer valueOf = Integer.valueOf(b);
                    if (!hashSet.contains(valueOf)) {
                        hashSet.add(valueOf);
                        zzgdx unused3 = zzgeb.zzc;
                        zzgdx zza2 = zzgma.zzb().zza(zzgeb.zzd, c != zzgeb.zzd.zza() ? null : valueOf);
                        zzgee zzgee = new zzgee(zza2, zzgeb.zzb, b, zzgeb.zza, (zzgef) null);
                        zzgdz zzb2 = zzgeb.zzb;
                        zzgnh zzgnh = (zzgnh) zzgmk.zzc().zzd(zza2, zzgnh.class, zzgeo.zza());
                        Integer zzf = zzgnh.zzf();
                        if (zzf == null || zzf.intValue() == b) {
                            if (zzgdz.zza.equals(zzb2)) {
                                i = 3;
                            } else if (zzgdz.zzb.equals(zzb2)) {
                                i = 4;
                            } else if (zzgdz.zzc.equals(zzb2)) {
                                i = 5;
                            } else {
                                throw new IllegalStateException("Unknown key status");
                            }
                            zzgsu zzc3 = zzgsv.zzc();
                            zzgsi zza3 = zzgsl.zza();
                            zza3.zzb(zzgnh.zzg());
                            zza3.zzc(zzgnh.zze());
                            zza3.zza(zzgnh.zzb());
                            zzc3.zza(zza3);
                            zzc3.zzd(i);
                            zzc3.zzb(b);
                            zzc3.zzc(zzgnh.zzc());
                            zzc2.zza((zzgsv) zzc3.zzbr());
                            if (zzgeb.zza) {
                                if (num != null) {
                                    throw new GeneralSecurityException("Two primaries were set");
                                } else if (zzgeb.zzb == zzgdz.zza) {
                                    num = valueOf;
                                } else {
                                    throw new GeneralSecurityException("Primary key is not enabled");
                                }
                            }
                            arrayList.add(zzgee);
                            c = 1;
                            c2 = 0;
                        } else {
                            throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                        }
                    } else {
                        throw new GeneralSecurityException("Id " + b + " is used twice in the keyset");
                    }
                } else {
                    throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
                }
            }
            if (num != null) {
                zzc2.zzb(num.intValue());
                zzgsx zzgsx = (zzgsx) zzc2.zzbr();
                zzgeg.zzh(zzgsx);
                return new zzgeg(zzgsx, arrayList, this.zzb, (zzgef) null);
            }
            throw new GeneralSecurityException("No primary was set");
        }
        throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
    }
}
