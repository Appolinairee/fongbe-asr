package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public class zzeq {
    public final int zzd;

    /* synthetic */ zzeq(int i, zzep zzep) {
        this.zzd = i;
    }

    public static String zze(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) ((i >> 24) & 255));
        sb.append((char) ((i >> 16) & 255));
        sb.append((char) ((i >> 8) & 255));
        sb.append((char) (i & 255));
        return sb.toString();
    }

    public String toString() {
        return zze(this.zzd);
    }
}
