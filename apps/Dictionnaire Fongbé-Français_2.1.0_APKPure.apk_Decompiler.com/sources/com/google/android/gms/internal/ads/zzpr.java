package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzpr extends zzci {
    private int[] zzd;
    private int[] zze;

    zzpr() {
    }

    public final void zze(ByteBuffer byteBuffer) {
        int[] iArr = this.zze;
        iArr.getClass();
        int[] iArr2 = iArr;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer zzj = zzj(((limit - position) / this.zzb.zze) * this.zzc.zze);
        while (position < limit) {
            for (int i : iArr2) {
                zzj.putShort(byteBuffer.getShort(i + i + position));
            }
            position += this.zzb.zze;
        }
        byteBuffer.position(limit);
        zzj.flip();
    }

    public final zzcf zzi(zzcf zzcf) throws zzcg {
        int[] iArr = this.zzd;
        if (iArr == null) {
            return zzcf.zza;
        }
        if (zzcf.zzd == 2) {
            boolean z = zzcf.zzc != iArr.length;
            int i = 0;
            while (true) {
                int length = iArr.length;
                if (i >= length) {
                    return z ? new zzcf(zzcf.zzb, length, 2) : zzcf.zza;
                }
                int i2 = iArr[i];
                if (i2 < zzcf.zzc) {
                    z |= i2 != i;
                    i++;
                } else {
                    throw new zzcg("Unhandled input format:", zzcf);
                }
            }
        } else {
            throw new zzcg("Unhandled input format:", zzcf);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzk() {
        this.zze = this.zzd;
    }

    /* access modifiers changed from: protected */
    public final void zzm() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzo(int[] iArr) {
        this.zzd = iArr;
    }
}
