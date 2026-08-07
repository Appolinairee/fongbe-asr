package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdnq {
    private final zzcvr zza;
    private final zzcxa zzb;
    private final zzcxn zzc;
    private final zzcxz zzd;
    private final zzdap zze;
    private final zzddq zzf;
    private final zzdrw zzg;
    private final zzfja zzh;
    private final zzebk zzi;
    private final zzcmk zzj;

    zzdnq(zzcvr zzcvr, zzcxa zzcxa, zzcxn zzcxn, zzcxz zzcxz, zzdap zzdap, zzddq zzddq, zzdrw zzdrw, zzfja zzfja, zzebk zzebk, zzcmk zzcmk) {
        this.zza = zzcvr;
        this.zzb = zzcxa;
        this.zzc = zzcxn;
        this.zzd = zzcxz;
        this.zze = zzdap;
        this.zzf = zzddq;
        this.zzg = zzdrw;
        this.zzh = zzfja;
        this.zzi = zzebk;
        this.zzj = zzcmk;
    }

    public final void zza(zzdnr zzdnr, zzcex zzcex) {
        zzdno zza2 = zzdnr.zza;
        zzcxa zzcxa = this.zzb;
        Objects.requireNonNull(zzcxa);
        zza2.zzi(this.zza, this.zzc, this.zzd, this.zze, new zzdnp(zzcxa), this.zzf);
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzjZ)).booleanValue() && zzcex != null && zzcex.zzN() != null) {
            zzcgp zzN = zzcex.zzN();
            zzN.zzK(this.zzj, this.zzi, this.zzh);
            zzN.zzM(this.zzj, this.zzi, this.zzg);
        }
    }
}
