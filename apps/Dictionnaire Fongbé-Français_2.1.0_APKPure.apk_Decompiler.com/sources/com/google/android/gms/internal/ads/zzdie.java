package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzee;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdie extends zzea {
    private final Object zza = new Object();
    @Nullable
    private final zzeb zzb;
    @Nullable
    private final zzbpt zzc;

    public zzdie(@Nullable zzeb zzeb, @Nullable zzbpt zzbpt) {
        this.zzb = zzeb;
        this.zzc = zzbpt;
    }

    public final float zze() throws RemoteException {
        throw new RemoteException();
    }

    public final float zzf() throws RemoteException {
        zzbpt zzbpt = this.zzc;
        if (zzbpt != null) {
            return zzbpt.zzg();
        }
        return 0.0f;
    }

    public final float zzg() throws RemoteException {
        zzbpt zzbpt = this.zzc;
        if (zzbpt != null) {
            return zzbpt.zzh();
        }
        return 0.0f;
    }

    public final int zzh() throws RemoteException {
        throw new RemoteException();
    }

    @Nullable
    public final zzee zzi() throws RemoteException {
        synchronized (this.zza) {
            zzeb zzeb = this.zzb;
            if (zzeb == null) {
                return null;
            }
            zzee zzi = zzeb.zzi();
            return zzi;
        }
    }

    public final void zzj(boolean z) throws RemoteException {
        throw new RemoteException();
    }

    public final void zzk() throws RemoteException {
        throw new RemoteException();
    }

    public final void zzl() throws RemoteException {
        throw new RemoteException();
    }

    public final void zzm(@Nullable zzee zzee) throws RemoteException {
        synchronized (this.zza) {
            zzeb zzeb = this.zzb;
            if (zzeb != null) {
                zzeb.zzm(zzee);
            }
        }
    }

    public final void zzn() throws RemoteException {
        throw new RemoteException();
    }

    public final boolean zzo() throws RemoteException {
        throw new RemoteException();
    }

    public final boolean zzp() throws RemoteException {
        throw new RemoteException();
    }

    public final boolean zzq() throws RemoteException {
        throw new RemoteException();
    }
}
