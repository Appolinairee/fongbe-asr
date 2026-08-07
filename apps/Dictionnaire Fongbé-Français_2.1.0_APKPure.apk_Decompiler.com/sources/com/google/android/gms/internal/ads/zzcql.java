package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.zzv;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcql extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    private final Context zza;
    private View zzb;

    private zzcql(Context context) {
        super(context);
        this.zza = context;
    }

    public static zzcql zza(Context context, View view, zzfbo zzfbo) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcql zzcql = new zzcql(context);
        if (!(zzfbo.zzu.isEmpty() || (resources = zzcql.zza.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null)) {
            zzfbp zzfbp = (zzfbp) zzfbo.zzu.get(0);
            zzcql.setLayoutParams(new FrameLayout.LayoutParams((int) (((float) zzfbp.zza) * displayMetrics.density), (int) (((float) zzfbp.zzb) * displayMetrics.density)));
        }
        zzcql.zzb = view;
        zzcql.addView(view);
        zzv.zzy();
        zzcaj.zzb(zzcql, zzcql);
        zzv.zzy();
        zzcaj.zza(zzcql, zzcql);
        JSONObject jSONObject = zzfbo.zzah;
        RelativeLayout relativeLayout = new RelativeLayout(zzcql.zza);
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            zzcql.zzc(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            zzcql.zzc(optJSONObject2, relativeLayout, 12);
        }
        zzcql.addView(relativeLayout);
        return zzcql;
    }

    private final int zzb(double d) {
        zzbc.zzb();
        return zzf.zzx(this.zza, (int) d);
    }

    private final void zzc(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        TextView textView = new TextView(this.zza);
        textView.setTextColor(-1);
        textView.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int zzb2 = zzb(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, zzb2, 0, zzb2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzb(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY((float) (-iArr[1]));
    }

    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY((float) (-iArr[1]));
    }
}
