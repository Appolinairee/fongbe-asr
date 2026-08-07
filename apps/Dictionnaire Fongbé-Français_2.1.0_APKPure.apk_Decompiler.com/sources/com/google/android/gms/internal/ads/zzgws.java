package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzgws extends zzgww {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    zzgws(byte[] bArr, int i, int i2) {
        super((zzgwv) null);
        int length = bArr.length;
        if (((length - i2) | i2) >= 0) {
            this.zza = bArr;
            this.zzc = 0;
            this.zzb = i2;
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i2)}));
    }

    public final void zzK() {
    }

    public final void zzL(byte b) throws IOException {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i = this.zzc;
        try {
            int i2 = i + 1;
            try {
                this.zza[i] = b;
                this.zzc = i2;
            } catch (IndexOutOfBoundsException e) {
                indexOutOfBoundsException = e;
                i = i2;
                throw new zzgwt((long) i, (long) this.zzb, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e2) {
            indexOutOfBoundsException = e2;
            throw new zzgwt((long) i, (long) this.zzb, 1, indexOutOfBoundsException);
        }
    }

    public final void zzM(int i, boolean z) throws IOException {
        zzu(i << 3);
        zzL(z ? (byte) 1 : 0);
    }

    public final void zzN(int i, zzgwj zzgwj) throws IOException {
        zzu((i << 3) | 2);
        zzu(zzgwj.zzd());
        zzgwj.zzo(this);
    }

    public final void zza(byte[] bArr, int i, int i2) throws IOException {
        zze(bArr, i, i2);
    }

    public final int zzb() {
        return this.zzb - this.zzc;
    }

    public final void zze(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, i, this.zza, this.zzc, i2);
            this.zzc += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzgwt((long) this.zzc, (long) this.zzb, i2, e);
        }
    }

    public final void zzh(int i, int i2) throws IOException {
        zzu((i << 3) | 5);
        zzi(i2);
    }

    public final void zzi(int i) throws IOException {
        int i2 = this.zzc;
        try {
            byte[] bArr = this.zza;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.zzc = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzgwt((long) i2, (long) this.zzb, 4, e);
        }
    }

    public final void zzj(int i, long j) throws IOException {
        zzu((i << 3) | 1);
        zzk(j);
    }

    public final void zzk(long j) throws IOException {
        int i = this.zzc;
        try {
            byte[] bArr = this.zza;
            bArr[i] = (byte) ((int) j);
            bArr[i + 1] = (byte) ((int) (j >> 8));
            bArr[i + 2] = (byte) ((int) (j >> 16));
            bArr[i + 3] = (byte) ((int) (j >> 24));
            bArr[i + 4] = (byte) ((int) (j >> 32));
            bArr[i + 5] = (byte) ((int) (j >> 40));
            bArr[i + 6] = (byte) ((int) (j >> 48));
            bArr[i + 7] = (byte) ((int) (j >> 56));
            this.zzc = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new zzgwt((long) i, (long) this.zzb, 8, e);
        }
    }

    public final void zzl(int i, int i2) throws IOException {
        zzu(i << 3);
        zzm(i2);
    }

    public final void zzm(int i) throws IOException {
        if (i >= 0) {
            zzu(i);
        } else {
            zzw((long) i);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzn(int i, zzgzc zzgzc, zzgzv zzgzv) throws IOException {
        zzu((i << 3) | 2);
        zzu(((zzgvs) zzgzc).zzaM(zzgzv));
        zzgzv.zzj(zzgzc, this.zze);
    }

    public final void zzo(int i, zzgzc zzgzc) throws IOException {
        zzu(11);
        zzt(2, i);
        zzu(26);
        zzu(zzgzc.zzaY());
        zzgzc.zzcY(this);
        zzu(12);
    }

    public final void zzp(int i, zzgwj zzgwj) throws IOException {
        zzu(11);
        zzt(2, i);
        zzN(3, zzgwj);
        zzu(12);
    }

    public final void zzq(int i, String str) throws IOException {
        zzu((i << 3) | 2);
        zzr(str);
    }

    public final void zzr(String str) throws IOException {
        int i = this.zzc;
        try {
            int zzD = zzD(str.length() * 3);
            int zzD2 = zzD(str.length());
            if (zzD2 == zzD) {
                int i2 = i + zzD2;
                this.zzc = i2;
                int zzd = zzhat.zzd(str, this.zza, i2, this.zzb - i2);
                this.zzc = i;
                zzu((zzd - i) - zzD2);
                this.zzc = zzd;
                return;
            }
            zzu(zzhat.zze(str));
            byte[] bArr = this.zza;
            int i3 = this.zzc;
            this.zzc = zzhat.zzd(str, bArr, i3, this.zzb - i3);
        } catch (zzhas e) {
            this.zzc = i;
            zzG(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzgwt(e2);
        }
    }

    public final void zzs(int i, int i2) throws IOException {
        zzu((i << 3) | i2);
    }

    public final void zzt(int i, int i2) throws IOException {
        zzu(i << 3);
        zzu(i2);
    }

    public final void zzv(int i, long j) throws IOException {
        zzu(i << 3);
        zzw(j);
    }

    public final void zzu(int i) throws IOException {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i2;
        int i3 = this.zzc;
        while ((i & -128) != 0) {
            i2 = i3 + 1;
            this.zza[i3] = (byte) (i | 128);
            i >>>= 7;
            i3 = i2;
        }
        try {
            i2 = i3 + 1;
            try {
                this.zza[i3] = (byte) i;
                this.zzc = i2;
            } catch (IndexOutOfBoundsException e) {
                indexOutOfBoundsException = e;
                i3 = i2;
                throw new zzgwt((long) i3, (long) this.zzb, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e2) {
            indexOutOfBoundsException = e2;
            throw new zzgwt((long) i3, (long) this.zzb, 1, indexOutOfBoundsException);
        }
    }

    public final void zzw(long j) throws IOException {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i;
        int i2 = this.zzc;
        if (!zzgww.zzb || this.zzb - i2 < 10) {
            while ((j & -128) != 0) {
                int i3 = i2 + 1;
                try {
                    this.zza[i2] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i2 = i3;
                } catch (IndexOutOfBoundsException e) {
                    e = e;
                    i2 = i3;
                    indexOutOfBoundsException = e;
                    throw new zzgwt((long) i2, (long) this.zzb, 1, indexOutOfBoundsException);
                }
            }
            try {
                i = i2 + 1;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                indexOutOfBoundsException = e;
                throw new zzgwt((long) i2, (long) this.zzb, 1, indexOutOfBoundsException);
            }
            try {
                this.zza[i2] = (byte) ((int) j);
            } catch (IndexOutOfBoundsException e3) {
                indexOutOfBoundsException = e3;
                i2 = i;
                throw new zzgwt((long) i2, (long) this.zzb, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j & -128) != 0) {
                zzhao.zzq(this.zza, (long) i2, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            zzhao.zzq(this.zza, (long) i2, (byte) ((int) j));
        }
        this.zzc = i;
    }
}
