package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzcmi implements Runnable {
    public final /* synthetic */ zzfja zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzv zzc;

    public /* synthetic */ zzcmi(zzfja zzfja, String str, zzv zzv) {
        this.zza = zzfja;
        this.zzb = str;
        this.zzc = zzv;
    }

    public final void run() {
        this.zza.zzd(this.zzb, this.zzc, (zzfhh) null);
    }
}
