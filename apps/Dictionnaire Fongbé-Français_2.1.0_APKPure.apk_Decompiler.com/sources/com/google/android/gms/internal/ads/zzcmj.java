package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzcmj implements zzgcd {
    final /* synthetic */ zzfja zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzv zzc;
    final /* synthetic */ zzcmk zzd;

    zzcmj(zzcmk zzcmk, zzfja zzfja, String str, zzv zzv) {
        this.zza = zzfja;
        this.zzb = str;
        this.zzc = zzv;
        this.zzd = zzcmk;
    }

    public final void zza(Throwable th) {
        this.zzd.zzg.zza(new zzcmh(this, th, this.zza, this.zzb, this.zzc));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzd.zzg.zza(new zzcmi(this.zza, (String) obj, this.zzc));
    }
}
