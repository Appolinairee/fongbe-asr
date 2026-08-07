package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.nonagon.signalgeneration.zzbk;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcuc implements zzcyq, zzdee {
    private final Context zza;
    private final zzfcj zzb;
    private final VersionInfoParcel zzc;
    private final zzg zzd;
    private final zzdua zze;
    private final zzfhk zzf;

    public zzcuc(Context context, zzfcj zzfcj, VersionInfoParcel versionInfoParcel, zzg zzg, zzdua zzdua, zzfhk zzfhk) {
        this.zza = context;
        this.zzb = zzfcj;
        this.zzc = versionInfoParcel;
        this.zzd = zzg;
        this.zze = zzdua;
        this.zzf = zzfhk;
    }

    private final void zzc() {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzeb)).booleanValue()) {
            zzg zzg = this.zzd;
            Context context = this.zza;
            VersionInfoParcel versionInfoParcel = this.zzc;
            zzfcj zzfcj = this.zzb;
            zzfhk zzfhk = this.zzf;
            zzv.zza().zzc(context, versionInfoParcel, zzfcj.zzf, zzg.zzg(), zzfhk);
        }
        this.zze.zzr();
    }

    public final void zzdl(zzbvk zzbvk) {
        zzc();
    }

    public final void zzdm(zzfca zzfca) {
    }

    public final void zze(zzbk zzbk) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzec)).booleanValue()) {
            zzc();
        }
    }

    public final void zzf(String str) {
    }
}
