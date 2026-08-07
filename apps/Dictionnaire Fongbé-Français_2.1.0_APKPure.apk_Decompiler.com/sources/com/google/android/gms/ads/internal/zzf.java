package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.lifecycle.CoroutineLiveDataKt;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbcc;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbnw;
import com.google.android.gms.internal.ads.zzbod;
import com.google.android.gms.internal.ads.zzbzg;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzbzz;
import com.google.android.gms.internal.ads.zzdrv;
import com.google.android.gms.internal.ads.zzdrw;
import com.google.android.gms.internal.ads.zzfgv;
import com.google.android.gms.internal.ads.zzfgw;
import com.google.android.gms.internal.ads.zzfhk;
import com.google.android.gms.internal.ads.zzgch;
import com.google.common.util.concurrent.ListenableFuture;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzf {
    private Context zza;
    private long zzb = 0;

    static final /* synthetic */ ListenableFuture zzd(Long l, zzdrw zzdrw, zzfhk zzfhk, zzfgw zzfgw, JSONObject jSONObject) throws Exception {
        boolean optBoolean = jSONObject.optBoolean("isSuccessful", false);
        if (optBoolean) {
            zzv.zzp().zzi().zzs(jSONObject.getString("appSettingsJson"));
            if (l != null) {
                zzf(zzdrw, "cld_s", zzv.zzC().elapsedRealtime() - l.longValue());
            }
        }
        zzfgw.zzg(optBoolean);
        zzfhk.zzb(zzfgw.zzm());
        return zzgch.zzh((Object) null);
    }

    /* access modifiers changed from: private */
    public static final void zzf(zzdrw zzdrw, String str, long j) {
        if (zzdrw != null) {
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzmy)).booleanValue()) {
                zzdrv zza2 = zzdrw.zza();
                zza2.zzb("action", "lat_init");
                zza2.zzb(str, Long.toString(j));
                zza2.zzg();
            }
        }
    }

    public final void zza(Context context, VersionInfoParcel versionInfoParcel, String str, Runnable runnable, zzfhk zzfhk, zzdrw zzdrw, Long l) {
        zzb(context, versionInfoParcel, true, (zzbzg) null, str, (String) null, runnable, zzfhk, zzdrw, l);
    }

    /* access modifiers changed from: package-private */
    public final void zzb(Context context, VersionInfoParcel versionInfoParcel, boolean z, zzbzg zzbzg, String str, String str2, Runnable runnable, zzfhk zzfhk, zzdrw zzdrw, Long l) {
        PackageInfo packageInfo;
        Context context2 = context;
        VersionInfoParcel versionInfoParcel2 = versionInfoParcel;
        Runnable runnable2 = runnable;
        zzfhk zzfhk2 = zzfhk;
        Long l2 = l;
        if (zzv.zzC().elapsedRealtime() - this.zzb < CoroutineLiveDataKt.DEFAULT_TIMEOUT) {
            zzo.zzj("Not retrying to fetch app settings");
            return;
        }
        this.zzb = zzv.zzC().elapsedRealtime();
        if (zzbzg != null && !TextUtils.isEmpty(zzbzg.zzc())) {
            if (zzv.zzC().currentTimeMillis() - zzbzg.zza() <= ((Long) zzbe.zzc().zza(zzbcl.zzej)).longValue() && zzbzg.zzi()) {
                return;
            }
        }
        if (context2 == null) {
            zzo.zzj("Context not provided to fetch application settings");
        } else if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context2;
            }
            this.zza = applicationContext;
            zzfgw zza2 = zzfgv.zza(context, 4);
            zza2.zzi();
            zzbnw zza3 = zzv.zzg().zza(this.zza, versionInfoParcel, zzfhk2).zza("google.afma.config.fetchAppSettings", zzbod.zza, zzbod.zza);
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("app_id", str);
                } else if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("ad_unit_id", str2);
                }
                jSONObject.put("is_init", z);
                jSONObject.put("pn", context.getPackageName());
                zzbcc zzbcc = zzbcl.zza;
                jSONObject.put("experiment_ids", TextUtils.join(",", zzbe.zza().zza()));
                jSONObject.put("js", versionInfoParcel2.afmaVersion);
                try {
                    ApplicationInfo applicationInfo = this.zza.getApplicationInfo();
                    if (!(applicationInfo == null || (packageInfo = Wrappers.packageManager(context).getPackageInfo(applicationInfo.packageName, 0)) == null)) {
                        jSONObject.put("version", packageInfo.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    zze.zza("Error fetching PackageInfo.");
                }
                ListenableFuture zzb2 = zza3.zzb(jSONObject);
                ListenableFuture zzn = zzgch.zzn(zzb2, new zzd(this, l, zzdrw, zzfhk, zza2), zzbzw.zzg);
                if (runnable2 != null) {
                    zzb2.addListener(runnable2, zzbzw.zzg);
                }
                if (l2 != null) {
                    zzb2.addListener(new zze(this, zzdrw, l2), zzbzw.zzg);
                }
                if (((Boolean) zzbe.zzc().zza(zzbcl.zzhC)).booleanValue()) {
                    zzbzz.zzb(zzn, "ConfigLoader.maybeFetchNewAppSettings");
                } else {
                    zzbzz.zza(zzn, "ConfigLoader.maybeFetchNewAppSettings");
                }
            } catch (Exception e) {
                zzo.zzh("Error requesting application settings", e);
                zza2.zzh(e);
                zza2.zzg(false);
                zzfhk2.zzb(zza2.zzm());
            }
        } else {
            zzo.zzj("App settings could not be fetched. Required parameters missing");
        }
    }

    public final void zzc(Context context, VersionInfoParcel versionInfoParcel, String str, zzbzg zzbzg, zzfhk zzfhk) {
        zzb(context, versionInfoParcel, false, zzbzg, zzbzg != null ? zzbzg.zzb() : null, str, (Runnable) null, zzfhk, (zzdrw) null, (Long) null);
    }
}
