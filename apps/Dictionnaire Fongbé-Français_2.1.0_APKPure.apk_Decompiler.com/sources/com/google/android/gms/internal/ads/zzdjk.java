package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdjk implements zzbjp {
    public final /* synthetic */ zzdjl zza;
    public final /* synthetic */ zzbhq zzb;

    public /* synthetic */ zzdjk(zzdjl zzdjl, zzbhq zzbhq) {
        this.zza = zzdjl;
        this.zzb = zzbhq;
    }

    public final void zza(Object obj, Map map) {
        zzdjl zzdjl = this.zza;
        try {
            zzdjl.zzb = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
        } catch (NumberFormatException unused) {
            zzo.zzg("Failed to call parse unconfirmedClickTimestamp.");
        }
        zzbhq zzbhq = this.zzb;
        zzdjl.zza = (String) map.get("id");
        String str = (String) map.get("asset_id");
        if (zzbhq == null) {
            zzo.zze("Received unconfirmed click but UnconfirmedClickListener is null.");
            return;
        }
        try {
            zzbhq.zzf(str);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }
}
