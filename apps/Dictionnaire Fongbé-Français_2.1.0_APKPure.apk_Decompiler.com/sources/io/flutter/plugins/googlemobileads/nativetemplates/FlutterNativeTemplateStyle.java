package io.flutter.plugins.googlemobileads.nativetemplates;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.ads.nativetemplates.NativeTemplateStyle;
import com.google.android.ads.nativetemplates.TemplateView;
import java.util.Objects;

public final class FlutterNativeTemplateStyle {
    final FlutterNativeTemplateTextStyle callToActionStyle;
    final ColorDrawable mainBackgroundColor;
    final FlutterNativeTemplateTextStyle primaryTextStyle;
    final FlutterNativeTemplateTextStyle secondaryTextStyle;
    final FlutterNativeTemplateType templateType;
    final FlutterNativeTemplateTextStyle tertiaryTextStyle;

    public FlutterNativeTemplateStyle(FlutterNativeTemplateType flutterNativeTemplateType, ColorDrawable colorDrawable, FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle, FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle2, FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle3, FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle4) {
        this.templateType = flutterNativeTemplateType;
        this.mainBackgroundColor = colorDrawable;
        this.callToActionStyle = flutterNativeTemplateTextStyle;
        this.primaryTextStyle = flutterNativeTemplateTextStyle2;
        this.secondaryTextStyle = flutterNativeTemplateTextStyle3;
        this.tertiaryTextStyle = flutterNativeTemplateTextStyle4;
    }

    public NativeTemplateStyle asNativeTemplateStyle() {
        NativeTemplateStyle.Builder builder = new NativeTemplateStyle.Builder();
        ColorDrawable colorDrawable = this.mainBackgroundColor;
        if (colorDrawable != null) {
            builder.withMainBackgroundColor(colorDrawable);
        }
        FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle = this.callToActionStyle;
        if (flutterNativeTemplateTextStyle != null) {
            if (flutterNativeTemplateTextStyle.getBackgroundColor() != null) {
                builder.withCallToActionBackgroundColor(this.callToActionStyle.getBackgroundColor());
            }
            if (this.callToActionStyle.getTextColor() != null) {
                builder.withCallToActionTypefaceColor(this.callToActionStyle.getTextColor().getColor());
            }
            if (this.callToActionStyle.getFontStyle() != null) {
                builder.withCallToActionTextTypeface(this.callToActionStyle.getFontStyle().getTypeface());
            }
            if (this.callToActionStyle.getSize() != null) {
                builder.withCallToActionTextSize(this.callToActionStyle.getSize().floatValue());
            }
        }
        FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle2 = this.primaryTextStyle;
        if (flutterNativeTemplateTextStyle2 != null) {
            if (flutterNativeTemplateTextStyle2.getBackgroundColor() != null) {
                builder.withPrimaryTextBackgroundColor(this.primaryTextStyle.getBackgroundColor());
            }
            if (this.primaryTextStyle.getTextColor() != null) {
                builder.withPrimaryTextTypefaceColor(this.primaryTextStyle.getTextColor().getColor());
            }
            if (this.primaryTextStyle.getFontStyle() != null) {
                builder.withPrimaryTextTypeface(this.primaryTextStyle.getFontStyle().getTypeface());
            }
            if (this.primaryTextStyle.getSize() != null) {
                builder.withPrimaryTextSize(this.primaryTextStyle.getSize().floatValue());
            }
        }
        FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle3 = this.secondaryTextStyle;
        if (flutterNativeTemplateTextStyle3 != null) {
            if (flutterNativeTemplateTextStyle3.getBackgroundColor() != null) {
                builder.withSecondaryTextBackgroundColor(this.secondaryTextStyle.getBackgroundColor());
            }
            if (this.secondaryTextStyle.getTextColor() != null) {
                builder.withSecondaryTextTypefaceColor(this.secondaryTextStyle.getTextColor().getColor());
            }
            if (this.secondaryTextStyle.getFontStyle() != null) {
                builder.withSecondaryTextTypeface(this.secondaryTextStyle.getFontStyle().getTypeface());
            }
            if (this.secondaryTextStyle.getSize() != null) {
                builder.withSecondaryTextSize(this.secondaryTextStyle.getSize().floatValue());
            }
        }
        FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle4 = this.tertiaryTextStyle;
        if (flutterNativeTemplateTextStyle4 != null) {
            if (flutterNativeTemplateTextStyle4.getBackgroundColor() != null) {
                builder.withTertiaryTextBackgroundColor(this.tertiaryTextStyle.getBackgroundColor());
            }
            if (this.tertiaryTextStyle.getTextColor() != null) {
                builder.withTertiaryTextTypefaceColor(this.tertiaryTextStyle.getTextColor().getColor());
            }
            if (this.tertiaryTextStyle.getFontStyle() != null) {
                builder.withTertiaryTextTypeface(this.tertiaryTextStyle.getFontStyle().getTypeface());
            }
            if (this.tertiaryTextStyle.getSize() != null) {
                builder.withTertiaryTextSize(this.tertiaryTextStyle.getSize().floatValue());
            }
        }
        return builder.build();
    }

    public TemplateView asTemplateView(Context context) {
        TemplateView templateView = (TemplateView) ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(this.templateType.resourceId(), (ViewGroup) null);
        templateView.setStyles(asNativeTemplateStyle());
        return templateView;
    }

    public FlutterNativeTemplateType getTemplateType() {
        return this.templateType;
    }

    public ColorDrawable getMainBackgroundColor() {
        return this.mainBackgroundColor;
    }

    public FlutterNativeTemplateTextStyle getCallToActionStyle() {
        return this.callToActionStyle;
    }

    public FlutterNativeTemplateTextStyle getPrimaryTextStyle() {
        return this.primaryTextStyle;
    }

    public FlutterNativeTemplateTextStyle getSecondaryTextStyle() {
        return this.secondaryTextStyle;
    }

    public FlutterNativeTemplateTextStyle getTertiaryTextStyle() {
        return this.tertiaryTextStyle;
    }

    public boolean equals(Object obj) {
        ColorDrawable colorDrawable;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlutterNativeTemplateStyle)) {
            return false;
        }
        FlutterNativeTemplateStyle flutterNativeTemplateStyle = (FlutterNativeTemplateStyle) obj;
        if (this.templateType != flutterNativeTemplateStyle.templateType || ((((colorDrawable = this.mainBackgroundColor) != null || flutterNativeTemplateStyle.mainBackgroundColor != null) && colorDrawable.getColor() != flutterNativeTemplateStyle.mainBackgroundColor.getColor()) || !Objects.equals(this.callToActionStyle, flutterNativeTemplateStyle.callToActionStyle) || !Objects.equals(this.primaryTextStyle, flutterNativeTemplateStyle.primaryTextStyle) || !Objects.equals(this.secondaryTextStyle, flutterNativeTemplateStyle.secondaryTextStyle) || !Objects.equals(this.tertiaryTextStyle, flutterNativeTemplateStyle.tertiaryTextStyle))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        ColorDrawable colorDrawable = this.mainBackgroundColor;
        return Objects.hash(new Object[]{colorDrawable == null ? null : Integer.valueOf(colorDrawable.getColor()), this.callToActionStyle, this.primaryTextStyle, this.secondaryTextStyle, this.tertiaryTextStyle});
    }
}
