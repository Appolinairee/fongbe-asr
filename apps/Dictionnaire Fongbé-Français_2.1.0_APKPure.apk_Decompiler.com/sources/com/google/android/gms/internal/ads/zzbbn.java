package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzbbn {
    final /* synthetic */ zzbbp zza;
    private final byte[] zzb;
    private int zzc;

    /* synthetic */ zzbbn(zzbbp zzbbp, byte[] bArr, zzbbo zzbbo) {
        this.zza = zzbbp;
        this.zzb = bArr;
    }

    /* access modifiers changed from: private */
    public final synchronized void zzd() {
        try {
            zzbbp zzbbp = this.zza;
            if (zzbbp.zzb) {
                zzbbp.zza.zzj(this.zzb);
                this.zza.zza.zzi(0);
                this.zza.zza.zzg(this.zzc);
                this.zza.zza.zzh((int[]) null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e) {
            zzo.zzf("Clearcut log failed", e);
        }
    }

    public final zzbbn zza(int i) {
        this.zzc = i;
        return this;
    }

    public final synchronized void zzc() {
        this.zza.zzc.execute(new zzbbm(this));
    }
}
