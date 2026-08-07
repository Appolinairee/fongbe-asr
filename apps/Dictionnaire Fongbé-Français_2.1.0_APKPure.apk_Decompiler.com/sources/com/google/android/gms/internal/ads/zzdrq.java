package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdrq {
    private final ConcurrentHashMap zza;
    private final zzbzq zzb;
    private final zzfcj zzc;
    private final String zzd;
    private final String zze;
    private final zzk zzf;
    private final Bundle zzg = new Bundle();
    private final Context zzh;

    public zzdrq(Context context, zzdsb zzdsb, zzbzq zzbzq, zzfcj zzfcj, String str, String str2, zzk zzk) {
        ActivityManager.MemoryInfo zzc2;
        String str3;
        ConcurrentHashMap zzc3 = zzdsb.zzc();
        this.zza = zzc3;
        this.zzb = zzbzq;
        this.zzc = zzfcj;
        this.zzd = str;
        this.zze = str2;
        this.zzf = zzk;
        this.zzh = context;
        zzc3.put("ad_format", str2.toUpperCase(Locale.ROOT));
        String str4 = "1";
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzjs)).booleanValue()) {
            int zzp = zzk.zzp();
            int i = zzp - 1;
            if (zzp != 0) {
                if (i != 0) {
                    str3 = i != 1 ? "na" : "2";
                } else {
                    str3 = str4;
                }
                zzc3.put("asv", str3);
            } else {
                throw null;
            }
        }
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzck)).booleanValue()) {
            Runtime runtime = Runtime.getRuntime();
            zzc("rt_f", String.valueOf(runtime.freeMemory()));
            zzc("rt_m", String.valueOf(runtime.maxMemory()));
            zzc("rt_t", String.valueOf(runtime.totalMemory()));
            zzc("wv_c", String.valueOf(zzv.zzp().zzb()));
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzcp)).booleanValue() && (zzc2 = zzf.zzc(context)) != null) {
                zzc("mem_avl", String.valueOf(zzc2.availMem));
                zzc("mem_tt", String.valueOf(zzc2.totalMem));
                zzc("low_m", true != zzc2.lowMemory ? "0" : str4);
            }
        }
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzgM)).booleanValue()) {
            int zzf2 = zzaa.zzf(zzfcj) - 1;
            if (zzf2 != 0) {
                if (zzf2 == 1) {
                    zzc3.put("request_id", str);
                    zzc3.put("se", "query_g");
                } else if (zzf2 == 2) {
                    zzc3.put("se", "r_adinfo");
                } else if (zzf2 != 3) {
                    zzc3.put("se", "r_both");
                } else {
                    zzc3.put("se", "r_adstring");
                }
                zzc3.put("scar", "true");
                zzc("ragent", zzfcj.zzd.zzp);
                zzc("rtype", zzaa.zzb(zzaa.zzc(zzfcj.zzd)));
                return;
            }
            zzc3.put("request_id", str);
            zzc3.put("scar", "false");
        }
    }

    public final Bundle zza() {
        return this.zzg;
    }

    public final Map zzb() {
        return this.zza;
    }

    public final void zzc(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.zza.put(str, str2);
        }
    }

    public final void zzd(zzfca zzfca) {
        String str;
        if (!zzfca.zzb.zza.isEmpty()) {
            zzfbo zzfbo = (zzfbo) zzfca.zzb.zza.get(0);
            zzc("ad_format", zzfbo.zza(zzfbo.zzb));
            if (zzfbo.zzb == 6) {
                ConcurrentHashMap concurrentHashMap = this.zza;
                if (true != this.zzb.zzm()) {
                    str = "0";
                } else {
                    str = "1";
                }
                concurrentHashMap.put("as", str);
            }
        }
        zzc("gqi", zzfca.zzb.zzb.zzb);
    }

    public final void zze(Bundle bundle) {
        if (bundle != null) {
            if (bundle.containsKey("cnt")) {
                zzc("network_coarse", Integer.toString(bundle.getInt("cnt")));
            }
            if (bundle.containsKey("gnt")) {
                zzc("network_fine", Integer.toString(bundle.getInt("gnt")));
            }
        }
    }
}
