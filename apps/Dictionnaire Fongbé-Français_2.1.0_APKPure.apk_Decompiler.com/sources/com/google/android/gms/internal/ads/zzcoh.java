package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcoh extends zzbac {
    private final zzcog zza;
    private final zzby zzb;
    private final zzexm zzc;
    private boolean zzd = ((Boolean) zzbe.zzc().zza(zzbcl.zzaR)).booleanValue();
    private final zzdrw zze;

    public zzcoh(zzcog zzcog, zzby zzby, zzexm zzexm, zzdrw zzdrw) {
        this.zza = zzcog;
        this.zzb = zzby;
        this.zzc = zzexm;
        this.zze = zzdrw;
    }

    public final zzby zze() {
        return this.zzb;
    }

    public final zzdy zzf() {
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzgC)).booleanValue()) {
            return null;
        }
        return this.zza.zzm();
    }

    public final void zzg(boolean z) {
        this.zzd = z;
    }

    public final void zzh(zzdr zzdr) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        if (this.zzc != null) {
            try {
                if (!zzdr.zzf()) {
                    this.zze.zze();
                }
            } catch (RemoteException e) {
                zzo.zzf("Error in making CSI ping for reporting paid event callback", e);
            }
            this.zzc.zzn(zzdr);
        }
    }

    public final void zzi(IObjectWrapper iObjectWrapper, zzbak zzbak) {
        try {
            this.zzc.zzp(zzbak);
            this.zza.zzd((Activity) ObjectWrapper.unwrap(iObjectWrapper), zzbak, this.zzd);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }
}
