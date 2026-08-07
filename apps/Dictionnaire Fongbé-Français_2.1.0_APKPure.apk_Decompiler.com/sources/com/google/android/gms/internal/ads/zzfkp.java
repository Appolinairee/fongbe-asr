package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public abstract class zzfkp {
    public static zzfkp zza(zzfkq zzfkq, zzfkr zzfkr) {
        zzfmk.zza();
        return new zzfkt(zzfkq, zzfkr, UUID.randomUUID().toString());
    }

    public abstract void zzb(View view, zzfkw zzfkw, String str);

    public abstract void zzc();

    public abstract void zzd(View view);

    public abstract void zze();
}
