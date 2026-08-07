package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzgxi extends zzgvv implements RandomAccess, zzgxy, zzgzl {
    private static final float[] zza;
    private static final zzgxi zzb;
    private float[] zzc;
    private int zzd;

    static {
        float[] fArr = new float[0];
        zza = fArr;
        zzb = new zzgxi(fArr, 0, false);
    }

    zzgxi() {
        this(zza, 0, true);
    }

    public static zzgxi zze() {
        return zzb;
    }

    private static int zzj(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    private final String zzk(int i) {
        int i2 = this.zzd;
        return "Index:" + i + ", Size:" + i2;
    }

    private final void zzl(int i) {
        if (i < 0 || i >= this.zzd) {
            throw new IndexOutOfBoundsException(zzk(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        zzdG();
        if (i < 0 || i > (i2 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzk(i));
        }
        int i3 = i + 1;
        float[] fArr = this.zzc;
        int length = fArr.length;
        if (i2 < length) {
            System.arraycopy(fArr, i, fArr, i3, i2 - i);
        } else {
            float[] fArr2 = new float[zzj(length)];
            System.arraycopy(this.zzc, 0, fArr2, 0, i);
            System.arraycopy(this.zzc, i, fArr2, i3, this.zzd - i);
            this.zzc = fArr2;
        }
        this.zzc[i] = floatValue;
        this.zzd++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        zzdG();
        byte[] bArr = zzgye.zzb;
        collection.getClass();
        if (!(collection instanceof zzgxi)) {
            return super.addAll(collection);
        }
        zzgxi zzgxi = (zzgxi) collection;
        int i = zzgxi.zzd;
        if (i == 0) {
            return false;
        }
        int i2 = this.zzd;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.zzc;
            if (i3 > fArr.length) {
                this.zzc = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(zzgxi.zzc, 0, this.zzc, this.zzd, zzgxi.zzd);
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
        if (!(obj instanceof zzgxi)) {
            return super.equals(obj);
        }
        zzgxi zzgxi = (zzgxi) obj;
        if (this.zzd != zzgxi.zzd) {
            return false;
        }
        float[] fArr = zzgxi.zzc;
        for (int i = 0; i < this.zzd; i++) {
            if (Float.floatToIntBits(this.zzc[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        zzl(i);
        return Float.valueOf(this.zzc[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zzd; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.zzc[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.zzd;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zzc[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzdG();
        zzl(i);
        float[] fArr = this.zzc;
        float f = fArr[i];
        int i2 = this.zzd;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.zzd--;
        this.modCount++;
        return Float.valueOf(f);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        zzdG();
        if (i2 >= i) {
            float[] fArr = this.zzc;
            System.arraycopy(fArr, i2, fArr, i, this.zzd - i2);
            this.zzd -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        zzdG();
        zzl(i);
        float[] fArr = this.zzc;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.zzd;
    }

    public final float zzd(int i) {
        zzl(i);
        return this.zzc[i];
    }

    /* renamed from: zzg */
    public final zzgxy zzf(int i) {
        float[] fArr;
        if (i >= this.zzd) {
            if (i == 0) {
                fArr = zza;
            } else {
                fArr = Arrays.copyOf(this.zzc, i);
            }
            return new zzgxi(fArr, this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zzh(float f) {
        zzdG();
        int i = this.zzd;
        int length = this.zzc.length;
        if (i == length) {
            float[] fArr = new float[zzj(length)];
            System.arraycopy(this.zzc, 0, fArr, 0, this.zzd);
            this.zzc = fArr;
        }
        float[] fArr2 = this.zzc;
        int i2 = this.zzd;
        this.zzd = i2 + 1;
        fArr2[i2] = f;
    }

    /* access modifiers changed from: package-private */
    public final void zzi(int i) {
        int length = this.zzc.length;
        if (i > length) {
            if (length != 0) {
                while (length < i) {
                    length = zzj(length);
                }
                this.zzc = Arrays.copyOf(this.zzc, length);
                return;
            }
            this.zzc = new float[Math.max(i, 10)];
        }
    }

    private zzgxi(float[] fArr, int i, boolean z) {
        super(z);
        this.zzc = fArr;
        this.zzd = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Float) obj).floatValue());
        return true;
    }
}
