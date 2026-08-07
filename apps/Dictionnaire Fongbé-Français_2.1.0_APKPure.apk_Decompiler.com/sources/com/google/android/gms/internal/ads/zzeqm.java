package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzeqm implements zzetq {
    private final String zza;
    private final String zzb;
    private final Bundle zzc;

    /* synthetic */ zzeqm(String str, String str2, Bundle bundle, zzeqn zzeqn) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = bundle;
    }

    public final /* synthetic */ void zza(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcuv) obj).zza;
        bundle.putString("consent_string", this.zza);
        bundle.putString("fc_consent", this.zzb);
        Bundle bundle2 = this.zzc;
        if (bundle2 != null) {
            bundle.putBundle("iab_consent_info", bundle2);
        }
    }
}
