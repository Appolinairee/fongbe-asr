package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzpl extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzab zzc;

    public zzpl(int i, zzab zzab, boolean z) {
        super("AudioTrack write failed: " + i);
        this.zzb = z;
        this.zza = i;
        this.zzc = zzab;
    }
}
