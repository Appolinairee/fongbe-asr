package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzezb {
    private final zzfdw zza;
    private final zzcuz zzb;
    private final Executor zzc;
    /* access modifiers changed from: private */
    public zzeyz zzd;

    public zzezb(zzfdw zzfdw, zzcuz zzcuz, Executor executor) {
        this.zza = zzfdw;
        this.zzb = zzcuz;
        this.zzc = executor;
    }

    /* access modifiers changed from: private */
    @Deprecated
    public final zzfeg zze() {
        zzfcj zzg = this.zzb.zzg();
        return this.zza.zzc(zzg.zzd, zzg.zzf, zzg.zzj);
    }

    public final ListenableFuture zzc() {
        ListenableFuture listenableFuture;
        zzeyz zzeyz = this.zzd;
        if (zzeyz != null) {
            return zzgch.zzh(zzeyz);
        }
        if (!((Boolean) zzbes.zza.zze()).booleanValue()) {
            zzeyz zzeyz2 = new zzeyz((zzbvk) null, zze(), (zzeza) null);
            this.zzd = zzeyz2;
            listenableFuture = zzgch.zzh(zzeyz2);
        } else {
            Class<zzdyh> cls = zzdyh.class;
            listenableFuture = (zzgby) zzgch.zze((zzgby) zzgch.zzm(zzgby.zzu(this.zzb.zzb().zze(this.zza.zza())), new zzeyy(this), this.zzc), cls, new zzeyx(this), this.zzc);
        }
        return zzgch.zzm(listenableFuture, new zzeyw(), this.zzc);
    }
}
