package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzbsk extends NativeAd.AdChoicesInfo {
    private final List zza = new ArrayList();
    private String zzb;

    public zzbsk(zzbfp zzbfp) {
        try {
            this.zzb = zzbfp.zzg();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            this.zzb = "";
        }
        try {
            for (Object next : zzbfp.zzh()) {
                zzbfw zzg = next instanceof IBinder ? zzbfv.zzg((IBinder) next) : null;
                if (zzg != null) {
                    this.zza.add(new zzbsm(zzg));
                }
            }
        } catch (RemoteException e2) {
            zzo.zzh("", e2);
        }
    }

    public final List<NativeAd.Image> getImages() {
        return this.zza;
    }

    public final CharSequence getText() {
        return this.zzb;
    }
}
