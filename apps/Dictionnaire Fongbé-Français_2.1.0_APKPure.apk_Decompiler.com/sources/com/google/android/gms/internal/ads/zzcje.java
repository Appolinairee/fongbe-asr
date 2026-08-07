package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzcje implements zzfbh {
    private final zzcih zza;
    private Context zzb;
    private String zzc;

    /* synthetic */ zzcje(zzcih zzcih, zzcjm zzcjm) {
        this.zza = zzcih;
    }

    public final /* synthetic */ zzfbh zza(String str) {
        this.zzc = str;
        return this;
    }

    public final zzfbi zzc() {
        zzhez.zzc(this.zzb, Context.class);
        return new zzcjf(this.zza, this.zzb, this.zzc, (zzcjm) null);
    }

    public final /* bridge */ /* synthetic */ zzfbh zzb(Context context) {
        context.getClass();
        Context context2 = context;
        this.zzb = context;
        return this;
    }
}
