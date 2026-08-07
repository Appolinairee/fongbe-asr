package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcpb implements zzher {
    private final zzcot zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;

    public zzcpb(zzcot zzcot, zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4) {
        this.zza = zzcot;
        this.zzb = zzhfj;
        this.zzc = zzhfj2;
        this.zzd = zzhfj3;
        this.zze = zzhfj4;
    }

    public static zzddk zza(zzcot zzcot, Context context, VersionInfoParcel versionInfoParcel, zzfbo zzfbo, zzfcj zzfcj) {
        zzddk zzddk = new zzddk(new zzcor(context, versionInfoParcel, zzfbo, zzfcj), zzbzw.zzg);
        zzddk zzddk2 = zzddk;
        return zzddk;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        VersionInfoParcel zza2 = ((zzchs) this.zzc).zza();
        VersionInfoParcel versionInfoParcel = zza2;
        zzfbo zza3 = ((zzcrq) this.zzd).zza();
        zzfbo zzfbo = zza3;
        zzfcj zza4 = ((zzcvk) this.zze).zza();
        zzfcj zzfcj = zza4;
        return zza(this.zza, (Context) this.zzb.zzb(), zza2, zza3, zza4);
    }
}
