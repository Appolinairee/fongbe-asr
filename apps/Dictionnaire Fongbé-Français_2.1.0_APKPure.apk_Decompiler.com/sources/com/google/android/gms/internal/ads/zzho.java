package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzho implements AudioManager.OnAudioFocusChangeListener {
    final /* synthetic */ zzhq zza;
    private final Handler zzb;

    public zzho(zzhq zzhq, Handler handler) {
        this.zza = zzhq;
        this.zzb = handler;
    }

    public final void onAudioFocusChange(int i) {
        this.zzb.post(new zzhn(this, i));
    }
}
