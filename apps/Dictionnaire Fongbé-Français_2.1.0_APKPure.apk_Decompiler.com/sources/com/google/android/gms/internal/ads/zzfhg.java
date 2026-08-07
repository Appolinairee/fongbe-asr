package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfhg {
    public static void zza(ListenableFuture listenableFuture, zzfhh zzfhh, zzfgw zzfgw) {
        zzg(listenableFuture, zzfhh, zzfgw, false);
    }

    public static void zzb(ListenableFuture listenableFuture, zzfhh zzfhh, zzfgw zzfgw) {
        zzg(listenableFuture, zzfhh, zzfgw, true);
    }

    public static void zzc(ListenableFuture listenableFuture, zzfhh zzfhh, zzfgw zzfgw) {
        if (((Boolean) zzbee.zzc.zze()).booleanValue()) {
            zzgch.zzr(zzgby.zzu(listenableFuture), new zzfhf(zzfhh, zzfgw), zzbzw.zzg);
        }
    }

    public static void zzd(ListenableFuture listenableFuture, zzfgw zzfgw) {
        if (((Boolean) zzbee.zzc.zze()).booleanValue()) {
            zzgch.zzr(zzgby.zzu(listenableFuture), new zzfhd(zzfgw), zzbzw.zzg);
        }
    }

    public static boolean zze(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) zzbe.zzc().zza(zzbcl.zziH), str);
    }

    public static int zzf(zzfcj zzfcj) {
        int zzf = zzaa.zzf(zzfcj) - 1;
        return (zzf == 0 || zzf == 1) ? 7 : 23;
    }

    private static void zzg(ListenableFuture listenableFuture, zzfhh zzfhh, zzfgw zzfgw, boolean z) {
        if (((Boolean) zzbee.zzc.zze()).booleanValue()) {
            zzgch.zzr(zzgby.zzu(listenableFuture), new zzfhe(zzfhh, zzfgw, z), zzbzw.zzg);
        }
    }
}
