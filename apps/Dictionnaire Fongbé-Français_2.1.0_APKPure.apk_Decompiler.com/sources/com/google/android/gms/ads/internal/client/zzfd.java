package com.google.android.gms.ads.internal.client;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbft;
import com.google.android.gms.internal.ads.zzbgq;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzfd implements MediaContent {
    private final zzbft zza;
    private final VideoController zzb = new VideoController();
    private final zzbgq zzc;

    public zzfd(zzbft zzbft, zzbgq zzbgq) {
        this.zza = zzbft;
        this.zzc = zzbgq;
    }

    public final float getAspectRatio() {
        try {
            return this.zza.zze();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return 0.0f;
        }
    }

    public final float getCurrentTime() {
        try {
            return this.zza.zzf();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return 0.0f;
        }
    }

    public final float getDuration() {
        try {
            return this.zza.zzg();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return 0.0f;
        }
    }

    public final Drawable getMainImage() {
        try {
            IObjectWrapper zzi = this.zza.zzi();
            if (zzi != null) {
                return (Drawable) ObjectWrapper.unwrap(zzi);
            }
            return null;
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return null;
        }
    }

    public final VideoController getVideoController() {
        try {
            if (this.zza.zzh() != null) {
                this.zzb.zzb(this.zza.zzh());
            }
        } catch (RemoteException e) {
            zzo.zzh("Exception occurred while getting video controller", e);
        }
        return this.zzb;
    }

    public final boolean hasVideoContent() {
        try {
            return this.zza.zzl();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return false;
        }
    }

    public final void setMainImage(Drawable drawable) {
        try {
            this.zza.zzj(ObjectWrapper.wrap(drawable));
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }

    public final zzbgq zza() {
        return this.zzc;
    }

    public final boolean zzb() {
        try {
            return this.zza.zzk();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return false;
        }
    }

    public final zzbft zzc() {
        return this.zza;
    }
}
