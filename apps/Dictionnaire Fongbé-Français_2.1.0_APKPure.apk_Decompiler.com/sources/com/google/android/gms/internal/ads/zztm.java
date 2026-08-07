package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zztm implements zzur, zzrb {
    final /* synthetic */ zzto zza;
    private final Object zzb;
    private zzuq zzc;
    private zzra zzd;

    public zztm(zzto zzto, Object obj) {
        this.zza = zzto;
        this.zzc = zzto.zze((zzug) null);
        this.zzd = zzto.zzc((zzug) null);
        this.zzb = obj;
    }

    private final zzuc zzf(zzuc zzuc, zzug zzug) {
        zzto zzto = this.zza;
        Object obj = this.zzb;
        long j = zzuc.zzc;
        zzto.zzx(obj, j, zzug);
        zzto zzto2 = this.zza;
        Object obj2 = this.zzb;
        long j2 = zzuc.zzd;
        zzto2.zzx(obj2, j2, zzug);
        return (j == zzuc.zzc && j2 == zzuc.zzd) ? zzuc : new zzuc(1, zzuc.zza, zzuc.zzb, 0, (Object) null, j, j2);
    }

    private final boolean zzg(int i, zzug zzug) {
        zzug zzug2;
        if (zzug != null) {
            zzug2 = this.zza.zzy(this.zzb, zzug);
            if (zzug2 == null) {
                return false;
            }
        } else {
            zzug2 = null;
        }
        this.zza.zzw(this.zzb, 0);
        zzuq zzuq = this.zzc;
        int i2 = zzuq.zza;
        if (!Objects.equals(zzuq.zzb, zzug2)) {
            this.zzc = this.zza.zzf(0, zzug2);
        }
        zzra zzra = this.zzd;
        int i3 = zzra.zza;
        if (Objects.equals(zzra.zzb, zzug2)) {
            return true;
        }
        this.zzd = this.zza.zzd(0, zzug2);
        return true;
    }

    public final void zzaf(int i, zzug zzug, zzuc zzuc) {
        if (zzg(0, zzug)) {
            this.zzc.zzd(zzf(zzuc, zzug));
        }
    }

    public final void zzag(int i, zzug zzug, zztx zztx, zzuc zzuc) {
        if (zzg(0, zzug)) {
            this.zzc.zze(zztx, zzf(zzuc, zzug));
        }
    }

    public final void zzah(int i, zzug zzug, zztx zztx, zzuc zzuc) {
        if (zzg(0, zzug)) {
            this.zzc.zzf(zztx, zzf(zzuc, zzug));
        }
    }

    public final void zzai(int i, zzug zzug, zztx zztx, zzuc zzuc, IOException iOException, boolean z) {
        if (zzg(0, zzug)) {
            this.zzc.zzg(zztx, zzf(zzuc, zzug), iOException, z);
        }
    }

    public final void zzaj(int i, zzug zzug, zztx zztx, zzuc zzuc) {
        if (zzg(0, zzug)) {
            this.zzc.zzh(zztx, zzf(zzuc, zzug));
        }
    }
}
