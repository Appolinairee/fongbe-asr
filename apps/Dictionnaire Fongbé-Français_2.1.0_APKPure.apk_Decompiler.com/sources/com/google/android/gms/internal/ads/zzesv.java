package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzesv implements zzfuc {
    public final /* synthetic */ String zza;

    public /* synthetic */ zzesv(String str) {
        this.zza = str;
    }

    public final Object apply(Object obj) {
        String str = this.zza;
        Throwable th = (Throwable) obj;
        zzo.zzg("Error calling adapter: ".concat(String.valueOf(str)));
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzmR)).booleanValue()) {
            zzv.zzp().zzv(th, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str)));
            return null;
        }
        zzv.zzp().zzw(th, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str)));
        return null;
    }
}
