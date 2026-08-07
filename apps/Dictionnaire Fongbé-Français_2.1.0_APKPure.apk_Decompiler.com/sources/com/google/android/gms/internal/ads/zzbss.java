package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.client.zzfd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzbss implements NativeCustomFormatAd {
    private final zzbgq zza;
    private NativeCustomFormatAd.DisplayOpenMeasurement zzb;

    public zzbss(zzbgq zzbgq) {
        this.zza = zzbgq;
    }

    public final void destroy() {
        try {
            this.zza.zzl();
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }

    public final List<String> getAvailableAssetNames() {
        try {
            return this.zza.zzk();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return null;
        }
    }

    public final String getCustomFormatId() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return null;
        }
    }

    public final NativeCustomFormatAd.DisplayOpenMeasurement getDisplayOpenMeasurement() {
        try {
            if (this.zzb == null && this.zza.zzq()) {
                this.zzb = new zzbsl(this.zza);
            }
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
        return this.zzb;
    }

    public final NativeAd.Image getImage(String str) {
        try {
            zzbfw zzg = this.zza.zzg(str);
            if (zzg != null) {
                return new zzbsm(zzg);
            }
            return null;
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return null;
        }
    }

    public final MediaContent getMediaContent() {
        try {
            if (this.zza.zzf() != null) {
                return new zzfd(this.zza.zzf(), this.zza);
            }
            return null;
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return null;
        }
    }

    public final CharSequence getText(String str) {
        try {
            return this.zza.zzj(str);
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return null;
        }
    }

    public final void performClick(String str) {
        try {
            this.zza.zzn(str);
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }

    public final void recordImpression() {
        try {
            this.zza.zzo();
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }
}
