package io.flutter.plugins.googlemobileads;

import android.util.Log;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import io.flutter.plugins.googlemobileads.FlutterAd;
import java.lang.ref.WeakReference;

class FlutterRewardedAd extends FlutterAd.FlutterOverlayAd {
    private static final String TAG = "FlutterRewardedAd";
    private final FlutterAdManagerAdRequest adManagerRequest;
    private final String adUnitId;
    private final FlutterAdLoader flutterAdLoader;
    private final AdInstanceManager manager;
    private final FlutterAdRequest request;
    RewardedAd rewardedAd;

    static class FlutterRewardItem {
        final Integer amount;
        final String type;

        FlutterRewardItem(Integer num, String str) {
            this.amount = num;
            this.type = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FlutterRewardItem)) {
                return false;
            }
            FlutterRewardItem flutterRewardItem = (FlutterRewardItem) obj;
            if (!this.amount.equals(flutterRewardItem.amount)) {
                return false;
            }
            return this.type.equals(flutterRewardItem.type);
        }

        public int hashCode() {
            return (this.amount.hashCode() * 31) + this.type.hashCode();
        }
    }

    public FlutterRewardedAd(int i, AdInstanceManager adInstanceManager, String str, FlutterAdRequest flutterAdRequest, FlutterAdLoader flutterAdLoader2) {
        super(i);
        this.manager = adInstanceManager;
        this.adUnitId = str;
        this.request = flutterAdRequest;
        this.adManagerRequest = null;
        this.flutterAdLoader = flutterAdLoader2;
    }

    public FlutterRewardedAd(int i, AdInstanceManager adInstanceManager, String str, FlutterAdManagerAdRequest flutterAdManagerAdRequest, FlutterAdLoader flutterAdLoader2) {
        super(i);
        this.manager = adInstanceManager;
        this.adUnitId = str;
        this.adManagerRequest = flutterAdManagerAdRequest;
        this.request = null;
        this.flutterAdLoader = flutterAdLoader2;
    }

    /* access modifiers changed from: package-private */
    public void load() {
        DelegatingRewardedCallback delegatingRewardedCallback = new DelegatingRewardedCallback(this);
        FlutterAdRequest flutterAdRequest = this.request;
        if (flutterAdRequest != null) {
            FlutterAdLoader flutterAdLoader2 = this.flutterAdLoader;
            String str = this.adUnitId;
            flutterAdLoader2.loadRewarded(str, flutterAdRequest.asAdRequest(str), delegatingRewardedCallback);
            return;
        }
        FlutterAdManagerAdRequest flutterAdManagerAdRequest = this.adManagerRequest;
        if (flutterAdManagerAdRequest != null) {
            FlutterAdLoader flutterAdLoader3 = this.flutterAdLoader;
            String str2 = this.adUnitId;
            flutterAdLoader3.loadAdManagerRewarded(str2, flutterAdManagerAdRequest.asAdManagerAdRequest(str2), delegatingRewardedCallback);
            return;
        }
        Log.e(TAG, "A null or invalid ad request was provided.");
    }

    /* access modifiers changed from: package-private */
    public void onAdLoaded(RewardedAd rewardedAd2) {
        this.rewardedAd = rewardedAd2;
        rewardedAd2.setOnPaidEventListener(new FlutterPaidEventListener(this.manager, this));
        this.manager.onAdLoaded(this.adId, rewardedAd2.getResponseInfo());
    }

    /* access modifiers changed from: package-private */
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        this.manager.onAdFailedToLoad(this.adId, new FlutterAd.FlutterLoadAdError(loadAdError));
    }

    public void show() {
        if (this.rewardedAd == null) {
            Log.e(TAG, "Error showing rewarded - the rewarded ad wasn't loaded yet.");
        } else if (this.manager.getActivity() == null) {
            Log.e(TAG, "Tried to show rewarded ad before activity was bound to the plugin.");
        } else {
            this.rewardedAd.setFullScreenContentCallback(new FlutterFullScreenContentCallback(this.manager, this.adId));
            this.rewardedAd.setOnAdMetadataChangedListener(new DelegatingRewardedCallback(this));
            this.rewardedAd.show(this.manager.getActivity(), new DelegatingRewardedCallback(this));
        }
    }

    public void setImmersiveMode(boolean z) {
        RewardedAd rewardedAd2 = this.rewardedAd;
        if (rewardedAd2 == null) {
            Log.e(TAG, "Error setting immersive mode in rewarded ad - the rewarded ad wasn't loaded yet.");
        } else {
            rewardedAd2.setImmersiveMode(z);
        }
    }

    /* access modifiers changed from: package-private */
    public void onAdMetadataChanged() {
        this.manager.onAdMetadataChanged(this.adId);
    }

    /* access modifiers changed from: package-private */
    public void onUserEarnedReward(RewardItem rewardItem) {
        this.manager.onRewardedAdUserEarnedReward(this.adId, new FlutterRewardItem(Integer.valueOf(rewardItem.getAmount()), rewardItem.getType()));
    }

    /* access modifiers changed from: package-private */
    public void dispose() {
        this.rewardedAd = null;
    }

    public void setServerSideVerificationOptions(FlutterServerSideVerificationOptions flutterServerSideVerificationOptions) {
        RewardedAd rewardedAd2 = this.rewardedAd;
        if (rewardedAd2 != null) {
            rewardedAd2.setServerSideVerificationOptions(flutterServerSideVerificationOptions.asServerSideVerificationOptions());
        } else {
            Log.e(TAG, "RewardedAd is null in setServerSideVerificationOptions");
        }
    }

    private static final class DelegatingRewardedCallback extends RewardedAdLoadCallback implements OnAdMetadataChangedListener, OnUserEarnedRewardListener {
        private final WeakReference<FlutterRewardedAd> delegate;

        DelegatingRewardedCallback(FlutterRewardedAd flutterRewardedAd) {
            this.delegate = new WeakReference<>(flutterRewardedAd);
        }

        public void onAdLoaded(RewardedAd rewardedAd) {
            if (this.delegate.get() != null) {
                ((FlutterRewardedAd) this.delegate.get()).onAdLoaded(rewardedAd);
            }
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            if (this.delegate.get() != null) {
                ((FlutterRewardedAd) this.delegate.get()).onAdFailedToLoad(loadAdError);
            }
        }

        public void onUserEarnedReward(RewardItem rewardItem) {
            if (this.delegate.get() != null) {
                ((FlutterRewardedAd) this.delegate.get()).onUserEarnedReward(rewardItem);
            }
        }

        public void onAdMetadataChanged() {
            if (this.delegate.get() != null) {
                ((FlutterRewardedAd) this.delegate.get()).onAdMetadataChanged();
            }
        }
    }
}
