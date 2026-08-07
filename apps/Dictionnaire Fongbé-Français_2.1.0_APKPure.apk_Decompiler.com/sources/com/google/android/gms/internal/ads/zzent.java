package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzent implements zzetr {
    private final zzgcs zza;
    private final Context zzb;

    public zzent(zzgcs zzgcs, Context context) {
        this.zza = zzgcs;
        this.zzb = context;
    }

    public final int zza() {
        return 13;
    }

    public final ListenableFuture zzb() {
        return this.zza.zzb(new zzens(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzenu zzc() throws Exception {
        int i;
        int i2;
        AudioManager audioManager = (AudioManager) this.zzb.getSystemService("audio");
        float zza2 = zzv.zzs().zza();
        boolean zze = zzv.zzs().zze();
        if (audioManager == null) {
            return new zzenu(-1, false, false, -1, -1, -1, -1, -1, zza2, zze, true);
        }
        int mode = audioManager.getMode();
        boolean isMusicActive = audioManager.isMusicActive();
        boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzkQ)).booleanValue()) {
            int zzj = zzv.zzr().zzj(audioManager);
            i = audioManager.getStreamMaxVolume(3);
            i2 = zzj;
        } else {
            i2 = -1;
            i = -1;
        }
        return new zzenu(mode, isMusicActive, isSpeakerphoneOn, streamVolume, i2, i, audioManager.getRingerMode(), audioManager.getStreamVolume(2), zza2, zze, false);
    }
}
