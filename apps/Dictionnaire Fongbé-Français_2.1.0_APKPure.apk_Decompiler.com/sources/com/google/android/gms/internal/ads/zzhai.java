package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzhai {
    private static final zzhai zza = new zzhai(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzhai() {
        this(0, new int[8], new Object[8], true);
    }

    private zzhai(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzhai zzc() {
        return zza;
    }

    static zzhai zze(zzhai zzhai, zzhai zzhai2) {
        int i = zzhai.zzb + zzhai2.zzb;
        int[] copyOf = Arrays.copyOf(zzhai.zzc, i);
        System.arraycopy(zzhai2.zzc, 0, copyOf, zzhai.zzb, zzhai2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzhai.zzd, i);
        System.arraycopy(zzhai2.zzd, 0, copyOf2, zzhai.zzb, zzhai2.zzb);
        return new zzhai(i, copyOf, copyOf2, true);
    }

    static zzhai zzf() {
        return new zzhai();
    }

    private final void zzn(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i2 = this.zzb;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzhai)) {
            return false;
        }
        zzhai zzhai = (zzhai) obj;
        int i = this.zzb;
        if (i == zzhai.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzhai.zzc;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzhai.zzd;
                    int i3 = this.zzb;
                    int i4 = 0;
                    while (i4 < i3) {
                        if (objArr[i4].equals(objArr2[i4])) {
                            i4++;
                        }
                    }
                    return true;
                } else if (iArr[i2] != iArr2[i2]) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = i + 527;
        int[] iArr = this.zzc;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = ((i2 * 31) + i4) * 31;
        Object[] objArr = this.zzd;
        int i7 = this.zzb;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final int zza() {
        int i;
        int i2;
        int i3;
        int i4 = this.zze;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.zzb; i6++) {
            int i7 = this.zzc[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 != 0) {
                if (i9 == 1) {
                    ((Long) this.zzd[i6]).longValue();
                    i = zzgww.zzD(i8 << 3) + 8;
                } else if (i9 == 2) {
                    int zzD = zzgww.zzD(i8 << 3);
                    int zzd2 = ((zzgwj) this.zzd[i6]).zzd();
                    i = zzD + zzgww.zzD(zzd2) + zzd2;
                } else if (i9 == 3) {
                    int zzD2 = zzgww.zzD(i8 << 3);
                    i3 = zzD2 + zzD2;
                    i2 = ((zzhai) this.zzd[i6]).zza();
                } else if (i9 == 5) {
                    ((Integer) this.zzd[i6]).intValue();
                    i = zzgww.zzD(i8 << 3) + 4;
                } else {
                    throw new IllegalStateException(new zzgyf("Protocol message tag had invalid wire type."));
                }
                i5 += i;
            } else {
                int i10 = i8 << 3;
                long longValue = ((Long) this.zzd[i6]).longValue();
                i3 = zzgww.zzD(i10);
                i2 = zzgww.zzE(longValue);
            }
            i = i3 + i2;
            i5 += i;
        }
        this.zze = i5;
        return i5;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int zzD = zzgww.zzD(8);
            int zzD2 = zzgww.zzD(16) + zzgww.zzD(this.zzc[i3] >>> 3);
            int zzD3 = zzgww.zzD(24);
            int zzd2 = ((zzgwj) this.zzd[i3]).zzd();
            i2 += zzD + zzD + zzD2 + zzD3 + zzgww.zzD(zzd2) + zzd2;
        }
        this.zze = i2;
        return i2;
    }

    /* access modifiers changed from: package-private */
    public final zzhai zzd(zzhai zzhai) {
        if (zzhai.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zzhai.zzb;
        zzn(i);
        System.arraycopy(zzhai.zzc, 0, this.zzc, this.zzb, zzhai.zzb);
        System.arraycopy(zzhai.zzd, 0, this.zzd, this.zzb, zzhai.zzb);
        this.zzb = i;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzi(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzgze.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzj(int i, Object obj) {
        zzg();
        zzn(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    /* access modifiers changed from: package-private */
    public final void zzk(zzhaw zzhaw) throws IOException {
        for (int i = 0; i < this.zzb; i++) {
            zzhaw.zzw(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzl(zzhaw zzhaw) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zzhaw.zzt(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    zzhaw.zzm(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    zzhaw.zzd(i4, (zzgwj) obj);
                } else if (i3 == 3) {
                    zzhaw.zzF(i4);
                    ((zzhai) obj).zzl(zzhaw);
                    zzhaw.zzh(i4);
                } else if (i3 == 5) {
                    zzhaw.zzk(i4, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(new zzgyf("Protocol message tag had invalid wire type."));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean zzm(int i, zzgwp zzgwp) throws IOException {
        int zzl;
        zzg();
        int i2 = i & 7;
        if (i2 == 0) {
            zzj(i, Long.valueOf(zzgwp.zzo()));
            return true;
        } else if (i2 == 1) {
            zzj(i, Long.valueOf(zzgwp.zzn()));
            return true;
        } else if (i2 == 2) {
            zzj(i, zzgwp.zzv());
            return true;
        } else if (i2 == 3) {
            zzhai zzhai = new zzhai();
            do {
                zzl = zzgwp.zzl();
                if (zzl == 0 || !zzhai.zzm(zzl, zzgwp)) {
                    zzgwp.zzy(4 | ((i >>> 3) << 3));
                    zzj(i, zzhai);
                }
                zzl = zzgwp.zzl();
                break;
            } while (!zzhai.zzm(zzl, zzgwp));
            zzgwp.zzy(4 | ((i >>> 3) << 3));
            zzj(i, zzhai);
            return true;
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                zzj(i, Integer.valueOf(zzgwp.zzf()));
                return true;
            }
            throw new zzgyf("Protocol message tag had invalid wire type.");
        }
    }
}
