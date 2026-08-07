package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzcil implements zzewo {
    private final zzcih zza;
    private Context zzb;
    private String zzc;

    /* synthetic */ zzcil(zzcih zzcih, zzcjm zzcjm) {
        this.zza = zzcih;
    }

    public final zzewp zzc() {
        zzhez.zzc(this.zzb, Context.class);
        zzhez.zzc(this.zzc, String.class);
        return new zzcim(this.zza, this.zzb, this.zzc, (zzcjm) null);
    }

    public final /* bridge */ /* synthetic */ zzewo zza(String str) {
        str.getClass();
        String str2 = str;
        this.zzc = str;
        return this;
    }

    public final /* bridge */ /* synthetic */ zzewo zzb(Context context) {
        context.getClass();
        Context context2 = context;
        this.zzb = context;
        return this;
    }
}
