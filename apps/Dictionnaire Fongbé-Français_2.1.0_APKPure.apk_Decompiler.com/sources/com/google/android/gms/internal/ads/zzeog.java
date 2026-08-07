package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzeog implements Runnable {
    public final /* synthetic */ zzeoj zza;

    public /* synthetic */ zzeog(zzeoj zzeoj) {
        this.zza = zzeoj;
    }

    public final void run() {
        this.zza.zzd.execute(new zzeoh(this.zza));
    }
}
