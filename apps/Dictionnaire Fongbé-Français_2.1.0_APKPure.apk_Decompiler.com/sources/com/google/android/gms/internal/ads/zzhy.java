package com.google.android.gms.internal.ads;

import androidx.lifecycle.CoroutineLiveDataKt;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzhy implements zzkg {
    private final zzyk zza;
    private final long zzb = zzei.zzs(50000);
    private final long zzc = zzei.zzs(50000);
    private final long zzd = zzei.zzs(2500);
    private final long zze = zzei.zzs(CoroutineLiveDataKt.DEFAULT_TIMEOUT);
    private final long zzf = zzei.zzs(0);
    private final HashMap zzg = new HashMap();
    private long zzh = -1;

    public zzhy() {
        zzyk zzyk = new zzyk(true, 65536);
        zzl(2500, 0, "bufferForPlaybackMs", "0");
        zzl(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        zzl(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        zzl(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzl(50000, 50000, "maxBufferMs", "minBufferMs");
        zzl(0, 0, "backBufferDurationMs", "0");
        this.zza = zzyk;
    }

    private static void zzl(int i, int i2, String str, String str2) {
        zzcw.zze(i >= i2, str + " cannot be less than " + str2);
    }

    private final void zzm(zzog zzog) {
        if (this.zzg.remove(zzog) != null) {
            zzn();
        }
    }

    private final void zzn() {
        if (this.zzg.isEmpty()) {
            this.zza.zze();
        } else {
            this.zza.zzf(zza());
        }
    }

    /* access modifiers changed from: package-private */
    public final int zza() {
        int i = 0;
        for (zzhw zzhw : this.zzg.values()) {
            i += zzhw.zzb;
        }
        return i;
    }

    public final long zzb(zzog zzog) {
        return this.zzf;
    }

    public final void zzc(zzog zzog) {
        long id = Thread.currentThread().getId();
        long j = this.zzh;
        boolean z = true;
        if (!(j == -1 || j == id)) {
            z = false;
        }
        zzcw.zzg(z, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.zzh = id;
        if (!this.zzg.containsKey(zzog)) {
            this.zzg.put(zzog, new zzhw((zzhx) null));
        }
        zzhw zzhw = (zzhw) this.zzg.get(zzog);
        zzhw.getClass();
        zzhw zzhw2 = zzhw;
        zzhw.zzb = 13107200;
        zzhw.zza = false;
    }

    public final void zzd(zzog zzog) {
        zzm(zzog);
        if (this.zzg.isEmpty()) {
            this.zzh = -1;
        }
    }

    public final void zze(zzog zzog) {
        zzm(zzog);
    }

    public final void zzf(zzkf zzkf, zzwj zzwj, zzxv[] zzxvArr) {
        zzhw zzhw = (zzhw) this.zzg.get(zzkf.zza);
        zzhw.getClass();
        zzhw zzhw2 = zzhw;
        int length = zzxvArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 13107200;
            if (i < length) {
                zzxv zzxv = zzxvArr[i];
                if (zzxv != null) {
                    switch (zzxv.zzg().zzc) {
                        case -1:
                        case 1:
                            break;
                        case 0:
                            i3 = 144310272;
                            break;
                        case 2:
                            i3 = 131072000;
                            break;
                        default:
                            i3 = 131072;
                            break;
                    }
                    i2 += i3;
                }
                i++;
            } else {
                zzhw.zzb = Math.max(13107200, i2);
                zzn();
                return;
            }
        }
    }

    public final boolean zzg(zzog zzog) {
        return false;
    }

    public final boolean zzh(zzkf zzkf) {
        zzhw zzhw = (zzhw) this.zzg.get(zzkf.zza);
        zzhw.getClass();
        zzhw zzhw2 = zzhw;
        int zza2 = this.zza.zza();
        int zza3 = zza();
        long j = this.zzb;
        float f = zzkf.zzc;
        if (f > 1.0f) {
            j = Math.min(zzei.zzq(j, f), this.zzc);
        }
        long j2 = zzkf.zzb;
        boolean z = false;
        if (j2 < Math.max(j, 500000)) {
            if (zza2 < zza3) {
                z = true;
            }
            zzhw.zza = z;
            if (!z && j2 < 500000) {
                zzdo.zzf("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.zzc || zza2 >= zza3) {
            zzhw.zza = false;
        }
        return zzhw.zza;
    }

    public final boolean zzi(zzbq zzbq, zzug zzug, long j) {
        for (zzhw zzhw : this.zzg.values()) {
            if (zzhw.zza) {
                return false;
            }
        }
        return true;
    }

    public final boolean zzj(zzkf zzkf) {
        long j;
        boolean z = zzkf.zzd;
        long zzr = zzei.zzr(zzkf.zzb, zzkf.zzc);
        if (z) {
            j = this.zze;
        } else {
            j = this.zzd;
        }
        long j2 = zzkf.zze;
        if (j2 != -9223372036854775807L) {
            j = Math.min(j2 / 2, j);
        }
        return j <= 0 || zzr >= j || this.zza.zza() >= zza();
    }

    public final zzyk zzk() {
        return this.zza;
    }
}
