package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzqh implements zzpp {
    final /* synthetic */ zzqm zza;

    /* synthetic */ zzqh(zzqm zzqm, zzql zzql) {
        this.zza = zzqm;
    }

    public final void zza(long j) {
        zzdo.zzf("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j);
    }

    public final void zzb(long j) {
        zzqm zzqm = this.zza;
        if (zzqm.zzp != null) {
            ((zzqq) zzqm.zzp).zza.zzc.zzv(j);
        }
    }

    public final void zzc(long j, long j2, long j3, long j4) {
        zzqm zzqm = this.zza;
        long zzC = zzqm.zzL();
        long zzD = zzqm.zzM();
        zzdo.zzf("DefaultAudioSink", "Spurious audio timestamp (frame position mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + zzC + ", " + zzD);
    }

    public final void zzd(long j, long j2, long j3, long j4) {
        zzqm zzqm = this.zza;
        long zzC = zzqm.zzL();
        long zzD = zzqm.zzM();
        zzdo.zzf("DefaultAudioSink", "Spurious audio timestamp (system clock mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + zzC + ", " + zzD);
    }

    public final void zze(int i, long j) {
        zzqm zzqm = this.zza;
        if (zzqm.zzp != null) {
            ((zzqq) this.zza.zzp).zza.zzc.zzx(i, j, SystemClock.elapsedRealtime() - zzqm.zzV);
        }
    }
}
