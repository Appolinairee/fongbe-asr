package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.zzv;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcnd implements zzbnz {
    private final Context zza;
    private final zzayg zzb;
    private final PowerManager zzc;

    public zzcnd(Context context, zzayg zzayg) {
        this.zza = context;
        this.zzb = zzayg;
        this.zzc = (PowerManager) context.getSystemService("power");
    }

    /* renamed from: zza */
    public final JSONObject zzb(zzcng zzcng) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzayj zzayj = zzcng.zzf;
        if (zzayj == null) {
            jSONObject = new JSONObject();
        } else if (this.zzb.zzd() != null) {
            boolean z = zzayj.zza;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject put = jSONObject3.put("afmaVersion", this.zzb.zzb()).put("activeViewJSON", this.zzb.zzd()).put("timestamp", zzcng.zzd).put("adFormat", this.zzb.zza()).put("hashCode", this.zzb.zzc()).put("isMraid", false);
            boolean z2 = zzcng.zzc;
            put.put("isStopped", false).put("isPaused", zzcng.zzb).put("isNative", this.zzb.zze()).put("isScreenOn", this.zzc.isInteractive()).put("appMuted", zzv.zzs().zze()).put("appVolume", (double) zzv.zzs().zza()).put("deviceVolume", (double) zzab.zzb(this.zza.getApplicationContext()));
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.zza.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", zzayj.zzb).put("isAttachedToWindow", z).put("viewBox", new JSONObject().put("top", zzayj.zzc.top).put("bottom", zzayj.zzc.bottom).put("left", zzayj.zzc.left).put("right", zzayj.zzc.right)).put("adBox", new JSONObject().put("top", zzayj.zzd.top).put("bottom", zzayj.zzd.bottom).put("left", zzayj.zzd.left).put("right", zzayj.zzd.right)).put("globalVisibleBox", new JSONObject().put("top", zzayj.zze.top).put("bottom", zzayj.zze.bottom).put("left", zzayj.zze.left).put("right", zzayj.zze.right)).put("globalVisibleBoxVisible", zzayj.zzf).put("localVisibleBox", new JSONObject().put("top", zzayj.zzg.top).put("bottom", zzayj.zzg.bottom).put("left", zzayj.zzg.left).put("right", zzayj.zzg.right)).put("localVisibleBoxVisible", zzayj.zzh).put("hitBox", new JSONObject().put("top", zzayj.zzi.top).put("bottom", zzayj.zzi.bottom).put("left", zzayj.zzi.left).put("right", zzayj.zzi.right)).put("screenDensity", (double) this.zza.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", zzcng.zza);
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzby)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzayj.zzk;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzcng.zze)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        } else {
            throw new JSONException("Active view Info cannot be null.");
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
