package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzuu implements zzue, zzud {
    private final zzue[] zza;
    private final IdentityHashMap zzb = new IdentityHashMap();
    private final ArrayList zzc = new ArrayList();
    private final HashMap zzd = new HashMap();
    private zzud zze;
    private zzwj zzf;
    private zzue[] zzg;
    private zzwa zzh = new zztq(zzfxn.zzn(), zzfxn.zzn());

    public zzuu(zztr zztr, long[] jArr, zzue... zzueArr) {
        this.zza = zzueArr;
        this.zzg = new zzue[0];
        for (int i = 0; i < zzueArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.zza[i] = new zzwg(zzueArr[i], j);
            }
        }
    }

    public final long zza(long j, zzlp zzlp) {
        zzue[] zzueArr = this.zzg;
        return (zzueArr.length > 0 ? zzueArr[0] : this.zza[0]).zza(j, zzlp);
    }

    public final long zzb() {
        return this.zzh.zzb();
    }

    public final long zzc() {
        return this.zzh.zzc();
    }

    public final long zzd() {
        long j = -9223372036854775807L;
        for (zzue zzue : this.zzg) {
            long zzd2 = zzue.zzd();
            if (zzd2 != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    zzue[] zzueArr = this.zzg;
                    int length = zzueArr.length;
                    int i = 0;
                    while (i < length) {
                        zzue zzue2 = zzueArr[i];
                        if (zzue2 == zzue) {
                            break;
                        } else if (zzue2.zze(zzd2) == zzd2) {
                            i++;
                        } else {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = zzd2;
                } else if (zzd2 != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (!(j == -9223372036854775807L || zzue.zze(j) == j)) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    public final long zze(long j) {
        long zze2 = this.zzg[0].zze(j);
        int i = 1;
        while (true) {
            zzue[] zzueArr = this.zzg;
            if (i >= zzueArr.length) {
                return zze2;
            }
            if (zzueArr[i].zze(zze2) == zze2) {
                i++;
            } else {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long zzf(com.google.android.gms.internal.ads.zzxv[] r22, boolean[] r23, com.google.android.gms.internal.ads.zzvy[] r24, boolean[] r25, long r26) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r24
            int r3 = r1.length
            int[] r4 = new int[r3]
            int[] r3 = new int[r3]
            r5 = 0
            r6 = 0
        L_0x000d:
            int r7 = r1.length
            r8 = 0
            if (r6 >= r7) goto L_0x004a
            r7 = r2[r6]
            if (r7 != 0) goto L_0x0016
            goto L_0x001f
        L_0x0016:
            java.util.IdentityHashMap r8 = r0.zzb
            java.lang.Object r7 = r8.get(r7)
            r8 = r7
            java.lang.Integer r8 = (java.lang.Integer) r8
        L_0x001f:
            r7 = -1
            if (r8 != 0) goto L_0x0024
            r8 = -1
            goto L_0x0028
        L_0x0024:
            int r8 = r8.intValue()
        L_0x0028:
            r4[r6] = r8
            r8 = r1[r6]
            if (r8 == 0) goto L_0x0045
            com.google.android.gms.internal.ads.zzbr r7 = r8.zzg()
            java.lang.String r7 = r7.zzb
            java.lang.String r8 = ":"
            int r8 = r7.indexOf(r8)
            java.lang.String r7 = r7.substring(r5, r8)
            int r7 = java.lang.Integer.parseInt(r7)
            r3[r6] = r7
            goto L_0x0047
        L_0x0045:
            r3[r6] = r7
        L_0x0047:
            int r6 = r6 + 1
            goto L_0x000d
        L_0x004a:
            java.util.IdentityHashMap r6 = r0.zzb
            r6.clear()
            com.google.android.gms.internal.ads.zzue[] r6 = r0.zza
            com.google.android.gms.internal.ads.zzvy[] r9 = new com.google.android.gms.internal.ads.zzvy[r7]
            com.google.android.gms.internal.ads.zzvy[] r15 = new com.google.android.gms.internal.ads.zzvy[r7]
            com.google.android.gms.internal.ads.zzxv[] r14 = new com.google.android.gms.internal.ads.zzxv[r7]
            java.util.ArrayList r13 = new java.util.ArrayList
            int r6 = r6.length
            r13.<init>(r6)
            r17 = r26
            r6 = 0
        L_0x0060:
            com.google.android.gms.internal.ads.zzue[] r10 = r0.zza
            int r10 = r10.length
            if (r6 >= r10) goto L_0x0107
            r10 = 0
        L_0x0066:
            int r11 = r1.length
            if (r10 >= r11) goto L_0x009f
            r11 = r4[r10]
            if (r11 != r6) goto L_0x0070
            r11 = r2[r10]
            goto L_0x0071
        L_0x0070:
            r11 = r8
        L_0x0071:
            r15[r10] = r11
            r11 = r3[r10]
            if (r11 != r6) goto L_0x0099
            r11 = r1[r10]
            r11.getClass()
            r12 = r11
            com.google.android.gms.internal.ads.zzxv r12 = (com.google.android.gms.internal.ads.zzxv) r12
            com.google.android.gms.internal.ads.zzbr r12 = r11.zzg()
            java.util.HashMap r5 = r0.zzd
            java.lang.Object r5 = r5.get(r12)
            com.google.android.gms.internal.ads.zzbr r5 = (com.google.android.gms.internal.ads.zzbr) r5
            r5.getClass()
            r12 = r5
            com.google.android.gms.internal.ads.zzbr r12 = (com.google.android.gms.internal.ads.zzbr) r12
            com.google.android.gms.internal.ads.zzut r12 = new com.google.android.gms.internal.ads.zzut
            r12.<init>(r11, r5)
            r14[r10] = r12
            goto L_0x009b
        L_0x0099:
            r14[r10] = r8
        L_0x009b:
            int r10 = r10 + 1
            r5 = 0
            goto L_0x0066
        L_0x009f:
            com.google.android.gms.internal.ads.zzue[] r5 = r0.zza
            r10 = r5[r6]
            r11 = r14
            r12 = r23
            r5 = r13
            r13 = r15
            r19 = r14
            r14 = r25
            r20 = r15
            r15 = r17
            long r10 = r10.zzf(r11, r12, r13, r14, r15)
            if (r6 != 0) goto L_0x00b9
            r17 = r10
            goto L_0x00bd
        L_0x00b9:
            int r12 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r12 != 0) goto L_0x00ff
        L_0x00bd:
            r10 = 0
            r11 = 0
        L_0x00bf:
            int r12 = r1.length
            if (r10 >= r12) goto L_0x00ec
            r12 = r3[r10]
            r13 = 1
            if (r12 != r6) goto L_0x00dc
            r11 = r20[r10]
            r11.getClass()
            r12 = r11
            com.google.android.gms.internal.ads.zzvy r12 = (com.google.android.gms.internal.ads.zzvy) r12
            r9[r10] = r11
            java.util.IdentityHashMap r12 = r0.zzb
            java.lang.Integer r14 = java.lang.Integer.valueOf(r6)
            r12.put(r11, r14)
            r11 = 1
            goto L_0x00e9
        L_0x00dc:
            r12 = r4[r10]
            if (r12 != r6) goto L_0x00e9
            r12 = r20[r10]
            if (r12 != 0) goto L_0x00e5
            goto L_0x00e6
        L_0x00e5:
            r13 = 0
        L_0x00e6:
            com.google.android.gms.internal.ads.zzcw.zzf(r13)
        L_0x00e9:
            int r10 = r10 + 1
            goto L_0x00bf
        L_0x00ec:
            if (r11 == 0) goto L_0x00f5
            com.google.android.gms.internal.ads.zzue[] r10 = r0.zza
            r10 = r10[r6]
            r5.add(r10)
        L_0x00f5:
            int r6 = r6 + 1
            r13 = r5
            r14 = r19
            r15 = r20
            r5 = 0
            goto L_0x0060
        L_0x00ff:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Children enabled at different positions."
            r1.<init>(r2)
            throw r1
        L_0x0107:
            r5 = r13
            r1 = 0
            java.lang.System.arraycopy(r9, r1, r2, r1, r7)
            com.google.android.gms.internal.ads.zzue[] r1 = new com.google.android.gms.internal.ads.zzue[r1]
            java.lang.Object[] r1 = r5.toArray(r1)
            com.google.android.gms.internal.ads.zzue[] r1 = (com.google.android.gms.internal.ads.zzue[]) r1
            r0.zzg = r1
            com.google.android.gms.internal.ads.zzus r1 = new com.google.android.gms.internal.ads.zzus
            r1.<init>()
            java.util.List r1 = com.google.android.gms.internal.ads.zzfyd.zzb(r5, r1)
            com.google.android.gms.internal.ads.zztq r2 = new com.google.android.gms.internal.ads.zztq
            r2.<init>(r5, r1)
            r0.zzh = r2
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuu.zzf(com.google.android.gms.internal.ads.zzxv[], boolean[], com.google.android.gms.internal.ads.zzvy[], boolean[], long):long");
    }

    public final /* bridge */ /* synthetic */ void zzg(zzwa zzwa) {
        zzue zzue = (zzue) zzwa;
        zzud zzud = this.zze;
        zzud.getClass();
        zzud zzud2 = zzud;
        zzud.zzg(this);
    }

    public final void zzi(zzue zzue) {
        this.zzc.remove(zzue);
        if (this.zzc.isEmpty()) {
            zzue[] zzueArr = this.zza;
            int i = 0;
            for (zzue zzh2 : zzueArr) {
                i += zzh2.zzh().zzb;
            }
            zzbr[] zzbrArr = new zzbr[i];
            int i2 = 0;
            int i3 = 0;
            while (true) {
                zzue[] zzueArr2 = this.zza;
                if (i2 < zzueArr2.length) {
                    zzwj zzh3 = zzueArr2[i2].zzh();
                    int i4 = zzh3.zzb;
                    int i5 = 0;
                    while (i5 < i4) {
                        zzbr zzb2 = zzh3.zzb(i5);
                        zzab[] zzabArr = new zzab[zzb2.zza];
                        for (int i6 = 0; i6 < zzb2.zza; i6++) {
                            zzab zzb3 = zzb2.zzb(i6);
                            zzz zzb4 = zzb3.zzb();
                            String str = zzb3.zza;
                            if (str == null) {
                                str = "";
                            }
                            zzb4.zzM(i2 + ":" + str);
                            zzabArr[i6] = zzb4.zzag();
                        }
                        zzbr zzbr = new zzbr(i2 + ":" + zzb2.zzb, zzabArr);
                        this.zzd.put(zzbr, zzb2);
                        zzbrArr[i3] = zzbr;
                        i5++;
                        i3++;
                    }
                    i2++;
                } else {
                    this.zzf = new zzwj(zzbrArr);
                    zzud zzud = this.zze;
                    zzud.getClass();
                    zzud zzud2 = zzud;
                    zzud.zzi(this);
                    return;
                }
            }
        }
    }

    public final void zzj(long j, boolean z) {
        for (zzue zzj : this.zzg) {
            zzj.zzj(j, false);
        }
    }

    public final void zzk() throws IOException {
        int i = 0;
        while (true) {
            zzue[] zzueArr = this.zza;
            if (i < zzueArr.length) {
                zzueArr[i].zzk();
                i++;
            } else {
                return;
            }
        }
    }

    public final void zzl(zzud zzud, long j) {
        this.zze = zzud;
        Collections.addAll(this.zzc, this.zza);
        int i = 0;
        while (true) {
            zzue[] zzueArr = this.zza;
            if (i < zzueArr.length) {
                zzueArr[i].zzl(this, j);
                i++;
            } else {
                return;
            }
        }
    }

    public final void zzm(long j) {
        this.zzh.zzm(j);
    }

    public final zzue zzn(int i) {
        zzue zzue = this.zza[i];
        return zzue instanceof zzwg ? ((zzwg) zzue).zzn() : zzue;
    }

    public final boolean zzo(zzkj zzkj) {
        if (this.zzc.isEmpty()) {
            return this.zzh.zzo(zzkj);
        }
        int size = this.zzc.size();
        for (int i = 0; i < size; i++) {
            ((zzue) this.zzc.get(i)).zzo(zzkj);
        }
        return false;
    }

    public final boolean zzp() {
        return this.zzh.zzp();
    }

    public final zzwj zzh() {
        zzwj zzwj = this.zzf;
        zzwj.getClass();
        zzwj zzwj2 = zzwj;
        return zzwj;
    }
}
