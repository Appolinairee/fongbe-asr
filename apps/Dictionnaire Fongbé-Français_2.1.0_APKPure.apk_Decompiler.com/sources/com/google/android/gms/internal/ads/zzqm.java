package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.work.PeriodicWorkRequest;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.time.DurationKt;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzqm implements zzpm {
    private static final Object zza = new Object();
    private static ScheduledExecutorService zzb;
    private static int zzc;
    private zzbe zzA;
    private boolean zzB;
    private long zzC;
    private long zzD;
    private long zzE;
    private long zzF;
    private int zzG;
    private boolean zzH;
    private boolean zzI;
    private long zzJ;
    private float zzK;
    private ByteBuffer zzL;
    private int zzM;
    private ByteBuffer zzN;
    private boolean zzO;
    private boolean zzP;
    /* access modifiers changed from: private */
    public boolean zzQ;
    private boolean zzR;
    private int zzS;
    private zzf zzT;
    private zzoo zzU;
    /* access modifiers changed from: private */
    public long zzV;
    private boolean zzW;
    private boolean zzX;
    private Looper zzY;
    private long zzZ;
    private long zzaa;
    private Handler zzab;
    private final zzqc zzac;
    private final zzps zzad;
    private final Context zzd;
    private final zzpr zze;
    private final zzqw zzf;
    private final zzfxn zzg;
    private final zzfxn zzh;
    private final zzpq zzi;
    private final ArrayDeque zzj;
    private zzqk zzk;
    private final zzqg zzl;
    private final zzqg zzm;
    private final zzpz zzn;
    private zzog zzo;
    /* access modifiers changed from: private */
    public zzpj zzp;
    private zzqb zzq;
    private zzqb zzr;
    private zzce zzs;
    /* access modifiers changed from: private */
    public AudioTrack zzt;
    private zzoi zzu;
    private zzon zzv;
    private zzqf zzw;
    private zze zzx;
    private zzqd zzy;
    private zzqd zzz;

    /* synthetic */ zzqm(zzqa zzqa, zzql zzql) {
        zzoi zzoi;
        Context zza2 = zzqa.zza;
        this.zzd = zza2;
        zze zze2 = zze.zza;
        this.zzx = zze2;
        if (zza2 != null) {
            zzoi zzoi2 = zzoi.zza;
            int i = zzei.zza;
            zzoi = zzoi.zzc(zza2, zze2, (zzoo) null);
        } else {
            zzoi = zzqa.zzb;
        }
        this.zzu = zzoi;
        this.zzac = zzqa.zzf;
        int i2 = zzei.zza;
        zzps zzf2 = zzqa.zzg;
        zzf2.getClass();
        zzps zzps = zzf2;
        this.zzad = zzf2;
        this.zzi = new zzpq(new zzqh(this, (zzql) null));
        zzpr zzpr = new zzpr();
        this.zze = zzpr;
        zzqw zzqw = new zzqw();
        this.zzf = zzqw;
        this.zzg = zzfxn.zzq(new zzcl(), zzpr, zzqw);
        this.zzh = zzfxn.zzo(new zzqv());
        this.zzK = 1.0f;
        this.zzS = 0;
        this.zzT = new zzf(0, 0.0f);
        this.zzz = new zzqd(zzbe.zza, 0, 0, (zzql) null);
        this.zzA = zzbe.zza;
        this.zzB = false;
        this.zzj = new ArrayDeque();
        this.zzl = new zzqg();
        this.zzm = new zzqg();
        this.zzn = zzqa.zze;
    }

    public static /* synthetic */ void zzG(zzqm zzqm) {
        if (zzqm.zzaa >= PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS) {
            ((zzqq) zzqm.zzp).zza.zzn = true;
            zzqm.zzaa = 0;
        }
    }

    static /* synthetic */ void zzI(AudioTrack audioTrack, zzpj zzpj, Handler handler, zzpg zzpg) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (zzpj != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new zzpv(zzpj, zzpg));
            }
            synchronized (zza) {
                int i = zzc - 1;
                zzc = i;
                if (i == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
            }
        } catch (Throwable th) {
            if (zzpj != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new zzpv(zzpj, zzpg));
            }
            synchronized (zza) {
                int i2 = zzc - 1;
                zzc = i2;
                if (i2 == 0) {
                    zzb.shutdown();
                    zzb = null;
                }
                throw th;
            }
        }
    }

    static /* bridge */ /* synthetic */ boolean zzK() {
        boolean z;
        synchronized (zza) {
            z = zzc > 0;
        }
        return z;
    }

    /* access modifiers changed from: private */
    public final long zzL() {
        zzqb zzqb = this.zzr;
        return zzqb.zzc == 0 ? this.zzC / ((long) zzqb.zzb) : this.zzD;
    }

    /* access modifiers changed from: private */
    public final long zzM() {
        zzqb zzqb = this.zzr;
        if (zzqb.zzc != 0) {
            return this.zzF;
        }
        long j = this.zzE;
        long j2 = (long) zzqb.zzd;
        int i = zzei.zza;
        return ((j + j2) - 1) / j2;
    }

    private final AudioTrack zzN(zzqb zzqb) throws zzpi {
        try {
            return zzac(zzqb.zza(), this.zzx, this.zzS, zzqb.zza);
        } catch (zzpi e) {
            zzpj zzpj = this.zzp;
            if (zzpj != null) {
                zzpj.zza(e);
            }
            throw e;
        }
    }

    private final void zzO(long j) {
        zzbe zzbe;
        boolean z;
        if (zzab()) {
            zzqc zzqc = this.zzac;
            zzbe = this.zzA;
            zzqc.zzc(zzbe);
        } else {
            zzbe = zzbe.zza;
        }
        zzbe zzbe2 = zzbe;
        this.zzA = zzbe2;
        if (zzab()) {
            zzqc zzqc2 = this.zzac;
            z = this.zzB;
            zzqc2.zzd(z);
        } else {
            z = false;
        }
        this.zzB = z;
        this.zzj.add(new zzqd(zzbe2, Math.max(0, j), zzei.zzt(zzM(), this.zzr.zze), (zzql) null));
        zzX();
        zzpj zzpj = this.zzp;
        if (zzpj != null) {
            ((zzqq) zzpj).zza.zzc.zzw(this.zzB);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzP(long r8) throws com.google.android.gms.internal.ads.zzpl {
        /*
            r7 = this;
            java.nio.ByteBuffer r8 = r7.zzN
            if (r8 != 0) goto L_0x0006
            goto L_0x00b6
        L_0x0006:
            com.google.android.gms.internal.ads.zzqg r8 = r7.zzm
            boolean r8 = r8.zzc()
            if (r8 != 0) goto L_0x00b6
            java.nio.ByteBuffer r8 = r7.zzN
            int r8 = r8.remaining()
            android.media.AudioTrack r9 = r7.zzt
            java.nio.ByteBuffer r0 = r7.zzN
            r1 = 1
            int r9 = r9.write(r0, r8, r1)
            long r2 = android.os.SystemClock.elapsedRealtime()
            r7.zzV = r2
            r2 = 0
            r0 = 0
            if (r9 >= 0) goto L_0x006a
            int r8 = com.google.android.gms.internal.ads.zzei.zza
            r4 = 24
            if (r8 < r4) goto L_0x0031
            r8 = -6
            if (r9 == r8) goto L_0x0035
        L_0x0031:
            r8 = -32
            if (r9 != r8) goto L_0x004a
        L_0x0035:
            long r4 = r7.zzM()
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 <= 0) goto L_0x003e
            goto L_0x004b
        L_0x003e:
            android.media.AudioTrack r8 = r7.zzt
            boolean r8 = zzaa(r8)
            if (r8 == 0) goto L_0x004a
            r7.zzQ()
            goto L_0x004b
        L_0x004a:
            r1 = 0
        L_0x004b:
            com.google.android.gms.internal.ads.zzpl r8 = new com.google.android.gms.internal.ads.zzpl
            com.google.android.gms.internal.ads.zzqb r0 = r7.zzr
            com.google.android.gms.internal.ads.zzab r0 = r0.zza
            r8.<init>(r9, r0, r1)
            com.google.android.gms.internal.ads.zzpj r9 = r7.zzp
            if (r9 == 0) goto L_0x005b
            r9.zza(r8)
        L_0x005b:
            boolean r9 = r8.zzb
            if (r9 != 0) goto L_0x0065
            com.google.android.gms.internal.ads.zzqg r9 = r7.zzm
            r9.zzb(r8)
            return
        L_0x0065:
            com.google.android.gms.internal.ads.zzoi r9 = com.google.android.gms.internal.ads.zzoi.zza
            r7.zzu = r9
            throw r8
        L_0x006a:
            com.google.android.gms.internal.ads.zzqg r4 = r7.zzm
            r4.zza()
            android.media.AudioTrack r4 = r7.zzt
            boolean r4 = zzaa(r4)
            if (r4 == 0) goto L_0x008b
            long r4 = r7.zzF
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x007f
            r7.zzX = r0
        L_0x007f:
            boolean r2 = r7.zzR
            if (r2 == 0) goto L_0x008b
            com.google.android.gms.internal.ads.zzpj r2 = r7.zzp
            if (r2 == 0) goto L_0x008b
            if (r9 >= r8) goto L_0x008b
            com.google.android.gms.internal.ads.zzqq r2 = (com.google.android.gms.internal.ads.zzqq) r2
        L_0x008b:
            com.google.android.gms.internal.ads.zzqb r2 = r7.zzr
            int r2 = r2.zzc
            if (r2 != 0) goto L_0x0097
            long r3 = r7.zzE
            long r5 = (long) r9
            long r3 = r3 + r5
            r7.zzE = r3
        L_0x0097:
            if (r9 != r8) goto L_0x00b6
            if (r2 == 0) goto L_0x00b3
            java.nio.ByteBuffer r8 = r7.zzN
            java.nio.ByteBuffer r9 = r7.zzL
            if (r8 != r9) goto L_0x00a2
            goto L_0x00a3
        L_0x00a2:
            r1 = 0
        L_0x00a3:
            com.google.android.gms.internal.ads.zzcw.zzf(r1)
            long r8 = r7.zzF
            int r0 = r7.zzG
            long r0 = (long) r0
            int r2 = r7.zzM
            long r2 = (long) r2
            long r0 = r0 * r2
            long r8 = r8 + r0
            r7.zzF = r8
        L_0x00b3:
            r8 = 0
            r7.zzN = r8
        L_0x00b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqm.zzP(long):void");
    }

    private final void zzQ() {
        if (this.zzr.zzc == 1) {
            this.zzW = true;
        }
    }

    private final void zzR() {
        if (this.zzv == null && this.zzd != null) {
            this.zzY = Looper.myLooper();
            zzon zzon = new zzon(this.zzd, new zzpw(this), this.zzx, this.zzU);
            this.zzv = zzon;
            this.zzu = zzon.zzc();
        }
    }

    private final void zzS() {
        if (!this.zzP) {
            this.zzP = true;
            this.zzi.zzb(zzM());
            if (zzaa(this.zzt)) {
                this.zzQ = false;
            }
            this.zzt.stop();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        r0 = r2.zzL;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        if (r0 == null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (r0.hasRemaining() == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        r2.zzs.zze(r2.zzL);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzT(long r3) throws com.google.android.gms.internal.ads.zzpl {
        /*
            r2 = this;
            r2.zzP(r3)
            java.nio.ByteBuffer r0 = r2.zzN
            if (r0 == 0) goto L_0x0008
            goto L_0x004b
        L_0x0008:
            com.google.android.gms.internal.ads.zzce r0 = r2.zzs
            boolean r0 = r0.zzh()
            if (r0 == 0) goto L_0x0041
        L_0x0010:
            com.google.android.gms.internal.ads.zzce r0 = r2.zzs
            boolean r0 = r0.zzg()
            if (r0 != 0) goto L_0x004b
        L_0x0018:
            com.google.android.gms.internal.ads.zzce r0 = r2.zzs
            java.nio.ByteBuffer r0 = r0.zzb()
            boolean r1 = r0.hasRemaining()
            if (r1 == 0) goto L_0x002f
            r2.zzV(r0)
            r2.zzP(r3)
            java.nio.ByteBuffer r0 = r2.zzN
            if (r0 == 0) goto L_0x0018
            goto L_0x004b
        L_0x002f:
            java.nio.ByteBuffer r0 = r2.zzL
            if (r0 == 0) goto L_0x004b
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L_0x004b
            com.google.android.gms.internal.ads.zzce r0 = r2.zzs
            java.nio.ByteBuffer r1 = r2.zzL
            r0.zze(r1)
            goto L_0x0010
        L_0x0041:
            java.nio.ByteBuffer r0 = r2.zzL
            if (r0 == 0) goto L_0x004b
            r2.zzV(r0)
            r2.zzP(r3)
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqm.zzT(long):void");
    }

    private final void zzU(zzbe zzbe) {
        zzqd zzqd = new zzqd(zzbe, -9223372036854775807L, -9223372036854775807L, (zzql) null);
        if (zzZ()) {
            this.zzy = zzqd;
        } else {
            this.zzz = zzqd;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x004b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzV(java.nio.ByteBuffer r17) {
        /*
            r16 = this;
            r0 = r16
            java.nio.ByteBuffer r1 = r0.zzN
            if (r1 != 0) goto L_0x0008
            r1 = 1
            goto L_0x0009
        L_0x0008:
            r1 = 0
        L_0x0009:
            com.google.android.gms.internal.ads.zzcw.zzf(r1)
            boolean r1 = r17.hasRemaining()
            if (r1 == 0) goto L_0x0202
            com.google.android.gms.internal.ads.zzqb r1 = r0.zzr
            int r1 = r1.zzc
            if (r1 != 0) goto L_0x01fe
            r1 = 20
            long r1 = com.google.android.gms.internal.ads.zzei.zzs(r1)
            com.google.android.gms.internal.ads.zzqb r3 = r0.zzr
            int r3 = r3.zze
            long r1 = com.google.android.gms.internal.ads.zzei.zzp(r1, r3)
            int r2 = (int) r1
            long r3 = r16.zzM()
            long r5 = (long) r2
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x01fe
            com.google.android.gms.internal.ads.zzqb r1 = r0.zzr
            int r7 = r1.zzg
            int r1 = r1.zzd
            int r8 = r17.remaining()
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocateDirect(r8)
            java.nio.ByteOrder r9 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r8 = r8.order(r9)
            int r9 = r17.position()
            int r4 = (int) r3
        L_0x004b:
            boolean r3 = r17.hasRemaining()
            if (r3 == 0) goto L_0x01f4
            if (r4 >= r2) goto L_0x01f4
            r12 = 1342177280(0x50000000, float:8.5899346E9)
            r13 = 268435456(0x10000000, float:2.5243549E-29)
            r14 = 22
            r15 = 21
            r10 = 4
            r3 = 3
            r11 = 2
            if (r7 == r11) goto L_0x0125
            if (r7 == r3) goto L_0x011c
            if (r7 == r10) goto L_0x00fd
            if (r7 == r15) goto L_0x00e2
            if (r7 == r14) goto L_0x00c0
            if (r7 == r13) goto L_0x00ae
            if (r7 == r12) goto L_0x0095
            r12 = 1610612736(0x60000000, float:3.6893488E19)
            if (r7 != r12) goto L_0x008f
            byte r12 = r17.get()
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << 24
            byte r13 = r17.get()
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << 16
            byte r14 = r17.get()
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r14 = r14 << 8
            byte r15 = r17.get()
            r15 = r15 & 255(0xff, float:3.57E-43)
            goto L_0x00de
        L_0x008f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0095:
            byte r12 = r17.get()
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << 24
            byte r13 = r17.get()
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << 16
            byte r14 = r17.get()
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r14 = r14 << 8
            goto L_0x00fa
        L_0x00ae:
            byte r12 = r17.get()
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << 24
            byte r13 = r17.get()
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << 16
            goto L_0x0135
        L_0x00c0:
            byte r12 = r17.get()
            r12 = r12 & 255(0xff, float:3.57E-43)
            byte r13 = r17.get()
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << 8
            byte r14 = r17.get()
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r14 = r14 << 16
            byte r15 = r17.get()
            r15 = r15 & 255(0xff, float:3.57E-43)
            int r15 = r15 << 24
        L_0x00de:
            r12 = r12 | r13
            r12 = r12 | r14
            r12 = r12 | r15
            goto L_0x0136
        L_0x00e2:
            byte r12 = r17.get()
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << 8
            byte r13 = r17.get()
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << 16
            byte r14 = r17.get()
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r14 = r14 << 24
        L_0x00fa:
            r12 = r12 | r13
            r12 = r12 | r14
            goto L_0x0136
        L_0x00fd:
            float r12 = r17.getFloat()
            r13 = 1065353216(0x3f800000, float:1.0)
            float r12 = java.lang.Math.min(r12, r13)
            r13 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r12 = java.lang.Math.max(r13, r12)
            r13 = 0
            int r13 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r13 >= 0) goto L_0x0116
            float r12 = -r12
            r13 = -822083584(0xffffffffcf000000, float:-2.14748365E9)
            goto L_0x0118
        L_0x0116:
            r13 = 1325400064(0x4f000000, float:2.14748365E9)
        L_0x0118:
            float r12 = r12 * r13
            int r12 = (int) r12
            goto L_0x0136
        L_0x011c:
            byte r12 = r17.get()
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << 24
            goto L_0x0136
        L_0x0125:
            byte r12 = r17.get()
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << 16
            byte r13 = r17.get()
            r13 = r13 & 255(0xff, float:3.57E-43)
            int r13 = r13 << 24
        L_0x0135:
            r12 = r12 | r13
        L_0x0136:
            long r12 = (long) r12
            long r14 = (long) r4
            long r12 = r12 * r14
            long r12 = r12 / r5
            int r13 = (int) r12
            if (r7 == r11) goto L_0x01d8
            if (r7 == r3) goto L_0x01d1
            if (r7 == r10) goto L_0x01be
            r3 = 21
            if (r7 == r3) goto L_0x01ab
            r3 = 22
            if (r7 == r3) goto L_0x0194
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            if (r7 == r3) goto L_0x0187
            r3 = 1342177280(0x50000000, float:8.5899346E9)
            if (r7 == r3) goto L_0x0174
            r3 = 1610612736(0x60000000, float:3.6893488E19)
            if (r7 != r3) goto L_0x016e
            int r3 = r13 >> 8
            int r10 = r13 >> 16
            int r11 = r13 >> 24
            byte r12 = (byte) r13
            byte r11 = (byte) r11
            r8.put(r11)
            byte r10 = (byte) r10
            r8.put(r10)
            byte r3 = (byte) r3
            r8.put(r3)
            r8.put(r12)
            goto L_0x01e4
        L_0x016e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0174:
            int r3 = r13 >> 8
            int r10 = r13 >> 16
            int r11 = r13 >> 24
            byte r11 = (byte) r11
            r8.put(r11)
            byte r10 = (byte) r10
            r8.put(r10)
            byte r3 = (byte) r3
            r8.put(r3)
            goto L_0x01e4
        L_0x0187:
            int r3 = r13 >> 16
            int r10 = r13 >> 24
            byte r10 = (byte) r10
            r8.put(r10)
            byte r3 = (byte) r3
            r8.put(r3)
            goto L_0x01e4
        L_0x0194:
            int r3 = r13 >> 8
            int r10 = r13 >> 16
            int r11 = r13 >> 24
            byte r12 = (byte) r13
            r8.put(r12)
            byte r3 = (byte) r3
            r8.put(r3)
            byte r3 = (byte) r10
            r8.put(r3)
            byte r3 = (byte) r11
            r8.put(r3)
            goto L_0x01e4
        L_0x01ab:
            int r3 = r13 >> 8
            int r10 = r13 >> 16
            int r11 = r13 >> 24
            byte r3 = (byte) r3
            r8.put(r3)
            byte r3 = (byte) r10
            r8.put(r3)
            byte r3 = (byte) r11
            r8.put(r3)
            goto L_0x01e4
        L_0x01be:
            if (r13 >= 0) goto L_0x01c9
            float r3 = (float) r13
            float r3 = -r3
            r10 = -822083584(0xffffffffcf000000, float:-2.14748365E9)
            float r3 = r3 / r10
            r8.putFloat(r3)
            goto L_0x01e4
        L_0x01c9:
            float r3 = (float) r13
            r10 = 1325400064(0x4f000000, float:2.14748365E9)
            float r3 = r3 / r10
            r8.putFloat(r3)
            goto L_0x01e4
        L_0x01d1:
            int r3 = r13 >> 24
            byte r3 = (byte) r3
            r8.put(r3)
            goto L_0x01e4
        L_0x01d8:
            int r3 = r13 >> 16
            int r10 = r13 >> 24
            byte r3 = (byte) r3
            r8.put(r3)
            byte r3 = (byte) r10
            r8.put(r3)
        L_0x01e4:
            int r3 = r17.position()
            int r10 = r9 + r1
            if (r3 != r10) goto L_0x004b
            int r4 = r4 + 1
            int r9 = r17.position()
            goto L_0x004b
        L_0x01f4:
            r1 = r17
            r8.put(r1)
            r8.flip()
            r1 = r8
            goto L_0x0200
        L_0x01fe:
            r1 = r17
        L_0x0200:
            r0.zzN = r1
        L_0x0202:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqm.zzV(java.nio.ByteBuffer):void");
    }

    private final void zzW() {
        if (zzZ()) {
            this.zzt.setVolume(this.zzK);
        }
    }

    private final void zzX() {
        zzce zzce = this.zzr.zzi;
        this.zzs = zzce;
        zzce.zzc();
    }

    private final boolean zzY() throws zzpl {
        ByteBuffer byteBuffer;
        if (!this.zzs.zzh()) {
            zzP(Long.MIN_VALUE);
            return this.zzN == null;
        }
        this.zzs.zzd();
        zzT(Long.MIN_VALUE);
        if (!this.zzs.zzg() || ((byteBuffer = this.zzN) != null && byteBuffer.hasRemaining())) {
            return false;
        }
        return true;
    }

    private final boolean zzZ() {
        return this.zzt != null;
    }

    private static boolean zzaa(AudioTrack audioTrack) {
        return zzei.zza >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final boolean zzab() {
        zzqb zzqb = this.zzr;
        if (zzqb.zzc != 0) {
            return false;
        }
        int i = zzqb.zza.zzF;
        return true;
    }

    private static final AudioTrack zzac(zzpg zzpg, zze zze2, int i, zzab zzab2) throws zzpi {
        AudioTrack audioTrack;
        try {
            if (zzei.zza >= 23) {
                AudioFormat zzx2 = zzei.zzx(zzpg.zzb, zzpg.zzc, zzpg.zza);
                AudioAttributes audioAttributes = zze2.zza().zza;
                zzoc$$ExternalSyntheticApiModelOutline2.m();
                AudioTrack.Builder m$2 = zzoc$$ExternalSyntheticApiModelOutline2.m().setAudioAttributes(audioAttributes).setAudioFormat(zzx2).setTransferMode(1).setBufferSizeInBytes(zzpg.zze).setSessionId(i);
                if (zzei.zza >= 29) {
                    AudioTrack.Builder unused = m$2.setOffloadedPlayback(zzpg.zzd);
                }
                audioTrack = m$2.build();
            } else {
                AudioAttributes audioAttributes2 = zze2.zza().zza;
                int i2 = zzpg.zzb;
                int i3 = zzpg.zzc;
                int i4 = zzpg.zza;
                audioTrack = new AudioTrack(audioAttributes2, zzei.zzx(i2, i3, i4), zzpg.zze, 1, i);
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused2) {
            }
            throw new zzpi(state, zzpg.zzb, zzpg.zzc, zzpg.zza, zzab2, zzpg.zzd, (Exception) null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new zzpi(0, zzpg.zzb, zzpg.zzc, zzpg.zza, zzab2, zzpg.zzd, e);
        }
    }

    public final boolean zzA(zzab zzab2) {
        return zza(zzab2) != 0;
    }

    public final void zzJ(zzoi zzoi) {
        String str;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.zzY;
        if (looper != myLooper) {
            String str2 = "null";
            if (looper == null) {
                str = str2;
            } else {
                str = looper.getThread().getName();
            }
            if (myLooper != null) {
                str2 = myLooper.getThread().getName();
            }
            throw new IllegalStateException("Current looper (" + str2 + ") is not the playback looper (" + str + ")");
        } else if (!zzoi.equals(this.zzu)) {
            this.zzu = zzoi;
            zzpj zzpj = this.zzp;
            if (zzpj != null) {
                ((zzqq) zzpj).zza.zzB();
            }
        }
    }

    public final int zza(zzab zzab2) {
        zzR();
        if (!"audio/raw".equals(zzab2.zzo)) {
            return this.zzu.zzb(zzab2, this.zzx) != null ? 2 : 0;
        }
        if (!zzei.zzJ(zzab2.zzF)) {
            int i = zzab2.zzF;
            zzdo.zzf("DefaultAudioSink", "Invalid PCM encoding: " + i);
            return 0;
        } else if (zzab2.zzF != 2) {
            return 1;
        } else {
            return 2;
        }
    }

    public final long zzb(boolean z) {
        long j;
        if (!zzZ() || this.zzI) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.zzi.zza(z), zzei.zzt(zzM(), this.zzr.zze));
        while (!this.zzj.isEmpty() && min >= ((zzqd) this.zzj.getFirst()).zzc) {
            this.zzz = (zzqd) this.zzj.remove();
        }
        long j2 = min - this.zzz.zzc;
        if (this.zzj.isEmpty()) {
            j = this.zzz.zzb + this.zzac.zza(j2);
        } else {
            zzqd zzqd = (zzqd) this.zzj.getFirst();
            j = zzqd.zzb - zzei.zzq(zzqd.zzc - min, this.zzz.zza.zzb);
        }
        long zzb2 = this.zzac.zzb();
        long zzt2 = j + zzei.zzt(zzb2, this.zzr.zze);
        long j3 = this.zzZ;
        if (zzb2 > j3) {
            long zzt3 = zzei.zzt(zzb2 - j3, this.zzr.zze);
            this.zzZ = zzb2;
            this.zzaa += zzt3;
            if (this.zzab == null) {
                this.zzab = new Handler(Looper.myLooper());
            }
            this.zzab.removeCallbacksAndMessages((Object) null);
            this.zzab.postDelayed(new zzpu(this), 100);
        }
        return zzt2;
    }

    public final zzbe zzc() {
        return this.zzA;
    }

    public final zzor zzd(zzab zzab2) {
        if (this.zzW) {
            return zzor.zza;
        }
        return this.zzad.zza(zzab2, this.zzx);
    }

    public final void zze(zzab zzab2, int i, int[] iArr) throws zzph {
        zzce zzce;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        zzab zzab3 = zzab2;
        zzR();
        if ("audio/raw".equals(zzab3.zzo)) {
            zzcw.zzd(zzei.zzJ(zzab3.zzF));
            i7 = zzei.zzk(zzab3.zzF) * zzab3.zzD;
            zzfxk zzfxk = new zzfxk();
            int i11 = zzab3.zzF;
            zzfxk.zzh(this.zzg);
            zzfxk.zzg(this.zzac.zze());
            zzce zzce2 = new zzce(zzfxk.zzi());
            if (zzce2.equals(this.zzs)) {
                zzce2 = this.zzs;
            }
            this.zzf.zzq(zzab3.zzG, zzab3.zzH);
            this.zze.zzo(iArr);
            try {
                zzcf zza2 = zzce2.zza(new zzcf(zzab3.zzE, zzab3.zzD, zzab3.zzF));
                i4 = zza2.zzd;
                i3 = zza2.zzb;
                int i12 = zza2.zzc;
                i2 = zzei.zzi(i12);
                zzce = zzce2;
                i5 = zzei.zzk(i4) * i12;
                i6 = 0;
            } catch (zzcg e) {
                throw new zzph((Throwable) e, zzab3);
            }
        } else {
            zzce zzce3 = new zzce(zzfxn.zzn());
            int i13 = zzab3.zzE;
            zzor zzor = zzor.zza;
            Pair zzb2 = this.zzu.zzb(zzab3, this.zzx);
            if (zzb2 != null) {
                i4 = ((Integer) zzb2.first).intValue();
                zzce = zzce3;
                i3 = i13;
                i2 = ((Integer) zzb2.second).intValue();
                i7 = -1;
                i6 = 2;
                i5 = -1;
            } else {
                throw new zzph("Unable to configure passthrough for: ".concat(String.valueOf(String.valueOf(zzab2))), zzab3);
            }
        }
        if (i4 == 0) {
            String valueOf = String.valueOf(zzab2);
            throw new zzph("Invalid output encoding (mode=" + i6 + ") for: " + valueOf, zzab3);
        } else if (i2 != 0) {
            int i14 = zzab3.zzj;
            if ("audio/vnd.dts.hd;profile=lbr".equals(zzab3.zzo) && i14 == -1) {
                i14 = 768000;
            }
            int minBufferSize = AudioTrack.getMinBufferSize(i3, i2, i4);
            zzcw.zzf(minBufferSize != -2);
            int i15 = i5 != -1 ? i5 : 1;
            int i16 = 250000;
            if (i6 == 0) {
                i8 = i6;
                i9 = Math.max(zzqo.zza(250000, i3, i15), Math.min(minBufferSize * 4, zzqo.zza(750000, i3, i15)));
            } else if (i6 != 1) {
                if (i4 == 5) {
                    i16 = 500000;
                } else if (i4 == 8) {
                    i16 = DurationKt.NANOS_IN_MILLIS;
                    i4 = 8;
                }
                if (i14 != -1) {
                    i10 = zzgaj.zzb(i14, 8, RoundingMode.CEILING);
                } else {
                    i10 = zzqo.zzb(i4);
                }
                i8 = i6;
                i9 = zzgaq.zzb((((long) i16) * ((long) i10)) / 1000000);
            } else {
                i8 = i6;
                i9 = zzgaq.zzb((((long) zzqo.zzb(i4)) * 50000000) / 1000000);
            }
            this.zzW = false;
            zzqb zzqb = new zzqb(zzab2, i7, i8, i5, i3, i2, i4, (((Math.max(minBufferSize, (int) ((double) i9)) + i15) - 1) / i15) * i15, zzce, false, false, false);
            if (zzZ()) {
                this.zzq = zzqb;
            } else {
                this.zzr = zzqb;
            }
        } else {
            String valueOf2 = String.valueOf(zzab2);
            throw new zzph("Invalid output channel config (mode=" + i6 + ") for: " + valueOf2, zzab3);
        }
    }

    public final void zzf() {
        zzqf zzqf;
        if (zzZ()) {
            this.zzC = 0;
            this.zzD = 0;
            this.zzE = 0;
            this.zzF = 0;
            this.zzX = false;
            this.zzG = 0;
            this.zzz = new zzqd(this.zzA, 0, 0, (zzql) null);
            this.zzJ = 0;
            this.zzy = null;
            this.zzj.clear();
            this.zzL = null;
            this.zzM = 0;
            this.zzN = null;
            this.zzP = false;
            this.zzO = false;
            this.zzQ = false;
            this.zzf.zzp();
            zzX();
            if (this.zzi.zzh()) {
                this.zzt.pause();
            }
            if (zzaa(this.zzt)) {
                zzqk zzqk = this.zzk;
                zzqk.getClass();
                zzqk zzqk2 = zzqk;
                zzqk.zzb(this.zzt);
            }
            zzpg zza2 = this.zzr.zza();
            zzqb zzqb = this.zzq;
            if (zzqb != null) {
                this.zzr = zzqb;
                this.zzq = null;
            }
            this.zzi.zzc();
            if (zzei.zza >= 24 && (zzqf = this.zzw) != null) {
                zzqf.zzb();
                this.zzw = null;
            }
            AudioTrack audioTrack = this.zzt;
            zzpj zzpj = this.zzp;
            Handler handler = new Handler(Looper.myLooper());
            synchronized (zza) {
                if (zzb == null) {
                    zzb = Executors.newSingleThreadScheduledExecutor(new zzeh("ExoPlayer:AudioTrackReleaseThread"));
                }
                zzc++;
                zzb.schedule(new zzpt(audioTrack, zzpj, handler, zza2), 20, TimeUnit.MILLISECONDS);
            }
            this.zzt = null;
        }
        this.zzm.zza();
        this.zzl.zza();
        this.zzZ = 0;
        this.zzaa = 0;
        Handler handler2 = this.zzab;
        if (handler2 != null) {
            Handler handler3 = handler2;
            handler2.removeCallbacksAndMessages((Object) null);
        }
    }

    public final void zzg() {
        this.zzH = true;
    }

    public final void zzh() {
        this.zzR = false;
        if (!zzZ()) {
            return;
        }
        if (this.zzi.zzk() || zzaa(this.zzt)) {
            this.zzt.pause();
        }
    }

    public final void zzi() {
        this.zzR = true;
        if (zzZ()) {
            this.zzi.zzf();
            this.zzt.play();
        }
    }

    public final void zzj() throws zzpl {
        if (!this.zzO && zzZ() && zzY()) {
            zzS();
            this.zzO = true;
        }
    }

    public final void zzk() {
        zzon zzon = this.zzv;
        if (zzon != null) {
            zzon.zzi();
        }
    }

    public final void zzl() {
        zzf();
        zzfxn zzfxn = this.zzg;
        int size = zzfxn.size();
        for (int i = 0; i < size; i++) {
            ((zzch) zzfxn.get(i)).zzf();
        }
        zzfxn zzfxn2 = this.zzh;
        int size2 = zzfxn2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((zzch) zzfxn2.get(i2)).zzf();
        }
        zzce zzce = this.zzs;
        if (zzce != null) {
            zzce.zzf();
        }
        this.zzR = false;
        this.zzW = false;
    }

    public final void zzm(zze zze2) {
        if (!this.zzx.equals(zze2)) {
            this.zzx = zze2;
            zzon zzon = this.zzv;
            if (zzon != null) {
                zzon.zzg(zze2);
            }
            zzf();
        }
    }

    public final void zzn(int i) {
        if (this.zzS != i) {
            this.zzS = i;
            zzf();
        }
    }

    public final void zzo(zzf zzf2) {
        if (!this.zzT.equals(zzf2)) {
            if (this.zzt != null) {
                int i = this.zzT.zza;
            }
            this.zzT = zzf2;
        }
    }

    public final void zzp(zzcx zzcx) {
        this.zzi.zze(zzcx);
    }

    public final void zzq(zzpj zzpj) {
        this.zzp = zzpj;
    }

    public final void zzr(int i, int i2) {
        AudioTrack audioTrack = this.zzt;
        if (audioTrack != null) {
            zzaa(audioTrack);
        }
    }

    public final void zzs(zzbe zzbe) {
        this.zzA = new zzbe(Math.max(0.1f, Math.min(zzbe.zzb, 8.0f)), Math.max(0.1f, Math.min(zzbe.zzc, 8.0f)));
        zzU(zzbe);
    }

    public final void zzt(zzog zzog) {
        this.zzo = zzog;
    }

    public final void zzv(boolean z) {
        this.zzB = z;
        zzU(this.zzA);
    }

    public final void zzw(float f) {
        if (this.zzK != f) {
            this.zzK = f;
            zzW();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0281, code lost:
        r0 = com.google.android.gms.internal.ads.zzabn.zza(r28);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzx(java.nio.ByteBuffer r28, long r29, int r31) throws com.google.android.gms.internal.ads.zzpi, com.google.android.gms.internal.ads.zzpl {
        /*
            r27 = this;
            r1 = r27
            r2 = r28
            r3 = r29
            r5 = r31
            java.nio.ByteBuffer r0 = r1.zzL
            r7 = 0
            if (r0 == 0) goto L_0x0012
            if (r2 != r0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            r0 = 0
            goto L_0x0013
        L_0x0012:
            r0 = 1
        L_0x0013:
            com.google.android.gms.internal.ads.zzcw.zzd(r0)
            com.google.android.gms.internal.ads.zzqb r0 = r1.zzq
            r8 = 0
            if (r0 == 0) goto L_0x006f
            boolean r0 = r27.zzY()
            if (r0 != 0) goto L_0x0022
            return r7
        L_0x0022:
            com.google.android.gms.internal.ads.zzqb r0 = r1.zzq
            com.google.android.gms.internal.ads.zzqb r9 = r1.zzr
            int r10 = r9.zzc
            int r11 = r0.zzc
            if (r10 != r11) goto L_0x005f
            int r10 = r9.zzg
            int r11 = r0.zzg
            if (r10 != r11) goto L_0x005f
            int r10 = r9.zze
            int r11 = r0.zze
            if (r10 != r11) goto L_0x005f
            int r10 = r9.zzf
            int r11 = r0.zzf
            if (r10 != r11) goto L_0x005f
            int r10 = r9.zzd
            int r11 = r0.zzd
            if (r10 != r11) goto L_0x005f
            boolean r10 = r9.zzj
            boolean r10 = r0.zzj
            boolean r9 = r9.zzk
            boolean r9 = r0.zzk
            r1.zzr = r0
            r1.zzq = r8
            android.media.AudioTrack r0 = r1.zzt
            if (r0 == 0) goto L_0x006c
            boolean r0 = zzaa(r0)
            if (r0 == 0) goto L_0x006c
            com.google.android.gms.internal.ads.zzqb r0 = r1.zzr
            boolean r0 = r0.zzk
            goto L_0x006c
        L_0x005f:
            r27.zzS()
            boolean r0 = r27.zzy()
            if (r0 == 0) goto L_0x0069
            return r7
        L_0x0069:
            r27.zzf()
        L_0x006c:
            r1.zzO(r3)
        L_0x006f:
            boolean r0 = r27.zzZ()
            if (r0 == 0) goto L_0x0077
            goto L_0x017b
        L_0x0077:
            com.google.android.gms.internal.ads.zzqg r0 = r1.zzl     // Catch:{ zzpi -> 0x03e5 }
            boolean r0 = r0.zzc()     // Catch:{ zzpi -> 0x03e5 }
            if (r0 == 0) goto L_0x0080
            return r7
        L_0x0080:
            com.google.android.gms.internal.ads.zzqb r0 = r1.zzr     // Catch:{ zzpi -> 0x008d }
            if (r0 == 0) goto L_0x008c
            r11 = r0
            com.google.android.gms.internal.ads.zzqb r11 = (com.google.android.gms.internal.ads.zzqb) r11     // Catch:{ zzpi -> 0x008d }
            android.media.AudioTrack r0 = r1.zzN(r0)     // Catch:{ zzpi -> 0x008d }
            goto L_0x00d5
        L_0x008c:
            throw r8     // Catch:{ zzpi -> 0x008d }
        L_0x008d:
            r0 = move-exception
            r11 = r0
            com.google.android.gms.internal.ads.zzqb r0 = r1.zzr     // Catch:{ zzpi -> 0x03e5 }
            int r12 = r0.zzh     // Catch:{ zzpi -> 0x03e5 }
            r13 = 1000000(0xf4240, float:1.401298E-39)
            if (r12 <= r13) goto L_0x03e1
            com.google.android.gms.internal.ads.zzqb r12 = new com.google.android.gms.internal.ads.zzqb     // Catch:{ zzpi -> 0x03e5 }
            com.google.android.gms.internal.ads.zzab r15 = r0.zza     // Catch:{ zzpi -> 0x03e5 }
            int r13 = r0.zzb     // Catch:{ zzpi -> 0x03e5 }
            int r14 = r0.zzc     // Catch:{ zzpi -> 0x03e5 }
            int r8 = r0.zzd     // Catch:{ zzpi -> 0x03e5 }
            int r7 = r0.zze     // Catch:{ zzpi -> 0x03e5 }
            int r6 = r0.zzf     // Catch:{ zzpi -> 0x03e5 }
            int r10 = r0.zzg     // Catch:{ zzpi -> 0x03e5 }
            com.google.android.gms.internal.ads.zzce r9 = r0.zzi     // Catch:{ zzpi -> 0x03e5 }
            r16 = r14
            boolean r14 = r0.zzj     // Catch:{ zzpi -> 0x03e5 }
            boolean r14 = r0.zzk     // Catch:{ zzpi -> 0x03e5 }
            boolean r0 = r0.zzl     // Catch:{ zzpi -> 0x03e5 }
            r25 = 0
            r26 = 0
            r22 = 1000000(0xf4240, float:1.401298E-39)
            r24 = 0
            r0 = r16
            r14 = r12
            r16 = r13
            r17 = r0
            r18 = r8
            r19 = r7
            r20 = r6
            r21 = r10
            r23 = r9
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ zzpi -> 0x03e5 }
            android.media.AudioTrack r0 = r1.zzN(r12)     // Catch:{ zzpi -> 0x03dd }
            r1.zzr = r12     // Catch:{ zzpi -> 0x03dd }
        L_0x00d5:
            r1.zzt = r0     // Catch:{ zzpi -> 0x03e5 }
            boolean r0 = zzaa(r0)     // Catch:{ zzpi -> 0x03e5 }
            if (r0 == 0) goto L_0x00f3
            android.media.AudioTrack r0 = r1.zzt     // Catch:{ zzpi -> 0x03e5 }
            com.google.android.gms.internal.ads.zzqk r6 = r1.zzk     // Catch:{ zzpi -> 0x03e5 }
            if (r6 != 0) goto L_0x00ea
            com.google.android.gms.internal.ads.zzqk r6 = new com.google.android.gms.internal.ads.zzqk     // Catch:{ zzpi -> 0x03e5 }
            r6.<init>(r1)     // Catch:{ zzpi -> 0x03e5 }
            r1.zzk = r6     // Catch:{ zzpi -> 0x03e5 }
        L_0x00ea:
            com.google.android.gms.internal.ads.zzqk r6 = r1.zzk     // Catch:{ zzpi -> 0x03e5 }
            r6.zza(r0)     // Catch:{ zzpi -> 0x03e5 }
            com.google.android.gms.internal.ads.zzqb r0 = r1.zzr     // Catch:{ zzpi -> 0x03e5 }
            boolean r0 = r0.zzk     // Catch:{ zzpi -> 0x03e5 }
        L_0x00f3:
            int r0 = com.google.android.gms.internal.ads.zzei.zza     // Catch:{ zzpi -> 0x03e5 }
            r6 = 31
            if (r0 < r6) goto L_0x0110
            com.google.android.gms.internal.ads.zzog r0 = r1.zzo     // Catch:{ zzpi -> 0x03e5 }
            if (r0 == 0) goto L_0x0110
            android.media.AudioTrack r6 = r1.zzt     // Catch:{ zzpi -> 0x03e5 }
            android.media.metrics.LogSessionId r0 = r0.zza()     // Catch:{ zzpi -> 0x03e5 }
            android.media.metrics.LogSessionId r7 = androidx.work.impl.utils.ProcessUtils$$ExternalSyntheticApiModelOutline0.m()     // Catch:{ zzpi -> 0x03e5 }
            boolean r7 = r0.equals(r7)     // Catch:{ zzpi -> 0x03e5 }
            if (r7 != 0) goto L_0x0110
            r6.setLogSessionId(r0)     // Catch:{ zzpi -> 0x03e5 }
        L_0x0110:
            android.media.AudioTrack r0 = r1.zzt     // Catch:{ zzpi -> 0x03e5 }
            int r0 = r0.getAudioSessionId()     // Catch:{ zzpi -> 0x03e5 }
            r1.zzS = r0     // Catch:{ zzpi -> 0x03e5 }
            com.google.android.gms.internal.ads.zzpq r6 = r1.zzi     // Catch:{ zzpi -> 0x03e5 }
            android.media.AudioTrack r7 = r1.zzt     // Catch:{ zzpi -> 0x03e5 }
            com.google.android.gms.internal.ads.zzqb r0 = r1.zzr     // Catch:{ zzpi -> 0x03e5 }
            int r8 = r0.zzc     // Catch:{ zzpi -> 0x03e5 }
            r9 = 2
            if (r8 != r9) goto L_0x0125
            r8 = 1
            goto L_0x0126
        L_0x0125:
            r8 = 0
        L_0x0126:
            int r9 = r0.zzg     // Catch:{ zzpi -> 0x03e5 }
            int r10 = r0.zzd     // Catch:{ zzpi -> 0x03e5 }
            int r11 = r0.zzh     // Catch:{ zzpi -> 0x03e5 }
            r6.zzd(r7, r8, r9, r10, r11)     // Catch:{ zzpi -> 0x03e5 }
            r27.zzW()     // Catch:{ zzpi -> 0x03e5 }
            com.google.android.gms.internal.ads.zzf r0 = r1.zzT     // Catch:{ zzpi -> 0x03e5 }
            int r0 = r0.zza     // Catch:{ zzpi -> 0x03e5 }
            com.google.android.gms.internal.ads.zzoo r0 = r1.zzU     // Catch:{ zzpi -> 0x03e5 }
            if (r0 == 0) goto L_0x0150
            int r6 = com.google.android.gms.internal.ads.zzei.zza     // Catch:{ zzpi -> 0x03e5 }
            r7 = 23
            if (r6 < r7) goto L_0x0150
            android.media.AudioTrack r6 = r1.zzt     // Catch:{ zzpi -> 0x03e5 }
            com.google.android.gms.internal.ads.zzpx.zza(r6, r0)     // Catch:{ zzpi -> 0x03e5 }
            com.google.android.gms.internal.ads.zzon r0 = r1.zzv     // Catch:{ zzpi -> 0x03e5 }
            if (r0 == 0) goto L_0x0150
            com.google.android.gms.internal.ads.zzoo r6 = r1.zzU     // Catch:{ zzpi -> 0x03e5 }
            android.media.AudioDeviceInfo r6 = r6.zza     // Catch:{ zzpi -> 0x03e5 }
            r0.zzh(r6)     // Catch:{ zzpi -> 0x03e5 }
        L_0x0150:
            int r0 = com.google.android.gms.internal.ads.zzei.zza     // Catch:{ zzpi -> 0x03e5 }
            r6 = 24
            if (r0 < r6) goto L_0x0163
            com.google.android.gms.internal.ads.zzon r0 = r1.zzv     // Catch:{ zzpi -> 0x03e5 }
            if (r0 == 0) goto L_0x0163
            com.google.android.gms.internal.ads.zzqf r6 = new com.google.android.gms.internal.ads.zzqf     // Catch:{ zzpi -> 0x03e5 }
            android.media.AudioTrack r7 = r1.zzt     // Catch:{ zzpi -> 0x03e5 }
            r6.<init>(r7, r0)     // Catch:{ zzpi -> 0x03e5 }
            r1.zzw = r6     // Catch:{ zzpi -> 0x03e5 }
        L_0x0163:
            r6 = 1
            r1.zzI = r6     // Catch:{ zzpi -> 0x03e5 }
            com.google.android.gms.internal.ads.zzpj r0 = r1.zzp     // Catch:{ zzpi -> 0x03e5 }
            if (r0 == 0) goto L_0x017b
            com.google.android.gms.internal.ads.zzqb r6 = r1.zzr     // Catch:{ zzpi -> 0x03e5 }
            com.google.android.gms.internal.ads.zzpg r6 = r6.zza()     // Catch:{ zzpi -> 0x03e5 }
            com.google.android.gms.internal.ads.zzqq r0 = (com.google.android.gms.internal.ads.zzqq) r0     // Catch:{ zzpi -> 0x03e5 }
            com.google.android.gms.internal.ads.zzqs r0 = r0.zza     // Catch:{ zzpi -> 0x03e5 }
            com.google.android.gms.internal.ads.zzpe r0 = r0.zzc     // Catch:{ zzpi -> 0x03e5 }
            r0.zzc(r6)     // Catch:{ zzpi -> 0x03e5 }
        L_0x017b:
            com.google.android.gms.internal.ads.zzqg r0 = r1.zzl
            r0.zza()
            boolean r0 = r1.zzI
            r6 = 0
            if (r0 == 0) goto L_0x019b
            long r8 = java.lang.Math.max(r6, r3)
            r1.zzJ = r8
            r8 = 0
            r1.zzH = r8
            r1.zzI = r8
            r1.zzO(r3)
            boolean r0 = r1.zzR
            if (r0 == 0) goto L_0x019b
            r27.zzi()
        L_0x019b:
            com.google.android.gms.internal.ads.zzpq r0 = r1.zzi
            long r8 = r27.zzM()
            boolean r0 = r0.zzj(r8)
            if (r0 != 0) goto L_0x01a9
            r8 = 0
            return r8
        L_0x01a9:
            java.nio.ByteBuffer r0 = r1.zzL
            if (r0 != 0) goto L_0x03b0
            java.nio.ByteOrder r0 = r28.order()
            java.nio.ByteOrder r8 = java.nio.ByteOrder.LITTLE_ENDIAN
            if (r0 != r8) goto L_0x01b7
            r0 = 1
            goto L_0x01b8
        L_0x01b7:
            r0 = 0
        L_0x01b8:
            com.google.android.gms.internal.ads.zzcw.zzd(r0)
            boolean r0 = r28.hasRemaining()
            if (r0 != 0) goto L_0x01c3
            r8 = 1
            return r8
        L_0x01c3:
            com.google.android.gms.internal.ads.zzqb r0 = r1.zzr
            int r8 = r0.zzc
            if (r8 == 0) goto L_0x031f
            int r8 = r1.zzG
            if (r8 != 0) goto L_0x031f
            int r0 = r0.zzg
            r8 = 20
            if (r0 == r8) goto L_0x0314
            r8 = 30
            r9 = -2
            r10 = 1024(0x400, float:1.435E-42)
            r11 = -1
            if (r0 == r8) goto L_0x0288
            switch(r0) {
                case 5: goto L_0x0281;
                case 6: goto L_0x0281;
                case 7: goto L_0x0288;
                case 8: goto L_0x0288;
                case 9: goto L_0x026c;
                case 10: goto L_0x0269;
                case 11: goto L_0x0266;
                case 12: goto L_0x0266;
                default: goto L_0x01de;
            }
        L_0x01de:
            r8 = 16
            switch(r0) {
                case 14: goto L_0x0216;
                case 15: goto L_0x0212;
                case 16: goto L_0x0269;
                case 17: goto L_0x01f7;
                case 18: goto L_0x0281;
                default: goto L_0x01e3;
            }
        L_0x01e3:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Unexpected audio encoding: "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x01f7:
            int r0 = com.google.android.gms.internal.ads.zzabq.zza
            byte[] r0 = new byte[r8]
            int r9 = r28.position()
            r2.get(r0)
            r2.position(r9)
            com.google.android.gms.internal.ads.zzdx r9 = new com.google.android.gms.internal.ads.zzdx
            r9.<init>(r0, r8)
            com.google.android.gms.internal.ads.zzabo r0 = com.google.android.gms.internal.ads.zzabq.zza(r9)
            int r0 = r0.zzc
            goto L_0x0285
        L_0x0212:
            r0 = 512(0x200, float:7.175E-43)
            goto L_0x0285
        L_0x0216:
            int r0 = com.google.android.gms.internal.ads.zzabn.zza
            int r0 = r28.position()
            int r10 = r28.limit()
            int r10 = r10 + -10
            r12 = r0
        L_0x0223:
            if (r12 > r10) goto L_0x0236
            int r13 = r12 + 4
            int r13 = com.google.android.gms.internal.ads.zzei.zzj(r2, r13)
            r13 = r13 & r9
            r14 = -126718022(0xfffffffff8726fba, float:-1.966878E34)
            if (r13 != r14) goto L_0x0233
            int r12 = r12 - r0
            goto L_0x0237
        L_0x0233:
            int r12 = r12 + 1
            goto L_0x0223
        L_0x0236:
            r12 = -1
        L_0x0237:
            if (r12 != r11) goto L_0x023b
            r0 = 0
            goto L_0x0285
        L_0x023b:
            int r0 = r28.position()
            int r0 = r0 + r12
            int r0 = r0 + 7
            byte r0 = r2.get(r0)
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r9 = r28.position()
            int r9 = r9 + r12
            r10 = 187(0xbb, float:2.62E-43)
            if (r0 != r10) goto L_0x0254
            r0 = 9
            goto L_0x0256
        L_0x0254:
            r0 = 8
        L_0x0256:
            int r9 = r9 + r0
            byte r0 = r2.get(r9)
            int r0 = r0 >> 4
            r0 = r0 & 7
            r9 = 40
            int r0 = r9 << r0
            int r0 = r0 * 16
            goto L_0x0285
        L_0x0266:
            r0 = 2048(0x800, float:2.87E-42)
            goto L_0x0285
        L_0x0269:
            r0 = 1024(0x400, float:1.435E-42)
            goto L_0x0285
        L_0x026c:
            int r0 = r28.position()
            int r0 = com.google.android.gms.internal.ads.zzei.zzj(r2, r0)
            int r0 = com.google.android.gms.internal.ads.zzadg.zzc(r0)
            if (r0 == r11) goto L_0x027b
            goto L_0x0285
        L_0x027b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0281:
            int r0 = com.google.android.gms.internal.ads.zzabn.zza(r28)
        L_0x0285:
            r11 = 1
            goto L_0x0319
        L_0x0288:
            int r0 = com.google.android.gms.internal.ads.zzacm.zza
            r8 = 0
            int r0 = r2.getInt(r8)
            r12 = -233094848(0xfffffffff21b4140, float:-3.0751398E30)
            if (r0 == r12) goto L_0x0310
            int r0 = r2.getInt(r8)
            r12 = -398277519(0xffffffffe842c471, float:-3.6790512E24)
            if (r0 != r12) goto L_0x029e
            goto L_0x0269
        L_0x029e:
            int r0 = r2.getInt(r8)
            r8 = 622876772(0x25205864, float:1.3907736E-16)
            if (r0 != r8) goto L_0x02aa
            r0 = 4096(0x1000, float:5.74E-42)
            goto L_0x0285
        L_0x02aa:
            int r0 = r28.position()
            byte r8 = r2.get(r0)
            if (r8 == r9) goto L_0x02f7
            if (r8 == r11) goto L_0x02e0
            r9 = 31
            if (r8 == r9) goto L_0x02ce
            int r8 = r0 + 4
            int r0 = r0 + 5
            byte r8 = r2.get(r8)
            r9 = 1
            r8 = r8 & r9
            int r8 = r8 << 6
            byte r0 = r2.get(r0)
            r0 = r0 & 252(0xfc, float:3.53E-43)
            r9 = 2
            goto L_0x02f3
        L_0x02ce:
            r9 = 2
            int r8 = r0 + 5
            byte r8 = r2.get(r8)
            r8 = r8 & 7
            int r8 = r8 << 4
            int r0 = r0 + 6
            byte r0 = r2.get(r0)
            goto L_0x02f1
        L_0x02e0:
            r9 = 2
            int r8 = r0 + 4
            byte r8 = r2.get(r8)
            r8 = r8 & 7
            int r8 = r8 << 4
            int r0 = r0 + 7
            byte r0 = r2.get(r0)
        L_0x02f1:
            r0 = r0 & 60
        L_0x02f3:
            int r0 = r0 >> r9
            r0 = r0 | r8
            r11 = 1
            goto L_0x030c
        L_0x02f7:
            r9 = 2
            int r8 = r0 + 4
            int r0 = r0 + 5
            byte r0 = r2.get(r0)
            r11 = 1
            r0 = r0 & r11
            int r0 = r0 << 6
            byte r8 = r2.get(r8)
            r8 = r8 & 252(0xfc, float:3.53E-43)
            int r8 = r8 >> r9
            r0 = r0 | r8
        L_0x030c:
            int r0 = r0 + r11
            int r0 = r0 * 32
            goto L_0x0319
        L_0x0310:
            r11 = 1
            r0 = 1024(0x400, float:1.435E-42)
            goto L_0x0319
        L_0x0314:
            r11 = 1
            int r0 = com.google.android.gms.internal.ads.zzadi.zzb(r28)
        L_0x0319:
            r1.zzG = r0
            if (r0 == 0) goto L_0x031e
            goto L_0x031f
        L_0x031e:
            return r11
        L_0x031f:
            com.google.android.gms.internal.ads.zzqd r0 = r1.zzy
            if (r0 == 0) goto L_0x0331
            boolean r0 = r27.zzY()
            if (r0 != 0) goto L_0x032b
            r8 = 0
            return r8
        L_0x032b:
            r1.zzO(r3)
            r8 = 0
            r1.zzy = r8
        L_0x0331:
            long r8 = r1.zzJ
            com.google.android.gms.internal.ads.zzqb r0 = r1.zzr
            long r10 = r27.zzL()
            com.google.android.gms.internal.ads.zzqw r12 = r1.zzf
            long r12 = r12.zzo()
            long r10 = r10 - r12
            com.google.android.gms.internal.ads.zzab r0 = r0.zza
            int r0 = r0.zzE
            long r10 = com.google.android.gms.internal.ads.zzei.zzt(r10, r0)
            long r8 = r8 + r10
            boolean r0 = r1.zzH
            if (r0 != 0) goto L_0x0369
            long r10 = r8 - r3
            long r10 = java.lang.Math.abs(r10)
            r12 = 200000(0x30d40, double:9.8813E-319)
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0369
            com.google.android.gms.internal.ads.zzpj r0 = r1.zzp
            if (r0 == 0) goto L_0x0366
            com.google.android.gms.internal.ads.zzpk r10 = new com.google.android.gms.internal.ads.zzpk
            r10.<init>(r3, r8)
            r0.zza(r10)
        L_0x0366:
            r10 = 1
            r1.zzH = r10
        L_0x0369:
            boolean r0 = r1.zzH
            if (r0 == 0) goto L_0x0390
            boolean r0 = r27.zzY()
            r10 = 0
            if (r0 != 0) goto L_0x0375
            return r10
        L_0x0375:
            long r8 = r3 - r8
            long r11 = r1.zzJ
            long r11 = r11 + r8
            r1.zzJ = r11
            r1.zzH = r10
            r1.zzO(r3)
            com.google.android.gms.internal.ads.zzpj r0 = r1.zzp
            if (r0 == 0) goto L_0x0390
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x0390
            com.google.android.gms.internal.ads.zzqq r0 = (com.google.android.gms.internal.ads.zzqq) r0
            com.google.android.gms.internal.ads.zzqs r0 = r0.zza
            r0.zzao()
        L_0x0390:
            com.google.android.gms.internal.ads.zzqb r0 = r1.zzr
            int r0 = r0.zzc
            if (r0 != 0) goto L_0x03a1
            long r6 = r1.zzC
            int r0 = r28.remaining()
            long r8 = (long) r0
            long r6 = r6 + r8
            r1.zzC = r6
            goto L_0x03ac
        L_0x03a1:
            long r6 = r1.zzD
            int r0 = r1.zzG
            long r8 = (long) r0
            long r10 = (long) r5
            long r8 = r8 * r10
            long r6 = r6 + r8
            r1.zzD = r6
        L_0x03ac:
            r1.zzL = r2
            r1.zzM = r5
        L_0x03b0:
            r1.zzT(r3)
            java.nio.ByteBuffer r0 = r1.zzL
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L_0x03c3
            r2 = 0
            r1.zzL = r2
            r2 = 0
            r1.zzM = r2
            r3 = 1
            return r3
        L_0x03c3:
            r2 = 0
            r3 = 1
            com.google.android.gms.internal.ads.zzpq r0 = r1.zzi
            long r4 = r27.zzM()
            boolean r0 = r0.zzi(r4)
            if (r0 == 0) goto L_0x03dc
            java.lang.String r0 = "DefaultAudioSink"
            java.lang.String r2 = "Resetting stalled audio track"
            com.google.android.gms.internal.ads.zzdo.zzf(r0, r2)
            r27.zzf()
            return r3
        L_0x03dc:
            return r2
        L_0x03dd:
            r0 = move-exception
            r11.addSuppressed(r0)     // Catch:{ zzpi -> 0x03e5 }
        L_0x03e1:
            r27.zzQ()     // Catch:{ zzpi -> 0x03e5 }
            throw r11     // Catch:{ zzpi -> 0x03e5 }
        L_0x03e5:
            r0 = move-exception
            boolean r2 = r0.zzb
            if (r2 != 0) goto L_0x03f1
            com.google.android.gms.internal.ads.zzqg r2 = r1.zzl
            r2.zzb(r0)
            r2 = 0
            return r2
        L_0x03f1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqm.zzx(java.nio.ByteBuffer, long, int):boolean");
    }

    public final boolean zzy() {
        if (zzZ()) {
            return (zzei.zza < 29 || !this.zzt.isOffloadedPlayback() || !this.zzQ) && this.zzi.zzg(zzM());
        }
        return false;
    }

    public final boolean zzz() {
        if (zzZ()) {
            return this.zzO && !zzy();
        }
        return true;
    }

    public final void zzu(AudioDeviceInfo audioDeviceInfo) {
        zzoo zzoo;
        if (audioDeviceInfo == null) {
            zzoo = null;
        } else {
            zzoo = new zzoo(audioDeviceInfo);
        }
        this.zzU = zzoo;
        zzon zzon = this.zzv;
        if (zzon != null) {
            zzon.zzh(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.zzt;
        if (audioTrack != null) {
            zzpx.zza(audioTrack, this.zzU);
        }
    }
}
