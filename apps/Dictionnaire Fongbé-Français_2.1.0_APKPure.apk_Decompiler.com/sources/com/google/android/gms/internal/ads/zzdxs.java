package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public abstract class zzdxs implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzcab zza = new zzcab();
    protected final Object zzb = new Object();
    protected boolean zzc = false;
    protected boolean zzd = false;
    protected zzbvk zze;
    protected zzbup zzf;

    static void zzc(Context context, ListenableFuture listenableFuture, Executor executor) {
        if (((Boolean) zzbed.zzj.zze()).booleanValue() || ((Boolean) zzbed.zzh.zze()).booleanValue()) {
            zzgch.zzr(listenableFuture, new zzdxp(context), executor);
        }
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
        zzo.zze("Disconnected from remote ad request service.");
        this.zza.zzd(new zzdyh(1));
    }

    public final void onConnectionSuspended(int i) {
        zzo.zze("Cannot connect to remote service, fallback to local instance.");
    }

    /* access modifiers changed from: protected */
    public final void zzb() {
        synchronized (this.zzb) {
            this.zzd = true;
            if (this.zzf.isConnected() || this.zzf.isConnecting()) {
                this.zzf.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }
}
