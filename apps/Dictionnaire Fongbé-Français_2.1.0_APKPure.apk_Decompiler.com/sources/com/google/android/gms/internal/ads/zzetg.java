package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzetg implements zzetq {
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final String zzh;

    zzetg(boolean z, boolean z2, String str, boolean z3, int i, int i2, int i3, String str2) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = str;
        this.zzd = z3;
        this.zze = i;
        this.zzf = i2;
        this.zzg = i3;
        this.zzh = str2;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzcuv zzcuv = (zzcuv) obj;
        zzcuv.zzb.putString("js", this.zzc);
        zzcuv.zzb.putInt("target_api", this.zze);
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcuv) obj).zza;
        bundle.putString("js", this.zzc);
        bundle.putBoolean("is_nonagon", true);
        bundle.putString("extra_caps", (String) zzbe.zzc().zza(zzbcl.zzdP));
        bundle.putInt("target_api", this.zze);
        bundle.putInt("dv", this.zzf);
        bundle.putInt("lv", this.zzg);
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzfO)).booleanValue() && !TextUtils.isEmpty(this.zzh)) {
            bundle.putString("ev", this.zzh);
        }
        Bundle zza2 = zzfcx.zza(bundle, "sdk_env");
        zza2.putBoolean("mf", ((Boolean) zzbel.zzc.zze()).booleanValue());
        zza2.putBoolean("instant_app", this.zza);
        zza2.putBoolean("lite", this.zzb);
        zza2.putBoolean("is_privileged_process", this.zzd);
        bundle.putBundle("sdk_env", zza2);
        Bundle zza3 = zzfcx.zza(zza2, "build_meta");
        zza3.putString("cl", "697668803");
        zza3.putString("rapid_rc", "dev");
        zza3.putString("rapid_rollup", "HEAD");
        zza2.putBundle("build_meta", zza3);
    }
}
