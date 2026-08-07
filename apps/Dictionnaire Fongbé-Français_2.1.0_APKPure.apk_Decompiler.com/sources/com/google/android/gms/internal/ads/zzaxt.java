package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import androidx.work.impl.utils.ProcessUtils$$ExternalSyntheticApiModelOutline0;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzaxt implements PackageManager.OnChecksumsReadyListener {
    public final /* synthetic */ zzgdb zza;

    public /* synthetic */ zzaxt(zzgdb zzgdb) {
        this.zza = zzgdb;
    }

    public final void onChecksumsReady(List list) {
        zzgdb zzgdb = this.zza;
        if (list == null) {
            zzgdb.zzc((Object) null);
            return;
        }
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ApkChecksum m = ProcessUtils$$ExternalSyntheticApiModelOutline0.m(list.get(i));
                if (ProcessUtils$$ExternalSyntheticApiModelOutline0.m(m) == 8) {
                    zzgdb.zzc(zzawg.zzb(ProcessUtils$$ExternalSyntheticApiModelOutline0.m(m)));
                    return;
                }
            }
            zzgdb.zzc((Object) null);
        } catch (Throwable unused) {
            zzgdb.zzc((Object) null);
        }
    }
}
