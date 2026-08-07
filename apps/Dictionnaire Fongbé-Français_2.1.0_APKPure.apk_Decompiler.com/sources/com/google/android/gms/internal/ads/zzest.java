package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzest implements Runnable {
    public final /* synthetic */ zzesx zza;
    public final /* synthetic */ zzbrd zzb;
    public final /* synthetic */ Bundle zzc;
    public final /* synthetic */ List zzd;
    public final /* synthetic */ zzejm zze;
    public final /* synthetic */ zzcab zzf;

    public /* synthetic */ zzest(zzesx zzesx, zzbrd zzbrd, Bundle bundle, List list, zzejm zzejm, zzcab zzcab) {
        this.zza = zzesx;
        this.zzb = zzbrd;
        this.zzc = bundle;
        this.zzd = list;
        this.zze = zzejm;
        this.zzf = zzcab;
    }

    public final void run() {
        this.zza.zze(this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }
}
