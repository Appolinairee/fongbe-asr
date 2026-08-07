package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzbxx {
    private final zzg zza;

    zzbxx(Clock clock, zzg zzg, zzbyi zzbyi) {
        this.zza = zzg;
    }

    public final void zza(int i, long j) {
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzaD)).booleanValue()) {
            if (j - this.zza.zzf() < 0) {
                zze.zza("Receiving npa decision in the past, ignoring.");
                return;
            }
            if (!((Boolean) zzbe.zzc().zza(zzbcl.zzaE)).booleanValue()) {
                this.zza.zzH(-1);
                this.zza.zzI(j);
                return;
            }
            this.zza.zzH(i);
            this.zza.zzI(j);
        }
    }
}
