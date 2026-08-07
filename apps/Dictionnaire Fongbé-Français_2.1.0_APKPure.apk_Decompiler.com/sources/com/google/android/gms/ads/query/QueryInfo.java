package com.google.android.gms.ads.query;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzei;
import com.google.android.gms.ads.internal.client.zzfa;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbej;
import com.google.android.gms.internal.ads.zzbtv;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public class QueryInfo {
    private final zzfa zza;

    public QueryInfo(zzfa zzfa) {
        this.zza = zzfa;
    }

    public static void generate(Context context, AdFormat adFormat, AdRequest adRequest, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zza(context, adFormat, adRequest, (String) null, queryInfoGenerationCallback);
    }

    private static void zza(Context context, AdFormat adFormat, AdRequest adRequest, String str, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        zzei zzei;
        zzbcl.zza(context);
        if (((Boolean) zzbej.zzj.zze()).booleanValue()) {
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzla)).booleanValue()) {
                zzb.zzb.execute(new zza(context, adFormat, adRequest, str, queryInfoGenerationCallback));
                return;
            }
        }
        if (adRequest == null) {
            zzei = null;
        } else {
            zzei = adRequest.zza();
        }
        new zzbtv(context, adFormat, zzei, str).zzb(queryInfoGenerationCallback);
    }

    public String getQuery() {
        return this.zza.zzb();
    }

    public Bundle getQueryBundle() {
        return this.zza.zza();
    }

    public String getRequestId() {
        return this.zza.zzc();
    }

    public static void generate(Context context, AdFormat adFormat, AdRequest adRequest, String str, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        Preconditions.checkNotNull(str, "AdUnitId cannot be null.");
        zza(context, adFormat, adRequest, str, queryInfoGenerationCallback);
    }
}
