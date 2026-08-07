package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzbmz implements Runnable {
    public final /* synthetic */ zzbns zza;
    public final /* synthetic */ zzbnr zzb;
    public final /* synthetic */ zzbmn zzc;
    public final /* synthetic */ ArrayList zzd;
    public final /* synthetic */ long zze;

    public /* synthetic */ zzbmz(zzbns zzbns, zzbnr zzbnr, zzbmn zzbmn, ArrayList arrayList, long j) {
        this.zza = zzbns;
        this.zzb = zzbnr;
        this.zzc = zzbmn;
        this.zzd = arrayList;
        this.zze = j;
    }

    public final void run() {
        this.zza.zzj(this.zzb, this.zzc, this.zzd, this.zze);
    }
}
