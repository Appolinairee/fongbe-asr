package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzfgv {
    public static zzfgw zza(Context context, int i) {
        boolean z;
        if (zzfhk.zza()) {
            int i2 = i - 2;
            if (i2 != 20 && i2 != 21) {
                switch (i2) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        z = ((Boolean) zzbee.zzc.zze()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        z = ((Boolean) zzbee.zzd.zze()).booleanValue();
                        break;
                    case 5:
                        z = ((Boolean) zzbee.zzb.zze()).booleanValue();
                        break;
                }
            } else {
                z = ((Boolean) zzbee.zze.zze()).booleanValue();
            }
            if (z) {
                return new zzfgy(context, i);
            }
        }
        return new zzfid();
    }

    public static zzfgw zzb(Context context, int i, int i2, zzm zzm) {
        zzfgw zza = zza(context, i);
        if (zza instanceof zzfgy) {
            zza.zzi();
            zza.zzn(i2);
            zza.zzf(zzaa.zza(zzm.zzm));
            if (zzfhg.zze(zzm.zzp)) {
                zza.zze(zzm.zzp);
            }
        }
        return zza;
    }
}
