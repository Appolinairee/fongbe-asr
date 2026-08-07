package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzu;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final /* synthetic */ class zzbue implements Runnable {
    public final /* synthetic */ zzu zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzbue(zzu zzu, String str) {
        this.zza = zzu;
        this.zzb = str;
    }

    public final void run() {
        this.zza.zza(this.zzb);
    }
}
