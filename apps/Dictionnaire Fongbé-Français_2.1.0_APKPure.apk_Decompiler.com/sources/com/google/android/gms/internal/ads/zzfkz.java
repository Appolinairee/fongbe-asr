package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.webkit.WebView;
import androidx.webkit.JavaScriptReplyProxy;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebViewCompat;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzfkz implements WebViewCompat.WebMessageListener {
    final /* synthetic */ zzfla zza;

    zzfkz(zzfla zzfla) {
        this.zza = zzfla;
    }

    public final void onPostMessage(WebView webView, WebMessageCompat webMessageCompat, Uri uri, boolean z, JavaScriptReplyProxy javaScriptReplyProxy) {
        try {
            JSONObject jSONObject = new JSONObject(webMessageCompat.getData());
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
            if (string.equals("startSession")) {
                zzfla.zze(this.zza, string2);
            } else if (!string.equals("finishSession")) {
                zzfkm.zza.booleanValue();
            } else {
                zzfla.zzc(this.zza, string2);
            }
        } catch (JSONException e) {
            zzfmh.zza("Error parsing JS message in JavaScriptSessionService.", e);
        }
    }
}
