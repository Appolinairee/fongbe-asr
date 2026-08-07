package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzko {
    private final zzbo zza = new zzbo();
    private final zzbp zzb = new zzbp();
    private final zzlt zzc;
    private final zzdh zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzil zzh;
    private zzkl zzi;
    private zzkl zzj;
    private zzkl zzk;
    private zzkl zzl;
    private int zzm;
    private Object zzn;
    private long zzo;
    private List zzp = new ArrayList();
    private final zzjs zzq;

    public zzko(zzlt zzlt, zzdh zzdh, zzjs zzjs, zzil zzil) {
        this.zzc = zzlt;
        this.zzd = zzdh;
        this.zzq = zzjs;
        this.zzh = zzil;
    }

    private final long zzA(Object obj) {
        for (int i = 0; i < this.zzp.size(); i++) {
            zzkl zzkl = (zzkl) this.zzp.get(i);
            if (zzkl.zzb.equals(obj)) {
                return zzkl.zzg.zza.zzd;
            }
        }
        return -1;
    }

    private final zzkm zzB(zzbq zzbq, zzkl zzkl, long j) {
        long j2;
        zzbq zzbq2 = zzbq;
        zzkm zzkm = zzkl.zzg;
        long zze2 = (zzkl.zze() + zzkm.zze) - j;
        if (zzkm.zzg) {
            int zza2 = zzbq2.zza(zzkm.zza.zza);
            int i = this.zzf;
            boolean z = this.zzg;
            long j3 = 0;
            int zzi2 = zzbq.zzi(zza2, this.zza, this.zzb, i, z);
            if (zzi2 != -1) {
                int i2 = zzbq2.zzd(zzi2, this.zza, true).zzc;
                Object obj = this.zza.zzb;
                obj.getClass();
                long j4 = zzkm.zza.zzd;
                if (zzbq2.zze(i2, this.zzb, 0).zzn == zzi2) {
                    Pair zzm2 = zzbq.zzm(this.zzb, this.zza, i2, -9223372036854775807L, Math.max(0, zze2));
                    if (zzm2 != null) {
                        obj = zzm2.first;
                        long longValue = ((Long) zzm2.second).longValue();
                        zzkl zzg2 = zzkl.zzg();
                        if (zzg2 == null || !zzg2.zzb.equals(obj)) {
                            j4 = zzA(obj);
                            if (j4 == -1) {
                                j4 = this.zze;
                                this.zze = 1 + j4;
                            }
                        } else {
                            j4 = zzg2.zzg.zza.zzd;
                        }
                        j2 = longValue;
                        j3 = -9223372036854775807L;
                    }
                } else {
                    j2 = 0;
                }
                zzug zzF = zzF(zzbq, obj, j2, j4, this.zzb, this.zza);
                if (!(j3 == -9223372036854775807L || zzkm.zzc == -9223372036854775807L)) {
                    zzbq2.zzn(zzkm.zza.zza, this.zza).zzb();
                    int i3 = this.zza.zzg.zzd;
                }
                return zzC(zzbq, zzF, j3, j2);
            }
        } else {
            zzug zzug = zzkm.zza;
            zzbq2.zzn(zzug.zza, this.zza);
            if (zzug.zzb()) {
                int i4 = zzug.zzb;
                if (this.zza.zza(i4) != -1) {
                    int zza3 = this.zza.zzg.zza(i4).zza(zzug.zzc);
                    if (zza3 < 0) {
                        return zzD(zzbq, zzug.zza, i4, zza3, zzkm.zzc, zzug.zzd);
                    }
                    long j5 = zzkm.zzc;
                    if (j5 == -9223372036854775807L) {
                        zzbp zzbp = this.zzb;
                        zzbo zzbo = this.zza;
                        Pair zzm3 = zzbq.zzm(zzbp, zzbo, zzbo.zzc, -9223372036854775807L, Math.max(0, zze2));
                        if (zzm3 != null) {
                            j5 = ((Long) zzm3.second).longValue();
                        }
                    }
                    zzz(zzbq2, zzug.zza, zzug.zzb);
                    return zzE(zzbq, zzug.zza, Math.max(0, j5), zzkm.zzc, zzug.zzd);
                }
            } else {
                int i5 = zzug.zze;
                if (i5 != -1) {
                    this.zza.zzj(i5);
                }
                zzbo zzbo2 = this.zza;
                int i6 = zzug.zze;
                int zze3 = zzbo2.zze(i6);
                zzbo2.zzk(i6);
                if (zze3 != this.zza.zza(zzug.zze)) {
                    return zzD(zzbq, zzug.zza, zzug.zze, zze3, zzkm.zze, zzug.zzd);
                }
                zzz(zzbq2, zzug.zza, zzug.zze);
                return zzE(zzbq, zzug.zza, 0, zzkm.zze, zzug.zzd);
            }
        }
        return null;
    }

    private final zzkm zzC(zzbq zzbq, zzug zzug, long j, long j2) {
        zzug zzug2 = zzug;
        zzbq zzbq2 = zzbq;
        zzbq.zzn(zzug2.zza, this.zza);
        if (zzug.zzb()) {
            return zzD(zzbq, zzug2.zza, zzug2.zzb, zzug2.zzc, j, zzug2.zzd);
        }
        return zzE(zzbq, zzug2.zza, j2, j, zzug2.zzd);
    }

    private final zzkm zzD(zzbq zzbq, Object obj, int i, int i2, long j, long j2) {
        zzug zzug = new zzug(obj, i, i2, j2);
        Object obj2 = zzug.zza;
        long zzf2 = zzbq.zzn(obj2, this.zza).zzf(zzug.zzb, zzug.zzc);
        if (i2 == this.zza.zze(i)) {
            this.zza.zzh();
        }
        this.zza.zzk(zzug.zzb);
        long j3 = 0;
        if (zzf2 != -9223372036854775807L && zzf2 <= 0) {
            j3 = Math.max(0, -1 + zzf2);
        }
        return new zzkm(zzug, j3, j, -9223372036854775807L, zzf2, false, false, false, false);
    }

    private final zzkm zzE(zzbq zzbq, Object obj, long j, long j2, long j3) {
        long j4;
        long j5;
        long j6;
        zzbq zzbq2 = zzbq;
        Object obj2 = obj;
        long j7 = j;
        zzbq2.zzn(obj2, this.zza);
        int zzc2 = this.zza.zzc(j7);
        if (zzc2 != -1) {
            this.zza.zzj(zzc2);
        }
        if (zzc2 == -1) {
            this.zza.zzb();
        } else {
            this.zza.zzk(zzc2);
        }
        zzug zzug = new zzug(obj2, j3, zzc2);
        boolean zzK = zzK(zzug);
        boolean zzI = zzI(zzbq2, zzug);
        boolean zzH = zzH(zzbq2, zzug, zzK);
        if (zzc2 != -1) {
            this.zza.zzk(zzc2);
        }
        if (zzc2 != -1) {
            this.zza.zzg(zzc2);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        if (j4 != -9223372036854775807L) {
            j6 = 0;
            j5 = 0;
        } else {
            j6 = j4;
            j5 = this.zza.zzd;
        }
        if (j5 != -9223372036854775807L && j7 >= j5) {
            j7 = Math.max(0, j5 - 1);
        }
        return new zzkm(zzug, j7, j2, j6, j5, false, zzK, zzI, zzH);
    }

    private static zzug zzF(zzbq zzbq, Object obj, long j, long j2, zzbp zzbp, zzbo zzbo) {
        zzbq zzbq2 = zzbq;
        Object obj2 = obj;
        long j3 = j;
        zzbo zzbo2 = zzbo;
        zzbq.zzn(obj, zzbo2);
        zzbp zzbp2 = zzbp;
        zzbq.zze(zzbo2.zzc, zzbp, 0);
        zzbq.zza(obj);
        zzbo.zzb();
        zzbq.zzn(obj, zzbo2);
        int zzd2 = zzbo2.zzd(j);
        if (zzd2 == -1) {
            long j4 = j2;
            return new zzug(obj, j2, zzbo2.zzc(j));
        }
        long j5 = j2;
        return new zzug(obj, zzd2, zzbo2.zze(zzd2), j2);
    }

    private final void zzG() {
        zzug zzug;
        zzfxk zzfxk = new zzfxk();
        for (zzkl zzkl = this.zzi; zzkl != null; zzkl = zzkl.zzg()) {
            zzfxk.zzf(zzkl.zzg.zza);
        }
        zzkl zzkl2 = this.zzj;
        if (zzkl2 == null) {
            zzug = null;
        } else {
            zzug = zzkl2.zzg.zza;
        }
        this.zzd.zzh(new zzkn(this, zzfxk, zzug));
    }

    private final boolean zzH(zzbq zzbq, zzug zzug, boolean z) {
        int zza2 = zzbq.zza(zzug.zza);
        if (!zzbq.zze(zzbq.zzd(zza2, this.zza, false).zzc, this.zzb, 0).zzi) {
            if (zzbq.zzi(zza2, this.zza, this.zzb, this.zzf, this.zzg) != -1 || !z) {
                return false;
            }
            return true;
        }
        return false;
    }

    private final boolean zzI(zzbq zzbq, zzug zzug) {
        if (!zzK(zzug)) {
            return false;
        }
        int i = zzbq.zzn(zzug.zza, this.zza).zzc;
        if (zzbq.zze(i, this.zzb, 0).zzo == zzbq.zza(zzug.zza)) {
            return true;
        }
        return false;
    }

    private final boolean zzJ(zzbq zzbq) {
        zzkl zzkl = this.zzi;
        if (zzkl == null) {
            return true;
        }
        int zza2 = zzbq.zza(zzkl.zzb);
        while (true) {
            zza2 = zzbq.zzi(zza2, this.zza, this.zzb, this.zzf, this.zzg);
            while (true) {
                zzkl.getClass();
                zzkl zzkl2 = zzkl;
                if (zzkl.zzg() == null || zzkl.zzg.zzg) {
                    zzkl zzg2 = zzkl.zzg();
                } else {
                    zzkl = zzkl.zzg();
                }
            }
            zzkl zzg22 = zzkl.zzg();
            if (zza2 == -1 || zzg22 == null || zzbq.zza(zzg22.zzb) != zza2) {
                boolean zzu = zzu(zzkl);
                zzkl.zzg = zzj(zzbq, zzkl.zzg);
            } else {
                zzkl = zzg22;
            }
        }
        boolean zzu2 = zzu(zzkl);
        zzkl.zzg = zzj(zzbq, zzkl.zzg);
        if (!zzu2) {
            return true;
        }
        return false;
    }

    private static final boolean zzK(zzug zzug) {
        return !zzug.zzb() && zzug.zze == -1;
    }

    static boolean zzr(long j, long j2) {
        return j == -9223372036854775807L || j == j2;
    }

    private final long zzz(zzbq zzbq, Object obj, int i) {
        zzbq.zzn(obj, this.zza);
        this.zza.zzg(i);
        long j = this.zza.zzg.zza(i).zzg;
        return 0;
    }

    public final zzkl zza() {
        zzkl zzkl = this.zzi;
        if (zzkl == null) {
            return null;
        }
        if (zzkl == this.zzj) {
            this.zzj = zzkl.zzg();
        }
        zzkl.zzo();
        int i = this.zzm - 1;
        this.zzm = i;
        if (i == 0) {
            this.zzk = null;
            zzkl zzkl2 = this.zzi;
            this.zzn = zzkl2.zzb;
            this.zzo = zzkl2.zzg.zza.zzd;
        }
        this.zzi = this.zzi.zzg();
        zzG();
        return this.zzi;
    }

    public final zzkl zzb() {
        zzkl zzkl = this.zzj;
        zzcw.zzb(zzkl);
        zzkl zzkl2 = zzkl;
        this.zzj = zzkl.zzg();
        zzG();
        zzkl zzkl3 = this.zzj;
        zzcw.zzb(zzkl3);
        zzkl zzkl4 = zzkl3;
        return zzkl3;
    }

    public final zzkl zzd() {
        return this.zzk;
    }

    public final zzkl zze() {
        return this.zzi;
    }

    public final zzkl zzf(zzue zzue) {
        for (int i = 0; i < this.zzp.size(); i++) {
            zzkl zzkl = (zzkl) this.zzp.get(i);
            if (zzkl.zza == zzue) {
                return zzkl;
            }
        }
        return null;
    }

    public final zzkl zzg() {
        return this.zzl;
    }

    public final zzkl zzh() {
        return this.zzj;
    }

    public final zzkm zzi(long j, zzlb zzlb) {
        zzkl zzkl = this.zzk;
        if (zzkl != null) {
            return zzB(zzlb.zza, zzkl, j);
        }
        return zzC(zzlb.zza, zzlb.zzb, zzlb.zzc, zzlb.zzs);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzkm zzj(com.google.android.gms.internal.ads.zzbq r19, com.google.android.gms.internal.ads.zzkm r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.gms.internal.ads.zzug r3 = r2.zza
            boolean r12 = zzK(r3)
            boolean r13 = r0.zzI(r1, r3)
            boolean r14 = r0.zzH(r1, r3, r12)
            com.google.android.gms.internal.ads.zzug r4 = r2.zza
            java.lang.Object r4 = r4.zza
            com.google.android.gms.internal.ads.zzbo r5 = r0.zza
            r1.zzn(r4, r5)
            boolean r1 = r3.zzb()
            r4 = -1
            r5 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L_0x0037
            int r1 = r3.zze
            if (r1 != r4) goto L_0x0030
            goto L_0x0037
        L_0x0030:
            com.google.android.gms.internal.ads.zzbo r9 = r0.zza
            r9.zzg(r1)
            r9 = r5
            goto L_0x0038
        L_0x0037:
            r9 = r7
        L_0x0038:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L_0x004b
            com.google.android.gms.internal.ads.zzbo r1 = r0.zza
            int r5 = r3.zzb
            int r6 = r3.zzc
            long r5 = r1.zzf(r5, r6)
        L_0x0048:
            r7 = r9
            r9 = r5
            goto L_0x0057
        L_0x004b:
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0052
            r7 = r5
            r9 = r7
            goto L_0x0057
        L_0x0052:
            com.google.android.gms.internal.ads.zzbo r1 = r0.zza
            long r5 = r1.zzd
            goto L_0x0048
        L_0x0057:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L_0x0065
            com.google.android.gms.internal.ads.zzbo r1 = r0.zza
            int r4 = r3.zzb
            r1.zzk(r4)
            goto L_0x006e
        L_0x0065:
            int r1 = r3.zze
            if (r1 == r4) goto L_0x006e
            com.google.android.gms.internal.ads.zzbo r4 = r0.zza
            r4.zzk(r1)
        L_0x006e:
            com.google.android.gms.internal.ads.zzkm r15 = new com.google.android.gms.internal.ads.zzkm
            long r4 = r2.zzb
            long r1 = r2.zzc
            r11 = 0
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzko.zzj(com.google.android.gms.internal.ads.zzbq, com.google.android.gms.internal.ads.zzkm):com.google.android.gms.internal.ads.zzkm");
    }

    public final zzug zzk(zzbq zzbq, Object obj, long j) {
        long zzA;
        int zza2;
        int i = zzbq.zzn(obj, this.zza).zzc;
        Object obj2 = this.zzn;
        if (obj2 == null || (zza2 = zzbq.zza(obj2)) == -1 || zzbq.zzd(zza2, this.zza, false).zzc != i) {
            zzkl zzkl = this.zzi;
            while (true) {
                if (zzkl == null) {
                    zzkl zzkl2 = this.zzi;
                    while (true) {
                        if (zzkl2 != null) {
                            int zza3 = zzbq.zza(zzkl2.zzb);
                            if (zza3 != -1 && zzbq.zzd(zza3, this.zza, false).zzc == i) {
                                zzA = zzkl2.zzg.zza.zzd;
                                break;
                            }
                            zzkl2 = zzkl2.zzg();
                        } else {
                            zzA = zzA(obj);
                            if (zzA == -1) {
                                zzA = this.zze;
                                this.zze = 1 + zzA;
                                if (this.zzi == null) {
                                    this.zzn = obj;
                                    this.zzo = zzA;
                                }
                            }
                        }
                    }
                } else if (zzkl.zzb.equals(obj)) {
                    zzA = zzkl.zzg.zza.zzd;
                    break;
                } else {
                    zzkl = zzkl.zzg();
                }
            }
        } else {
            zzA = this.zzo;
        }
        long j2 = zzA;
        zzbq.zzn(obj, this.zza);
        zzbq.zze(this.zza.zzc, this.zzb, 0);
        int zza4 = zzbq.zza(obj);
        Object obj3 = obj;
        while (true) {
            zzbp zzbp = this.zzb;
            if (zza4 < zzbp.zzn) {
                return zzF(zzbq, obj3, j, j2, zzbp, this.zza);
            }
            zzbq.zzd(zza4, this.zza, true);
            this.zza.zzb();
            zzbo zzbo = this.zza;
            if (zzbo.zzd(zzbo.zzd) != -1) {
                obj3 = this.zza.zzb;
                obj3.getClass();
            }
            zza4--;
        }
    }

    public final void zzl() {
        if (this.zzm != 0) {
            zzkl zzkl = this.zzi;
            zzcw.zzb(zzkl);
            zzkl zzkl2 = zzkl;
            this.zzn = zzkl.zzb;
            this.zzo = zzkl.zzg.zza.zzd;
            while (zzkl != null) {
                zzkl.zzo();
                zzkl = zzkl.zzg();
            }
            this.zzi = null;
            this.zzk = null;
            this.zzj = null;
            this.zzm = 0;
            zzG();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzm(zzfxk zzfxk, zzug zzug) {
        this.zzc.zzT(zzfxk.zzi(), zzug);
    }

    public final void zzn() {
        zzkl zzkl = this.zzl;
        if (zzkl == null || zzkl.zzt()) {
            this.zzl = null;
            for (int i = 0; i < this.zzp.size(); i++) {
                zzkl zzkl2 = (zzkl) this.zzp.get(i);
                if (!zzkl2.zzt()) {
                    this.zzl = zzkl2;
                    return;
                }
            }
        }
    }

    public final void zzo(long j) {
        zzkl zzkl = this.zzk;
        if (zzkl != null) {
            zzkl.zzn(j);
        }
    }

    public final void zzp() {
        if (!this.zzp.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.zzp.size(); i++) {
                ((zzkl) this.zzp.get(i)).zzo();
            }
            this.zzp = arrayList;
            this.zzl = null;
            zzn();
        }
    }

    public final void zzq(zzbq zzbq, zzil zzil) {
        this.zzh = zzil;
        long j = zzil.zzb;
        zzp();
    }

    public final boolean zzs(zzue zzue) {
        zzkl zzkl = this.zzk;
        return zzkl != null && zzkl.zza == zzue;
    }

    public final boolean zzt(zzue zzue) {
        zzkl zzkl = this.zzl;
        return zzkl != null && zzkl.zza == zzue;
    }

    public final boolean zzu(zzkl zzkl) {
        zzcw.zzb(zzkl);
        boolean z = false;
        if (zzkl.equals(this.zzk)) {
            return false;
        }
        this.zzk = zzkl;
        while (zzkl.zzg() != null) {
            zzkl = zzkl.zzg();
            zzkl.getClass();
            zzkl zzkl2 = zzkl;
            if (zzkl == this.zzj) {
                this.zzj = this.zzi;
                z = true;
            }
            zzkl.zzo();
            this.zzm--;
        }
        zzkl zzkl3 = this.zzk;
        zzkl3.getClass();
        zzkl zzkl4 = zzkl3;
        zzkl3.zzp((zzkl) null);
        zzG();
        return z;
    }

    public final boolean zzv() {
        zzkl zzkl = this.zzk;
        if (zzkl != null) {
            return !zzkl.zzg.zzi && zzkl.zzs() && this.zzk.zzg.zze != -9223372036854775807L && this.zzm < 100;
        }
        return true;
    }

    public final boolean zzw(zzbq zzbq, long j, long j2) {
        zzkm zzkm;
        long j3;
        boolean z;
        zzbq zzbq2 = zzbq;
        zzkl zzkl = null;
        for (zzkl zzkl2 = this.zzi; zzkl2 != null; zzkl2 = zzkl2.zzg()) {
            zzkm zzkm2 = zzkl2.zzg;
            if (zzkl == null) {
                zzkm = zzj(zzbq2, zzkm2);
                long j4 = j;
            } else {
                zzkm zzB = zzB(zzbq2, zzkl, j);
                if (zzB == null) {
                    return !zzu(zzkl);
                }
                if (zzkm2.zzb != zzB.zzb || !zzkm2.zza.equals(zzB.zza)) {
                    return !zzu(zzkl);
                }
                zzkm = zzB;
            }
            zzkl2.zzg = zzkm.zza(zzkm2.zzc);
            if (!zzr(zzkm2.zze, zzkm.zze)) {
                zzkl2.zzr();
                long j5 = zzkm.zze;
                if (j5 == -9223372036854775807L) {
                    j3 = Long.MAX_VALUE;
                } else {
                    j3 = j5 + zzkl2.zze();
                }
                if (zzkl2 == this.zzj) {
                    boolean z2 = zzkl2.zzg.zzf;
                    if (j2 == Long.MIN_VALUE || j2 >= j3) {
                        z = true;
                        return zzu(zzkl2) && !z;
                    }
                }
                z = false;
                if (zzu(zzkl2)) {
                }
            }
            zzkl = zzkl2;
        }
        return true;
    }

    public final boolean zzx(zzbq zzbq, int i) {
        this.zzf = i;
        return zzJ(zzbq);
    }

    public final boolean zzy(zzbq zzbq, boolean z) {
        this.zzg = z;
        return zzJ(zzbq);
    }

    public final zzkl zzc(zzkm zzkm) {
        long j;
        zzkl zzkl;
        zzkl zzkl2 = this.zzk;
        if (zzkl2 == null) {
            j = 1000000000000L;
        } else {
            j = (zzkl2.zze() + zzkl2.zzg.zze) - zzkm.zzb;
        }
        int i = 0;
        while (true) {
            if (i >= this.zzp.size()) {
                zzkl = null;
                break;
            }
            zzkm zzkm2 = ((zzkl) this.zzp.get(i)).zzg;
            if (zzr(zzkm2.zze, zzkm.zze) && zzkm2.zzb == zzkm.zzb && zzkm2.zza.equals(zzkm.zza)) {
                zzkl = (zzkl) this.zzp.remove(i);
                break;
            }
            i++;
        }
        if (zzkl == null) {
            zzkl = zzkc.zzd(this.zzq.zza, zzkm, j);
        } else {
            zzkl.zzg = zzkm;
            zzkl.zzq(j);
        }
        zzkl zzkl3 = this.zzk;
        if (zzkl3 != null) {
            zzkl3.zzp(zzkl);
        } else {
            this.zzi = zzkl;
            this.zzj = zzkl;
        }
        this.zzn = null;
        this.zzk = zzkl;
        this.zzm++;
        zzG();
        return zzkl;
    }
}
