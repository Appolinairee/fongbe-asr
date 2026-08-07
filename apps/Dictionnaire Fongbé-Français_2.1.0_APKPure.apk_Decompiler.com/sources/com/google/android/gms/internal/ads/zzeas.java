package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeas implements zzfgo {
    private final zzeag zza;
    private final zzeak zzb;

    zzeas(zzeag zzeag, zzeak zzeak) {
        this.zza = zzeag;
        this.zzb = zzeak;
    }

    public final void zzd(zzfgh zzfgh, String str) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzgb)).booleanValue() && zzfgh.RENDERER == zzfgh && this.zza.zzc() != 0) {
            this.zza.zzf(zzv.zzC().elapsedRealtime() - this.zza.zzc());
        }
    }

    public final void zzdA(zzfgh zzfgh, String str) {
    }

    public final void zzdB(zzfgh zzfgh, String str, Throwable th) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzgb)).booleanValue() && zzfgh.RENDERER == zzfgh && this.zza.zzc() != 0) {
            this.zza.zzf(zzv.zzC().elapsedRealtime() - this.zza.zzc());
        }
    }

    public final void zzdC(zzfgh zzfgh, String str) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzgb)).booleanValue()) {
            if (zzfgh.RENDERER == zzfgh) {
                this.zza.zzg(zzv.zzC().elapsedRealtime());
            } else if (zzfgh.PRELOADED_LOADER == zzfgh || zzfgh.SERVER_TRANSACTION == zzfgh) {
                this.zza.zzh(zzv.zzC().elapsedRealtime());
                zzeak zzeak = this.zzb;
                zzeak.zza.zza(new zzeaj(zzeak, this.zza.zzd()));
            }
        }
    }
}
