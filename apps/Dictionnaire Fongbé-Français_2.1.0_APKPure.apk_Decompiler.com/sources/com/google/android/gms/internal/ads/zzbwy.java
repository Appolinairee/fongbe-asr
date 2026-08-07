package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.client.zzei;
import com.google.android.gms.ads.internal.client.zzfr;
import com.google.android.gms.ads.internal.client.zzfs;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzbwy extends RewardedAd {
    private final String zza;
    private final zzbwp zzb;
    private final Context zzc;
    private final zzbxh zzd;
    private OnAdMetadataChangedListener zze;
    private OnPaidEventListener zzf;
    private FullScreenContentCallback zzg;
    private final long zzh;

    public zzbwy(Context context, String str) {
        this(context.getApplicationContext(), str, zzbc.zza().zzs(context, str, new zzbpa()), new zzbxh());
    }

    public final Bundle getAdMetadata() {
        try {
            zzbwp zzbwp = this.zzb;
            if (zzbwp != null) {
                return zzbwp.zzb();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
        return new Bundle();
    }

    public final String getAdUnitId() {
        return this.zza;
    }

    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zzg;
    }

    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.zze;
    }

    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zzf;
    }

    public final ResponseInfo getResponseInfo() {
        zzdy zzdy = null;
        try {
            zzbwp zzbwp = this.zzb;
            if (zzbwp != null) {
                zzdy = zzbwp.zzc();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zzb(zzdy);
    }

    public final RewardItem getRewardItem() {
        try {
            zzbwp zzbwp = this.zzb;
            zzbwm zzd2 = zzbwp != null ? zzbwp.zzd() : null;
            if (zzd2 == null) {
                return RewardItem.DEFAULT_REWARD;
            }
            return new zzbwz(zzd2);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            return RewardItem.DEFAULT_REWARD;
        }
    }

    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.zzg = fullScreenContentCallback;
        this.zzd.zzb(fullScreenContentCallback);
    }

    public final void setImmersiveMode(boolean z) {
        try {
            zzbwp zzbwp = this.zzb;
            if (zzbwp != null) {
                zzbwp.zzh(z);
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        try {
            this.zze = onAdMetadataChangedListener;
            zzbwp zzbwp = this.zzb;
            if (zzbwp != null) {
                zzbwp.zzi(new zzfr(onAdMetadataChangedListener));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.zzf = onPaidEventListener;
            zzbwp zzbwp = this.zzb;
            if (zzbwp != null) {
                zzbwp.zzj(new zzfs(onPaidEventListener));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        if (serverSideVerificationOptions != null) {
            try {
                zzbwp zzbwp = this.zzb;
                if (zzbwp != null) {
                    zzbwp.zzl(new zzbxd(serverSideVerificationOptions));
                }
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.zzd.zzc(onUserEarnedRewardListener);
        if (activity == null) {
            zzo.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            zzbwp zzbwp = this.zzb;
            if (zzbwp != null) {
                zzbwp.zzk(this.zzd);
                this.zzb.zzm(ObjectWrapper.wrap(activity));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final RewardedAd zza() {
        try {
            zzbwp zzg2 = zzb.zza(this.zzc).zzg(this.zza);
            if (zzg2 != null) {
                return new zzbwy(this.zzc, this.zza, zzg2, this.zzd);
            }
            zzo.zzl("Failed to obtain a Rewarded Ad from the preloader.", (Throwable) null);
            return null;
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final void zzb(zzei zzei, RewardedAdLoadCallback rewardedAdLoadCallback) {
        try {
            if (this.zzb != null) {
                zzei.zzq(this.zzh);
                this.zzb.zzf(zzr.zza.zza(this.zzc, zzei), new zzbxc(rewardedAdLoadCallback, this));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final boolean zzc() {
        try {
            return zzb.zza(this.zzc).zzl(this.zza);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    protected zzbwy(Context context, String str, zzbwp zzbwp, zzbxh zzbxh) {
        this.zzh = System.currentTimeMillis();
        this.zzc = context.getApplicationContext();
        this.zza = str;
        this.zzb = zzbwp;
        this.zzd = zzbxh;
    }
}
