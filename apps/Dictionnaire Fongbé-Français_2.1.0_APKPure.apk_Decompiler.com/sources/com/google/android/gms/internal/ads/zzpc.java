package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzpc implements Runnable {
    public final /* synthetic */ zzpe zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ long zzd;

    public /* synthetic */ zzpc(zzpe zzpe, String str, long j, long j2) {
        this.zza = zzpe;
        this.zzb = str;
        this.zzc = j;
        this.zzd = j2;
    }

    public final void run() {
        this.zza.zzn(this.zzb, this.zzc, this.zzd);
    }
}
