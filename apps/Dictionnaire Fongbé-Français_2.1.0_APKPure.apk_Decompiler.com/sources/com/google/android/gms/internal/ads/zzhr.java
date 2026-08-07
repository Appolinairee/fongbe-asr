package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public abstract class zzhr implements zzlj, zzlm {
    private final Object zza = new Object();
    private final int zzb;
    private final zzke zzc;
    private zzln zzd;
    private int zze;
    private zzog zzf;
    private zzcx zzg;
    private int zzh;
    private zzvy zzi;
    private zzab[] zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private boolean zzn;
    private boolean zzo;
    private zzbq zzp;
    private zzll zzq;

    public zzhr(int i) {
        this.zzb = i;
        this.zzc = new zzke();
        this.zzm = Long.MIN_VALUE;
        this.zzp = zzbq.zza;
    }

    private final void zzZ(long j, boolean z) throws zzib {
        this.zzn = false;
        this.zzl = j;
        this.zzm = j;
        zzz(j, z);
    }

    /* access modifiers changed from: protected */
    public void zzA() {
    }

    /* access modifiers changed from: protected */
    public final void zzB() {
        zzll zzll;
        synchronized (this.zza) {
            zzll = this.zzq;
        }
        if (zzll != null) {
            zzll.zza(this);
        }
    }

    /* access modifiers changed from: protected */
    public void zzC() {
    }

    /* access modifiers changed from: protected */
    public void zzD() throws zzib {
    }

    /* access modifiers changed from: protected */
    public void zzE() {
    }

    /* access modifiers changed from: protected */
    public void zzF(zzab[] zzabArr, long j, long j2, zzug zzug) throws zzib {
    }

    public final void zzG() {
        zzcw.zzf(this.zzh == 0);
        zzA();
    }

    public final void zzH(zzab[] zzabArr, zzvy zzvy, long j, long j2, zzug zzug) throws zzib {
        zzcw.zzf(!this.zzn);
        this.zzi = zzvy;
        if (this.zzm == Long.MIN_VALUE) {
            this.zzm = j;
        }
        this.zzj = zzabArr;
        this.zzk = j2;
        zzF(zzabArr, j, j2, zzug);
    }

    public final void zzI() {
        zzcw.zzf(this.zzh == 0);
        zzke zzke = this.zzc;
        zzke.zzb = null;
        zzke.zza = null;
        zzC();
    }

    public final void zzJ(long j) throws zzib {
        zzZ(j, false);
    }

    public final void zzK() {
        this.zzn = true;
    }

    public final void zzL(zzll zzll) {
        synchronized (this.zza) {
            this.zzq = zzll;
        }
    }

    public /* synthetic */ void zzM(float f, float f2) {
    }

    public final void zzN(zzbq zzbq) {
        if (!Objects.equals(this.zzp, zzbq)) {
            this.zzp = zzbq;
        }
    }

    public final void zzO() throws zzib {
        boolean z = true;
        if (this.zzh != 1) {
            z = false;
        }
        zzcw.zzf(z);
        this.zzh = 2;
        zzD();
    }

    public final void zzP() {
        zzcw.zzf(this.zzh == 2);
        this.zzh = 1;
        zzE();
    }

    public final boolean zzQ() {
        return this.zzm == Long.MIN_VALUE;
    }

    public final boolean zzR() {
        return this.zzn;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzcT() {
        return this.zzh;
    }

    /* access modifiers changed from: protected */
    public final int zzcU(zzke zzke, zzhh zzhh, int i) {
        zzvy zzvy = this.zzi;
        zzvy.getClass();
        zzvy zzvy2 = zzvy;
        int zza2 = zzvy.zza(zzke, zzhh, i);
        if (zza2 == -4) {
            if (zzhh.zzf()) {
                this.zzm = Long.MIN_VALUE;
                return this.zzn ? -4 : -3;
            }
            long j = zzhh.zze + this.zzk;
            zzhh.zze = j;
            this.zzm = Math.max(this.zzm, j);
        } else if (zza2 == -5) {
            zzab zzab = zzke.zza;
            zzab.getClass();
            zzab zzab2 = zzab;
            long j2 = zzab.zzt;
            if (j2 != Long.MAX_VALUE) {
                zzz zzb2 = zzab.zzb();
                zzb2.zzae(j2 + this.zzk);
                zzke.zza = zzb2.zzag();
                return -5;
            }
        }
        return zza2;
    }

    public final long zzcV() {
        return this.zzm;
    }

    /* access modifiers changed from: protected */
    public final zzib zzcW(Throwable th, zzab zzab, boolean z, int i) {
        int i2;
        if (zzab != null && !this.zzo) {
            this.zzo = true;
            try {
                int zzY = zzY(zzab) & 7;
                this.zzo = false;
                i2 = zzY;
            } catch (zzib unused) {
                this.zzo = false;
            } catch (Throwable th2) {
                this.zzo = false;
                throw th2;
            }
            return zzib.zzb(th, zzU(), this.zze, zzab, i2, z, i);
        }
        i2 = 4;
        return zzib.zzb(th, zzU(), this.zze, zzab, i2, z, i);
    }

    public int zze() throws zzib {
        return 0;
    }

    /* access modifiers changed from: protected */
    public final long zzf() {
        return this.zzl;
    }

    /* access modifiers changed from: protected */
    public final zzbq zzh() {
        return this.zzp;
    }

    /* access modifiers changed from: protected */
    public final zzke zzk() {
        zzke zzke = this.zzc;
        zzke.zzb = null;
        zzke.zza = null;
        return zzke;
    }

    public zzkk zzl() {
        return null;
    }

    public final zzlm zzm() {
        return this;
    }

    public final zzvy zzp() {
        return this.zzi;
    }

    public final void zzq() {
        synchronized (this.zza) {
            this.zzq = null;
        }
    }

    public final void zzr() {
        boolean z = true;
        if (this.zzh != 1) {
            z = false;
        }
        zzcw.zzf(z);
        zzke zzke = this.zzc;
        zzke.zzb = null;
        zzke.zza = null;
        this.zzh = 0;
        this.zzi = null;
        this.zzj = null;
        this.zzn = false;
        zzx();
    }

    public final void zzs(zzln zzln, zzab[] zzabArr, zzvy zzvy, long j, boolean z, boolean z2, long j2, long j3, zzug zzug) throws zzib {
        boolean z3 = z;
        zzcw.zzf(this.zzh == 0);
        this.zzd = zzln;
        this.zzh = 1;
        zzy(z3, z2);
        zzH(zzabArr, zzvy, j2, j3, zzug);
        zzZ(j2, z3);
    }

    public /* synthetic */ void zzt() {
    }

    public void zzu(int i, Object obj) throws zzib {
    }

    public final void zzv(int i, zzog zzog, zzcx zzcx) {
        this.zze = i;
        this.zzf = zzog;
        this.zzg = zzcx;
    }

    /* access modifiers changed from: protected */
    public void zzx() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzy(boolean z, boolean z2) throws zzib {
    }

    /* access modifiers changed from: protected */
    public void zzz(long j, boolean z) throws zzib {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final boolean zzS() {
        if (zzQ()) {
            return this.zzn;
        }
        zzvy zzvy = this.zzi;
        zzvy.getClass();
        zzvy zzvy2 = zzvy;
        return zzvy.zze();
    }

    /* access modifiers changed from: protected */
    public final zzab[] zzT() {
        zzab[] zzabArr = this.zzj;
        zzabArr.getClass();
        return zzabArr;
    }

    /* access modifiers changed from: protected */
    public final int zzd(long j) {
        zzvy zzvy = this.zzi;
        zzvy.getClass();
        zzvy zzvy2 = zzvy;
        return zzvy.zzb(j - this.zzk);
    }

    /* access modifiers changed from: protected */
    public final zzcx zzi() {
        zzcx zzcx = this.zzg;
        zzcx.getClass();
        zzcx zzcx2 = zzcx;
        return zzcx;
    }

    /* access modifiers changed from: protected */
    public final zzln zzn() {
        zzln zzln = this.zzd;
        zzln.getClass();
        zzln zzln2 = zzln;
        return zzln;
    }

    /* access modifiers changed from: protected */
    public final zzog zzo() {
        zzog zzog = this.zzf;
        zzog.getClass();
        zzog zzog2 = zzog;
        return zzog;
    }

    public final void zzw() throws IOException {
        zzvy zzvy = this.zzi;
        zzvy.getClass();
        zzvy zzvy2 = zzvy;
        zzvy.zzd();
    }
}
