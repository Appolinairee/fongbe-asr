package com.google.android.gms.ads.nonagon.signalgeneration;

import android.webkit.ValueCallback;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbeq;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzbu extends QueryInfoGenerationCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ TaggingLibraryJsInterface zzb;

    zzbu(TaggingLibraryJsInterface taggingLibraryJsInterface, String str) {
        this.zza = str;
        this.zzb = taggingLibraryJsInterface;
    }

    public final void onFailure(String str) {
        String str2;
        zzo.zzj("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        if (((Boolean) zzbeq.zza.zze()).booleanValue()) {
            str2 = ",\"as\":".concat(this.zzb.zzk.zza().toString());
        } else {
            str2 = "";
        }
        String str3 = this.zza;
        String format = String.format(Locale.getDefault(), "window.postMessage({\"paw_id\":\"%1$s\",\"error\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", new Object[]{str3, str, Long.valueOf(((Boolean) zzbeq.zzc.zze()).booleanValue() ? ((Long) zzbeq.zzf.zze()).longValue() : 0), str2});
        if (((Boolean) zzbeq.zzc.zze()).booleanValue()) {
            try {
                this.zzb.zzh.execute(new zzbs(this, format));
            } catch (RuntimeException e) {
                zzv.zzp().zzv(e, "TaggingLibraryJsInterface.getQueryInfo.onFailure");
            }
        } else {
            this.zzb.zzb.evaluateJavascript(format, (ValueCallback) null);
        }
        if (((Boolean) zzbeq.zza.zze()).booleanValue() && ((Boolean) zzbeq.zzb.zze()).booleanValue()) {
            this.zzb.zzl.zzb();
        }
    }

    public final void onSuccess(QueryInfo queryInfo) {
        String str;
        String str2;
        String query = queryInfo.getQuery();
        long j = 0;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", this.zza);
            jSONObject.put("signal", query);
            jSONObject.put("sdk_ttl_ms", ((Boolean) zzbeq.zzc.zze()).booleanValue() ? ((Long) zzbeq.zzf.zze()).longValue() : 0);
            if (((Boolean) zzbeq.zza.zze()).booleanValue()) {
                jSONObject.put("as", this.zzb.zzk.zza());
            }
            str = String.format(Locale.getDefault(), "window.postMessage(%1$s, '*');", new Object[]{jSONObject});
        } catch (JSONException unused) {
            if (((Boolean) zzbeq.zza.zze()).booleanValue()) {
                str2 = ",\"as\":".concat(this.zzb.zzk.zza().toString());
            } else {
                str2 = "";
            }
            String str3 = this.zza;
            Locale locale = Locale.getDefault();
            String query2 = queryInfo.getQuery();
            if (((Boolean) zzbeq.zzc.zze()).booleanValue()) {
                j = ((Long) zzbeq.zzf.zze()).longValue();
            }
            str = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"signal\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", new Object[]{str3, query2, Long.valueOf(j), str2});
        }
        if (((Boolean) zzbeq.zzc.zze()).booleanValue()) {
            try {
                this.zzb.zzh.execute(new zzbt(this, str));
            } catch (RuntimeException e) {
                zzv.zzp().zzv(e, "TaggingLibraryJsInterface.getQueryInfo.onSuccess");
            }
        } else {
            this.zzb.zzb.evaluateJavascript(str, (ValueCallback) null);
        }
        if (((Boolean) zzbeq.zza.zze()).booleanValue() && ((Boolean) zzbeq.zzb.zze()).booleanValue()) {
            this.zzb.zzl.zzb();
        }
    }
}
