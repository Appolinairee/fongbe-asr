package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzty implements zzue, zzud {
    public final zzug zza;
    private final long zzb;
    private zzui zzc;
    private zzue zzd;
    private zzud zze;
    private long zzf = -9223372036854775807L;
    private final zzyk zzg;

    public zzty(zzug zzug, zzyk zzyk, long j) {
        this.zza = zzug;
        this.zzg = zzyk;
        this.zzb = j;
    }

    private final long zzv(long j) {
        long j2 = this.zzf;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    public final long zza(long j, zzlp zzlp) {
        zzue zzue = this.zzd;
        int i = zzei.zza;
        zzue zzue2 = zzue;
        return zzue.zza(j, zzlp);
    }

    public final long zzb() {
        zzue zzue = this.zzd;
        int i = zzei.zza;
        zzue zzue2 = zzue;
        return zzue.zzb();
    }

    public final long zzc() {
        zzue zzue = this.zzd;
        int i = zzei.zza;
        zzue zzue2 = zzue;
        return zzue.zzc();
    }

    public final long zzd() {
        zzue zzue = this.zzd;
        int i = zzei.zza;
        zzue zzue2 = zzue;
        return zzue.zzd();
    }

    public final long zze(long j) {
        zzue zzue = this.zzd;
        int i = zzei.zza;
        zzue zzue2 = zzue;
        return zzue.zze(j);
    }

    public final long zzf(zzxv[] zzxvArr, boolean[] zArr, zzvy[] zzvyArr, boolean[] zArr2, long j) {
        long j2 = this.zzf;
        long j3 = (j2 == -9223372036854775807L || j != this.zzb) ? j : j2;
        this.zzf = -9223372036854775807L;
        zzue zzue = this.zzd;
        int i = zzei.zza;
        zzue zzue2 = zzue;
        return zzue.zzf(zzxvArr, zArr, zzvyArr, zArr2, j3);
    }

    public final /* bridge */ /* synthetic */ void zzg(zzwa zzwa) {
        zzue zzue = (zzue) zzwa;
        zzud zzud = this.zze;
        int i = zzei.zza;
        zzud zzud2 = zzud;
        zzud.zzg(this);
    }

    public final zzwj zzh() {
        zzue zzue = this.zzd;
        int i = zzei.zza;
        zzue zzue2 = zzue;
        return zzue.zzh();
    }

    public final void zzi(zzue zzue) {
        zzud zzud = this.zze;
        int i = zzei.zza;
        zzud zzud2 = zzud;
        zzud.zzi(this);
    }

    public final void zzj(long j, boolean z) {
        zzue zzue = this.zzd;
        int i = zzei.zza;
        zzue zzue2 = zzue;
        zzue.zzj(j, false);
    }

    public final void zzk() throws IOException {
        zzue zzue = this.zzd;
        if (zzue != null) {
            zzue.zzk();
            return;
        }
        zzui zzui = this.zzc;
        if (zzui != null) {
            zzui.zzz();
        }
    }

    public final void zzl(zzud zzud, long j) {
        this.zze = zzud;
        zzue zzue = this.zzd;
        if (zzue != null) {
            zzue.zzl(this, zzv(this.zzb));
        }
    }

    public final void zzm(long j) {
        zzue zzue = this.zzd;
        int i = zzei.zza;
        zzue zzue2 = zzue;
        zzue.zzm(j);
    }

    public final long zzn() {
        return this.zzf;
    }

    public final boolean zzo(zzkj zzkj) {
        zzue zzue = this.zzd;
        return zzue != null && zzue.zzo(zzkj);
    }

    public final boolean zzp() {
        zzue zzue = this.zzd;
        return zzue != null && zzue.zzp();
    }

    public final long zzq() {
        return this.zzb;
    }

    public final void zzr(zzug zzug) {
        long zzv = zzv(this.zzb);
        zzui zzui = this.zzc;
        zzui.getClass();
        zzui zzui2 = zzui;
        zzue zzI = zzui.zzI(zzug, this.zzg, zzv);
        this.zzd = zzI;
        if (this.zze != null) {
            zzI.zzl(this, zzv);
        }
    }

    public final void zzs(long j) {
        this.zzf = j;
    }

    public final void zzu(zzui zzui) {
        zzcw.zzf(this.zzc == null);
        this.zzc = zzui;
    }

    public final void zzt() {
        zzue zzue = this.zzd;
        if (zzue != null) {
            zzui zzui = this.zzc;
            zzui.getClass();
            zzui zzui2 = zzui;
            zzui.zzG(zzue);
        }
    }
}
