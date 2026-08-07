package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzakg implements zzacq {
    private final zzacq zzb;
    private final zzakd zzc;
    private final SparseArray zzd = new SparseArray();

    public zzakg(zzacq zzacq, zzakd zzakd) {
        this.zzb = zzacq;
        this.zzc = zzakd;
    }

    public final void zzD() {
        this.zzb.zzD();
    }

    public final void zzO(zzadm zzadm) {
        this.zzb.zzO(zzadm);
    }

    public final zzadt zzw(int i, int i2) {
        if (i2 != 3) {
            return this.zzb.zzw(i, i2);
        }
        zzaki zzaki = (zzaki) this.zzd.get(i);
        if (zzaki != null) {
            return zzaki;
        }
        zzaki zzaki2 = new zzaki(this.zzb.zzw(i, 3), this.zzc);
        this.zzd.put(i, zzaki2);
        return zzaki2;
    }
}
