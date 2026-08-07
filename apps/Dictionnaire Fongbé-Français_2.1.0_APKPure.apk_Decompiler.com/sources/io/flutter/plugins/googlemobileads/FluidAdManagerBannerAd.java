package io.flutter.plugins.googlemobileads;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.google.android.gms.ads.AdSize;
import io.flutter.plugin.platform.PlatformView;
import java.util.Collections;

final class FluidAdManagerBannerAd extends FlutterAdManagerBannerAd {
    private static final String TAG = "FluidAdManagerBannerAd";
    private ViewGroup containerView;
    /* access modifiers changed from: private */
    public int height = -1;

    FluidAdManagerBannerAd(int i, AdInstanceManager adInstanceManager, String str, FlutterAdManagerAdRequest flutterAdManagerAdRequest, BannerAdCreator bannerAdCreator) {
        super(i, adInstanceManager, str, Collections.singletonList(new FlutterAdSize(AdSize.FLUID)), flutterAdManagerAdRequest, bannerAdCreator);
    }

    public void onAdLoaded() {
        if (this.adView != null) {
            this.adView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    int measuredHeight = view.getMeasuredHeight();
                    if (measuredHeight != FluidAdManagerBannerAd.this.height) {
                        FluidAdManagerBannerAd.this.manager.onFluidAdHeightChanged(FluidAdManagerBannerAd.this.adId, measuredHeight);
                    }
                    int unused = FluidAdManagerBannerAd.this.height = measuredHeight;
                }
            });
            this.manager.onAdLoaded(this.adId, this.adView.getResponseInfo());
        }
    }

    /* access modifiers changed from: package-private */
    public PlatformView getPlatformView() {
        if (this.adView == null) {
            return null;
        }
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            return new FlutterPlatformView(viewGroup);
        }
        ScrollView createContainerView = createContainerView();
        if (createContainerView == null) {
            return null;
        }
        createContainerView.setClipChildren(false);
        createContainerView.setVerticalScrollBarEnabled(false);
        createContainerView.setHorizontalScrollBarEnabled(false);
        this.containerView = createContainerView;
        createContainerView.addView(this.adView);
        return new FlutterPlatformView(this.adView);
    }

    /* access modifiers changed from: package-private */
    public ScrollView createContainerView() {
        if (this.manager.getActivity() != null) {
            return new ScrollView(this.manager.getActivity());
        }
        Log.e(TAG, "Tried to create container view before plugin is attached to an activity.");
        return null;
    }

    /* access modifiers changed from: package-private */
    public void dispose() {
        if (this.adView != null) {
            this.adView.destroy();
            this.adView = null;
        }
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.containerView = null;
        }
    }
}
