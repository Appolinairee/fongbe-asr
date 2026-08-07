package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.internal.ads.zzbvk;
import com.google.android.gms.internal.ads.zzdyi;
import com.google.android.gms.internal.ads.zzgbo;
import com.google.android.gms.internal.ads.zzgch;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStreamReader;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzbh implements zzgbo {
    public final /* synthetic */ zzbvk zza;

    public /* synthetic */ zzbh(zzbvk zzbvk) {
        this.zza = zzbvk;
    }

    public final ListenableFuture zza(Object obj) {
        zzdyi zzdyi = (zzdyi) obj;
        zzbk zzbk = new zzbk(new JsonReader(new InputStreamReader(zzdyi.zzb())), zzdyi.zza());
        zzbvk zzbvk = this.zza;
        try {
            zzbk.zzb = zzbc.zzb().zzi(zzbvk.zza).toString();
        } catch (JSONException unused) {
            zzbk.zzb = "{}";
        }
        if (!zzbvk.zzn.isEmpty()) {
            try {
                zzbk.zzc = zzbc.zzb().zzi(zzbvk.zzn).toString();
            } catch (JSONException unused2) {
            }
        }
        return zzgch.zzh(zzbk);
    }
}
