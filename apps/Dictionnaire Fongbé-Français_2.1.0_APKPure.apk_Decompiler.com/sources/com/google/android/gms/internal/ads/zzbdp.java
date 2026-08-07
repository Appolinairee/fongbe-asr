package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzbdp extends QueryInfoGenerationCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbdq zzb;

    zzbdp(zzbdq zzbdq, String str) {
        this.zza = str;
        this.zzb = zzbdq;
    }

    public final void onFailure(String str) {
        zzo.zzj("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
        try {
            zzbdq zzbdq = this.zzb;
            zzbdq.zzg.postMessage(zzbdq.zzc(this.zza, str).toString(), (Bundle) null);
        } catch (JSONException e) {
            zzo.zzh("Error creating PACT Error Response JSON: ", e);
        }
    }

    public final void onSuccess(QueryInfo queryInfo) {
        String query = queryInfo.getQuery();
        try {
            zzbdq zzbdq = this.zzb;
            zzbdq.zzg.postMessage(zzbdq.zzd(this.zza, query).toString(), (Bundle) null);
        } catch (JSONException e) {
            zzo.zzh("Error creating PACT Signal Response JSON: ", e);
        }
    }
}
