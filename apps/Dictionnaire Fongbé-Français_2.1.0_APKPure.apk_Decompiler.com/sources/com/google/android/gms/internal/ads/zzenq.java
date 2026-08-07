package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ext.SdkExtensions;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;
import javax.annotation.Nullable;
import kotlin.time.DurationKt;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzenq implements zzetq {
    @Nullable
    private final Integer zza;

    private zzenq(@Nullable Integer num) {
        this.zza = num;
    }

    static /* bridge */ /* synthetic */ zzenq zzc(VersionInfoParcel versionInfoParcel) {
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzjT)).booleanValue()) {
            return new zzenq((Integer) null);
        }
        zzv.zzq();
        int i = 0;
        try {
            if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
                if (((Boolean) zzbe.zzc().zza(zzbcl.zzjW)).booleanValue()) {
                    if (versionInfoParcel.clientJarVersion >= ((Integer) zzbe.zzc().zza(zzbcl.zzjV)).intValue() && Build.VERSION.SDK_INT >= 31 && SdkExtensions.getExtensionVersion(31) >= 9) {
                        i = SdkExtensions.getExtensionVersion(31);
                    }
                }
                return new zzenq(Integer.valueOf(i));
            }
            i = SdkExtensions.getExtensionVersion(DurationKt.NANOS_IN_MILLIS);
            return new zzenq(Integer.valueOf(i));
        } catch (Exception e) {
            zzv.zzp().zzw(e, "AdUtil.getAdServicesExtensionVersion");
        }
    }

    public final /* synthetic */ void zza(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Integer num = this.zza;
        zzcuv zzcuv = (zzcuv) obj;
        if (num != null) {
            zzcuv.zza.putInt("aos", num.intValue());
        }
    }
}
