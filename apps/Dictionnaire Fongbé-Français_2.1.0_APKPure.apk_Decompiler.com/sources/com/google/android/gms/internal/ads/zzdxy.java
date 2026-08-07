package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.ConnectionResult;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdxy extends zzdxs {
    private String zzg;
    private int zzh = 1;

    zzdxy(Context context) {
        this.zzf = new zzbup(context, zzv.zzu().zzb(), this, this);
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        zzo.zze("Cannot connect to remote service, fallback to local instance.");
        this.zza.zzd(new zzdyh(1));
    }

    public final ListenableFuture zza(zzbvk zzbvk) {
        synchronized (this.zzb) {
            int i = this.zzh;
            if (i != 1 && i != 2) {
                ListenableFuture zzg2 = zzgch.zzg(new zzdyh(2));
                return zzg2;
            } else if (this.zzc) {
                zzcab zzcab = this.zza;
                return zzcab;
            } else {
                this.zzh = 2;
                this.zzc = true;
                this.zze = zzbvk;
                this.zzf.checkAvailabilityAndConnect();
                this.zza.addListener(new zzdxw(this), zzbzw.zzg);
                zzcab zzcab2 = this.zza;
                return zzcab2;
            }
        }
    }

    public final ListenableFuture zzd(String str) {
        synchronized (this.zzb) {
            int i = this.zzh;
            if (i != 1 && i != 3) {
                ListenableFuture zzg2 = zzgch.zzg(new zzdyh(2));
                return zzg2;
            } else if (this.zzc) {
                zzcab zzcab = this.zza;
                return zzcab;
            } else {
                this.zzh = 3;
                this.zzc = true;
                this.zzg = str;
                this.zzf.checkAvailabilityAndConnect();
                this.zza.addListener(new zzdxx(this), zzbzw.zzg);
                zzcab zzcab2 = this.zza;
                return zzcab2;
            }
        }
    }

    public final void onConnected(Bundle bundle) {
        zzbvc zzbvc;
        zzbvc zzbvc2;
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    int i = this.zzh;
                    if (i == 2) {
                        zzbuy zzp = this.zzf.zzp();
                        zzbvk zzbvk = this.zze;
                        if (((Boolean) zzbe.zzc().zza(zzbcl.zzmM)).booleanValue()) {
                            zzbvc2 = new zzdxr(this.zza, this.zze);
                        } else {
                            zzbvc2 = new zzdxq(this);
                        }
                        zzp.zze(zzbvk, zzbvc2);
                    } else if (i == 3) {
                        zzbuy zzp2 = this.zzf.zzp();
                        String str = this.zzg;
                        if (((Boolean) zzbe.zzc().zza(zzbcl.zzmM)).booleanValue()) {
                            zzbvc = new zzdxr(this.zza, this.zze);
                        } else {
                            zzbvc = new zzdxq(this);
                        }
                        zzp2.zzh(str, zzbvc);
                    } else {
                        this.zza.zzd(new zzdyh(1));
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zzd(new zzdyh(1));
                } catch (Throwable th) {
                    zzv.zzp().zzw(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                    this.zza.zzd(new zzdyh(1));
                }
            }
        }
    }
}
