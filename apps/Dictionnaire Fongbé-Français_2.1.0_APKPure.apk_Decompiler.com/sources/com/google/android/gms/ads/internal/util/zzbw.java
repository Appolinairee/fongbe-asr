package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.client.zzv;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzfiq;
import com.google.android.gms.internal.ads.zzfir;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbw extends zzb {
    private final zzu zza;
    private final String zzb;
    private final zzv zzc;

    public zzbw(Context context, String str, String str2, zzfir zzfir, zzv zzv) {
        this.zza = new zzu(com.google.android.gms.ads.internal.zzv.zzq().zzc(context, str));
        this.zzb = str2;
        this.zzc = zzv;
    }

    public final void zza() {
        zzv zzv = this.zzc;
        if (zzv != null) {
            new zzfiq(zzv.zzb(), this.zza, zzbzw.zze, (zzfir) null).zzd(this.zzb);
            return;
        }
        this.zza.zza(this.zzb);
    }
}
