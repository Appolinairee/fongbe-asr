package io.flutter.plugins.googlemobileads;

import android.content.Context;
import com.google.android.gms.ads.AdSize;

class FlutterAdSize {
    final int height;
    final AdSize size;
    final int width;

    static class AdSizeFactory {
        AdSizeFactory() {
        }

        /* access modifiers changed from: package-private */
        public AdSize getPortraitAnchoredAdaptiveBannerAdSize(Context context, int i) {
            return AdSize.getPortraitAnchoredAdaptiveBannerAdSize(context, i);
        }

        /* access modifiers changed from: package-private */
        public AdSize getLandscapeAnchoredAdaptiveBannerAdSize(Context context, int i) {
            return AdSize.getLandscapeAnchoredAdaptiveBannerAdSize(context, i);
        }

        /* access modifiers changed from: package-private */
        public AdSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(Context context, int i) {
            return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(context, i);
        }

        /* access modifiers changed from: package-private */
        public AdSize getCurrentOrientationInlineAdaptiveBannerAdSize(Context context, int i) {
            return AdSize.getCurrentOrientationInlineAdaptiveBannerAdSize(context, i);
        }

        /* access modifiers changed from: package-private */
        public AdSize getLandscapeInlineAdaptiveBannerAdSize(Context context, int i) {
            return AdSize.getLandscapeInlineAdaptiveBannerAdSize(context, i);
        }

        /* access modifiers changed from: package-private */
        public AdSize getPortraitInlineAdaptiveBannerAdSize(Context context, int i) {
            return AdSize.getPortraitInlineAdaptiveBannerAdSize(context, i);
        }

        /* access modifiers changed from: package-private */
        public AdSize getInlineAdaptiveBannerAdSize(int i, int i2) {
            return AdSize.getInlineAdaptiveBannerAdSize(i, i2);
        }
    }

    static class AnchoredAdaptiveBannerAdSize extends FlutterAdSize {
        final String orientation;

        private static AdSize getAdSize(Context context, AdSizeFactory adSizeFactory, String str, int i) {
            if (str == null) {
                return adSizeFactory.getCurrentOrientationAnchoredAdaptiveBannerAdSize(context, i);
            }
            if (str.equals("portrait")) {
                return adSizeFactory.getPortraitAnchoredAdaptiveBannerAdSize(context, i);
            }
            if (str.equals("landscape")) {
                return adSizeFactory.getLandscapeAnchoredAdaptiveBannerAdSize(context, i);
            }
            throw new IllegalArgumentException("Unexpected value for orientation: " + str);
        }

        AnchoredAdaptiveBannerAdSize(Context context, AdSizeFactory adSizeFactory, String str, int i) {
            super(getAdSize(context, adSizeFactory, str, i));
            this.orientation = str;
        }
    }

    static class SmartBannerAdSize extends FlutterAdSize {
        SmartBannerAdSize() {
            super(AdSize.SMART_BANNER);
        }
    }

    static class FluidAdSize extends FlutterAdSize {
        FluidAdSize() {
            super(AdSize.FLUID);
        }
    }

    static class InlineAdaptiveBannerAdSize extends FlutterAdSize {
        final Integer maxHeight;
        final Integer orientation;

        private static AdSize getAdSize(AdSizeFactory adSizeFactory, Context context, int i, Integer num, Integer num2) {
            if (num != null) {
                if (num.intValue() == 0) {
                    return adSizeFactory.getPortraitInlineAdaptiveBannerAdSize(context, i);
                }
                return adSizeFactory.getLandscapeInlineAdaptiveBannerAdSize(context, i);
            } else if (num2 != null) {
                return adSizeFactory.getInlineAdaptiveBannerAdSize(i, num2.intValue());
            } else {
                return adSizeFactory.getCurrentOrientationInlineAdaptiveBannerAdSize(context, i);
            }
        }

        InlineAdaptiveBannerAdSize(AdSizeFactory adSizeFactory, Context context, int i, Integer num, Integer num2) {
            super(getAdSize(adSizeFactory, context, i, num, num2));
            this.orientation = num;
            this.maxHeight = num2;
        }
    }

    FlutterAdSize(int i, int i2) {
        this(new AdSize(i, i2));
    }

    FlutterAdSize(AdSize adSize) {
        this.size = adSize;
        this.width = adSize.getWidth();
        this.height = adSize.getHeight();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlutterAdSize)) {
            return false;
        }
        FlutterAdSize flutterAdSize = (FlutterAdSize) obj;
        if (this.width == flutterAdSize.width && this.height == flutterAdSize.height) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.width * 31) + this.height;
    }

    public AdSize getAdSize() {
        return this.size;
    }
}
