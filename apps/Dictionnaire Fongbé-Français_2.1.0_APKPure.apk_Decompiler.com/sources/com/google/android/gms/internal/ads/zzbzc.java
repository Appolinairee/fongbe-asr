package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzbzc implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzcab zzb;

    zzbzc(zzbzd zzbzd, Context context, zzcab zzcab) {
        this.zza = context;
        this.zzb = zzcab;
    }

    public final void run() {
        try {
            this.zzb.zzc(AdvertisingIdClient.getAdvertisingIdInfo(this.zza));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            this.zzb.zzd(e);
            zzo.zzh("Exception while getting advertising Id info", e);
        }
    }
}
