package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public abstract class zzfxn extends zzfxi implements List, RandomAccess {
    private static final zzfzu zza = new zzfxl(zzfyz.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    zzfxn() {
    }

    public static zzfxk zzi(int i) {
        zzfwk.zza(i, "expectedSize");
        return new zzfxk(i);
    }

    static zzfxn zzj(Object[] objArr, int i) {
        if (i == 0) {
            return zzfyz.zza;
        }
        return new zzfyz(objArr, i);
    }

    public static zzfxn zzl(Collection collection) {
        if (collection instanceof zzfxi) {
            zzfxn zzd2 = ((zzfxi) collection).zzd();
            if (!zzd2.zzf()) {
                return zzd2;
            }
            Object[] array = zzd2.toArray();
            return zzj(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        zzfyx.zzb(array2, length);
        return zzj(array2, length);
    }

    public static zzfxn zzm(Object[] objArr) {
        if (objArr.length == 0) {
            return zzfyz.zza;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zzfyx.zzb(objArr2, length);
        return zzj(objArr2, length);
    }

    public static zzfxn zzn() {
        return zzfyz.zza;
    }

    public static zzfxn zzo(Object obj) {
        Object[] objArr = {obj};
        zzfyx.zzb(objArr, 1);
        return zzj(objArr, 1);
    }

    public static zzfxn zzp(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzfyx.zzb(objArr, 2);
        return zzj(objArr, 2);
    }

    public static zzfxn zzq(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        zzfyx.zzb(objArr, 3);
        return zzj(objArr, 3);
    }

    public static zzfxn zzr(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        zzfyx.zzb(objArr, 5);
        return zzj(objArr, 5);
    }

    public static zzfxn zzs(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        zzfyx.zzb(objArr, 6);
        return zzj(objArr, 6);
    }

    @SafeVarargs
    public static zzfxn zzt(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        Object[] objArr2 = objArr;
        int length = objArr2.length;
        int i = length + 12;
        Object[] objArr3 = new Object[i];
        objArr3[0] = obj;
        objArr3[1] = obj2;
        objArr3[2] = obj3;
        objArr3[3] = obj4;
        objArr3[4] = obj5;
        objArr3[5] = obj6;
        objArr3[6] = obj7;
        objArr3[7] = obj8;
        objArr3[8] = obj9;
        objArr3[9] = obj10;
        objArr3[10] = obj11;
        objArr3[11] = obj12;
        System.arraycopy(objArr2, 0, objArr3, 12, length);
        zzfyx.zzb(objArr3, i);
        return zzj(objArr3, i);
    }

    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i = 0;
                    while (i < size) {
                        if (zzfuk.zza(get(i), list.get(i))) {
                            i++;
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!zzfuk.zza(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public final int indexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public final int lastIndexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int zza(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Deprecated
    public final zzfxn zzd() {
        return this;
    }

    public final zzfzt zze() {
        return listIterator(0);
    }

    /* renamed from: zzh */
    public zzfxn subList(int i, int i2) {
        zzfun.zzk(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return zzfyz.zza;
        }
        return new zzfxm(this, i, i3);
    }

    /* renamed from: zzu */
    public final zzfzu listIterator(int i) {
        zzfun.zzb(i, size(), "index");
        if (isEmpty()) {
            return zza;
        }
        return new zzfxl(this, i);
    }

    public static zzfxn zzk(Iterable iterable) {
        iterable.getClass();
        return zzl((Collection) iterable);
    }
}
