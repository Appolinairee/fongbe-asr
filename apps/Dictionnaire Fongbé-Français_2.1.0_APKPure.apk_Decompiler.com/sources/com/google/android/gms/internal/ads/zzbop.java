package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbop {
    private final zzbns zza;
    private ListenableFuture zzb;

    zzbop(zzbns zzbns) {
        this.zza = zzbns;
    }

    private final void zzd() {
        if (this.zzb == null) {
            zzcab zzcab = new zzcab();
            this.zzb = zzcab;
            this.zza.zzb((zzava) null).zzj(new zzbom(zzcab), new zzbon(zzcab));
        }
    }

    public final zzbos zza(String str, zzbnz zzbnz, zzbny zzbny) {
        zzd();
        return new zzbos(this.zzb, "google.afma.activeView.handleUpdate", zzbnz, zzbny);
    }

    public final void zzb(String str, zzbjp zzbjp) {
        zzd();
        this.zzb = zzgch.zzn(this.zzb, new zzboo(str, zzbjp), zzbzw.zzg);
    }

    public final void zzc(String str, zzbjp zzbjp) {
        this.zzb = zzgch.zzm(this.zzb, new zzbol(str, zzbjp), zzbzw.zzg);
    }
}
