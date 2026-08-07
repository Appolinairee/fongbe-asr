package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdwg {
    private final zzgcs zza;
    private final zzgcs zzb;
    private final zzdxo zzc;
    private final zzhel zzd;

    public zzdwg(zzgcs zzgcs, zzgcs zzgcs2, zzdxo zzdxo, zzhel zzhel) {
        this.zza = zzgcs;
        this.zzb = zzgcs2;
        this.zzc = zzdxo;
        this.zzd = zzhel;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdyi zza(zzbvk zzbvk) throws Exception {
        return (zzdyi) this.zzc.zza(zzbvk).get((long) ((Integer) zzbe.zzc().zza(zzbcl.zzfy)).intValue(), TimeUnit.SECONDS);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzb(zzbvk zzbvk, int i, zzdyh zzdyh) throws Exception {
        Bundle bundle;
        if (!(zzbvk == null || (bundle = zzbvk.zzm) == null)) {
            bundle.putBoolean("ls", true);
        }
        return zzgch.zzn(((zzdzl) this.zzd.zzb()).zzc(zzbvk, i), new zzdwc(zzbvk), this.zzb);
    }

    public final ListenableFuture zzc(zzbvk zzbvk) {
        ListenableFuture listenableFuture;
        String str = zzbvk.zzd;
        zzv.zzq();
        if (zzs.zzD(str)) {
            listenableFuture = zzgch.zzg(new zzdyh(1));
        } else {
            listenableFuture = zzgch.zzf(this.zza.zzb(new zzdwd(this, zzbvk)), ExecutionException.class, new zzdwe(), this.zzb);
        }
        return zzgch.zzf(listenableFuture, zzdyh.class, new zzdwf(this, zzbvk, Binder.getCallingUid()), this.zzb);
    }
}
