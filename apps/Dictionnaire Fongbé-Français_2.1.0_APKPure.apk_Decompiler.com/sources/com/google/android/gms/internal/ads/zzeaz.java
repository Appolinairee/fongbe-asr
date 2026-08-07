package com.google.android.gms.internal.ads;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.zzm;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzeaz extends zzebw {
    private Activity zza;
    private zzm zzb;
    private String zzc;
    private String zzd;

    zzeaz() {
    }

    public final zzebw zza(Activity activity) {
        if (activity != null) {
            this.zza = activity;
            return this;
        }
        throw new NullPointerException("Null activity");
    }

    public final zzebw zzb(zzm zzm) {
        this.zzb = zzm;
        return this;
    }

    public final zzebw zzc(String str) {
        this.zzc = str;
        return this;
    }

    public final zzebw zzd(String str) {
        this.zzd = str;
        return this;
    }

    public final zzebx zze() {
        Activity activity = this.zza;
        if (activity != null) {
            return new zzebb(activity, this.zzb, this.zzc, this.zzd, (zzeba) null);
        }
        throw new IllegalStateException("Missing required properties: activity");
    }
}
