package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzefb implements zzdgc {
    private final zzfbo zza;
    private final zzbrd zzb;
    private final AdFormat zzc;
    private zzcwl zzd = null;

    zzefb(zzfbo zzfbo, zzbrd zzbrd, AdFormat adFormat) {
        this.zza = zzfbo;
        this.zzb = zzbrd;
        this.zzc = adFormat;
    }

    public final void zza(boolean z, Context context, zzcwg zzcwg) throws zzdgb {
        boolean z2;
        try {
            AdFormat adFormat = AdFormat.BANNER;
            int ordinal = this.zzc.ordinal();
            if (ordinal == 1) {
                z2 = this.zzb.zzs(ObjectWrapper.wrap(context));
            } else if (ordinal != 2) {
                if (ordinal == 5) {
                    z2 = this.zzb.zzr(ObjectWrapper.wrap(context));
                }
                throw new zzdgb("Adapter failed to show.");
            } else {
                z2 = this.zzb.zzt(ObjectWrapper.wrap(context));
            }
            if (z2) {
                zzcwl zzcwl = this.zzd;
                if (zzcwl != null) {
                    if (!((Boolean) zzbe.zzc().zza(zzbcl.zzbE)).booleanValue() && this.zza.zzY == 2) {
                        zzcwl.zza();
                        return;
                    }
                    return;
                }
                return;
            }
            throw new zzdgb("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzdgb(th);
        }
    }

    public final void zzb(zzcwl zzcwl) {
        this.zzd = zzcwl;
    }
}
