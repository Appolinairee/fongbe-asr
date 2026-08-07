package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzrn implements zzsd {
    private final MediaCodec zza;
    private final zzrt zzb;
    private final zzse zzc;
    private final zzrz zzd;
    private boolean zze;
    private int zzf = 0;

    /* synthetic */ zzrn(MediaCodec mediaCodec, HandlerThread handlerThread, zzse zzse, zzrz zzrz, zzrm zzrm) {
        this.zza = mediaCodec;
        this.zzb = new zzrt(handlerThread);
        this.zzc = zzse;
        this.zzd = zzrz;
    }

    static /* bridge */ /* synthetic */ void zzh(zzrn zzrn, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        zzrz zzrz;
        zzrn.zzb.zzf(zzrn.zza);
        Trace.beginSection("configureCodec");
        zzrn.zza.configure(mediaFormat, surface, (MediaCrypto) null, i);
        Trace.endSection();
        zzrn.zzc.zzh();
        Trace.beginSection("startCodec");
        zzrn.zza.start();
        Trace.endSection();
        if (zzei.zza >= 35 && (zzrz = zzrn.zzd) != null) {
            zzrz.zza(zzrn.zza);
        }
        zzrn.zzf = 1;
    }

    /* access modifiers changed from: private */
    public static String zzt(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    public final int zza() {
        this.zzc.zzc();
        return this.zzb.zza();
    }

    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        this.zzc.zzc();
        return this.zzb.zzb(bufferInfo);
    }

    public final MediaFormat zzc() {
        return this.zzb.zzc();
    }

    public final ByteBuffer zzf(int i) {
        return this.zza.getInputBuffer(i);
    }

    public final ByteBuffer zzg(int i) {
        return this.zza.getOutputBuffer(i);
    }

    public final void zzi() {
        this.zza.detachOutputSurface();
    }

    public final void zzj() {
        this.zzc.zzb();
        this.zza.flush();
        this.zzb.zze();
        this.zza.start();
    }

    public final void zzk(int i, int i2, int i3, long j, int i4) {
        this.zzc.zzd(i, 0, i3, j, i4);
    }

    public final void zzl(int i, int i2, zzhe zzhe, long j, int i3) {
        this.zzc.zze(i, 0, zzhe, j, 0);
    }

    public final void zzm() {
        zzrz zzrz;
        zzrz zzrz2;
        zzrz zzrz3;
        try {
            if (this.zzf == 1) {
                this.zzc.zzg();
                this.zzb.zzh();
            }
            this.zzf = 2;
            if (!this.zze) {
                if (zzei.zza >= 30 && zzei.zza < 33) {
                    this.zza.stop();
                }
                if (zzei.zza >= 35 && (zzrz3 = this.zzd) != null) {
                    zzrz3.zzc(this.zza);
                }
                this.zza.release();
                this.zze = true;
            }
        } catch (Throwable th) {
            if (zzei.zza >= 35 && (zzrz2 = this.zzd) != null) {
                zzrz2.zzc(this.zza);
            }
            this.zza.release();
            this.zze = true;
            throw th;
        }
    }

    public final void zzn(int i, long j) {
        this.zza.releaseOutputBuffer(i, j);
    }

    public final void zzo(int i, boolean z) {
        this.zza.releaseOutputBuffer(i, false);
    }

    public final void zzp(Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    public final void zzq(Bundle bundle) {
        this.zzc.zzf(bundle);
    }

    public final void zzr(int i) {
        this.zza.setVideoScalingMode(i);
    }

    public final boolean zzs(zzsc zzsc) {
        this.zzb.zzg(zzsc);
        return true;
    }
}
