package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdrw {
    /* access modifiers changed from: private */
    public final zzdsb zza;
    /* access modifiers changed from: private */
    public final Executor zzb;
    /* access modifiers changed from: private */
    public final Map zzc;

    public zzdrw(zzdsb zzdsb, Executor executor) {
        this.zza = zzdsb;
        this.zzc = zzdsb.zza();
        this.zzb = executor;
    }

    public final zzdrv zza() {
        zzdrv zzdrv = new zzdrv(this);
        zzdrv unused = zzdrv.zzb.putAll(zzdrv.zza.zzc);
        return zzdrv;
    }

    public final void zze() {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzlw)).booleanValue()) {
            zzdrv zza2 = zza();
            zza2.zzb("action", "pecr");
            zza2.zzg();
        }
    }
}
