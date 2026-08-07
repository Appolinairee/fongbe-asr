package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzgan {
    public static char zza(long j) {
        char c = (char) ((int) j);
        zzfun.zzh(((long) c) == j, "Out of range: %s", j);
        return c;
    }

    public static char zzb(byte b, byte b2) {
        return (char) ((b << 8) | (b2 & 255));
    }
}
