package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final /* synthetic */ class zzbov implements Runnable {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzbov(zzbow zzbow, Context context, String str) {
        this.zza = context;
        this.zzb = str;
    }

    public final void run() {
        Context context = this.zza;
        zzbcl.zza(context);
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzaG)).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("measurementEnabled", ((Boolean) zzbe.zzc().zza(zzbcl.zzav)).booleanValue());
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzaC)).booleanValue()) {
                bundle.putString("ad_storage", "denied");
                bundle.putString("analytics_storage", "denied");
            }
            try {
                ((zzcgw) zzs.zzb(context, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", new zzbou())).zze(ObjectWrapper.wrap(context), new zzbot(AppMeasurementSdk.getInstance(context, "FA-Ads", "am", this.zzb, bundle)));
            } catch (RemoteException | zzr | NullPointerException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
