package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzlo {
    private final zzlj zza;
    private final int zzb;
    private boolean zzc = false;

    public zzlo(zzlj zzlj, int i) {
        this.zza = zzlj;
        this.zzb = i;
    }

    private static final void zzA(zzlj zzlj) {
        if (zzlj.zzcT() == 2) {
            zzlj.zzP();
        }
    }

    private static boolean zzz(zzlj zzlj) {
        return zzlj.zzcT() != 0;
    }

    public final int zza() {
        return zzz(this.zza) ? 1 : 0;
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final long zzc(zzkl zzkl) {
        zzcw.zzf(zzy(zzkl));
        return this.zza.zzcV();
    }

    public final void zzd(zzia zzia) {
        zzlj zzlj = this.zza;
        if (zzz(zzlj)) {
            zzia.zzd(zzlj);
            zzA(zzlj);
            zzlj.zzr();
        }
    }

    public final void zze(zzln zzln, zzab[] zzabArr, zzvy zzvy, long j, boolean z, boolean z2, long j2, long j3, zzug zzug, zzia zzia) throws zzib {
        this.zzc = true;
        this.zza.zzs(zzln, zzabArr, zzvy, j, z, z2, j2, j3, zzug);
        zzia.zze(this.zza);
    }

    public final void zzf() {
        if (zzz(this.zza)) {
            this.zza.zzt();
        }
    }

    public final void zzg(int i, Object obj) throws zzib {
        this.zza.zzu(11, obj);
    }

    public final void zzh() throws IOException {
        this.zza.zzw();
    }

    public final void zzi() {
        this.zza.zzG();
        this.zzc = false;
    }

    public final void zzj(long j, long j2) throws zzib {
        if (zzz(this.zza)) {
            this.zza.zzV(j, j2);
        }
    }

    public final void zzk(zzab[] zzabArr, zzvy zzvy, long j, long j2, zzug zzug) throws zzib {
        this.zza.zzH(zzabArr, zzvy, j, j2, zzug);
    }

    public final void zzl() {
        if (this.zzc) {
            this.zza.zzI();
            this.zzc = false;
        }
    }

    public final void zzm(long j) throws zzib {
        if (zzz(this.zza)) {
            this.zza.zzJ(j);
        }
    }

    public final void zzn(long j) {
        zzlj zzlj = this.zza;
        zzlj.zzK();
        if (zzlj instanceof zzwn) {
            zzwn zzwn = (zzwn) zzlj;
            throw null;
        }
    }

    public final void zzo(float f, float f2) throws zzib {
        this.zza.zzM(f, f2);
    }

    public final void zzp(zzbq zzbq) {
        this.zza.zzN(zzbq);
    }

    public final void zzq(Object obj) throws zzib {
        if (this.zza.zzb() == 2) {
            this.zza.zzu(1, obj);
        }
    }

    public final void zzr() throws zzib {
        if (this.zza.zzcT() == 1) {
            this.zza.zzO();
        }
    }

    public final void zzs() {
        if (zzz(this.zza)) {
            zzA(this.zza);
        }
    }

    public final boolean zzt(zzkl zzkl) throws IOException {
        zzvy zzvy = zzkl.zzc[this.zzb];
        zzlj zzlj = this.zza;
        boolean z = zzvy != zzlj.zzp();
        return z || (!z && zzlj.zzQ()) || zzlj.zzX() || zzlj.zzW();
    }

    public final boolean zzu(zzkl zzkl) {
        zzvy zzvy = zzkl.zzc[this.zzb];
        if (this.zza.zzp() != zzvy) {
            return false;
        }
        if (zzvy == null || this.zza.zzQ()) {
            return true;
        }
        zzkl.zzg();
        boolean z = zzkl.zzg.zzf;
        return false;
    }

    public final boolean zzv() {
        return this.zza.zzQ();
    }

    public final boolean zzw() {
        return this.zza.zzR();
    }

    public final boolean zzx() {
        return this.zza.zzW();
    }

    public final boolean zzy(zzkl zzkl) {
        zzlj zzlj = null;
        if (zzkl != null) {
            int i = this.zzb;
            zzvy[] zzvyArr = zzkl.zzc;
            if (zzvyArr[i] != null && this.zza.zzp() == zzvyArr[i]) {
                zzlj = this.zza;
            }
        }
        return zzlj != null;
    }
}
