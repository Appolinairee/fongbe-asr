package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzvr {
    private final zzdy zza = new zzdy(32);
    private zzvq zzb;
    private zzvq zzc;
    private zzvq zzd;
    private long zze;
    private final zzyk zzf;

    public zzvr(zzyk zzyk) {
        this.zzf = zzyk;
        zzvq zzvq = new zzvq(0, 65536);
        this.zzb = zzvq;
        this.zzc = zzvq;
        this.zzd = zzvq;
    }

    private final int zzi(int i) {
        zzvq zzvq = this.zzd;
        if (zzvq.zzc == null) {
            zzyd zzb2 = this.zzf.zzb();
            zzvq zzvq2 = new zzvq(this.zzd.zzb, 65536);
            zzvq.zzc = zzb2;
            zzvq.zzd = zzvq2;
        }
        return Math.min(i, (int) (this.zzd.zzb - this.zze));
    }

    private static zzvq zzj(zzvq zzvq, long j) {
        while (j >= zzvq.zzb) {
            zzvq = zzvq.zzd;
        }
        return zzvq;
    }

    private static zzvq zzk(zzvq zzvq, long j, ByteBuffer byteBuffer, int i) {
        zzvq zzj = zzj(zzvq, j);
        while (i > 0) {
            int min = Math.min(i, (int) (zzj.zzb - j));
            byteBuffer.put(zzj.zzc.zza, zzj.zza(j), min);
            i -= min;
            j += (long) min;
            if (j == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zzvq zzl(zzvq zzvq, long j, byte[] bArr, int i) {
        zzvq zzj = zzj(zzvq, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (zzj.zzb - j));
            System.arraycopy(zzj.zzc.zza, zzj.zza(j), bArr, i - i2, min);
            i2 -= min;
            j += (long) min;
            if (j == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zzvq zzm(zzvq zzvq, zzhh zzhh, zzvt zzvt, zzdy zzdy) {
        zzvq zzvq2;
        int i;
        zzhh zzhh2 = zzhh;
        zzvt zzvt2 = zzvt;
        zzdy zzdy2 = zzdy;
        if (zzhh.zzl()) {
            long j = zzvt2.zzb;
            zzdy2.zzI(1);
            zzvq zzl = zzl(zzvq, j, zzdy.zzN(), 1);
            long j2 = j + 1;
            byte b = zzdy.zzN()[0];
            byte b2 = b & 128;
            byte b3 = b & Byte.MAX_VALUE;
            zzhe zzhe = zzhh2.zzb;
            byte[] bArr = zzhe.zza;
            if (bArr == null) {
                zzhe.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z = b2 != 0;
            zzvq2 = zzl(zzl, j2, zzhe.zza, b3);
            long j3 = j2 + ((long) b3);
            if (z) {
                zzdy2.zzI(2);
                zzvq2 = zzl(zzvq2, j3, zzdy.zzN(), 2);
                j3 += 2;
                i = zzdy.zzq();
            } else {
                i = 1;
            }
            int[] iArr = zzhe.zzd;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzhe.zze;
            if (iArr3 == null || iArr3.length < i) {
                iArr3 = new int[i];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i2 = i * 6;
                zzdy2.zzI(i2);
                zzvq2 = zzl(zzvq2, j3, zzdy.zzN(), i2);
                j3 += (long) i2;
                zzdy2.zzL(0);
                for (int i3 = 0; i3 < i; i3++) {
                    iArr2[i3] = zzdy.zzq();
                    iArr4[i3] = zzdy.zzp();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzvt2.zza - ((int) (j3 - zzvt2.zzb));
            }
            zzads zzads = zzvt2.zzc;
            int i4 = zzei.zza;
            zzads zzads2 = zzads;
            zzhe.zzc(i, iArr2, iArr4, zzads.zzb, zzhe.zza, zzads.zza, zzads.zzc, zzads.zzd);
            long j4 = zzvt2.zzb;
            int i5 = (int) (j3 - j4);
            zzvt2.zzb = j4 + ((long) i5);
            zzvt2.zza -= i5;
        } else {
            zzvq2 = zzvq;
        }
        if (zzhh.zze()) {
            zzdy2.zzI(4);
            zzvq zzl2 = zzl(zzvq2, zzvt2.zzb, zzdy.zzN(), 4);
            int zzp = zzdy.zzp();
            zzvt2.zzb += 4;
            zzvt2.zza -= 4;
            zzhh2.zzj(zzp);
            zzvq zzk = zzk(zzl2, zzvt2.zzb, zzhh2.zzc, zzp);
            zzvt2.zzb += (long) zzp;
            int i6 = zzvt2.zza - zzp;
            zzvt2.zza = i6;
            ByteBuffer byteBuffer = zzhh2.zzf;
            if (byteBuffer == null || byteBuffer.capacity() < i6) {
                zzhh2.zzf = ByteBuffer.allocate(i6);
            } else {
                zzhh2.zzf.clear();
            }
            return zzk(zzk, zzvt2.zzb, zzhh2.zzf, zzvt2.zza);
        }
        zzhh2.zzj(zzvt2.zza);
        return zzk(zzvq2, zzvt2.zzb, zzhh2.zzc, zzvt2.zza);
    }

    private final void zzn(int i) {
        long j = this.zze + ((long) i);
        this.zze = j;
        zzvq zzvq = this.zzd;
        if (j == zzvq.zzb) {
            this.zzd = zzvq.zzd;
        }
    }

    public final int zza(zzl zzl, int i, boolean z) throws IOException {
        int zzi = zzi(i);
        zzvq zzvq = this.zzd;
        int zza2 = zzl.zza(zzvq.zzc.zza, zzvq.zza(this.zze), zzi);
        if (zza2 != -1) {
            zzn(zza2);
            return zza2;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public final long zzb() {
        return this.zze;
    }

    public final void zzc(long j) {
        zzvq zzvq;
        if (j != -1) {
            while (true) {
                zzvq = this.zzb;
                if (j < zzvq.zzb) {
                    break;
                }
                this.zzf.zzc(zzvq.zzc);
                this.zzb = this.zzb.zzb();
            }
            if (this.zzc.zza < zzvq.zza) {
                this.zzc = zzvq;
            }
        }
    }

    public final void zzd(zzhh zzhh, zzvt zzvt) {
        zzm(this.zzc, zzhh, zzvt, this.zza);
    }

    public final void zze(zzhh zzhh, zzvt zzvt) {
        this.zzc = zzm(this.zzc, zzhh, zzvt, this.zza);
    }

    public final void zzf() {
        zzvq zzvq = this.zzb;
        if (zzvq.zzc != null) {
            this.zzf.zzd(zzvq);
            zzvq.zzb();
        }
        this.zzb.zze(0, 65536);
        zzvq zzvq2 = this.zzb;
        this.zzc = zzvq2;
        this.zzd = zzvq2;
        this.zze = 0;
        this.zzf.zzg();
    }

    public final void zzg() {
        this.zzc = this.zzb;
    }

    public final void zzh(zzdy zzdy, int i) {
        while (i > 0) {
            int zzi = zzi(i);
            zzvq zzvq = this.zzd;
            zzdy.zzH(zzvq.zzc.zza, zzvq.zza(this.zze), zzi);
            i -= zzi;
            zzn(zzi);
        }
    }
}
