package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeib implements zzecy {
    private final zzejf zza;
    private final zzdpm zzb;

    zzeib(zzejf zzejf, zzdpm zzdpm) {
        this.zza = zzejf;
        this.zzb = zzdpm;
    }

    public final zzecz zza(String str, JSONObject jSONObject) throws zzfcq {
        zzbrd zzbrd;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzbM)).booleanValue()) {
            try {
                zzbrd = this.zzb.zzb(str);
            } catch (RemoteException e) {
                zzo.zzh("Coundn't create RTB adapter: ", e);
                zzbrd = null;
            }
        } else {
            zzbrd = this.zza.zza(str);
        }
        if (zzbrd == null) {
            return null;
        }
        return new zzecz(zzbrd, new zzees(), str);
    }
}
