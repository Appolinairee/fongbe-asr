package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzbym implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzbyn zza;
    private final String zzb;

    public zzbym(zzbyn zzbyn, String str) {
        this.zza = zzbyn;
        this.zzb = str;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.zza) {
            for (zzbyl zzbyl : this.zza.zzb) {
                zzbyl.zza.zzb(zzbyl.zzb, sharedPreferences, this.zzb, str);
            }
        }
    }
}
