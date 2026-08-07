package com.google.android.ads.nativetemplates;

import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;

public final class NativeTemplateStyle {
    /* access modifiers changed from: private */
    public ColorDrawable callToActionBackgroundColor;
    /* access modifiers changed from: private */
    public float callToActionTextSize;
    /* access modifiers changed from: private */
    public Typeface callToActionTextTypeface;
    /* access modifiers changed from: private */
    public Integer callToActionTypefaceColor;
    /* access modifiers changed from: private */
    public ColorDrawable mainBackgroundColor;
    /* access modifiers changed from: private */
    public ColorDrawable primaryTextBackgroundColor;
    /* access modifiers changed from: private */
    public float primaryTextSize;
    /* access modifiers changed from: private */
    public Typeface primaryTextTypeface;
    /* access modifiers changed from: private */
    public Integer primaryTextTypefaceColor;
    /* access modifiers changed from: private */
    public ColorDrawable secondaryTextBackgroundColor;
    /* access modifiers changed from: private */
    public float secondaryTextSize;
    /* access modifiers changed from: private */
    public Typeface secondaryTextTypeface;
    /* access modifiers changed from: private */
    public Integer secondaryTextTypefaceColor;
    /* access modifiers changed from: private */
    public ColorDrawable tertiaryTextBackgroundColor;
    /* access modifiers changed from: private */
    public float tertiaryTextSize;
    /* access modifiers changed from: private */
    public Typeface tertiaryTextTypeface;
    /* access modifiers changed from: private */
    public Integer tertiaryTextTypefaceColor;

    public Typeface getCallToActionTextTypeface() {
        return this.callToActionTextTypeface;
    }

    public float getCallToActionTextSize() {
        return this.callToActionTextSize;
    }

    public Integer getCallToActionTypefaceColor() {
        return this.callToActionTypefaceColor;
    }

    public ColorDrawable getCallToActionBackgroundColor() {
        return this.callToActionBackgroundColor;
    }

    public Typeface getPrimaryTextTypeface() {
        return this.primaryTextTypeface;
    }

    public float getPrimaryTextSize() {
        return this.primaryTextSize;
    }

    public Integer getPrimaryTextTypefaceColor() {
        return this.primaryTextTypefaceColor;
    }

    public ColorDrawable getPrimaryTextBackgroundColor() {
        return this.primaryTextBackgroundColor;
    }

    public Typeface getSecondaryTextTypeface() {
        return this.secondaryTextTypeface;
    }

    public float getSecondaryTextSize() {
        return this.secondaryTextSize;
    }

    public Integer getSecondaryTextTypefaceColor() {
        return this.secondaryTextTypefaceColor;
    }

    public ColorDrawable getSecondaryTextBackgroundColor() {
        return this.secondaryTextBackgroundColor;
    }

    public Typeface getTertiaryTextTypeface() {
        return this.tertiaryTextTypeface;
    }

    public float getTertiaryTextSize() {
        return this.tertiaryTextSize;
    }

    public Integer getTertiaryTextTypefaceColor() {
        return this.tertiaryTextTypefaceColor;
    }

    public ColorDrawable getTertiaryTextBackgroundColor() {
        return this.tertiaryTextBackgroundColor;
    }

    public ColorDrawable getMainBackgroundColor() {
        return this.mainBackgroundColor;
    }

    public static final class Builder {
        private NativeTemplateStyle styles = new NativeTemplateStyle();

        public Builder withCallToActionTextTypeface(Typeface typeface) {
            Typeface unused = this.styles.callToActionTextTypeface = typeface;
            return this;
        }

        public Builder withCallToActionTextSize(float f) {
            float unused = this.styles.callToActionTextSize = f;
            return this;
        }

        public Builder withCallToActionTypefaceColor(int i) {
            Integer unused = this.styles.callToActionTypefaceColor = Integer.valueOf(i);
            return this;
        }

        public Builder withCallToActionBackgroundColor(ColorDrawable colorDrawable) {
            ColorDrawable unused = this.styles.callToActionBackgroundColor = colorDrawable;
            return this;
        }

        public Builder withPrimaryTextTypeface(Typeface typeface) {
            Typeface unused = this.styles.primaryTextTypeface = typeface;
            return this;
        }

        public Builder withPrimaryTextSize(float f) {
            float unused = this.styles.primaryTextSize = f;
            return this;
        }

        public Builder withPrimaryTextTypefaceColor(int i) {
            Integer unused = this.styles.primaryTextTypefaceColor = Integer.valueOf(i);
            return this;
        }

        public Builder withPrimaryTextBackgroundColor(ColorDrawable colorDrawable) {
            ColorDrawable unused = this.styles.primaryTextBackgroundColor = colorDrawable;
            return this;
        }

        public Builder withSecondaryTextTypeface(Typeface typeface) {
            Typeface unused = this.styles.secondaryTextTypeface = typeface;
            return this;
        }

        public Builder withSecondaryTextSize(float f) {
            float unused = this.styles.secondaryTextSize = f;
            return this;
        }

        public Builder withSecondaryTextTypefaceColor(int i) {
            Integer unused = this.styles.secondaryTextTypefaceColor = Integer.valueOf(i);
            return this;
        }

        public Builder withSecondaryTextBackgroundColor(ColorDrawable colorDrawable) {
            ColorDrawable unused = this.styles.secondaryTextBackgroundColor = colorDrawable;
            return this;
        }

        public Builder withTertiaryTextTypeface(Typeface typeface) {
            Typeface unused = this.styles.tertiaryTextTypeface = typeface;
            return this;
        }

        public Builder withTertiaryTextSize(float f) {
            float unused = this.styles.tertiaryTextSize = f;
            return this;
        }

        public Builder withTertiaryTextTypefaceColor(int i) {
            Integer unused = this.styles.tertiaryTextTypefaceColor = Integer.valueOf(i);
            return this;
        }

        public Builder withTertiaryTextBackgroundColor(ColorDrawable colorDrawable) {
            ColorDrawable unused = this.styles.tertiaryTextBackgroundColor = colorDrawable;
            return this;
        }

        public Builder withMainBackgroundColor(ColorDrawable colorDrawable) {
            ColorDrawable unused = this.styles.mainBackgroundColor = colorDrawable;
            return this;
        }

        public NativeTemplateStyle build() {
            return this.styles;
        }
    }
}
