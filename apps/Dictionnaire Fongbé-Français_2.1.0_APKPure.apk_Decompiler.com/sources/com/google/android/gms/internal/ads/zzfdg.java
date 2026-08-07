package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfdg {
    public static void zza(Context context, boolean z) {
        if (z) {
            zzo.zzi("This request is sent from a test device.");
            return;
        }
        zzbc.zzb();
        String zzy = zzf.zzy(context);
        zzo.zzi("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + zzy + "\")) to get test ads on this device.");
    }

    public static void zzb(int i, Throwable th, String str) {
        zzo.zzi("Ad failed to load : " + i);
        zze.zzb(str, th);
        if (i != 3) {
            zzv.zzp().zzv(th, str);
        }
    }
}
