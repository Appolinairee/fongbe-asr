package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzxr extends zzxo {
    private final boolean zze;
    private final zzxh zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final boolean zzs;
    private final boolean zzt;
    private final int zzu;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r2 <= 2.14748365E9f) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0048, code lost:
        if (r1 >= 0) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0050, code lost:
        if (r1 >= 0) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005d, code lost:
        if (r1 >= 0.0f) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0065, code lost:
        if (r12 >= 0) goto L_0x0067;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x00af A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0103 A[EDGE_INSN: B:134:0x0103->B:73:0x0103 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0124  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzxr(int r5, com.google.android.gms.internal.ads.zzbr r6, int r7, com.google.android.gms.internal.ads.zzxh r8, int r9, java.lang.String r10, int r11, boolean r12) {
        /*
            r4 = this;
            r4.<init>(r5, r6, r7)
            r4.zzf = r8
            boolean r5 = r8.zzF
            r6 = 1
            if (r6 == r5) goto L_0x000d
            r5 = 16
            goto L_0x000f
        L_0x000d:
            r5 = 24
        L_0x000f:
            boolean r7 = r8.zzE
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            r11 = -1
            r0 = 0
            if (r12 == 0) goto L_0x003b
            com.google.android.gms.internal.ads.zzab r1 = r4.zzd
            int r2 = r1.zzv
            if (r2 == r11) goto L_0x001f
            int r2 = r8.zza
        L_0x001f:
            int r2 = r1.zzw
            if (r2 == r11) goto L_0x0025
            int r2 = r8.zzb
        L_0x0025:
            float r2 = r1.zzx
            int r3 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0033
            int r3 = r8.zzc
            r3 = 1325400064(0x4f000000, float:2.14748365E9)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x003b
        L_0x0033:
            int r1 = r1.zzj
            if (r1 == r11) goto L_0x0039
            int r1 = r8.zzd
        L_0x0039:
            r1 = 1
            goto L_0x003c
        L_0x003b:
            r1 = 0
        L_0x003c:
            r4.zze = r1
            if (r12 == 0) goto L_0x0069
            com.google.android.gms.internal.ads.zzab r12 = r4.zzd
            int r1 = r12.zzv
            if (r1 == r11) goto L_0x004a
            int r2 = r8.zze
            if (r1 < 0) goto L_0x0069
        L_0x004a:
            int r1 = r12.zzw
            if (r1 == r11) goto L_0x0052
            int r2 = r8.zzf
            if (r1 < 0) goto L_0x0069
        L_0x0052:
            float r1 = r12.zzx
            int r2 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x005f
            int r2 = r8.zzg
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x0069
        L_0x005f:
            int r12 = r12.zzj
            if (r12 == r11) goto L_0x0067
            int r1 = r8.zzh
            if (r12 < 0) goto L_0x0069
        L_0x0067:
            r12 = 1
            goto L_0x006a
        L_0x0069:
            r12 = 0
        L_0x006a:
            r4.zzg = r12
            boolean r12 = com.google.android.gms.internal.ads.zzlk.zza(r9, r0)
            r4.zzh = r12
            com.google.android.gms.internal.ads.zzab r12 = r4.zzd
            float r1 = r12.zzx
            int r7 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x0082
            r7 = 1092616192(0x41200000, float:10.0)
            int r7 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r7 < 0) goto L_0x0082
            r7 = 1
            goto L_0x0083
        L_0x0082:
            r7 = 0
        L_0x0083:
            r4.zzi = r7
            int r7 = r12.zzj
            r4.zzj = r7
            int r7 = r12.zza()
            r4.zzk = r7
            r7 = 0
        L_0x0090:
            com.google.android.gms.internal.ads.zzfxn r12 = r8.zzm
            int r12 = r12.size()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r7 >= r12) goto L_0x00af
            com.google.android.gms.internal.ads.zzab r12 = r4.zzd
            com.google.android.gms.internal.ads.zzfxn r2 = r8.zzm
            java.lang.Object r2 = r2.get(r7)
            java.lang.String r2 = (java.lang.String) r2
            int r12 = com.google.android.gms.internal.ads.zzxt.zzc(r12, r2, r0)
            if (r12 <= 0) goto L_0x00ac
            goto L_0x00b3
        L_0x00ac:
            int r7 = r7 + 1
            goto L_0x0090
        L_0x00af:
            r7 = 2147483647(0x7fffffff, float:NaN)
            r12 = 0
        L_0x00b3:
            r4.zzm = r7
            r4.zzn = r12
            com.google.android.gms.internal.ads.zzab r7 = r4.zzd
            int r7 = r7.zzf
            int r12 = r8.zzn
            int r7 = com.google.android.gms.internal.ads.zzxt.zzb(r7, r0)
            r4.zzo = r7
            com.google.android.gms.internal.ads.zzab r7 = r4.zzd
            int r7 = r7.zzf
            if (r7 == 0) goto L_0x00cf
            r7 = r7 & r6
            if (r7 == 0) goto L_0x00cd
            goto L_0x00cf
        L_0x00cd:
            r7 = 0
            goto L_0x00d0
        L_0x00cf:
            r7 = 1
        L_0x00d0:
            r4.zzp = r7
            java.lang.String r7 = com.google.android.gms.internal.ads.zzxt.zzh(r10)
            if (r7 != 0) goto L_0x00da
            r7 = 1
            goto L_0x00db
        L_0x00da:
            r7 = 0
        L_0x00db:
            com.google.android.gms.internal.ads.zzab r12 = r4.zzd
            int r7 = com.google.android.gms.internal.ads.zzxt.zzc(r12, r10, r7)
            r4.zzq = r7
            r7 = 0
        L_0x00e4:
            com.google.android.gms.internal.ads.zzfxn r10 = r8.zzl
            int r10 = r10.size()
            if (r7 >= r10) goto L_0x0103
            com.google.android.gms.internal.ads.zzab r10 = r4.zzd
            java.lang.String r10 = r10.zzo
            if (r10 == 0) goto L_0x0100
            com.google.android.gms.internal.ads.zzfxn r12 = r8.zzl
            java.lang.Object r12 = r12.get(r7)
            boolean r10 = r10.equals(r12)
            if (r10 == 0) goto L_0x0100
            r1 = r7
            goto L_0x0103
        L_0x0100:
            int r7 = r7 + 1
            goto L_0x00e4
        L_0x0103:
            r4.zzl = r1
            r7 = r9 & 384(0x180, float:5.38E-43)
            r8 = 128(0x80, float:1.794E-43)
            if (r7 != r8) goto L_0x010d
            r7 = 1
            goto L_0x010e
        L_0x010d:
            r7 = 0
        L_0x010e:
            r4.zzs = r7
            r7 = r9 & 64
            r8 = 64
            if (r7 != r8) goto L_0x0118
            r7 = 1
            goto L_0x0119
        L_0x0118:
            r7 = 0
        L_0x0119:
            r4.zzt = r7
            com.google.android.gms.internal.ads.zzab r7 = r4.zzd
            java.lang.String r8 = r7.zzo
            r10 = 2
            if (r8 != 0) goto L_0x0124
        L_0x0122:
            r1 = 0
            goto L_0x0173
        L_0x0124:
            int r12 = r8.hashCode()
            r1 = 4
            r2 = 3
            switch(r12) {
                case -1851077871: goto L_0x0156;
                case -1662735862: goto L_0x014c;
                case -1662541442: goto L_0x0142;
                case 1331836730: goto L_0x0138;
                case 1599127257: goto L_0x012e;
                default: goto L_0x012d;
            }
        L_0x012d:
            goto L_0x0160
        L_0x012e:
            java.lang.String r12 = "video/x-vnd.on2.vp9"
            boolean r8 = r8.equals(r12)
            if (r8 == 0) goto L_0x0160
            r8 = 3
            goto L_0x0161
        L_0x0138:
            java.lang.String r12 = "video/avc"
            boolean r8 = r8.equals(r12)
            if (r8 == 0) goto L_0x0160
            r8 = 4
            goto L_0x0161
        L_0x0142:
            java.lang.String r12 = "video/hevc"
            boolean r8 = r8.equals(r12)
            if (r8 == 0) goto L_0x0160
            r8 = 2
            goto L_0x0161
        L_0x014c:
            java.lang.String r12 = "video/av01"
            boolean r8 = r8.equals(r12)
            if (r8 == 0) goto L_0x0160
            r8 = 1
            goto L_0x0161
        L_0x0156:
            java.lang.String r12 = "video/dolby-vision"
            boolean r8 = r8.equals(r12)
            if (r8 == 0) goto L_0x0160
            r8 = 0
            goto L_0x0161
        L_0x0160:
            r8 = -1
        L_0x0161:
            if (r8 == 0) goto L_0x0172
            if (r8 == r6) goto L_0x0173
            if (r8 == r10) goto L_0x0170
            if (r8 == r2) goto L_0x016e
            if (r8 == r1) goto L_0x016c
            goto L_0x0122
        L_0x016c:
            r1 = 1
            goto L_0x0173
        L_0x016e:
            r1 = 2
            goto L_0x0173
        L_0x0170:
            r1 = 3
            goto L_0x0173
        L_0x0172:
            r1 = 5
        L_0x0173:
            r4.zzu = r1
            int r8 = r7.zzf
            r8 = r8 & 16384(0x4000, float:2.2959E-41)
            if (r8 == 0) goto L_0x017d
        L_0x017b:
            r6 = 0
            goto L_0x01a9
        L_0x017d:
            com.google.android.gms.internal.ads.zzxh r8 = r4.zzf
            boolean r12 = r8.zzO
            boolean r12 = com.google.android.gms.internal.ads.zzlk.zza(r9, r12)
            if (r12 != 0) goto L_0x0188
            goto L_0x017b
        L_0x0188:
            boolean r12 = r4.zze
            if (r12 != 0) goto L_0x0191
            boolean r1 = r8.zzD
            if (r1 != 0) goto L_0x0191
            goto L_0x017b
        L_0x0191:
            boolean r0 = com.google.android.gms.internal.ads.zzlk.zza(r9, r0)
            if (r0 == 0) goto L_0x01a9
            boolean r0 = r4.zzg
            if (r0 == 0) goto L_0x01a9
            if (r12 == 0) goto L_0x01a9
            int r7 = r7.zzj
            if (r7 == r11) goto L_0x01a9
            boolean r7 = r8.zzA
            boolean r7 = r8.zzz
            r5 = r5 & r9
            if (r5 == 0) goto L_0x01a9
            r6 = 2
        L_0x01a9:
            r4.zzr = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxr.<init>(int, com.google.android.gms.internal.ads.zzbr, int, com.google.android.gms.internal.ads.zzxh, int, java.lang.String, int, boolean):void");
    }

    public static /* synthetic */ int zza(zzxr zzxr, zzxr zzxr2) {
        zzfyy zzfyy;
        if (!zzxr.zze || !zzxr.zzh) {
            zzfyy = zzxt.zzc.zza();
        } else {
            zzfyy = zzxt.zzc;
        }
        zzfxc zzj2 = zzfxc.zzj();
        boolean z = zzxr.zzf.zzz;
        return zzj2.zzc(Integer.valueOf(zzxr.zzk), Integer.valueOf(zzxr2.zzk), zzfyy).zzc(Integer.valueOf(zzxr.zzj), Integer.valueOf(zzxr2.zzj), zzfyy).zza();
    }

    public static /* synthetic */ int zzd(zzxr zzxr, zzxr zzxr2) {
        zzfxc zzd = zzfxc.zzj().zzd(zzxr.zzh, zzxr2.zzh).zzc(Integer.valueOf(zzxr.zzm), Integer.valueOf(zzxr2.zzm), zzfyy.zzc().zza()).zzb(zzxr.zzn, zzxr2.zzn).zzb(zzxr.zzo, zzxr2.zzo).zzd(zzxr.zzp, zzxr2.zzp).zzb(zzxr.zzq, zzxr2.zzq).zzd(zzxr.zzi, zzxr2.zzi).zzd(zzxr.zze, zzxr2.zze).zzd(zzxr.zzg, zzxr2.zzg).zzc(Integer.valueOf(zzxr.zzl), Integer.valueOf(zzxr2.zzl), zzfyy.zzc().zza()).zzd(zzxr.zzs, zzxr2.zzs).zzd(zzxr.zzt, zzxr2.zzt);
        if (zzxr.zzs && zzxr.zzt) {
            zzd = zzd.zzb(zzxr.zzu, zzxr2.zzu);
        }
        return zzd.zza();
    }

    public final int zzb() {
        return this.zzr;
    }

    public final /* bridge */ /* synthetic */ boolean zzc(zzxo zzxo) {
        zzxr zzxr = (zzxr) zzxo;
        if (!Objects.equals(this.zzd.zzo, zzxr.zzd.zzo)) {
            return false;
        }
        boolean z = this.zzf.zzG;
        return this.zzs == zzxr.zzs && this.zzt == zzxr.zzt;
    }
}
