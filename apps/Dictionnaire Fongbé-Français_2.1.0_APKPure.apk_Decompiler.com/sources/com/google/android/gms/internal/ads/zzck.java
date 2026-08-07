package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzck implements zzch {
    private int zzb;
    private float zzc = 1.0f;
    private float zzd = 1.0f;
    private zzcf zze = zzcf.zza;
    private zzcf zzf;
    private zzcf zzg;
    private zzcf zzh;
    private boolean zzi;
    private zzcj zzj;
    private ByteBuffer zzk;
    private ShortBuffer zzl;
    private ByteBuffer zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;

    public zzck() {
        zzcf zzcf = zzcf.zza;
        this.zzf = zzcf;
        this.zzg = zzcf;
        this.zzh = zzcf;
        ByteBuffer byteBuffer = zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = zza;
        this.zzb = -1;
    }

    public final zzcf zza(zzcf zzcf) throws zzcg {
        if (zzcf.zzd == 2) {
            int i = this.zzb;
            if (i == -1) {
                i = zzcf.zzb;
            }
            this.zze = zzcf;
            zzcf zzcf2 = new zzcf(i, zzcf.zzc, 2);
            this.zzf = zzcf2;
            this.zzi = true;
            return zzcf2;
        }
        throw new zzcg("Unhandled input format:", zzcf);
    }

    public final ByteBuffer zzb() {
        int zza;
        zzcj zzcj = this.zzj;
        if (zzcj != null && (zza = zzcj.zza()) > 0) {
            if (this.zzk.capacity() < zza) {
                ByteBuffer order = ByteBuffer.allocateDirect(zza).order(ByteOrder.nativeOrder());
                this.zzk = order;
                this.zzl = order.asShortBuffer();
            } else {
                this.zzk.clear();
                this.zzl.clear();
            }
            zzcj.zzd(this.zzl);
            this.zzo += (long) zza;
            this.zzk.limit(zza);
            this.zzm = this.zzk;
        }
        ByteBuffer byteBuffer = this.zzm;
        this.zzm = zza;
        return byteBuffer;
    }

    public final void zzc() {
        if (zzg()) {
            zzcf zzcf = this.zze;
            this.zzg = zzcf;
            this.zzh = this.zzf;
            if (this.zzi) {
                this.zzj = new zzcj(zzcf.zzb, zzcf.zzc, this.zzc, this.zzd, this.zzh.zzb);
            } else {
                zzcj zzcj = this.zzj;
                if (zzcj != null) {
                    zzcj.zzc();
                }
            }
        }
        this.zzm = zza;
        this.zzn = 0;
        this.zzo = 0;
        this.zzp = false;
    }

    public final void zzd() {
        zzcj zzcj = this.zzj;
        if (zzcj != null) {
            zzcj.zze();
        }
        this.zzp = true;
    }

    public final void zze(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            zzcj zzcj = this.zzj;
            zzcj.getClass();
            zzcj zzcj2 = zzcj;
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.zzn += (long) remaining;
            zzcj.zzf(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    public final void zzf() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        this.zze = zzcf.zza;
        zzcf zzcf = zzcf.zza;
        this.zzf = zzcf;
        this.zzg = zzcf;
        this.zzh = zzcf;
        ByteBuffer byteBuffer = zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = zza;
        this.zzb = -1;
        this.zzi = false;
        this.zzj = null;
        this.zzn = 0;
        this.zzo = 0;
        this.zzp = false;
    }

    public final boolean zzg() {
        if (this.zzf.zzb == -1) {
            return false;
        }
        if (Math.abs(this.zzc - 4.0f) >= 1.0E-4f || Math.abs(this.zzd - 4.0f) >= 1.0E-4f || this.zzf.zzb != this.zze.zzb) {
            return true;
        }
        return false;
    }

    public final boolean zzh() {
        if (!this.zzp) {
            return false;
        }
        zzcj zzcj = this.zzj;
        return zzcj == null || zzcj.zza() == 0;
    }

    public final long zzi(long j) {
        long j2 = this.zzo;
        if (j2 < 1024) {
            return (long) (((double) this.zzc) * ((double) j));
        }
        long j3 = this.zzn;
        zzcj zzcj = this.zzj;
        zzcj.getClass();
        zzcj zzcj2 = zzcj;
        long zzb2 = j3 - ((long) zzcj.zzb());
        int i = this.zzh.zzb;
        int i2 = this.zzg.zzb;
        if (i == i2) {
            return zzei.zzu(j, zzb2, j2, RoundingMode.DOWN);
        }
        return zzei.zzu(j, zzb2 * ((long) i), j2 * ((long) i2), RoundingMode.DOWN);
    }

    public final void zzj(float f) {
        if (this.zzd != f) {
            this.zzd = f;
            this.zzi = true;
        }
    }

    public final void zzk(float f) {
        if (this.zzc != f) {
            this.zzc = f;
            this.zzi = true;
        }
    }
}
