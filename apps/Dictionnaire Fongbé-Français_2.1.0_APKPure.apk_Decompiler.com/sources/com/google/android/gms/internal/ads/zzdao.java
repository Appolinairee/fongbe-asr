package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdao implements zzdbi {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzdao(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final void zza(Object obj) {
        ((AppEventListener) obj).onAppEvent(this.zza, this.zzb);
    }
}
