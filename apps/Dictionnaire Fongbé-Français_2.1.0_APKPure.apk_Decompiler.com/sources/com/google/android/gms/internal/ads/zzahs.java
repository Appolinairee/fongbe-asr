package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzahs implements zzacn {
    private final zzdy zza;
    private final zzadf zzb;
    private final zzadb zzc;
    private final zzadd zzd;
    private final zzadt zze;
    private zzacq zzf;
    private zzadt zzg;
    private zzadt zzh;
    private int zzi;
    private zzay zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private zzahu zzp;
    private boolean zzq;

    public zzahs() {
        throw null;
    }

    public zzahs(int i) {
        this.zza = new zzdy(10);
        this.zzb = new zzadf();
        this.zzc = new zzadb();
        this.zzk = -9223372036854775807L;
        this.zzd = new zzadd();
        zzaci zzaci = new zzaci();
        this.zze = zzaci;
        this.zzh = zzaci;
        this.zzn = -1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: com.google.android.gms.internal.ads.zzahp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: com.google.android.gms.internal.ads.zzahp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v37, resolved type: com.google.android.gms.internal.ads.zzaht} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v45, resolved type: com.google.android.gms.internal.ads.zzahp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v48, resolved type: com.google.android.gms.internal.ads.zzahp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v59, resolved type: com.google.android.gms.internal.ads.zzahp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v19, resolved type: com.google.android.gms.internal.ads.zzahp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v60, resolved type: com.google.android.gms.internal.ads.zzahp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v61, resolved type: com.google.android.gms.internal.ads.zzahx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v62, resolved type: com.google.android.gms.internal.ads.zzahv} */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v39 */
    /* JADX WARNING: type inference failed for: r3v40, types: [com.google.android.gms.internal.ads.zzahr] */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01be, code lost:
        if (r2 != null) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01c0, code lost:
        r2 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x023a  */
    /* JADX WARNING: Unknown variable types count: 1 */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput", "realTrackOutput"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzg(com.google.android.gms.internal.ads.zzaco r35) throws java.io.IOException {
        /*
            r34 = this;
            r0 = r34
            r1 = r35
            int r2 = r0.zzi
            r3 = -1
            r4 = 0
            if (r2 != 0) goto L_0x000f
            r0.zzm(r1, r4)     // Catch:{ EOFException -> 0x000e }
            goto L_0x000f
        L_0x000e:
            return r3
        L_0x000f:
            com.google.android.gms.internal.ads.zzahu r2 = r0.zzp
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = 1
            if (r2 != 0) goto L_0x0253
            com.google.android.gms.internal.ads.zzadf r2 = r0.zzb
            com.google.android.gms.internal.ads.zzdy r14 = new com.google.android.gms.internal.ads.zzdy
            int r2 = r2.zzc
            r14.<init>((int) r2)
            byte[] r2 = r14.zzN()
            com.google.android.gms.internal.ads.zzadf r9 = r0.zzb
            int r9 = r9.zzc
            r1.zzh(r2, r4, r9)
            com.google.android.gms.internal.ads.zzadf r2 = r0.zzb
            int r9 = r2.zza
            r9 = r9 & r8
            r10 = 36
            r11 = 21
            if (r9 == 0) goto L_0x003f
            int r2 = r2.zze
            if (r2 == r8) goto L_0x0046
            r11 = 36
            goto L_0x0046
        L_0x003f:
            int r2 = r2.zze
            if (r2 == r8) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            r11 = 13
        L_0x0046:
            int r2 = r14.zze()
            int r9 = r11 + 4
            r12 = 1231971951(0x496e666f, float:976486.94)
            r13 = 1447187017(0x56425249, float:5.3414667E13)
            r15 = 1483304551(0x58696e67, float:1.02664153E15)
            if (r2 < r9) goto L_0x0066
            r14.zzL(r11)
            int r2 = r14.zzg()
            if (r2 == r15) goto L_0x007c
            if (r2 != r12) goto L_0x0066
            r2 = 1231971951(0x496e666f, float:976486.94)
            goto L_0x007c
        L_0x0066:
            int r2 = r14.zze()
            r9 = 40
            if (r2 < r9) goto L_0x007b
            r14.zzL(r10)
            int r2 = r14.zzg()
            if (r2 != r13) goto L_0x007b
            r2 = 1447187017(0x56425249, float:5.3414667E13)
            goto L_0x007c
        L_0x007b:
            r2 = 0
        L_0x007c:
            if (r2 == r12) goto L_0x009f
            if (r2 == r13) goto L_0x0088
            if (r2 == r15) goto L_0x009f
            r35.zzj()
        L_0x0085:
            r2 = 0
            goto L_0x015e
        L_0x0088:
            long r9 = r35.zzd()
            long r11 = r35.zzf()
            com.google.android.gms.internal.ads.zzadf r13 = r0.zzb
            com.google.android.gms.internal.ads.zzahv r2 = com.google.android.gms.internal.ads.zzahv.zzb(r9, r11, r13, r14)
            com.google.android.gms.internal.ads.zzadf r9 = r0.zzb
            int r9 = r9.zzc
            r1.zzk(r9)
            goto L_0x015e
        L_0x009f:
            com.google.android.gms.internal.ads.zzadf r9 = r0.zzb
            com.google.android.gms.internal.ads.zzahw r9 = com.google.android.gms.internal.ads.zzahw.zzb(r9, r14)
            com.google.android.gms.internal.ads.zzadb r10 = r0.zzc
            boolean r11 = r10.zza()
            if (r11 != 0) goto L_0x00b9
            int r11 = r9.zzd
            if (r11 == r3) goto L_0x00b9
            int r12 = r9.zze
            if (r12 == r3) goto L_0x00b9
            r10.zza = r11
            r10.zzb = r12
        L_0x00b9:
            long r10 = r35.zzf()
            long r12 = r35.zzd()
            r16 = -1
            int r14 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r14 == 0) goto L_0x00fa
            long r12 = r9.zzc
            int r14 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r14 == 0) goto L_0x00fa
            long r18 = r35.zzd()
            long r12 = r12 + r10
            int r14 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x00fa
            long r7 = r35.zzd()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r3 = "Data size mismatch between stream ("
            r14.<init>(r3)
            r14.append(r7)
            java.lang.String r3 = ") and Xing frame ("
            r14.append(r3)
            r14.append(r12)
            java.lang.String r3 = "), using Xing value."
            r14.append(r3)
            java.lang.String r3 = r14.toString()
            java.lang.String r7 = "Mp3Extractor"
            com.google.android.gms.internal.ads.zzdo.zze(r7, r3)
        L_0x00fa:
            com.google.android.gms.internal.ads.zzadf r3 = r0.zzb
            int r3 = r3.zzc
            r1.zzk(r3)
            if (r2 != r15) goto L_0x0108
            com.google.android.gms.internal.ads.zzahx r2 = com.google.android.gms.internal.ads.zzahx.zzb(r9, r10)
            goto L_0x015e
        L_0x0108:
            long r2 = r35.zzd()
            long r24 = r9.zza()
            int r7 = (r24 > r5 ? 1 : (r24 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0116
            goto L_0x0085
        L_0x0116:
            long r7 = r9.zzc
            int r12 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r12 == 0) goto L_0x0127
            long r2 = r10 + r7
            com.google.android.gms.internal.ads.zzadf r12 = r9.zza
            int r12 = r12.zzc
        L_0x0122:
            long r12 = (long) r12
            long r7 = r7 - r12
            r27 = r2
            goto L_0x0132
        L_0x0127:
            int r7 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r7 == 0) goto L_0x0085
            long r7 = r2 - r10
            com.google.android.gms.internal.ads.zzadf r12 = r9.zza
            int r12 = r12.zzc
            goto L_0x0122
        L_0x0132:
            r22 = 8000000(0x7a1200, double:3.952525E-317)
            java.math.RoundingMode r26 = java.math.RoundingMode.HALF_UP
            r20 = r7
            long r2 = com.google.android.gms.internal.ads.zzei.zzu(r20, r22, r24, r26)
            int r31 = com.google.android.gms.internal.ads.zzgaq.zzb(r2)
            long r2 = r9.zzb
            java.math.RoundingMode r12 = java.math.RoundingMode.HALF_UP
            long r2 = com.google.android.gms.internal.ads.zzgal.zzb(r7, r2, r12)
            int r32 = com.google.android.gms.internal.ads.zzgaq.zzb(r2)
            com.google.android.gms.internal.ads.zzadf r2 = r9.zza
            com.google.android.gms.internal.ads.zzahp r3 = new com.google.android.gms.internal.ads.zzahp
            int r2 = r2.zzc
            long r7 = (long) r2
            long r29 = r10 + r7
            r33 = 0
            r26 = r3
            r26.<init>(r27, r29, r31, r32, r33)
            r2 = r3
        L_0x015e:
            com.google.android.gms.internal.ads.zzay r3 = r0.zzj
            long r7 = r35.zzf()
            if (r3 == 0) goto L_0x01af
            int r9 = r3.zza()
            r10 = 0
        L_0x016b:
            if (r10 >= r9) goto L_0x01af
            com.google.android.gms.internal.ads.zzax r11 = r3.zzb(r10)
            boolean r12 = r11 instanceof com.google.android.gms.internal.ads.zzagm
            if (r12 == 0) goto L_0x01ac
            com.google.android.gms.internal.ads.zzagm r11 = (com.google.android.gms.internal.ads.zzagm) r11
            int r9 = r3.zza()
            r10 = 0
        L_0x017c:
            if (r10 >= r9) goto L_0x01a6
            com.google.android.gms.internal.ads.zzax r12 = r3.zzb(r10)
            boolean r13 = r12 instanceof com.google.android.gms.internal.ads.zzagq
            if (r13 == 0) goto L_0x01a3
            com.google.android.gms.internal.ads.zzagq r12 = (com.google.android.gms.internal.ads.zzagq) r12
            java.lang.String r13 = r12.zzf
            java.lang.String r14 = "TLEN"
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L_0x01a3
            com.google.android.gms.internal.ads.zzfxn r3 = r12.zzb
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            long r9 = java.lang.Long.parseLong(r3)
            long r9 = com.google.android.gms.internal.ads.zzei.zzs(r9)
            goto L_0x01a7
        L_0x01a3:
            int r10 = r10 + 1
            goto L_0x017c
        L_0x01a6:
            r9 = r5
        L_0x01a7:
            com.google.android.gms.internal.ads.zzahr r3 = com.google.android.gms.internal.ads.zzahr.zzb(r7, r11, r9)
            goto L_0x01b0
        L_0x01ac:
            int r10 = r10 + 1
            goto L_0x016b
        L_0x01af:
            r3 = 0
        L_0x01b0:
            boolean r7 = r0.zzq
            if (r7 == 0) goto L_0x01ba
            com.google.android.gms.internal.ads.zzaht r2 = new com.google.android.gms.internal.ads.zzaht
            r2.<init>()
            goto L_0x01f6
        L_0x01ba:
            if (r3 == 0) goto L_0x01be
            r2 = r3
            goto L_0x01c1
        L_0x01be:
            if (r2 != 0) goto L_0x01c1
            r2 = 0
        L_0x01c1:
            if (r2 == 0) goto L_0x01c7
            r2.zzh()
            goto L_0x01f6
        L_0x01c7:
            com.google.android.gms.internal.ads.zzdy r2 = r0.zza
            byte[] r2 = r2.zzN()
            r3 = 4
            r1.zzh(r2, r4, r3)
            com.google.android.gms.internal.ads.zzdy r2 = r0.zza
            r2.zzL(r4)
            com.google.android.gms.internal.ads.zzadf r2 = r0.zzb
            com.google.android.gms.internal.ads.zzdy r3 = r0.zza
            int r3 = r3.zzg()
            r2.zza(r3)
            com.google.android.gms.internal.ads.zzahp r2 = new com.google.android.gms.internal.ads.zzahp
            long r8 = r35.zzd()
            long r10 = r35.zzf()
            com.google.android.gms.internal.ads.zzadf r3 = r0.zzb
            int r12 = r3.zzf
            int r13 = r3.zzc
            r14 = 0
            r7 = r2
            r7.<init>(r8, r10, r12, r13, r14)
        L_0x01f6:
            r0.zzp = r2
            com.google.android.gms.internal.ads.zzacq r3 = r0.zzf
            r3.zzO(r2)
            com.google.android.gms.internal.ads.zzz r2 = new com.google.android.gms.internal.ads.zzz
            r2.<init>()
            com.google.android.gms.internal.ads.zzadf r3 = r0.zzb
            java.lang.String r3 = r3.zzb
            r2.zzaa(r3)
            r3 = 4096(0x1000, float:5.74E-42)
            r2.zzR(r3)
            com.google.android.gms.internal.ads.zzadf r3 = r0.zzb
            int r3 = r3.zze
            r2.zzz(r3)
            com.google.android.gms.internal.ads.zzadf r3 = r0.zzb
            int r3 = r3.zzd
            r2.zzab(r3)
            com.google.android.gms.internal.ads.zzadb r3 = r0.zzc
            int r3 = r3.zza
            r2.zzG(r3)
            com.google.android.gms.internal.ads.zzadb r3 = r0.zzc
            int r3 = r3.zzb
            r2.zzH(r3)
            com.google.android.gms.internal.ads.zzay r3 = r0.zzj
            r2.zzT(r3)
            com.google.android.gms.internal.ads.zzahu r3 = r0.zzp
            int r3 = r3.zzc()
            r7 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            if (r3 == r7) goto L_0x0243
            com.google.android.gms.internal.ads.zzahu r3 = r0.zzp
            int r3 = r3.zzc()
            r2.zzy(r3)
        L_0x0243:
            com.google.android.gms.internal.ads.zzadt r3 = r0.zzh
            com.google.android.gms.internal.ads.zzab r2 = r2.zzag()
            r3.zzm(r2)
            long r2 = r35.zzf()
            r0.zzm = r2
            goto L_0x0268
        L_0x0253:
            long r2 = r0.zzm
            r7 = 0
            int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x0268
            long r7 = r35.zzf()
            int r9 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r9 >= 0) goto L_0x0268
            long r2 = r2 - r7
            int r3 = (int) r2
            r1.zzk(r3)
        L_0x0268:
            int r2 = r0.zzo
            if (r2 != 0) goto L_0x02d3
            r35.zzj()
            boolean r2 = r34.zzl(r35)
            if (r2 == 0) goto L_0x0276
            goto L_0x02dd
        L_0x0276:
            com.google.android.gms.internal.ads.zzdy r2 = r0.zza
            r2.zzL(r4)
            com.google.android.gms.internal.ads.zzdy r2 = r0.zza
            int r2 = r2.zzg()
            int r3 = r0.zzi
            long r7 = (long) r3
            boolean r3 = zzk(r2, r7)
            if (r3 == 0) goto L_0x02cc
            int r3 = com.google.android.gms.internal.ads.zzadg.zzb(r2)
            r7 = -1
            if (r3 != r7) goto L_0x0292
            goto L_0x02cc
        L_0x0292:
            com.google.android.gms.internal.ads.zzadf r3 = r0.zzb
            r3.zza(r2)
            long r2 = r0.zzk
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x02a9
            com.google.android.gms.internal.ads.zzahu r2 = r0.zzp
            long r5 = r35.zzf()
            long r2 = r2.zze(r5)
            r0.zzk = r2
        L_0x02a9:
            com.google.android.gms.internal.ads.zzadf r2 = r0.zzb
            int r3 = r2.zzc
            r0.zzo = r3
            long r5 = r35.zzf()
            long r7 = (long) r3
            long r5 = r5 + r7
            r0.zzn = r5
            com.google.android.gms.internal.ads.zzahu r5 = r0.zzp
            boolean r6 = r5 instanceof com.google.android.gms.internal.ads.zzahq
            if (r6 != 0) goto L_0x02bf
            r2 = r3
            goto L_0x02d3
        L_0x02bf:
            com.google.android.gms.internal.ads.zzahq r5 = (com.google.android.gms.internal.ads.zzahq) r5
            long r3 = r0.zzl
            int r1 = r2.zzg
            long r1 = (long) r1
            long r3 = r3 + r1
            r0.zzh(r3)
            r1 = 0
            throw r1
        L_0x02cc:
            r3 = 1
            r1.zzk(r3)
            r0.zzi = r4
            goto L_0x02e6
        L_0x02d3:
            r3 = 1
            com.google.android.gms.internal.ads.zzadt r5 = r0.zzh
            int r1 = r5.zzf(r1, r2, r3)
            r2 = -1
            if (r1 != r2) goto L_0x02df
        L_0x02dd:
            r3 = -1
            goto L_0x02e7
        L_0x02df:
            int r2 = r0.zzo
            int r2 = r2 - r1
            r0.zzo = r2
            if (r2 <= 0) goto L_0x02e8
        L_0x02e6:
            r3 = 0
        L_0x02e7:
            return r3
        L_0x02e8:
            com.google.android.gms.internal.ads.zzadt r5 = r0.zzh
            long r1 = r0.zzl
            long r6 = r0.zzh(r1)
            com.google.android.gms.internal.ads.zzadf r1 = r0.zzb
            int r9 = r1.zzc
            r10 = 0
            r11 = 0
            r8 = 1
            r5.zzt(r6, r8, r9, r10, r11)
            long r1 = r0.zzl
            com.google.android.gms.internal.ads.zzadf r3 = r0.zzb
            int r3 = r3.zzg
            long r5 = (long) r3
            long r1 = r1 + r5
            r0.zzl = r1
            r0.zzo = r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahs.zzg(com.google.android.gms.internal.ads.zzaco):int");
    }

    private final long zzh(long j) {
        return this.zzk + ((j * 1000000) / ((long) this.zzb.zzd));
    }

    private final void zzj() {
        zzahu zzahu = this.zzp;
        if ((zzahu instanceof zzahp) && zzahu.zzh()) {
            long j = this.zzn;
            if (j != -1 && j != this.zzp.zzd()) {
                this.zzp = ((zzahp) this.zzp).zzf(this.zzn);
                zzacq zzacq = this.zzf;
                zzacq.getClass();
                zzacq zzacq2 = zzacq;
                zzacq.zzO(this.zzp);
            }
        }
    }

    private static boolean zzk(int i, long j) {
        return ((long) (i & -128000)) == (j & -128000);
    }

    private final boolean zzl(zzaco zzaco) throws IOException {
        zzahu zzahu = this.zzp;
        if (zzahu != null) {
            long zzd2 = zzahu.zzd();
            if (zzd2 != -1 && zzaco.zze() > zzd2 - 4) {
                return true;
            }
        }
        try {
            return !zzaco.zzm(this.zza.zzN(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean zzm(zzaco zzaco, boolean z) throws IOException {
        int i;
        int i2;
        int zzb2;
        zzaco.zzj();
        if (zzaco.zzf() == 0) {
            zzay zza2 = this.zzd.zza(zzaco, (zzage) null);
            this.zzj = zza2;
            if (zza2 != null) {
                this.zzc.zzb(zza2);
            }
            i = (int) zzaco.zze();
            if (!z) {
                zzaco.zzk(i);
            }
            i2 = 0;
        } else {
            i2 = 0;
            i = 0;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (!zzl(zzaco)) {
                this.zza.zzL(0);
                int zzg2 = this.zza.zzg();
                if ((i2 == 0 || zzk(zzg2, (long) i2)) && (zzb2 = zzadg.zzb(zzg2)) != -1) {
                    i3++;
                    if (i3 != 1) {
                        if (i3 == 4) {
                            break;
                        }
                    } else {
                        this.zzb.zza(zzg2);
                        i2 = zzg2;
                    }
                    zzaco.zzg(zzb2 - 4);
                } else {
                    int i5 = i4 + 1;
                    if (i4 != (true != z ? 131072 : 32768)) {
                        if (z) {
                            zzaco.zzj();
                            zzaco.zzg(i + i5);
                        } else {
                            zzaco.zzk(1);
                        }
                        i4 = i5;
                        i2 = 0;
                        i3 = 0;
                    } else if (z) {
                        return false;
                    } else {
                        zzj();
                        throw new EOFException();
                    }
                }
            } else if (i3 <= 0) {
                zzj();
                throw new EOFException();
            }
        }
        if (z) {
            zzaco.zzk(i + i4);
        } else {
            zzaco.zzj();
        }
        this.zzi = i2;
        return true;
    }

    public final void zza() {
        this.zzq = true;
    }

    public final int zzb(zzaco zzaco, zzadj zzadj) throws IOException {
        zzcw.zzb(this.zzg);
        int i = zzei.zza;
        int zzg2 = zzg(zzaco);
        if (zzg2 == -1 && (this.zzp instanceof zzahq)) {
            if (this.zzp.zza() != zzh(this.zzl)) {
                zzahq zzahq = (zzahq) this.zzp;
                throw null;
            }
        }
        return zzg2;
    }

    public final /* synthetic */ zzacn zzc() {
        return this;
    }

    public final /* synthetic */ List zzd() {
        return zzfxn.zzn();
    }

    public final void zze(zzacq zzacq) {
        this.zzf = zzacq;
        zzadt zzw = zzacq.zzw(0, 1);
        this.zzg = zzw;
        this.zzh = zzw;
        this.zzf.zzD();
    }

    public final void zzf(long j, long j2) {
        this.zzi = 0;
        this.zzk = -9223372036854775807L;
        this.zzl = 0;
        this.zzo = 0;
        zzahu zzahu = this.zzp;
        if (zzahu instanceof zzahq) {
            zzahq zzahq = (zzahq) zzahu;
            throw null;
        }
    }

    public final boolean zzi(zzaco zzaco) throws IOException {
        return zzm(zzaco, true);
    }
}
