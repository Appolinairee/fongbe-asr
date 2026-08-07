package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzxd extends zzxo implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final String zzg;
    private final zzxh zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final boolean zzu;
    private final boolean zzv;
    private final boolean zzw;

    /* JADX WARNING: Removed duplicated region for block: B:106:0x011a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0142 A[EDGE_INSN: B:107:0x0142->B:74:0x0142 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00fd A[LOOP:1: B:55:0x00fa->B:57:0x00fd, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x016f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzxd(int r8, com.google.android.gms.internal.ads.zzbr r9, int r10, com.google.android.gms.internal.ads.zzxh r11, int r12, boolean r13, com.google.android.gms.internal.ads.zzfuo r14, int r15) {
        /*
            r7 = this;
            r7.<init>(r8, r9, r10)
            r7.zzh = r11
            boolean r8 = r11.zzM
            r9 = 24
            r10 = 1
            if (r10 == r8) goto L_0x000f
            r8 = 16
            goto L_0x0011
        L_0x000f:
            r8 = 24
        L_0x0011:
            boolean r15 = r11.zzI
            com.google.android.gms.internal.ads.zzab r15 = r7.zzd
            java.lang.String r15 = r15.zzd
            java.lang.String r15 = com.google.android.gms.internal.ads.zzxt.zzh(r15)
            r7.zzg = r15
            r15 = 0
            boolean r0 = com.google.android.gms.internal.ads.zzlk.zza(r12, r15)
            r7.zzi = r0
            r0 = 0
        L_0x0025:
            com.google.android.gms.internal.ads.zzfxn r1 = r11.zzo
            int r1 = r1.size()
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r0 >= r1) goto L_0x0044
            com.google.android.gms.internal.ads.zzab r1 = r7.zzd
            com.google.android.gms.internal.ads.zzfxn r3 = r11.zzo
            java.lang.Object r3 = r3.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            int r1 = com.google.android.gms.internal.ads.zzxt.zzc(r1, r3, r15)
            if (r1 <= 0) goto L_0x0041
            goto L_0x0048
        L_0x0041:
            int r0 = r0 + 1
            goto L_0x0025
        L_0x0044:
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = 0
        L_0x0048:
            r7.zzk = r0
            r7.zzj = r1
            com.google.android.gms.internal.ads.zzab r0 = r7.zzd
            int r0 = r0.zzf
            int r1 = r11.zzp
            int r0 = com.google.android.gms.internal.ads.zzxt.zzb(r0, r15)
            r7.zzl = r0
            com.google.android.gms.internal.ads.zzab r0 = r7.zzd
            int r1 = r0.zzf
            if (r1 == 0) goto L_0x0064
            r1 = r1 & r10
            if (r1 == 0) goto L_0x0062
            goto L_0x0064
        L_0x0062:
            r1 = 0
            goto L_0x0065
        L_0x0064:
            r1 = 1
        L_0x0065:
            r7.zzm = r1
            int r1 = r0.zze
            r1 = r1 & r10
            if (r10 == r1) goto L_0x006e
            r1 = 0
            goto L_0x006f
        L_0x006e:
            r1 = 1
        L_0x006f:
            r7.zzp = r1
            java.lang.String r1 = r0.zzo
            r3 = 2
            r4 = -1
            if (r1 != 0) goto L_0x0079
        L_0x0077:
            r1 = 0
            goto L_0x00b4
        L_0x0079:
            int r5 = r1.hashCode()
            r6 = -2123537834(0xffffffff816d6256, float:-4.3600578E-38)
            if (r5 == r6) goto L_0x00a1
            r6 = 187078297(0xb269699, float:3.2083734E-32)
            if (r5 == r6) goto L_0x0097
            r6 = 1504698186(0x59afdf4a, float:6.1879537E15)
            if (r5 == r6) goto L_0x008d
            goto L_0x00ab
        L_0x008d:
            java.lang.String r5 = "audio/iamf"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x00ab
            r1 = 2
            goto L_0x00ac
        L_0x0097:
            java.lang.String r5 = "audio/ac4"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x00ab
            r1 = 1
            goto L_0x00ac
        L_0x00a1:
            java.lang.String r5 = "audio/eac3-joc"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x00ab
            r1 = 0
            goto L_0x00ac
        L_0x00ab:
            r1 = -1
        L_0x00ac:
            if (r1 == 0) goto L_0x00b3
            if (r1 == r10) goto L_0x00b3
            if (r1 == r3) goto L_0x00b3
            goto L_0x0077
        L_0x00b3:
            r1 = 1
        L_0x00b4:
            r7.zzw = r1
            int r1 = r0.zzD
            r7.zzq = r1
            int r1 = r0.zzE
            r7.zzr = r1
            int r1 = r0.zzj
            r7.zzs = r1
            int r1 = r0.zzj
            if (r1 == r4) goto L_0x00c8
            int r1 = r11.zzr
        L_0x00c8:
            int r1 = r0.zzD
            if (r1 == r4) goto L_0x00ce
            int r1 = r11.zzq
        L_0x00ce:
            boolean r14 = r14.zza(r0)
            r7.zzf = r14
            android.content.res.Resources r14 = android.content.res.Resources.getSystem()
            android.content.res.Configuration r14 = r14.getConfiguration()
            int r0 = com.google.android.gms.internal.ads.zzei.zza
            if (r0 < r9) goto L_0x00ef
            android.os.LocaleList r9 = androidx.activity.ComponentDialog$$ExternalSyntheticApiModelOutline0.m((android.content.res.Configuration) r14)
            java.lang.String r9 = androidx.core.graphics.ColorKt$$ExternalSyntheticApiModelOutline0.m((android.os.LocaleList) r9)
            java.lang.String r14 = ","
            java.lang.String[] r9 = r9.split(r14, r4)
            goto L_0x00f9
        L_0x00ef:
            java.lang.String[] r9 = new java.lang.String[r10]
            java.util.Locale r14 = r14.locale
            java.lang.String r14 = r14.toLanguageTag()
            r9[r15] = r14
        L_0x00f9:
            r14 = 0
        L_0x00fa:
            int r0 = r9.length
            if (r14 >= r0) goto L_0x0108
            r0 = r9[r14]
            java.lang.String r0 = com.google.android.gms.internal.ads.zzei.zzE(r0)
            r9[r14] = r0
            int r14 = r14 + 1
            goto L_0x00fa
        L_0x0108:
            r14 = 0
        L_0x0109:
            int r0 = r9.length
            if (r14 >= r0) goto L_0x011a
            com.google.android.gms.internal.ads.zzab r0 = r7.zzd
            r1 = r9[r14]
            int r0 = com.google.android.gms.internal.ads.zzxt.zzc(r0, r1, r15)
            if (r0 <= 0) goto L_0x0117
            goto L_0x011e
        L_0x0117:
            int r14 = r14 + 1
            goto L_0x0109
        L_0x011a:
            r14 = 2147483647(0x7fffffff, float:NaN)
            r0 = 0
        L_0x011e:
            r7.zzn = r14
            r7.zzo = r0
            r9 = 0
        L_0x0123:
            com.google.android.gms.internal.ads.zzfxn r14 = r11.zzs
            int r14 = r14.size()
            if (r9 >= r14) goto L_0x0142
            com.google.android.gms.internal.ads.zzab r14 = r7.zzd
            java.lang.String r14 = r14.zzo
            if (r14 == 0) goto L_0x013f
            com.google.android.gms.internal.ads.zzfxn r0 = r11.zzs
            java.lang.Object r0 = r0.get(r9)
            boolean r14 = r14.equals(r0)
            if (r14 == 0) goto L_0x013f
            r2 = r9
            goto L_0x0142
        L_0x013f:
            int r9 = r9 + 1
            goto L_0x0123
        L_0x0142:
            r7.zzt = r2
            r9 = r12 & 384(0x180, float:5.38E-43)
            r11 = 128(0x80, float:1.794E-43)
            if (r9 != r11) goto L_0x014c
            r9 = 1
            goto L_0x014d
        L_0x014c:
            r9 = 0
        L_0x014d:
            r7.zzu = r9
            r9 = r12 & 64
            r11 = 64
            if (r9 != r11) goto L_0x0157
            r9 = 1
            goto L_0x0158
        L_0x0157:
            r9 = 0
        L_0x0158:
            r7.zzv = r9
            com.google.android.gms.internal.ads.zzxh r9 = r7.zzh
            boolean r11 = r9.zzO
            boolean r11 = com.google.android.gms.internal.ads.zzlk.zza(r12, r11)
            if (r11 != 0) goto L_0x0166
        L_0x0164:
            r10 = 0
            goto L_0x018d
        L_0x0166:
            boolean r11 = r7.zzf
            if (r11 != 0) goto L_0x016f
            boolean r14 = r9.zzH
            if (r14 != 0) goto L_0x016f
            goto L_0x0164
        L_0x016f:
            com.google.android.gms.internal.ads.zzbu r14 = r9.zzt
            boolean r14 = com.google.android.gms.internal.ads.zzlk.zza(r12, r15)
            if (r14 == 0) goto L_0x018d
            if (r11 == 0) goto L_0x018d
            com.google.android.gms.internal.ads.zzab r11 = r7.zzd
            int r11 = r11.zzj
            if (r11 == r4) goto L_0x018d
            boolean r11 = r9.zzA
            boolean r11 = r9.zzz
            boolean r9 = r9.zzQ
            if (r9 != 0) goto L_0x0189
            if (r13 != 0) goto L_0x018d
        L_0x0189:
            r8 = r8 & r12
            if (r8 == 0) goto L_0x018d
            r10 = 2
        L_0x018d:
            r7.zze = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxd.<init>(int, com.google.android.gms.internal.ads.zzbr, int, com.google.android.gms.internal.ads.zzxh, int, boolean, com.google.android.gms.internal.ads.zzfuo, int):void");
    }

    public final int zzb() {
        return this.zze;
    }

    public final /* bridge */ /* synthetic */ boolean zzc(zzxo zzxo) {
        String str;
        zzxd zzxd = (zzxd) zzxo;
        boolean z = this.zzh.zzK;
        zzab zzab = this.zzd;
        int i = zzab.zzD;
        if (i == -1) {
            return false;
        }
        zzab zzab2 = zzxd.zzd;
        if (i != zzab2.zzD || (str = zzab.zzo) == null || !TextUtils.equals(str, zzab2.zzo)) {
            return false;
        }
        zzxh zzxh = this.zzh;
        boolean z2 = zzxh.zzJ;
        int i2 = this.zzd.zzE;
        if (i2 == -1 || i2 != zzxd.zzd.zzE) {
            return false;
        }
        boolean z3 = zzxh.zzL;
        return this.zzu == zzxd.zzu && this.zzv == zzxd.zzv;
    }

    /* renamed from: zza */
    public final int compareTo(zzxd zzxd) {
        zzfyy zzfyy;
        if (!this.zzf || !this.zzi) {
            zzfyy = zzxt.zzc.zza();
        } else {
            zzfyy = zzxt.zzc;
        }
        zzfxc zzc = zzfxc.zzj().zzd(this.zzi, zzxd.zzi).zzc(Integer.valueOf(this.zzk), Integer.valueOf(zzxd.zzk), zzfyy.zzc().zza()).zzb(this.zzj, zzxd.zzj).zzb(this.zzl, zzxd.zzl).zzd(this.zzp, zzxd.zzp).zzd(this.zzm, zzxd.zzm).zzc(Integer.valueOf(this.zzn), Integer.valueOf(zzxd.zzn), zzfyy.zzc().zza()).zzb(this.zzo, zzxd.zzo).zzd(this.zzf, zzxd.zzf).zzc(Integer.valueOf(this.zzt), Integer.valueOf(zzxd.zzt), zzfyy.zzc().zza());
        boolean z = this.zzh.zzz;
        zzfxc zzc2 = zzc.zzd(this.zzu, zzxd.zzu).zzd(this.zzv, zzxd.zzv).zzd(this.zzw, zzxd.zzw).zzc(Integer.valueOf(this.zzq), Integer.valueOf(zzxd.zzq), zzfyy).zzc(Integer.valueOf(this.zzr), Integer.valueOf(zzxd.zzr), zzfyy);
        if (Objects.equals(this.zzg, zzxd.zzg)) {
            zzc2 = zzc2.zzc(Integer.valueOf(this.zzs), Integer.valueOf(zzxd.zzs), zzfyy);
        }
        return zzc2.zza();
    }
}
