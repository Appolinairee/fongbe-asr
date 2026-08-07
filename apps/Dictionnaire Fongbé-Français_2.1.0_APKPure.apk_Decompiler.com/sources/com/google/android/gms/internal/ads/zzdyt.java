package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdyt {
    private final zzgcs zza;
    private final zzdxy zzb;
    private final zzhel zzc;

    public zzdyt(zzgcs zzgcs, zzdxy zzdxy, zzhel zzhel) {
        this.zza = zzgcs;
        this.zzb = zzdxy;
        this.zzc = zzhel;
    }

    private final ListenableFuture zzg(zzbvk zzbvk, zzdys zzdys, zzdys zzdys2, zzgbo zzgbo) {
        ListenableFuture listenableFuture;
        String str = zzbvk.zzd;
        zzv.zzq();
        if (zzs.zzD(str)) {
            listenableFuture = zzgch.zzg(new zzdyh(1));
        } else {
            listenableFuture = zzgch.zzf(zzdys.zza(zzbvk), ExecutionException.class, new zzdyr(), this.zza);
        }
        return (zzgby) zzgch.zzf((zzgby) zzgch.zzn((zzgby) zzgch.zzn(zzgby.zzu(listenableFuture), new zzdyp(), this.zza), zzgbo, this.zza), zzdyh.class, new zzdyq(this, zzdys2, zzbvk, zzgbo), this.zza);
    }

    public final ListenableFuture zza(zzbvk zzbvk) {
        zzdym zzdym = new zzdym(zzbvk);
        zzdxy zzdxy = this.zzb;
        Objects.requireNonNull(zzdxy);
        return zzg(zzbvk, new zzdyn(zzdxy), new zzdyo(this), zzdym);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzb(zzdys zzdys, zzbvk zzbvk, zzgbo zzgbo, zzdyh zzdyh) throws Exception {
        return zzgch.zzn(zzdys.zza(zzbvk), zzgbo, this.zza);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzc(zzbvk zzbvk) {
        return ((zzdzl) this.zzc.zzb()).zzb(zzbvk, Binder.getCallingUid());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzd(zzbvk zzbvk) {
        return this.zzb.zzd(zzbvk.zzh);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zze(zzbvk zzbvk) {
        return ((zzdzl) this.zzc.zzb()).zzj(zzbvk.zzh);
    }

    public final ListenableFuture zzf(zzbvk zzbvk) {
        return zzg(zzbvk, new zzdyk(this), new zzdyl(this), new zzdyj());
    }
}
