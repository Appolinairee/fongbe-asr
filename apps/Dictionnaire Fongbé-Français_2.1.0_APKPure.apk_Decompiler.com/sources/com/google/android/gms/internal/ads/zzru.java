package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzru extends zzhh {
    private long zzg;
    private int zzh;
    private int zzi = 32;

    public zzru() {
        super(2, 0);
    }

    public final void zzb() {
        super.zzb();
        this.zzh = 0;
    }

    public final int zzm() {
        return this.zzh;
    }

    public final long zzn() {
        return this.zzg;
    }

    public final void zzo(int i) {
        this.zzi = i;
    }

    public final boolean zzp(zzhh zzhh) {
        ByteBuffer byteBuffer;
        zzcw.zzd(!zzhh.zzd(1073741824));
        zzcw.zzd(!zzhh.zzd(268435456));
        zzcw.zzd(!zzhh.zzd(4));
        if (zzq()) {
            if (this.zzh >= this.zzi) {
                return false;
            }
            ByteBuffer byteBuffer2 = zzhh.zzc;
            if (!(byteBuffer2 == null || (byteBuffer = this.zzc) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000)) {
                return false;
            }
        }
        int i = this.zzh;
        this.zzh = i + 1;
        if (i == 0) {
            this.zze = zzhh.zze;
            if (zzhh.zzd(1)) {
                zzc(1);
            }
        }
        ByteBuffer byteBuffer3 = zzhh.zzc;
        if (byteBuffer3 != null) {
            zzj(byteBuffer3.remaining());
            this.zzc.put(byteBuffer3);
        }
        this.zzg = zzhh.zze;
        return true;
    }

    public final boolean zzq() {
        return this.zzh > 0;
    }
}
