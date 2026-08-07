package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfnt {
    private final Context zza;
    private final Looper zzb;

    public zzfnt(Context context, Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(String str) {
        zzfog zza2 = zzfoj.zza();
        zza2.zza(this.zza.getPackageName());
        zza2.zzc(2);
        zzfod zza3 = zzfof.zza();
        zza3.zza(str);
        zza3.zzb(2);
        zza2.zzb(zza3);
        new zzfnu(this.zza, this.zzb, (zzfoj) zza2.zzbr()).zza();
    }
}
