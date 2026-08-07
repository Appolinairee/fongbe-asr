package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfpi {
    final /* synthetic */ zzfpk zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    /* synthetic */ zzfpi(zzfpk zzfpk, byte[] bArr, zzfpj zzfpj) {
        this.zza = zzfpk;
        this.zzb = bArr;
    }

    public final zzfpi zza(int i) {
        this.zzd = i;
        return this;
    }

    public final zzfpi zzb(int i) {
        this.zzc = i;
        return this;
    }

    public final synchronized void zzc() {
        try {
            zzfpk zzfpk = this.zza;
            if (zzfpk.zzb) {
                zzfpk.zza.zzj(this.zzb);
                this.zza.zza.zzi(this.zzc);
                this.zza.zza.zzg(this.zzd);
                this.zza.zza.zzh((int[]) null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException e) {
            Log.d("GASS", "Clearcut log failed", e);
        }
    }
}
