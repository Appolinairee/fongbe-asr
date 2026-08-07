package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdhb implements zzdin {
    private long zzA = 0;
    private long zzB = 0;
    private zzdd zzC;
    private final zzdjh zzD;
    private final Context zza;
    private final zzdiq zzb;
    private final JSONObject zzc;
    private final zzdnl zzd;
    private final zzdif zze;
    private final zzava zzf;
    /* access modifiers changed from: private */
    public final zzcwl zzg;
    /* access modifiers changed from: private */
    public final zzcvr zzh;
    /* access modifiers changed from: private */
    public final zzddq zzi;
    private final zzfbo zzj;
    private final VersionInfoParcel zzk;
    private final zzfcj zzl;
    private final zzcnh zzm;
    private final zzdjl zzn;
    private final Clock zzo;
    private final zzddm zzp;
    private final zzfja zzq;
    private final zzdpb zzr;
    private final zzfhh zzs;
    private final zzebv zzt;
    private boolean zzu = false;
    private boolean zzv;
    private boolean zzw = false;
    private boolean zzx = false;
    private Point zzy = new Point();
    private Point zzz = new Point();

    public zzdhb(Context context, zzdiq zzdiq, JSONObject jSONObject, zzdnl zzdnl, zzdif zzdif, zzava zzava, zzcwl zzcwl, zzcvr zzcvr, zzddq zzddq, zzfbo zzfbo, VersionInfoParcel versionInfoParcel, zzfcj zzfcj, zzcnh zzcnh, zzdjl zzdjl, Clock clock, zzddm zzddm, zzfja zzfja, zzfhh zzfhh, zzebv zzebv, zzdpb zzdpb, zzdjh zzdjh) {
        this.zza = context;
        this.zzb = zzdiq;
        this.zzc = jSONObject;
        this.zzd = zzdnl;
        this.zze = zzdif;
        this.zzf = zzava;
        this.zzg = zzcwl;
        this.zzh = zzcvr;
        this.zzi = zzddq;
        this.zzj = zzfbo;
        this.zzk = versionInfoParcel;
        this.zzl = zzfcj;
        this.zzm = zzcnh;
        this.zzn = zzdjl;
        this.zzo = clock;
        this.zzp = zzddm;
        this.zzq = zzfja;
        this.zzs = zzfhh;
        this.zzt = zzebv;
        this.zzr = zzdpb;
        this.zzD = zzdjh;
    }

    private final String zzE(View view) {
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzdE)).booleanValue()) {
            return null;
        }
        try {
            return this.zzf.zzc().zzh(this.zza, view, (Activity) null);
        } catch (Exception unused) {
            zzo.zzg("Exception getting data.");
            return null;
        }
    }

    private final String zzF(View view, Map map) {
        if (!(map == null || view == null)) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int zzc2 = this.zze.zzc();
        if (zzc2 == 1) {
            return "1099";
        }
        if (zzc2 == 2) {
            return "2099";
        }
        if (zzc2 != 6) {
            return null;
        }
        return "3099";
    }

    private final boolean zzG(String str) {
        JSONObject optJSONObject = this.zzc.optJSONObject("allow_pub_event_reporting");
        if (optJSONObject == null || !optJSONObject.optBoolean(str, false)) {
            return false;
        }
        return true;
    }

    private final boolean zzH() {
        return this.zzc.optBoolean("allow_custom_click_gesture", false);
    }

    private final boolean zzI(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z, View view) {
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.zzc);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzdE)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z);
            Context context = this.zza;
            JSONObject jSONObject7 = new JSONObject();
            zzv.zzq();
            DisplayMetrics zzu2 = zzs.zzu((WindowManager) context.getSystemService("window"));
            try {
                jSONObject7.put("width", zzbc.zzb().zzb(context, zzu2.widthPixels));
                jSONObject7.put("height", zzbc.zzb().zzb(context, zzu2.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzix)).booleanValue()) {
                this.zzd.zzl("/clickRecorded", new zzdgy(this, (zzdha) null));
            } else {
                this.zzd.zzl("/logScionEvent", new zzdgx(this, (zzdha) null));
            }
            this.zzd.zzl("/nativeImpression", new zzdgz(this, view, (zzdha) null));
            zzbzz.zza(this.zzd.zzg("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.zzu) {
                return true;
            }
            zzfbo zzfbo = this.zzj;
            this.zzu = zzv.zzt().zzn(this.zza, this.zzk.afmaVersion, zzfbo.zzC.toString(), this.zzl.zzf);
            return true;
        } catch (JSONException e) {
            zzo.zzh("Unable to create impression JSON.", e);
            return false;
        }
    }

    public final void zzA(View view, Map map) {
        this.zzy = new Point();
        this.zzz = new Point();
        if (view != null) {
            this.zzp.zzb(view);
        }
        this.zzv = false;
    }

    public final boolean zzB() {
        if (zza() == 0) {
            return true;
        }
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzls)).booleanValue()) {
            return true;
        }
        return this.zzl.zzi.zzj;
    }

    public final boolean zzC() {
        return zzH();
    }

    public final boolean zzD(Bundle bundle) {
        if (!zzG("impression_reporting")) {
            zzo.zzg("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
            return false;
        }
        String str = null;
        JSONObject zzk2 = zzbc.zzb().zzk(bundle, (JSONObject) null);
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzlo)).booleanValue()) {
            str = zzE((View) null);
        }
        return zzI((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, str, zzk2, false, (View) null);
    }

    public final int zza() {
        if (this.zzl.zzi == null) {
            return 0;
        }
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzls)).booleanValue()) {
            return 0;
        }
        return this.zzl.zzi.zzi;
    }

    public final JSONObject zze(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.zza;
        JSONObject zzd2 = zzbv.zzd(context, map, map2, view, scaleType);
        JSONObject zzg2 = zzbv.zzg(context, view);
        JSONObject zzf2 = zzbv.zzf(view);
        JSONObject zze2 = zzbv.zze(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", zzd2);
            jSONObject.put("ad_view_signal", zzg2);
            jSONObject.put("scroll_view_signal", zzf2);
            jSONObject.put("lock_screen_signal", zze2);
            return jSONObject;
        } catch (JSONException e) {
            zzo.zzh("Unable to create native ad view signals JSON.", e);
            return null;
        }
    }

    public final JSONObject zzf(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject zze2 = zze(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.zzx && zzH()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (zze2 != null) {
                jSONObject.put("nas", zze2);
            }
        } catch (JSONException e) {
            zzo.zzh("Unable to create native click meta data JSON.", e);
        }
        return jSONObject;
    }

    public final void zzh() {
        try {
            zzdd zzdd = this.zzC;
            if (zzdd != null) {
                zzdd.zze();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzi() {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zzb();
        }
    }

    public final void zzj() {
        this.zzd.zzi();
    }

    public final void zzl(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) {
        View view3 = view2;
        Map map3 = map;
        Context context = this.zza;
        JSONObject zzd2 = zzbv.zzd(context, map3, map2, view2, scaleType);
        JSONObject zzg2 = zzbv.zzg(context, view2);
        JSONObject zzf2 = zzbv.zzf(view2);
        JSONObject zze2 = zzbv.zze(context, view2);
        View view4 = view;
        String zzF = zzF(view, map3);
        zzo(true == ((Boolean) zzbe.zzc().zza(zzbcl.zzdL)).booleanValue() ? view3 : view4, zzg2, zzd2, zzf2, zze2, zzF, zzbv.zzc(zzF, context, this.zzz, this.zzy), (JSONObject) null, z, false);
    }

    public final void zzm(String str) {
        zzo((View) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, str, (JSONObject) null, (JSONObject) null, false, false);
    }

    public final void zzn(Bundle bundle) {
        if (bundle == null) {
            zzo.zze("Click data is null. No click is reported.");
        } else if (!zzG("click_reporting")) {
            zzo.zzg("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            zzo((View) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, bundle2 != null ? bundle2.getString("asset_id") : null, (JSONObject) null, zzbc.zzb().zzk(bundle, (JSONObject) null), false, false);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzo(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z, boolean z2) {
        String str2;
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.zzc);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            boolean z3 = false;
            jSONObject7.put("has_custom_click_handler", this.zzb.zzc(this.zze.zzA()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.zze.zzc());
            jSONObject8.put("view_aware_api_used", z);
            zzbfl zzbfl = this.zzl.zzi;
            jSONObject8.put("custom_mute_requested", zzbfl != null && zzbfl.zzg);
            jSONObject8.put("custom_mute_enabled", !this.zze.zzH().isEmpty() && this.zze.zzk() != null);
            if (this.zzn.zza() != null && this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.zzo.currentTimeMillis());
            if (this.zzx && zzH()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            if (this.zzb.zzc(this.zze.zzA()) != null) {
                z3 = true;
            }
            jSONObject8.put("has_custom_click_handler", z3);
            String str3 = null;
            try {
                JSONObject optJSONObject = this.zzc.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                str2 = this.zzf.zzc().zzd(this.zza, optJSONObject.optString("click_string"), view);
            } catch (Exception e) {
                zzo.zzh("Exception obtaining click signals", e);
                str2 = null;
            }
            jSONObject8.put("click_signals", str2);
            jSONObject8.put("open_chrome_custom_tab", true);
            if (((Boolean) zzbe.zzc().zza(zzbcl.zziB)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) zzbe.zzc().zza(zzbcl.zziC)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long currentTimeMillis = this.zzo.currentTimeMillis();
            jSONObject9.put("time_from_last_touch_down", currentTimeMillis - this.zzA);
            jSONObject9.put("time_from_last_touch", currentTimeMillis - this.zzB);
            jSONObject7.put("touch_signal", jSONObject9);
            if (this.zzj.zzb()) {
                JSONObject jSONObject10 = (JSONObject) this.zzc.get("tracking_urls_and_actions");
                if (jSONObject10 != null) {
                    str3 = jSONObject10.getString("gws_query_id");
                }
                if (str3 != null) {
                    this.zzt.zzq(str3, this.zze);
                }
            }
            zzbzz.zza(this.zzd.zzg("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e2) {
            zzo.zzh("Unable to create click JSON.", e2);
        }
    }

    public final void zzp(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i) {
        JSONObject jSONObject;
        View view3 = view2;
        Map map3 = map;
        boolean z2 = false;
        if (this.zzc.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzls)).booleanValue()) {
                z2 = true;
            }
        }
        if (!z2) {
            if (!this.zzx) {
                zzo.zze("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!zzH()) {
                zzo.zze("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        JSONObject zzd2 = zzbv.zzd(this.zza, map3, map2, view3, scaleType);
        JSONObject zzg2 = zzbv.zzg(this.zza, view3);
        JSONObject zzf2 = zzbv.zzf(view2);
        JSONObject zze2 = zzbv.zze(this.zza, view3);
        String zzF = zzF(view, map3);
        JSONObject zzc2 = zzbv.zzc(zzF, this.zza, this.zzz, this.zzy);
        if (z2) {
            try {
                JSONObject jSONObject2 = this.zzc;
                Point point = this.zzz;
                Point point2 = this.zzy;
                try {
                    jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        JSONObject jSONObject4 = new JSONObject();
                        if (point != null) {
                            jSONObject3.put("x", point.x);
                            jSONObject3.put("y", point.y);
                        }
                        if (point2 != null) {
                            jSONObject4.put("x", point2.x);
                            jSONObject4.put("y", point2.y);
                        }
                        jSONObject.put("start_point", jSONObject3);
                        jSONObject.put("end_point", jSONObject4);
                        jSONObject.put("duration_ms", i);
                    } catch (Exception e) {
                        e = e;
                        zzo.zzh("Error occurred while grabbing custom click gesture signals.", e);
                        jSONObject2.put("custom_click_gesture_signal", jSONObject);
                        zzo(view2, zzg2, zzd2, zzf2, zze2, zzF, zzc2, (JSONObject) null, z, true);
                    }
                } catch (Exception e2) {
                    e = e2;
                    jSONObject = null;
                    zzo.zzh("Error occurred while grabbing custom click gesture signals.", e);
                    jSONObject2.put("custom_click_gesture_signal", jSONObject);
                    zzo(view2, zzg2, zzd2, zzf2, zze2, zzF, zzc2, (JSONObject) null, z, true);
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (JSONException e3) {
                zzo.zzh("Error occurred while adding CustomClickGestureSignals to adJson.", e3);
                zzv.zzp().zzw(e3, "FirstPartyNativeAdCore.performCustomClickGesture");
            }
        }
        zzo(view2, zzg2, zzd2, zzf2, zze2, zzF, zzc2, (JSONObject) null, z, true);
    }

    public final void zzq() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.zzc);
            zzbzz.zza(this.zzd.zzg("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e) {
            zzo.zzh("", e);
        }
    }

    public final void zzr(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.zza;
        zzI(zzbv.zzg(context, view), zzbv.zzd(context, map, map2, view, scaleType), zzbv.zzf(view), zzbv.zze(context, view), zzE(view), (JSONObject) null, zzbv.zzh(context, this.zzj), view);
    }

    public final void zzs() {
        zzI((JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, (String) null, (JSONObject) null, false, (View) null);
    }

    public final void zzt(View view, MotionEvent motionEvent, View view2) {
        this.zzy = zzbv.zza(motionEvent, view2);
        long currentTimeMillis = this.zzo.currentTimeMillis();
        this.zzB = currentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.zzr.zzb(motionEvent);
            this.zzA = currentTimeMillis;
            this.zzz = this.zzy;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation((float) this.zzy.x, (float) this.zzy.y);
        this.zzf.zzd(obtain);
        obtain.recycle();
    }

    public final void zzu(Bundle bundle) {
        if (bundle == null) {
            zzo.zze("Touch event data is null. No touch event is reported.");
        } else if (!zzG("touch_reporting")) {
            zzo.zzg("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
        } else {
            int i = bundle.getInt("duration_ms");
            this.zzf.zzc().zzl((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), i);
        }
    }

    public final void zzv(View view) {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzo.zzj("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        zzdjl zzdjl = this.zzn;
        if (view != null) {
            view.setOnClickListener(zzdjl);
            view.setClickable(true);
            zzdjl.zzc = new WeakReference(view);
        }
    }

    public final void zzw() {
        this.zzx = true;
    }

    public final void zzx(zzdd zzdd) {
        this.zzC = zzdd;
    }

    public final void zzy(zzbhq zzbhq) {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzo.zzj("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        } else {
            this.zzn.zzc(zzbhq);
        }
    }

    public final void zzz(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.zzy = new Point();
        this.zzz = new Point();
        if (!this.zzv) {
            this.zzp.zza(view);
            this.zzv = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.zzm.zzi(this);
        boolean zzi2 = zzbv.zzi(this.zzk.clientJarVersion);
        if (map != null) {
            for (Map.Entry value : map.entrySet()) {
                View view2 = (View) ((WeakReference) value.getValue()).get();
                if (view2 != null) {
                    if (zzi2) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            for (Map.Entry value2 : map2.entrySet()) {
                View view3 = (View) ((WeakReference) value2.getValue()).get();
                if (view3 != null) {
                    if (zzi2) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    public final void zzk(zzdh zzdh) {
        try {
            if (!this.zzw) {
                if (zzdh == null) {
                    zzdif zzdif = this.zze;
                    if (zzdif.zzk() != null) {
                        this.zzw = true;
                        this.zzq.zzd(zzdif.zzk().zzf(), this.zzj.zzax, this.zzs);
                        zzh();
                        return;
                    }
                }
                this.zzw = true;
                this.zzq.zzd(zzdh.zzf(), this.zzj.zzax, this.zzs);
                zzh();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }
}
