package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzbmq implements zzcgo {
    public final /* synthetic */ zzbmy zza;

    public /* synthetic */ zzbmq(zzbmy zzbmy) {
        this.zza = zzbmy;
    }

    public final void zza() {
        long currentTimeMillis = zzv.zzC().currentTimeMillis();
        zzbmy zzbmy = this.zza;
        long j = zzbmy.zzc;
        ArrayList arrayList = zzbmy.zzb;
        arrayList.add(Long.valueOf(currentTimeMillis - j));
        String valueOf = String.valueOf(arrayList.get(0));
        zze.zza("LoadNewJavascriptEngine(onEngLoaded) latency is " + valueOf + " ms.");
        zzs.zza.postDelayed(new zzbmz(zzbmy.zza, zzbmy.zzd, zzbmy.zze, arrayList, j), (long) ((Integer) zzbe.zzc().zza(zzbcl.zzb)).intValue());
    }
}
