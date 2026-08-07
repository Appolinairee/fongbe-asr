package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbw;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzbis implements zzbjp {
    public final void zza(Object obj, Map map) {
        zzcge zzcge = (zzcge) obj;
        zzbjp zzbjp = zzbjo.zza;
        String str = (String) map.get("u");
        if (str == null) {
            zzo.zzj("URL missing from httpTrack GMSG.");
            return;
        }
        zzceo zzceo = (zzceo) zzcge;
        new zzbw(zzcge.getContext(), ((zzcgl) zzcge).zzn().afmaVersion, str, (zzfir) null, zzceo.zzD() != null ? zzceo.zzD().zzax : null).zzb();
    }
}
