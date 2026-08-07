package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzfxt {
    public static Object zza(Iterable iterable, Object obj) {
        zzfzt zza = ((zzfzj) iterable).iterator();
        return zza.hasNext() ? zza.next() : obj;
    }

    public static boolean zzb(Iterable iterable, zzfuo zzfuo) {
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            zzfuo.getClass();
            boolean z = false;
            while (it.hasNext()) {
                if (zzfuo.zza(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }
        zzfuo.getClass();
        zzfuo zzfuo2 = zzfuo;
        return zzd((List) iterable, zzfuo);
    }

    private static void zzc(List list, zzfuo zzfuo, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (zzfuo.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 >= i) {
                list.remove(i2);
            } else {
                return;
            }
        }
    }

    private static boolean zzd(List list, zzfuo zzfuo) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            Object obj = list.get(i);
            if (!zzfuo.zza(obj)) {
                if (i > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (UnsupportedOperationException unused) {
                        zzc(list, zzfuo, i2, i);
                        return true;
                    } catch (IllegalArgumentException unused2) {
                        zzc(list, zzfuo, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        return i != i2;
    }
}
