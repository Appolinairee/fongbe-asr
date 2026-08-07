package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdj implements Runnable {
    public final /* synthetic */ CopyOnWriteArraySet zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ zzdk zzc;

    public /* synthetic */ zzdj(CopyOnWriteArraySet copyOnWriteArraySet, int i, zzdk zzdk) {
        this.zza = copyOnWriteArraySet;
        this.zzb = i;
        this.zzc = zzdk;
    }

    public final void run() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzdk zzdk = this.zzc;
            ((zzdm) it.next()).zza(this.zzb, zzdk);
        }
    }
}
