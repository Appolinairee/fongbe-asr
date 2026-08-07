package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzcjc implements zzezt {
    private final zzcih zza;
    private Context zzb;
    private String zzc;
    private zzs zzd;

    /* synthetic */ zzcjc(zzcih zzcih, zzcjm zzcjm) {
        this.zza = zzcih;
    }

    public final zzezu zzd() {
        zzhez.zzc(this.zzb, Context.class);
        zzhez.zzc(this.zzc, String.class);
        zzhez.zzc(this.zzd, zzs.class);
        return new zzcjd(this.zza, this.zzb, this.zzc, this.zzd, (zzcjm) null);
    }

    public final /* bridge */ /* synthetic */ zzezt zza(zzs zzs) {
        zzs.getClass();
        zzs zzs2 = zzs;
        this.zzd = zzs;
        return this;
    }

    public final /* bridge */ /* synthetic */ zzezt zzb(String str) {
        str.getClass();
        String str2 = str;
        this.zzc = str;
        return this;
    }

    public final /* bridge */ /* synthetic */ zzezt zzc(Context context) {
        context.getClass();
        Context context2 = context;
        this.zzb = context;
        return this;
    }
}
