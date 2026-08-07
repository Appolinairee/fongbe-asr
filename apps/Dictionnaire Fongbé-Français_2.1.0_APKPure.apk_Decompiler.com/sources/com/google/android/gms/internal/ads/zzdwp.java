package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdwp implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzdwp(zzhfj zzhfj, zzhfj zzhfj2) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
    }

    public final /* synthetic */ Object zzb() {
        CookieManager zza2 = zzv.zzr().zza((Context) this.zzb.zzb());
        zzfgh zzfgh = zzfgh.WEBVIEW_COOKIE;
        return zzffx.zza(new zzdwk(zza2), zzfgh, (zzfgn) this.zza.zzb()).zzi(1, TimeUnit.SECONDS).zzc(Exception.class, new zzffy(new zzdwl())).zza();
    }
}
