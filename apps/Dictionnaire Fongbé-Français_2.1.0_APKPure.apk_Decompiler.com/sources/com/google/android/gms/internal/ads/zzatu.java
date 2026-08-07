package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import androidx.work.impl.utils.ProcessUtils$$ExternalSyntheticApiModelOutline0;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzatu implements PackageManager.OnChecksumsReadyListener {
    final zzgdb zza = zzgdb.zze();

    public final void onChecksumsReady(List list) {
        if (list == null) {
            this.zza.zzc("");
            return;
        }
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ApkChecksum m = ProcessUtils$$ExternalSyntheticApiModelOutline0.m(list.get(i));
                if (ProcessUtils$$ExternalSyntheticApiModelOutline0.m(m) == 8) {
                    zzgdb zzgdb = this.zza;
                    zzgaa zzf = zzgaa.zzi().zzf();
                    byte[] m2 = ProcessUtils$$ExternalSyntheticApiModelOutline0.m(m);
                    zzgdb.zzc(zzf.zzj(m2, 0, m2.length));
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        this.zza.zzc("");
    }
}
