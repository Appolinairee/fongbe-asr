package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzgxg {
    private static final zzgxg zzb = new zzgxg(true);
    final zzhad zza = new zzgzy();
    private boolean zzc;
    private boolean zzd;

    private zzgxg() {
    }

    static int zza(zzhau zzhau, int i, Object obj) {
        int zzD = zzgww.zzD(i << 3);
        if (zzhau == zzhau.GROUP) {
            zzgzc zzgzc = (zzgzc) obj;
            byte[] bArr = zzgye.zzb;
            if (!(zzgzc instanceof zzgvt)) {
                zzD += zzD;
            } else {
                zzgvt zzgvt = (zzgvt) zzgzc;
                throw null;
            }
        }
        return zzD + zzb(zzhau, obj);
    }

    static int zzb(zzhau zzhau, Object obj) {
        int zzd2;
        int zzD;
        zzhau zzhau2 = zzhau.DOUBLE;
        zzhav zzhav = zzhav.INT;
        switch (zzhau.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                int i = zzgww.zzf;
                return 8;
            case 1:
                ((Float) obj).floatValue();
                int i2 = zzgww.zzf;
                return 4;
            case 2:
                return zzgww.zzE(((Long) obj).longValue());
            case 3:
                return zzgww.zzE(((Long) obj).longValue());
            case 4:
                return zzgww.zzE((long) ((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                int i3 = zzgww.zzf;
                return 8;
            case 6:
                ((Integer) obj).intValue();
                int i4 = zzgww.zzf;
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                int i5 = zzgww.zzf;
                return 1;
            case 8:
                if (obj instanceof zzgwj) {
                    int i6 = zzgww.zzf;
                    zzd2 = ((zzgwj) obj).zzd();
                    zzD = zzgww.zzD(zzd2);
                    break;
                } else {
                    return zzgww.zzC((String) obj);
                }
            case 9:
                int i7 = zzgww.zzf;
                return ((zzgzc) obj).zzaY();
            case 10:
                if (obj instanceof zzgym) {
                    int i8 = zzgww.zzf;
                    zzd2 = ((zzgym) obj).zza();
                    zzD = zzgww.zzD(zzd2);
                    break;
                } else {
                    return zzgww.zzz((zzgzc) obj);
                }
            case 11:
                if (!(obj instanceof zzgwj)) {
                    int i9 = zzgww.zzf;
                    zzd2 = ((byte[]) obj).length;
                    zzD = zzgww.zzD(zzd2);
                    break;
                } else {
                    int i10 = zzgww.zzf;
                    zzd2 = ((zzgwj) obj).zzd();
                    zzD = zzgww.zzD(zzd2);
                    break;
                }
            case 12:
                return zzgww.zzD(((Integer) obj).intValue());
            case 13:
                if (obj instanceof zzgxv) {
                    return zzgww.zzE((long) ((zzgxv) obj).zza());
                }
                return zzgww.zzE((long) ((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                int i11 = zzgww.zzf;
                return 4;
            case 15:
                ((Long) obj).longValue();
                int i12 = zzgww.zzf;
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return zzgww.zzD((intValue >> 31) ^ (intValue + intValue));
            case 17:
                long longValue = ((Long) obj).longValue();
                return zzgww.zzE((longValue >> 63) ^ (longValue + longValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return zzD + zzd2;
    }

    public static int zzc(zzgxf zzgxf, Object obj) {
        zzhau zzb2 = zzgxf.zzb();
        int zza2 = zzgxf.zza();
        if (!zzgxf.zze()) {
            return zza(zzb2, zza2, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i = 0;
        if (!zzgxf.zzd()) {
            int i2 = 0;
            while (i < size) {
                i2 += zza(zzb2, zza2, list.get(i));
                i++;
            }
            return i2;
        } else if (list.isEmpty()) {
            return 0;
        } else {
            int i3 = 0;
            while (i < size) {
                i3 += zzb(zzb2, list.get(i));
                i++;
            }
            return zzgww.zzD(zza2 << 3) + i3 + zzgww.zzD(i3);
        }
    }

    public static zzgxg zze() {
        return zzb;
    }

    private static boolean zzj(Map.Entry entry) {
        zzgxf zzgxf = (zzgxf) entry.getKey();
        if (zzgxf.zzc() != zzhav.MESSAGE) {
            return true;
        }
        if (!zzgxf.zze()) {
            return zzk(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!zzk(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzk(Object obj) {
        if (obj instanceof zzgzd) {
            return ((zzgzd) obj).zzbw();
        }
        if (obj instanceof zzgym) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzl(Map.Entry entry) {
        int i;
        int zzD;
        int zzD2;
        zzgxf zzgxf = (zzgxf) entry.getKey();
        Object value = entry.getValue();
        if (zzgxf.zzc() != zzhav.MESSAGE || zzgxf.zze() || zzgxf.zzd()) {
            return zzc(zzgxf, value);
        }
        if (value instanceof zzgym) {
            int zza2 = ((zzgxf) entry.getKey()).zza();
            int zzD3 = zzgww.zzD(8);
            i = zzD3 + zzD3;
            zzD = zzgww.zzD(16) + zzgww.zzD(zza2);
            int zzD4 = zzgww.zzD(24);
            int zza3 = ((zzgym) value).zza();
            zzD2 = zzD4 + zzgww.zzD(zza3) + zza3;
        } else {
            int zza4 = ((zzgxf) entry.getKey()).zza();
            int zzD5 = zzgww.zzD(8);
            i = zzD5 + zzD5;
            zzD = zzgww.zzD(16) + zzgww.zzD(zza4);
            zzD2 = zzgww.zzD(24) + zzgww.zzz((zzgzc) value);
        }
        return i + zzD + zzD2;
    }

    private static final void zzm(zzgxf zzgxf, Object obj) {
        boolean z;
        zzhau zzb2 = zzgxf.zzb();
        byte[] bArr = zzgye.zzb;
        obj.getClass();
        zzhau zzhau = zzhau.DOUBLE;
        zzhav zzhav = zzhav.INT;
        switch (zzb2.zza().ordinal()) {
            case 0:
                z = obj instanceof Integer;
                break;
            case 1:
                z = obj instanceof Long;
                break;
            case 2:
                z = obj instanceof Float;
                break;
            case 3:
                z = obj instanceof Double;
                break;
            case 4:
                z = obj instanceof Boolean;
                break;
            case 5:
                z = obj instanceof String;
                break;
            case 6:
                if ((obj instanceof zzgwj) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if ((obj instanceof Integer) || (obj instanceof zzgxv)) {
                    return;
                }
            case 8:
                if ((obj instanceof zzgzc) || (obj instanceof zzgym)) {
                    return;
                }
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzgxf.zza()), zzgxf.zzb().zza(), obj.getClass().getName()}));
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzgxg zzgxg = new zzgxg();
        int zzc2 = this.zza.zzc();
        for (int i = 0; i < zzc2; i++) {
            Map.Entry zzg = this.zza.zzg(i);
            zzgxg.zzh((zzgxf) ((zzgzz) zzg).zza(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzd()) {
            zzgxg.zzh((zzgxf) entry.getKey(), entry.getValue());
        }
        zzgxg.zzd = this.zzd;
        return zzgxg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgxg)) {
            return false;
        }
        return this.zza.equals(((zzgxg) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzd() {
        int zzc2 = this.zza.zzc();
        int i = 0;
        for (int i2 = 0; i2 < zzc2; i2++) {
            i += zzl(this.zza.zzg(i2));
        }
        for (Map.Entry zzl : this.zza.zzd()) {
            i += zzl(zzl);
        }
        return i;
    }

    public final Iterator zzf() {
        if (this.zza.isEmpty()) {
            return Collections.emptyIterator();
        }
        if (this.zzd) {
            return new zzgyk(this.zza.entrySet().iterator());
        }
        return this.zza.entrySet().iterator();
    }

    public final void zzg() {
        if (!this.zzc) {
            int zzc2 = this.zza.zzc();
            for (int i = 0; i < zzc2; i++) {
                Object value = this.zza.zzg(i).getValue();
                if (value instanceof zzgxr) {
                    ((zzgxr) value).zzbU();
                }
            }
            for (Map.Entry value2 : this.zza.zzd()) {
                Object value3 = value2.getValue();
                if (value3 instanceof zzgxr) {
                    ((zzgxr) value3).zzbU();
                }
            }
            this.zza.zza();
            this.zzc = true;
        }
    }

    public final void zzh(zzgxf zzgxf, Object obj) {
        if (!zzgxf.zze()) {
            zzm(zzgxf, obj);
        } else if (obj instanceof List) {
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                zzm(zzgxf, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzgym) {
            this.zzd = true;
        }
        this.zza.put(zzgxf, obj);
    }

    public final boolean zzi() {
        int zzc2 = this.zza.zzc();
        for (int i = 0; i < zzc2; i++) {
            if (!zzj(this.zza.zzg(i))) {
                return false;
            }
        }
        for (Map.Entry zzj : this.zza.zzd()) {
            if (!zzj(zzj)) {
                return false;
            }
        }
        return true;
    }

    private zzgxg(boolean z) {
        zzg();
        zzg();
    }
}
