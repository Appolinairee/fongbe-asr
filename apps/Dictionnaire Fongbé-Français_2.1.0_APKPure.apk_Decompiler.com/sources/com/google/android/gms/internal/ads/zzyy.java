package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.Executors;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzyy {
    public static final zzyr zza = new zzyr(2, -9223372036854775807L, (zzyx) null);
    public static final zzyr zzb = new zzyr(3, -9223372036854775807L, (zzyx) null);
    /* access modifiers changed from: private */
    public final zzzg zzc = zzze.zza(Executors.newSingleThreadExecutor(new zzeg("ExoPlayer:Loader:ProgressiveMediaPeriod")), new zzyp());
    /* access modifiers changed from: private */
    public zzys zzd;
    /* access modifiers changed from: private */
    public IOException zze;

    public zzyy(String str) {
    }

    public static zzyr zzb(boolean z, long j) {
        return new zzyr(z ? 1 : 0, j, (zzyx) null);
    }

    public final long zza(zzyt zzyt, zzyq zzyq, int i) {
        Looper myLooper = Looper.myLooper();
        zzcw.zzb(myLooper);
        Looper looper = myLooper;
        this.zze = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new zzys(this, myLooper, zzyt, zzyq, i, elapsedRealtime).zzc(0);
        return elapsedRealtime;
    }

    public final void zzg() {
        zzys zzys = this.zzd;
        zzcw.zzb(zzys);
        zzys zzys2 = zzys;
        zzys.zza(false);
    }

    public final void zzh() {
        this.zze = null;
    }

    public final void zzi(int i) throws IOException {
        IOException iOException = this.zze;
        if (iOException == null) {
            zzys zzys = this.zzd;
            if (zzys != null) {
                zzys.zzb(i);
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void zzj(zzyu zzyu) {
        zzys zzys = this.zzd;
        if (zzys != null) {
            zzys.zza(true);
        }
        this.zzc.execute(new zzyv(zzyu));
        this.zzc.zza();
    }

    public final boolean zzk() {
        return this.zze != null;
    }

    public final boolean zzl() {
        return this.zzd != null;
    }
}
