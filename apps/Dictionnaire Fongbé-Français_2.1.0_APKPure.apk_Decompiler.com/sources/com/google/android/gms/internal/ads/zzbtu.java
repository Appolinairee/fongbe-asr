package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzfa;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzbtu extends zzbyq {
    final /* synthetic */ QueryInfoGenerationCallback zza;

    zzbtu(zzbtv zzbtv, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        this.zza = queryInfoGenerationCallback;
    }

    public final void zzb(String str) {
        this.zza.onFailure(str);
    }

    public final void zzc(String str, String str2, Bundle bundle) {
        this.zza.onSuccess(new QueryInfo(new zzfa(str, bundle, str2)));
    }
}
