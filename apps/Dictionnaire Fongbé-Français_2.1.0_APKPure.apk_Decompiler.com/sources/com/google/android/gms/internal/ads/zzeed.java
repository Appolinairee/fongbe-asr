package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzeb;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzeed implements zzcqx {
    public final /* synthetic */ zzecz zza;

    public /* synthetic */ zzeed(zzecz zzecz) {
        this.zza = zzecz;
    }

    public final zzeb zza() {
        try {
            return ((zzbrd) this.zza.zzb).zze();
        } catch (RemoteException e) {
            throw new zzfcq(e);
        }
    }
}
