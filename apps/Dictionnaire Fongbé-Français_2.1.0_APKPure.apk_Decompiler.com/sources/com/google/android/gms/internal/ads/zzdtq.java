package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdtq implements Runnable {
    public final /* synthetic */ zzdua zza;
    public final /* synthetic */ Object zzb;
    public final /* synthetic */ zzcab zzc;
    public final /* synthetic */ String zzd;
    public final /* synthetic */ long zze;
    public final /* synthetic */ zzfgw zzf;

    public /* synthetic */ zzdtq(zzdua zzdua, Object obj, zzcab zzcab, String str, long j, zzfgw zzfgw) {
        this.zza = zzdua;
        this.zzb = obj;
        this.zzc = zzcab;
        this.zzd = str;
        this.zze = j;
        this.zzf = zzfgw;
    }

    public final void run() {
        this.zza.zzq(this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }
}
