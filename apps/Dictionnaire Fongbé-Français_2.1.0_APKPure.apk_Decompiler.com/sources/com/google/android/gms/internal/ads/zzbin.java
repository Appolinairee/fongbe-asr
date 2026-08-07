package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzbin implements zzbjp {
    public final /* synthetic */ zzdds zza;
    public final /* synthetic */ zzcmk zzb;

    public /* synthetic */ zzbin(zzdds zzdds, zzcmk zzcmk) {
        this.zza = zzdds;
        this.zzb = zzcmk;
    }

    public final void zza(Object obj, Map map) {
        zzcex zzcex = (zzcex) obj;
        zzbjo.zzc(map, this.zza);
        String str = (String) map.get("u");
        if (str == null) {
            zzo.zzj("URL missing from click GMSG.");
            return;
        }
        zzgch.zzr((zzgby) zzgch.zzn(zzgby.zzu(zzbjo.zza(zzcex, str)), new zzbiq(this.zzb, str), zzbzw.zza), new zzbjd(zzcex), zzbzw.zza);
    }
}
