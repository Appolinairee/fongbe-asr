package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public abstract class zzfr implements zzfy {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;
    private zzgd zzd;

    protected zzfr(boolean z) {
        this.zza = z;
    }

    public /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    /* access modifiers changed from: protected */
    public final void zzg(int i) {
        zzgd zzgd = this.zzd;
        int i2 = zzei.zza;
        zzgd zzgd2 = zzgd;
        for (int i3 = 0; i3 < this.zzc; i3++) {
            ((zzgy) this.zzb.get(i3)).zza(this, zzgd, this.zza, i);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzh() {
        zzgd zzgd = this.zzd;
        int i = zzei.zza;
        zzgd zzgd2 = zzgd;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            ((zzgy) this.zzb.get(i2)).zzb(this, zzgd, this.zza);
        }
        this.zzd = null;
    }

    /* access modifiers changed from: protected */
    public final void zzi(zzgd zzgd) {
        for (int i = 0; i < this.zzc; i++) {
            ((zzgy) this.zzb.get(i)).zzc(this, zzgd, this.zza);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzj(zzgd zzgd) {
        this.zzd = zzgd;
        for (int i = 0; i < this.zzc; i++) {
            ((zzgy) this.zzb.get(i)).zzd(this, zzgd, this.zza);
        }
    }

    public final void zzf(zzgy zzgy) {
        zzgy.getClass();
        if (!this.zzb.contains(zzgy)) {
            this.zzb.add(zzgy);
            this.zzc++;
        }
    }
}
