package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdmx implements zzbjp {
    private final zzbha zza;
    private final zzdnl zzb;
    private final zzhel zzc;

    public zzdmx(zzdiq zzdiq, zzdif zzdif, zzdnl zzdnl, zzhel zzhel) {
        this.zza = zzdiq.zzc(zzdif.zzA());
        this.zzb = zzdnl;
        this.zzc = zzhel;
    }

    public final void zza(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.zza.zze((zzbgq) this.zzc.zzb(), str);
        } catch (RemoteException e) {
            zzo.zzk("Failed to call onCustomClick for asset " + str + ".", e);
        }
    }

    public final void zzb() {
        if (this.zza != null) {
            this.zzb.zzl("/nativeAdCustomClick", this);
        }
    }
}
