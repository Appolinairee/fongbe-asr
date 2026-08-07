package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public abstract class zzxy extends zzyb {
    /* access modifiers changed from: protected */
    public abstract Pair zzd(zzxx zzxx, int[][][] iArr, int[] iArr2, zzug zzug, zzbq zzbq) throws zzib;

    public final zzyc zzo(zzlm[] zzlmArr, zzwj zzwj, zzug zzug, zzbq zzbq) throws zzib {
        boolean z;
        int[] iArr;
        zzwj zzwj2 = zzwj;
        int[] iArr2 = new int[3];
        zzbr[][] zzbrArr = new zzbr[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i2 = zzwj2.zzb;
            zzbrArr[i] = new zzbr[i2];
            iArr3[i] = new int[i2][];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            iArr4[i4] = zzlmArr[i4].zze();
        }
        int i5 = 0;
        while (i5 < zzwj2.zzb) {
            zzbr zzb = zzwj2.zzb(i5);
            int i6 = zzb.zzc;
            int i7 = 0;
            int i8 = 2;
            int i9 = 0;
            boolean z2 = true;
            while (i7 < i3) {
                zzlm zzlm = zzlmArr[i7];
                int i10 = 0;
                for (int i11 = 0; i11 < zzb.zza; i11++) {
                    i10 = Math.max(i10, zzlm.zzY(zzb.zzb(i11)) & 7);
                }
                boolean z3 = iArr2[i7] == 0;
                if (i10 > i9) {
                    z2 = z3;
                    i8 = i7;
                    i9 = i10;
                } else if (i10 == i9 && i6 == 5 && !z2 && z3) {
                    i8 = i7;
                    i9 = i10;
                    z2 = true;
                }
                i7++;
                i3 = 2;
            }
            if (i8 == i3) {
                iArr = new int[zzb.zza];
            } else {
                zzlm zzlm2 = zzlmArr[i8];
                int[] iArr5 = new int[zzb.zza];
                for (int i12 = 0; i12 < zzb.zza; i12++) {
                    iArr5[i12] = zzlm2.zzY(zzb.zzb(i12));
                }
                iArr = iArr5;
            }
            int i13 = iArr2[i8];
            zzbrArr[i8][i13] = zzb;
            iArr3[i8][i13] = iArr;
            iArr2[i8] = i13 + 1;
            i5++;
            i3 = 2;
        }
        zzwj[] zzwjArr = new zzwj[2];
        String[] strArr = new String[2];
        int[] iArr6 = new int[2];
        int i14 = 0;
        for (int i15 = 2; i14 < i15; i15 = 2) {
            int i16 = iArr2[i14];
            zzwjArr[i14] = new zzwj((zzbr[]) zzei.zzN(zzbrArr[i14], i16));
            iArr3[i14] = (int[][]) zzei.zzN(iArr3[i14], i16);
            strArr[i14] = zzlmArr[i14].zzU();
            iArr6[i14] = zzlmArr[i14].zzb();
            i14++;
        }
        zzxx zzxx = new zzxx(strArr, iArr6, zzwjArr, iArr4, iArr3, new zzwj((zzbr[]) zzei.zzN(zzbrArr[2], iArr2[2])));
        Pair zzd = zzd(zzxx, iArr3, iArr4, zzug, zzbq);
        zzxz[] zzxzArr = (zzxz[]) zzd.second;
        List[] listArr = new List[zzxzArr.length];
        for (int i17 = 0; i17 < zzxzArr.length; i17++) {
            zzxz zzxz = zzxzArr[i17];
            listArr[i17] = zzxz != null ? zzfxn.zzo(zzxz) : zzfxn.zzn();
        }
        zzfxk zzfxk = new zzfxk();
        for (int i18 = 0; i18 < 2; i18++) {
            zzwj zzd2 = zzxx.zzd(i18);
            List list = listArr[i18];
            for (int i19 = 0; i19 < zzd2.zzb; i19++) {
                zzbr zzb2 = zzd2.zzb(i19);
                boolean z4 = zzxx.zza(i18, i19, false) != 0;
                int i20 = zzb2.zza;
                int[] iArr7 = new int[i20];
                boolean[] zArr = new boolean[i20];
                for (int i21 = 0; i21 < zzb2.zza; i21++) {
                    iArr7[i21] = zzxx.zzb(i18, i19, i21) & 7;
                    int i22 = 0;
                    while (true) {
                        if (i22 >= list.size()) {
                            z = false;
                            break;
                        }
                        zzxz zzxz2 = (zzxz) list.get(i22);
                        if (zzxz2.zzg().equals(zzb2) && zzxz2.zzc(i21) != -1) {
                            z = true;
                            break;
                        }
                        i22++;
                    }
                    zArr[i21] = z;
                }
                zzfxk.zzf(new zzbx(zzb2, z4, iArr7, zArr));
            }
        }
        zzwj zze = zzxx.zze();
        for (int i23 = 0; i23 < zze.zzb; i23++) {
            zzbr zzb3 = zze.zzb(i23);
            int[] iArr8 = new int[zzb3.zza];
            Arrays.fill(iArr8, 0);
            zzfxk.zzf(new zzbx(zzb3, false, iArr8, new boolean[zzb3.zza]));
        }
        return new zzyc((zzln[]) zzd.first, (zzxv[]) zzd.second, new zzby(zzfxk.zzi()), zzxx);
    }

    public final void zzp(Object obj) {
        zzxx zzxx = (zzxx) obj;
    }
}
