package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzkw implements zzur, zzrb {
    final /* synthetic */ zzla zza;
    private final zzky zzb;

    public zzkw(zzla zzla, zzky zzky) {
        this.zza = zzla;
        this.zzb = zzky;
    }

    private final Pair zzf(int i, zzug zzug) {
        zzug zzug2;
        zzug zzug3 = null;
        if (zzug != null) {
            zzky zzky = this.zzb;
            int i2 = 0;
            while (true) {
                if (i2 >= zzky.zzc.size()) {
                    zzug2 = null;
                    break;
                } else if (((zzug) zzky.zzc.get(i2)).zzd == zzug.zzd) {
                    zzug2 = zzug.zza(Pair.create(zzky.zzb, zzug.zza));
                    break;
                } else {
                    i2++;
                }
            }
            if (zzug2 == null) {
                return null;
            }
            zzug3 = zzug2;
        }
        return Pair.create(Integer.valueOf(this.zzb.zzd), zzug3);
    }

    public final void zzaf(int i, zzug zzug, zzuc zzuc) {
        Pair zzf = zzf(0, zzug);
        if (zzf != null) {
            this.zza.zzi.zzh(new zzku(this, zzf, zzuc));
        }
    }

    public final void zzag(int i, zzug zzug, zztx zztx, zzuc zzuc) {
        Pair zzf = zzf(0, zzug);
        if (zzf != null) {
            this.zza.zzi.zzh(new zzks(this, zzf, zztx, zzuc));
        }
    }

    public final void zzah(int i, zzug zzug, zztx zztx, zzuc zzuc) {
        Pair zzf = zzf(0, zzug);
        if (zzf != null) {
            this.zza.zzi.zzh(new zzkv(this, zzf, zztx, zzuc));
        }
    }

    public final void zzai(int i, zzug zzug, zztx zztx, zzuc zzuc, IOException iOException, boolean z) {
        Pair zzf = zzf(0, zzug);
        if (zzf != null) {
            this.zza.zzi.zzh(new zzkr(this, zzf, zztx, zzuc, iOException, z));
        }
    }

    public final void zzaj(int i, zzug zzug, zztx zztx, zzuc zzuc) {
        Pair zzf = zzf(0, zzug);
        if (zzf != null) {
            this.zza.zzi.zzh(new zzkt(this, zzf, zztx, zzuc));
        }
    }
}
