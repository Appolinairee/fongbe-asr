package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzqa {
    /* access modifiers changed from: private */
    public final Context zza;
    /* access modifiers changed from: private */
    public final zzoi zzb;
    private boolean zzc;
    private final zzpy zzd;
    /* access modifiers changed from: private */
    public final zzpz zze;
    /* access modifiers changed from: private */
    public zzqc zzf;
    /* access modifiers changed from: private */
    public zzps zzg;

    @Deprecated
    public zzqa() {
        this.zza = null;
        this.zzb = zzoi.zza;
        this.zzd = zzpy.zza;
        this.zze = zzpz.zza;
    }

    public final zzqm zzd() {
        zzcw.zzf(!this.zzc);
        this.zzc = true;
        if (this.zzf == null) {
            this.zzf = new zzqc(new zzch[0]);
        }
        if (this.zzg == null) {
            this.zzg = new zzps(this.zza);
        }
        return new zzqm(this, (zzql) null);
    }

    public zzqa(Context context) {
        this.zza = context;
        this.zzb = zzoi.zza;
        this.zzd = zzpy.zza;
        this.zze = zzpz.zza;
    }
}
