package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzbsl implements NativeCustomFormatAd.DisplayOpenMeasurement {
    private final zzbgq zza;

    public zzbsl(zzbgq zzbgq) {
        this.zza = zzbgq;
        try {
            zzbgq.zzm();
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }

    public final void setView(View view) {
        try {
            this.zza.zzp(ObjectWrapper.wrap(view));
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }

    public final boolean start() {
        try {
            return this.zza.zzt();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return false;
        }
    }
}
