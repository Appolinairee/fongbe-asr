package com.google.android.gms.ads.query;

import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzbub;
import java.util.List;
import java.util.Map;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class ReportingInfo {
    private final zzbub zza;

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    public static final class Builder {
        /* access modifiers changed from: private */
        public final zzbua zza;

        @Deprecated
        public Builder(View view) {
            zzbua zzbua = new zzbua();
            this.zza = zzbua;
            zzbua.zzb(view);
        }

        @Deprecated
        public ReportingInfo build() {
            return new ReportingInfo(this, (zzb) null);
        }

        @Deprecated
        public Builder setAssetViews(Map<String, View> map) {
            this.zza.zzc(map);
            return this;
        }
    }

    /* synthetic */ ReportingInfo(Builder builder, zzb zzb) {
        this.zza = new zzbub(builder.zza);
    }

    @Deprecated
    public void recordClick(List<Uri> list) {
        this.zza.zza(list);
    }

    @Deprecated
    public void recordImpression(List<Uri> list) {
        this.zza.zzb(list);
    }

    @Deprecated
    public void reportTouchEvent(MotionEvent motionEvent) {
        this.zza.zzc(motionEvent);
    }

    @Deprecated
    public void updateClickUrl(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        this.zza.zzd(uri, updateClickUrlCallback);
    }

    @Deprecated
    public void updateImpressionUrls(List<Uri> list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.zza.zze(list, updateImpressionUrlsCallback);
    }
}
