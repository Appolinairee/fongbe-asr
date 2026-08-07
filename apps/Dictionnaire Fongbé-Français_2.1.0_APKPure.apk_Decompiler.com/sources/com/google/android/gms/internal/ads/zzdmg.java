package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdmg {
    private final Executor zza;
    private final zzcnr zzb;
    private final zzddm zzc;
    private final zzcmk zzd;

    zzdmg(Executor executor, zzcnr zzcnr, zzddm zzddm, zzcmk zzcmk) {
        this.zza = executor;
        this.zzc = zzddm;
        this.zzb = zzcnr;
        this.zzd = zzcmk;
    }

    public final void zza(zzcex zzcex) {
        if (zzcex != null) {
            this.zzc.zza(zzcex.zzF());
            this.zzc.zzo(new zzdmc(zzcex), this.zza);
            this.zzc.zzo(new zzdmd(zzcex), this.zza);
            this.zzc.zzo(this.zzb, this.zza);
            this.zzb.zzf(zzcex);
            zzcgp zzN = zzcex.zzN();
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzjY)).booleanValue() && zzN != null) {
                zzN.zzL(this.zzd);
                zzN.zzM(this.zzd, (zzebk) null, (zzdrw) null);
            }
            zzcex.zzag("/trackActiveViewUnit", new zzdme(this));
            zzcex.zzag("/untrackActiveViewUnit", new zzdmf(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzcex zzcex, Map map) {
        this.zzb.zzb();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzcex zzcex, Map map) {
        this.zzb.zza();
    }
}
