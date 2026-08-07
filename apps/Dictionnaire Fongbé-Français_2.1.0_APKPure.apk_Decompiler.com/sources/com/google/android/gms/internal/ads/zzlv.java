package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzlv {
    private final zzx zza;
    private final SparseArray zzb;

    public zzlv(zzx zzx, SparseArray sparseArray) {
        this.zza = zzx;
        SparseArray sparseArray2 = new SparseArray(zzx.zzb());
        for (int i = 0; i < zzx.zzb(); i++) {
            int zza2 = zzx.zza(i);
            zzlu zzlu = (zzlu) sparseArray.get(zza2);
            zzlu.getClass();
            zzlu zzlu2 = zzlu;
            sparseArray2.append(zza2, zzlu);
        }
        this.zzb = sparseArray2;
    }

    public final int zza(int i) {
        return this.zza.zza(i);
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final zzlu zzc(int i) {
        zzlu zzlu = (zzlu) this.zzb.get(i);
        zzlu.getClass();
        zzlu zzlu2 = zzlu;
        return zzlu;
    }

    public final boolean zzd(int i) {
        return this.zza.zzc(i);
    }
}
