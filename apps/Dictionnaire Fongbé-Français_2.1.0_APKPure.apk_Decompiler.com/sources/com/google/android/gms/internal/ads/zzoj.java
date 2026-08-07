package com.google.android.gms.internal.ads;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzoj extends AudioDeviceCallback {
    final /* synthetic */ zzon zza;

    /* synthetic */ zzoj(zzon zzon, zzom zzom) {
        this.zza = zzon;
    }

    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        zzon zzon = this.zza;
        this.zza.zzj(zzoi.zzc(zzon.zza, zzon.zzh, zzon.zzg));
    }

    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        zzoo zzd = this.zza.zzg;
        int i = zzei.zza;
        int length = audioDeviceInfoArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            } else if (Objects.equals(audioDeviceInfoArr[i2], zzd)) {
                this.zza.zzg = null;
                break;
            } else {
                i2++;
            }
        }
        zzon zzon = this.zza;
        zzon.zzj(zzoi.zzc(zzon.zza, zzon.zzh, zzon.zzg));
    }
}
