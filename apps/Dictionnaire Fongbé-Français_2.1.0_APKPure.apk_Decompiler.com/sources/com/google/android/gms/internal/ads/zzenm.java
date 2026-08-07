package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzenm implements zzetq {
    private final Context zza;
    private final Bundle zzb;
    private final String zzc;
    private final String zzd;
    private final zzg zze;
    private final String zzf;
    private final zzctc zzg;

    public zzenm(Context context, Bundle bundle, String str, String str2, zzg zzg2, String str3, zzctc zzctc) {
        this.zza = context;
        this.zzb = bundle;
        this.zzc = str;
        this.zzd = str2;
        this.zze = zzg2;
        this.zzf = str3;
        this.zzg = zzctc;
    }

    private final void zzc(Bundle bundle) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzfA)).booleanValue()) {
            try {
                zzv.zzq();
                bundle.putString("_app_id", zzs.zzq(this.zza));
            } catch (RemoteException | RuntimeException e) {
                zzv.zzp().zzw(e, "AppStatsSignal_AppId");
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzcuv zzcuv = (zzcuv) obj;
        zzcuv.zzb.putBundle("quality_signals", this.zzb);
        zzc(zzcuv.zzb);
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcuv) obj).zza;
        bundle.putBundle("quality_signals", this.zzb);
        bundle.putString("seq_num", this.zzc);
        if (!this.zze.zzN()) {
            bundle.putString("session_id", this.zzd);
        }
        bundle.putBoolean("client_purpose_one", !this.zze.zzN());
        zzc(bundle);
        if (this.zzf != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dload", this.zzg.zzb(this.zzf));
            bundle2.putInt("pcc", this.zzg.zza(this.zzf));
            bundle.putBundle("ad_unit_quality_signals", bundle2);
        }
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzjD)).booleanValue() && zzv.zzp().zza() > 0) {
            bundle.putInt("nrwv", zzv.zzp().zza());
        }
    }
}
