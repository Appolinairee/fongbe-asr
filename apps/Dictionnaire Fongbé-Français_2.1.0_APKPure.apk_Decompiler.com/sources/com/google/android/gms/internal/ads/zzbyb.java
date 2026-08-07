package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzbyb {
    private Context zza;
    private Clock zzb;
    private zzg zzc;
    private zzbyi zzd;

    private zzbyb() {
        throw null;
    }

    /* synthetic */ zzbyb(zzbyd zzbyd) {
    }

    public final zzbyb zza(zzg zzg) {
        zzg zzg2 = zzg;
        this.zzc = zzg;
        return this;
    }

    public final zzbyb zzd(zzbyi zzbyi) {
        zzbyi zzbyi2 = zzbyi;
        this.zzd = zzbyi;
        return this;
    }

    public final zzbyj zze() {
        zzhez.zzc(this.zza, Context.class);
        zzhez.zzc(this.zzb, Clock.class);
        zzhez.zzc(this.zzc, zzg.class);
        zzhez.zzc(this.zzd, zzbyi.class);
        return new zzbyc(this.zza, this.zzb, this.zzc, this.zzd, (zzbyd) null);
    }

    public final zzbyb zzb(Context context) {
        context.getClass();
        Context context2 = context;
        this.zza = context;
        return this;
    }

    public final zzbyb zzc(Clock clock) {
        clock.getClass();
        Clock clock2 = clock;
        this.zzb = clock;
        return this;
    }
}
