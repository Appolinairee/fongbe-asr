package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdbh implements Runnable {
    public final /* synthetic */ zzdbi zza;
    public final /* synthetic */ Object zzb;

    public /* synthetic */ zzdbh(zzdbi zzdbi, Object obj) {
        this.zza = zzdbi;
        this.zzb = obj;
    }

    public final void run() {
        try {
            this.zza.zza(this.zzb);
        } catch (Throwable th) {
            zzv.zzp().zzv(th, "EventEmitter.notify");
            zze.zzb("Event emitter exception.", th);
        }
    }
}
