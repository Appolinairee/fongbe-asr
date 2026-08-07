package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.utils.ProcessUtils$$ExternalSyntheticApiModelOutline0;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzese implements zzetr {
    private final ApplicationInfo zza;
    private final PackageInfo zzb;
    private final Context zzc;

    zzese(ApplicationInfo applicationInfo, PackageInfo packageInfo, Context context) {
        this.zza = applicationInfo;
        this.zzb = packageInfo;
        this.zzc = context;
    }

    public final int zza() {
        return 29;
    }

    public final ListenableFuture zzb() {
        Integer num;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        PackageManager.NameNotFoundException e;
        String str6 = this.zza.packageName;
        PackageInfo packageInfo = this.zzb;
        if (packageInfo == null) {
            num = null;
        } else {
            num = Integer.valueOf(packageInfo.versionCode);
        }
        PackageInfo packageInfo2 = this.zzb;
        if (packageInfo2 == null) {
            str = null;
        } else {
            str = packageInfo2.versionName;
        }
        try {
            Context context = this.zzc;
            zzfqw zzfqw = zzs.zza;
            str2 = String.valueOf(Wrappers.packageManager(context).getApplicationLabel(str6));
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = null;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzmD)).booleanValue()) {
                try {
                    InstallSourceInfo m = ProcessUtils$$ExternalSyntheticApiModelOutline0.m(this.zzc.getPackageManager(), str6);
                    if (m != null) {
                        str4 = m.getInstallingPackageName();
                        try {
                            if (TextUtils.isEmpty(str4)) {
                                zze.zza("No installing package name found");
                                str4 = null;
                            }
                            str5 = m.getInitiatingPackageName();
                            try {
                                if (TextUtils.isEmpty(str5)) {
                                    zze.zza("No initiating package name found");
                                    str3 = null;
                                    return zzgch.zzh(new zzesf(str6, num, str, str2, str4, str3));
                                }
                            } catch (PackageManager.NameNotFoundException e2) {
                                e = e2;
                                zzv.zzp().zzw(e, "PackageInfoSignalSource.getInstallSourceInfo");
                                str3 = str5;
                                return zzgch.zzh(new zzesf(str6, num, str, str2, str4, str3));
                            }
                        } catch (PackageManager.NameNotFoundException e3) {
                            e = e3;
                            str5 = null;
                            zzv.zzp().zzw(e, "PackageInfoSignalSource.getInstallSourceInfo");
                            str3 = str5;
                            return zzgch.zzh(new zzesf(str6, num, str, str2, str4, str3));
                        }
                        str3 = str5;
                        return zzgch.zzh(new zzesf(str6, num, str, str2, str4, str3));
                    }
                } catch (PackageManager.NameNotFoundException e4) {
                    str4 = null;
                    e = e4;
                    str5 = null;
                    zzv.zzp().zzw(e, "PackageInfoSignalSource.getInstallSourceInfo");
                    str3 = str5;
                    return zzgch.zzh(new zzesf(str6, num, str, str2, str4, str3));
                }
            }
        }
        str4 = null;
        str3 = null;
        return zzgch.zzh(new zzesf(str6, num, str, str2, str4, str3));
    }
}
