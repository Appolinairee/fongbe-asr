package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzgvz extends zzgvv implements RandomAccess, zzgxt, zzgzl {
    private static final boolean[] zza;
    private static final zzgvz zzb;
    private boolean[] zzc;
    private int zzd;

    static {
        boolean[] zArr = new boolean[0];
        zza = zArr;
        zzb = new zzgvz(zArr, 0, false);
    }

    zzgvz() {
        this(zza, 0, true);
    }

    public static zzgvz zzd() {
        return zzb;
    }

    private static int zzi(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    private final String zzj(int i) {
        int i2 = this.zzd;
        return "Index:" + i + ", Size:" + i2;
    }

    private final void zzk(int i) {
        if (i < 0 || i >= this.zzd) {
            throw new IndexOutOfBoundsException(zzj(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zzdG();
        if (i < 0 || i > (i2 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzj(i));
        }
        int i3 = i + 1;
        boolean[] zArr = this.zzc;
        int length = zArr.length;
        if (i2 < length) {
            System.arraycopy(zArr, i, zArr, i3, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[zzi(length)];
            System.arraycopy(this.zzc, 0, zArr2, 0, i);
            System.arraycopy(this.zzc, i, zArr2, i3, this.zzd - i);
            this.zzc = zArr2;
        }
        this.zzc[i] = booleanValue;
        this.zzd++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        zzdG();
        byte[] bArr = zzgye.zzb;
        collection.getClass();
        if (!(collection instanceof zzgvz)) {
            return super.addAll(collection);
        }
        zzgvz zzgvz = (zzgvz) collection;
        int i = zzgvz.zzd;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzd;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.zzc;
            if (i3 > zArr.length) {
                this.zzc = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(zzgvz.zzc, 0, this.zzc, this.zzd, zzgvz.zzd);
            this.zzd = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgvz)) {
            return super.equals(obj);
        }
        zzgvz zzgvz = (zzgvz) obj;
        if (this.zzd != zzgvz.zzd) {
            return false;
        }
        boolean[] zArr = zzgvz.zzc;
        for (int i = 0; i < this.zzd; i++) {
            if (this.zzc[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        zzk(i);
        return Boolean.valueOf(this.zzc[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzd; i2++) {
            i = (i * 31) + zzgye.zza(this.zzc[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.zzd;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zzc[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzdG();
        zzk(i);
        boolean[] zArr = this.zzc;
        boolean z = zArr[i];
        int i2 = this.zzd;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.zzd--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        zzdG();
        if (i2 >= i) {
            boolean[] zArr = this.zzc;
            System.arraycopy(zArr, i2, zArr, i, this.zzd - i2);
            this.zzd -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zzdG();
        zzk(i);
        boolean[] zArr = this.zzc;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.zzd;
    }

    /* renamed from: zze */
    public final zzgxt zzf(int i) {
        boolean[] zArr;
        if (i >= this.zzd) {
            if (i == 0) {
                zArr = zza;
            } else {
                zArr = Arrays.copyOf(this.zzc, i);
            }
            return new zzgvz(zArr, this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zzg(boolean z) {
        zzdG();
        int i = this.zzd;
        int length = this.zzc.length;
        if (i == length) {
            boolean[] zArr = new boolean[zzi(length)];
            System.arraycopy(this.zzc, 0, zArr, 0, this.zzd);
            this.zzc = zArr;
        }
        boolean[] zArr2 = this.zzc;
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        zArr2[i2] = z;
    }

    public final boolean zzh(int i) {
        zzk(i);
        return this.zzc[i];
    }

    private zzgvz(boolean[] zArr, int i, boolean z) {
        super(z);
        this.zzc = zArr;
        this.zzd = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Boolean) obj).booleanValue());
        return true;
    }
}
