package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeky {
    private final zzeld zza;
    private final String zzb;
    /* access modifiers changed from: private */
    public zzdy zzc;

    public zzeky(zzeld zzeld, String str) {
        this.zza = zzeld;
        this.zzb = str;
    }

    public final synchronized String zza() {
        String str;
        str = null;
        try {
            zzdy zzdy = this.zzc;
            if (zzdy != null) {
                str = zzdy.zzg();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
        return str;
    }

    public final synchronized String zzb() {
        String str;
        str = null;
        try {
            zzdy zzdy = this.zzc;
            if (zzdy != null) {
                str = zzdy.zzg();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
        return str;
    }

    public final synchronized void zzd(zzm zzm, int i) throws RemoteException {
        this.zzc = null;
        zzele zzele = new zzele(i);
        zzekx zzekx = new zzekx(this);
        this.zza.zzb(zzm, this.zzb, zzele, zzekx);
    }

    public final synchronized boolean zze() throws RemoteException {
        return this.zza.zza();
    }
}
