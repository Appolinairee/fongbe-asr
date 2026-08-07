package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzgzx {
    public static final /* synthetic */ int zza = 0;
    private static final zzhah zzb = new zzhaj();

    static {
        int i = zzgzm.zza;
    }

    public static void zzA(int i, List list, zzhaw zzhaw, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhaw.zzu(i, list, z);
        }
    }

    public static void zzB(int i, List list, zzhaw zzhaw, zzgzv zzgzv) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((zzgwx) zzhaw).zzv(i, list.get(i2), zzgzv);
            }
        }
    }

    public static void zzC(int i, List list, zzhaw zzhaw, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhaw.zzy(i, list, z);
        }
    }

    public static void zzD(int i, List list, zzhaw zzhaw, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhaw.zzA(i, list, z);
        }
    }

    public static void zzE(int i, List list, zzhaw zzhaw, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhaw.zzC(i, list, z);
        }
    }

    public static void zzF(int i, List list, zzhaw zzhaw, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhaw.zzE(i, list, z);
        }
    }

    public static void zzG(int i, List list, zzhaw zzhaw) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhaw.zzH(i, list);
        }
    }

    public static void zzH(int i, List list, zzhaw zzhaw, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhaw.zzJ(i, list, z);
        }
    }

    public static void zzI(int i, List list, zzhaw zzhaw, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhaw.zzL(i, list, z);
        }
    }

    static boolean zzJ(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int zza(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgxs) {
            zzgxs zzgxs = (zzgxs) list;
            i = 0;
            while (i2 < size) {
                i += zzgww.zzE((long) zzgxs.zzd(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzgww.zzE((long) ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzb(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgww.zzD(i << 3) + 4);
    }

    static int zzc(List list) {
        return list.size() * 4;
    }

    static int zzd(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgww.zzD(i << 3) + 8);
    }

    static int zze(List list) {
        return list.size() * 8;
    }

    static int zzf(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgxs) {
            zzgxs zzgxs = (zzgxs) list;
            i = 0;
            while (i2 < size) {
                i += zzgww.zzE((long) zzgxs.zzd(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzgww.zzE((long) ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzg(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgyr) {
            zzgyr zzgyr = (zzgyr) list;
            i = 0;
            while (i2 < size) {
                i += zzgww.zzE(zzgyr.zza(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzgww.zzE(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    static int zzh(int i, Object obj, zzgzv zzgzv) {
        int i2 = i << 3;
        if (!(obj instanceof zzgyn)) {
            return zzgww.zzD(i2) + zzgww.zzA((zzgzc) obj, zzgzv);
        }
        int zzD = zzgww.zzD(i2);
        int zza2 = ((zzgyn) obj).zza();
        return zzD + zzgww.zzD(zza2) + zza2;
    }

    static int zzi(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgxs) {
            zzgxs zzgxs = (zzgxs) list;
            i = 0;
            while (i2 < size) {
                int zzd = zzgxs.zzd(i2);
                i += zzgww.zzD((zzd >> 31) ^ (zzd + zzd));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i3 = i + zzgww.zzD((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    static int zzj(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgyr) {
            zzgyr zzgyr = (zzgyr) list;
            i = 0;
            while (i2 < size) {
                long zza2 = zzgyr.zza(i2);
                i += zzgww.zzE((zza2 >> 63) ^ (zza2 + zza2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i3 = i + zzgww.zzE((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    static int zzk(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgxs) {
            zzgxs zzgxs = (zzgxs) list;
            i = 0;
            while (i2 < size) {
                i += zzgww.zzD(zzgxs.zzd(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzgww.zzD(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzl(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgyr) {
            zzgyr zzgyr = (zzgyr) list;
            i = 0;
            while (i2 < size) {
                i += zzgww.zzE(zzgyr.zza(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzgww.zzE(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static zzhah zzm() {
        return zzb;
    }

    static Object zzn(Object obj, int i, List list, zzgxx zzgxx, Object obj2, zzhah zzhah) {
        if (zzgxx == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = (Integer) list.get(i3);
                int intValue = num.intValue();
                if (zzgxx.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    obj2 = zzo(obj, i, intValue, obj2, zzhah);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzgxx.zza(intValue2)) {
                    obj2 = zzo(obj, i, intValue2, obj2, zzhah);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    static Object zzo(Object obj, int i, int i2, Object obj2, zzhah zzhah) {
        if (obj2 == null) {
            obj2 = zzhah.zza(obj);
        }
        zzhah.zzh(obj2, i, (long) i2);
        return obj2;
    }

    static void zzp(zzgxc zzgxc, Object obj, Object obj2) {
        if (!((zzgxn) obj2).zza.zza.isEmpty()) {
            zzgxn zzgxn = (zzgxn) obj;
            throw null;
        }
    }

    static void zzq(zzhah zzhah, Object obj, Object obj2) {
        zzgxr zzgxr = (zzgxr) obj;
        zzhai zzhai = zzgxr.zzt;
        zzhai zzhai2 = ((zzgxr) obj2).zzt;
        zzhai zzhai3 = zzhai;
        zzhai zzhai4 = zzhai2;
        if (!zzhai.zzc().equals(zzhai2)) {
            if (zzhai.zzc().equals(zzhai)) {
                zzhai = zzhai.zze(zzhai, zzhai2);
            } else {
                zzhai.zzd(zzhai2);
            }
        }
        zzhai zzhai5 = zzhai;
        zzgxr.zzt = zzhai;
    }

    public static void zzr(int i, List list, zzhaw zzhaw, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhaw.zzc(i, list, z);
        }
    }

    public static void zzs(int i, List list, zzhaw zzhaw) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhaw.zze(i, list);
        }
    }

    public static void zzt(int i, List list, zzhaw zzhaw, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhaw.zzg(i, list, z);
        }
    }

    public static void zzu(int i, List list, zzhaw zzhaw, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhaw.zzj(i, list, z);
        }
    }

    public static void zzv(int i, List list, zzhaw zzhaw, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhaw.zzl(i, list, z);
        }
    }

    public static void zzw(int i, List list, zzhaw zzhaw, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhaw.zzn(i, list, z);
        }
    }

    public static void zzx(int i, List list, zzhaw zzhaw, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhaw.zzp(i, list, z);
        }
    }

    public static void zzy(int i, List list, zzhaw zzhaw, zzgzv zzgzv) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((zzgwx) zzhaw).zzq(i, list.get(i2), zzgzv);
            }
        }
    }

    public static void zzz(int i, List list, zzhaw zzhaw, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhaw.zzs(i, list, z);
        }
    }
}
