package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzzw {
    /* access modifiers changed from: private */
    public final Context zza;
    /* access modifiers changed from: private */
    public final zzaal zzb;
    private zzca zzc;
    /* access modifiers changed from: private */
    public zzbl zzd;
    /* access modifiers changed from: private */
    public final List zze = zzfxn.zzn();
    /* access modifiers changed from: private */
    public zzcx zzf = zzcx.zza;
    private boolean zzg;

    public zzzw(Context context, zzaal zzaal) {
        this.zza = context.getApplicationContext();
        this.zzb = zzaal;
    }

    public final zzzw zzd(zzcx zzcx) {
        this.zzf = zzcx;
        return this;
    }

    public final zzaah zze() {
        zzcw.zzf(!this.zzg);
        if (this.zzd == null) {
            if (this.zzc == null) {
                this.zzc = new zzaae((zzaag) null);
            }
            this.zzd = new zzaaf(this.zzc);
        }
        zzaah zzaah = new zzaah(this, (zzaag) null);
        this.zzg = true;
        return zzaah;
    }
}
