package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcis {
    private zzcha zza;
    private zzcjn zzb;
    private zzfgr zzc;
    private zzcka zzd;
    private zzfdl zze;

    private zzcis() {
        throw null;
    }

    /* synthetic */ zzcis(zzcjm zzcjm) {
    }

    public final zzcgx zza() {
        zzhez.zzc(this.zza, zzcha.class);
        zzhez.zzc(this.zzb, zzcjn.class);
        if (this.zzc == null) {
            this.zzc = new zzfgr();
        }
        if (this.zzd == null) {
            this.zzd = new zzcka();
        }
        if (this.zze == null) {
            this.zze = new zzfdl();
        }
        return new zzcih(this.zza, this.zzb, this.zzc, this.zzd, this.zze, (zzcjm) null);
    }

    public final zzcis zzb(zzcha zzcha) {
        zzcha zzcha2 = zzcha;
        this.zza = zzcha;
        return this;
    }

    public final zzcis zzc(zzcjn zzcjn) {
        zzcjn zzcjn2 = zzcjn;
        this.zzb = zzcjn;
        return this;
    }
}
