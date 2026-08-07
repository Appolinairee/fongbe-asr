package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzawl implements AppOpsManager.OnOpActiveChangedListener {
    final /* synthetic */ zzawm zza;

    zzawl(zzawm zzawm) {
        this.zza = zzawm;
    }

    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        if (z) {
            this.zza.zzb = System.currentTimeMillis();
            this.zza.zze = true;
            return;
        }
        zzawm zzawm = this.zza;
        long currentTimeMillis = System.currentTimeMillis();
        if (zzawm.zzc > 0) {
            zzawm zzawm2 = this.zza;
            if (currentTimeMillis >= zzawm2.zzc) {
                zzawm2.zzd = currentTimeMillis - zzawm2.zzc;
            }
        }
        this.zza.zze = false;
    }
}
