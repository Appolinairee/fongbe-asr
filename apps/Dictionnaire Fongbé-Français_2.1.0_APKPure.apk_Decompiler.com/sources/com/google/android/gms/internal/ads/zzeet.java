package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeet extends zzbwg implements zzcxd {
    private zzbwh zza;
    private zzcxc zzb;
    private zzded zzc;

    public final synchronized void zza(zzcxc zzcxc) {
        this.zzb = zzcxc;
    }

    public final synchronized void zzc(zzbwh zzbwh) {
        this.zza = zzbwh;
    }

    public final synchronized void zzd(zzded zzded) {
        this.zzc = zzded;
    }

    public final synchronized void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwh zzbwh = this.zza;
        if (zzbwh != null) {
            ((zzehy) zzbwh).zzb.onAdClicked();
        }
    }

    public final synchronized void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwh zzbwh = this.zza;
        if (zzbwh != null) {
            zzbwh.zzf(iObjectWrapper);
        }
    }

    public final synchronized void zzg(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzcxc zzcxc = this.zzb;
        if (zzcxc != null) {
            zzcxc.zza(i);
        }
    }

    public final synchronized void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwh zzbwh = this.zza;
        if (zzbwh != null) {
            ((zzehy) zzbwh).zzc.zzb();
        }
    }

    public final synchronized void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcxc zzcxc = this.zzb;
        if (zzcxc != null) {
            zzcxc.zzd();
        }
    }

    public final synchronized void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwh zzbwh = this.zza;
        if (zzbwh != null) {
            ((zzehy) zzbwh).zza.zzdp();
        }
    }

    public final synchronized void zzk(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzded zzded = this.zzc;
        if (zzded != null) {
            zzo.zzj("Fail to initialize adapter ".concat(String.valueOf(((zzehx) zzded).zzc.zza)));
        }
    }

    public final synchronized void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzded zzded = this.zzc;
        if (zzded != null) {
            Executor zzc2 = ((zzehx) zzded).zzd.zzb;
            zzecz zzecz = ((zzehx) zzded).zzc;
            zzfbo zzfbo = ((zzehx) zzded).zzb;
            zzc2.execute(new zzehw((zzehx) zzded, ((zzehx) zzded).zza, zzfbo, zzecz));
        }
    }

    public final synchronized void zzm(IObjectWrapper iObjectWrapper, zzbwi zzbwi) throws RemoteException {
        zzbwh zzbwh = this.zza;
        if (zzbwh != null) {
            ((zzehy) zzbwh).zzd.zza(zzbwi);
        }
    }

    public final synchronized void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwh zzbwh = this.zza;
        if (zzbwh != null) {
            ((zzehy) zzbwh).zzc.zze();
        }
    }

    public final synchronized void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbwh zzbwh = this.zza;
        if (zzbwh != null) {
            ((zzehy) zzbwh).zzd.zzc();
        }
    }
}
