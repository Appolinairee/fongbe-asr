package io.flutter.plugins.googlemobileads;

import android.util.Log;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAdLoadCallback;
import com.google.android.gms.ads.admanager.AppEventListener;
import io.flutter.plugins.googlemobileads.FlutterAd;
import java.lang.ref.WeakReference;

class FlutterAdManagerInterstitialAd extends FlutterAd.FlutterOverlayAd {
    private static final String TAG = "FltGAMInterstitialAd";
    private AdManagerInterstitialAd ad;
    private final String adUnitId;
    private final FlutterAdLoader flutterAdLoader;
    private final AdInstanceManager manager;
    private final FlutterAdManagerAdRequest request;

    public FlutterAdManagerInterstitialAd(int i, AdInstanceManager adInstanceManager, String str, FlutterAdManagerAdRequest flutterAdManagerAdRequest, FlutterAdLoader flutterAdLoader2) {
        super(i);
        this.manager = adInstanceManager;
        this.adUnitId = str;
        this.request = flutterAdManagerAdRequest;
        this.flutterAdLoader = flutterAdLoader2;
    }

    /* access modifiers changed from: package-private */
    public void load() {
        FlutterAdLoader flutterAdLoader2 = this.flutterAdLoader;
        String str = this.adUnitId;
        flutterAdLoader2.loadAdManagerInterstitial(str, this.request.asAdManagerAdRequest(str), new DelegatingAdManagerInterstitialAdCallbacks(this));
    }

    /* access modifiers changed from: package-private */
    public void onAdLoaded(AdManagerInterstitialAd adManagerInterstitialAd) {
        this.ad = adManagerInterstitialAd;
        adManagerInterstitialAd.setAppEventListener(new DelegatingAdManagerInterstitialAdCallbacks(this));
        adManagerInterstitialAd.setOnPaidEventListener(new FlutterPaidEventListener(this.manager, this));
        this.manager.onAdLoaded(this.adId, adManagerInterstitialAd.getResponseInfo());
    }

    /* access modifiers changed from: package-private */
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        this.manager.onAdFailedToLoad(this.adId, new FlutterAd.FlutterLoadAdError(loadAdError));
    }

    /* access modifiers changed from: package-private */
    public void onAppEvent(String str, String str2) {
        this.manager.onAppEvent(this.adId, str, str2);
    }

    public void show() {
        if (this.ad == null) {
            Log.e(TAG, "The interstitial wasn't loaded yet.");
        } else if (this.manager.getActivity() == null) {
            Log.e(TAG, "Tried to show interstitial before activity was bound to the plugin.");
        } else {
            this.ad.setFullScreenContentCallback(new FlutterFullScreenContentCallback(this.manager, this.adId));
            this.ad.show(this.manager.getActivity());
        }
    }

    public void setImmersiveMode(boolean z) {
        AdManagerInterstitialAd adManagerInterstitialAd = this.ad;
        if (adManagerInterstitialAd == null) {
            Log.e(TAG, "The interstitial wasn't loaded yet.");
        } else {
            adManagerInterstitialAd.setImmersiveMode(z);
        }
    }

    /* access modifiers changed from: package-private */
    public void dispose() {
        this.ad = null;
    }

    private static final class DelegatingAdManagerInterstitialAdCallbacks extends AdManagerInterstitialAdLoadCallback implements AppEventListener {
        private final WeakReference<FlutterAdManagerInterstitialAd> delegate;

        DelegatingAdManagerInterstitialAdCallbacks(FlutterAdManagerInterstitialAd flutterAdManagerInterstitialAd) {
            this.delegate = new WeakReference<>(flutterAdManagerInterstitialAd);
        }

        public void onAdLoaded(AdManagerInterstitialAd adManagerInterstitialAd) {
            if (this.delegate.get() != null) {
                ((FlutterAdManagerInterstitialAd) this.delegate.get()).onAdLoaded(adManagerInterstitialAd);
            }
        }

        public void onAdFailedToLoad(LoadAdError loadAdError) {
            if (this.delegate.get() != null) {
                ((FlutterAdManagerInterstitialAd) this.delegate.get()).onAdFailedToLoad(loadAdError);
            }
        }

        public void onAppEvent(String str, String str2) {
            if (this.delegate.get() != null) {
                ((FlutterAdManagerInterstitialAd) this.delegate.get()).onAppEvent(str, str2);
            }
        }
    }
}
