package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzaab implements zzabh, zzaac {
    final /* synthetic */ zzaah zza;
    private final int zzb;
    private final ArrayList zzc;
    private final zzaaj zzd;
    private zzab zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private boolean zzj;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private long zzn;
    private zzabe zzo;
    private Executor zzp;

    public zzaab(zzaah zzaah, Context context) {
        this.zza = zzaah;
        this.zzb = true != zzei.zzK(context) ? 5 : 1;
        this.zzc = new ArrayList();
        this.zzd = new zzaaj();
        this.zzk = -9223372036854775807L;
        this.zzo = zzabe.zzb;
        this.zzp = zzaah.zza;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [com.google.android.gms.internal.ads.zzcb, java.lang.Throwable, java.lang.Object] */
    private final void zzB() {
        if (this.zze != null) {
            new ArrayList(this.zzc);
            zzab zzab = this.zze;
            zzab.getClass();
            zzab zzab2 = zzab;
            zzz zzb2 = zzab.zzb();
            zzb2.zzB(zzaah.zzw(zzab.zzC));
            zzb2.zzag();
            ? r0 = 0;
            zzcw.zzb(r0);
            zzcb zzcb = r0;
            r0.zzd();
            throw r0;
        }
    }

    public final void zzA(zzaah zzaah, zzcd zzcd) {
        this.zzp.execute(new zzzy(this, this.zzo, zzcd));
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.zzcb, java.lang.Throwable, java.lang.Object] */
    public final Surface zza() {
        zzcw.zzf(false);
        ? r0 = 0;
        zzcw.zzb(r0);
        zzcb zzcb = r0;
        r0.zzb();
        throw r0;
    }

    public final void zzb() {
        this.zza.zzq();
    }

    public final void zzc() {
        this.zza.zzh.zzc();
    }

    public final void zzd(boolean z) {
        this.zzl = false;
        this.zzk = -9223372036854775807L;
        zzaah.zzl(this.zza, z);
        this.zzn = -9223372036854775807L;
    }

    public final void zze(zzab zzab) throws zzabg {
        zzaah.zzc(this.zza, zzab);
    }

    public final void zzf(boolean z) {
        this.zza.zzh.zzf(z);
    }

    public final void zzg(int i, zzab zzab) {
        boolean z = false;
        zzcw.zzf(false);
        this.zze = zzab;
        if (!this.zzl) {
            zzB();
            this.zzl = true;
            this.zzm = false;
            this.zzn = -9223372036854775807L;
            return;
        }
        if (this.zzk != -9223372036854775807L) {
            z = true;
        }
        zzcw.zzf(z);
        this.zzm = true;
        this.zzn = this.zzk;
    }

    public final void zzh() {
        this.zza.zzh.zzh();
    }

    public final void zzi(boolean z) {
        this.zza.zzh.zzi(z);
    }

    public final void zzj() {
        this.zza.zzh.zzj();
    }

    public final void zzk() {
        this.zza.zzh.zzk();
    }

    public final void zzl() {
        this.zza.zzs();
    }

    public final void zzm(long j, long j2) throws zzabg {
        this.zza.zzh.zzm(j, j2);
    }

    public final void zzn(int i) {
        this.zza.zzh.zzn(i);
    }

    public final void zzo(zzabe zzabe, Executor executor) {
        this.zzo = zzabe;
        this.zzp = executor;
    }

    public final void zzp(Surface surface, zzdz zzdz) {
        this.zza.zzt(surface, zzdz);
    }

    public final void zzq(float f) {
        this.zza.zzh.zzq(f);
    }

    public final void zzr(long j, long j2, long j3, long j4) {
        boolean z = this.zzj;
        boolean z2 = true;
        if (this.zzg == j2 && this.zzh == j3) {
            z2 = false;
        }
        this.zzj = z | z2;
        this.zzf = j;
        this.zzg = j2;
        this.zzh = j3;
        this.zzi = j4;
    }

    public final void zzs(List list) {
        if (!this.zzc.equals(list)) {
            this.zzc.clear();
            this.zzc.addAll(list);
            this.zzc.addAll(this.zza.zzg);
            zzB();
        }
    }

    public final void zzt(zzaai zzaai) {
        this.zza.zzk = zzaai;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [com.google.android.gms.internal.ads.zzcb, java.lang.Throwable, java.lang.Object] */
    public final boolean zzu(long j, boolean z, long j2, long j3, zzabf zzabf) throws zzabg {
        zzcw.zzf(false);
        long j4 = j - this.zzh;
        try {
            if (this.zza.zzd.zza(j4, j2, j3, this.zzf, z, this.zzd) != 4) {
                if (j4 >= this.zzi || z) {
                    this.zza.zzh.zzm(j2, j3);
                    if (this.zzm) {
                        long j5 = this.zzn;
                        if (j5 == -9223372036854775807L || zzaah.zzu(this.zza, j5)) {
                            zzB();
                            this.zzm = false;
                            this.zzn = -9223372036854775807L;
                        }
                    }
                    ? r0 = 0;
                    zzcw.zzb(r0);
                    zzcb zzcb = r0;
                    r0.zza();
                    throw r0;
                }
                zzzm zzzm = (zzzm) zzabf;
                zzzm.zzd.zzaQ(zzzm.zza, zzzm.zzb, zzzm.zzc);
                return true;
            }
            return false;
        } catch (zzib e) {
            zzab zzab = this.zze;
            zzcw.zzb(zzab);
            zzab zzab2 = zzab;
            throw new zzabg(e, zzab);
        }
    }

    public final boolean zzv() {
        return false;
    }

    @EnsuresNonNullIf(expression = {"videoFrameProcessor"}, result = true)
    public final boolean zzw() {
        return false;
    }

    public final boolean zzx(boolean z) {
        return this.zza.zzh.zzx(false);
    }

    public final void zzy(zzaah zzaah) {
        this.zzp.execute(new zzzz(this, this.zzo));
    }

    public final void zzz(zzaah zzaah) {
        this.zzp.execute(new zzaaa(this, this.zzo));
    }
}
