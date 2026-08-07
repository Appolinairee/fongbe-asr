package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfgd {
    final /* synthetic */ zzfgf zza;
    private final Object zzb;
    private final String zzc;
    private final ListenableFuture zzd;
    private final List zze;
    private final ListenableFuture zzf;

    private zzfgd(zzfgf zzfgf, Object obj, String str, ListenableFuture listenableFuture, List list, ListenableFuture listenableFuture2) {
        this.zza = zzfgf;
        this.zzb = obj;
        this.zzc = str;
        this.zzd = listenableFuture;
        this.zze = list;
        this.zzf = listenableFuture2;
    }

    /* synthetic */ zzfgd(zzfgf zzfgf, Object obj, String str, ListenableFuture listenableFuture, List list, ListenableFuture listenableFuture2, zzfge zzfge) {
        this(zzfgf, obj, (String) null, listenableFuture, list, listenableFuture2);
    }

    public final zzfft zza() {
        Object obj = this.zzb;
        String str = this.zzc;
        if (str == null) {
            str = this.zza.zzf(obj);
        }
        zzfft zzfft = new zzfft(obj, str, this.zzf);
        this.zza.zzd.zza(zzfft);
        this.zzd.addListener(new zzfgb(this, zzfft), zzbzw.zzg);
        zzgch.zzr(zzfft, new zzfgc(this, zzfft), zzbzw.zzg);
        return zzfft;
    }

    public final zzfgd zzb(Object obj) {
        return this.zza.zzb(obj, zza());
    }

    public final zzfgd zzc(Class cls, zzgbo zzgbo) {
        return new zzfgd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgch.zzf(this.zzf, cls, zzgbo, this.zza.zzb));
    }

    public final zzfgd zzd(ListenableFuture listenableFuture) {
        return zzg(new zzfga(listenableFuture), zzbzw.zzg);
    }

    public final zzfgd zze(zzffr zzffr) {
        return zzf(new zzffz(zzffr));
    }

    public final zzfgd zzf(zzgbo zzgbo) {
        return zzg(zzgbo, this.zza.zzb);
    }

    public final zzfgd zzg(zzgbo zzgbo, Executor executor) {
        return new zzfgd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgch.zzn(this.zzf, zzgbo, executor));
    }

    public final zzfgd zzh(String str) {
        return new zzfgd(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final zzfgd zzi(long j, TimeUnit timeUnit) {
        return new zzfgd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzgch.zzo(this.zzf, j, timeUnit, this.zza.zzc));
    }
}
