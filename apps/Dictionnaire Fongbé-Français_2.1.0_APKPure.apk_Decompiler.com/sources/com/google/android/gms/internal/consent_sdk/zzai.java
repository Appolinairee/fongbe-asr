package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
final class zzai implements zzat {
    private final zzaf zza;
    private final zzdn zzb;
    private final zzdn zzc;
    private final zzdn zzd;
    private final zzdn zze;
    private final zzdn zzf;

    /* synthetic */ zzai(zzaf zzaf, zzbm zzbm, zzaj zzaj) {
        this.zza = zzaf;
        zzdn zzb2 = zzdj.zzb(new zzbu(zzaf.zzb));
        this.zzb = zzb2;
        zzdk zzb3 = zzdl.zzb(zzbm);
        this.zzc = zzb3;
        zzdi zzdi = new zzdi();
        this.zzd = zzdi;
        zzby zzby = new zzby(zzaf.zzb, zzb2, zzao.zza, zzaq.zza, zzaf.zzh, zzaf.zzi, zzdi, zzaf.zzc);
        this.zze = zzby;
        zzbs zzbs = new zzbs(zzb2, zzao.zza, zzby);
        this.zzf = zzbs;
        zzdi.zzb(zzdi, zzdj.zzb(new zzaz(zzaf.zzb, zzaf.zzd, zzb2, zzaf.zzc, zzb3, zzbs)));
    }

    public final zzay zza() {
        return (zzay) this.zzd.zza();
    }
}
