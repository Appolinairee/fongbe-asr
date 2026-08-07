package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzfcr implements zzbjp {
    public final /* synthetic */ zzdds zza;
    public final /* synthetic */ zzcmk zzb;
    public final /* synthetic */ zzfja zzc;
    public final /* synthetic */ zzebk zzd;

    public /* synthetic */ zzfcr(zzdds zzdds, zzcmk zzcmk, zzfja zzfja, zzebk zzebk) {
        this.zza = zzdds;
        this.zzb = zzcmk;
        this.zzc = zzfja;
        this.zzd = zzebk;
    }

    public final void zza(Object obj, Map map) {
        zzcex zzcex = (zzcex) obj;
        zzbjo.zzc(map, this.zza);
        String str = (String) map.get("u");
        if (str == null) {
            zzo.zzj("URL missing from click GMSG.");
            return;
        }
        zzebk zzebk = this.zzd;
        zzfja zzfja = this.zzc;
        zzgch.zzr(zzbjo.zza(zzcex, str), new zzfct(zzcex, this.zzb, zzfja, zzebk), zzbzw.zza);
    }
}
