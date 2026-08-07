package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import androidx.work.WorkRequest;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzvk implements zzue, zzacq, zzyq, zzyu, zzvv {
    /* access modifiers changed from: private */
    public static final Map zzb;
    /* access modifiers changed from: private */
    public static final zzab zzc;
    private zzadm zzA;
    /* access modifiers changed from: private */
    public long zzB;
    private boolean zzC;
    private int zzD;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private int zzH;
    private boolean zzI;
    private long zzJ;
    private long zzK;
    private boolean zzL;
    private int zzM;
    private boolean zzN;
    private boolean zzO;
    private final zzyk zzP;
    private final Uri zzd;
    private final zzfy zze;
    private final zzrf zzf;
    private final zzuq zzg;
    private final zzra zzh;
    private final zzvg zzi;
    /* access modifiers changed from: private */
    public final long zzj;
    private final long zzk;
    private final zzyy zzl = new zzyy("ProgressiveMediaPeriod");
    private final zzuz zzm;
    private final zzda zzn;
    private final Runnable zzo;
    /* access modifiers changed from: private */
    public final Runnable zzp;
    /* access modifiers changed from: private */
    public final Handler zzq;
    private zzud zzr;
    /* access modifiers changed from: private */
    public zzafr zzs;
    private zzvx[] zzt;
    private zzvi[] zzu;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private boolean zzy;
    private zzvj zzz;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        zzb = Collections.unmodifiableMap(hashMap);
        zzz zzz2 = new zzz();
        zzz2.zzM("icy");
        zzz2.zzaa("application/x-icy");
        zzc = zzz2.zzag();
    }

    public zzvk(Uri uri, zzfy zzfy, zzuz zzuz, zzrf zzrf, zzra zzra, zzyo zzyo, zzuq zzuq, zzvg zzvg, zzyk zzyk, String str, int i, boolean z, long j, zzzg zzzg) {
        this.zzd = uri;
        this.zze = zzfy;
        this.zzf = zzrf;
        this.zzh = zzra;
        this.zzg = zzuq;
        this.zzi = zzvg;
        this.zzP = zzyk;
        this.zzj = (long) i;
        this.zzm = zzuz;
        this.zzk = j;
        this.zzn = new zzda(zzcx.zza);
        this.zzo = new zzvb(this);
        this.zzp = new zzvc(this);
        this.zzq = zzei.zzy((Handler.Callback) null);
        this.zzu = new zzvi[0];
        this.zzt = new zzvx[0];
        this.zzK = -9223372036854775807L;
        this.zzD = 1;
    }

    private final int zzQ() {
        int i = 0;
        for (zzvx zzd2 : this.zzt) {
            i += zzd2.zzd();
        }
        return i;
    }

    /* access modifiers changed from: private */
    public final long zzR(boolean z) {
        int i = 0;
        long j = Long.MIN_VALUE;
        while (true) {
            zzvx[] zzvxArr = this.zzt;
            if (i >= zzvxArr.length) {
                return j;
            }
            if (!z) {
                zzvj zzvj = this.zzz;
                zzvj.getClass();
                zzvj zzvj2 = zzvj;
                if (!zzvj.zzc[i]) {
                    i++;
                }
            }
            j = Math.max(j, zzvxArr[i].zzh());
            i++;
        }
    }

    private final zzadt zzS(zzvi zzvi) {
        int length = this.zzt.length;
        for (int i = 0; i < length; i++) {
            if (zzvi.equals(this.zzu[i])) {
                return this.zzt[i];
            }
        }
        if (this.zzv) {
            int i2 = zzvi.zza;
            zzdo.zzf("ProgressiveMediaPeriod", "Extractor added new track (id=" + i2 + ") after finishing tracks.");
            return new zzaci();
        }
        zzyk zzyk = this.zzP;
        zzrf zzrf = this.zzf;
        zzra zzra = this.zzh;
        zzrf zzrf2 = zzrf;
        zzra zzra2 = zzra;
        zzvx zzvx = new zzvx(zzyk, zzrf, zzra);
        zzvx.zzv(this);
        int i3 = length + 1;
        zzvi[] zzviArr = (zzvi[]) Arrays.copyOf(this.zzu, i3);
        zzviArr[length] = zzvi;
        int i4 = zzei.zza;
        this.zzu = zzviArr;
        zzvx[] zzvxArr = (zzvx[]) Arrays.copyOf(this.zzt, i3);
        zzvxArr[length] = zzvx;
        this.zzt = zzvxArr;
        return zzvx;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    private final void zzT() {
        zzcw.zzf(this.zzw);
        this.zzz.getClass();
        this.zzA.getClass();
    }

    /* access modifiers changed from: private */
    public final void zzU() {
        int i;
        zzay zzay;
        if (!this.zzO && !this.zzw && this.zzv && this.zzA != null) {
            zzvx[] zzvxArr = this.zzt;
            int length = zzvxArr.length;
            int i2 = 0;
            while (i2 < length) {
                if (zzvxArr[i2].zzi() != null) {
                    i2++;
                } else {
                    return;
                }
            }
            this.zzn.zzc();
            int length2 = this.zzt.length;
            zzbr[] zzbrArr = new zzbr[length2];
            boolean[] zArr = new boolean[length2];
            for (int i3 = 0; i3 < length2; i3++) {
                zzab zzi2 = this.zzt[i3].zzi();
                zzi2.getClass();
                zzab zzab = zzi2;
                String str = zzi2.zzo;
                boolean zzg2 = zzbb.zzg(str);
                boolean z = zzg2 || zzbb.zzi(str);
                zArr[i3] = z;
                this.zzx = z | this.zzx;
                this.zzy = this.zzk != -9223372036854775807L && length2 == 1 && zzbb.zzh(str);
                zzafr zzafr = this.zzs;
                if (zzafr != null) {
                    if (zzg2 || this.zzu[i3].zzb) {
                        zzay zzay2 = zzi2.zzl;
                        if (zzay2 == null) {
                            zzay = new zzay(-9223372036854775807L, zzafr);
                        } else {
                            zzay = zzay2.zzc(zzafr);
                        }
                        zzz zzb2 = zzi2.zzb();
                        zzb2.zzT(zzay);
                        zzi2 = zzb2.zzag();
                    }
                    if (zzg2 && zzi2.zzh == -1 && zzi2.zzi == -1 && (i = zzafr.zza) != -1) {
                        zzz zzb3 = zzi2.zzb();
                        zzb3.zzy(i);
                        zzi2 = zzb3.zzag();
                    }
                }
                zzab zzc2 = zzi2.zzc(this.zzf.zza(zzi2));
                zzbrArr[i3] = new zzbr(Integer.toString(i3), zzc2);
                this.zzG = zzc2.zzu | this.zzG;
            }
            this.zzz = new zzvj(new zzwj(zzbrArr), zArr);
            if (this.zzy && this.zzB == -9223372036854775807L) {
                this.zzB = this.zzk;
                this.zzA = new zzve(this, this.zzA);
            }
            this.zzi.zza(this.zzB, this.zzA.zzh(), this.zzC);
            this.zzw = true;
            zzud zzud = this.zzr;
            zzud.getClass();
            zzud zzud2 = zzud;
            zzud.zzi(this);
        }
    }

    private final void zzV(int i) {
        zzT();
        zzvj zzvj = this.zzz;
        boolean[] zArr = zzvj.zzd;
        if (!zArr[i]) {
            zzab zzb2 = zzvj.zza.zzb(i).zzb(0);
            this.zzg.zzd(new zzuc(1, zzbb.zzb(zzb2.zzo), zzb2, 0, (Object) null, zzei.zzv(this.zzJ), -9223372036854775807L));
            zArr[i] = true;
        }
    }

    private final void zzW(int i) {
        zzT();
        boolean[] zArr = this.zzz.zzb;
        if (this.zzL && zArr[i] && !this.zzt[i].zzy(false)) {
            this.zzK = 0;
            this.zzL = false;
            this.zzF = true;
            this.zzJ = 0;
            this.zzM = 0;
            for (zzvx zzq2 : this.zzt) {
                zzq2.zzq(false);
            }
            zzud zzud = this.zzr;
            zzud.getClass();
            zzud zzud2 = zzud;
            zzud.zzg(this);
        }
    }

    private final void zzX() {
        zzvf zzvf = new zzvf(this, this.zzd, this.zze, this.zzm, this, this.zzn);
        if (this.zzw) {
            zzcw.zzf(zzY());
            long j = this.zzB;
            if (j == -9223372036854775807L || this.zzK <= j) {
                zzadm zzadm = this.zzA;
                zzadm.getClass();
                zzadm zzadm2 = zzadm;
                zzvf.zzf(zzvf, zzadm.zzg(this.zzK).zza.zzc, this.zzK);
                for (zzvx zzu2 : this.zzt) {
                    zzu2.zzu(this.zzK);
                }
                this.zzK = -9223372036854775807L;
            } else {
                this.zzN = true;
                this.zzK = -9223372036854775807L;
                return;
            }
        }
        this.zzM = zzQ();
        long zza = this.zzl.zza(zzvf, this, zzyo.zza(this.zzD));
        this.zzg.zzh(new zztx(zzvf.zzb, zzvf.zzl, zza), new zzuc(1, -1, (zzab) null, 0, (Object) null, zzei.zzv(zzvf.zzk), zzei.zzv(this.zzB)));
    }

    private final boolean zzY() {
        return this.zzK != -9223372036854775807L;
    }

    private final boolean zzZ() {
        return this.zzF || zzY();
    }

    public final void zzD() {
        this.zzv = true;
        this.zzq.post(this.zzo);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzF() {
        this.zzI = true;
    }

    /* access modifiers changed from: package-private */
    public final void zzH() throws IOException {
        this.zzl.zzi(zzyo.zza(this.zzD));
    }

    /* access modifiers changed from: package-private */
    public final void zzI(int i) throws IOException {
        this.zzt[i].zzn();
        zzH();
    }

    public final /* bridge */ /* synthetic */ void zzJ(zzyt zzyt, long j, long j2, boolean z) {
        zzvf zzvf = (zzvf) zzyt;
        zzgx zze2 = zzvf.zzd;
        zztx zztx = new zztx(zzvf.zzb, zzvf.zzl, zze2.zzh(), zze2.zzi(), j, j2, zze2.zzg());
        long unused = zzvf.zzb;
        long zzc2 = zzvf.zzk;
        long j3 = this.zzB;
        long zzv2 = zzei.zzv(zzc2);
        long zzv3 = zzei.zzv(j3);
        zzuc zzuc = r5;
        zzuc zzuc2 = new zzuc(1, -1, (zzab) null, 0, (Object) null, zzv2, zzv3);
        this.zzg.zze(zztx, zzuc);
        if (!z) {
            for (zzvx zzq2 : this.zzt) {
                zzq2.zzq(false);
            }
            if (this.zzH > 0) {
                zzud zzud = this.zzr;
                zzud.getClass();
                zzud zzud2 = zzud;
                zzud.zzg(this);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zzK(zzyt zzyt, long j, long j2) {
        zzadm zzadm;
        zzvf zzvf = (zzvf) zzyt;
        if (this.zzB == -9223372036854775807L && (zzadm = this.zzA) != null) {
            boolean zzh2 = zzadm.zzh();
            long zzR = zzR(true);
            long j3 = zzR == Long.MIN_VALUE ? 0 : zzR + WorkRequest.MIN_BACKOFF_MILLIS;
            this.zzB = j3;
            this.zzi.zza(j3, zzh2, this.zzC);
        }
        zzgx zze2 = zzvf.zzd;
        zztx zztx = new zztx(zzvf.zzb, zzvf.zzl, zze2.zzh(), zze2.zzi(), j, j2, zze2.zzg());
        long unused = zzvf.zzb;
        this.zzg.zzf(zztx, new zzuc(1, -1, (zzab) null, 0, (Object) null, zzei.zzv(zzvf.zzk), zzei.zzv(this.zzB)));
        this.zzN = true;
        zzud zzud = this.zzr;
        zzud.getClass();
        zzud zzud2 = zzud;
        zzud.zzg(this);
    }

    public final void zzL() {
        for (zzvx zzp2 : this.zzt) {
            zzp2.zzp();
        }
        this.zzm.zze();
    }

    public final void zzM(zzab zzab) {
        this.zzq.post(this.zzo);
    }

    public final void zzN() {
        if (this.zzw) {
            for (zzvx zzo2 : this.zzt) {
                zzo2.zzo();
            }
        }
        this.zzl.zzj(this);
        this.zzq.removeCallbacksAndMessages((Object) null);
        this.zzr = null;
        this.zzO = true;
    }

    public final void zzO(zzadm zzadm) {
        this.zzq.post(new zzvd(this, zzadm));
    }

    /* access modifiers changed from: package-private */
    public final boolean zzP(int i) {
        return !zzZ() && this.zzt[i].zzy(this.zzN);
    }

    public final long zza(long j, zzlp zzlp) {
        long j2 = j;
        zzlp zzlp2 = zzlp;
        zzT();
        if (!this.zzA.zzh()) {
            return 0;
        }
        zzadk zzg2 = this.zzA.zzg(j2);
        zzadn zzadn = zzg2.zza;
        zzadn zzadn2 = zzg2.zzb;
        long j3 = zzlp2.zzc;
        if (j3 == 0) {
            if (zzlp2.zzd == 0) {
                return j2;
            }
            j3 = 0;
        }
        long j4 = zzadn.zzb;
        int i = zzei.zza;
        long j5 = j2 - j3;
        long j6 = zzlp2.zzd;
        long j7 = j2 + j6;
        long j8 = j2 ^ j7;
        long j9 = j6 ^ j7;
        if (((j2 ^ j3) & (j2 ^ j5)) < 0) {
            j5 = Long.MIN_VALUE;
        }
        if ((j8 & j9) < 0) {
            j7 = Long.MAX_VALUE;
        }
        boolean z = true;
        boolean z2 = j5 <= j4 && j4 <= j7;
        long j10 = zzadn2.zzb;
        if (j5 > j10 || j10 > j7) {
            z = false;
        }
        if (z2 && z) {
            if (Math.abs(j4 - j2) > Math.abs(j10 - j2)) {
                return j10;
            }
        } else if (!z2) {
            return z ? j10 : j5;
        }
        return j4;
    }

    public final long zzb() {
        long j;
        zzT();
        if (this.zzN || this.zzH == 0) {
            return Long.MIN_VALUE;
        }
        if (zzY()) {
            return this.zzK;
        }
        if (this.zzx) {
            int length = this.zzt.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                zzvj zzvj = this.zzz;
                if (zzvj.zzb[i] && zzvj.zzc[i] && !this.zzt[i].zzx()) {
                    j = Math.min(j, this.zzt[i].zzh());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = zzR(false);
        }
        return j == Long.MIN_VALUE ? this.zzJ : j;
    }

    public final long zzc() {
        return zzb();
    }

    public final long zzd() {
        if (this.zzG) {
            this.zzG = false;
        } else if (!this.zzF) {
            return -9223372036854775807L;
        } else {
            if (!this.zzN && zzQ() <= this.zzM) {
                return -9223372036854775807L;
            }
            this.zzF = false;
        }
        return this.zzJ;
    }

    public final long zze(long j) {
        boolean z;
        zzT();
        boolean[] zArr = this.zzz.zzb;
        if (true != this.zzA.zzh()) {
            j = 0;
        }
        this.zzF = false;
        long j2 = this.zzJ;
        this.zzJ = j;
        if (zzY()) {
            this.zzK = j;
            return j;
        }
        if (this.zzD != 7 && (this.zzN || this.zzl.zzl())) {
            int length = this.zzt.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                zzvx zzvx = this.zzt[i];
                if (zzvx.zzb() != 0 || j2 != j) {
                    if (this.zzy) {
                        z = zzvx.zzz(zzvx.zza());
                    } else {
                        z = zzvx.zzA(j, false);
                    }
                    if (!z) {
                        if (zArr[i] || !this.zzx) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                i++;
            }
        }
        this.zzL = false;
        this.zzK = j;
        this.zzN = false;
        this.zzG = false;
        zzyy zzyy = this.zzl;
        if (zzyy.zzl()) {
            for (zzvx zzk2 : this.zzt) {
                zzk2.zzk();
            }
            this.zzl.zzg();
        } else {
            zzyy.zzh();
            for (zzvx zzq2 : this.zzt) {
                zzq2.zzq(false);
            }
        }
        return j;
    }

    public final long zzf(zzxv[] zzxvArr, boolean[] zArr, zzvy[] zzvyArr, boolean[] zArr2, long j) {
        boolean z;
        zzxv zzxv;
        zzT();
        zzvj zzvj = this.zzz;
        zzwj zzwj = zzvj.zza;
        boolean[] zArr3 = zzvj.zzc;
        int i = this.zzH;
        int i2 = 0;
        for (int i3 = 0; i3 < zzxvArr.length; i3++) {
            zzvh zzvh = zzvyArr[i3];
            if (zzvh != null && (zzxvArr[i3] == null || !zArr[i3])) {
                int zzc2 = zzvh.zzb;
                zzcw.zzf(zArr3[zzc2]);
                this.zzH--;
                zArr3[zzc2] = false;
                zzvyArr[i3] = null;
            }
        }
        if (!this.zzE ? j == 0 || this.zzy : i != 0) {
            z = false;
        } else {
            z = true;
        }
        for (int i4 = 0; i4 < zzxvArr.length; i4++) {
            if (zzvyArr[i4] == null && (zzxv = zzxvArr[i4]) != null) {
                zzcw.zzf(zzxv.zzd() == 1);
                zzcw.zzf(zzxv.zza(0) == 0);
                int zza = zzwj.zza(zzxv.zzg());
                zzcw.zzf(!zArr3[zza]);
                this.zzH++;
                zArr3[zza] = true;
                this.zzG = zzxv.zzf().zzu | this.zzG;
                zzvyArr[i4] = new zzvh(this, zza);
                zArr2[i4] = true;
                if (!z) {
                    zzvx zzvx = this.zzt[zza];
                    z = zzvx.zzb() != 0 && !zzvx.zzA(j, true);
                }
            }
        }
        if (this.zzH == 0) {
            this.zzL = false;
            this.zzF = false;
            this.zzG = false;
            if (this.zzl.zzl()) {
                zzvx[] zzvxArr = this.zzt;
                int length = zzvxArr.length;
                while (i2 < length) {
                    zzvxArr[i2].zzk();
                    i2++;
                }
                this.zzl.zzg();
            } else {
                this.zzN = false;
                for (zzvx zzq2 : this.zzt) {
                    zzq2.zzq(false);
                }
            }
        } else if (z) {
            j = zze(j);
            while (i2 < zzvyArr.length) {
                if (zzvyArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.zzE = true;
        return j;
    }

    /* access modifiers changed from: package-private */
    public final int zzg(int i, zzke zzke, zzhh zzhh, int i2) {
        if (zzZ()) {
            return -3;
        }
        zzV(i);
        int zze2 = this.zzt[i].zze(zzke, zzhh, i2, this.zzN);
        if (zze2 == -3) {
            zzW(i);
        }
        return zze2;
    }

    public final zzwj zzh() {
        zzT();
        return this.zzz.zza;
    }

    /* access modifiers changed from: package-private */
    public final int zzi(int i, long j) {
        if (zzZ()) {
            return 0;
        }
        zzV(i);
        zzvx zzvx = this.zzt[i];
        int zzc2 = zzvx.zzc(j, this.zzN);
        zzvx.zzw(zzc2);
        if (zzc2 != 0) {
            return zzc2;
        }
        zzW(i);
        return 0;
    }

    public final void zzj(long j, boolean z) {
        if (!this.zzy) {
            zzT();
            if (!zzY()) {
                boolean[] zArr = this.zzz.zzc;
                int length = this.zzt.length;
                for (int i = 0; i < length; i++) {
                    this.zzt[i].zzj(j, false, zArr[i]);
                }
            }
        }
    }

    public final void zzk() throws IOException {
        zzH();
        if (this.zzN && !this.zzw) {
            throw zzbc.zza("Loading finished before preparation is complete.", (Throwable) null);
        }
    }

    public final void zzl(zzud zzud, long j) {
        this.zzr = zzud;
        this.zzn.zze();
        zzX();
    }

    public final void zzm(long j) {
    }

    public final boolean zzo(zzkj zzkj) {
        if (this.zzN) {
            return false;
        }
        zzyy zzyy = this.zzl;
        if (zzyy.zzk() || this.zzL) {
            return false;
        }
        if (this.zzw && this.zzH == 0) {
            return false;
        }
        boolean zze2 = this.zzn.zze();
        if (zzyy.zzl()) {
            return zze2;
        }
        zzX();
        return true;
    }

    public final boolean zzp() {
        return this.zzl.zzl() && this.zzn.zzd();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzyr zzu(com.google.android.gms.internal.ads.zzyt r23, long r24, long r26, java.io.IOException r28, int r29) {
        /*
            r22 = this;
            r0 = r22
            r1 = r28
            r2 = r23
            com.google.android.gms.internal.ads.zzvf r2 = (com.google.android.gms.internal.ads.zzvf) r2
            com.google.android.gms.internal.ads.zzgx r3 = r2.zzd
            com.google.android.gms.internal.ads.zztx r14 = new com.google.android.gms.internal.ads.zztx
            long r5 = r2.zzb
            com.google.android.gms.internal.ads.zzgd r7 = r2.zzl
            android.net.Uri r8 = r3.zzh()
            java.util.Map r9 = r3.zzi()
            long r15 = r3.zzg()
            r4 = r14
            r10 = r24
            r12 = r26
            r3 = r14
            r14 = r15
            r4.<init>(r5, r7, r8, r9, r10, r12, r14)
            long unused = r2.zzk
            int r4 = com.google.android.gms.internal.ads.zzei.zza
            boolean r4 = r1 instanceof com.google.android.gms.internal.ads.zzbc
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 != 0) goto L_0x0068
            boolean r4 = r1 instanceof java.io.FileNotFoundException
            if (r4 != 0) goto L_0x0068
            boolean r4 = r1 instanceof com.google.android.gms.internal.ads.zzgo
            if (r4 != 0) goto L_0x0068
            boolean r4 = r1 instanceof com.google.android.gms.internal.ads.zzyw
            if (r4 != 0) goto L_0x0068
            r4 = r1
        L_0x0047:
            if (r4 == 0) goto L_0x005c
            boolean r7 = r4 instanceof com.google.android.gms.internal.ads.zzfz
            if (r7 == 0) goto L_0x0057
            r7 = r4
            com.google.android.gms.internal.ads.zzfz r7 = (com.google.android.gms.internal.ads.zzfz) r7
            int r7 = r7.zza
            r8 = 2008(0x7d8, float:2.814E-42)
            if (r7 != r8) goto L_0x0057
            goto L_0x0068
        L_0x0057:
            java.lang.Throwable r4 = r4.getCause()
            goto L_0x0047
        L_0x005c:
            int r4 = r29 + -1
            int r4 = r4 * 1000
            r7 = 5000(0x1388, float:7.006E-42)
            int r4 = java.lang.Math.min(r4, r7)
            long r7 = (long) r4
            goto L_0x0069
        L_0x0068:
            r7 = r5
        L_0x0069:
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x0070
            com.google.android.gms.internal.ads.zzyr r4 = com.google.android.gms.internal.ads.zzyy.zzb
            goto L_0x00bd
        L_0x0070:
            int r4 = r22.zzQ()
            int r9 = r0.zzM
            r10 = 1
            r11 = 0
            if (r4 <= r9) goto L_0x007c
            r9 = 1
            goto L_0x007d
        L_0x007c:
            r9 = 0
        L_0x007d:
            boolean r12 = r0.zzI
            if (r12 != 0) goto L_0x00b7
            com.google.android.gms.internal.ads.zzadm r12 = r0.zzA
            if (r12 == 0) goto L_0x008e
            long r12 = r12.zza()
            int r14 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r14 == 0) goto L_0x008e
            goto L_0x00b7
        L_0x008e:
            boolean r4 = r0.zzw
            if (r4 == 0) goto L_0x009d
            boolean r5 = r22.zzZ()
            if (r5 != 0) goto L_0x009d
            r0.zzL = r10
            com.google.android.gms.internal.ads.zzyr r4 = com.google.android.gms.internal.ads.zzyy.zza
            goto L_0x00bd
        L_0x009d:
            r0.zzF = r4
            r4 = 0
            r0.zzJ = r4
            r0.zzM = r11
            com.google.android.gms.internal.ads.zzvx[] r6 = r0.zzt
            int r10 = r6.length
            r12 = 0
        L_0x00a9:
            if (r12 >= r10) goto L_0x00b3
            r13 = r6[r12]
            r13.zzq(r11)
            int r12 = r12 + 1
            goto L_0x00a9
        L_0x00b3:
            com.google.android.gms.internal.ads.zzvf.zzf(r2, r4, r4)
            goto L_0x00b9
        L_0x00b7:
            r0.zzM = r4
        L_0x00b9:
            com.google.android.gms.internal.ads.zzyr r4 = com.google.android.gms.internal.ads.zzyy.zzb(r9, r7)
        L_0x00bd:
            boolean r5 = r4.zzc()
            r6 = r5 ^ 1
            com.google.android.gms.internal.ads.zzuq r7 = r0.zzg
            long r8 = r2.zzk
            long r10 = r0.zzB
            long r18 = com.google.android.gms.internal.ads.zzei.zzv(r8)
            long r20 = com.google.android.gms.internal.ads.zzei.zzv(r10)
            com.google.android.gms.internal.ads.zzuc r8 = new com.google.android.gms.internal.ads.zzuc
            r16 = 0
            r17 = 0
            r13 = 1
            r14 = -1
            r15 = 0
            r12 = r8
            r12.<init>(r13, r14, r15, r16, r17, r18, r20)
            r7.zzg(r3, r8, r1, r6)
            if (r5 != 0) goto L_0x00e8
            long unused = r2.zzb
        L_0x00e8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvk.zzu(com.google.android.gms.internal.ads.zzyt, long, long, java.io.IOException, int):com.google.android.gms.internal.ads.zzyr");
    }

    /* access modifiers changed from: package-private */
    public final zzadt zzv() {
        return zzS(new zzvi(0, true));
    }

    public final zzadt zzw(int i, int i2) {
        return zzS(new zzvi(i, false));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzE() {
        if (!this.zzO) {
            zzud zzud = this.zzr;
            zzud.getClass();
            zzud zzud2 = zzud;
            zzud.zzg(this);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzG(zzadm zzadm) {
        zzadm zzadm2;
        if (this.zzs == null) {
            zzadm2 = zzadm;
        } else {
            zzadm2 = new zzadl(-9223372036854775807L, 0);
        }
        this.zzA = zzadm2;
        this.zzB = zzadm.zza();
        boolean z = false;
        int i = 1;
        if (!this.zzI && zzadm.zza() == -9223372036854775807L) {
            z = true;
        }
        this.zzC = z;
        if (true == z) {
            i = 7;
        }
        this.zzD = i;
        if (this.zzw) {
            this.zzi.zza(this.zzB, zzadm.zzh(), this.zzC);
        } else {
            zzU();
        }
    }
}
