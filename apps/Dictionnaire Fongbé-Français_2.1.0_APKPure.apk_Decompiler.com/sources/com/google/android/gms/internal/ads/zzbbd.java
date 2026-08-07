package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzbbd implements BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzbav zza;
    final /* synthetic */ zzcab zzb;
    final /* synthetic */ zzbbf zzc;

    zzbbd(zzbbf zzbbf, zzbav zzbav, zzcab zzcab) {
        this.zza = zzbav;
        this.zzb = zzcab;
        this.zzc = zzbbf;
    }

    public final void onConnectionSuspended(int i) {
    }

    public final void onConnected(Bundle bundle) {
        synchronized (this.zzc.zzd) {
            zzbbf zzbbf = this.zzc;
            if (!zzbbf.zzb) {
                zzbbf.zzb = true;
                zzbau zza2 = this.zzc.zza;
                if (zza2 != null) {
                    ListenableFuture zza3 = zzbzw.zza.zza(new zzbba(this, zza2, this.zza, this.zzb));
                    zzcab zzcab = this.zzb;
                    zzcab.addListener(new zzbbb(zzcab, zza3), zzbzw.zzg);
                }
            }
        }
    }
}
