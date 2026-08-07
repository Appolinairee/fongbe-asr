package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdmd implements zzayk {
    public final /* synthetic */ zzcex zza;

    public /* synthetic */ zzdmd(zzcex zzcex) {
        this.zza = zzcex;
    }

    public final void zzdn(zzayj zzayj) {
        String str;
        HashMap hashMap = new HashMap();
        if (true != zzayj.zzj) {
            str = "0";
        } else {
            str = "1";
        }
        hashMap.put("isVisible", str);
        this.zza.zzd("onAdVisibilityChanged", hashMap);
    }
}
