package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzeuz implements zzgbo {
    public final ListenableFuture zza(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        if (appSetIdInfo == null) {
            return zzgch.zzh(new zzevc((String) null, -1));
        }
        return zzgch.zzh(new zzevc(appSetIdInfo.getId(), appSetIdInfo.getScope()));
    }
}
