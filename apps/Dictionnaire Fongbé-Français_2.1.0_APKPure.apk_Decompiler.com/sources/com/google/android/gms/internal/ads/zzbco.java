package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbco {
    private final String zza = ((String) zzbef.zza.zze());
    private final Map zzb;
    private final Context zzc;
    private final String zzd;

    public zzbco(Context context, String str) {
        String str2;
        this.zzc = context;
        this.zzd = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        zzv.zzq();
        linkedHashMap.put("device", zzs.zzs());
        if (context.getApplicationContext() != null) {
            str2 = context.getApplicationContext().getPackageName();
        } else {
            str2 = context.getPackageName();
        }
        linkedHashMap.put("app", str2);
        zzv.zzq();
        String str3 = "0";
        linkedHashMap.put("is_lite_sdk", true != zzs.zzF(context) ? str3 : "1");
        Future zzb2 = zzv.zzn().zzb(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((zzbvo) zzb2.get()).zzj));
            linkedHashMap.put("network_fine", Integer.toString(((zzbvo) zzb2.get()).zzk));
        } catch (Exception e) {
            zzv.zzp().zzw(e, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzli)).booleanValue()) {
            Map map = this.zzb;
            zzv.zzq();
            map.put("is_bstar", true == zzs.zzC(context) ? "1" : str3);
        }
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzjn)).booleanValue()) {
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzct)).booleanValue() && !zzfve.zzd(zzv.zzp().zzn())) {
                this.zzb.put("plugin", zzv.zzp().zzn());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final Context zza() {
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    public final String zzb() {
        return this.zzd;
    }

    /* access modifiers changed from: package-private */
    public final String zzc() {
        return this.zza;
    }

    /* access modifiers changed from: package-private */
    public final Map zzd() {
        return this.zzb;
    }
}
