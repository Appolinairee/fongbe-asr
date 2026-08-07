package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcuw {
    private final zzfgn zza;
    private final VersionInfoParcel zzb;
    private final ApplicationInfo zzc;
    private final String zzd;
    private final List zze;
    private final PackageInfo zzf;
    private final zzhel zzg;
    private final String zzh;
    private final zzetu zzi;
    private final zzg zzj;
    private final zzfcj zzk;
    private final int zzl;
    private final zzdbe zzm;

    zzcuw(zzfgn zzfgn, VersionInfoParcel versionInfoParcel, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, zzhel zzhel, zzg zzg2, String str2, zzetu zzetu, zzfcj zzfcj, zzdbe zzdbe, int i) {
        this.zza = zzfgn;
        this.zzb = versionInfoParcel;
        this.zzc = applicationInfo;
        this.zzd = str;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = zzhel;
        this.zzh = str2;
        this.zzi = zzetu;
        this.zzj = zzg2;
        this.zzk = zzfcj;
        this.zzm = zzdbe;
        this.zzl = i;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzbvk zza(ListenableFuture listenableFuture, Bundle bundle) throws Exception {
        zzcuv zzcuv = (zzcuv) listenableFuture.get();
        Bundle bundle2 = zzcuv.zza;
        String str = (String) ((ListenableFuture) this.zzg.zzb()).get();
        boolean z = ((Boolean) zzbe.zzc().zza(zzbcl.zzgQ)).booleanValue() && this.zzj.zzN();
        String str2 = this.zzh;
        PackageInfo packageInfo = this.zzf;
        List list = this.zze;
        return new zzbvk(bundle2, this.zzb, this.zzc, this.zzd, list, packageInfo, str, str2, (zzfed) null, (String) null, z, this.zzk.zzb(), bundle, zzcuv.zzb);
    }

    public final ListenableFuture zzb(Bundle bundle) {
        this.zzm.zza();
        return zzffx.zzc(this.zzi.zza(new zzcuv(new Bundle(), new Bundle()), bundle, this.zzl == 2), zzfgh.SIGNALS, this.zza).zza();
    }

    public final ListenableFuture zzc() {
        Bundle bundle = new Bundle();
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzck)).booleanValue()) {
            Bundle bundle2 = this.zzk.zzs;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        ListenableFuture zzb2 = zzb(bundle);
        return this.zza.zza(zzfgh.REQUEST_PARCEL, zzb2, (ListenableFuture) this.zzg.zzb()).zza(new zzcuu(this, zzb2, bundle)).zza();
    }
}
