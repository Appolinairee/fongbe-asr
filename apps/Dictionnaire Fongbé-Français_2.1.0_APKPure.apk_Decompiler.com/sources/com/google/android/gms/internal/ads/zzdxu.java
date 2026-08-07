package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdxu extends zzdxs {
    private final Context zzg;
    private final Executor zzh;

    zzdxu(Context context, Executor executor) {
        this.zzg = context;
        this.zzh = executor;
        this.zzf = new zzbup(context, zzv.zzu().zzb(), this, this);
    }

    public final void onConnected(Bundle bundle) {
        zzbvc zzbvc;
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    zzbuy zzp = this.zzf.zzp();
                    zzbvk zzbvk = this.zze;
                    if (((Boolean) zzbe.zzc().zza(zzbcl.zzmM)).booleanValue()) {
                        zzbvc = new zzdxr(this.zza, this.zze);
                    } else {
                        zzbvc = new zzdxq(this);
                    }
                    zzp.zzf(zzbvk, zzbvc);
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zzd(new zzdyh(1));
                } catch (Throwable th) {
                    zzv.zzp().zzw(th, "RemoteSignalsClientTask.onConnected");
                    this.zza.zzd(new zzdyh(1));
                }
            }
        }
    }

    public final ListenableFuture zza(zzbvk zzbvk) {
        synchronized (this.zzb) {
            if (this.zzc) {
                zzcab zzcab = this.zza;
                return zzcab;
            }
            this.zzc = true;
            this.zze = zzbvk;
            this.zzf.checkAvailabilityAndConnect();
            this.zza.addListener(new zzdxt(this), zzbzw.zzg);
            zzc(this.zzg, this.zza, this.zzh);
            zzcab zzcab2 = this.zza;
            return zzcab2;
        }
    }
}
