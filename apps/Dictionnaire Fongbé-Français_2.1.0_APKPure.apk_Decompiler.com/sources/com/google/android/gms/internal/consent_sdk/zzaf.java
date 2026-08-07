package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
final class zzaf extends zza {
    /* access modifiers changed from: private */
    public final zzaf zza = this;
    /* access modifiers changed from: private */
    public final zzdn zzb;
    /* access modifiers changed from: private */
    public final zzdn zzc;
    /* access modifiers changed from: private */
    public final zzdn zzd;
    private final zzdn zze;
    private final zzdn zzf;
    private final zzdn zzg;
    /* access modifiers changed from: private */
    public final zzdn zzh;
    /* access modifiers changed from: private */
    public final zzdn zzi;
    private final zzdn zzj;
    private final zzdn zzk;
    private final zzdn zzl;

    /* synthetic */ zzaf(Application application, zzaj zzaj) {
        zzdk zzb2 = zzdl.zzb(application);
        this.zzb = zzb2;
        zzdn zzb3 = zzdj.zzb(new zzan(zzb2));
        this.zzc = zzb3;
        zzdn zzb4 = zzdj.zzb(zzac.zza);
        this.zzd = zzb4;
        zzae zzae = new zzae(this);
        this.zze = zzae;
        zzdn zzb5 = zzdj.zzb(new zzbl(zzae, zzaq.zza));
        this.zzf = zzb5;
        zzo zzo = new zzo(zzb2, zzb3);
        this.zzg = zzo;
        zzdn zzb6 = zzdj.zzb(new zzf(zzaq.zza));
        this.zzh = zzb6;
        zzal zzal = new zzal(zzb2, zzb3, zzaq.zza);
        this.zzi = zzal;
        zzaa zzaa = new zzaa(zzb6, zzal, zzb3);
        this.zzj = zzaa;
        zzv zzv = new zzv(zzb2, zzb4, zzao.zza, zzaq.zza, zzb3, zzb5, zzo, zzaa, zzb6);
        this.zzk = zzv;
        this.zzl = zzdj.zzb(new zzk(zzb3, zzv, zzb5));
    }

    public final zzj zzb() {
        return (zzj) this.zzl.zza();
    }

    public final zzbk zzc() {
        return (zzbk) this.zzf.zza();
    }
}
