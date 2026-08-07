package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgg implements zzfx {
    private final zzgs zza = new zzgs();
    private zzgy zzb;
    private String zzc;
    private int zzd = 8000;
    private int zze = 8000;
    private boolean zzf;

    public final zzgg zzb(boolean z) {
        this.zzf = true;
        return this;
    }

    public final zzgg zzc(int i) {
        this.zzd = i;
        return this;
    }

    public final zzgg zzd(int i) {
        this.zze = i;
        return this;
    }

    public final zzgg zze(zzgy zzgy) {
        this.zzb = zzgy;
        return this;
    }

    public final zzgg zzf(String str) {
        this.zzc = str;
        return this;
    }

    /* renamed from: zzg */
    public final zzgl zza() {
        zzgl zzgl = new zzgl(this.zzc, this.zzd, this.zze, this.zzf, false, this.zza, (zzfuo) null, false, (zzgk) null);
        zzgy zzgy = this.zzb;
        if (zzgy != null) {
            zzgl.zzf(zzgy);
        }
        return zzgl;
    }
}
