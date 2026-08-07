package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzgzu extends zzgwj {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    /* access modifiers changed from: private */
    public final zzgwj zzd;
    /* access modifiers changed from: private */
    public final zzgwj zze;
    private final int zzf;
    private final int zzg;

    private zzgzu(zzgwj zzgwj, zzgwj zzgwj2) {
        this.zzd = zzgwj;
        this.zze = zzgwj2;
        int zzd2 = zzgwj.zzd();
        this.zzf = zzd2;
        this.zzc = zzd2 + zzgwj2.zzd();
        this.zzg = Math.max(zzgwj.zzf(), zzgwj2.zzf()) + 1;
    }

    static zzgwj zzC(zzgwj zzgwj, zzgwj zzgwj2) {
        if (zzgwj2.zzd() == 0) {
            return zzgwj;
        }
        if (zzgwj.zzd() == 0) {
            return zzgwj2;
        }
        int zzd2 = zzgwj.zzd() + zzgwj2.zzd();
        if (zzd2 < 128) {
            return zzD(zzgwj, zzgwj2);
        }
        if (zzgwj instanceof zzgzu) {
            zzgzu zzgzu = (zzgzu) zzgwj;
            if (zzgzu.zze.zzd() + zzgwj2.zzd() < 128) {
                return new zzgzu(zzgzu.zzd, zzD(zzgzu.zze, zzgwj2));
            }
            if (zzgzu.zzd.zzf() > zzgzu.zze.zzf() && zzgzu.zzg > zzgwj2.zzf()) {
                return new zzgzu(zzgzu.zzd, new zzgzu(zzgzu.zze, zzgwj2));
            }
        }
        if (zzd2 >= zzc(Math.max(zzgwj.zzf(), zzgwj2.zzf()) + 1)) {
            return new zzgzu(zzgwj, zzgwj2);
        }
        return zzgzr.zza(new zzgzr((zzgzt) null), zzgwj, zzgwj2);
    }

    private static zzgwj zzD(zzgwj zzgwj, zzgwj zzgwj2) {
        int zzd2 = zzgwj.zzd();
        int zzd3 = zzgwj2.zzd();
        byte[] bArr = new byte[(zzd2 + zzd3)];
        zzgwj.zzz(bArr, 0, 0, zzd2);
        zzgwj2.zzz(bArr, 0, zzd2, zzd3);
        return new zzgwg(bArr);
    }

    static int zzc(int i) {
        int[] iArr = zza;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgwj)) {
            return false;
        }
        zzgwj zzgwj = (zzgwj) obj;
        if (this.zzc != zzgwj.zzd()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int zzr = zzr();
        int zzr2 = zzgwj.zzr();
        if (zzr != 0 && zzr2 != 0 && zzr != zzr2) {
            return false;
        }
        zzgzs zzgzs = new zzgzs(this, (zzgzt) null);
        zzgwf zza2 = zzgzs.next();
        zzgwf zzgwf = zza2;
        zzgzs zzgzs2 = new zzgzs(zzgwj, (zzgzt) null);
        zzgwf zza3 = zzgzs2.next();
        zzgwf zzgwf2 = zza3;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int zzd2 = zza2.zzd() - i;
            int zzd3 = zza3.zzd() - i2;
            int min = Math.min(zzd2, zzd3);
            if (i == 0) {
                z = zza2.zzg(zza3, i2, min);
            } else {
                z = zza3.zzg(zza2, i, min);
            }
            if (!z) {
                return false;
            }
            i3 += min;
            int i4 = this.zzc;
            if (i3 < i4) {
                if (min == zzd2) {
                    zzgwf zza4 = zzgzs.next();
                    zzgwf zzgwf3 = zza4;
                    zza2 = zza4;
                    i = 0;
                } else {
                    i += min;
                }
                if (min == zzd3) {
                    zza3 = zzgzs2.next();
                    zzgwf zzgwf4 = zza3;
                    i2 = 0;
                } else {
                    i2 += min;
                }
            } else if (i3 == i4) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public final /* synthetic */ Iterator iterator() {
        return new zzgzq(this);
    }

    public final byte zza(int i) {
        zzy(i, this.zzc);
        return zzb(i);
    }

    /* access modifiers changed from: package-private */
    public final byte zzb(int i) {
        int i2 = this.zzf;
        if (i < i2) {
            return this.zzd.zzb(i);
        }
        return this.zze.zzb(i - i2);
    }

    public final int zzd() {
        return this.zzc;
    }

    /* access modifiers changed from: protected */
    public final void zze(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            this.zzd.zze(bArr, i, i2, i3);
        } else if (i >= i5) {
            this.zze.zze(bArr, i - i5, i2, i3);
        } else {
            int i6 = i5 - i;
            this.zzd.zze(bArr, i, i2, i6);
            this.zze.zze(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    /* access modifiers changed from: protected */
    public final int zzf() {
        return this.zzg;
    }

    /* access modifiers changed from: protected */
    public final boolean zzh() {
        return this.zzc >= zzc(this.zzg);
    }

    /* access modifiers changed from: protected */
    public final int zzi(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            return this.zzd.zzi(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zze.zzi(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zze.zzi(this.zzd.zzi(i, i2, i6), 0, i3 - i6);
    }

    /* access modifiers changed from: protected */
    public final int zzj(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            return this.zzd.zzj(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zze.zzj(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zze.zzj(this.zzd.zzj(i, i2, i6), 0, i3 - i6);
    }

    public final zzgwj zzk(int i, int i2) {
        int zzq = zzq(i, i2, this.zzc);
        if (zzq == 0) {
            return zzgwj.zzb;
        }
        if (zzq == this.zzc) {
            return this;
        }
        int i3 = this.zzf;
        if (i2 <= i3) {
            return this.zzd.zzk(i, i2);
        }
        if (i >= i3) {
            return this.zze.zzk(i - i3, i2 - i3);
        }
        zzgwj zzgwj = this.zzd;
        return new zzgzu(zzgwj.zzk(i, zzgwj.zzd()), this.zze.zzk(0, i2 - this.zzf));
    }

    public final zzgwp zzl() {
        ArrayList<ByteBuffer> arrayList = new ArrayList<>();
        zzgzs zzgzs = new zzgzs(this, (zzgzt) null);
        while (zzgzs.hasNext()) {
            arrayList.add(zzgzs.next().zzn());
        }
        int i = zzgwp.zzd;
        boolean z = false;
        int i2 = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            i2 += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                z |= true;
            } else {
                z = byteBuffer.isDirect() ? z | true : z | true;
            }
        }
        if (z) {
            return new zzgwl(arrayList, i2, true, (zzgwo) null);
        }
        return zzgwp.zzG(new zzgyh(arrayList), 4096);
    }

    /* access modifiers changed from: protected */
    public final String zzm(Charset charset) {
        return new String(zzA(), charset);
    }

    public final ByteBuffer zzn() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final void zzo(zzgwa zzgwa) throws IOException {
        this.zzd.zzo(zzgwa);
        this.zze.zzo(zzgwa);
    }

    public final boolean zzp() {
        zzgwj zzgwj = this.zzd;
        zzgwj zzgwj2 = this.zze;
        if (zzgwj2.zzj(zzgwj.zzj(0, 0, this.zzf), 0, zzgwj2.zzd()) == 0) {
            return true;
        }
        return false;
    }

    public final zzgwe zzs() {
        return new zzgzq(this);
    }
}
