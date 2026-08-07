package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzdkf implements zzgcd {
    final /* synthetic */ zzdkg zza;

    zzdkf(zzdkg zzdkg) {
        this.zza = zzdkg;
    }

    public final void zza(Throwable th) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzfm)).booleanValue()) {
            zzv.zzp().zzw(th, "omid native display exp");
        }
    }

    /* renamed from: zzc */
    public final void zzb(List list) {
        try {
            zzcex zzcex = (zzcex) list.get(0);
            if (zzcex != null) {
                this.zza.zzb(zzcex);
            }
        } catch (ClassCastException | IndexOutOfBoundsException e) {
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzfm)).booleanValue()) {
                zzv.zzp().zzw(e, "omid native display exp");
            }
        }
    }
}
