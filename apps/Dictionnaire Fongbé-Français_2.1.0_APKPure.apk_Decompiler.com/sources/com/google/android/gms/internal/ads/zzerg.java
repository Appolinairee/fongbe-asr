package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzerg implements zzetr {
    private final Context zza;
    private final Intent zzb;

    zzerg(Context context, Intent intent) {
        this.zza = context;
        this.zzb = intent;
    }

    public final int zza() {
        return 60;
    }

    public final ListenableFuture zzb() {
        zze.zza("HsdpMigrationSignal.produce");
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzmG)).booleanValue()) {
            return zzgch.zzh(new zzerh((Boolean) null));
        }
        boolean z = false;
        try {
            if (this.zzb.resolveActivity(this.zza.getPackageManager()) != null) {
                zze.zza("HSDP intent is supported");
                z = true;
            }
        } catch (Exception e) {
            zzv.zzp().zzw(e, "HsdpMigrationSignal.isHsdpMigrationSupported");
        }
        return zzgch.zzh(new zzerh(Boolean.valueOf(z)));
    }
}
