package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzcaq implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcaw zzc;

    zzcaq(zzcaw zzcaw, String str, String str2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzcaw;
    }

    public final void run() {
        zzcaw zzcaw = this.zzc;
        if (zzcaw.zzq != null) {
            zzcaw.zzq.zzb(this.zza, this.zzb);
        }
    }
}
