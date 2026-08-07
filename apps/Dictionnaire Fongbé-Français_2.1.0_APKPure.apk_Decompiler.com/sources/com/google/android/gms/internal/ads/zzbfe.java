package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzbfe {
    private final Context zza;

    public zzbfe(Context context) {
        this.zza = context;
    }

    public final void zza(zzbuo zzbuo) {
        try {
            ((zzbff) zzs.zzb(this.zza, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new zzbfd())).zze(zzbuo);
        } catch (zzr e) {
            zzo.zzj("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e.getMessage())));
        } catch (RemoteException e2) {
            zzo.zzj("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e2.getMessage())));
        }
    }
}
