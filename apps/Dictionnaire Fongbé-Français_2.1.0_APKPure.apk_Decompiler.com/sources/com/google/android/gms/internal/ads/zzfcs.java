package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzfcs implements zzbjp {
    public final /* synthetic */ zzfja zza;
    public final /* synthetic */ zzebk zzb;

    public /* synthetic */ zzfcs(zzfja zzfja, zzebk zzebk) {
        this.zza = zzfja;
        this.zzb = zzebk;
    }

    public final void zza(Object obj, Map map) {
        zzceo zzceo = (zzceo) obj;
        String str = (String) map.get("u");
        if (str == null) {
            zzo.zzj("URL missing from httpTrack GMSG.");
            return;
        }
        zzfbo zzD = zzceo.zzD();
        if (zzD == null || zzD.zzai) {
            zzfbr zzR = ((zzcga) zzceo).zzR();
            if (zzR == null) {
                zzv.zzp().zzw(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingHttpTrackGmsgHandler");
                return;
            }
            this.zzb.zzd(new zzebm(zzv.zzC().currentTimeMillis(), zzR.zzb, str, 2));
            return;
        }
        this.zza.zzd(str, zzD.zzax, (zzfhh) null);
    }
}
