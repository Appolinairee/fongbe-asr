package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzs;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbtd;
import com.google.android.gms.internal.ads.zzbth;
import com.google.android.gms.internal.ads.zzbuh;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzad extends zzbb {
    final /* synthetic */ Activity zza;
    final /* synthetic */ zzba zzb;

    zzad(zzba zzba, Activity activity) {
        this.zza = activity;
        this.zzb = zzba;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object zza() {
        zzba.zzv(this.zza, "ad_overlay");
        return null;
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzcp zzcp) throws RemoteException {
        return zzcp.zzn(ObjectWrapper.wrap(this.zza));
    }

    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbcl.zza(this.zza);
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzkA)).booleanValue()) {
            try {
                return zzbtd.zzI(((zzbth) zzs.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", new zzac())).zze(ObjectWrapper.wrap(this.zza)));
            } catch (RemoteException | zzr | NullPointerException e) {
                this.zzb.zzg = zzbuh.zza(this.zza.getApplicationContext());
                this.zzb.zzg.zzh(e, "ClientApiBroker.createAdOverlay");
                return null;
            }
        } else {
            zzba zzba = this.zzb;
            return zzba.zze.zza(this.zza);
        }
    }
}
