package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzxg extends zzbv {
    /* access modifiers changed from: private */
    public boolean zza;
    /* access modifiers changed from: private */
    public boolean zzb;
    /* access modifiers changed from: private */
    public boolean zzc;
    /* access modifiers changed from: private */
    public boolean zzd;
    /* access modifiers changed from: private */
    public boolean zze;
    /* access modifiers changed from: private */
    public boolean zzf;
    /* access modifiers changed from: private */
    public boolean zzg;
    /* access modifiers changed from: private */
    public final SparseArray zzh;
    /* access modifiers changed from: private */
    public final SparseBooleanArray zzi;

    @Deprecated
    public zzxg() {
        this.zzh = new SparseArray();
        this.zzi = new SparseBooleanArray();
        zzy();
    }

    private final void zzy() {
        this.zza = true;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
        this.zzf = true;
        this.zzg = true;
    }

    public final zzxg zzq(int i, boolean z) {
        if (this.zzi.get(i) != z) {
            if (z) {
                this.zzi.put(i, true);
            } else {
                this.zzi.delete(i);
            }
        }
        return this;
    }

    public zzxg(Context context) {
        super.zze(context);
        Point zzw = zzei.zzw(context);
        super.zzf(zzw.x, zzw.y, true);
        this.zzh = new SparseArray();
        this.zzi = new SparseBooleanArray();
        zzy();
    }

    /* synthetic */ zzxg(zzxh zzxh, zzxs zzxs) {
        super(zzxh);
        this.zza = zzxh.zzD;
        this.zzb = zzxh.zzF;
        this.zzc = zzxh.zzH;
        this.zzd = zzxh.zzM;
        this.zze = zzxh.zzN;
        this.zzf = zzxh.zzO;
        this.zzg = zzxh.zzQ;
        SparseArray zza2 = zzxh.zzS;
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < zza2.size(); i++) {
            sparseArray.put(zza2.keyAt(i), new HashMap((Map) zza2.valueAt(i)));
        }
        this.zzh = sparseArray;
        this.zzi = zzxh.zzT.clone();
    }
}
