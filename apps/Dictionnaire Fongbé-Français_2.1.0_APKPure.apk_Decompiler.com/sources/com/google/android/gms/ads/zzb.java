package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.internal.ads.zzbpa;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzb {
    private static volatile zzci zza;

    private zzb() {
    }

    public static zzci zza(Context context) {
        if (zza == null) {
            synchronized (zzb.class) {
                if (zza == null) {
                    zza = zzbc.zza().zzg(context.getApplicationContext(), new zzbpa());
                }
            }
        }
        return zza;
    }
}
