package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzxl {
    private final Spatializer zza;
    private final boolean zzb;
    private Handler zzc;
    private Spatializer.OnSpatializerStateChangedListener zzd;

    private zzxl(Spatializer spatializer) {
        this.zza = spatializer;
        this.zzb = zzoc$$ExternalSyntheticApiModelOutline2.m(spatializer) != 0;
    }

    public static zzxl zza(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return new zzxl(audioManager.getSpatializer());
    }

    public final void zzb(zzxt zzxt, Looper looper) {
        if (this.zzd == null && this.zzc == null) {
            this.zzd = new zzxk(this, zzxt);
            Handler handler = new Handler(looper);
            this.zzc = handler;
            Spatializer spatializer = this.zza;
            Objects.requireNonNull(handler);
            spatializer.addOnSpatializerStateChangedListener(new zzxj(handler), this.zzd);
        }
    }

    public final void zzc() {
        Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener = this.zzd;
        if (onSpatializerStateChangedListener != null && this.zzc != null) {
            this.zza.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
            Handler handler = this.zzc;
            int i = zzei.zza;
            Handler handler2 = handler;
            handler.removeCallbacksAndMessages((Object) null);
            this.zzc = null;
            this.zzd = null;
        }
    }

    public final boolean zzd(zze zze, zzab zzab) {
        int i;
        if (Objects.equals(zzab.zzo, "audio/eac3-joc") && zzab.zzD == 16) {
            i = 12;
        } else if (!Objects.equals(zzab.zzo, "audio/iamf") || zzab.zzD != -1) {
            i = zzab.zzD;
        } else {
            i = 6;
        }
        int zzi = zzei.zzi(i);
        if (zzi == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(zzi);
        int i2 = zzab.zzE;
        if (i2 != -1) {
            channelMask.setSampleRate(i2);
        }
        return this.zza.canBeSpatialized(zze.zza().zza, channelMask.build());
    }

    public final boolean zze() {
        return this.zza.isAvailable();
    }

    public final boolean zzf() {
        return zzoc$$ExternalSyntheticApiModelOutline2.m(this.zza);
    }

    public final boolean zzg() {
        return this.zzb;
    }
}
