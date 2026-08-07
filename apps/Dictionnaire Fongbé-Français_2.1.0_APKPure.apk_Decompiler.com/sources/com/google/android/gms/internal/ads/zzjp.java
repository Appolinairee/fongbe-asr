package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.core.view.PointerIconCompat;
import androidx.work.impl.utils.ProcessUtils$$ExternalSyntheticApiModelOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzjp extends zzg implements zzim {
    public static final /* synthetic */ int zzd = 0;
    private boolean zzA;
    private zzlp zzB;
    private zzil zzC;
    private zzbg zzD;
    private zzav zzE;
    /* access modifiers changed from: private */
    public Object zzF;
    private Surface zzG;
    private int zzH;
    private zzdz zzI;
    private int zzJ;
    private zze zzK;
    private float zzL;
    /* access modifiers changed from: private */
    public boolean zzM;
    private boolean zzN;
    private boolean zzO;
    private int zzP;
    private zzav zzQ;
    private zzlb zzR;
    private int zzS;
    private long zzT;
    private final zzix zzU;
    private zzwb zzV;
    final zzyc zzb;
    final zzbg zzc;
    private final zzda zze;
    private final Context zzf;
    private final zzbk zzg;
    private final zzlj[] zzh;
    private final zzyb zzi;
    private final zzdh zzj;
    private final zzkc zzk;
    /* access modifiers changed from: private */
    public final zzdn zzl;
    private final CopyOnWriteArraySet zzm;
    private final zzbo zzn;
    private final List zzo;
    private final boolean zzp;
    /* access modifiers changed from: private */
    public final zzlt zzq;
    private final Looper zzr;
    private final zzyj zzs;
    private final zzcx zzt;
    private final zzjl zzu;
    private final zzjm zzv;
    private final zzhq zzw;
    private final long zzx;
    private int zzy;
    private int zzz;

    static {
        zzas.zzb("media3.exoplayer");
    }

    public zzjp(zzik zzik, zzbk zzbk) {
        zzog zzog;
        int i;
        zzik zzik2 = zzik;
        zzbk zzbk2 = zzbk;
        zzda zzda = new zzda(zzcx.zza);
        this.zze = zzda;
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = zzei.zze;
            zzdo.zze("ExoPlayerImpl", "Init " + hexString + " [AndroidXMedia3/1.5.0-beta01] [" + str + "]");
            Context applicationContext = zzik2.zza.getApplicationContext();
            this.zzf = applicationContext;
            zzlt zzlt = (zzlt) zzik2.zzh.apply(zzik2.zzb);
            this.zzq = zzlt;
            this.zzP = zzik2.zzj;
            this.zzK = zzik2.zzk;
            this.zzH = zzik2.zzl;
            this.zzM = false;
            this.zzx = zzik2.zzp;
            zzjl zzjl = new zzjl(this, (zzjo) null);
            this.zzu = zzjl;
            zzjm zzjm = new zzjm((zzjo) null);
            this.zzv = zzjm;
            Handler handler = new Handler(zzik2.zzi);
            zzced zzced = ((zzid) zzik2.zzc).zza;
            zzced zzced2 = zzced;
            Handler handler2 = handler;
            zzjm zzjm2 = zzjm;
            zzlj[] zza = zzced.zza(handler, zzjl, zzjl, zzjl, zzjl);
            this.zzh = zza;
            int length = zza.length;
            zzyb zzyb = (zzyb) zzik2.zze.zza();
            this.zzi = zzyb;
            zzuf zza2 = zzik.zza(((zzie) zzik2.zzd).zza);
            zzyj zzh2 = zzyn.zzh(((zzih) zzik2.zzg).zza);
            this.zzs = zzh2;
            this.zzp = zzik2.zzm;
            this.zzB = zzik2.zzn;
            Looper looper = zzik2.zzi;
            this.zzr = looper;
            zzcx zzcx = zzik2.zzb;
            this.zzt = zzcx;
            this.zzg = zzbk2;
            zzdn zzdn = new zzdn(looper, zzcx, new zziw(this));
            this.zzl = zzdn;
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzm = copyOnWriteArraySet;
            this.zzo = new ArrayList();
            CopyOnWriteArraySet copyOnWriteArraySet2 = copyOnWriteArraySet;
            this.zzV = new zzwb(0);
            this.zzC = zzil.zza;
            int length2 = zza.length;
            zzjl zzjl2 = zzjl;
            zzyj zzyj = zzh2;
            zzdn zzdn2 = zzdn;
            zzyc zzyc = new zzyc(new zzln[2], new zzxv[2], zzby.zza, (Object) null);
            this.zzb = zzyc;
            this.zzn = new zzbo();
            zzbf zzbf = new zzbf();
            zzbf.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            zzyb.zzn();
            zzbf.zzd(29, true);
            zzbf.zzd(23, false);
            zzbf.zzd(25, false);
            zzbf.zzd(33, false);
            zzbf.zzd(26, false);
            zzbf.zzd(34, false);
            zzbg zze2 = zzbf.zze();
            this.zzc = zze2;
            zzbf zzbf2 = new zzbf();
            zzbf2.zzb(zze2);
            zzbf2.zza(4);
            zzbf2.zza(10);
            this.zzD = zzbf2.zze();
            this.zzj = zzcx.zzd(looper, (Handler.Callback) null);
            zzix zzix = new zzix(this);
            this.zzU = zzix;
            this.zzR = zzlb.zzg(zzyc);
            zzlt.zzS(zzbk2, looper);
            if (zzei.zza < 31) {
                zzog = new zzog(zzik2.zzs);
            } else {
                boolean z = zzik2.zzq;
                String str2 = zzik2.zzs;
                zzoc zzb2 = zzoc.zzb(applicationContext);
                if (zzb2 == null) {
                    zzdo.zzf("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    zzog = new zzog(ProcessUtils$$ExternalSyntheticApiModelOutline0.m(), str2);
                } else {
                    if (z) {
                        zzy(zzb2);
                    }
                    zzog = new zzog(zzb2.zza(), str2);
                }
            }
            zzlp zzlp = this.zzB;
            zzhv zzhv = zzik2.zzt;
            zzdn zzdn3 = zzdn2;
            zzlp zzlp2 = zzlp;
            zzjl zzjl3 = zzjl2;
            Looper looper2 = looper;
            zzyj zzyj2 = zzyj;
            zzyb zzyb2 = zzyb;
            CopyOnWriteArraySet copyOnWriteArraySet3 = copyOnWriteArraySet2;
            this.zzk = new zzkc(zza, zzyb, zzyc, (zzkg) zzik2.zzf.zza(), zzyj2, 0, false, zzlt, zzlp2, zzhv, zzik2.zzo, false, false, looper2, zzcx, zzix, zzog, (zzlc) null, this.zzC);
            this.zzL = 1.0f;
            this.zzE = zzav.zza;
            this.zzQ = zzav.zza;
            this.zzS = -1;
            AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
            if (audioManager == null) {
                i = -1;
            } else {
                i = audioManager.generateAudioSessionId();
            }
            this.zzJ = i;
            int i2 = zzcp.zza;
            this.zzN = true;
            if (zzlt != null) {
                zzdn3.zzb(zzlt);
                zzyj2.zzf(new Handler(looper2), zzlt);
                zzjl zzjl4 = zzjl3;
                copyOnWriteArraySet3.add(zzjl4);
                Handler handler3 = handler2;
                new zzhl(zzik2.zza, handler3, zzjl4);
                this.zzw = new zzhq(zzik2.zza, handler3, zzjl4);
                zzik2.zza.getApplicationContext();
                zzik2.zza.getApplicationContext();
                new zzo(0).zza();
                zzcd zzcd = zzcd.zza;
                this.zzI = zzdz.zza;
                zzyb2.zzk(this.zzK);
                zzaa(1, 10, Integer.valueOf(this.zzJ));
                zzaa(2, 10, Integer.valueOf(this.zzJ));
                zzaa(1, 3, this.zzK);
                zzaa(2, 4, Integer.valueOf(this.zzH));
                zzaa(2, 5, 0);
                zzaa(1, 9, Boolean.valueOf(this.zzM));
                zzjm zzjm3 = zzjm2;
                zzaa(2, 7, zzjm3);
                zzaa(6, 8, zzjm3);
                zzaa(-1, 16, Integer.valueOf(this.zzP));
                zzda.zze();
                return;
            }
            throw null;
        } catch (Throwable th) {
            this.zze.zze();
            throw th;
        }
    }

    static /* bridge */ /* synthetic */ void zzK(zzjp zzjp, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzjp.zzac(surface);
        zzjp.zzG = surface;
    }

    private final int zzR(zzlb zzlb) {
        if (zzlb.zza.zzo()) {
            return this.zzS;
        }
        return zzlb.zza.zzn(zzlb.zzb.zza, this.zzn).zzc;
    }

    /* access modifiers changed from: private */
    public static int zzS(int i) {
        return i == -1 ? 2 : 1;
    }

    private final long zzT(zzlb zzlb) {
        if (!zzlb.zzb.zzb()) {
            return zzei.zzv(zzU(zzlb));
        }
        zzlb.zza.zzn(zzlb.zzb.zza, this.zzn);
        if (zzlb.zzc == -9223372036854775807L) {
            long j = zzlb.zza.zze(zzR(zzlb), this.zza, 0).zzl;
            return zzei.zzv(0);
        }
        int i = zzei.zza;
        return zzei.zzv(zzlb.zzc) + zzei.zzv(0);
    }

    private final long zzU(zzlb zzlb) {
        if (zzlb.zza.zzo()) {
            return zzei.zzs(this.zzT);
        }
        boolean z = zzlb.zzp;
        long j = zzlb.zzs;
        if (zzlb.zzb.zzb()) {
            return j;
        }
        zzW(zzlb.zza, zzlb.zzb, j);
        return j;
    }

    private static long zzV(zzlb zzlb) {
        zzbp zzbp = new zzbp();
        zzbo zzbo = new zzbo();
        zzlb.zza.zzn(zzlb.zzb.zza, zzbo);
        long j = zzlb.zzc;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = zzlb.zza.zze(zzbo.zzc, zzbp, 0).zzl;
        return 0;
    }

    private final long zzW(zzbq zzbq, zzug zzug, long j) {
        zzbq.zzn(zzug.zza, this.zzn);
        return j;
    }

    private final Pair zzX(zzbq zzbq, int i, long j) {
        if (zzbq.zzo()) {
            this.zzS = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.zzT = j;
            return null;
        }
        if (i == -1 || i >= zzbq.zzc()) {
            i = zzbq.zzg(false);
            long j2 = zzbq.zze(i, this.zza, 0).zzl;
            j = zzei.zzv(0);
        }
        return zzbq.zzl(this.zza, this.zzn, i, zzei.zzs(j));
    }

    private final zzlb zzY(zzlb zzlb, zzbq zzbq, Pair pair) {
        zzug zzug;
        zzwj zzwj;
        zzyc zzyc;
        List list;
        int i;
        long j;
        zzbq zzbq2 = zzbq;
        Pair pair2 = pair;
        zzcw.zzd(zzbq.zzo() || pair2 != null);
        zzbq zzbq3 = zzlb.zza;
        long zzT2 = zzT(zzlb);
        zzlb zzf2 = zzlb.zzf(zzbq);
        if (zzbq.zzo()) {
            zzug zzh2 = zzlb.zzh();
            long zzs2 = zzei.zzs(this.zzT);
            zzlb zza = zzf2.zzb(zzh2, zzs2, zzs2, zzs2, 0, zzwj.zza, this.zzb, zzfxn.zzn()).zza(zzh2);
            zza.zzq = zza.zzs;
            return zza;
        }
        Object obj = zzf2.zzb.zza;
        int i2 = zzei.zza;
        Pair pair3 = pair2;
        boolean equals = obj.equals(pair2.first);
        if (!equals) {
            zzug = new zzug(pair2.first, -1);
        } else {
            zzug = zzf2.zzb;
        }
        zzug zzug2 = zzug;
        long longValue = ((Long) pair2.second).longValue();
        long zzs3 = zzei.zzs(zzT2);
        if (!zzbq3.zzo()) {
            zzbq3.zzn(obj, this.zzn);
        }
        if (!equals || longValue < zzs3) {
            long j2 = longValue;
            zzug zzug3 = zzug2;
            zzcw.zzf(!zzug3.zzb());
            if (!equals) {
                zzwj = zzwj.zza;
            } else {
                zzwj = zzf2.zzh;
            }
            zzwj zzwj2 = zzwj;
            if (!equals) {
                zzyc = this.zzb;
            } else {
                zzyc = zzf2.zzi;
            }
            zzyc zzyc2 = zzyc;
            if (!equals) {
                list = zzfxn.zzn();
            } else {
                list = zzf2.zzj;
            }
            zzlb zza2 = zzf2.zzb(zzug3, j2, j2, j2, 0, zzwj2, zzyc2, list).zza(zzug3);
            zza2.zzq = j2;
            return zza2;
        } else if (i == 0) {
            int zza3 = zzbq2.zza(zzf2.zzk.zza);
            if (zza3 != -1 && zzbq2.zzd(zza3, this.zzn, false).zzc == zzbq2.zzn(zzug2.zza, this.zzn).zzc) {
                return zzf2;
            }
            zzbq2.zzn(zzug2.zza, this.zzn);
            if (zzug2.zzb()) {
                j = this.zzn.zzf(zzug2.zzb, zzug2.zzc);
            } else {
                j = this.zzn.zzd;
            }
            zzlb zza4 = zzf2.zzb(zzug2, zzf2.zzs, zzf2.zzs, zzf2.zzd, j - zzf2.zzs, zzf2.zzh, zzf2.zzi, zzf2.zzj).zza(zzug2);
            zza4.zzq = j;
            return zza4;
        } else {
            zzug zzug4 = zzug2;
            zzcw.zzf(!zzug4.zzb());
            long max = Math.max(0, zzf2.zzr - (longValue - zzs3));
            long j3 = zzf2.zzq;
            if (zzf2.zzk.equals(zzf2.zzb)) {
                j3 = longValue + max;
            }
            zzlb zzb2 = zzf2.zzb(zzug4, longValue, longValue, longValue, max, zzf2.zzh, zzf2.zzi, zzf2.zzj);
            zzb2.zzq = j3;
            return zzb2;
        }
    }

    /* access modifiers changed from: private */
    public final void zzZ(int i, int i2) {
        if (i != this.zzI.zzb() || i2 != this.zzI.zza()) {
            this.zzI = new zzdz(i, i2);
            zzdn zzdn = this.zzl;
            zzdn.zzd(24, new zzit(i, i2));
            zzdn.zzc();
            zzaa(2, 14, new zzdz(i, i2));
        }
    }

    private final void zzaa(int i, int i2, Object obj) {
        zzlj[] zzljArr = this.zzh;
        int length = zzljArr.length;
        for (int i3 = 0; i3 < 2; i3++) {
            zzlj zzlj = zzljArr[i3];
            if (i == -1 || zzlj.zzb() == i) {
                int zzR2 = zzR(this.zzR);
                zzkc zzkc = this.zzk;
                zzlf zzlf = new zzlf(zzkc, zzlj, this.zzR.zza, zzR2 == -1 ? 0 : zzR2, this.zzt, zzkc.zzc());
                zzlf.zzf(i2);
                zzlf.zze(obj);
                zzlf.zzd();
            }
        }
    }

    /* access modifiers changed from: private */
    public final void zzab() {
        zzaa(1, 2, Float.valueOf(this.zzL * this.zzw.zza()));
    }

    /* access modifiers changed from: private */
    public final void zzac(Object obj) {
        Surface surface;
        Object obj2 = this.zzF;
        boolean z = false;
        if (!(obj2 == null || obj2 == obj)) {
            z = true;
        }
        boolean zzq2 = this.zzk.zzq(obj, z ? this.zzx : -9223372036854775807L);
        if (z && this.zzF == (surface = this.zzG)) {
            surface.release();
            this.zzG = null;
        }
        this.zzF = obj;
        if (!zzq2) {
            zzad(zzib.zzd(new zzkd(3), PointerIconCompat.TYPE_HELP));
        }
    }

    private final void zzad(zzib zzib) {
        zzlb zzlb = this.zzR;
        zzlb zza = zzlb.zza(zzlb.zzb);
        zza.zzq = zza.zzs;
        zza.zzr = 0;
        zzlb zze2 = zza.zze(1);
        if (zzib != null) {
            zze2 = zze2.zzd(zzib);
        }
        this.zzy++;
        this.zzk.zzo();
        zzaf(zze2, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* access modifiers changed from: private */
    public final void zzae(boolean z, int i, int i2) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (i == 0) {
            i3 = 1;
        }
        zzlb zzlb = this.zzR;
        if (zzlb.zzl != z2 || zzlb.zzn != i3 || zzlb.zzm != i2) {
            this.zzy++;
            boolean z3 = zzlb.zzp;
            zzlb zzc2 = zzlb.zzc(z2, i2, i3);
            this.zzk.zzn(z2, i2, i3);
            zzaf(zzc2, 0, false, 5, -9223372036854775807L, -1, false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02f4  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x033f  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x035c  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0380  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x03ab  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x03ce  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x03e2  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x03ef  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x03f4  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0414  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x042f  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0443  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x045e  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0460  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0478 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0482 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x048d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x049e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x04aa A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x04c1 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x04cd A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x04e7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzaf(com.google.android.gms.internal.ads.zzlb r44, int r45, boolean r46, int r47, long r48, int r50, boolean r51) {
        /*
            r43 = this;
            r0 = r43
            r1 = r44
            r2 = r47
            com.google.android.gms.internal.ads.zzlb r3 = r0.zzR
            r0.zzR = r1
            com.google.android.gms.internal.ads.zzbq r4 = r3.zza
            com.google.android.gms.internal.ads.zzbq r5 = r1.zza
            boolean r4 = r4.equals(r5)
            com.google.android.gms.internal.ads.zzbq r5 = r3.zza
            com.google.android.gms.internal.ads.zzbq r6 = r1.zza
            boolean r7 = r6.zzo()
            r9 = 3
            r10 = -1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r12 = 0
            r14 = 1
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r14)
            r8 = 0
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r8)
            if (r7 == 0) goto L_0x003a
            boolean r7 = r5.zzo()
            if (r7 == 0) goto L_0x003a
            android.util.Pair r5 = new android.util.Pair
            r5.<init>(r10, r11)
            goto L_0x004d
        L_0x003a:
            boolean r7 = r6.zzo()
            boolean r8 = r5.zzo()
            if (r7 == r8) goto L_0x0053
            android.util.Pair r5 = new android.util.Pair
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            r5.<init>(r15, r6)
        L_0x004d:
            r7 = r5
            r5 = r2
            r2 = r46
            goto L_0x00d9
        L_0x0053:
            com.google.android.gms.internal.ads.zzug r7 = r3.zzb
            java.lang.Object r7 = r7.zza
            com.google.android.gms.internal.ads.zzbo r8 = r0.zzn
            com.google.android.gms.internal.ads.zzbo r7 = r5.zzn(r7, r8)
            int r7 = r7.zzc
            com.google.android.gms.internal.ads.zzbp r8 = r0.zza
            com.google.android.gms.internal.ads.zzbp r5 = r5.zze(r7, r8, r12)
            java.lang.Object r5 = r5.zzb
            com.google.android.gms.internal.ads.zzug r7 = r1.zzb
            java.lang.Object r7 = r7.zza
            com.google.android.gms.internal.ads.zzbo r8 = r0.zzn
            com.google.android.gms.internal.ads.zzbo r7 = r6.zzn(r7, r8)
            int r7 = r7.zzc
            com.google.android.gms.internal.ads.zzbp r8 = r0.zza
            com.google.android.gms.internal.ads.zzbp r6 = r6.zze(r7, r8, r12)
            java.lang.Object r6 = r6.zzb
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x00ad
            if (r46 == 0) goto L_0x008c
            if (r2 != 0) goto L_0x0089
            r2 = 0
            r5 = 1
            r6 = 1
            goto L_0x0098
        L_0x0089:
            r5 = 1
            r6 = 1
            goto L_0x008e
        L_0x008c:
            r5 = 0
            r6 = 0
        L_0x008e:
            if (r5 == 0) goto L_0x0095
            if (r2 != r14) goto L_0x0095
            r5 = r6
            r6 = 2
            goto L_0x0098
        L_0x0095:
            if (r4 != 0) goto L_0x00a7
            r6 = 3
        L_0x0098:
            android.util.Pair r7 = new android.util.Pair
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.<init>(r15, r6)
            r42 = r5
            r5 = r2
            r2 = r42
            goto L_0x00d9
        L_0x00a7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x00ad:
            if (r46 == 0) goto L_0x00d1
            if (r2 != 0) goto L_0x00ce
            com.google.android.gms.internal.ads.zzug r2 = r3.zzb
            long r5 = r2.zzd
            com.google.android.gms.internal.ads.zzug r2 = r1.zzb
            long r7 = r2.zzd
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x00cb
            android.util.Pair r5 = new android.util.Pair
            r2 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r5.<init>(r15, r6)
            r7 = r5
            r2 = 1
            r5 = 0
            goto L_0x00d9
        L_0x00cb:
            r2 = 1
            r5 = 0
            goto L_0x00d3
        L_0x00ce:
            r5 = r2
            r2 = 1
            goto L_0x00d3
        L_0x00d1:
            r5 = r2
            r2 = 0
        L_0x00d3:
            android.util.Pair r6 = new android.util.Pair
            r6.<init>(r10, r11)
            r7 = r6
        L_0x00d9:
            java.lang.Object r6 = r7.first
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            java.lang.Object r7 = r7.second
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r6 == 0) goto L_0x0112
            com.google.android.gms.internal.ads.zzbq r10 = r1.zza
            boolean r10 = r10.zzo()
            if (r10 != 0) goto L_0x010c
            com.google.android.gms.internal.ads.zzbq r10 = r1.zza
            com.google.android.gms.internal.ads.zzug r11 = r1.zzb
            java.lang.Object r11 = r11.zza
            com.google.android.gms.internal.ads.zzbo r15 = r0.zzn
            com.google.android.gms.internal.ads.zzbo r10 = r10.zzn(r11, r15)
            int r10 = r10.zzc
            com.google.android.gms.internal.ads.zzbq r11 = r1.zza
            com.google.android.gms.internal.ads.zzbp r15 = r0.zza
            com.google.android.gms.internal.ads.zzbp r10 = r11.zze(r10, r15, r12)
            com.google.android.gms.internal.ads.zzar r10 = r10.zzd
            goto L_0x010d
        L_0x010c:
            r10 = 0
        L_0x010d:
            com.google.android.gms.internal.ads.zzav r11 = com.google.android.gms.internal.ads.zzav.zza
            r0.zzQ = r11
            goto L_0x0113
        L_0x0112:
            r10 = 0
        L_0x0113:
            if (r6 != 0) goto L_0x011f
            java.util.List r11 = r3.zzj
            java.util.List r15 = r1.zzj
            boolean r11 = r11.equals(r15)
            if (r11 != 0) goto L_0x0151
        L_0x011f:
            com.google.android.gms.internal.ads.zzav r11 = r0.zzQ
            com.google.android.gms.internal.ads.zzat r11 = r11.zza()
            java.util.List r15 = r1.zzj
            r8 = 0
        L_0x0128:
            int r9 = r15.size()
            if (r8 >= r9) goto L_0x014b
            java.lang.Object r9 = r15.get(r8)
            com.google.android.gms.internal.ads.zzay r9 = (com.google.android.gms.internal.ads.zzay) r9
            r14 = 0
        L_0x0135:
            int r12 = r9.zza()
            if (r14 >= r12) goto L_0x0145
            com.google.android.gms.internal.ads.zzax r12 = r9.zzb(r14)
            r12.zza(r11)
            int r14 = r14 + 1
            goto L_0x0135
        L_0x0145:
            int r8 = r8 + 1
            r12 = 0
            r14 = 1
            goto L_0x0128
        L_0x014b:
            com.google.android.gms.internal.ads.zzav r8 = r11.zzu()
            r0.zzQ = r8
        L_0x0151:
            com.google.android.gms.internal.ads.zzbq r8 = r43.zzn()
            boolean r9 = r8.zzo()
            if (r9 == 0) goto L_0x015e
            com.google.android.gms.internal.ads.zzav r8 = r0.zzQ
            goto L_0x017b
        L_0x015e:
            int r9 = r43.zzd()
            com.google.android.gms.internal.ads.zzbp r11 = r0.zza
            r12 = 0
            com.google.android.gms.internal.ads.zzbp r8 = r8.zze(r9, r11, r12)
            com.google.android.gms.internal.ads.zzar r8 = r8.zzd
            com.google.android.gms.internal.ads.zzav r9 = r0.zzQ
            com.google.android.gms.internal.ads.zzat r9 = r9.zza()
            com.google.android.gms.internal.ads.zzav r8 = r8.zzd
            r9.zzb(r8)
            com.google.android.gms.internal.ads.zzav r8 = r9.zzu()
        L_0x017b:
            com.google.android.gms.internal.ads.zzav r9 = r0.zzE
            boolean r9 = r8.equals(r9)
            r0.zzE = r8
            boolean r8 = r3.zzl
            boolean r11 = r1.zzl
            if (r8 == r11) goto L_0x018b
            r8 = 1
            goto L_0x018c
        L_0x018b:
            r8 = 0
        L_0x018c:
            int r11 = r3.zze
            int r12 = r1.zze
            if (r11 == r12) goto L_0x0194
            r11 = 1
            goto L_0x0195
        L_0x0194:
            r11 = 0
        L_0x0195:
            if (r11 != 0) goto L_0x0199
            if (r8 == 0) goto L_0x019c
        L_0x0199:
            r43.zzag()
        L_0x019c:
            boolean r12 = r3.zzg
            boolean r13 = r1.zzg
            if (r12 == r13) goto L_0x01a4
            r12 = 1
            goto L_0x01a5
        L_0x01a4:
            r12 = 0
        L_0x01a5:
            if (r4 != 0) goto L_0x01b4
            com.google.android.gms.internal.ads.zzdn r4 = r0.zzl
            com.google.android.gms.internal.ads.zzin r13 = new com.google.android.gms.internal.ads.zzin
            r14 = r45
            r13.<init>(r1, r14)
            r14 = 0
            r4.zzd(r14, r13)
        L_0x01b4:
            if (r2 == 0) goto L_0x02e2
            com.google.android.gms.internal.ads.zzbo r2 = new com.google.android.gms.internal.ads.zzbo
            r2.<init>()
            com.google.android.gms.internal.ads.zzbq r13 = r3.zza
            boolean r13 = r13.zzo()
            if (r13 != 0) goto L_0x01f5
            com.google.android.gms.internal.ads.zzug r13 = r3.zzb
            java.lang.Object r13 = r13.zza
            com.google.android.gms.internal.ads.zzbq r14 = r3.zza
            r14.zzn(r13, r2)
            int r14 = r2.zzc
            com.google.android.gms.internal.ads.zzbq r15 = r3.zza
            int r15 = r15.zza(r13)
            com.google.android.gms.internal.ads.zzbq r4 = r3.zza
            r47 = r13
            com.google.android.gms.internal.ads.zzbp r13 = r0.zza
            r18 = r11
            r19 = r12
            r11 = 0
            com.google.android.gms.internal.ads.zzbp r4 = r4.zze(r14, r13, r11)
            java.lang.Object r4 = r4.zzb
            com.google.android.gms.internal.ads.zzbp r11 = r0.zza
            com.google.android.gms.internal.ads.zzar r11 = r11.zzd
            r24 = r47
            r21 = r4
            r23 = r11
            r22 = r14
            r25 = r15
            goto L_0x0203
        L_0x01f5:
            r18 = r11
            r19 = r12
            r22 = r50
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = -1
        L_0x0203:
            if (r5 != 0) goto L_0x022d
            com.google.android.gms.internal.ads.zzug r4 = r3.zzb
            boolean r4 = r4.zzb()
            if (r4 == 0) goto L_0x021c
            com.google.android.gms.internal.ads.zzug r4 = r3.zzb
            int r11 = r4.zzb
            int r4 = r4.zzc
            long r11 = r2.zzf(r11, r4)
            long r13 = zzV(r3)
            goto L_0x023f
        L_0x021c:
            com.google.android.gms.internal.ads.zzug r4 = r3.zzb
            int r4 = r4.zze
            r11 = -1
            if (r4 == r11) goto L_0x022a
            com.google.android.gms.internal.ads.zzlb r2 = r0.zzR
            long r11 = zzV(r2)
            goto L_0x023e
        L_0x022a:
            long r11 = r2.zzd
            goto L_0x023e
        L_0x022d:
            com.google.android.gms.internal.ads.zzug r2 = r3.zzb
            boolean r2 = r2.zzb()
            if (r2 == 0) goto L_0x023c
            long r11 = r3.zzs
            long r13 = zzV(r3)
            goto L_0x023f
        L_0x023c:
            long r11 = r3.zzs
        L_0x023e:
            r13 = r11
        L_0x023f:
            com.google.android.gms.internal.ads.zzbi r2 = new com.google.android.gms.internal.ads.zzbi
            int r4 = com.google.android.gms.internal.ads.zzei.zza
            com.google.android.gms.internal.ads.zzug r4 = r3.zzb
            int r15 = r4.zzb
            int r4 = r4.zzc
            long r26 = com.google.android.gms.internal.ads.zzei.zzv(r11)
            long r28 = com.google.android.gms.internal.ads.zzei.zzv(r13)
            r20 = r2
            r30 = r15
            r31 = r4
            r20.<init>(r21, r22, r23, r24, r25, r26, r28, r30, r31)
            int r4 = r43.zzd()
            com.google.android.gms.internal.ads.zzlb r11 = r0.zzR
            com.google.android.gms.internal.ads.zzbq r11 = r11.zza
            boolean r11 = r11.zzo()
            if (r11 != 0) goto L_0x029b
            com.google.android.gms.internal.ads.zzlb r11 = r0.zzR
            com.google.android.gms.internal.ads.zzug r12 = r11.zzb
            java.lang.Object r12 = r12.zza
            com.google.android.gms.internal.ads.zzbq r11 = r11.zza
            com.google.android.gms.internal.ads.zzbo r13 = r0.zzn
            r11.zzn(r12, r13)
            com.google.android.gms.internal.ads.zzlb r11 = r0.zzR
            com.google.android.gms.internal.ads.zzbq r11 = r11.zza
            int r11 = r11.zza(r12)
            com.google.android.gms.internal.ads.zzlb r13 = r0.zzR
            com.google.android.gms.internal.ads.zzbq r13 = r13.zza
            com.google.android.gms.internal.ads.zzbp r14 = r0.zza
            r46 = r11
            r15 = r12
            r11 = 0
            com.google.android.gms.internal.ads.zzbp r13 = r13.zze(r4, r14, r11)
            java.lang.Object r11 = r13.zzb
            com.google.android.gms.internal.ads.zzbp r12 = r0.zza
            com.google.android.gms.internal.ads.zzar r12 = r12.zzd
            r35 = r46
            r31 = r11
            r33 = r12
            r34 = r15
            goto L_0x02a3
        L_0x029b:
            r31 = 0
            r33 = 0
            r34 = 0
            r35 = -1
        L_0x02a3:
            long r36 = com.google.android.gms.internal.ads.zzei.zzv(r48)
            com.google.android.gms.internal.ads.zzbi r11 = new com.google.android.gms.internal.ads.zzbi
            com.google.android.gms.internal.ads.zzlb r12 = r0.zzR
            com.google.android.gms.internal.ads.zzug r12 = r12.zzb
            boolean r12 = r12.zzb()
            if (r12 == 0) goto L_0x02c0
            com.google.android.gms.internal.ads.zzlb r12 = r0.zzR
            long r12 = zzV(r12)
            long r12 = com.google.android.gms.internal.ads.zzei.zzv(r12)
            r38 = r12
            goto L_0x02c2
        L_0x02c0:
            r38 = r36
        L_0x02c2:
            com.google.android.gms.internal.ads.zzlb r12 = r0.zzR
            com.google.android.gms.internal.ads.zzug r12 = r12.zzb
            int r13 = r12.zzb
            int r12 = r12.zzc
            r30 = r11
            r32 = r4
            r40 = r13
            r41 = r12
            r30.<init>(r31, r32, r33, r34, r35, r36, r38, r40, r41)
            com.google.android.gms.internal.ads.zzdn r4 = r0.zzl
            com.google.android.gms.internal.ads.zzjd r12 = new com.google.android.gms.internal.ads.zzjd
            r12.<init>(r5, r2, r11)
            r2 = 11
            r4.zzd(r2, r12)
            goto L_0x02e6
        L_0x02e2:
            r18 = r11
            r19 = r12
        L_0x02e6:
            if (r6 == 0) goto L_0x02f4
            com.google.android.gms.internal.ads.zzdn r2 = r0.zzl
            com.google.android.gms.internal.ads.zzje r4 = new com.google.android.gms.internal.ads.zzje
            r4.<init>(r10, r7)
            r5 = 1
            r2.zzd(r5, r4)
            goto L_0x02f5
        L_0x02f4:
            r5 = 1
        L_0x02f5:
            com.google.android.gms.internal.ads.zzib r2 = r3.zzf
            com.google.android.gms.internal.ads.zzib r4 = r1.zzf
            r6 = 10
            if (r2 == r4) goto L_0x0315
            com.google.android.gms.internal.ads.zzdn r2 = r0.zzl
            com.google.android.gms.internal.ads.zzjf r4 = new com.google.android.gms.internal.ads.zzjf
            r4.<init>(r1)
            r2.zzd(r6, r4)
            com.google.android.gms.internal.ads.zzib r2 = r1.zzf
            if (r2 == 0) goto L_0x0315
            com.google.android.gms.internal.ads.zzdn r2 = r0.zzl
            com.google.android.gms.internal.ads.zzjg r4 = new com.google.android.gms.internal.ads.zzjg
            r4.<init>(r1)
            r2.zzd(r6, r4)
        L_0x0315:
            com.google.android.gms.internal.ads.zzyc r2 = r3.zzi
            com.google.android.gms.internal.ads.zzyc r4 = r1.zzi
            if (r2 == r4) goto L_0x032d
            com.google.android.gms.internal.ads.zzyb r2 = r0.zzi
            java.lang.Object r4 = r4.zze
            r2.zzp(r4)
            com.google.android.gms.internal.ads.zzdn r2 = r0.zzl
            com.google.android.gms.internal.ads.zzjh r4 = new com.google.android.gms.internal.ads.zzjh
            r4.<init>(r1)
            r7 = 2
            r2.zzd(r7, r4)
        L_0x032d:
            if (r9 != 0) goto L_0x033d
            com.google.android.gms.internal.ads.zzav r2 = r0.zzE
            com.google.android.gms.internal.ads.zzdn r4 = r0.zzl
            com.google.android.gms.internal.ads.zzio r7 = new com.google.android.gms.internal.ads.zzio
            r7.<init>(r2)
            r2 = 14
            r4.zzd(r2, r7)
        L_0x033d:
            if (r19 == 0) goto L_0x034a
            com.google.android.gms.internal.ads.zzdn r2 = r0.zzl
            com.google.android.gms.internal.ads.zzip r4 = new com.google.android.gms.internal.ads.zzip
            r4.<init>(r1)
            r7 = 3
            r2.zzd(r7, r4)
        L_0x034a:
            if (r18 != 0) goto L_0x034e
            if (r8 == 0) goto L_0x0359
        L_0x034e:
            com.google.android.gms.internal.ads.zzdn r2 = r0.zzl
            com.google.android.gms.internal.ads.zziq r4 = new com.google.android.gms.internal.ads.zziq
            r4.<init>(r1)
            r7 = -1
            r2.zzd(r7, r4)
        L_0x0359:
            r2 = 4
            if (r18 == 0) goto L_0x0366
            com.google.android.gms.internal.ads.zzdn r4 = r0.zzl
            com.google.android.gms.internal.ads.zzir r7 = new com.google.android.gms.internal.ads.zzir
            r7.<init>(r1)
            r4.zzd(r2, r7)
        L_0x0366:
            r4 = 5
            if (r8 != 0) goto L_0x036f
            int r7 = r3.zzm
            int r8 = r1.zzm
            if (r7 == r8) goto L_0x0379
        L_0x036f:
            com.google.android.gms.internal.ads.zzdn r7 = r0.zzl
            com.google.android.gms.internal.ads.zziv r8 = new com.google.android.gms.internal.ads.zziv
            r8.<init>(r1)
            r7.zzd(r4, r8)
        L_0x0379:
            int r7 = r3.zzn
            int r8 = r1.zzn
            r9 = 6
            if (r7 == r8) goto L_0x038a
            com.google.android.gms.internal.ads.zzdn r7 = r0.zzl
            com.google.android.gms.internal.ads.zzja r8 = new com.google.android.gms.internal.ads.zzja
            r8.<init>(r1)
            r7.zzd(r9, r8)
        L_0x038a:
            boolean r7 = r3.zzi()
            boolean r8 = r44.zzi()
            r10 = 7
            if (r7 == r8) goto L_0x039f
            com.google.android.gms.internal.ads.zzdn r7 = r0.zzl
            com.google.android.gms.internal.ads.zzjb r8 = new com.google.android.gms.internal.ads.zzjb
            r8.<init>(r1)
            r7.zzd(r10, r8)
        L_0x039f:
            com.google.android.gms.internal.ads.zzbe r7 = r3.zzo
            com.google.android.gms.internal.ads.zzbe r8 = r1.zzo
            boolean r7 = r7.equals(r8)
            r8 = 12
            if (r7 != 0) goto L_0x03b5
            com.google.android.gms.internal.ads.zzdn r7 = r0.zzl
            com.google.android.gms.internal.ads.zzjc r11 = new com.google.android.gms.internal.ads.zzjc
            r11.<init>(r1)
            r7.zzd(r8, r11)
        L_0x03b5:
            com.google.android.gms.internal.ads.zzbg r7 = r0.zzD
            com.google.android.gms.internal.ads.zzbk r11 = r0.zzg
            com.google.android.gms.internal.ads.zzbg r12 = r0.zzc
            int r13 = com.google.android.gms.internal.ads.zzei.zza
            boolean r13 = r11.zzw()
            r14 = r11
            com.google.android.gms.internal.ads.zzg r14 = (com.google.android.gms.internal.ads.zzg) r14
            com.google.android.gms.internal.ads.zzbq r15 = r14.zzn()
            boolean r17 = r15.zzo()
            if (r17 != 0) goto L_0x03e2
            int r5 = r14.zzd()
            com.google.android.gms.internal.ads.zzbp r8 = r14.zza
            r17 = r7
            r6 = 0
            com.google.android.gms.internal.ads.zzbp r5 = r15.zze(r5, r8, r6)
            boolean r5 = r5.zzh
            if (r5 == 0) goto L_0x03e4
            r5 = 1
            goto L_0x03e5
        L_0x03e2:
            r17 = r7
        L_0x03e4:
            r5 = 0
        L_0x03e5:
            com.google.android.gms.internal.ads.zzbq r6 = r14.zzn()
            boolean r7 = r6.zzo()
            if (r7 == 0) goto L_0x03f4
            r7 = -1
            r8 = 0
        L_0x03f1:
            r16 = 0
            goto L_0x0408
        L_0x03f4:
            int r7 = r14.zzd()
            r14.zzh()
            r14.zzv()
            r8 = 0
            int r6 = r6.zzk(r7, r8, r8)
            r7 = -1
            if (r6 == r7) goto L_0x03f1
            r16 = 1
        L_0x0408:
            com.google.android.gms.internal.ads.zzbq r6 = r14.zzn()
            boolean r15 = r6.zzo()
            if (r15 == 0) goto L_0x0414
        L_0x0412:
            r6 = 0
            goto L_0x0425
        L_0x0414:
            int r15 = r14.zzd()
            r14.zzh()
            r14.zzv()
            int r6 = r6.zzj(r15, r8, r8)
            if (r6 == r7) goto L_0x0412
            r6 = 1
        L_0x0425:
            com.google.android.gms.internal.ads.zzbq r7 = r14.zzn()
            boolean r15 = r7.zzo()
            if (r15 != 0) goto L_0x0443
            int r15 = r14.zzd()
            com.google.android.gms.internal.ads.zzbp r8 = r14.zza
            r9 = 0
            com.google.android.gms.internal.ads.zzbp r7 = r7.zze(r15, r8, r9)
            boolean r7 = r7.zzb()
            if (r7 == 0) goto L_0x0445
            r7 = 1
            goto L_0x0446
        L_0x0443:
            r9 = 0
        L_0x0445:
            r7 = 0
        L_0x0446:
            com.google.android.gms.internal.ads.zzbq r8 = r14.zzn()
            boolean r15 = r8.zzo()
            if (r15 != 0) goto L_0x0460
            int r15 = r14.zzd()
            com.google.android.gms.internal.ads.zzbp r14 = r14.zza
            com.google.android.gms.internal.ads.zzbp r8 = r8.zze(r15, r14, r9)
            boolean r8 = r8.zzi
            if (r8 == 0) goto L_0x0460
            r8 = 1
            goto L_0x0461
        L_0x0460:
            r8 = 0
        L_0x0461:
            com.google.android.gms.internal.ads.zzbq r9 = r11.zzn()
            boolean r9 = r9.zzo()
            com.google.android.gms.internal.ads.zzbf r10 = new com.google.android.gms.internal.ads.zzbf
            r10.<init>()
            r10.zzb(r12)
            r11 = r13 ^ 1
            r10.zzd(r2, r11)
            if (r5 == 0) goto L_0x047c
            if (r13 != 0) goto L_0x047c
            r2 = 1
            goto L_0x047d
        L_0x047c:
            r2 = 0
        L_0x047d:
            r10.zzd(r4, r2)
            if (r16 == 0) goto L_0x0486
            if (r13 != 0) goto L_0x0486
            r2 = 1
            goto L_0x0487
        L_0x0486:
            r2 = 0
        L_0x0487:
            r4 = 6
            r10.zzd(r4, r2)
            if (r9 != 0) goto L_0x0497
            if (r16 != 0) goto L_0x0493
            if (r7 == 0) goto L_0x0493
            if (r5 == 0) goto L_0x0497
        L_0x0493:
            if (r13 != 0) goto L_0x0497
            r2 = 1
            goto L_0x0498
        L_0x0497:
            r2 = 0
        L_0x0498:
            r4 = 7
            r10.zzd(r4, r2)
            if (r6 == 0) goto L_0x04a2
            if (r13 != 0) goto L_0x04a2
            r2 = 1
            goto L_0x04a3
        L_0x04a2:
            r2 = 0
        L_0x04a3:
            r4 = 8
            r10.zzd(r4, r2)
            if (r9 != 0) goto L_0x04b4
            if (r6 != 0) goto L_0x04b0
            if (r7 == 0) goto L_0x04b4
            if (r8 == 0) goto L_0x04b4
        L_0x04b0:
            if (r13 != 0) goto L_0x04b4
            r2 = 1
            goto L_0x04b5
        L_0x04b4:
            r2 = 0
        L_0x04b5:
            r4 = 9
            r10.zzd(r4, r2)
            r2 = 10
            r10.zzd(r2, r11)
            if (r5 == 0) goto L_0x04c5
            if (r13 != 0) goto L_0x04c5
            r2 = 1
            goto L_0x04c6
        L_0x04c5:
            r2 = 0
        L_0x04c6:
            r4 = 11
            r10.zzd(r4, r2)
            if (r5 == 0) goto L_0x04d3
            if (r13 != 0) goto L_0x04d3
            r2 = 12
            r14 = 1
            goto L_0x04d6
        L_0x04d3:
            r2 = 12
            r14 = 0
        L_0x04d6:
            r10.zzd(r2, r14)
            com.google.android.gms.internal.ads.zzbg r2 = r10.zze()
            r0.zzD = r2
            r4 = r17
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x04f3
            com.google.android.gms.internal.ads.zzdn r2 = r0.zzl
            com.google.android.gms.internal.ads.zziz r4 = new com.google.android.gms.internal.ads.zziz
            r4.<init>(r0)
            r5 = 13
            r2.zzd(r5, r4)
        L_0x04f3:
            com.google.android.gms.internal.ads.zzdn r2 = r0.zzl
            r2.zzc()
            boolean r2 = r3.zzp
            boolean r1 = r1.zzp
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjp.zzaf(com.google.android.gms.internal.ads.zzlb, int, boolean, int, long, int, boolean):void");
    }

    private final void zzag() {
        int zzf2 = zzf();
        if (zzf2 == 2 || zzf2 == 3) {
            zzah();
            boolean z = this.zzR.zzp;
            zzu();
            zzu();
        }
    }

    private final void zzah() {
        IllegalStateException illegalStateException;
        this.zze.zzb();
        if (Thread.currentThread() != this.zzr.getThread()) {
            String format = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", new Object[]{Thread.currentThread().getName(), this.zzr.getThread().getName()});
            if (!this.zzN) {
                if (this.zzO) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                zzdo.zzg("ExoPlayerImpl", format, illegalStateException);
                this.zzO = true;
                return;
            }
            throw new IllegalStateException(format);
        }
    }

    public final void zzA(zzlw zzlw) {
        zzah();
        zzlw zzlw2 = zzlw;
        this.zzq.zzR(zzlw);
    }

    public final void zzB(zzui zzui) {
        zzah();
        List singletonList = Collections.singletonList(zzui);
        zzah();
        zzah();
        zzR(this.zzR);
        zzk();
        this.zzy++;
        boolean z = false;
        if (!this.zzo.isEmpty()) {
            int size = this.zzo.size();
            for (int i = size - 1; i >= 0; i--) {
                this.zzo.remove(i);
            }
            this.zzV = this.zzV.zzh(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < singletonList.size(); i2++) {
            zzky zzky = new zzky((zzui) singletonList.get(i2), this.zzp);
            arrayList.add(zzky);
            this.zzo.add(i2, new zzjn(zzky.zzb, zzky.zza));
        }
        this.zzV = this.zzV.zzg(0, arrayList.size());
        zzlh zzlh = new zzlh(this.zzo, this.zzV);
        if (zzlh.zzo() || zzlh.zzc() >= 0) {
            int zzg2 = zzlh.zzg(false);
            zzlb zzY = zzY(this.zzR, zzlh, zzX(zzlh, zzg2, -9223372036854775807L));
            int i3 = zzY.zze;
            if (!(zzg2 == -1 || i3 == 1)) {
                i3 = 4;
                if (!zzlh.zzo() && zzg2 < zzlh.zzc()) {
                    i3 = 2;
                }
            }
            zzlb zze2 = zzY.zze(i3);
            this.zzk.zzr(arrayList, zzg2, zzei.zzs(-9223372036854775807L), this.zzV);
            if (!this.zzR.zzb.zza.equals(zze2.zzb.zza) && !this.zzR.zza.zzo()) {
                z = true;
            }
            zzaf(zze2, 0, z, 4, zzU(zze2), -1, false);
            return;
        }
        throw new zzac(zzlh, -1, -9223372036854775807L);
    }

    public final zzib zzE() {
        zzah();
        return this.zzR.zzf;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzN(zzjz zzjz) {
        this.zzj.zzh(new zziy(this, zzjz));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzO(zzjz zzjz) {
        long j;
        int i = this.zzy - zzjz.zzb;
        this.zzy = i;
        boolean z = true;
        if (zzjz.zzc) {
            this.zzz = zzjz.zzd;
            this.zzA = true;
        }
        if (i == 0) {
            zzbq zzbq = zzjz.zza.zza;
            if (!this.zzR.zza.zzo() && zzbq.zzo()) {
                this.zzS = -1;
                this.zzT = 0;
            }
            if (!zzbq.zzo()) {
                List zzw2 = ((zzlh) zzbq).zzw();
                zzcw.zzf(zzw2.size() == this.zzo.size());
                for (int i2 = 0; i2 < zzw2.size(); i2++) {
                    ((zzjn) this.zzo.get(i2)).zzc((zzbq) zzw2.get(i2));
                }
            }
            long j2 = -9223372036854775807L;
            if (this.zzA) {
                if (zzjz.zza.zzb.equals(this.zzR.zzb) && zzjz.zza.zzd == this.zzR.zzs) {
                    z = false;
                }
                if (z) {
                    if (zzbq.zzo() || zzjz.zza.zzb.zzb()) {
                        j = zzjz.zza.zzd;
                    } else {
                        zzlb zzlb = zzjz.zza;
                        zzug zzug = zzlb.zzb;
                        j = zzlb.zzd;
                        zzW(zzbq, zzug, j);
                    }
                    j2 = j;
                }
            } else {
                z = false;
            }
            this.zzA = false;
            zzaf(zzjz.zza, 1, z, this.zzz, j2, -1, false);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzP(zzbh zzbh) {
        zzbh.zza(this.zzD);
    }

    public final void zza(int i, long j, int i2, boolean z) {
        zzah();
        if (i != -1) {
            zzcw.zzd(i >= 0);
            zzbq zzbq = this.zzR.zza;
            if (zzbq.zzo() || i < zzbq.zzc()) {
                this.zzq.zzu();
                this.zzy++;
                if (zzw()) {
                    zzdo.zzf("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                    zzjz zzjz = new zzjz(this.zzR);
                    zzjz.zza(1);
                    this.zzU.zza.zzN(zzjz);
                    return;
                }
                zzlb zzlb = this.zzR;
                int i3 = zzlb.zze;
                if (i3 == 3 || (i3 == 4 && !zzbq.zzo())) {
                    zzlb = this.zzR.zze(2);
                }
                int zzd2 = zzd();
                zzlb zzY = zzY(zzlb, zzbq, zzX(zzbq, i, j));
                this.zzk.zzl(zzbq, i, zzei.zzs(j));
                zzaf(zzY, 0, true, 1, zzU(zzY), zzd2, false);
            }
        }
    }

    public final int zzb() {
        zzah();
        if (zzw()) {
            return this.zzR.zzb.zzb;
        }
        return -1;
    }

    public final int zzc() {
        zzah();
        if (zzw()) {
            return this.zzR.zzb.zzc;
        }
        return -1;
    }

    public final int zzd() {
        zzah();
        int zzR2 = zzR(this.zzR);
        if (zzR2 == -1) {
            return 0;
        }
        return zzR2;
    }

    public final int zze() {
        zzah();
        if (this.zzR.zza.zzo()) {
            return 0;
        }
        zzlb zzlb = this.zzR;
        return zzlb.zza.zza(zzlb.zzb.zza);
    }

    public final int zzf() {
        zzah();
        return this.zzR.zze;
    }

    public final int zzg() {
        zzah();
        return this.zzR.zzn;
    }

    public final int zzh() {
        zzah();
        return 0;
    }

    public final long zzi() {
        zzah();
        if (zzw()) {
            zzlb zzlb = this.zzR;
            if (zzlb.zzk.equals(zzlb.zzb)) {
                return zzei.zzv(this.zzR.zzq);
            }
            return zzl();
        }
        zzah();
        if (this.zzR.zza.zzo()) {
            return this.zzT;
        }
        zzlb zzlb2 = this.zzR;
        long j = 0;
        if (zzlb2.zzk.zzd != zzlb2.zzb.zzd) {
            return zzei.zzv(zzlb2.zza.zze(zzd(), this.zza, 0).zzm);
        }
        long j2 = zzlb2.zzq;
        if (this.zzR.zzk.zzb()) {
            zzlb zzlb3 = this.zzR;
            zzlb3.zza.zzn(zzlb3.zzk.zza, this.zzn).zzg(this.zzR.zzk.zzb);
        } else {
            j = j2;
        }
        zzlb zzlb4 = this.zzR;
        zzW(zzlb4.zza, zzlb4.zzk, j);
        return zzei.zzv(j);
    }

    public final long zzj() {
        zzah();
        return zzT(this.zzR);
    }

    public final long zzk() {
        zzah();
        return zzei.zzv(zzU(this.zzR));
    }

    public final long zzl() {
        zzah();
        if (!zzw()) {
            zzbq zzn2 = zzn();
            if (zzn2.zzo()) {
                return -9223372036854775807L;
            }
            return zzei.zzv(zzn2.zze(zzd(), this.zza, 0).zzm);
        }
        zzlb zzlb = this.zzR;
        zzug zzug = zzlb.zzb;
        zzlb.zza.zzn(zzug.zza, this.zzn);
        return zzei.zzv(this.zzn.zzf(zzug.zzb, zzug.zzc));
    }

    public final long zzm() {
        zzah();
        return zzei.zzv(this.zzR.zzr);
    }

    public final zzbq zzn() {
        zzah();
        return this.zzR.zza;
    }

    public final zzby zzo() {
        zzah();
        return this.zzR.zzi.zzd;
    }

    public final void zzp() {
        zzah();
        zzhq zzhq = this.zzw;
        boolean zzu2 = zzu();
        int i = 2;
        zzhq.zzb(zzu2, 2);
        zzae(zzu2, 1, zzS(1));
        zzlb zzlb = this.zzR;
        if (zzlb.zze == 1) {
            zzlb zzd2 = zzlb.zzd((zzib) null);
            if (true == zzd2.zza.zzo()) {
                i = 4;
            }
            zzlb zze2 = zzd2.zze(i);
            this.zzy++;
            this.zzk.zzk();
            zzaf(zze2, 1, false, 5, -9223372036854775807L, -1, false);
        }
    }

    public final void zzq(boolean z) {
        zzah();
        this.zzw.zzb(z, zzf());
        zzae(z, 1, zzS(1));
    }

    public final void zzr(Surface surface) {
        zzah();
        zzac(surface);
        int i = surface == null ? 0 : -1;
        zzZ(i, i);
    }

    public final void zzs(float f) {
        zzah();
        float max = Math.max(0.0f, Math.min(f, 1.0f));
        if (this.zzL != max) {
            this.zzL = max;
            zzab();
            zzdn zzdn = this.zzl;
            zzdn.zzd(22, new zzis(max));
            zzdn.zzc();
        }
    }

    public final void zzt() {
        zzah();
        this.zzw.zzb(zzu(), 1);
        zzad((zzib) null);
        int i = zzcp.zza;
        zzfxn zzn2 = zzfxn.zzn();
        long j = this.zzR.zzs;
        zzfxn.zzl(zzn2);
    }

    public final boolean zzu() {
        zzah();
        return this.zzR.zzl;
    }

    public final boolean zzv() {
        zzah();
        return false;
    }

    public final boolean zzw() {
        zzah();
        return this.zzR.zzb.zzb();
    }

    public final int zzx() {
        zzah();
        int length = this.zzh.length;
        return 2;
    }

    public final void zzy(zzlw zzlw) {
        zzlw zzlw2 = zzlw;
        this.zzq.zzt(zzlw);
    }

    public final void zzz() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzei.zze;
        String zza = zzas.zza();
        zzdo.zze("ExoPlayerImpl", "Release " + hexString + " [AndroidXMedia3/1.5.0-beta01] [" + str + "] [" + zza + "]");
        zzah();
        this.zzw.zzd();
        if (!this.zzk.zzp()) {
            zzdn zzdn = this.zzl;
            zzdn.zzd(10, new zziu());
            zzdn.zzc();
        }
        this.zzl.zze();
        this.zzj.zze((Object) null);
        this.zzs.zzg(this.zzq);
        boolean z = this.zzR.zzp;
        zzlb zze2 = this.zzR.zze(1);
        this.zzR = zze2;
        zzlb zza2 = zze2.zza(zze2.zzb);
        this.zzR = zza2;
        zza2.zzq = zza2.zzs;
        this.zzR.zzr = 0;
        this.zzq.zzQ();
        this.zzi.zzj();
        Surface surface = this.zzG;
        if (surface != null) {
            surface.release();
            this.zzG = null;
        }
        int i = zzcp.zza;
    }
}
