package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzgwx implements zzhaw {
    private final zzgww zza;

    private zzgwx(zzgww zzgww) {
        zzgye.zzc(zzgww, "output");
        zzgww zzgww2 = zzgww;
        this.zza = zzgww;
        zzgww.zze = this;
    }

    public static zzgwx zza(zzgww zzgww) {
        zzgwx zzgwx = zzgww.zze;
        if (zzgwx != null) {
            return zzgwx;
        }
        return new zzgwx(zzgww);
    }

    public final void zzB(int i, int i2) throws IOException {
        this.zza.zzt(i, (i2 >> 31) ^ (i2 + i2));
    }

    public final void zzD(int i, long j) throws IOException {
        this.zza.zzv(i, (j >> 63) ^ (j + j));
    }

    @Deprecated
    public final void zzF(int i) throws IOException {
        this.zza.zzs(i, 3);
    }

    public final void zzG(int i, String str) throws IOException {
        this.zza.zzq(i, str);
    }

    public final void zzI(int i, int i2) throws IOException {
        this.zza.zzt(i, i2);
    }

    public final void zzK(int i, long j) throws IOException {
        this.zza.zzv(i, j);
    }

    public final void zzb(int i, boolean z) throws IOException {
        this.zza.zzM(i, z);
    }

    public final void zzd(int i, zzgwj zzgwj) throws IOException {
        this.zza.zzN(i, zzgwj);
    }

    public final void zze(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zzN(i, (zzgwj) list.get(i2));
        }
    }

    public final void zzf(int i, double d) throws IOException {
        this.zza.zzj(i, Double.doubleToRawLongBits(d));
    }

    @Deprecated
    public final void zzh(int i) throws IOException {
        this.zza.zzs(i, 4);
    }

    public final void zzi(int i, int i2) throws IOException {
        this.zza.zzl(i, i2);
    }

    public final void zzk(int i, int i2) throws IOException {
        this.zza.zzh(i, i2);
    }

    public final void zzm(int i, long j) throws IOException {
        this.zza.zzj(i, j);
    }

    public final void zzo(int i, float f) throws IOException {
        this.zza.zzh(i, Float.floatToRawIntBits(f));
    }

    public final void zzq(int i, Object obj, zzgzv zzgzv) throws IOException {
        zzgww zzgww = this.zza;
        zzgww.zzs(i, 3);
        zzgzv.zzj((zzgzc) obj, zzgww.zze);
        zzgww.zzs(i, 4);
    }

    public final void zzr(int i, int i2) throws IOException {
        this.zza.zzl(i, i2);
    }

    public final void zzt(int i, long j) throws IOException {
        this.zza.zzv(i, j);
    }

    public final void zzv(int i, Object obj, zzgzv zzgzv) throws IOException {
        this.zza.zzn(i, (zzgzc) obj, zzgzv);
    }

    public final void zzw(int i, Object obj) throws IOException {
        if (obj instanceof zzgwj) {
            this.zza.zzp(i, (zzgwj) obj);
        } else {
            this.zza.zzo(i, (zzgzc) obj);
        }
    }

    public final void zzx(int i, int i2) throws IOException {
        this.zza.zzh(i, i2);
    }

    public final void zzz(int i, long j) throws IOException {
        this.zza.zzj(i, j);
    }

    public final void zzH(int i, List list) throws IOException {
        int i2 = 0;
        if (list instanceof zzgyo) {
            zzgyo zzgyo = (zzgyo) list;
            while (i2 < list.size()) {
                Object zzc = zzgyo.zzc();
                if (zzc instanceof String) {
                    this.zza.zzq(i, (String) zzc);
                } else {
                    this.zza.zzN(i, (zzgwj) zzc);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzq(i, (String) list.get(i2));
            i2++;
        }
    }

    public final void zzJ(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (list instanceof zzgxs) {
            zzgxs zzgxs = (zzgxs) list;
            if (z) {
                this.zza.zzs(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzgxs.size(); i4++) {
                    i3 += zzgww.zzD(zzgxs.zzd(i4));
                }
                this.zza.zzu(i3);
                while (i2 < zzgxs.size()) {
                    this.zza.zzu(zzgxs.zzd(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zzgxs.size()) {
                this.zza.zzt(i, zzgxs.zzd(i2));
                i2++;
            }
        } else if (z) {
            this.zza.zzs(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                i5 += zzgww.zzD(((Integer) list.get(i6)).intValue());
            }
            this.zza.zzu(i5);
            while (i2 < list.size()) {
                this.zza.zzu(((Integer) list.get(i2)).intValue());
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.zza.zzt(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public final void zzL(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (list instanceof zzgyr) {
            zzgyr zzgyr = (zzgyr) list;
            if (z) {
                this.zza.zzs(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzgyr.size(); i4++) {
                    i3 += zzgww.zzE(zzgyr.zza(i4));
                }
                this.zza.zzu(i3);
                while (i2 < zzgyr.size()) {
                    this.zza.zzw(zzgyr.zza(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zzgyr.size()) {
                this.zza.zzv(i, zzgyr.zza(i2));
                i2++;
            }
        } else if (z) {
            this.zza.zzs(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                i5 += zzgww.zzE(((Long) list.get(i6)).longValue());
            }
            this.zza.zzu(i5);
            while (i2 < list.size()) {
                this.zza.zzw(((Long) list.get(i2)).longValue());
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.zza.zzv(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public final void zzl(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (list instanceof zzgxs) {
            zzgxs zzgxs = (zzgxs) list;
            if (z) {
                this.zza.zzs(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzgxs.size(); i4++) {
                    zzgxs.zzd(i4);
                    i3 += 4;
                }
                this.zza.zzu(i3);
                while (i2 < zzgxs.size()) {
                    this.zza.zzi(zzgxs.zzd(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zzgxs.size()) {
                this.zza.zzh(i, zzgxs.zzd(i2));
                i2++;
            }
        } else if (z) {
            this.zza.zzs(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                ((Integer) list.get(i6)).intValue();
                i5 += 4;
            }
            this.zza.zzu(i5);
            while (i2 < list.size()) {
                this.zza.zzi(((Integer) list.get(i2)).intValue());
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.zza.zzh(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public final void zzn(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (list instanceof zzgyr) {
            zzgyr zzgyr = (zzgyr) list;
            if (z) {
                this.zza.zzs(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzgyr.size(); i4++) {
                    zzgyr.zza(i4);
                    i3 += 8;
                }
                this.zza.zzu(i3);
                while (i2 < zzgyr.size()) {
                    this.zza.zzk(zzgyr.zza(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zzgyr.size()) {
                this.zza.zzj(i, zzgyr.zza(i2));
                i2++;
            }
        } else if (z) {
            this.zza.zzs(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                ((Long) list.get(i6)).longValue();
                i5 += 8;
            }
            this.zza.zzu(i5);
            while (i2 < list.size()) {
                this.zza.zzk(((Long) list.get(i2)).longValue());
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.zza.zzj(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public final void zzc(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (list instanceof zzgvz) {
            zzgvz zzgvz = (zzgvz) list;
            if (z) {
                this.zza.zzs(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzgvz.size(); i4++) {
                    zzgvz.zzh(i4);
                    i3++;
                }
                this.zza.zzu(i3);
                while (i2 < zzgvz.size()) {
                    this.zza.zzL(zzgvz.zzh(i2) ? (byte) 1 : 0);
                    i2++;
                }
                return;
            }
            while (i2 < zzgvz.size()) {
                this.zza.zzM(i, zzgvz.zzh(i2));
                i2++;
            }
        } else if (z) {
            this.zza.zzs(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                ((Boolean) list.get(i6)).booleanValue();
                i5++;
            }
            this.zza.zzu(i5);
            while (i2 < list.size()) {
                this.zza.zzL(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : 0);
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.zza.zzM(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
        }
    }

    public final void zzs(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (list instanceof zzgxs) {
            zzgxs zzgxs = (zzgxs) list;
            if (z) {
                this.zza.zzs(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzgxs.size(); i4++) {
                    i3 += zzgww.zzE((long) zzgxs.zzd(i4));
                }
                this.zza.zzu(i3);
                while (i2 < zzgxs.size()) {
                    this.zza.zzm(zzgxs.zzd(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zzgxs.size()) {
                this.zza.zzl(i, zzgxs.zzd(i2));
                i2++;
            }
        } else if (z) {
            this.zza.zzs(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                i5 += zzgww.zzE((long) ((Integer) list.get(i6)).intValue());
            }
            this.zza.zzu(i5);
            while (i2 < list.size()) {
                this.zza.zzm(((Integer) list.get(i2)).intValue());
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.zza.zzl(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public final void zzA(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (list instanceof zzgyr) {
            zzgyr zzgyr = (zzgyr) list;
            if (z) {
                this.zza.zzs(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzgyr.size(); i4++) {
                    zzgyr.zza(i4);
                    i3 += 8;
                }
                this.zza.zzu(i3);
                while (i2 < zzgyr.size()) {
                    this.zza.zzk(zzgyr.zza(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zzgyr.size()) {
                this.zza.zzj(i, zzgyr.zza(i2));
                i2++;
            }
        } else if (z) {
            this.zza.zzs(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                ((Long) list.get(i6)).longValue();
                i5 += 8;
            }
            this.zza.zzu(i5);
            while (i2 < list.size()) {
                this.zza.zzk(((Long) list.get(i2)).longValue());
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.zza.zzj(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public final void zzg(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (list instanceof zzgwy) {
            zzgwy zzgwy = (zzgwy) list;
            if (z) {
                this.zza.zzs(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzgwy.size(); i4++) {
                    zzgwy.zzd(i4);
                    i3 += 8;
                }
                this.zza.zzu(i3);
                while (i2 < zzgwy.size()) {
                    this.zza.zzk(Double.doubleToRawLongBits(zzgwy.zzd(i2)));
                    i2++;
                }
                return;
            }
            while (i2 < zzgwy.size()) {
                this.zza.zzj(i, Double.doubleToRawLongBits(zzgwy.zzd(i2)));
                i2++;
            }
        } else if (z) {
            this.zza.zzs(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                ((Double) list.get(i6)).doubleValue();
                i5 += 8;
            }
            this.zza.zzu(i5);
            while (i2 < list.size()) {
                this.zza.zzk(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.zza.zzj(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
        }
    }

    public final void zzp(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (list instanceof zzgxi) {
            zzgxi zzgxi = (zzgxi) list;
            if (z) {
                this.zza.zzs(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzgxi.size(); i4++) {
                    zzgxi.zzd(i4);
                    i3 += 4;
                }
                this.zza.zzu(i3);
                while (i2 < zzgxi.size()) {
                    this.zza.zzi(Float.floatToRawIntBits(zzgxi.zzd(i2)));
                    i2++;
                }
                return;
            }
            while (i2 < zzgxi.size()) {
                this.zza.zzh(i, Float.floatToRawIntBits(zzgxi.zzd(i2)));
                i2++;
            }
        } else if (z) {
            this.zza.zzs(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                ((Float) list.get(i6)).floatValue();
                i5 += 4;
            }
            this.zza.zzu(i5);
            while (i2 < list.size()) {
                this.zza.zzi(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.zza.zzh(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
        }
    }

    public final void zzy(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (list instanceof zzgxs) {
            zzgxs zzgxs = (zzgxs) list;
            if (z) {
                this.zza.zzs(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzgxs.size(); i4++) {
                    zzgxs.zzd(i4);
                    i3 += 4;
                }
                this.zza.zzu(i3);
                while (i2 < zzgxs.size()) {
                    this.zza.zzi(zzgxs.zzd(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zzgxs.size()) {
                this.zza.zzh(i, zzgxs.zzd(i2));
                i2++;
            }
        } else if (z) {
            this.zza.zzs(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                ((Integer) list.get(i6)).intValue();
                i5 += 4;
            }
            this.zza.zzu(i5);
            while (i2 < list.size()) {
                this.zza.zzi(((Integer) list.get(i2)).intValue());
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.zza.zzh(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public final void zzC(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (list instanceof zzgxs) {
            zzgxs zzgxs = (zzgxs) list;
            if (z) {
                this.zza.zzs(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzgxs.size(); i4++) {
                    int zzd = zzgxs.zzd(i4);
                    i3 += zzgww.zzD((zzd >> 31) ^ (zzd + zzd));
                }
                this.zza.zzu(i3);
                while (i2 < zzgxs.size()) {
                    zzgww zzgww = this.zza;
                    int zzd2 = zzgxs.zzd(i2);
                    zzgww.zzu((zzd2 >> 31) ^ (zzd2 + zzd2));
                    i2++;
                }
                return;
            }
            while (i2 < zzgxs.size()) {
                zzgww zzgww2 = this.zza;
                int zzd3 = zzgxs.zzd(i2);
                zzgww2.zzt(i, (zzd3 >> 31) ^ (zzd3 + zzd3));
                i2++;
            }
        } else if (z) {
            this.zza.zzs(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                int intValue = ((Integer) list.get(i6)).intValue();
                i5 += zzgww.zzD((intValue >> 31) ^ (intValue + intValue));
            }
            this.zza.zzu(i5);
            while (i2 < list.size()) {
                zzgww zzgww3 = this.zza;
                int intValue2 = ((Integer) list.get(i2)).intValue();
                zzgww3.zzu((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                zzgww zzgww4 = this.zza;
                int intValue3 = ((Integer) list.get(i2)).intValue();
                zzgww4.zzt(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
        }
    }

    public final void zzE(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (list instanceof zzgyr) {
            zzgyr zzgyr = (zzgyr) list;
            if (z) {
                this.zza.zzs(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzgyr.size(); i4++) {
                    long zza2 = zzgyr.zza(i4);
                    i3 += zzgww.zzE((zza2 >> 63) ^ (zza2 + zza2));
                }
                this.zza.zzu(i3);
                while (i2 < zzgyr.size()) {
                    zzgww zzgww = this.zza;
                    long zza3 = zzgyr.zza(i2);
                    zzgww.zzw((zza3 >> 63) ^ (zza3 + zza3));
                    i2++;
                }
                return;
            }
            while (i2 < zzgyr.size()) {
                zzgww zzgww2 = this.zza;
                long zza4 = zzgyr.zza(i2);
                zzgww2.zzv(i, (zza4 >> 63) ^ (zza4 + zza4));
                i2++;
            }
        } else if (z) {
            this.zza.zzs(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                long longValue = ((Long) list.get(i6)).longValue();
                i5 += zzgww.zzE((longValue >> 63) ^ (longValue + longValue));
            }
            this.zza.zzu(i5);
            while (i2 < list.size()) {
                zzgww zzgww3 = this.zza;
                long longValue2 = ((Long) list.get(i2)).longValue();
                zzgww3.zzw((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                zzgww zzgww4 = this.zza;
                long longValue3 = ((Long) list.get(i2)).longValue();
                zzgww4.zzv(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
                i2++;
            }
        }
    }

    public final void zzj(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (list instanceof zzgxs) {
            zzgxs zzgxs = (zzgxs) list;
            if (z) {
                this.zza.zzs(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzgxs.size(); i4++) {
                    i3 += zzgww.zzE((long) zzgxs.zzd(i4));
                }
                this.zza.zzu(i3);
                while (i2 < zzgxs.size()) {
                    this.zza.zzm(zzgxs.zzd(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zzgxs.size()) {
                this.zza.zzl(i, zzgxs.zzd(i2));
                i2++;
            }
        } else if (z) {
            this.zza.zzs(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                i5 += zzgww.zzE((long) ((Integer) list.get(i6)).intValue());
            }
            this.zza.zzu(i5);
            while (i2 < list.size()) {
                this.zza.zzm(((Integer) list.get(i2)).intValue());
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.zza.zzl(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public final void zzu(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (list instanceof zzgyr) {
            zzgyr zzgyr = (zzgyr) list;
            if (z) {
                this.zza.zzs(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < zzgyr.size(); i4++) {
                    i3 += zzgww.zzE(zzgyr.zza(i4));
                }
                this.zza.zzu(i3);
                while (i2 < zzgyr.size()) {
                    this.zza.zzw(zzgyr.zza(i2));
                    i2++;
                }
                return;
            }
            while (i2 < zzgyr.size()) {
                this.zza.zzv(i, zzgyr.zza(i2));
                i2++;
            }
        } else if (z) {
            this.zza.zzs(i, 2);
            int i5 = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                i5 += zzgww.zzE(((Long) list.get(i6)).longValue());
            }
            this.zza.zzu(i5);
            while (i2 < list.size()) {
                this.zza.zzw(((Long) list.get(i2)).longValue());
                i2++;
            }
        } else {
            while (i2 < list.size()) {
                this.zza.zzv(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }
}
