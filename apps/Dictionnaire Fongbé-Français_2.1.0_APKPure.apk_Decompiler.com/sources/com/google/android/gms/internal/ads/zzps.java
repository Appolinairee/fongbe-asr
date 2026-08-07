package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzps {
    private final Context zza;
    private Boolean zzb;

    public zzps() {
        this.zza = null;
    }

    public zzps(Context context) {
        this.zza = context;
    }

    public final zzor zza(zzab zzab, zze zze) {
        boolean z;
        zzab.getClass();
        zze.getClass();
        if (zzei.zza < 29 || zzab.zzE == -1) {
            return zzor.zza;
        }
        Context context = this.zza;
        Boolean bool = this.zzb;
        boolean z2 = false;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            if (context != null) {
                AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                if (audioManager != null) {
                    String parameters = audioManager.getParameters("offloadVariableRateSupported");
                    this.zzb = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
                } else {
                    this.zzb = false;
                }
            } else {
                this.zzb = false;
            }
            z = this.zzb.booleanValue();
        }
        String str = zzab.zzo;
        str.getClass();
        String str2 = str;
        int zza2 = zzbb.zza(str, zzab.zzk);
        if (zza2 == 0 || zzei.zza < zzei.zzh(zza2)) {
            return zzor.zza;
        }
        int zzi = zzei.zzi(zzab.zzD);
        if (zzi == 0) {
            return zzor.zza;
        }
        try {
            AudioFormat zzx = zzei.zzx(zzab.zzE, zzi, zza2);
            if (zzei.zza >= 31) {
                int m = zzoc$$ExternalSyntheticApiModelOutline2.m(zzx, zze.zza().zza);
                if (m == 0) {
                    return zzor.zza;
                }
                zzop zzop = new zzop();
                if (zzei.zza > 32 && m == 2) {
                    z2 = true;
                }
                zzop.zza(true);
                zzop.zzb(z2);
                zzop.zzc(z);
                return zzop.zzd();
            } else if (!AudioManager.isOffloadedPlaybackSupported(zzx, zze.zza().zza)) {
                return zzor.zza;
            } else {
                zzop zzop2 = new zzop();
                zzop2.zza(true);
                zzop2.zzc(z);
                return zzop2.zzd();
            }
        } catch (IllegalArgumentException unused) {
            return zzor.zza;
        }
    }
}
