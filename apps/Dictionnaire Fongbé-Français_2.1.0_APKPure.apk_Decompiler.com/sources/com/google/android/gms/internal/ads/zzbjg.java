package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzbjg implements zzbjp {
    zzbjg() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcex zzcex = (zzcex) obj;
        if (zzcex.zzJ() != null) {
            zzcex.zzJ().zza();
        }
        zzm zzL = zzcex.zzL();
        if (zzL != null) {
            zzL.zzb();
            return;
        }
        zzm zzM = zzcex.zzM();
        if (zzM != null) {
            zzM.zzb();
        } else {
            zzo.zzj("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
