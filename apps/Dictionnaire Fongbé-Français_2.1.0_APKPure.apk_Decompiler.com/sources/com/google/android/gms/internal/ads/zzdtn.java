package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdtn implements zzdsx {
    /* access modifiers changed from: private */
    public final long zza;
    /* access modifiers changed from: private */
    public final zzdtc zzb;
    private final zzfbf zzc;

    zzdtn(long j, Context context, zzdtc zzdtc, zzcgx zzcgx, String str) {
        this.zza = j;
        this.zzb = zzdtc;
        zzfbh zzw = zzcgx.zzw();
        zzw.zzb(context);
        zzw.zza(str);
        this.zzc = zzw.zzc().zza();
    }

    public final void zza() {
    }

    public final void zzb(zzm zzm) {
        try {
            this.zzc.zzf(zzm, new zzdtl(this));
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzc() {
        try {
            this.zzc.zzk(new zzdtm(this));
            this.zzc.zzm(ObjectWrapper.wrap(null));
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }
}
