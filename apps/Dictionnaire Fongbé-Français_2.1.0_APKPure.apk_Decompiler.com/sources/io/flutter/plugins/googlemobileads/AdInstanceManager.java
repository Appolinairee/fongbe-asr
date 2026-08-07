package io.flutter.plugins.googlemobileads;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.googlemobileads.FlutterAd;
import io.flutter.plugins.googlemobileads.FlutterRewardedAd;
import java.util.HashMap;
import java.util.Map;

class AdInstanceManager {
    private Activity activity;
    private final Map<Integer, FlutterAd> ads = new HashMap();
    /* access modifiers changed from: private */
    public final MethodChannel channel;

    AdInstanceManager(MethodChannel methodChannel) {
        this.channel = methodChannel;
    }

    /* access modifiers changed from: package-private */
    public void setActivity(Activity activity2) {
        this.activity = activity2;
    }

    /* access modifiers changed from: package-private */
    public Activity getActivity() {
        return this.activity;
    }

    /* access modifiers changed from: package-private */
    public FlutterAd adForId(int i) {
        return this.ads.get(Integer.valueOf(i));
    }

    /* access modifiers changed from: package-private */
    public Integer adIdFor(FlutterAd flutterAd) {
        for (Integer next : this.ads.keySet()) {
            if (this.ads.get(next) == flutterAd) {
                return next;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void trackAd(FlutterAd flutterAd, int i) {
        if (this.ads.get(Integer.valueOf(i)) == null) {
            this.ads.put(Integer.valueOf(i), flutterAd);
        } else {
            throw new IllegalArgumentException(String.format("Ad for following adId already exists: %d", new Object[]{Integer.valueOf(i)}));
        }
    }

    /* access modifiers changed from: package-private */
    public void disposeAd(int i) {
        if (this.ads.containsKey(Integer.valueOf(i))) {
            FlutterAd flutterAd = this.ads.get(Integer.valueOf(i));
            if (flutterAd != null) {
                flutterAd.dispose();
            }
            this.ads.remove(Integer.valueOf(i));
        }
    }

    /* access modifiers changed from: package-private */
    public void disposeAllAds() {
        for (Map.Entry next : this.ads.entrySet()) {
            if (next.getValue() != null) {
                ((FlutterAd) next.getValue()).dispose();
            }
        }
        this.ads.clear();
    }

    /* access modifiers changed from: package-private */
    public void onAdLoaded(int i, ResponseInfo responseInfo) {
        FlutterAd.FlutterResponseInfo flutterResponseInfo;
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onAdLoaded");
        if (responseInfo == null) {
            flutterResponseInfo = null;
        } else {
            flutterResponseInfo = new FlutterAd.FlutterResponseInfo(responseInfo);
        }
        hashMap.put("responseInfo", flutterResponseInfo);
        invokeOnAdEvent(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void onAdFailedToLoad(int i, FlutterAd.FlutterLoadAdError flutterLoadAdError) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onAdFailedToLoad");
        hashMap.put("loadAdError", flutterLoadAdError);
        invokeOnAdEvent(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void onAppEvent(int i, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onAppEvent");
        hashMap.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
        hashMap.put("data", str2);
        invokeOnAdEvent(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void onAdImpression(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onAdImpression");
        invokeOnAdEvent(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void onAdClicked(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onAdClicked");
        invokeOnAdEvent(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void onAdOpened(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onAdOpened");
        invokeOnAdEvent(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void onAdClosed(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onAdClosed");
        invokeOnAdEvent(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void onRewardedAdUserEarnedReward(int i, FlutterRewardedAd.FlutterRewardItem flutterRewardItem) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onRewardedAdUserEarnedReward");
        hashMap.put("rewardItem", flutterRewardItem);
        invokeOnAdEvent(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void onRewardedInterstitialAdUserEarnedReward(int i, FlutterRewardedAd.FlutterRewardItem flutterRewardItem) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onRewardedInterstitialAdUserEarnedReward");
        hashMap.put("rewardItem", flutterRewardItem);
        invokeOnAdEvent(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void onPaidEvent(FlutterAd flutterAd, FlutterAdValue flutterAdValue) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", adIdFor(flutterAd));
        hashMap.put("eventName", "onPaidEvent");
        hashMap.put("valueMicros", Long.valueOf(flutterAdValue.valueMicros));
        hashMap.put("precision", Integer.valueOf(flutterAdValue.precisionType));
        hashMap.put("currencyCode", flutterAdValue.currencyCode);
        invokeOnAdEvent(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void onFailedToShowFullScreenContent(int i, AdError adError) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onFailedToShowFullScreenContent");
        hashMap.put("error", new FlutterAd.FlutterAdError(adError));
        invokeOnAdEvent(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void onAdShowedFullScreenContent(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onAdShowedFullScreenContent");
        invokeOnAdEvent(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void onAdDismissedFullScreenContent(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onAdDismissedFullScreenContent");
        invokeOnAdEvent(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void onAdMetadataChanged(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onAdMetadataChanged");
        invokeOnAdEvent(hashMap);
    }

    /* access modifiers changed from: package-private */
    public void onFluidAdHeightChanged(int i, int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i));
        hashMap.put("eventName", "onFluidAdHeightChanged");
        hashMap.put("height", Integer.valueOf(i2));
        invokeOnAdEvent(hashMap);
    }

    /* access modifiers changed from: package-private */
    public boolean showAdWithId(int i) {
        FlutterAd.FlutterOverlayAd flutterOverlayAd = (FlutterAd.FlutterOverlayAd) adForId(i);
        if (flutterOverlayAd == null) {
            return false;
        }
        flutterOverlayAd.show();
        return true;
    }

    private void invokeOnAdEvent(final Map<Object, Object> map) {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public void run() {
                AdInstanceManager.this.channel.invokeMethod("onAdEvent", map);
            }
        });
    }
}
