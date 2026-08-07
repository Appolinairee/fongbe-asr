package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.Context;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
public abstract class zza {
    private static zza zza;

    public static zza zza(Context context) {
        zza zza2;
        synchronized (zza.class) {
            if (zza == null) {
                zzag zzag = new zzag((zzaj) null);
                zzag.zzb((Application) context.getApplicationContext());
                zza = zzag.zza();
            }
            zza2 = zza;
        }
        return zza2;
    }

    public abstract zzj zzb();

    public abstract zzbk zzc();
}
