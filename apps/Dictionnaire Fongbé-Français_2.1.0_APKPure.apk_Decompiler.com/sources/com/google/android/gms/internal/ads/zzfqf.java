package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public abstract class zzfqf implements Closeable {
    public static zzfqr zza() {
        return new zzfqr();
    }

    public static zzfqr zzb(int i, zzfqq zzfqq) {
        return new zzfqr(new zzfqd(i), new zzfqe(), zzfqq);
    }

    public static zzfqr zzc(zzfvf<Integer> zzfvf, zzfvf<Integer> zzfvf2, zzfqq zzfqq) {
        return new zzfqr(zzfvf, zzfvf2, zzfqq);
    }

    static /* synthetic */ Integer zze() {
        return -1;
    }
}
