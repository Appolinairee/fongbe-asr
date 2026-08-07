package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzv;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzbjb implements zzbjp {
    zzbjb() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcex zzcex = (zzcex) obj;
        try {
            zzfre.zzj(zzcex.getContext()).zzk();
            zzfrf.zzi(zzcex.getContext()).zzj();
            zzfrg.zza(zzcex.getContext()).zzb((zzfra) null);
        } catch (IOException e) {
            zzv.zzp().zzw(e, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
