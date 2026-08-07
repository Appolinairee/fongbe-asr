package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzbgr {
    private final zzbgq zza;

    public zzbgr(zzbgq zzbgq) {
        Context context;
        this.zza = zzbgq;
        try {
            context = (Context) ObjectWrapper.unwrap(zzbgq.zzh());
        } catch (RemoteException | NullPointerException e) {
            zzo.zzh("", e);
            context = null;
        }
        if (context != null) {
            try {
                this.zza.zzs(ObjectWrapper.wrap(new MediaView(context)));
            } catch (RemoteException e2) {
                zzo.zzh("", e2);
            }
        }
    }

    public final zzbgq zza() {
        return this.zza;
    }

    public final String zzb() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return null;
        }
    }
}
