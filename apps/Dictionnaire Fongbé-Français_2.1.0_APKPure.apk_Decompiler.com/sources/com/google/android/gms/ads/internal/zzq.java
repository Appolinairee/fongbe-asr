package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzaux;
import com.google.android.gms.internal.ads.zzauz;
import com.google.android.gms.internal.ads.zzava;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzq implements Callable {
    final /* synthetic */ zzu zza;

    zzq(zzu zzu) {
        this.zza = zzu;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzu zzu = this.zza;
        return new zzava(zzauz.zzu(zzu.zzd, new zzaux(zzu.zza.afmaVersion, false)));
    }
}
