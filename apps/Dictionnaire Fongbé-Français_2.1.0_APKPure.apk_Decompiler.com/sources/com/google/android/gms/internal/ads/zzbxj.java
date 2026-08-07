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
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzbxj extends RewardedInterstitialAd {
    private final String zza;
    private final zzbwp zzb;
    private final Context zzc;
    private final zzbxh zzd;
    private FullScreenContentCallback zze;
    private OnAdMetadataChangedListener zzf;
    private OnPaidEventListener zzg;
    private final long zzh = System.currentTimeMillis();

    public zzbxj(Context context, String str) {
        this.zza = str;
        this.zzc = context.getApplicationContext();
        this.zzb = zzbc.zza().zzs(context, str, new zzbpa());
        this.zzd = new zzbxh();
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
        return this.zze;
    }

    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.zzf;
    }

    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zzg;
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
            if (zzd2 != null) {
                return new zzbwz(zzd2);
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
        return RewardItem.DEFAULT_REWARD;
    }

    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.zze = fullScreenContentCallback;
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
        this.zzf = onAdMetadataChangedListener;
        try {
            zzbwp zzbwp = this.zzb;
            if (zzbwp != null) {
                zzbwp.zzi(new zzfr(onAdMetadataChangedListener));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.zzg = onPaidEventListener;
        try {
            zzbwp zzbwp = this.zzb;
            if (zzbwp != null) {
                zzbwp.zzj(new zzfs(onPaidEventListener));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        try {
            zzbwp zzbwp = this.zzb;
            if (zzbwp != null) {
                zzbwp.zzl(new zzbxd(serverSideVerificationOptions));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.zzd.zzc(onUserEarnedRewardListener);
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

    public final void zza(zzei zzei, RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        try {
            if (this.zzb != null) {
                zzei.zzq(this.zzh);
                this.zzb.zzg(zzr.zza.zza(this.zzc, zzei), new zzbxi(rewardedInterstitialAdLoadCallback, this));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }
}
