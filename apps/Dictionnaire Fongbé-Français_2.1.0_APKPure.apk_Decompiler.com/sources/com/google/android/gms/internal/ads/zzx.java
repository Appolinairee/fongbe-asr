package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzx {
    private final SparseBooleanArray zza;

    /* synthetic */ zzx(SparseBooleanArray sparseBooleanArray, zzw zzw) {
        this.zza = sparseBooleanArray;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzx)) {
            return false;
        }
        zzx zzx = (zzx) obj;
        if (zzei.zza >= 24) {
            return this.zza.equals(zzx.zza);
        }
        if (this.zza.size() != zzx.zza.size()) {
            return false;
        }
        for (int i = 0; i < this.zza.size(); i++) {
            if (zza(i) != zzx.zza(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (zzei.zza >= 24) {
            return this.zza.hashCode();
        }
        int size = this.zza.size();
        for (int i = 0; i < this.zza.size(); i++) {
            size = (size * 31) + zza(i);
        }
        return size;
    }

    public final int zza(int i) {
        zzcw.zza(i, 0, this.zza.size());
        return this.zza.keyAt(i);
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final boolean zzc(int i) {
        return this.zza.get(i);
    }
}
