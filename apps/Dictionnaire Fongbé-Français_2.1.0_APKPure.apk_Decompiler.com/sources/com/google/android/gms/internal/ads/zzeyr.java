package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeyr implements zzezf {
    private final zzfdw zza;
    private final Executor zzb;
    private final zzgcd zzc = new zzeyp(this);

    public zzeyr(zzfdw zzfdw, Executor executor) {
        this.zza = zzfdw;
        this.zzb = executor;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zza(zzcuz zzcuz, zzeyz zzeyz) throws Exception {
        zzfdw zzfdw = this.zza;
        zzfeg zzfeg = zzeyz.zzb;
        zzbvk zzbvk = zzeyz.zza;
        zzfef zzb2 = zzfdw.zzb(zzfeg);
        if (!(zzb2 == null || zzbvk == null)) {
            zzgch.zzr(zzcuz.zzb().zzg(zzbvk), this.zzc, this.zzb);
        }
        return zzgch.zzh(new zzeyq(zzfeg, zzbvk, zzb2));
    }

    public final ListenableFuture zzb(zzezg zzezg, zzeze zzeze, zzcuz zzcuz) {
        return (zzgby) zzgch.zze((zzgby) zzgch.zzn(zzgby.zzu(new zzezb(this.zza, zzcuz, this.zzb).zzc()), new zzeyn(this, zzcuz), this.zzb), Exception.class, new zzeyo(this), this.zzb);
    }

    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzezg zzezg, zzeze zzeze, Object obj) {
        zzcuz zzcuz = null;
        return zzb(zzezg, zzeze, (zzcuz) null);
    }

    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
