package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzxt extends zzxy implements zzll {
    public static final /* synthetic */ int zzb = 0;
    /* access modifiers changed from: private */
    public static final zzfyy zzc = zzfyy.zzb(new zzwt());
    public final Context zza;
    private final Object zzd = new Object();
    private final boolean zze;
    private zzxh zzf;
    private zzxl zzg;
    private zze zzh;
    private final zzwp zzi;

    public zzxt(Context context) {
        zzwp zzwp = new zzwp();
        zzxh zzd2 = zzxh.zzd(context);
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzi = zzwp;
        zzxh zzxh = zzd2;
        this.zzf = zzd2;
        this.zzh = zze.zza;
        boolean z = false;
        if (context != null && zzei.zzM(context)) {
            z = true;
        }
        this.zze = z;
        if (!z && context != null && zzei.zza >= 32) {
            this.zzg = zzxl.zza(context);
        }
        if (this.zzf.zzN && context == null) {
            zzdo.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    static /* bridge */ /* synthetic */ int zzb(int i, int i2) {
        if (i == 0 || i != i2) {
            return Integer.bitCount(i & i2);
        }
        return Integer.MAX_VALUE;
    }

    protected static int zzc(zzab zzab, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(zzab.zzd)) {
            return 4;
        }
        String zzh2 = zzh(str);
        String zzh3 = zzh(zzab.zzd);
        if (zzh3 == null || zzh2 == null) {
            if (!z || zzh3 != null) {
                return 0;
            }
            return 1;
        } else if (zzh3.startsWith(zzh2) || zzh2.startsWith(zzh3)) {
            return 3;
        } else {
            int i = zzei.zza;
            if (zzh3.split("-", 2)[0].equals(zzh2.split("-", 2)[0])) {
                return 2;
            }
            return 0;
        }
    }

    protected static String zzh(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static /* synthetic */ boolean zzm(zzxt zzxt, zzab zzab) {
        boolean z;
        zzxl zzxl;
        zzxl zzxl2;
        synchronized (zzxt.zzd) {
            z = true;
            if (zzxt.zzf.zzN && !zzxt.zze) {
                int i = zzab.zzD;
                char c = 65535;
                if (i != -1 && i > 2) {
                    String str = zzab.zzo;
                    if (str != null) {
                        switch (str.hashCode()) {
                            case -2123537834:
                                if (str.equals("audio/eac3-joc")) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case 187078296:
                                if (str.equals("audio/ac3")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 187078297:
                                if (str.equals("audio/ac4")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 1504578661:
                                if (str.equals("audio/eac3")) {
                                    c = 1;
                                    break;
                                }
                                break;
                        }
                        if (c == 0 || c == 1 || c == 2 || c == 3) {
                            if (zzei.zza >= 32 && (zzxl2 = zzxt.zzg) != null) {
                                if (!zzxl2.zzg()) {
                                }
                            }
                        }
                    }
                    if (zzei.zza < 32 || (zzxl = zzxt.zzg) == null || !zzxl.zzg() || !zzxl.zze() || !zzxt.zzg.zzf() || !zzxt.zzg.zzd(zzxt.zzh, zzab)) {
                        z = false;
                    }
                }
            }
        }
        return z;
    }

    private static void zzt(zzwj zzwj, zzbw zzbw, Map map) {
        int i = 0;
        while (i < zzwj.zzb) {
            if (((zzbs) zzbw.zzB.get(zzwj.zzb(i))) == null) {
                i++;
            } else {
                throw null;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void zzu() {
        boolean z;
        zzxl zzxl;
        synchronized (this.zzd) {
            z = false;
            if (this.zzf.zzN && !this.zze && zzei.zza >= 32 && (zzxl = this.zzg) != null && zzxl.zzg()) {
                z = true;
            }
        }
        if (z) {
            zzs();
        }
    }

    private static final Pair zzv(int i, zzxx zzxx, int[][][] iArr, zzxn zzxn, Comparator comparator) {
        Object obj;
        zzxx zzxx2 = zzxx;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < 2) {
            if (i == zzxx2.zzc(i2)) {
                zzwj zzd2 = zzxx2.zzd(i2);
                int i3 = 0;
                while (i3 < zzd2.zzb) {
                    zzbr zzb2 = zzd2.zzb(i3);
                    List zza2 = zzxn.zza(i2, zzb2, iArr[i2][i3]);
                    boolean[] zArr = new boolean[zzb2.zza];
                    int i4 = 0;
                    while (i4 < zzb2.zza) {
                        int i5 = i4 + 1;
                        zzxo zzxo = (zzxo) zza2.get(i4);
                        int zzb3 = zzxo.zzb();
                        if (!zArr[i4] && zzb3 != 0) {
                            if (zzb3 == 1) {
                                obj = zzfxn.zzo(zzxo);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zzxo);
                                int i6 = i5;
                                while (i6 < zzb2.zza) {
                                    zzxo zzxo2 = (zzxo) zza2.get(i6);
                                    if (zzxo2.zzb() == 2 && zzxo.zzc(zzxo2)) {
                                        arrayList2.add(zzxo2);
                                        zArr[i6] = true;
                                    }
                                    i6++;
                                    zzxx zzxx3 = zzxx;
                                }
                                obj = arrayList2;
                            }
                            arrayList.add(obj);
                        }
                        zzxx zzxx4 = zzxx;
                        i4 = i5;
                    }
                    i3++;
                    zzxx zzxx5 = zzxx;
                }
            }
            zzxn zzxn2 = zzxn;
            i2++;
            zzxx2 = zzxx;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i7 = 0; i7 < list.size(); i7++) {
            iArr2[i7] = ((zzxo) list.get(i7)).zzc;
        }
        zzxo zzxo3 = (zzxo) list.get(0);
        return Pair.create(new zzxu(zzxo3.zzb, iArr2, 0), Integer.valueOf(zzxo3.zza));
    }

    public final void zza(zzlj zzlj) {
        synchronized (this.zzd) {
            boolean z = this.zzf.zzR;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: com.google.android.gms.internal.ads.zzxv[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: com.google.android.gms.internal.ads.zzwq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: com.google.android.gms.internal.ads.zzxw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: com.google.android.gms.internal.ads.zzxw} */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair zzd(com.google.android.gms.internal.ads.zzxx r27, int[][][] r28, int[] r29, com.google.android.gms.internal.ads.zzug r30, com.google.android.gms.internal.ads.zzbq r31) throws com.google.android.gms.internal.ads.zzib {
        /*
            r26 = this;
            r1 = r26
            r0 = r27
            r2 = r28
            r3 = r29
            java.lang.Object r4 = r1.zzd
            monitor-enter(r4)
            com.google.android.gms.internal.ads.zzxh r5 = r1.zzf     // Catch:{ all -> 0x0261 }
            boolean r6 = r5.zzN     // Catch:{ all -> 0x0261 }
            if (r6 == 0) goto L_0x0028
            int r6 = com.google.android.gms.internal.ads.zzei.zza     // Catch:{ all -> 0x0261 }
            r7 = 32
            if (r6 < r7) goto L_0x0028
            com.google.android.gms.internal.ads.zzxl r6 = r1.zzg     // Catch:{ all -> 0x0261 }
            if (r6 == 0) goto L_0x0028
            android.os.Looper r7 = android.os.Looper.myLooper()     // Catch:{ all -> 0x0261 }
            com.google.android.gms.internal.ads.zzcw.zzb(r7)     // Catch:{ all -> 0x0261 }
            r8 = r7
            android.os.Looper r8 = (android.os.Looper) r8     // Catch:{ all -> 0x0261 }
            r6.zzb(r1, r7)     // Catch:{ all -> 0x0261 }
        L_0x0028:
            monitor-exit(r4)     // Catch:{ all -> 0x0261 }
            r4 = 2
            com.google.android.gms.internal.ads.zzxu[] r6 = new com.google.android.gms.internal.ads.zzxu[r4]
            r7 = 0
            r8 = 0
        L_0x002e:
            r9 = 1
            if (r8 >= r4) goto L_0x0044
            int r10 = r0.zzc(r8)
            if (r10 != r4) goto L_0x0041
            com.google.android.gms.internal.ads.zzwj r10 = r0.zzd(r8)
            int r10 = r10.zzb
            if (r10 <= 0) goto L_0x0041
            r8 = 1
            goto L_0x0045
        L_0x0041:
            int r8 = r8 + 1
            goto L_0x002e
        L_0x0044:
            r8 = 0
        L_0x0045:
            com.google.android.gms.internal.ads.zzwy r10 = new com.google.android.gms.internal.ads.zzwy
            r10.<init>(r1, r5, r8, r3)
            com.google.android.gms.internal.ads.zzwz r8 = new com.google.android.gms.internal.ads.zzwz
            r8.<init>()
            android.util.Pair r8 = zzv(r9, r0, r2, r10, r8)
            if (r8 == 0) goto L_0x0063
            java.lang.Object r10 = r8.second
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            java.lang.Object r11 = r8.first
            com.google.android.gms.internal.ads.zzxu r11 = (com.google.android.gms.internal.ads.zzxu) r11
            r6[r10] = r11
        L_0x0063:
            if (r8 != 0) goto L_0x0067
            r8 = 0
            goto L_0x007b
        L_0x0067:
            java.lang.Object r11 = r8.first
            com.google.android.gms.internal.ads.zzxu r11 = (com.google.android.gms.internal.ads.zzxu) r11
            com.google.android.gms.internal.ads.zzbr r11 = r11.zza
            java.lang.Object r8 = r8.first
            com.google.android.gms.internal.ads.zzxu r8 = (com.google.android.gms.internal.ads.zzxu) r8
            int[] r8 = r8.zzb
            r8 = r8[r7]
            com.google.android.gms.internal.ads.zzab r8 = r11.zzb(r8)
            java.lang.String r8 = r8.zzd
        L_0x007b:
            com.google.android.gms.internal.ads.zzbu r11 = r5.zzt
            com.google.android.gms.internal.ads.zzww r11 = new com.google.android.gms.internal.ads.zzww
            r11.<init>(r5, r8, r3)
            com.google.android.gms.internal.ads.zzwx r3 = new com.google.android.gms.internal.ads.zzwx
            r3.<init>()
            android.util.Pair r3 = zzv(r4, r0, r2, r11, r3)
            boolean r11 = r5.zzy
            r11 = 4
            if (r3 != 0) goto L_0x00a1
            com.google.android.gms.internal.ads.zzbu r12 = r5.zzt
            com.google.android.gms.internal.ads.zzwu r12 = new com.google.android.gms.internal.ads.zzwu
            r12.<init>(r5)
            com.google.android.gms.internal.ads.zzwv r13 = new com.google.android.gms.internal.ads.zzwv
            r13.<init>()
            android.util.Pair r12 = zzv(r11, r0, r2, r12, r13)
            goto L_0x00a2
        L_0x00a1:
            r12 = 0
        L_0x00a2:
            if (r12 == 0) goto L_0x00b3
            java.lang.Object r3 = r12.second
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r12 = r12.first
            com.google.android.gms.internal.ads.zzxu r12 = (com.google.android.gms.internal.ads.zzxu) r12
            r6[r3] = r12
            goto L_0x00c3
        L_0x00b3:
            if (r3 == 0) goto L_0x00c3
            java.lang.Object r12 = r3.second
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            java.lang.Object r3 = r3.first
            com.google.android.gms.internal.ads.zzxu r3 = (com.google.android.gms.internal.ads.zzxu) r3
            r6[r12] = r3
        L_0x00c3:
            com.google.android.gms.internal.ads.zzbu r3 = r5.zzt
            com.google.android.gms.internal.ads.zzxb r3 = new com.google.android.gms.internal.ads.zzxb
            r3.<init>(r5, r8)
            com.google.android.gms.internal.ads.zzxc r8 = new com.google.android.gms.internal.ads.zzxc
            r8.<init>()
            r12 = 3
            android.util.Pair r3 = zzv(r12, r0, r2, r3, r8)
            if (r3 == 0) goto L_0x00e4
            java.lang.Object r8 = r3.second
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            java.lang.Object r3 = r3.first
            com.google.android.gms.internal.ads.zzxu r3 = (com.google.android.gms.internal.ads.zzxu) r3
            r6[r8] = r3
        L_0x00e4:
            r3 = 0
        L_0x00e5:
            if (r3 >= r4) goto L_0x0159
            int r8 = r0.zzc(r3)
            if (r8 == r4) goto L_0x0151
            if (r8 == r9) goto L_0x0151
            if (r8 == r12) goto L_0x0151
            if (r8 == r11) goto L_0x0151
            com.google.android.gms.internal.ads.zzwj r8 = r0.zzd(r3)
            r13 = r2[r3]
            com.google.android.gms.internal.ads.zzbu r14 = r5.zzt
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x0101:
            int r11 = r8.zzb
            if (r14 >= r11) goto L_0x0141
            com.google.android.gms.internal.ads.zzbr r11 = r8.zzb(r14)
            r18 = r13[r14]
            r12 = r17
            r9 = 0
        L_0x010e:
            int r10 = r11.zza
            if (r9 >= r10) goto L_0x0138
            r10 = r18[r9]
            boolean r4 = r5.zzO
            boolean r4 = com.google.android.gms.internal.ads.zzlk.zza(r10, r4)
            if (r4 == 0) goto L_0x0133
            com.google.android.gms.internal.ads.zzab r4 = r11.zzb(r9)
            com.google.android.gms.internal.ads.zzxf r10 = new com.google.android.gms.internal.ads.zzxf
            r7 = r18[r9]
            r10.<init>(r4, r7)
            if (r12 == 0) goto L_0x012f
            int r4 = r10.compareTo(r12)
            if (r4 <= 0) goto L_0x0133
        L_0x012f:
            r16 = r9
            r12 = r10
            r15 = r11
        L_0x0133:
            int r9 = r9 + 1
            r4 = 2
            r7 = 0
            goto L_0x010e
        L_0x0138:
            int r14 = r14 + 1
            r17 = r12
            r4 = 2
            r7 = 0
            r9 = 1
            r12 = 3
            goto L_0x0101
        L_0x0141:
            if (r15 != 0) goto L_0x0145
            r4 = 0
            goto L_0x014f
        L_0x0145:
            com.google.android.gms.internal.ads.zzxu r4 = new com.google.android.gms.internal.ads.zzxu
            int[] r7 = new int[]{r16}
            r8 = 0
            r4.<init>(r15, r7, r8)
        L_0x014f:
            r6[r3] = r4
        L_0x0151:
            int r3 = r3 + 1
            r4 = 2
            r7 = 0
            r9 = 1
            r11 = 4
            r12 = 3
            goto L_0x00e5
        L_0x0159:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3 = 2
            r8 = 0
        L_0x0160:
            if (r8 >= r3) goto L_0x016c
            com.google.android.gms.internal.ads.zzwj r4 = r0.zzd(r8)
            zzt(r4, r5, r2)
            int r8 = r8 + 1
            goto L_0x0160
        L_0x016c:
            com.google.android.gms.internal.ads.zzwj r4 = r27.zze()
            zzt(r4, r5, r2)
            r8 = 0
        L_0x0174:
            if (r8 >= r3) goto L_0x018b
            int r4 = r0.zzc(r8)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r2.get(r4)
            com.google.android.gms.internal.ads.zzbs r4 = (com.google.android.gms.internal.ads.zzbs) r4
            if (r4 != 0) goto L_0x0189
            int r8 = r8 + 1
            goto L_0x0174
        L_0x0189:
            r4 = 0
            throw r4
        L_0x018b:
            r4 = 0
            r8 = 0
        L_0x018d:
            if (r8 >= r3) goto L_0x01a7
            com.google.android.gms.internal.ads.zzwj r2 = r0.zzd(r8)
            boolean r3 = r5.zzg(r8, r2)
            if (r3 != 0) goto L_0x019a
            goto L_0x01a2
        L_0x019a:
            com.google.android.gms.internal.ads.zzxi r2 = r5.zze(r8, r2)
            if (r2 != 0) goto L_0x01a6
            r6[r8] = r4
        L_0x01a2:
            int r8 = r8 + 1
            r3 = 2
            goto L_0x018d
        L_0x01a6:
            throw r4
        L_0x01a7:
            r2 = 2
            r8 = 0
        L_0x01a9:
            if (r8 >= r2) goto L_0x01cb
            int r2 = r0.zzc(r8)
            boolean r3 = r5.zzf(r8)
            if (r3 != 0) goto L_0x01c4
            com.google.android.gms.internal.ads.zzfxs r3 = r5.zzC
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L_0x01c2
            goto L_0x01c4
        L_0x01c2:
            r4 = 0
            goto L_0x01c7
        L_0x01c4:
            r4 = 0
            r6[r8] = r4
        L_0x01c7:
            int r8 = r8 + 1
            r2 = 2
            goto L_0x01a9
        L_0x01cb:
            r4 = 0
            com.google.android.gms.internal.ads.zzwp r2 = r1.zzi
            com.google.android.gms.internal.ads.zzyj r3 = r26.zzq()
            com.google.android.gms.internal.ads.zzfxn r7 = com.google.android.gms.internal.ads.zzwq.zzh(r6)
            r8 = 2
            com.google.android.gms.internal.ads.zzxv[] r15 = new com.google.android.gms.internal.ads.zzxv[r8]
            r14 = 0
        L_0x01da:
            if (r14 >= r8) goto L_0x0226
            r8 = r6[r14]
            if (r8 == 0) goto L_0x021c
            int[] r11 = r8.zzb
            int r9 = r11.length
            if (r9 != 0) goto L_0x01e6
            goto L_0x021c
        L_0x01e6:
            r13 = 1
            if (r9 != r13) goto L_0x0203
            com.google.android.gms.internal.ads.zzbr r8 = r8.zza
            com.google.android.gms.internal.ads.zzxw r9 = new com.google.android.gms.internal.ads.zzxw
            r16 = 0
            r22 = r11[r16]
            r24 = 0
            r25 = 0
            r23 = 0
            r20 = r9
            r21 = r8
            r20.<init>(r21, r22, r23, r24, r25)
            r19 = r14
            r17 = 1
            goto L_0x0219
        L_0x0203:
            r16 = 0
            com.google.android.gms.internal.ads.zzbr r10 = r8.zza
            java.lang.Object r8 = r7.get(r14)
            com.google.android.gms.internal.ads.zzfxn r8 = (com.google.android.gms.internal.ads.zzfxn) r8
            r12 = 0
            r9 = r2
            r17 = 1
            r13 = r3
            r19 = r14
            r14 = r8
            com.google.android.gms.internal.ads.zzwq r9 = r9.zza(r10, r11, r12, r13, r14)
        L_0x0219:
            r15[r19] = r9
            goto L_0x0222
        L_0x021c:
            r19 = r14
            r16 = 0
            r17 = 1
        L_0x0222:
            int r14 = r19 + 1
            r8 = 2
            goto L_0x01da
        L_0x0226:
            r16 = 0
            com.google.android.gms.internal.ads.zzln[] r2 = new com.google.android.gms.internal.ads.zzln[r8]
            r7 = 0
        L_0x022b:
            if (r7 >= r8) goto L_0x0258
            int r3 = r0.zzc(r7)
            boolean r6 = r5.zzf(r7)
            if (r6 != 0) goto L_0x0252
            com.google.android.gms.internal.ads.zzfxs r6 = r5.zzC
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = r6.contains(r3)
            if (r3 == 0) goto L_0x0244
            goto L_0x0252
        L_0x0244:
            int r3 = r0.zzc(r7)
            r6 = -2
            if (r3 == r6) goto L_0x024f
            r3 = r15[r7]
            if (r3 == 0) goto L_0x0252
        L_0x024f:
            com.google.android.gms.internal.ads.zzln r3 = com.google.android.gms.internal.ads.zzln.zza
            goto L_0x0253
        L_0x0252:
            r3 = r4
        L_0x0253:
            r2[r7] = r3
            int r7 = r7 + 1
            goto L_0x022b
        L_0x0258:
            boolean r0 = r5.zzP
            com.google.android.gms.internal.ads.zzbu r0 = r5.zzt
            android.util.Pair r0 = android.util.Pair.create(r2, r15)
            return r0
        L_0x0261:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0261 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxt.zzd(com.google.android.gms.internal.ads.zzxx, int[][][], int[], com.google.android.gms.internal.ads.zzug, com.google.android.gms.internal.ads.zzbq):android.util.Pair");
    }

    public final zzll zze() {
        return this;
    }

    public final zzxh zzf() {
        zzxh zzxh;
        synchronized (this.zzd) {
            zzxh = this.zzf;
        }
        return zzxh;
    }

    public final void zzj() {
        zzxl zzxl;
        synchronized (this.zzd) {
            if (zzei.zza >= 32 && (zzxl = this.zzg) != null) {
                zzxl.zzc();
            }
        }
        super.zzj();
    }

    public final void zzk(zze zze2) {
        boolean equals;
        synchronized (this.zzd) {
            equals = this.zzh.equals(zze2);
            this.zzh = zze2;
        }
        if (!equals) {
            zzu();
        }
    }

    public final void zzl(zzxg zzxg) {
        boolean equals;
        zzxh zzxh = new zzxh(zzxg);
        synchronized (this.zzd) {
            equals = this.zzf.equals(zzxh);
            this.zzf = zzxh;
        }
        if (!equals) {
            if (zzxh.zzN && this.zza == null) {
                zzdo.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            zzs();
        }
    }

    public final boolean zzn() {
        return true;
    }
}
