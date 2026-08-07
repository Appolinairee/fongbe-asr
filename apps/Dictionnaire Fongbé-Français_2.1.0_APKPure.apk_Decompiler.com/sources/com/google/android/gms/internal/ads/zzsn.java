package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public abstract class zzsn extends zzhr {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, Ascii.VT, -38, 37, -112, 0, 0, 1, 104, -50, Ascii.SI, 19, 32, 0, 0, 1, 101, -120, -124, Ascii.CR, -50, 113, Ascii.CAN, -96, 0, 47, -65, Ascii.FS, 49, -61, 39, 93, 120};
    private int zzA;
    private boolean zzB;
    private boolean zzC;
    private boolean zzD;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private long zzH;
    private long zzI;
    private int zzJ;
    private int zzK;
    private ByteBuffer zzL;
    private boolean zzM;
    private boolean zzN;
    private boolean zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private int zzS;
    private int zzT;
    private int zzU;
    private boolean zzV;
    private boolean zzW;
    private boolean zzX;
    private long zzY;
    private long zzZ;
    protected zzhs zza;
    private boolean zzaa;
    private boolean zzab;
    private boolean zzac;
    private zzsl zzad;
    private long zzae;
    private boolean zzaf;
    private zzrg zzag;
    private zzrg zzah;
    private final zzsb zzc;
    private final zzsp zzd;
    private final float zze;
    private final zzhh zzf = new zzhh(0, 0);
    private final zzhh zzg = new zzhh(0, 0);
    private final zzhh zzh = new zzhh(2, 0);
    private final zzru zzi;
    private final MediaCodec.BufferInfo zzj;
    private final ArrayDeque zzk;
    private final zzqt zzl;
    private zzab zzm;
    private zzab zzn;
    /* access modifiers changed from: private */
    public zzli zzo;
    private MediaCrypto zzp;
    private float zzq;
    private float zzr;
    private zzsd zzs;
    private zzab zzt;
    private MediaFormat zzu;
    private boolean zzv;
    private float zzw;
    private ArrayDeque zzx;
    private zzsj zzy;
    private zzsg zzz;

    public zzsn(int i, zzsb zzsb, zzsp zzsp, boolean z, float f) {
        super(i);
        this.zzc = zzsb;
        zzsp zzsp2 = zzsp;
        this.zzd = zzsp;
        this.zze = f;
        zzru zzru = new zzru();
        this.zzi = zzru;
        this.zzj = new MediaCodec.BufferInfo();
        this.zzq = 1.0f;
        this.zzr = 1.0f;
        this.zzk = new ArrayDeque();
        this.zzad = zzsl.zza;
        zzru.zzj(0);
        zzru.zzc.order(ByteOrder.nativeOrder());
        this.zzl = new zzqt();
        this.zzw = -1.0f;
        this.zzA = 0;
        this.zzS = 0;
        this.zzJ = -1;
        this.zzK = -1;
        this.zzI = -9223372036854775807L;
        this.zzY = -9223372036854775807L;
        this.zzZ = -9223372036854775807L;
        this.zzae = -9223372036854775807L;
        this.zzH = -9223372036854775807L;
        this.zzT = 0;
        this.zzU = 0;
        this.zza = new zzhs();
    }

    protected static boolean zzaP(zzab zzab2) {
        return zzab2.zzK == 0;
    }

    private final void zzaQ() {
        this.zzK = -1;
        this.zzL = null;
    }

    private final void zzaR(zzsl zzsl) {
        this.zzad = zzsl;
        if (zzsl.zzd != -9223372036854775807L) {
            this.zzaf = true;
        }
    }

    private final boolean zzaT() throws zzib {
        if (this.zzV) {
            this.zzT = 1;
            if (this.zzC) {
                this.zzU = 3;
                return false;
            }
            this.zzU = 2;
        } else {
            zzaS();
        }
        return true;
    }

    private final boolean zzaU() {
        return this.zzK >= 0;
    }

    private final boolean zzaV(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        zzab zzab2 = this.zzn;
        return zzab2 == null || !Objects.equals(zzab2.zzo, "audio/opus") || !zzadi.zzf(j, j2);
    }

    private final boolean zzaW(int i) throws zzib {
        zzhh zzhh = this.zzf;
        zzke zzk2 = zzk();
        zzhh.zzb();
        int zzcU = zzcU(zzk2, this.zzf, i | 4);
        if (zzcU == -5) {
            zzac(zzk2);
            return true;
        } else if (zzcU != -4 || !this.zzf.zzf()) {
            return false;
        } else {
            this.zzaa = true;
            zzai();
            return false;
        }
    }

    private final boolean zzaX(zzab zzab2) throws zzib {
        if (!(zzei.zza < 23 || this.zzs == null || this.zzU == 3 || zzcT() == 0)) {
            float f = this.zzr;
            zzab2.getClass();
            zzab zzab3 = zzab2;
            float zzZ2 = zzZ(f, zzab2, zzT());
            float f2 = this.zzw;
            if (f2 != zzZ2) {
                if (zzZ2 == -1.0f) {
                    zzae();
                    return false;
                } else if (f2 != -1.0f || zzZ2 > this.zze) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", zzZ2);
                    zzsd zzsd = this.zzs;
                    zzsd.getClass();
                    zzsd zzsd2 = zzsd;
                    zzsd.zzq(bundle);
                    this.zzw = zzZ2;
                }
            }
        }
        return true;
    }

    private final void zzad() {
        this.zzQ = false;
        this.zzi.zzb();
        this.zzh.zzb();
        this.zzP = false;
        this.zzO = false;
        this.zzl.zzb();
    }

    private final void zzae() throws zzib {
        if (this.zzV) {
            this.zzT = 1;
            this.zzU = 3;
            return;
        }
        zzaG();
        zzaC();
    }

    private final void zzah() {
        try {
            zzsd zzsd = this.zzs;
            zzcw.zzb(zzsd);
            zzsd zzsd2 = zzsd;
            zzsd.zzj();
        } finally {
            zzaH();
        }
    }

    private final void zzao() {
        this.zzJ = -1;
        this.zzg.zzc = null;
    }

    /* access modifiers changed from: protected */
    public void zzC() {
        try {
            zzad();
            zzaG();
        } finally {
            this.zzah = null;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        if (r5 >= r1) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void zzF(com.google.android.gms.internal.ads.zzab[] r16, long r17, long r19, com.google.android.gms.internal.ads.zzug r21) throws com.google.android.gms.internal.ads.zzib {
        /*
            r15 = this;
            r0 = r15
            com.google.android.gms.internal.ads.zzsl r1 = r0.zzad
            long r1 = r1.zzd
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0021
            com.google.android.gms.internal.ads.zzsl r1 = new com.google.android.gms.internal.ads.zzsl
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r1
            r9 = r17
            r11 = r19
            r6.<init>(r7, r9, r11)
            r15.zzaR(r1)
            return
        L_0x0021:
            java.util.ArrayDeque r1 = r0.zzk
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0057
            long r1 = r0.zzY
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0039
            long r5 = r0.zzae
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x0057
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 < 0) goto L_0x0057
        L_0x0039:
            com.google.android.gms.internal.ads.zzsl r1 = new com.google.android.gms.internal.ads.zzsl
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r1
            r11 = r17
            r13 = r19
            r8.<init>(r9, r11, r13)
            r15.zzaR(r1)
            com.google.android.gms.internal.ads.zzsl r1 = r0.zzad
            long r1 = r1.zzd
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0056
            r15.zzap()
        L_0x0056:
            return
        L_0x0057:
            java.util.ArrayDeque r1 = r0.zzk
            com.google.android.gms.internal.ads.zzsl r9 = new com.google.android.gms.internal.ads.zzsl
            long r3 = r0.zzY
            r2 = r9
            r5 = r17
            r7 = r19
            r2.<init>(r3, r5, r7)
            r1.add(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsn.zzF(com.google.android.gms.internal.ads.zzab[], long, long, com.google.android.gms.internal.ads.zzug):void");
    }

    public void zzM(float f, float f2) throws zzib {
        this.zzq = f;
        this.zzr = f2;
        zzaX(this.zzt);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v37, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v43, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v44, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v48, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v51, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v60, resolved type: android.media.MediaFormat} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v117, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v118, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v126, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v128, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v129, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v130, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v138, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v139, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v140, resolved type: long} */
    /* JADX WARNING: type inference failed for: r2v62, types: [android.media.MediaFormat] */
    /* JADX WARNING: type inference failed for: r14v16, types: [java.lang.Throwable, android.media.MediaFormat] */
    /* JADX WARNING: type inference failed for: r14v18 */
    /* JADX WARNING: type inference failed for: r14v21 */
    /* JADX WARNING: type inference failed for: r2v115 */
    /* JADX WARNING: type inference failed for: r2v116 */
    /* JADX WARNING: type inference failed for: r2v131 */
    /* JADX WARNING: type inference failed for: r2v132 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01df, code lost:
        r15.zzP = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x020a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0213, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:?, code lost:
        zzai();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x024b, code lost:
        if (r15.zzab != false) goto L_0x024d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x024d, code lost:
        zzaG();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0250, code lost:
        r16 = r14;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0347, code lost:
        if (r15.zzn != null) goto L_0x0349;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x039f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x03a0, code lost:
        r2 = false;
        r1 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x03a5, code lost:
        r16 = r14;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x042b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x042c, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0463, code lost:
        if (r1.zzG != false) goto L_0x0474;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0465, code lost:
        r1.zzW = true;
        r4.zzk(r1.zzJ, 0, 0, 0, 4);
        zzao();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0474, code lost:
        r1.zzT = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0479, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x047a, code lost:
        r3 = r0;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x04f6, code lost:
        if (zzQ() == false) goto L_0x0633;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x04f8, code lost:
        r1.zzZ = r1.zzY;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x062e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x062f, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x0639, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x063c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x063d, code lost:
        r2 = false;
        r1 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x0671, code lost:
        r5 = r3.getStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x0694, code lost:
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x0696, code lost:
        r14 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x0699, code lost:
        zzaG();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x06a8, code lost:
        r3 = 4006;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x06ab, code lost:
        r3 = 4003;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:0x06b4, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r15.zzab = true;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:4:0x0008, B:157:0x0246] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:157:0x0246 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:248:0x03a7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0013 A[ExcHandler: CryptoException (e android.media.MediaCodec$CryptoException), PHI: r15 
      PHI: (r15v21 com.google.android.gms.internal.ads.zzsn) = (r15v5 com.google.android.gms.internal.ads.zzsn), (r15v5 com.google.android.gms.internal.ads.zzsn), (r15v10 com.google.android.gms.internal.ads.zzsn), (r15v5 com.google.android.gms.internal.ads.zzsn), (r15v5 com.google.android.gms.internal.ads.zzsn), (r15v5 com.google.android.gms.internal.ads.zzsn), (r15v16 com.google.android.gms.internal.ads.zzsn), (r15v16 com.google.android.gms.internal.ads.zzsn), (r15v16 com.google.android.gms.internal.ads.zzsn), (r15v16 com.google.android.gms.internal.ads.zzsn), (r15v14 com.google.android.gms.internal.ads.zzsn), (r15v19 com.google.android.gms.internal.ads.zzsn), (r15v0 com.google.android.gms.internal.ads.zzsn), (r15v0 com.google.android.gms.internal.ads.zzsn), (r15v0 com.google.android.gms.internal.ads.zzsn) binds: [B:232:0x035f, B:233:?, B:251:0x03ac, B:150:0x0237, B:155:0x023f, B:157:0x0246, B:49:0x009d, B:50:?, B:88:0x0130, B:58:0x00b3, B:30:0x0041, B:39:0x007f, B:17:0x001e, B:4:0x0008, B:5:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:4:0x0008] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0213 A[ExcHandler: CryptoException (e android.media.MediaCodec$CryptoException), PHI: r15 
      PHI: (r15v12 com.google.android.gms.internal.ads.zzsn) = (r15v0 com.google.android.gms.internal.ads.zzsn), (r15v16 com.google.android.gms.internal.ads.zzsn), (r15v16 com.google.android.gms.internal.ads.zzsn), (r15v16 com.google.android.gms.internal.ads.zzsn) binds: [B:26:0x0030, B:45:0x0098, B:46:?, B:53:0x00a3] A[DONT_GENERATE, DONT_INLINE], Splitter:B:26:0x0030] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0261 A[Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x02b9 A[Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }] */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x039f A[ExcHandler: CryptoException (e android.media.MediaCodec$CryptoException), Splitter:B:235:0x0363] */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x042b A[ExcHandler: CryptoException (r0v15 'e' android.media.MediaCodec$CryptoException A[CUSTOM_DECLARE]), PHI: r1 
      PHI: (r1v23 com.google.android.gms.internal.ads.zzsn) = (r1v20 com.google.android.gms.internal.ads.zzsn), (r1v20 com.google.android.gms.internal.ads.zzsn), (r1v29 com.google.android.gms.internal.ads.zzsn) binds: [B:308:0x0461, B:300:0x0447, B:270:0x03ef] A[DONT_GENERATE, DONT_INLINE], Splitter:B:270:0x03ef] */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x0440 A[Catch:{ CryptoException -> 0x0639, IllegalStateException -> 0x0637 }] */
    /* JADX WARNING: Removed duplicated region for block: B:417:0x0639 A[Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }, ExcHandler: CryptoException (e android.media.MediaCodec$CryptoException), Splitter:B:290:0x0431] */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x0671  */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x0694  */
    /* JADX WARNING: Removed duplicated region for block: B:445:0x0696  */
    /* JADX WARNING: Removed duplicated region for block: B:447:0x0699  */
    /* JADX WARNING: Removed duplicated region for block: B:450:0x06a8  */
    /* JADX WARNING: Removed duplicated region for block: B:451:0x06ab  */
    /* JADX WARNING: Removed duplicated region for block: B:487:0x042f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:501:0x043e A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void zzV(long r23, long r25) throws com.google.android.gms.internal.ads.zzib {
        /*
            r22 = this;
            r15 = r22
            r14 = 0
            r13 = 1
            boolean r1 = r15.zzab     // Catch:{ CryptoException -> 0x06b5, IllegalStateException -> 0x0667 }
            if (r1 == 0) goto L_0x0019
            r22.zzaq()     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            return
        L_0x000c:
            r0 = move-exception
        L_0x000d:
            r3 = r0
            r1 = r15
        L_0x000f:
            r2 = 0
            r11 = 1
            goto L_0x066c
        L_0x0013:
            r0 = move-exception
        L_0x0014:
            r3 = r0
            r1 = r15
        L_0x0016:
            r2 = 0
            goto L_0x06b9
        L_0x0019:
            com.google.android.gms.internal.ads.zzab r1 = r15.zzm     // Catch:{ CryptoException -> 0x06b5, IllegalStateException -> 0x0667 }
            r11 = 2
            if (r1 != 0) goto L_0x0026
            boolean r1 = r15.zzaW(r11)     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r1 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            return
        L_0x0026:
            r22.zzaC()     // Catch:{ CryptoException -> 0x06b5, IllegalStateException -> 0x0667 }
            boolean r1 = r15.zzO     // Catch:{ CryptoException -> 0x06b5, IllegalStateException -> 0x0667 }
            r10 = 0
            if (r1 == 0) goto L_0x0217
            java.lang.String r1 = "bypassRender"
            android.os.Trace.beginSection(r1)     // Catch:{ CryptoException -> 0x0213, IllegalStateException -> 0x020f }
        L_0x0033:
            boolean r1 = r15.zzab     // Catch:{ CryptoException -> 0x0213, IllegalStateException -> 0x020f }
            r1 = r1 ^ r13
            com.google.android.gms.internal.ads.zzcw.zzf(r1)     // Catch:{ CryptoException -> 0x0213, IllegalStateException -> 0x020f }
            com.google.android.gms.internal.ads.zzru r1 = r15.zzi     // Catch:{ CryptoException -> 0x0213, IllegalStateException -> 0x020f }
            boolean r2 = r1.zzq()     // Catch:{ CryptoException -> 0x0213, IllegalStateException -> 0x020f }
            if (r2 == 0) goto L_0x0097
            java.nio.ByteBuffer r7 = r1.zzc     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            int r8 = r15.zzK     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            int r11 = r1.zzm()     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            long r4 = r1.zze     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            long r2 = r22.zzf()     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            long r12 = r1.zzn()     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            boolean r13 = r15.zzaV(r2, r12)     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            com.google.android.gms.internal.ads.zzru r1 = r15.zzi     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            boolean r18 = r1.zzf()     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            com.google.android.gms.internal.ads.zzab r12 = r15.zzn     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r12 == 0) goto L_0x0095
            r1 = r12
            com.google.android.gms.internal.ads.zzab r1 = (com.google.android.gms.internal.ads.zzab) r1     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            r6 = 0
            r9 = 0
            r1 = r22
            r2 = r23
            r19 = r4
            r4 = r25
            r10 = r11
            r17 = r12
            r11 = r19
            r14 = r18
            r15 = r17
            boolean r1 = r1.zzar(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch:{ CryptoException -> 0x03bb, IllegalStateException -> 0x03b6 }
            if (r1 == 0) goto L_0x008f
            r15 = r22
            com.google.android.gms.internal.ads.zzru r1 = r15.zzi     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            long r1 = r1.zzn()     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            r15.zzaD(r1)     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            com.google.android.gms.internal.ads.zzru r1 = r15.zzi     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            r1.zzb()     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            r14 = 0
            goto L_0x0098
        L_0x008f:
            r15 = r22
            r12 = 0
            r13 = 1
            goto L_0x0202
        L_0x0095:
            r14 = r10
            throw r14     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
        L_0x0097:
            r14 = r10
        L_0x0098:
            boolean r1 = r15.zzaa     // Catch:{ CryptoException -> 0x0213, IllegalStateException -> 0x020a }
            if (r1 == 0) goto L_0x00a2
            r13 = 1
            r15.zzab = r13     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            r12 = 0
            goto L_0x0202
        L_0x00a2:
            r13 = 1
            boolean r1 = r15.zzP     // Catch:{ CryptoException -> 0x0213, IllegalStateException -> 0x020f }
            if (r1 == 0) goto L_0x00b6
            com.google.android.gms.internal.ads.zzru r1 = r15.zzi     // Catch:{ CryptoException -> 0x0213, IllegalStateException -> 0x020f }
            com.google.android.gms.internal.ads.zzhh r2 = r15.zzh     // Catch:{ CryptoException -> 0x0213, IllegalStateException -> 0x020f }
            boolean r1 = r1.zzp(r2)     // Catch:{ CryptoException -> 0x0213, IllegalStateException -> 0x020f }
            com.google.android.gms.internal.ads.zzcw.zzf(r1)     // Catch:{ CryptoException -> 0x0213, IllegalStateException -> 0x020f }
            r12 = 0
            r15.zzP = r12     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            goto L_0x00b7
        L_0x00b6:
            r12 = 0
        L_0x00b7:
            boolean r1 = r15.zzQ     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r1 == 0) goto L_0x00d4
            com.google.android.gms.internal.ads.zzru r1 = r15.zzi     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            boolean r1 = r1.zzq()     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r1 != 0) goto L_0x00d0
            r22.zzad()     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            r15.zzQ = r12     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            r22.zzaC()     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            boolean r1 = r15.zzO     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r1 == 0) goto L_0x0202
            goto L_0x00d4
        L_0x00d0:
            r10 = r14
            r14 = 0
            goto L_0x0033
        L_0x00d4:
            boolean r1 = r15.zzaa     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            r1 = r1 ^ r13
            com.google.android.gms.internal.ads.zzcw.zzf(r1)     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            com.google.android.gms.internal.ads.zzke r1 = r22.zzk()     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            com.google.android.gms.internal.ads.zzhh r2 = r15.zzh     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            r2.zzb()     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
        L_0x00e3:
            com.google.android.gms.internal.ads.zzhh r2 = r15.zzh     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            r2.zzb()     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            com.google.android.gms.internal.ads.zzhh r2 = r15.zzh     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            int r2 = r15.zzcU(r1, r2, r12)     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            r10 = -5
            if (r2 == r10) goto L_0x01e2
            r3 = -4
            if (r2 == r3) goto L_0x0100
            boolean r1 = r22.zzQ()     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r1 == 0) goto L_0x01e5
            long r1 = r15.zzY     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            r15.zzZ = r1     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            goto L_0x01e5
        L_0x0100:
            com.google.android.gms.internal.ads.zzhh r2 = r15.zzh     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            boolean r3 = r2.zzf()     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r3 == 0) goto L_0x0110
            r15.zzaa = r13     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            long r1 = r15.zzY     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            r15.zzZ = r1     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            goto L_0x01e5
        L_0x0110:
            long r3 = r15.zzY     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            long r5 = r2.zze     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            long r2 = java.lang.Math.max(r3, r5)     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            r15.zzY = r2     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            boolean r4 = r22.zzQ()     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r4 != 0) goto L_0x0128
            com.google.android.gms.internal.ads.zzhh r4 = r15.zzg     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            boolean r4 = r4.zzh()     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r4 == 0) goto L_0x012a
        L_0x0128:
            r15.zzZ = r2     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
        L_0x012a:
            boolean r2 = r15.zzac     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            java.lang.String r3 = "audio/opus"
            if (r2 == 0) goto L_0x0178
            com.google.android.gms.internal.ads.zzab r2 = r15.zzm     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r2 == 0) goto L_0x0177
            r4 = r2
            com.google.android.gms.internal.ads.zzab r4 = (com.google.android.gms.internal.ads.zzab) r4     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            r15.zzn = r2     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            java.lang.String r2 = r2.zzo     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            boolean r2 = java.util.Objects.equals(r2, r3)     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r2 == 0) goto L_0x016f
            com.google.android.gms.internal.ads.zzab r2 = r15.zzn     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            java.util.List r2 = r2.zzr     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            boolean r2 = r2.isEmpty()     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r2 != 0) goto L_0x016f
            com.google.android.gms.internal.ads.zzab r2 = r15.zzn     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            java.util.List r2 = r2.zzr     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            java.lang.Object r2 = r2.get(r12)     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            byte[] r2 = (byte[]) r2     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            int r2 = com.google.android.gms.internal.ads.zzadi.zza(r2)     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            com.google.android.gms.internal.ads.zzab r4 = r15.zzn     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r4 == 0) goto L_0x016e
            r5 = r4
            com.google.android.gms.internal.ads.zzab r5 = (com.google.android.gms.internal.ads.zzab) r5     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            com.google.android.gms.internal.ads.zzz r4 = r4.zzb()     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            r4.zzG(r2)     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            com.google.android.gms.internal.ads.zzab r2 = r4.zzag()     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            r15.zzn = r2     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            goto L_0x016f
        L_0x016e:
            throw r14     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
        L_0x016f:
            com.google.android.gms.internal.ads.zzab r2 = r15.zzn     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            r15.zzan(r2, r14)     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            r15.zzac = r12     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            goto L_0x0178
        L_0x0177:
            throw r14     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
        L_0x0178:
            com.google.android.gms.internal.ads.zzhh r2 = r15.zzh     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            r2.zzk()     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            com.google.android.gms.internal.ads.zzab r2 = r15.zzn     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r2 == 0) goto L_0x01b6
            java.lang.String r2 = r2.zzo     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            boolean r2 = java.util.Objects.equals(r2, r3)     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r2 == 0) goto L_0x01b6
            com.google.android.gms.internal.ads.zzhh r2 = r15.zzh     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            boolean r3 = r2.zze()     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r3 == 0) goto L_0x0198
            com.google.android.gms.internal.ads.zzab r3 = r15.zzn     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            r2.zza = r3     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            r15.zzaj(r2)     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
        L_0x0198:
            long r2 = r22.zzf()     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            com.google.android.gms.internal.ads.zzhh r4 = r15.zzh     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            long r5 = r4.zze     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            boolean r2 = com.google.android.gms.internal.ads.zzadi.zzf(r2, r5)     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r2 == 0) goto L_0x01b6
            com.google.android.gms.internal.ads.zzqt r2 = r15.zzl     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            com.google.android.gms.internal.ads.zzab r3 = r15.zzn     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r3 == 0) goto L_0x01b5
            r5 = r3
            com.google.android.gms.internal.ads.zzab r5 = (com.google.android.gms.internal.ads.zzab) r5     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            java.util.List r3 = r3.zzr     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            r2.zza(r4, r3)     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            goto L_0x01b6
        L_0x01b5:
            throw r14     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
        L_0x01b6:
            com.google.android.gms.internal.ads.zzru r2 = r15.zzi     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            boolean r3 = r2.zzq()     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r3 != 0) goto L_0x01bf
            goto L_0x01d5
        L_0x01bf:
            long r3 = r22.zzf()     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            long r5 = r2.zzn()     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            boolean r2 = r15.zzaV(r3, r5)     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            com.google.android.gms.internal.ads.zzhh r5 = r15.zzh     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            long r5 = r5.zze     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            boolean r3 = r15.zzaV(r3, r5)     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r2 != r3) goto L_0x01df
        L_0x01d5:
            com.google.android.gms.internal.ads.zzru r2 = r15.zzi     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            com.google.android.gms.internal.ads.zzhh r3 = r15.zzh     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            boolean r2 = r2.zzp(r3)     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r2 != 0) goto L_0x00e3
        L_0x01df:
            r15.zzP = r13     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            goto L_0x01e5
        L_0x01e2:
            r15.zzac(r1)     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
        L_0x01e5:
            com.google.android.gms.internal.ads.zzru r1 = r15.zzi     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            boolean r2 = r1.zzq()     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r2 == 0) goto L_0x01f0
            r1.zzk()     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
        L_0x01f0:
            com.google.android.gms.internal.ads.zzru r1 = r15.zzi     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            boolean r1 = r1.zzq()     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r1 != 0) goto L_0x00d0
            boolean r1 = r15.zzaa     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r1 != 0) goto L_0x00d0
            boolean r1 = r15.zzQ     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r1 == 0) goto L_0x0202
            goto L_0x00d0
        L_0x0202:
            android.os.Trace.endSection()     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            r1 = r15
            r2 = 0
            r11 = 1
            goto L_0x065d
        L_0x020a:
            r0 = move-exception
            r12 = 0
            r13 = 1
            goto L_0x000d
        L_0x020f:
            r0 = move-exception
            r12 = 0
            goto L_0x000d
        L_0x0213:
            r0 = move-exception
            r12 = 0
            goto L_0x0014
        L_0x0217:
            r14 = r10
            r10 = -5
            r12 = 0
            com.google.android.gms.internal.ads.zzsd r1 = r15.zzs     // Catch:{ CryptoException -> 0x06b5, IllegalStateException -> 0x0667 }
            if (r1 == 0) goto L_0x064c
            com.google.android.gms.internal.ads.zzcx r1 = r22.zzi()     // Catch:{ CryptoException -> 0x06b5, IllegalStateException -> 0x0667 }
            r1.zzb()     // Catch:{ CryptoException -> 0x06b5, IllegalStateException -> 0x0667 }
            java.lang.String r1 = "drainAndFeed"
            android.os.Trace.beginSection(r1)     // Catch:{ CryptoException -> 0x06b5, IllegalStateException -> 0x0667 }
        L_0x022a:
            com.google.android.gms.internal.ads.zzsd r6 = r15.zzs     // Catch:{ CryptoException -> 0x06b5, IllegalStateException -> 0x0667 }
            if (r6 == 0) goto L_0x0646
            r1 = r6
            com.google.android.gms.internal.ads.zzsd r1 = (com.google.android.gms.internal.ads.zzsd) r1     // Catch:{ CryptoException -> 0x06b5, IllegalStateException -> 0x0667 }
            boolean r1 = r22.zzaU()     // Catch:{ CryptoException -> 0x06b5, IllegalStateException -> 0x0667 }
            if (r1 != 0) goto L_0x035b
            boolean r1 = r15.zzD     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r1 == 0) goto L_0x0254
            boolean r1 = r15.zzW     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r1 == 0) goto L_0x0254
            android.media.MediaCodec$BufferInfo r1 = r15.zzj     // Catch:{ IllegalStateException -> 0x0246, CryptoException -> 0x0013 }
            int r1 = r6.zzb(r1)     // Catch:{ IllegalStateException -> 0x0246, CryptoException -> 0x0013 }
            goto L_0x025a
        L_0x0246:
            r22.zzai()     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            boolean r1 = r15.zzab     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r1 == 0) goto L_0x0250
            r22.zzaG()     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
        L_0x0250:
            r16 = r14
            goto L_0x03b3
        L_0x0254:
            android.media.MediaCodec$BufferInfo r1 = r15.zzj     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            int r1 = r6.zzb(r1)     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
        L_0x025a:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 >= 0) goto L_0x02b9
            r4 = -2
            if (r1 != r4) goto L_0x0290
            r15.zzX = r13     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            com.google.android.gms.internal.ads.zzsd r1 = r15.zzs     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r1 == 0) goto L_0x028f
            r2 = r1
            com.google.android.gms.internal.ads.zzsd r2 = (com.google.android.gms.internal.ads.zzsd) r2     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            android.media.MediaFormat r1 = r1.zzc()     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            int r2 = r15.zzA     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r2 == 0) goto L_0x028a
            java.lang.String r2 = "width"
            int r2 = r1.getInteger(r2)     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            r3 = 32
            if (r2 != r3) goto L_0x028a
            java.lang.String r2 = "height"
            int r2 = r1.getInteger(r2)     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r2 != r3) goto L_0x028a
            r15.zzF = r13     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            goto L_0x022a
        L_0x028a:
            r15.zzu = r1     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            r15.zzv = r13     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            goto L_0x022a
        L_0x028f:
            throw r14     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
        L_0x0290:
            boolean r1 = r15.zzG     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r1 == 0) goto L_0x029f
            boolean r1 = r15.zzaa     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r1 != 0) goto L_0x029c
            int r1 = r15.zzT     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r1 != r11) goto L_0x029f
        L_0x029c:
            r22.zzai()     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
        L_0x029f:
            long r4 = r15.zzH     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x02a6
            goto L_0x0250
        L_0x02a6:
            r1 = 100
            long r4 = r4 + r1
            com.google.android.gms.internal.ads.zzcx r1 = r22.zzi()     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            long r1 = r1.zza()     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 >= 0) goto L_0x0250
            r22.zzai()     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            goto L_0x0250
        L_0x02b9:
            boolean r4 = r15.zzF     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r4 == 0) goto L_0x02c4
            r15.zzF = r12     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            r6.zzo(r1, r12)     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            goto L_0x022a
        L_0x02c4:
            android.media.MediaCodec$BufferInfo r4 = r15.zzj     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            int r4 = r4.size     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r4 != 0) goto L_0x02d7
            android.media.MediaCodec$BufferInfo r4 = r15.zzj     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            int r4 = r4.flags     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            r4 = r4 & 4
            if (r4 == 0) goto L_0x02d7
            r22.zzai()     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            goto L_0x0250
        L_0x02d7:
            r15.zzK = r1     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            java.nio.ByteBuffer r1 = r6.zzg(r1)     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            r15.zzL = r1     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r1 == 0) goto L_0x02f6
            android.media.MediaCodec$BufferInfo r4 = r15.zzj     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            int r4 = r4.offset     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            r1.position(r4)     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            java.nio.ByteBuffer r1 = r15.zzL     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            android.media.MediaCodec$BufferInfo r4 = r15.zzj     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            int r4 = r4.offset     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            android.media.MediaCodec$BufferInfo r5 = r15.zzj     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            int r5 = r5.size     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            int r4 = r4 + r5
            r1.limit(r4)     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
        L_0x02f6:
            android.media.MediaCodec$BufferInfo r1 = r15.zzj     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            long r4 = r1.presentationTimeUs     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            long r7 = r22.zzf()     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x0304
            r1 = 1
            goto L_0x0305
        L_0x0304:
            r1 = 0
        L_0x0305:
            r15.zzM = r1     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            long r4 = r15.zzZ     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x0317
            android.media.MediaCodec$BufferInfo r1 = r15.zzj     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            long r1 = r1.presentationTimeUs     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x0317
            r1 = 1
            goto L_0x0318
        L_0x0317:
            r1 = 0
        L_0x0318:
            r15.zzN = r1     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            android.media.MediaCodec$BufferInfo r1 = r15.zzj     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            long r1 = r1.presentationTimeUs     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            com.google.android.gms.internal.ads.zzsl r3 = r15.zzad     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            com.google.android.gms.internal.ads.zzee r3 = r3.zze     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            java.lang.Object r1 = r3.zzc(r1)     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            com.google.android.gms.internal.ads.zzab r1 = (com.google.android.gms.internal.ads.zzab) r1     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r1 != 0) goto L_0x033c
            boolean r2 = r15.zzaf     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r2 == 0) goto L_0x033c
            android.media.MediaFormat r2 = r15.zzu     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r2 == 0) goto L_0x033c
            com.google.android.gms.internal.ads.zzsl r1 = r15.zzad     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            com.google.android.gms.internal.ads.zzee r1 = r1.zze     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            java.lang.Object r1 = r1.zzb()     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            com.google.android.gms.internal.ads.zzab r1 = (com.google.android.gms.internal.ads.zzab) r1     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
        L_0x033c:
            if (r1 == 0) goto L_0x0341
            r15.zzn = r1     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            goto L_0x0349
        L_0x0341:
            boolean r1 = r15.zzv     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r1 == 0) goto L_0x035b
            com.google.android.gms.internal.ads.zzab r1 = r15.zzn     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r1 == 0) goto L_0x035b
        L_0x0349:
            com.google.android.gms.internal.ads.zzab r1 = r15.zzn     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r1 == 0) goto L_0x035a
            r2 = r1
            com.google.android.gms.internal.ads.zzab r2 = (com.google.android.gms.internal.ads.zzab) r2     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            android.media.MediaFormat r2 = r15.zzu     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            r15.zzan(r1, r2)     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            r15.zzv = r12     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            r15.zzaf = r12     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            goto L_0x035b
        L_0x035a:
            throw r14     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
        L_0x035b:
            boolean r1 = r15.zzD     // Catch:{ CryptoException -> 0x06b5, IllegalStateException -> 0x0667 }
            if (r1 == 0) goto L_0x03c0
            boolean r1 = r15.zzW     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r1 == 0) goto L_0x03c0
            java.nio.ByteBuffer r7 = r15.zzL     // Catch:{ IllegalStateException -> 0x03a5, CryptoException -> 0x039f }
            int r8 = r15.zzK     // Catch:{ IllegalStateException -> 0x03a5, CryptoException -> 0x039f }
            android.media.MediaCodec$BufferInfo r1 = r15.zzj     // Catch:{ IllegalStateException -> 0x03a5, CryptoException -> 0x039f }
            int r9 = r1.flags     // Catch:{ IllegalStateException -> 0x03a5, CryptoException -> 0x039f }
            android.media.MediaCodec$BufferInfo r1 = r15.zzj     // Catch:{ IllegalStateException -> 0x03a5, CryptoException -> 0x039f }
            long r4 = r1.presentationTimeUs     // Catch:{ IllegalStateException -> 0x03a5, CryptoException -> 0x039f }
            boolean r2 = r15.zzM     // Catch:{ IllegalStateException -> 0x03a5, CryptoException -> 0x039f }
            boolean r3 = r15.zzN     // Catch:{ IllegalStateException -> 0x03a5, CryptoException -> 0x039f }
            com.google.android.gms.internal.ads.zzab r1 = r15.zzn     // Catch:{ IllegalStateException -> 0x03a5, CryptoException -> 0x039f }
            if (r1 == 0) goto L_0x039c
            r16 = r1
            com.google.android.gms.internal.ads.zzab r16 = (com.google.android.gms.internal.ads.zzab) r16     // Catch:{ IllegalStateException -> 0x03a5, CryptoException -> 0x039f }
            r16 = 1
            r17 = r1
            r1 = r22
            r18 = r2
            r19 = r3
            r2 = r23
            r20 = r4
            r4 = r25
            r10 = r16
            r11 = r20
            r13 = r18
            r16 = r14
            r14 = r19
            r15 = r17
            boolean r1 = r1.zzar(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch:{ IllegalStateException -> 0x03a7, CryptoException -> 0x039f }
            goto L_0x03eb
        L_0x039c:
            r16 = r14
            throw r16     // Catch:{ IllegalStateException -> 0x03a7, CryptoException -> 0x039f }
        L_0x039f:
            r0 = move-exception
            r2 = 0
            r1 = r22
            goto L_0x06b8
        L_0x03a5:
            r16 = r14
        L_0x03a7:
            r22.zzai()     // Catch:{ CryptoException -> 0x03bb, IllegalStateException -> 0x03b6 }
            r15 = r22
            boolean r1 = r15.zzab     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
            if (r1 == 0) goto L_0x03b3
            r22.zzaG()     // Catch:{ CryptoException -> 0x0013, IllegalStateException -> 0x000c }
        L_0x03b3:
            r1 = r15
            goto L_0x0431
        L_0x03b6:
            r0 = move-exception
            r15 = r22
            goto L_0x000d
        L_0x03bb:
            r0 = move-exception
            r15 = r22
            goto L_0x0014
        L_0x03c0:
            r16 = r14
            java.nio.ByteBuffer r7 = r15.zzL     // Catch:{ CryptoException -> 0x06b5, IllegalStateException -> 0x0667 }
            int r8 = r15.zzK     // Catch:{ CryptoException -> 0x06b5, IllegalStateException -> 0x0667 }
            android.media.MediaCodec$BufferInfo r1 = r15.zzj     // Catch:{ CryptoException -> 0x06b5, IllegalStateException -> 0x0667 }
            int r9 = r1.flags     // Catch:{ CryptoException -> 0x06b5, IllegalStateException -> 0x0667 }
            android.media.MediaCodec$BufferInfo r1 = r15.zzj     // Catch:{ CryptoException -> 0x06b5, IllegalStateException -> 0x0667 }
            long r11 = r1.presentationTimeUs     // Catch:{ CryptoException -> 0x06b5, IllegalStateException -> 0x0667 }
            boolean r13 = r15.zzM     // Catch:{ CryptoException -> 0x06b5, IllegalStateException -> 0x0667 }
            boolean r14 = r15.zzN     // Catch:{ CryptoException -> 0x06b5, IllegalStateException -> 0x0667 }
            com.google.android.gms.internal.ads.zzab r10 = r15.zzn     // Catch:{ CryptoException -> 0x06b5, IllegalStateException -> 0x0667 }
            if (r10 == 0) goto L_0x0642
            r1 = r10
            com.google.android.gms.internal.ads.zzab r1 = (com.google.android.gms.internal.ads.zzab) r1     // Catch:{ CryptoException -> 0x06b5, IllegalStateException -> 0x0667 }
            r17 = 1
            r1 = r22
            r2 = r23
            r4 = r25
            r18 = r10
            r10 = r17
            r15 = r18
            boolean r1 = r1.zzar(r2, r4, r6, r7, r8, r9, r10, r11, r13, r14, r15)     // Catch:{ CryptoException -> 0x039f, IllegalStateException -> 0x063c }
        L_0x03eb:
            if (r1 == 0) goto L_0x042f
            r1 = r22
            android.media.MediaCodec$BufferInfo r2 = r1.zzj     // Catch:{ CryptoException -> 0x042b, IllegalStateException -> 0x0427 }
            long r2 = r2.presentationTimeUs     // Catch:{ CryptoException -> 0x042b, IllegalStateException -> 0x0427 }
            r1.zzaD(r2)     // Catch:{ CryptoException -> 0x042b, IllegalStateException -> 0x0427 }
            android.media.MediaCodec$BufferInfo r2 = r1.zzj     // Catch:{ CryptoException -> 0x042b, IllegalStateException -> 0x0427 }
            int r2 = r2.flags     // Catch:{ CryptoException -> 0x042b, IllegalStateException -> 0x0427 }
            r2 = r2 & 4
            if (r2 == 0) goto L_0x0400
            r14 = 1
            goto L_0x0401
        L_0x0400:
            r14 = 0
        L_0x0401:
            if (r14 != 0) goto L_0x0415
            boolean r2 = r1.zzW     // Catch:{ CryptoException -> 0x042b, IllegalStateException -> 0x0427 }
            if (r2 == 0) goto L_0x0415
            boolean r2 = r1.zzN     // Catch:{ CryptoException -> 0x042b, IllegalStateException -> 0x0427 }
            if (r2 == 0) goto L_0x0415
            com.google.android.gms.internal.ads.zzcx r2 = r22.zzi()     // Catch:{ CryptoException -> 0x042b, IllegalStateException -> 0x0427 }
            long r2 = r2.zza()     // Catch:{ CryptoException -> 0x042b, IllegalStateException -> 0x0427 }
            r1.zzH = r2     // Catch:{ CryptoException -> 0x042b, IllegalStateException -> 0x0427 }
        L_0x0415:
            r22.zzaQ()     // Catch:{ CryptoException -> 0x042b, IllegalStateException -> 0x0427 }
            if (r14 == 0) goto L_0x041e
            r22.zzai()     // Catch:{ CryptoException -> 0x042b, IllegalStateException -> 0x0427 }
            goto L_0x0431
        L_0x041e:
            r15 = r1
            r14 = r16
            r10 = -5
            r11 = 2
            r12 = 0
            r13 = 1
            goto L_0x022a
        L_0x0427:
            r0 = move-exception
            r3 = r0
            goto L_0x000f
        L_0x042b:
            r0 = move-exception
            r3 = r0
            goto L_0x0016
        L_0x042f:
            r1 = r22
        L_0x0431:
            com.google.android.gms.internal.ads.zzsd r4 = r1.zzs     // Catch:{ CryptoException -> 0x0639, IllegalStateException -> 0x0637 }
            if (r4 == 0) goto L_0x0631
            int r2 = r1.zzT     // Catch:{ CryptoException -> 0x0639, IllegalStateException -> 0x0637 }
            r3 = 2
            if (r2 == r3) goto L_0x0631
            boolean r2 = r1.zzaa     // Catch:{ CryptoException -> 0x0639, IllegalStateException -> 0x0637 }
            if (r2 == 0) goto L_0x0440
            goto L_0x0631
        L_0x0440:
            r2 = r4
            com.google.android.gms.internal.ads.zzsd r2 = (com.google.android.gms.internal.ads.zzsd) r2     // Catch:{ CryptoException -> 0x0639, IllegalStateException -> 0x0637 }
            int r2 = r1.zzJ     // Catch:{ CryptoException -> 0x0639, IllegalStateException -> 0x0637 }
            if (r2 >= 0) goto L_0x045c
            int r2 = r4.zza()     // Catch:{ CryptoException -> 0x042b, IllegalStateException -> 0x0427 }
            r1.zzJ = r2     // Catch:{ CryptoException -> 0x042b, IllegalStateException -> 0x0427 }
            if (r2 < 0) goto L_0x0631
            com.google.android.gms.internal.ads.zzhh r5 = r1.zzg     // Catch:{ CryptoException -> 0x042b, IllegalStateException -> 0x0427 }
            java.nio.ByteBuffer r2 = r4.zzf(r2)     // Catch:{ CryptoException -> 0x042b, IllegalStateException -> 0x0427 }
            r5.zzc = r2     // Catch:{ CryptoException -> 0x042b, IllegalStateException -> 0x0427 }
            com.google.android.gms.internal.ads.zzhh r2 = r1.zzg     // Catch:{ CryptoException -> 0x042b, IllegalStateException -> 0x0427 }
            r2.zzb()     // Catch:{ CryptoException -> 0x042b, IllegalStateException -> 0x0427 }
        L_0x045c:
            int r2 = r1.zzT     // Catch:{ CryptoException -> 0x0639, IllegalStateException -> 0x0637 }
            r11 = 1
            if (r2 != r11) goto L_0x047e
            boolean r2 = r1.zzG     // Catch:{ CryptoException -> 0x042b, IllegalStateException -> 0x0479 }
            if (r2 != 0) goto L_0x0474
            r1.zzW = r11     // Catch:{ CryptoException -> 0x042b, IllegalStateException -> 0x0479 }
            int r5 = r1.zzJ     // Catch:{ CryptoException -> 0x042b, IllegalStateException -> 0x0479 }
            r8 = 0
            r10 = 4
            r6 = 0
            r7 = 0
            r4.zzk(r5, r6, r7, r8, r10)     // Catch:{ CryptoException -> 0x042b, IllegalStateException -> 0x0479 }
            r22.zzao()     // Catch:{ CryptoException -> 0x042b, IllegalStateException -> 0x0479 }
        L_0x0474:
            r1.zzT = r3     // Catch:{ CryptoException -> 0x042b, IllegalStateException -> 0x0479 }
            r2 = 0
            goto L_0x0633
        L_0x0479:
            r0 = move-exception
            r3 = r0
            r2 = 0
            goto L_0x066c
        L_0x047e:
            boolean r2 = r1.zzE     // Catch:{ CryptoException -> 0x0639, IllegalStateException -> 0x062e }
            if (r2 == 0) goto L_0x04a5
            r2 = 0
            r1.zzE = r2     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            com.google.android.gms.internal.ads.zzhh r5 = r1.zzg     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            java.nio.ByteBuffer r5 = r5.zzc     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            if (r5 == 0) goto L_0x04a4
            r6 = r5
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            byte[] r6 = zzb     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            r5.put(r6)     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            int r5 = r1.zzJ     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            r8 = 0
            r10 = 0
            r6 = 0
            r7 = 38
            r4.zzk(r5, r6, r7, r8, r10)     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            r22.zzao()     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            r1.zzV = r11     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            goto L_0x0431
        L_0x04a4:
            throw r16     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
        L_0x04a5:
            r2 = 0
            int r5 = r1.zzS     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            if (r5 != r11) goto L_0x04d8
            r14 = 0
        L_0x04ab:
            com.google.android.gms.internal.ads.zzab r5 = r1.zzt     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            if (r5 == 0) goto L_0x04d7
            r6 = r5
            com.google.android.gms.internal.ads.zzab r6 = (com.google.android.gms.internal.ads.zzab) r6     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            java.util.List r5 = r5.zzr     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            int r5 = r5.size()     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            if (r14 >= r5) goto L_0x04d4
            com.google.android.gms.internal.ads.zzab r5 = r1.zzt     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            java.util.List r5 = r5.zzr     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            java.lang.Object r5 = r5.get(r14)     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            byte[] r5 = (byte[]) r5     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            com.google.android.gms.internal.ads.zzhh r6 = r1.zzg     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            java.nio.ByteBuffer r6 = r6.zzc     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            if (r6 == 0) goto L_0x04d3
            r7 = r6
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            r6.put(r5)     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            int r14 = r14 + 1
            goto L_0x04ab
        L_0x04d3:
            throw r16     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
        L_0x04d4:
            r1.zzS = r3     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            goto L_0x04d8
        L_0x04d7:
            throw r16     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
        L_0x04d8:
            com.google.android.gms.internal.ads.zzhh r5 = r1.zzg     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            java.nio.ByteBuffer r5 = r5.zzc     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            if (r5 == 0) goto L_0x062d
            r6 = r5
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            int r5 = r5.position()     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            com.google.android.gms.internal.ads.zzke r6 = r22.zzk()     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            com.google.android.gms.internal.ads.zzhh r7 = r1.zzg     // Catch:{ zzhg -> 0x061f }
            int r7 = r1.zzcU(r6, r7, r2)     // Catch:{ zzhg -> 0x061f }
            r8 = -3
            if (r7 != r8) goto L_0x04fe
            boolean r3 = r22.zzQ()     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            if (r3 == 0) goto L_0x0633
            long r3 = r1.zzY     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            r1.zzZ = r3     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            goto L_0x0633
        L_0x04fe:
            r12 = -5
            if (r7 != r12) goto L_0x0511
            int r4 = r1.zzS     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            if (r4 != r3) goto L_0x050c
            com.google.android.gms.internal.ads.zzhh r4 = r1.zzg     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            r4.zzb()     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            r1.zzS = r11     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
        L_0x050c:
            r1.zzac(r6)     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            goto L_0x0431
        L_0x0511:
            com.google.android.gms.internal.ads.zzhh r6 = r1.zzg     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            boolean r7 = r6.zzf()     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            if (r7 == 0) goto L_0x0546
            long r7 = r1.zzY     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            r1.zzZ = r7     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            int r5 = r1.zzS     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            if (r5 != r3) goto L_0x0526
            r6.zzb()     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            r1.zzS = r11     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
        L_0x0526:
            r1.zzaa = r11     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            boolean r3 = r1.zzV     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            if (r3 != 0) goto L_0x0531
            r22.zzai()     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            goto L_0x0633
        L_0x0531:
            boolean r3 = r1.zzG     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            if (r3 != 0) goto L_0x0633
            r1.zzW = r11     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            int r5 = r1.zzJ     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            r8 = 0
            r10 = 4
            r6 = 0
            r7 = 0
            r4.zzk(r5, r6, r7, r8, r10)     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            r22.zzao()     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            goto L_0x0633
        L_0x0546:
            boolean r7 = r1.zzV     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            if (r7 != 0) goto L_0x055b
            boolean r7 = r6.zzg()     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            if (r7 != 0) goto L_0x055b
            r6.zzb()     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            int r4 = r1.zzS     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            if (r4 != r3) goto L_0x0431
            r1.zzS = r11     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            goto L_0x0431
        L_0x055b:
            boolean r6 = r1.zzaO(r6)     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            if (r6 == 0) goto L_0x056f
            com.google.android.gms.internal.ads.zzhh r4 = r1.zzg     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            r4.zzb()     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            com.google.android.gms.internal.ads.zzhs r4 = r1.zza     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            int r5 = r4.zzd     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            int r5 = r5 + r11
            r4.zzd = r5     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            goto L_0x0431
        L_0x056f:
            com.google.android.gms.internal.ads.zzhh r6 = r1.zzg     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            boolean r7 = r6.zzl()     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            if (r7 == 0) goto L_0x057c
            com.google.android.gms.internal.ads.zzhe r6 = r6.zzb     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            r6.zzb(r5)     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
        L_0x057c:
            com.google.android.gms.internal.ads.zzhh r5 = r1.zzg     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            long r8 = r5.zze     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            boolean r5 = r1.zzac     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            if (r5 == 0) goto L_0x05b4
            java.util.ArrayDeque r5 = r1.zzk     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            boolean r5 = r5.isEmpty()     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            if (r5 != 0) goto L_0x05a2
            java.util.ArrayDeque r5 = r1.zzk     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            java.lang.Object r5 = r5.peekLast()     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            com.google.android.gms.internal.ads.zzsl r5 = (com.google.android.gms.internal.ads.zzsl) r5     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            com.google.android.gms.internal.ads.zzee r5 = r5.zze     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            com.google.android.gms.internal.ads.zzab r6 = r1.zzm     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            if (r6 == 0) goto L_0x05a1
            r10 = r6
            com.google.android.gms.internal.ads.zzab r10 = (com.google.android.gms.internal.ads.zzab) r10     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            r5.zzd(r8, r6)     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            goto L_0x05b0
        L_0x05a1:
            throw r16     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
        L_0x05a2:
            com.google.android.gms.internal.ads.zzsl r5 = r1.zzad     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            com.google.android.gms.internal.ads.zzee r5 = r5.zze     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            com.google.android.gms.internal.ads.zzab r6 = r1.zzm     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            if (r6 == 0) goto L_0x05b3
            r10 = r6
            com.google.android.gms.internal.ads.zzab r10 = (com.google.android.gms.internal.ads.zzab) r10     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            r5.zzd(r8, r6)     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
        L_0x05b0:
            r1.zzac = r2     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            goto L_0x05b4
        L_0x05b3:
            throw r16     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
        L_0x05b4:
            long r5 = r1.zzY     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            long r5 = java.lang.Math.max(r5, r8)     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            r1.zzY = r5     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            boolean r10 = r22.zzQ()     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            if (r10 != 0) goto L_0x05ca
            com.google.android.gms.internal.ads.zzhh r10 = r1.zzg     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            boolean r10 = r10.zzh()     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            if (r10 == 0) goto L_0x05cc
        L_0x05ca:
            r1.zzZ = r5     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
        L_0x05cc:
            com.google.android.gms.internal.ads.zzhh r5 = r1.zzg     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            r5.zzk()     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            com.google.android.gms.internal.ads.zzhh r5 = r1.zzg     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            boolean r6 = r5.zze()     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            if (r6 == 0) goto L_0x05dc
            r1.zzaj(r5)     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
        L_0x05dc:
            com.google.android.gms.internal.ads.zzhh r5 = r1.zzg     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            r1.zzaE(r5)     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            com.google.android.gms.internal.ads.zzhh r5 = r1.zzg     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            r1.zzau(r5)     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            if (r7 == 0) goto L_0x05f7
            r5 = r4
            com.google.android.gms.internal.ads.zzsd r5 = (com.google.android.gms.internal.ads.zzsd) r5     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            int r5 = r1.zzJ     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            com.google.android.gms.internal.ads.zzhh r6 = r1.zzg     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            com.google.android.gms.internal.ads.zzhe r7 = r6.zzb     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            r10 = 0
            r6 = 0
            r4.zzl(r5, r6, r7, r8, r10)     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            goto L_0x060e
        L_0x05f7:
            r5 = r4
            com.google.android.gms.internal.ads.zzsd r5 = (com.google.android.gms.internal.ads.zzsd) r5     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            int r5 = r1.zzJ     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            com.google.android.gms.internal.ads.zzhh r6 = r1.zzg     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            java.nio.ByteBuffer r6 = r6.zzc     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            if (r6 == 0) goto L_0x061e
            r7 = r6
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            int r7 = r6.limit()     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            r10 = 0
            r6 = 0
            r4.zzk(r5, r6, r7, r8, r10)     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
        L_0x060e:
            r22.zzao()     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            r1.zzV = r11     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            r1.zzS = r2     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            com.google.android.gms.internal.ads.zzhs r4 = r1.zza     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            int r5 = r4.zzc     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            int r5 = r5 + r11
            r4.zzc = r5     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            goto L_0x0431
        L_0x061e:
            throw r16     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
        L_0x061f:
            r0 = move-exception
            r12 = -5
            r4 = r0
            r1.zzak(r4)     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            r1.zzaW(r2)     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            r22.zzah()     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            goto L_0x0431
        L_0x062d:
            throw r16     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
        L_0x062e:
            r0 = move-exception
            r2 = 0
            goto L_0x066b
        L_0x0631:
            r2 = 0
            r11 = 1
        L_0x0633:
            android.os.Trace.endSection()     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            goto L_0x065d
        L_0x0637:
            r0 = move-exception
            goto L_0x0669
        L_0x0639:
            r0 = move-exception
            goto L_0x06b7
        L_0x063c:
            r0 = move-exception
            r2 = 0
            r11 = 1
            r1 = r22
            goto L_0x066b
        L_0x0642:
            r1 = r15
            r2 = 0
            r11 = 1
            throw r16     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
        L_0x0646:
            r16 = r14
            r1 = r15
            r2 = 0
            r11 = 1
            throw r16     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
        L_0x064c:
            r1 = r15
            r2 = 0
            r11 = 1
            com.google.android.gms.internal.ads.zzhs r3 = r1.zza     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            int r4 = r3.zzd     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            int r5 = r22.zzd(r23)     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            int r4 = r4 + r5
            r3.zzd = r4     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            r1.zzaW(r11)     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
        L_0x065d:
            com.google.android.gms.internal.ads.zzhs r3 = r1.zza     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            r3.zza()     // Catch:{ CryptoException -> 0x0665, IllegalStateException -> 0x0663 }
            return
        L_0x0663:
            r0 = move-exception
            goto L_0x066b
        L_0x0665:
            r0 = move-exception
            goto L_0x06b8
        L_0x0667:
            r0 = move-exception
            r1 = r15
        L_0x0669:
            r2 = 0
            r11 = 1
        L_0x066b:
            r3 = r0
        L_0x066c:
            boolean r4 = r3 instanceof android.media.MediaCodec.CodecException
            if (r4 == 0) goto L_0x0671
            goto L_0x0686
        L_0x0671:
            java.lang.StackTraceElement[] r5 = r3.getStackTrace()
            int r6 = r5.length
            if (r6 <= 0) goto L_0x06b4
            r5 = r5[r2]
            java.lang.String r5 = r5.getClassName()
            java.lang.String r6 = "android.media.MediaCodec"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x06b4
        L_0x0686:
            r1.zzak(r3)
            if (r4 == 0) goto L_0x0696
            r4 = r3
            android.media.MediaCodec$CodecException r4 = (android.media.MediaCodec.CodecException) r4
            boolean r4 = r4.isRecoverable()
            if (r4 == 0) goto L_0x0696
            r14 = 1
            goto L_0x0697
        L_0x0696:
            r14 = 0
        L_0x0697:
            if (r14 == 0) goto L_0x069c
            r22.zzaG()
        L_0x069c:
            com.google.android.gms.internal.ads.zzsg r2 = r1.zzz
            com.google.android.gms.internal.ads.zzsf r2 = r1.zzaA(r3, r2)
            int r3 = r2.zzb
            r4 = 1101(0x44d, float:1.543E-42)
            if (r3 != r4) goto L_0x06ab
            r3 = 4006(0xfa6, float:5.614E-42)
            goto L_0x06ad
        L_0x06ab:
            r3 = 4003(0xfa3, float:5.61E-42)
        L_0x06ad:
            com.google.android.gms.internal.ads.zzab r4 = r1.zzm
            com.google.android.gms.internal.ads.zzib r2 = r1.zzcW(r2, r4, r14, r3)
            throw r2
        L_0x06b4:
            throw r3
        L_0x06b5:
            r0 = move-exception
            r1 = r15
        L_0x06b7:
            r2 = 0
        L_0x06b8:
            r3 = r0
        L_0x06b9:
            com.google.android.gms.internal.ads.zzab r4 = r1.zzm
            int r5 = r3.getErrorCode()
            int r5 = com.google.android.gms.internal.ads.zzei.zzl(r5)
            com.google.android.gms.internal.ads.zzib r2 = r1.zzcW(r3, r4, r2, r5)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsn.zzV(long, long):void");
    }

    public boolean zzW() {
        return this.zzab;
    }

    public boolean zzX() {
        if (this.zzm == null) {
            return false;
        }
        if (zzS() || zzaU()) {
            return true;
        }
        return this.zzI != -9223372036854775807L && zzi().zzb() < this.zzI;
    }

    public final int zzY(zzab zzab2) throws zzib {
        try {
            return zzaa(this.zzd, zzab2);
        } catch (zzsu e) {
            throw zzcW(e, zzab2, false, 4002);
        }
    }

    /* access modifiers changed from: protected */
    public float zzZ(float f, zzab zzab2, zzab[] zzabArr) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public zzsf zzaA(Throwable th, zzsg zzsg) {
        return new zzsf(th, zzsg);
    }

    /* access modifiers changed from: protected */
    public final zzsg zzaB() {
        return this.zzz;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: com.google.android.gms.internal.ads.zzsg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v33, resolved type: com.google.android.gms.internal.ads.zzab} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v51, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v53, resolved type: com.google.android.gms.internal.ads.zzab} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v60, resolved type: com.google.android.gms.internal.ads.zzab} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v64, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v69, resolved type: com.google.android.gms.internal.ads.zzab} */
    /* JADX WARNING: type inference failed for: r14v0 */
    /* JADX WARNING: type inference failed for: r14v1, types: [com.google.android.gms.internal.ads.zzsm, android.media.MediaCrypto] */
    /* JADX WARNING: type inference failed for: r14v2 */
    /* JADX WARNING: type inference failed for: r13v34, types: [java.lang.Object, java.lang.String] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x04e6 A[Catch:{ Exception -> 0x051b }] */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x0558 A[Catch:{ zzsj -> 0x0592 }] */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x055b A[Catch:{ zzsj -> 0x0592 }] */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x0567 A[Catch:{ zzsj -> 0x0592 }] */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x0517 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x056f A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzaC() throws com.google.android.gms.internal.ads.zzib {
        /*
            r23 = this;
            r8 = r23
            java.lang.String r9 = "MediaCodecRenderer"
            com.google.android.gms.internal.ads.zzsd r0 = r8.zzs
            if (r0 != 0) goto L_0x05a1
            boolean r0 = r8.zzO
            if (r0 != 0) goto L_0x05a1
            com.google.android.gms.internal.ads.zzab r10 = r8.zzm
            if (r10 != 0) goto L_0x0012
            goto L_0x05a1
        L_0x0012:
            boolean r0 = r8.zzaM(r10)
            r11 = 1
            if (r0 == 0) goto L_0x0046
            r23.zzad()
            java.lang.String r0 = r10.zzo
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x003c
            java.lang.String r1 = "audio/mpeg"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x003c
            java.lang.String r1 = "audio/opus"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x003c
            com.google.android.gms.internal.ads.zzru r0 = r8.zzi
            r0.zzo(r11)
            goto L_0x0043
        L_0x003c:
            com.google.android.gms.internal.ads.zzru r0 = r8.zzi
            r1 = 32
            r0.zzo(r1)
        L_0x0043:
            r8.zzO = r11
            return
        L_0x0046:
            com.google.android.gms.internal.ads.zzrg r0 = r8.zzah
            r8.zzag = r0
            if (r0 == 0) goto L_0x0056
            com.google.android.gms.internal.ads.zzcw.zzf(r11)
            com.google.android.gms.internal.ads.zzrg r0 = r8.zzag
            boolean r1 = com.google.android.gms.internal.ads.zzrh.zza
            r0.zza()
        L_0x0056:
            r12 = 0
            com.google.android.gms.internal.ads.zzab r13 = r8.zzm     // Catch:{ zzsj -> 0x0594 }
            r14 = 0
            if (r13 == 0) goto L_0x058e
            r0 = r13
            com.google.android.gms.internal.ads.zzab r0 = (com.google.android.gms.internal.ads.zzab) r0     // Catch:{ zzsj -> 0x0594 }
            java.util.ArrayDeque r0 = r8.zzx     // Catch:{ zzsj -> 0x0594 }
            if (r0 != 0) goto L_0x0091
            com.google.android.gms.internal.ads.zzsp r0 = r8.zzd     // Catch:{ zzsu -> 0x0087 }
            java.util.List r0 = r8.zzag(r0, r13, r12)     // Catch:{ zzsu -> 0x0087 }
            r0.isEmpty()     // Catch:{ zzsu -> 0x0087 }
            java.util.ArrayDeque r1 = new java.util.ArrayDeque     // Catch:{ zzsu -> 0x0087 }
            r1.<init>()     // Catch:{ zzsu -> 0x0087 }
            r8.zzx = r1     // Catch:{ zzsu -> 0x0087 }
            boolean r1 = r0.isEmpty()     // Catch:{ zzsu -> 0x0087 }
            if (r1 != 0) goto L_0x0084
            java.util.ArrayDeque r1 = r8.zzx     // Catch:{ zzsu -> 0x0087 }
            java.lang.Object r0 = r0.get(r12)     // Catch:{ zzsu -> 0x0087 }
            com.google.android.gms.internal.ads.zzsg r0 = (com.google.android.gms.internal.ads.zzsg) r0     // Catch:{ zzsu -> 0x0087 }
            r1.add(r0)     // Catch:{ zzsu -> 0x0087 }
        L_0x0084:
            r8.zzy = r14     // Catch:{ zzsu -> 0x0087 }
            goto L_0x0091
        L_0x0087:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzsj r1 = new com.google.android.gms.internal.ads.zzsj     // Catch:{ zzsj -> 0x0594 }
            r2 = -49998(0xffffffffffff3cb2, float:NaN)
            r1.<init>((com.google.android.gms.internal.ads.zzab) r13, (java.lang.Throwable) r0, (boolean) r12, (int) r2)     // Catch:{ zzsj -> 0x0594 }
            throw r1     // Catch:{ zzsj -> 0x0594 }
        L_0x0091:
            java.util.ArrayDeque r0 = r8.zzx     // Catch:{ zzsj -> 0x0594 }
            boolean r0 = r0.isEmpty()     // Catch:{ zzsj -> 0x0594 }
            if (r0 != 0) goto L_0x0580
            java.util.ArrayDeque r15 = r8.zzx     // Catch:{ zzsj -> 0x0594 }
            if (r15 == 0) goto L_0x057c
            r0 = r15
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch:{ zzsj -> 0x0594 }
        L_0x00a0:
            com.google.android.gms.internal.ads.zzsd r0 = r8.zzs     // Catch:{ zzsj -> 0x0594 }
            if (r0 != 0) goto L_0x0576
            java.lang.Object r0 = r15.peekFirst()     // Catch:{ zzsj -> 0x0594 }
            r6 = r0
            com.google.android.gms.internal.ads.zzsg r6 = (com.google.android.gms.internal.ads.zzsg) r6     // Catch:{ zzsj -> 0x0594 }
            if (r6 == 0) goto L_0x0572
            r0 = r6
            com.google.android.gms.internal.ads.zzsg r0 = (com.google.android.gms.internal.ads.zzsg) r0     // Catch:{ zzsj -> 0x0594 }
            boolean r0 = r8.zzaN(r6)     // Catch:{ zzsj -> 0x0594 }
            if (r0 == 0) goto L_0x05a1
            com.google.android.gms.internal.ads.zzab r0 = r8.zzm     // Catch:{ Exception -> 0x0534 }
            if (r0 == 0) goto L_0x052a
            r1 = r0
            com.google.android.gms.internal.ads.zzab r1 = (com.google.android.gms.internal.ads.zzab) r1     // Catch:{ Exception -> 0x0534 }
            java.lang.String r2 = r6.zza     // Catch:{ Exception -> 0x0534 }
            int r1 = com.google.android.gms.internal.ads.zzei.zza     // Catch:{ Exception -> 0x0534 }
            r3 = 23
            if (r1 >= r3) goto L_0x00c8
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x00d2
        L_0x00c8:
            float r1 = r8.zzr     // Catch:{ Exception -> 0x0534 }
            com.google.android.gms.internal.ads.zzab[] r5 = r23.zzT()     // Catch:{ Exception -> 0x0534 }
            float r1 = r8.zzZ(r1, r0, r5)     // Catch:{ Exception -> 0x0534 }
        L_0x00d2:
            float r5 = r8.zze     // Catch:{ Exception -> 0x0534 }
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x00da
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x00da:
            r8.zzaF(r0)     // Catch:{ Exception -> 0x0534 }
            com.google.android.gms.internal.ads.zzcx r5 = r23.zzi()     // Catch:{ Exception -> 0x0534 }
            long r16 = r5.zzb()     // Catch:{ Exception -> 0x0534 }
            com.google.android.gms.internal.ads.zzsa r5 = r8.zzaf(r6, r0, r14, r1)     // Catch:{ Exception -> 0x0534 }
            int r7 = com.google.android.gms.internal.ads.zzei.zza     // Catch:{ Exception -> 0x0534 }
            r3 = 31
            if (r7 < r3) goto L_0x010c
            com.google.android.gms.internal.ads.zzog r3 = r23.zzo()     // Catch:{ Exception -> 0x0534 }
            android.media.metrics.LogSessionId r3 = r3.zza()     // Catch:{ Exception -> 0x0534 }
            android.media.metrics.LogSessionId r7 = androidx.work.impl.utils.ProcessUtils$$ExternalSyntheticApiModelOutline0.m()     // Catch:{ Exception -> 0x0534 }
            boolean r7 = r3.equals(r7)     // Catch:{ Exception -> 0x0534 }
            if (r7 != 0) goto L_0x010c
            android.media.MediaFormat r7 = r5.zzb     // Catch:{ Exception -> 0x0534 }
            java.lang.String r11 = "log-session-id"
            java.lang.String r3 = r3.getStringId()     // Catch:{ Exception -> 0x0534 }
            r7.setString(r11, r3)     // Catch:{ Exception -> 0x0534 }
        L_0x010c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x051f }
            r3.<init>()     // Catch:{ all -> 0x051f }
            java.lang.String r7 = "createCodec:"
            r3.append(r7)     // Catch:{ all -> 0x051f }
            r3.append(r2)     // Catch:{ all -> 0x051f }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x051f }
            android.os.Trace.beginSection(r3)     // Catch:{ all -> 0x051f }
            com.google.android.gms.internal.ads.zzsb r3 = r8.zzc     // Catch:{ all -> 0x051f }
            com.google.android.gms.internal.ads.zzsd r3 = r3.zzd(r5)     // Catch:{ all -> 0x051f }
            r8.zzs = r3     // Catch:{ all -> 0x051f }
            com.google.android.gms.internal.ads.zzsk r7 = new com.google.android.gms.internal.ads.zzsk     // Catch:{ all -> 0x051f }
            r7.<init>(r8, r14)     // Catch:{ all -> 0x051f }
            r3.zzs(r7)     // Catch:{ all -> 0x051f }
            android.os.Trace.endSection()     // Catch:{ Exception -> 0x0534 }
            com.google.android.gms.internal.ads.zzcx r3 = r23.zzi()     // Catch:{ Exception -> 0x0534 }
            long r18 = r3.zzb()     // Catch:{ Exception -> 0x0534 }
            boolean r3 = r6.zze(r0)     // Catch:{ Exception -> 0x0534 }
            if (r3 != 0) goto L_0x03c3
            java.lang.String r3 = "Format exceeds selected codec's capabilities [%s, %s]"
            java.lang.String r11 = ","
            r20 = r11
            java.lang.String r20 = (java.lang.String) r20     // Catch:{ Exception -> 0x03bc }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03bc }
            r14.<init>()     // Catch:{ Exception -> 0x03bc }
            java.lang.String r12 = "id="
            r14.append(r12)     // Catch:{ Exception -> 0x03bc }
            java.lang.String r12 = r0.zza     // Catch:{ Exception -> 0x03bc }
            r14.append(r12)     // Catch:{ Exception -> 0x03bc }
            java.lang.String r12 = ", mimeType="
            r14.append(r12)     // Catch:{ Exception -> 0x03bc }
            java.lang.String r12 = r0.zzo     // Catch:{ Exception -> 0x03bc }
            r14.append(r12)     // Catch:{ Exception -> 0x03bc }
            java.lang.String r12 = r0.zzn     // Catch:{ Exception -> 0x03bc }
            if (r12 == 0) goto L_0x0170
            java.lang.String r12 = ", container="
            r14.append(r12)     // Catch:{ Exception -> 0x0534 }
            java.lang.String r12 = r0.zzn     // Catch:{ Exception -> 0x0534 }
            r14.append(r12)     // Catch:{ Exception -> 0x0534 }
        L_0x0170:
            int r12 = r0.zzj     // Catch:{ Exception -> 0x03bc }
            r7 = -1
            if (r12 == r7) goto L_0x017f
            java.lang.String r12 = ", bitrate="
            r14.append(r12)     // Catch:{ Exception -> 0x0534 }
            int r12 = r0.zzj     // Catch:{ Exception -> 0x0534 }
            r14.append(r12)     // Catch:{ Exception -> 0x0534 }
        L_0x017f:
            java.lang.String r12 = r0.zzk     // Catch:{ Exception -> 0x03bc }
            if (r12 == 0) goto L_0x018d
            java.lang.String r12 = ", codecs="
            r14.append(r12)     // Catch:{ Exception -> 0x0534 }
            java.lang.String r12 = r0.zzk     // Catch:{ Exception -> 0x0534 }
            r14.append(r12)     // Catch:{ Exception -> 0x0534 }
        L_0x018d:
            com.google.android.gms.internal.ads.zzu r12 = r0.zzs     // Catch:{ Exception -> 0x03bc }
            if (r12 == 0) goto L_0x0229
            java.util.LinkedHashSet r12 = new java.util.LinkedHashSet     // Catch:{ Exception -> 0x03bc }
            r12.<init>()     // Catch:{ Exception -> 0x03bc }
            r4 = 0
        L_0x0197:
            com.google.android.gms.internal.ads.zzu r7 = r0.zzs     // Catch:{ Exception -> 0x03bc }
            r21 = r10
            int r10 = r7.zzb     // Catch:{ Exception -> 0x0226 }
            if (r4 >= r10) goto L_0x0216
            com.google.android.gms.internal.ads.zzt r7 = r7.zza(r4)     // Catch:{ Exception -> 0x0226 }
            java.util.UUID r7 = r7.zza     // Catch:{ Exception -> 0x0226 }
            java.util.UUID r10 = com.google.android.gms.internal.ads.zzh.zzb     // Catch:{ Exception -> 0x0226 }
            boolean r10 = r7.equals(r10)     // Catch:{ Exception -> 0x0226 }
            if (r10 == 0) goto L_0x01b8
            java.lang.String r7 = "cenc"
            r12.add(r7)     // Catch:{ Exception -> 0x01b5 }
        L_0x01b2:
            r22 = r13
            goto L_0x020f
        L_0x01b5:
            r0 = move-exception
            goto L_0x0537
        L_0x01b8:
            java.util.UUID r10 = com.google.android.gms.internal.ads.zzh.zzc     // Catch:{ Exception -> 0x0226 }
            boolean r10 = r7.equals(r10)     // Catch:{ Exception -> 0x0226 }
            if (r10 == 0) goto L_0x01c6
            java.lang.String r7 = "clearkey"
            r12.add(r7)     // Catch:{ Exception -> 0x01b5 }
            goto L_0x01b2
        L_0x01c6:
            java.util.UUID r10 = com.google.android.gms.internal.ads.zzh.zze     // Catch:{ Exception -> 0x0226 }
            boolean r10 = r7.equals(r10)     // Catch:{ Exception -> 0x0226 }
            if (r10 == 0) goto L_0x01d4
            java.lang.String r7 = "playready"
            r12.add(r7)     // Catch:{ Exception -> 0x01b5 }
            goto L_0x01b2
        L_0x01d4:
            java.util.UUID r10 = com.google.android.gms.internal.ads.zzh.zzd     // Catch:{ Exception -> 0x0226 }
            boolean r10 = r7.equals(r10)     // Catch:{ Exception -> 0x0226 }
            if (r10 == 0) goto L_0x01e2
            java.lang.String r7 = "widevine"
            r12.add(r7)     // Catch:{ Exception -> 0x01b5 }
            goto L_0x01b2
        L_0x01e2:
            java.util.UUID r10 = com.google.android.gms.internal.ads.zzh.zza     // Catch:{ Exception -> 0x0226 }
            boolean r10 = r7.equals(r10)     // Catch:{ Exception -> 0x0226 }
            if (r10 == 0) goto L_0x01f0
            java.lang.String r7 = "universal"
            r12.add(r7)     // Catch:{ Exception -> 0x01b5 }
            goto L_0x01b2
        L_0x01f0:
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0226 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0226 }
            r10.<init>()     // Catch:{ Exception -> 0x0226 }
            r22 = r13
            java.lang.String r13 = "unknown ("
            r10.append(r13)     // Catch:{ Exception -> 0x051b }
            r10.append(r7)     // Catch:{ Exception -> 0x051b }
            java.lang.String r7 = ")"
            r10.append(r7)     // Catch:{ Exception -> 0x051b }
            java.lang.String r7 = r10.toString()     // Catch:{ Exception -> 0x051b }
            r12.add(r7)     // Catch:{ Exception -> 0x051b }
        L_0x020f:
            int r4 = r4 + 1
            r10 = r21
            r13 = r22
            goto L_0x0197
        L_0x0216:
            r22 = r13
            java.lang.String r4 = ", drm=["
            r14.append(r4)     // Catch:{ Exception -> 0x051b }
            com.google.android.gms.internal.ads.zzfuf.zzb(r14, r12, r11)     // Catch:{ Exception -> 0x051b }
            r4 = 93
            r14.append(r4)     // Catch:{ Exception -> 0x051b }
            goto L_0x022d
        L_0x0226:
            r0 = move-exception
            goto L_0x03bf
        L_0x0229:
            r21 = r10
            r22 = r13
        L_0x022d:
            int r4 = r0.zzv     // Catch:{ Exception -> 0x051b }
            r7 = -1
            if (r4 == r7) goto L_0x024a
            int r4 = r0.zzw     // Catch:{ Exception -> 0x051b }
            if (r4 == r7) goto L_0x024a
            java.lang.String r4 = ", res="
            r14.append(r4)     // Catch:{ Exception -> 0x051b }
            int r4 = r0.zzv     // Catch:{ Exception -> 0x051b }
            r14.append(r4)     // Catch:{ Exception -> 0x051b }
            java.lang.String r4 = "x"
            r14.append(r4)     // Catch:{ Exception -> 0x051b }
            int r4 = r0.zzw     // Catch:{ Exception -> 0x051b }
            r14.append(r4)     // Catch:{ Exception -> 0x051b }
        L_0x024a:
            com.google.android.gms.internal.ads.zzk r4 = r0.zzC     // Catch:{ Exception -> 0x051b }
            if (r4 == 0) goto L_0x0268
            boolean r7 = r4.zze()     // Catch:{ Exception -> 0x051b }
            if (r7 != 0) goto L_0x025a
            boolean r4 = r4.zzf()     // Catch:{ Exception -> 0x051b }
            if (r4 == 0) goto L_0x0268
        L_0x025a:
            java.lang.String r4 = ", color="
            r14.append(r4)     // Catch:{ Exception -> 0x051b }
            com.google.android.gms.internal.ads.zzk r4 = r0.zzC     // Catch:{ Exception -> 0x051b }
            java.lang.String r4 = r4.zzd()     // Catch:{ Exception -> 0x051b }
            r14.append(r4)     // Catch:{ Exception -> 0x051b }
        L_0x0268:
            float r4 = r0.zzx     // Catch:{ Exception -> 0x051b }
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x027a
            java.lang.String r4 = ", fps="
            r14.append(r4)     // Catch:{ Exception -> 0x051b }
            float r4 = r0.zzx     // Catch:{ Exception -> 0x051b }
            r14.append(r4)     // Catch:{ Exception -> 0x051b }
        L_0x027a:
            int r4 = r0.zzD     // Catch:{ Exception -> 0x051b }
            r7 = -1
            if (r4 == r7) goto L_0x0289
            java.lang.String r4 = ", channels="
            r14.append(r4)     // Catch:{ Exception -> 0x051b }
            int r4 = r0.zzD     // Catch:{ Exception -> 0x051b }
            r14.append(r4)     // Catch:{ Exception -> 0x051b }
        L_0x0289:
            int r4 = r0.zzE     // Catch:{ Exception -> 0x051b }
            r7 = -1
            if (r4 == r7) goto L_0x0298
            java.lang.String r4 = ", sample_rate="
            r14.append(r4)     // Catch:{ Exception -> 0x051b }
            int r4 = r0.zzE     // Catch:{ Exception -> 0x051b }
            r14.append(r4)     // Catch:{ Exception -> 0x051b }
        L_0x0298:
            java.lang.String r4 = r0.zzd     // Catch:{ Exception -> 0x051b }
            if (r4 == 0) goto L_0x02a6
            java.lang.String r4 = ", language="
            r14.append(r4)     // Catch:{ Exception -> 0x051b }
            java.lang.String r4 = r0.zzd     // Catch:{ Exception -> 0x051b }
            r14.append(r4)     // Catch:{ Exception -> 0x051b }
        L_0x02a6:
            java.util.List r4 = r0.zzc     // Catch:{ Exception -> 0x051b }
            boolean r4 = r4.isEmpty()     // Catch:{ Exception -> 0x051b }
            java.lang.String r7 = "]"
            if (r4 != 0) goto L_0x02c6
            java.lang.String r4 = ", labels=["
            r14.append(r4)     // Catch:{ Exception -> 0x051b }
            java.util.List r4 = r0.zzc     // Catch:{ Exception -> 0x051b }
            com.google.android.gms.internal.ads.zzy r10 = new com.google.android.gms.internal.ads.zzy     // Catch:{ Exception -> 0x051b }
            r10.<init>()     // Catch:{ Exception -> 0x051b }
            java.util.List r4 = com.google.android.gms.internal.ads.zzfyd.zzb(r4, r10)     // Catch:{ Exception -> 0x051b }
            com.google.android.gms.internal.ads.zzfuf.zzb(r14, r4, r11)     // Catch:{ Exception -> 0x051b }
            r14.append(r7)     // Catch:{ Exception -> 0x051b }
        L_0x02c6:
            int r4 = r0.zze     // Catch:{ Exception -> 0x051b }
            if (r4 == 0) goto L_0x02ee
            java.lang.String r4 = ", selectionFlags=["
            r14.append(r4)     // Catch:{ Exception -> 0x051b }
            int r4 = r0.zze     // Catch:{ Exception -> 0x051b }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ Exception -> 0x051b }
            r10.<init>()     // Catch:{ Exception -> 0x051b }
            r12 = r4 & 1
            if (r12 == 0) goto L_0x02df
            java.lang.String r12 = "default"
            r10.add(r12)     // Catch:{ Exception -> 0x051b }
        L_0x02df:
            r4 = r4 & 2
            if (r4 == 0) goto L_0x02e8
            java.lang.String r4 = "forced"
            r10.add(r4)     // Catch:{ Exception -> 0x051b }
        L_0x02e8:
            com.google.android.gms.internal.ads.zzfuf.zzb(r14, r10, r11)     // Catch:{ Exception -> 0x051b }
            r14.append(r7)     // Catch:{ Exception -> 0x051b }
        L_0x02ee:
            int r4 = r0.zzf     // Catch:{ Exception -> 0x051b }
            r10 = 32768(0x8000, float:4.5918E-41)
            if (r4 == 0) goto L_0x0396
            java.lang.String r4 = ", roleFlags=["
            r14.append(r4)     // Catch:{ Exception -> 0x051b }
            int r4 = r0.zzf     // Catch:{ Exception -> 0x051b }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ Exception -> 0x051b }
            r12.<init>()     // Catch:{ Exception -> 0x051b }
            r13 = r4 & 1
            if (r13 == 0) goto L_0x030a
            java.lang.String r13 = "main"
            r12.add(r13)     // Catch:{ Exception -> 0x051b }
        L_0x030a:
            r13 = r4 & 2
            if (r13 == 0) goto L_0x0313
            java.lang.String r13 = "alt"
            r12.add(r13)     // Catch:{ Exception -> 0x051b }
        L_0x0313:
            r13 = r4 & 4
            if (r13 == 0) goto L_0x031c
            java.lang.String r13 = "supplementary"
            r12.add(r13)     // Catch:{ Exception -> 0x051b }
        L_0x031c:
            r13 = r4 & 8
            if (r13 == 0) goto L_0x0325
            java.lang.String r13 = "commentary"
            r12.add(r13)     // Catch:{ Exception -> 0x051b }
        L_0x0325:
            r13 = r4 & 16
            if (r13 == 0) goto L_0x032e
            java.lang.String r13 = "dub"
            r12.add(r13)     // Catch:{ Exception -> 0x051b }
        L_0x032e:
            r13 = r4 & 32
            if (r13 == 0) goto L_0x0337
            java.lang.String r13 = "emergency"
            r12.add(r13)     // Catch:{ Exception -> 0x051b }
        L_0x0337:
            r13 = r4 & 64
            if (r13 == 0) goto L_0x0340
            java.lang.String r13 = "caption"
            r12.add(r13)     // Catch:{ Exception -> 0x051b }
        L_0x0340:
            r13 = r4 & 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L_0x0349
            java.lang.String r13 = "subtitle"
            r12.add(r13)     // Catch:{ Exception -> 0x051b }
        L_0x0349:
            r13 = r4 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x0352
            java.lang.String r13 = "sign"
            r12.add(r13)     // Catch:{ Exception -> 0x051b }
        L_0x0352:
            r13 = r4 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x035b
            java.lang.String r13 = "describes-video"
            r12.add(r13)     // Catch:{ Exception -> 0x051b }
        L_0x035b:
            r13 = r4 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x0364
            java.lang.String r13 = "describes-music"
            r12.add(r13)     // Catch:{ Exception -> 0x051b }
        L_0x0364:
            r13 = r4 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x036d
            java.lang.String r13 = "enhanced-intelligibility"
            r12.add(r13)     // Catch:{ Exception -> 0x051b }
        L_0x036d:
            r13 = r4 & 4096(0x1000, float:5.74E-42)
            if (r13 == 0) goto L_0x0376
            java.lang.String r13 = "transcribes-dialog"
            r12.add(r13)     // Catch:{ Exception -> 0x051b }
        L_0x0376:
            r13 = r4 & 8192(0x2000, float:1.14794E-41)
            if (r13 == 0) goto L_0x037f
            java.lang.String r13 = "easy-read"
            r12.add(r13)     // Catch:{ Exception -> 0x051b }
        L_0x037f:
            r13 = r4 & 16384(0x4000, float:2.2959E-41)
            if (r13 == 0) goto L_0x0388
            java.lang.String r13 = "trick-play"
            r12.add(r13)     // Catch:{ Exception -> 0x051b }
        L_0x0388:
            r4 = r4 & r10
            if (r4 == 0) goto L_0x0390
            java.lang.String r4 = "auxiliary"
            r12.add(r4)     // Catch:{ Exception -> 0x051b }
        L_0x0390:
            com.google.android.gms.internal.ads.zzfuf.zzb(r14, r12, r11)     // Catch:{ Exception -> 0x051b }
            r14.append(r7)     // Catch:{ Exception -> 0x051b }
        L_0x0396:
            int r4 = r0.zzf     // Catch:{ Exception -> 0x051b }
            r4 = r4 & r10
            if (r4 == 0) goto L_0x03a5
            java.lang.String r4 = ", auxiliaryTrackType="
            r14.append(r4)     // Catch:{ Exception -> 0x051b }
            java.lang.String r4 = "undefined"
            r14.append(r4)     // Catch:{ Exception -> 0x051b }
        L_0x03a5:
            java.lang.String r4 = r14.toString()     // Catch:{ Exception -> 0x051b }
            r7 = 2
            java.lang.Object[] r10 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x051b }
            r7 = 0
            r10[r7] = r4     // Catch:{ Exception -> 0x051b }
            r4 = 1
            r10[r4] = r2     // Catch:{ Exception -> 0x051b }
            java.util.Locale r4 = java.util.Locale.US     // Catch:{ Exception -> 0x051b }
            java.lang.String r3 = java.lang.String.format(r4, r3, r10)     // Catch:{ Exception -> 0x051b }
            com.google.android.gms.internal.ads.zzdo.zzf(r9, r3)     // Catch:{ Exception -> 0x051b }
            goto L_0x03c7
        L_0x03bc:
            r0 = move-exception
            r21 = r10
        L_0x03bf:
            r22 = r13
            goto L_0x051c
        L_0x03c3:
            r21 = r10
            r22 = r13
        L_0x03c7:
            r8.zzz = r6     // Catch:{ Exception -> 0x051b }
            r8.zzw = r1     // Catch:{ Exception -> 0x051b }
            r8.zzt = r0     // Catch:{ Exception -> 0x051b }
            int r0 = com.google.android.gms.internal.ads.zzei.zza     // Catch:{ Exception -> 0x051b }
            r1 = 25
            if (r0 > r1) goto L_0x0405
            java.lang.String r0 = "OMX.Exynos.avc.dec.secure"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x051b }
            if (r0 == 0) goto L_0x0405
            java.lang.String r0 = com.google.android.gms.internal.ads.zzei.zzd     // Catch:{ Exception -> 0x051b }
            java.lang.String r3 = "SM-T585"
            boolean r0 = r0.startsWith(r3)     // Catch:{ Exception -> 0x051b }
            if (r0 != 0) goto L_0x0403
            java.lang.String r0 = com.google.android.gms.internal.ads.zzei.zzd     // Catch:{ Exception -> 0x051b }
            java.lang.String r3 = "SM-A510"
            boolean r0 = r0.startsWith(r3)     // Catch:{ Exception -> 0x051b }
            if (r0 != 0) goto L_0x0403
            java.lang.String r0 = com.google.android.gms.internal.ads.zzei.zzd     // Catch:{ Exception -> 0x051b }
            java.lang.String r3 = "SM-A520"
            boolean r0 = r0.startsWith(r3)     // Catch:{ Exception -> 0x051b }
            if (r0 != 0) goto L_0x0403
            java.lang.String r0 = com.google.android.gms.internal.ads.zzei.zzd     // Catch:{ Exception -> 0x051b }
            java.lang.String r3 = "SM-J700"
            boolean r0 = r0.startsWith(r3)     // Catch:{ Exception -> 0x051b }
            if (r0 == 0) goto L_0x0405
        L_0x0403:
            r0 = 2
            goto L_0x0446
        L_0x0405:
            int r0 = com.google.android.gms.internal.ads.zzei.zza     // Catch:{ Exception -> 0x051b }
            r3 = 24
            if (r0 >= r3) goto L_0x0445
            java.lang.String r0 = "OMX.Nvidia.h264.decode"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x051b }
            if (r0 != 0) goto L_0x041b
            java.lang.String r0 = "OMX.Nvidia.h264.decode.secure"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x051b }
            if (r0 == 0) goto L_0x0445
        L_0x041b:
            java.lang.String r0 = "flounder"
            java.lang.String r3 = com.google.android.gms.internal.ads.zzei.zzb     // Catch:{ Exception -> 0x051b }
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x051b }
            if (r0 != 0) goto L_0x0443
            java.lang.String r0 = "flounder_lte"
            java.lang.String r3 = com.google.android.gms.internal.ads.zzei.zzb     // Catch:{ Exception -> 0x051b }
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x051b }
            if (r0 != 0) goto L_0x0443
            java.lang.String r0 = "grouper"
            java.lang.String r3 = com.google.android.gms.internal.ads.zzei.zzb     // Catch:{ Exception -> 0x051b }
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x051b }
            if (r0 != 0) goto L_0x0443
            java.lang.String r0 = "tilapia"
            java.lang.String r3 = com.google.android.gms.internal.ads.zzei.zzb     // Catch:{ Exception -> 0x051b }
            boolean r0 = r0.equals(r3)     // Catch:{ Exception -> 0x051b }
            if (r0 == 0) goto L_0x0445
        L_0x0443:
            r0 = 1
            goto L_0x0446
        L_0x0445:
            r0 = 0
        L_0x0446:
            r8.zzA = r0     // Catch:{ Exception -> 0x051b }
            int r0 = com.google.android.gms.internal.ads.zzei.zza     // Catch:{ Exception -> 0x051b }
            r3 = 29
            if (r0 != r3) goto L_0x0458
            java.lang.String r0 = "c2.android.aac.decoder"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x051b }
            if (r0 == 0) goto L_0x0458
            r0 = 1
            goto L_0x0459
        L_0x0458:
            r0 = 0
        L_0x0459:
            r8.zzB = r0     // Catch:{ Exception -> 0x051b }
            int r0 = com.google.android.gms.internal.ads.zzei.zza     // Catch:{ Exception -> 0x051b }
            r4 = 23
            if (r0 > r4) goto L_0x046b
            java.lang.String r0 = "OMX.google.vorbis.decoder"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x051b }
            if (r0 == 0) goto L_0x046b
            r0 = 1
            goto L_0x046c
        L_0x046b:
            r0 = 0
        L_0x046c:
            r8.zzC = r0     // Catch:{ Exception -> 0x051b }
            int r0 = com.google.android.gms.internal.ads.zzei.zza     // Catch:{ Exception -> 0x051b }
            r4 = 21
            if (r0 != r4) goto L_0x047e
            java.lang.String r0 = "OMX.google.aac.decoder"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x051b }
            if (r0 == 0) goto L_0x047e
            r0 = 1
            goto L_0x047f
        L_0x047e:
            r0 = 0
        L_0x047f:
            r8.zzD = r0     // Catch:{ Exception -> 0x051b }
            java.lang.String r0 = r6.zza     // Catch:{ Exception -> 0x051b }
            int r4 = com.google.android.gms.internal.ads.zzei.zza     // Catch:{ Exception -> 0x051b }
            if (r4 > r1) goto L_0x0492
            java.lang.String r1 = "OMX.rk.video_decoder.avc"
            boolean r1 = r1.equals(r0)     // Catch:{ Exception -> 0x051b }
            if (r1 != 0) goto L_0x0490
            goto L_0x0492
        L_0x0490:
            r0 = 1
            goto L_0x04e0
        L_0x0492:
            int r1 = com.google.android.gms.internal.ads.zzei.zza     // Catch:{ Exception -> 0x051b }
            if (r1 > r3) goto L_0x04c6
            java.lang.String r1 = "OMX.broadcom.video_decoder.tunnel"
            boolean r1 = r1.equals(r0)     // Catch:{ Exception -> 0x051b }
            if (r1 != 0) goto L_0x0490
            java.lang.String r1 = "OMX.broadcom.video_decoder.tunnel.secure"
            boolean r1 = r1.equals(r0)     // Catch:{ Exception -> 0x051b }
            if (r1 != 0) goto L_0x0490
            java.lang.String r1 = "OMX.bcm.vdec.avc.tunnel"
            boolean r1 = r1.equals(r0)     // Catch:{ Exception -> 0x051b }
            if (r1 != 0) goto L_0x0490
            java.lang.String r1 = "OMX.bcm.vdec.avc.tunnel.secure"
            boolean r1 = r1.equals(r0)     // Catch:{ Exception -> 0x051b }
            if (r1 != 0) goto L_0x0490
            java.lang.String r1 = "OMX.bcm.vdec.hevc.tunnel"
            boolean r1 = r1.equals(r0)     // Catch:{ Exception -> 0x051b }
            if (r1 != 0) goto L_0x0490
            java.lang.String r1 = "OMX.bcm.vdec.hevc.tunnel.secure"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x051b }
            if (r0 != 0) goto L_0x0490
        L_0x04c6:
            java.lang.String r0 = "Amazon"
            java.lang.String r1 = com.google.android.gms.internal.ads.zzei.zzc     // Catch:{ Exception -> 0x051b }
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x051b }
            if (r0 == 0) goto L_0x04df
            java.lang.String r0 = "AFTS"
            java.lang.String r1 = com.google.android.gms.internal.ads.zzei.zzd     // Catch:{ Exception -> 0x051b }
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x051b }
            if (r0 == 0) goto L_0x04df
            boolean r0 = r6.zzf     // Catch:{ Exception -> 0x051b }
            if (r0 == 0) goto L_0x04df
            goto L_0x0490
        L_0x04df:
            r0 = 0
        L_0x04e0:
            r8.zzG = r0     // Catch:{ Exception -> 0x051b }
            com.google.android.gms.internal.ads.zzsd r0 = r8.zzs     // Catch:{ Exception -> 0x051b }
            if (r0 == 0) goto L_0x0517
            com.google.android.gms.internal.ads.zzsd r0 = (com.google.android.gms.internal.ads.zzsd) r0     // Catch:{ Exception -> 0x051b }
            int r0 = r23.zzcT()     // Catch:{ Exception -> 0x051b }
            r1 = 2
            if (r0 != r1) goto L_0x04fc
            com.google.android.gms.internal.ads.zzcx r0 = r23.zzi()     // Catch:{ Exception -> 0x051b }
            long r0 = r0.zzb()     // Catch:{ Exception -> 0x051b }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 + r3
            r8.zzI = r0     // Catch:{ Exception -> 0x051b }
        L_0x04fc:
            com.google.android.gms.internal.ads.zzhs r0 = r8.zza     // Catch:{ Exception -> 0x051b }
            int r1 = r0.zza     // Catch:{ Exception -> 0x051b }
            r10 = 1
            int r1 = r1 + r10
            r0.zza = r1     // Catch:{ Exception -> 0x0515 }
            long r11 = r18 - r16
            r1 = r23
            r3 = r5
            r4 = r18
            r13 = r6
            r6 = r11
            r1.zzal(r2, r3, r4, r6)     // Catch:{ Exception -> 0x0532 }
            r10 = r21
            r13 = r22
            goto L_0x056a
        L_0x0515:
            r0 = move-exception
            goto L_0x053a
        L_0x0517:
            r13 = r6
            r1 = 0
            r10 = 1
            throw r1     // Catch:{ Exception -> 0x0532 }
        L_0x051b:
            r0 = move-exception
        L_0x051c:
            r13 = r6
            r10 = 1
            goto L_0x053b
        L_0x051f:
            r0 = move-exception
            r21 = r10
            r22 = r13
            r10 = 1
            r13 = r6
            android.os.Trace.endSection()     // Catch:{ Exception -> 0x0532 }
            throw r0     // Catch:{ Exception -> 0x0532 }
        L_0x052a:
            r21 = r10
            r22 = r13
            r1 = r14
            r10 = 1
            r13 = r6
            throw r1     // Catch:{ Exception -> 0x0532 }
        L_0x0532:
            r0 = move-exception
            goto L_0x053b
        L_0x0534:
            r0 = move-exception
            r21 = r10
        L_0x0537:
            r22 = r13
            r10 = 1
        L_0x053a:
            r13 = r6
        L_0x053b:
            java.lang.String r1 = r13.zza     // Catch:{ zzsj -> 0x0592 }
            java.lang.String r2 = "Failed to initialize decoder: "
            java.lang.String r1 = r2.concat(r1)     // Catch:{ zzsj -> 0x0592 }
            com.google.android.gms.internal.ads.zzdo.zzg(r9, r1, r0)     // Catch:{ zzsj -> 0x0592 }
            r15.removeFirst()     // Catch:{ zzsj -> 0x0592 }
            com.google.android.gms.internal.ads.zzsj r1 = new com.google.android.gms.internal.ads.zzsj     // Catch:{ zzsj -> 0x0592 }
            r2 = r22
            r3 = 0
            r1.<init>((com.google.android.gms.internal.ads.zzab) r2, (java.lang.Throwable) r0, (boolean) r3, (com.google.android.gms.internal.ads.zzsg) r13)     // Catch:{ zzsj -> 0x0592 }
            r8.zzak(r1)     // Catch:{ zzsj -> 0x0592 }
            com.google.android.gms.internal.ads.zzsj r0 = r8.zzy     // Catch:{ zzsj -> 0x0592 }
            if (r0 != 0) goto L_0x055b
            r8.zzy = r1     // Catch:{ zzsj -> 0x0592 }
            goto L_0x0561
        L_0x055b:
            com.google.android.gms.internal.ads.zzsj r0 = com.google.android.gms.internal.ads.zzsj.zza(r0, r1)     // Catch:{ zzsj -> 0x0592 }
            r8.zzy = r0     // Catch:{ zzsj -> 0x0592 }
        L_0x0561:
            boolean r0 = r15.isEmpty()     // Catch:{ zzsj -> 0x0592 }
            if (r0 != 0) goto L_0x056f
            r13 = r2
            r10 = r21
        L_0x056a:
            r11 = 1
            r12 = 0
            r14 = 0
            goto L_0x00a0
        L_0x056f:
            com.google.android.gms.internal.ads.zzsj r0 = r8.zzy     // Catch:{ zzsj -> 0x0592 }
            throw r0     // Catch:{ zzsj -> 0x0592 }
        L_0x0572:
            r21 = r10
            r1 = r14
            throw r1     // Catch:{ zzsj -> 0x0592 }
        L_0x0576:
            r21 = r10
            r1 = r14
            r8.zzx = r1     // Catch:{ zzsj -> 0x0592 }
            return
        L_0x057c:
            r21 = r10
            r1 = r14
            throw r1     // Catch:{ zzsj -> 0x0592 }
        L_0x0580:
            r21 = r10
            r2 = r13
            r1 = r14
            com.google.android.gms.internal.ads.zzsj r0 = new com.google.android.gms.internal.ads.zzsj     // Catch:{ zzsj -> 0x0592 }
            r3 = -49999(0xffffffffffff3cb1, float:NaN)
            r4 = 0
            r0.<init>((com.google.android.gms.internal.ads.zzab) r2, (java.lang.Throwable) r1, (boolean) r4, (int) r3)     // Catch:{ zzsj -> 0x0592 }
            throw r0     // Catch:{ zzsj -> 0x0592 }
        L_0x058e:
            r21 = r10
            r1 = r14
            throw r1     // Catch:{ zzsj -> 0x0592 }
        L_0x0592:
            r0 = move-exception
            goto L_0x0597
        L_0x0594:
            r0 = move-exception
            r21 = r10
        L_0x0597:
            r1 = 4001(0xfa1, float:5.607E-42)
            r2 = r21
            r3 = 0
            com.google.android.gms.internal.ads.zzib r0 = r8.zzcW(r0, r2, r3, r1)
            throw r0
        L_0x05a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsn.zzaC():void");
    }

    /* access modifiers changed from: protected */
    public void zzaD(long j) {
        this.zzae = j;
        while (!this.zzk.isEmpty() && j >= ((zzsl) this.zzk.peek()).zzb) {
            zzsl zzsl = (zzsl) this.zzk.poll();
            zzsl.getClass();
            zzsl zzsl2 = zzsl;
            zzaR(zzsl);
            zzap();
        }
    }

    /* access modifiers changed from: protected */
    public void zzaE(zzhh zzhh) throws zzib {
    }

    /* access modifiers changed from: protected */
    public void zzaF(zzab zzab2) throws zzib {
    }

    /* access modifiers changed from: protected */
    public final void zzaG() {
        try {
            zzsd zzsd = this.zzs;
            if (zzsd != null) {
                zzsd.zzm();
                this.zza.zzb++;
                zzsg zzsg = this.zzz;
                if (zzsg != null) {
                    zzsg zzsg2 = zzsg;
                    zzam(zzsg.zza);
                } else {
                    throw null;
                }
            }
        } finally {
            this.zzs = null;
            this.zzp = null;
            this.zzag = null;
            zzaI();
        }
    }

    /* access modifiers changed from: protected */
    public void zzaH() {
        zzao();
        zzaQ();
        this.zzI = -9223372036854775807L;
        this.zzW = false;
        this.zzH = -9223372036854775807L;
        this.zzV = false;
        this.zzE = false;
        this.zzF = false;
        this.zzM = false;
        this.zzN = false;
        this.zzY = -9223372036854775807L;
        this.zzZ = -9223372036854775807L;
        this.zzae = -9223372036854775807L;
        this.zzT = 0;
        this.zzU = 0;
        this.zzS = this.zzR ? 1 : 0;
    }

    /* access modifiers changed from: protected */
    public final void zzaI() {
        zzaH();
        this.zzx = null;
        this.zzz = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = false;
        this.zzX = false;
        this.zzw = -1.0f;
        this.zzA = 0;
        this.zzB = false;
        this.zzC = false;
        this.zzD = false;
        this.zzG = false;
        this.zzR = false;
        this.zzS = 0;
    }

    /* access modifiers changed from: protected */
    public final boolean zzaJ() throws zzib {
        boolean zzaK = zzaK();
        if (zzaK) {
            zzaC();
        }
        return zzaK;
    }

    /* access modifiers changed from: protected */
    public final boolean zzaK() {
        if (this.zzs == null) {
            return false;
        }
        int i = this.zzU;
        if (i == 3 || ((this.zzB && !this.zzX) || (this.zzC && this.zzW))) {
            zzaG();
            return true;
        }
        if (i == 2) {
            zzcw.zzf(zzei.zza >= 23);
            if (zzei.zza >= 23) {
                try {
                    zzaS();
                } catch (zzib e) {
                    zzdo.zzg("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                    zzaG();
                    return true;
                }
            }
        }
        zzah();
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean zzaL() {
        return this.zzO;
    }

    /* access modifiers changed from: protected */
    public final boolean zzaM(zzab zzab2) {
        return this.zzah == null && zzas(zzab2);
    }

    /* access modifiers changed from: protected */
    public boolean zzaN(zzsg zzsg) {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean zzaO(zzhh zzhh) {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract int zzaa(zzsp zzsp, zzab zzab2) throws zzsu;

    /* access modifiers changed from: protected */
    public zzht zzab(zzsg zzsg, zzab zzab2, zzab zzab3) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008d, code lost:
        if (zzaT() == false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b9, code lost:
        if (zzaT() == false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00cd, code lost:
        if (zzaT() == false) goto L_0x00e4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00fa A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.internal.ads.zzht zzac(com.google.android.gms.internal.ads.zzke r12) throws com.google.android.gms.internal.ads.zzib {
        /*
            r11 = this;
            r0 = 1
            r11.zzac = r0
            com.google.android.gms.internal.ads.zzab r1 = r12.zza
            r1.getClass()
            r2 = r1
            com.google.android.gms.internal.ads.zzab r2 = (com.google.android.gms.internal.ads.zzab) r2
            java.lang.String r2 = r1.zzo
            r3 = 0
            if (r2 == 0) goto L_0x010a
            java.lang.String r4 = "video/av01"
            boolean r2 = java.util.Objects.equals(r2, r4)
            r4 = 0
            if (r2 == 0) goto L_0x002c
            java.util.List r2 = r1.zzr
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x002c
            com.google.android.gms.internal.ads.zzz r1 = r1.zzb()
            r1.zzN(r4)
            com.google.android.gms.internal.ads.zzab r1 = r1.zzag()
        L_0x002c:
            r8 = r1
            com.google.android.gms.internal.ads.zzrg r12 = r12.zzb
            r11.zzah = r12
            r11.zzm = r8
            boolean r12 = r11.zzO
            if (r12 == 0) goto L_0x003a
            r11.zzQ = r0
            return r4
        L_0x003a:
            com.google.android.gms.internal.ads.zzsd r12 = r11.zzs
            if (r12 != 0) goto L_0x0044
            r11.zzx = r4
            r11.zzaC()
            return r4
        L_0x0044:
            com.google.android.gms.internal.ads.zzsg r1 = r11.zzz
            r1.getClass()
            r2 = r1
            com.google.android.gms.internal.ads.zzsg r2 = (com.google.android.gms.internal.ads.zzsg) r2
            com.google.android.gms.internal.ads.zzab r7 = r11.zzt
            r7.getClass()
            r2 = r7
            com.google.android.gms.internal.ads.zzab r2 = (com.google.android.gms.internal.ads.zzab) r2
            com.google.android.gms.internal.ads.zzrg r2 = r11.zzag
            com.google.android.gms.internal.ads.zzrg r4 = r11.zzah
            if (r2 != r4) goto L_0x00fb
            if (r4 == r2) goto L_0x005e
            r2 = 1
            goto L_0x005f
        L_0x005e:
            r2 = 0
        L_0x005f:
            if (r2 == 0) goto L_0x006a
            int r4 = com.google.android.gms.internal.ads.zzei.zza
            r5 = 23
            if (r4 < r5) goto L_0x0068
            goto L_0x006a
        L_0x0068:
            r4 = 0
            goto L_0x006b
        L_0x006a:
            r4 = 1
        L_0x006b:
            com.google.android.gms.internal.ads.zzcw.zzf(r4)
            com.google.android.gms.internal.ads.zzht r4 = r11.zzab(r1, r7, r8)
            int r5 = r4.zzd
            r6 = 3
            if (r5 == 0) goto L_0x00e0
            r9 = 16
            r10 = 2
            if (r5 == r0) goto L_0x00bc
            if (r5 == r10) goto L_0x0090
            boolean r0 = r11.zzaX(r8)
            if (r0 != 0) goto L_0x0085
            goto L_0x00c2
        L_0x0085:
            r11.zzt = r8
            if (r2 == 0) goto L_0x00e3
            boolean r0 = r11.zzaT()
            if (r0 != 0) goto L_0x00e3
            goto L_0x00e4
        L_0x0090:
            boolean r5 = r11.zzaX(r8)
            if (r5 != 0) goto L_0x0097
            goto L_0x00c2
        L_0x0097:
            r11.zzR = r0
            r11.zzS = r0
            int r5 = r11.zzA
            if (r5 == r10) goto L_0x00af
            if (r5 != r0) goto L_0x00ae
            int r5 = r8.zzv
            int r9 = r7.zzv
            if (r5 != r9) goto L_0x00ae
            int r5 = r8.zzw
            int r9 = r7.zzw
            if (r5 != r9) goto L_0x00ae
            goto L_0x00af
        L_0x00ae:
            r0 = 0
        L_0x00af:
            r11.zzE = r0
            r11.zzt = r8
            if (r2 == 0) goto L_0x00e3
            boolean r0 = r11.zzaT()
            if (r0 != 0) goto L_0x00e3
            goto L_0x00e4
        L_0x00bc:
            boolean r5 = r11.zzaX(r8)
            if (r5 != 0) goto L_0x00c5
        L_0x00c2:
            r10 = 16
            goto L_0x00e4
        L_0x00c5:
            r11.zzt = r8
            if (r2 == 0) goto L_0x00d0
            boolean r0 = r11.zzaT()
            if (r0 != 0) goto L_0x00e3
            goto L_0x00e4
        L_0x00d0:
            boolean r2 = r11.zzV
            if (r2 == 0) goto L_0x00e3
            r11.zzT = r0
            boolean r2 = r11.zzC
            if (r2 == 0) goto L_0x00dd
            r11.zzU = r6
            goto L_0x00e4
        L_0x00dd:
            r11.zzU = r0
            goto L_0x00e3
        L_0x00e0:
            r11.zzae()
        L_0x00e3:
            r10 = 0
        L_0x00e4:
            int r0 = r4.zzd
            if (r0 == 0) goto L_0x00fa
            com.google.android.gms.internal.ads.zzsd r0 = r11.zzs
            if (r0 != r12) goto L_0x00f0
            int r12 = r11.zzU
            if (r12 != r6) goto L_0x00fa
        L_0x00f0:
            java.lang.String r6 = r1.zza
            com.google.android.gms.internal.ads.zzht r12 = new com.google.android.gms.internal.ads.zzht
            r9 = 0
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            return r12
        L_0x00fa:
            return r4
        L_0x00fb:
            r11.zzae()
            java.lang.String r6 = r1.zza
            com.google.android.gms.internal.ads.zzht r12 = new com.google.android.gms.internal.ads.zzht
            r9 = 0
            r10 = 128(0x80, float:1.794E-43)
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            return r12
        L_0x010a:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Sample MIME type is null."
            r12.<init>(r0)
            r0 = 4005(0xfa5, float:5.612E-42)
            com.google.android.gms.internal.ads.zzib r12 = r11.zzcW(r12, r1, r3, r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsn.zzac(com.google.android.gms.internal.ads.zzke):com.google.android.gms.internal.ads.zzht");
    }

    /* access modifiers changed from: protected */
    public abstract zzsa zzaf(zzsg zzsg, zzab zzab2, MediaCrypto mediaCrypto, float f);

    /* access modifiers changed from: protected */
    public abstract List zzag(zzsp zzsp, zzab zzab2, boolean z) throws zzsu;

    /* access modifiers changed from: protected */
    public void zzaj(zzhh zzhh) throws zzib {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzak(Exception exc) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzal(String str, zzsa zzsa, long j, long j2) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzam(String str) {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzan(zzab zzab2, MediaFormat mediaFormat) throws zzib {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzap() {
    }

    /* access modifiers changed from: protected */
    public void zzaq() throws zzib {
    }

    /* access modifiers changed from: protected */
    public abstract boolean zzar(long j, long j2, zzsd zzsd, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzab zzab2) throws zzib;

    /* access modifiers changed from: protected */
    public boolean zzas(zzab zzab2) {
        return false;
    }

    /* access modifiers changed from: protected */
    public final float zzat() {
        return this.zzq;
    }

    /* access modifiers changed from: protected */
    public int zzau(zzhh zzhh) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public final long zzav() {
        return this.zzad.zzd;
    }

    /* access modifiers changed from: protected */
    public final long zzaw() {
        return this.zzad.zzc;
    }

    /* access modifiers changed from: protected */
    public final zzli zzay() {
        return this.zzo;
    }

    /* access modifiers changed from: protected */
    public final zzsd zzaz() {
        return this.zzs;
    }

    public final int zze() {
        return 8;
    }

    public void zzu(int i, Object obj) throws zzib {
        if (i == 11) {
            this.zzo = (zzli) obj;
        }
    }

    /* access modifiers changed from: protected */
    public void zzx() {
        this.zzm = null;
        zzaR(zzsl.zza);
        this.zzk.clear();
        zzaK();
    }

    /* access modifiers changed from: protected */
    public void zzy(boolean z, boolean z2) throws zzib {
        this.zza = new zzhs();
    }

    /* access modifiers changed from: protected */
    public void zzz(long j, boolean z) throws zzib {
        this.zzaa = false;
        this.zzab = false;
        if (this.zzO) {
            this.zzi.zzb();
            this.zzh.zzb();
            this.zzP = false;
            this.zzl.zzb();
        } else {
            zzaJ();
        }
        zzee zzee = this.zzad.zze;
        if (zzee.zza() > 0) {
            this.zzac = true;
        }
        zzee.zze();
        this.zzk.clear();
    }

    private final void zzaS() throws zzib {
        zzrg zzrg = this.zzah;
        zzrg.getClass();
        zzrg zzrg2 = zzrg;
        this.zzag = zzrg;
        this.zzT = 0;
        this.zzU = 0;
    }

    private final void zzai() throws zzib {
        int i = this.zzU;
        if (i == 1) {
            zzah();
        } else if (i == 2) {
            zzah();
            zzaS();
        } else if (i != 3) {
            this.zzab = true;
            zzaq();
        } else {
            zzaG();
            zzaC();
        }
    }
}
