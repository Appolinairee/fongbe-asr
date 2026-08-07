package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzcmh implements Runnable {
    public final /* synthetic */ zzcmj zza;
    public final /* synthetic */ Throwable zzb;
    public final /* synthetic */ zzfja zzc;
    public final /* synthetic */ String zzd;
    public final /* synthetic */ zzv zze;

    public /* synthetic */ zzcmh(zzcmj zzcmj, Throwable th, zzfja zzfja, String str, zzv zzv) {
        this.zza = zzcmj;
        this.zzb = th;
        this.zzc = zzfja;
        this.zzd = str;
        this.zze = zzv;
    }

    public final void run() {
        boolean booleanValue = ((Boolean) zzbe.zzc().zza(zzbcl.zzkh)).booleanValue();
        zzcmj zzcmj = this.zza;
        Throwable th = this.zzb;
        if (booleanValue) {
            zzcmk zzcmk = zzcmj.zzd;
            zzcmk.zzb = zzbuh.zzc(zzcmk.zzc);
            zzcmj.zzd.zzb.zzh(th, "AttributionReporting.registerSourceAndPingClickUrl");
        } else {
            zzcmk zzcmk2 = zzcmj.zzd;
            zzcmk2.zza = zzbuh.zza(zzcmk2.zzc);
            zzcmj.zzd.zza.zzh(th, "AttributionReportingSampled.registerSourceAndPingClickUrl");
        }
        zzv zzv = this.zze;
        this.zzc.zzd(this.zzd, zzv, (zzfhh) null);
    }
}
