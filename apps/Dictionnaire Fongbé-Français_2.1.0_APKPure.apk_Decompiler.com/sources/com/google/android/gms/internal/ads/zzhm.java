package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzhm implements zzfvf {
    public final /* synthetic */ Context zza;

    public /* synthetic */ zzhm(Context context) {
        this.zza = context;
    }

    public final Object zza() {
        AudioManager audioManager = (AudioManager) this.zza.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        AudioManager audioManager2 = audioManager;
        return audioManager;
    }
}
