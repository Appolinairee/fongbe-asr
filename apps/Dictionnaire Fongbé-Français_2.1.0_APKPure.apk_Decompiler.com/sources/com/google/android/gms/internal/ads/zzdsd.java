package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdsd implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final /* synthetic */ zzdsf zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzdsd(zzdsf zzdsf, String str) {
        this.zza = zzdsf;
        this.zzb = str;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.zza.zzd(this.zzb, sharedPreferences, str);
    }
}
