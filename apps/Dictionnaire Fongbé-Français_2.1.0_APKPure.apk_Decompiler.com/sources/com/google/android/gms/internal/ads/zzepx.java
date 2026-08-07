package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzepx implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzepx(zzhfj zzhfj, zzhfj zzhfj2) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfxs zzfxs;
        zzeqv zza2 = ((zzeqx) this.zza).zzb();
        zzeqv zzeqv = zza2;
        Context zza3 = ((zzche) this.zzb).zza();
        Context context = zza3;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzlk)).booleanValue()) {
            zzv.zzq();
            if (zzs.zzC(zza3)) {
                zzfxs = zzfxs.zzo(zza2);
                zzhez.zzb(zzfxs);
                return zzfxs;
            }
        }
        zzfxs = zzfxs.zzn();
        zzhez.zzb(zzfxs);
        return zzfxs;
    }
}
