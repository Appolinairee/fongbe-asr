package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzajl implements zzacn {
    private zzacq zza;
    private zzajt zzb;
    private boolean zzc;

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    private final boolean zza(zzaco zzaco) throws IOException {
        zzajn zzajn = new zzajn();
        if (zzajn.zzb(zzaco, true) && (zzajn.zza & 2) == 2) {
            int min = Math.min(zzajn.zze, 8);
            zzdy zzdy = new zzdy(min);
            zzaco.zzh(zzdy.zzN(), 0, min);
            zzdy.zzL(0);
            if (zzdy.zzb() >= 5 && zzdy.zzm() == 127 && zzdy.zzu() == 1179402563) {
                this.zzb = new zzajk();
            } else {
                zzdy.zzL(0);
                try {
                    if (zzadz.zzd(1, zzdy, true)) {
                        this.zzb = new zzajv();
                    }
                } catch (zzbc unused) {
                }
                zzdy.zzL(0);
                if (zzajp.zzd(zzdy)) {
                    this.zzb = new zzajp();
                }
            }
            return true;
        }
        return false;
    }

    public final int zzb(zzaco zzaco, zzadj zzadj) throws IOException {
        zzcw.zzb(this.zza);
        if (this.zzb == null) {
            if (zza(zzaco)) {
                zzaco.zzj();
            } else {
                throw zzbc.zza("Failed to determine bitstream type", (Throwable) null);
            }
        }
        if (!this.zzc) {
            zzadt zzw = this.zza.zzw(0, 1);
            this.zza.zzD();
            this.zzb.zzh(this.zza, zzw);
            this.zzc = true;
        }
        return this.zzb.zze(zzaco, zzadj);
    }

    public final /* synthetic */ zzacn zzc() {
        return this;
    }

    public final /* synthetic */ List zzd() {
        return zzfxn.zzn();
    }

    public final void zze(zzacq zzacq) {
        this.zza = zzacq;
    }

    public final void zzf(long j, long j2) {
        zzajt zzajt = this.zzb;
        if (zzajt != null) {
            zzajt.zzj(j, j2);
        }
    }

    public final boolean zzi(zzaco zzaco) throws IOException {
        try {
            return zza(zzaco);
        } catch (zzbc unused) {
            return false;
        }
    }
}
