package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcsd {
    private final zzdxl zza;
    private final zzfcj zzb;
    private final zzfgn zzc;
    private final zzcky zzd;
    private final zzegx zze;
    /* access modifiers changed from: private */
    public final zzdba zzf;
    private zzfca zzg;
    private final zzdyt zzh;
    private final zzcuw zzi;
    private final Executor zzj;
    private final zzdye zzk;
    private final zzedb zzl;

    zzcsd(zzdxl zzdxl, zzfcj zzfcj, zzfgn zzfgn, zzcky zzcky, zzegx zzegx, zzdba zzdba, zzfca zzfca, zzdyt zzdyt, zzcuw zzcuw, Executor executor, zzdye zzdye, zzedb zzedb) {
        this.zza = zzdxl;
        this.zzb = zzfcj;
        this.zzc = zzfgn;
        this.zzd = zzcky;
        this.zze = zzegx;
        this.zzf = zzdba;
        this.zzg = zzfca;
        this.zzh = zzdyt;
        this.zzi = zzcuw;
        this.zzj = executor;
        this.zzk = zzdye;
        this.zzl = zzedb;
    }

    public final zze zza(Throwable th) {
        return zzfdk.zzb(th, this.zzl);
    }

    public final zzdba zzc() {
        return this.zzf;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfca zzd(zzfca zzfca) throws Exception {
        this.zzd.zza(zzfca);
        return zzfca;
    }

    public final ListenableFuture zze(zzfed zzfed) {
        zzfft zza2 = this.zzc.zzb(zzfgh.GET_CACHE_KEY, this.zzi.zzc()).zzf(new zzcrz(this, zzfed)).zza();
        zzgch.zzr(zza2, new zzcsb(this), this.zzj);
        return zza2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzf(zzfed zzfed, zzbvk zzbvk) throws Exception {
        zzbvk.zzi = zzfed;
        return this.zzh.zza(zzbvk);
    }

    public final ListenableFuture zzg(zzbvk zzbvk) {
        zzfft zza2 = this.zzc.zzb(zzfgh.NOTIFY_CACHE_HIT, this.zzh.zzf(zzbvk)).zza();
        zzgch.zzr(zza2, new zzcsc(this), this.zzj);
        return zza2;
    }

    public final ListenableFuture zzh(ListenableFuture listenableFuture) {
        zzfgd zzf2 = this.zzc.zzb(zzfgh.RENDERER, listenableFuture).zze(new zzcry(this)).zzf(this.zze);
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzfx)).booleanValue()) {
            zzf2 = zzf2.zzi((long) ((Integer) zzbe.zzc().zza(zzbcl.zzfy)).intValue(), TimeUnit.SECONDS);
        }
        return zzf2.zza();
    }

    public final ListenableFuture zzi() {
        zzm zzm = this.zzb.zzd;
        if (zzm.zzx == null && zzm.zzs == null) {
            return zzj(this.zzi.zzc());
        }
        zzfgn zzfgn = this.zzc;
        zzdxl zzdxl = this.zza;
        return zzffx.zzc(zzdxl.zza(), zzfgh.PRELOADED_LOADER, zzfgn).zza();
    }

    public final ListenableFuture zzj(ListenableFuture listenableFuture) {
        if (this.zzg != null) {
            zzfgn zzfgn = this.zzc;
            return zzffx.zzc(zzgch.zzh(this.zzg), zzfgh.SERVER_TRANSACTION, zzfgn).zza();
        }
        zzv.zzc().zzj();
        zzfgd zzb2 = this.zzc.zzb(zzfgh.SERVER_TRANSACTION, listenableFuture);
        zzdye zzdye = this.zzk;
        Objects.requireNonNull(zzdye);
        return zzb2.zzf(new zzcsa(zzdye)).zza();
    }

    public final void zzk(zzfca zzfca) {
        this.zzg = zzfca;
    }
}
