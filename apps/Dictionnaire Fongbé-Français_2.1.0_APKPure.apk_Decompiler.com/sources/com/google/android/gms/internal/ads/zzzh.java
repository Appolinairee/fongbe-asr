package com.google.android.gms.internal.ads;

import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzzh implements zzabh {
    private final zzaal zza;
    private final zzaaq zzb;
    private zzab zzc = new zzz().zzag();

    public zzzh(zzaal zzaal, zzaaq zzaaq) {
        this.zza = zzaal;
        this.zzb = zzaaq;
    }

    public final Surface zza() {
        throw new UnsupportedOperationException();
    }

    public final void zzb() {
        this.zza.zzm((Surface) null);
    }

    public final void zzc() {
        this.zza.zzb();
    }

    public final void zzd(boolean z) {
        if (z) {
            this.zza.zzi();
        }
        this.zzb.zza();
    }

    public final void zze(zzab zzab) {
    }

    public final void zzf(boolean z) {
        this.zza.zzc(z);
    }

    public final void zzg(int i, zzab zzab) {
        zzab zzab2 = this.zzc;
        int i2 = zzab2.zzv;
        int i3 = zzab.zzv;
        if (!(i3 == i2 && zzab.zzw == zzab2.zzw)) {
            this.zzb.zzb(i3, zzab.zzw);
        }
        float f = zzab.zzx;
        if (f != this.zzc.zzx) {
            this.zza.zzl(f);
        }
        this.zzc = zzab;
    }

    public final void zzh() {
        this.zza.zzd();
    }

    public final void zzi(boolean z) {
        this.zza.zze(z);
    }

    public final void zzj() {
        this.zza.zzg();
    }

    public final void zzk() {
        this.zza.zzh();
    }

    public final void zzl() {
    }

    public final void zzn(int i) {
        this.zza.zzj(i);
    }

    public final void zzo(zzabe zzabe, Executor executor) {
        throw new UnsupportedOperationException();
    }

    public final void zzp(Surface surface, zzdz zzdz) {
        this.zza.zzm(surface);
    }

    public final void zzq(float f) {
        this.zza.zzn(f);
    }

    public final void zzr(long j, long j2, long j3, long j4) {
        throw new UnsupportedOperationException();
    }

    public final void zzs(List list) {
        throw new UnsupportedOperationException();
    }

    public final void zzt(zzaai zzaai) {
        throw new UnsupportedOperationException();
    }

    public final boolean zzu(long j, boolean z, long j2, long j3, zzabf zzabf) {
        throw new UnsupportedOperationException();
    }

    public final boolean zzv() {
        throw new UnsupportedOperationException();
    }

    public final boolean zzw() {
        return true;
    }

    public final boolean zzx(boolean z) {
        return this.zza.zzo(z);
    }

    public final void zzm(long j, long j2) throws zzabg {
        try {
            this.zzb.zzd(j, j2);
        } catch (zzib e) {
            throw new zzabg(e, this.zzc);
        }
    }
}
