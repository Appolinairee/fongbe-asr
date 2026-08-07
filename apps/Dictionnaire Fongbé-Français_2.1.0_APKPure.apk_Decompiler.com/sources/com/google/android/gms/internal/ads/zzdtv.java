package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdtv implements Runnable {
    public final /* synthetic */ zzdua zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzblr zzc;
    public final /* synthetic */ zzfdh zzd;
    public final /* synthetic */ List zze;

    public /* synthetic */ zzdtv(zzdua zzdua, String str, zzblr zzblr, zzfdh zzfdh, List list) {
        this.zza = zzdua;
        this.zzb = str;
        this.zzc = zzblr;
        this.zzd = zzfdh;
        this.zze = list;
    }

    public final void run() {
        this.zza.zzn(this.zzb, this.zzc, this.zzd, this.zze);
    }
}
