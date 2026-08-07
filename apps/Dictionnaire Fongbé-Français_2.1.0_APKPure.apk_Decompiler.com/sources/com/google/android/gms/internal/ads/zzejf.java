package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzejf {
    private final ConcurrentHashMap zza = new ConcurrentHashMap();
    private final zzdpm zzb;

    public zzejf(zzdpm zzdpm) {
        this.zzb = zzdpm;
    }

    @CheckForNull
    public final zzbrd zza(String str) {
        if (this.zza.containsKey(str)) {
            return (zzbrd) this.zza.get(str);
        }
        return null;
    }

    public final void zzb(String str) {
        try {
            this.zza.put(str, this.zzb.zzb(str));
        } catch (RemoteException e) {
            zze.zzb("Couldn't create RTB adapter : ", e);
        }
    }
}
