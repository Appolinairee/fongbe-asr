package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzbb;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzdzh implements zzgcd {
    final /* synthetic */ zzbvk zza;
    final /* synthetic */ zzbvc zzb;

    zzdzh(zzdzl zzdzl, zzbvk zzbvk, zzbvc zzbvc) {
        this.zza = zzbvk;
        this.zzb = zzbvc;
    }

    public final void zza(Throwable th) {
        try {
            this.zzb.zze(zzbb.zzb(th));
        } catch (RemoteException e) {
            zze.zzb("Service can't call client", e);
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle;
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        try {
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzck)).booleanValue()) {
                if (((Boolean) zzbe.zzc().zza(zzbcl.zzcl)).booleanValue() && (bundle = this.zza.zzm) != null) {
                    bundle.putLong(zzdre.BINDER_CALL_START.zza(), zzv.zzC().currentTimeMillis());
                }
                this.zzb.zzg(parcelFileDescriptor, this.zza);
                return;
            }
            this.zzb.zzf(parcelFileDescriptor);
        } catch (RemoteException e) {
            zze.zzb("Service can't call client", e);
        }
    }
}
