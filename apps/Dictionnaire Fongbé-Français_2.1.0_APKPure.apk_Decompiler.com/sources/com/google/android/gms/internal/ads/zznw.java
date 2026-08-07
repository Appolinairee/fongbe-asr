package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zznw {
    private final zzbo zza;
    /* access modifiers changed from: private */
    public zzfxn zzb = zzfxn.zzn();
    private zzfxq zzc = zzfxq.zzd();
    private zzug zzd;
    private zzug zze;
    private zzug zzf;

    public zznw(zzbo zzbo) {
        this.zza = zzbo;
    }

    private static zzug zzj(zzbk zzbk, zzfxn zzfxn, zzug zzug, zzbo zzbo) {
        zzbq zzn = zzbk.zzn();
        int zze2 = zzbk.zze();
        Object zzf2 = zzn.zzo() ? null : zzn.zzf(zze2);
        int zzc2 = (zzbk.zzw() || zzn.zzo()) ? -1 : zzn.zzd(zze2, zzbo, false).zzc(zzei.zzs(zzbk.zzk()));
        for (int i = 0; i < zzfxn.size(); i++) {
            zzug zzug2 = (zzug) zzfxn.get(i);
            if (zzm(zzug2, zzf2, zzbk.zzw(), zzbk.zzb(), zzbk.zzc(), zzc2)) {
                return zzug2;
            }
        }
        if (zzfxn.isEmpty() && zzug != null) {
            if (zzm(zzug, zzf2, zzbk.zzw(), zzbk.zzb(), zzbk.zzc(), zzc2)) {
                return zzug;
            }
        }
        return null;
    }

    private final void zzk(zzfxp zzfxp, zzug zzug, zzbq zzbq) {
        if (zzug != null) {
            if (zzbq.zza(zzug.zza) != -1) {
                zzfxp.zza(zzug, zzbq);
                return;
            }
            zzbq zzbq2 = (zzbq) this.zzc.get(zzug);
            if (zzbq2 != null) {
                zzfxp.zza(zzug, zzbq2);
            }
        }
    }

    private final void zzl(zzbq zzbq) {
        zzfxp zzfxp = new zzfxp();
        if (this.zzb.isEmpty()) {
            zzk(zzfxp, this.zze, zzbq);
            if (!zzfuk.zza(this.zzf, this.zze)) {
                zzk(zzfxp, this.zzf, zzbq);
            }
            if (!zzfuk.zza(this.zzd, this.zze) && !zzfuk.zza(this.zzd, this.zzf)) {
                zzk(zzfxp, this.zzd, zzbq);
            }
        } else {
            for (int i = 0; i < this.zzb.size(); i++) {
                zzk(zzfxp, (zzug) this.zzb.get(i), zzbq);
            }
            if (!this.zzb.contains(this.zzd)) {
                zzk(zzfxp, this.zzd, zzbq);
            }
        }
        this.zzc = zzfxp.zzc();
    }

    private static boolean zzm(zzug zzug, Object obj, boolean z, int i, int i2, int i3) {
        if (!zzug.zza.equals(obj)) {
            return false;
        }
        if (z) {
            if (!(zzug.zzb == i && zzug.zzc == i2)) {
                return false;
            }
        } else if (!(zzug.zzb == -1 && zzug.zze == i3)) {
            return false;
        }
        return true;
    }

    public final zzbq zza(zzug zzug) {
        return (zzbq) this.zzc.get(zzug);
    }

    public final zzug zzb() {
        return this.zzd;
    }

    public final zzug zzc() {
        Object obj;
        Object next;
        if (this.zzb.isEmpty()) {
            return null;
        }
        zzfxn zzfxn = this.zzb;
        if (zzfxn instanceof List) {
            List list = zzfxn;
            if (!list.isEmpty()) {
                obj = list.get(list.size() - 1);
            } else {
                throw new NoSuchElementException();
            }
        } else {
            Iterator it = zzfxn.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        }
        return (zzug) obj;
    }

    public final zzug zzd() {
        return this.zze;
    }

    public final zzug zze() {
        return this.zzf;
    }

    public final void zzg(zzbk zzbk) {
        this.zzd = zzj(zzbk, this.zzb, this.zze, this.zza);
    }

    public final void zzh(List list, zzug zzug, zzbk zzbk) {
        this.zzb = zzfxn.zzl(list);
        if (!list.isEmpty()) {
            this.zze = (zzug) list.get(0);
            zzug.getClass();
            zzug zzug2 = zzug;
            this.zzf = zzug;
        }
        if (this.zzd == null) {
            this.zzd = zzj(zzbk, this.zzb, this.zze, this.zza);
        }
        zzl(zzbk.zzn());
    }

    public final void zzi(zzbk zzbk) {
        this.zzd = zzj(zzbk, this.zzb, this.zze, this.zza);
        zzl(zzbk.zzn());
    }
}
