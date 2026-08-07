package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzdrw;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zza {
    public static final boolean zza(Context context, Intent intent, zzac zzac, zzaa zzaa, boolean z, zzdrw zzdrw, String str) {
        if (z) {
            return zzc(context, intent.getData(), zzac, zzaa);
        }
        try {
            String uri = intent.toURI();
            zze.zza("Launching an intent: " + uri);
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzmU)).booleanValue()) {
                zzv.zzq();
                zzs.zzX(context, intent, zzdrw, str);
            } else {
                zzv.zzq();
                zzs.zzT(context, intent);
            }
            if (zzac != null) {
                zzac.zzg();
            }
            if (zzaa != null) {
                zzaa.zza(true);
            }
            return true;
        } catch (ActivityNotFoundException e) {
            zzo.zzj(e.getMessage());
            if (zzaa != null) {
                zzaa.zza(false);
            }
            return false;
        }
    }

    public static final boolean zzb(Context context, zzc zzc, zzac zzac, zzaa zzaa, zzdrw zzdrw, String str) {
        int i = 0;
        if (zzc == null) {
            zzo.zzj("No intent data for launcher overlay.");
            return false;
        }
        zzbcl.zza(context);
        Intent intent = zzc.zzh;
        if (intent != null) {
            return zza(context, intent, zzac, zzaa, zzc.zzj, zzdrw, str);
        }
        Intent intent2 = new Intent();
        if (TextUtils.isEmpty(zzc.zzb)) {
            zzo.zzj("Open GMSG did not contain a URL.");
            return false;
        }
        if (!TextUtils.isEmpty(zzc.zzc)) {
            String str2 = zzc.zzb;
            intent2.setDataAndType(Uri.parse(str2), zzc.zzc);
        } else {
            intent2.setData(Uri.parse(zzc.zzb));
        }
        intent2.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(zzc.zzd)) {
            intent2.setPackage(zzc.zzd);
        }
        if (!TextUtils.isEmpty(zzc.zze)) {
            String[] split = zzc.zze.split("/", 2);
            if (split.length < 2) {
                zzo.zzj("Could not parse component name from open GMSG: ".concat(String.valueOf(zzc.zze)));
                return false;
            }
            intent2.setClassName(split[0], split[1]);
        }
        String str3 = zzc.zzf;
        if (!TextUtils.isEmpty(str3)) {
            try {
                i = Integer.parseInt(str3);
            } catch (NumberFormatException unused) {
                zzo.zzj("Could not parse intent flags.");
            }
            intent2.addFlags(i);
        }
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzeD)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzeC)).booleanValue()) {
                zzv.zzq();
                zzs.zzp(context, intent2);
            }
        }
        return zza(context, intent2, zzac, zzaa, zzc.zzj, zzdrw, str);
    }

    private static final boolean zzc(Context context, Uri uri, zzac zzac, zzaa zzaa) {
        int i;
        try {
            i = zzv.zzq().zzn(context, uri);
            if (zzac != null) {
                zzac.zzg();
            }
        } catch (ActivityNotFoundException e) {
            zzo.zzj(e.getMessage());
            i = 6;
        }
        if (zzaa != null) {
            zzaa.zzb(i);
        }
        return i == 5;
    }
}
