package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdkg implements zzcwn {
    private final zzdif zza;
    private final zzdik zzb;
    private final Executor zzc;
    private final Executor zzd;

    public zzdkg(zzdif zzdif, zzdik zzdik, Executor executor, Executor executor2) {
        this.zza = zzdif;
        this.zzb = zzdik;
        this.zzc = executor;
        this.zzd = executor2;
    }

    /* access modifiers changed from: private */
    public final void zzb(zzcex zzcex) {
        this.zzc.execute(new zzdke(zzcex));
    }

    public final void zzr() {
        if (this.zzb.zzd()) {
            zzdif zzdif = this.zza;
            zzecr zzu = zzdif.zzu();
            if (zzu == null && zzdif.zzw() != null) {
                if (((Boolean) zzbe.zzc().zza(zzbcl.zzfl)).booleanValue()) {
                    zzdif zzdif2 = this.zza;
                    ListenableFuture zzw = zzdif2.zzw();
                    zzcab zzp = zzdif2.zzp();
                    if (zzw != null && zzp != null) {
                        zzgch.zzr(zzgch.zzl(zzw, zzp), new zzdkf(this), this.zzd);
                        return;
                    }
                    return;
                }
            }
            if (zzu != null) {
                zzdif zzdif3 = this.zza;
                zzcex zzr = zzdif3.zzr();
                zzcex zzs = zzdif3.zzs();
                if (zzr == null) {
                    zzr = zzs != null ? zzs : null;
                }
                if (zzr != null) {
                    zzb(zzr);
                }
            }
        }
    }
}
