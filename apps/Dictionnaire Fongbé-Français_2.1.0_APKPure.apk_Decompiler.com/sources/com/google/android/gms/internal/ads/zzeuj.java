package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse;
import androidx.privacysandbox.ads.adservices.topics.Topic;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzeuj implements zzgbo {
    public final ListenableFuture zza(Object obj) {
        GetTopicsResponse getTopicsResponse = (GetTopicsResponse) obj;
        if (getTopicsResponse == null) {
            return zzgch.zzh(new zzeun("", 1, (zzeum) null));
        }
        zzhbb zzc = zzhbc.zzc();
        for (Topic next : getTopicsResponse.getTopics()) {
            zzhaz zzc2 = zzhba.zzc();
            zzc2.zzc(next.getTopicId());
            zzc2.zza(next.getModelVersion());
            zzc2.zzb(next.getTaxonomyVersion());
            zzc.zza((zzhba) zzc2.zzbr());
        }
        return zzgch.zzh(new zzeun(Base64.encodeToString(((zzhbc) zzc.zzbr()).zzaV(), 1), 1, (zzeum) null));
    }
}
