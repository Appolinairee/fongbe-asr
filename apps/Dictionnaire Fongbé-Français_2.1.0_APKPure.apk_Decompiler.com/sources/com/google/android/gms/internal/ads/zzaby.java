package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public class zzaby {
    protected final zzabs zza;
    protected final zzabx zzb;
    protected zzabu zzc;
    private final int zzd;

    protected zzaby(zzabv zzabv, zzabx zzabx, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.zzb = zzabx;
        this.zzd = i;
        this.zza = new zzabs(zzabv, j, 0, j3, j4, j5, j6);
    }

    protected static final int zzf(zzaco zzaco, long j, zzadj zzadj) {
        if (j == zzaco.zzf()) {
            return 0;
        }
        zzadj.zza = j;
        return 1;
    }

    protected static final boolean zzg(zzaco zzaco, long j) throws IOException {
        long zzf = j - zzaco.zzf();
        if (zzf < 0 || zzf > 262144) {
            return false;
        }
        zzaco.zzk((int) zzf);
        return true;
    }

    public final int zza(zzaco zzaco, zzadj zzadj) throws IOException {
        while (true) {
            zzabu zzabu = this.zzc;
            zzcw.zzb(zzabu);
            zzabu zzabu2 = zzabu;
            long zzb2 = zzabu.zzf;
            long zza2 = zzabu.zzg;
            long zzc2 = zzabu.zzh;
            if (zza2 - zzb2 <= ((long) this.zzd)) {
                zzc(false, zzb2);
                return zzf(zzaco, zzb2, zzadj);
            } else if (!zzg(zzaco, zzc2)) {
                return zzf(zzaco, zzc2, zzadj);
            } else {
                zzaco.zzj();
                zzabw zza3 = this.zzb.zza(zzaco, zzabu.zzb);
                int zza4 = zza3.zzb;
                if (zza4 == -3) {
                    zzc(false, zzc2);
                    return zzf(zzaco, zzc2, zzadj);
                } else if (zza4 == -2) {
                    zzabu.zzh(zzabu, zza3.zzc, zza3.zzd);
                } else if (zza4 != -1) {
                    zzg(zzaco, zza3.zzd);
                    zzc(true, zza3.zzd);
                    return zzf(zzaco, zza3.zzd, zzadj);
                } else {
                    zzabu.zzg(zzabu, zza3.zzc, zza3.zzd);
                }
            }
        }
    }

    public final zzadm zzb() {
        return this.zza;
    }

    /* access modifiers changed from: protected */
    public final void zzc(boolean z, long j) {
        this.zzc = null;
        this.zzb.zzb();
    }

    public final void zzd(long j) {
        long j2 = j;
        zzabu zzabu = this.zzc;
        if (zzabu == null || zzabu.zza != j2) {
            zzabs zzabs = this.zza;
            zzabu zzabu2 = r1;
            zzabu zzabu3 = new zzabu(j, zzabs.zzf(j2), 0, zzabs.zzc, zzabs.zzd, zzabs.zze, zzabs.zzf);
            this.zzc = zzabu2;
        }
    }

    public final boolean zze() {
        return this.zzc != null;
    }
}
