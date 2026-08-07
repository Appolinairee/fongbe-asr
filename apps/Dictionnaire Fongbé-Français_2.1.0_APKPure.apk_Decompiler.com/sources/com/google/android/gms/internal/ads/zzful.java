package com.google.android.gms.internal.ads;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public abstract class zzful implements Serializable {
    zzful() {
    }

    public static zzful zzc() {
        return zzftr.zza;
    }

    public static zzful zzd(@CheckForNull Object obj) {
        return obj == null ? zzftr.zza : new zzfus(obj);
    }

    public abstract zzful zza(zzfuc zzfuc);

    public abstract Object zzb(Object obj);
}
