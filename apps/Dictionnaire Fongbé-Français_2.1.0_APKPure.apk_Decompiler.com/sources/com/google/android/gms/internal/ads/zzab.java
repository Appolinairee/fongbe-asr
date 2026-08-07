package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzab {
    public static final /* synthetic */ int zzL = 0;
    public final byte[] zzA;
    public final int zzB;
    public final zzk zzC;
    public final int zzD;
    public final int zzE;
    public final int zzF;
    public final int zzG;
    public final int zzH;
    public final int zzI;
    public final int zzJ;
    public final int zzK;
    private int zzM;
    public final String zza;
    public final String zzb;
    public final List zzc;
    public final String zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final String zzk;
    public final zzay zzl;
    public final Object zzm;
    public final String zzn;
    public final String zzo;
    public final int zzp;
    public final int zzq;
    public final List zzr;
    public final zzu zzs;
    public final long zzt;
    public final boolean zzu;
    public final int zzv;
    public final int zzw;
    public final float zzx;
    public final int zzy;
    public final float zzz;

    static {
        new zzab(new zzz());
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(33, 36);
    }

    private zzab(zzz zzz2) {
        boolean z;
        String str;
        this.zza = zzz2.zza;
        String zzE2 = zzei.zzE(zzz2.zzd);
        this.zzd = zzE2;
        int i = 0;
        if (zzz2.zzc.isEmpty() && zzz2.zzb != null) {
            this.zzc = zzfxn.zzo(new zzad(zzE2, zzz2.zzb));
            this.zzb = zzz2.zzb;
        } else if (zzz2.zzc.isEmpty() || zzz2.zzb != null) {
            if (!zzz2.zzc.isEmpty() || zzz2.zzb != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= zzz2.zzc.size()) {
                        z = false;
                        break;
                    } else if (((zzad) zzz2.zzc.get(i2)).zzb.equals(zzz2.zzb)) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            z = true;
            zzcw.zzf(z);
            this.zzc = zzz2.zzc;
            this.zzb = zzz2.zzb;
        } else {
            this.zzc = zzz2.zzc;
            List zzap = zzz2.zzc;
            Iterator it = zzap.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((zzad) zzap.get(0)).zzb;
                    break;
                }
                zzad zzad = (zzad) it.next();
                if (TextUtils.equals(zzad.zza, zzE2)) {
                    str = zzad.zzb;
                    break;
                }
            }
            this.zzb = str;
        }
        this.zze = zzz2.zze;
        zzcw.zzg(true, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        this.zzf = zzz2.zzf;
        this.zzg = 0;
        int zzd2 = zzz2.zzh;
        this.zzh = zzd2;
        int zzn2 = zzz2.zzi;
        this.zzi = zzn2;
        this.zzj = zzn2 != -1 ? zzn2 : zzd2;
        this.zzk = zzz2.zzj;
        this.zzl = zzz2.zzk;
        this.zzm = null;
        this.zzn = zzz2.zzl;
        this.zzo = zzz2.zzm;
        this.zzp = zzz2.zzn;
        this.zzq = zzz2.zzo;
        this.zzr = zzz2.zzp == null ? Collections.emptyList() : zzz2.zzp;
        zzu zzw2 = zzz2.zzq;
        this.zzs = zzw2;
        this.zzt = zzz2.zzr;
        this.zzu = zzz2.zzs;
        this.zzv = zzz2.zzt;
        this.zzw = zzz2.zzu;
        this.zzx = zzz2.zzv;
        this.zzy = zzz2.zzw == -1 ? 0 : zzz2.zzw;
        this.zzz = zzz2.zzx == -1.0f ? 1.0f : zzz2.zzx;
        this.zzA = zzz2.zzy;
        this.zzB = zzz2.zzz;
        this.zzC = zzz2.zzA;
        this.zzD = zzz2.zzB;
        this.zzE = zzz2.zzC;
        this.zzF = zzz2.zzD;
        this.zzG = zzz2.zzE == -1 ? 0 : zzz2.zzE;
        this.zzH = zzz2.zzF != -1 ? zzz2.zzF : i;
        this.zzI = zzz2.zzG;
        this.zzJ = zzz2.zzH;
        if (zzz2.zzI != 0 || zzw2 == null) {
            this.zzK = zzz2.zzI;
        } else {
            this.zzK = 1;
        }
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzab zzab = (zzab) obj;
            int i2 = this.zzM;
            if ((i2 == 0 || (i = zzab.zzM) == 0 || i2 == i) && this.zze == zzab.zze && this.zzf == zzab.zzf && this.zzh == zzab.zzh && this.zzi == zzab.zzi && this.zzp == zzab.zzp && this.zzt == zzab.zzt && this.zzv == zzab.zzv && this.zzw == zzab.zzw && this.zzy == zzab.zzy && this.zzB == zzab.zzB && this.zzD == zzab.zzD && this.zzE == zzab.zzE && this.zzF == zzab.zzF && this.zzG == zzab.zzG && this.zzH == zzab.zzH && this.zzI == zzab.zzI && this.zzK == zzab.zzK && Float.compare(this.zzx, zzab.zzx) == 0 && Float.compare(this.zzz, zzab.zzz) == 0 && Objects.equals(this.zza, zzab.zza) && Objects.equals(this.zzb, zzab.zzb) && this.zzc.equals(zzab.zzc) && Objects.equals(this.zzk, zzab.zzk) && Objects.equals(this.zzn, zzab.zzn) && Objects.equals(this.zzo, zzab.zzo) && Objects.equals(this.zzd, zzab.zzd) && Arrays.equals(this.zzA, zzab.zzA) && Objects.equals(this.zzl, zzab.zzl) && Objects.equals(this.zzC, zzab.zzC) && Objects.equals(this.zzs, zzab.zzs) && zzd(zzab)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzC);
        return "Format(" + this.zza + ", " + this.zzb + ", " + this.zzn + ", " + this.zzo + ", " + this.zzk + ", " + this.zzj + ", " + this.zzd + ", [" + this.zzv + ", " + this.zzw + ", " + this.zzx + ", " + valueOf + "], [" + this.zzD + ", " + this.zzE + "])";
    }

    public final int zza() {
        int i;
        int i2 = this.zzv;
        if (i2 == -1 || (i = this.zzw) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final zzz zzb() {
        return new zzz(this, (zzaa) null);
    }

    public final zzab zzc(int i) {
        zzz zzz2 = new zzz(this, (zzaa) null);
        zzz2.zzD(i);
        return new zzab(zzz2);
    }

    public final boolean zzd(zzab zzab) {
        if (this.zzr.size() != zzab.zzr.size()) {
            return false;
        }
        for (int i = 0; i < this.zzr.size(); i++) {
            if (!Arrays.equals((byte[]) this.zzr.get(i), (byte[]) zzab.zzr.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.zzM;
        if (i7 != 0) {
            return i7;
        }
        String str = this.zza;
        int i8 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        String str2 = this.zzb;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int hashCode = ((((i + 527) * 31) + i2) * 31) + this.zzc.hashCode();
        String str3 = this.zzd;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int i9 = ((((((((((hashCode * 31) + i3) * 31) + this.zze) * 31) + this.zzf) * 961) + this.zzh) * 31) + this.zzi) * 31;
        String str4 = this.zzk;
        if (str4 == null) {
            i4 = 0;
        } else {
            i4 = str4.hashCode();
        }
        int i10 = (i9 + i4) * 31;
        zzay zzay = this.zzl;
        if (zzay == null) {
            i5 = 0;
        } else {
            i5 = zzay.hashCode();
        }
        int i11 = (i10 + i5) * 961;
        String str5 = this.zzn;
        if (str5 == null) {
            i6 = 0;
        } else {
            i6 = str5.hashCode();
        }
        int i12 = (i11 + i6) * 31;
        String str6 = this.zzo;
        if (str6 != null) {
            i8 = str6.hashCode();
        }
        int floatToIntBits = ((((((((((((((((((((((((((((((((((i12 + i8) * 31) + this.zzp) * 31) + ((int) this.zzt)) * 31) + this.zzv) * 31) + this.zzw) * 31) + Float.floatToIntBits(this.zzx)) * 31) + this.zzy) * 31) + Float.floatToIntBits(this.zzz)) * 31) + this.zzB) * 31) + this.zzD) * 31) + this.zzE) * 31) + this.zzF) * 31) + this.zzG) * 31) + this.zzH) * 31) + this.zzI) * 31) - 1) * 31) - 1) * 31) + this.zzK;
        this.zzM = floatToIntBits;
        return floatToIntBits;
    }
}
