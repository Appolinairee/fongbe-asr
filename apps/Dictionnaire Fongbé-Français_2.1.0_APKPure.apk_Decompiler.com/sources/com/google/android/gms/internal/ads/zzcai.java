package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public class zzcai {
    private final zzcab zza;
    /* access modifiers changed from: private */
    public final AtomicInteger zzb = new AtomicInteger(0);

    public zzcai() {
        zzcab zzcab = new zzcab();
        this.zza = zzcab;
        zzgch.zzr(zzcab, new zzcag(this), zzbzw.zzg);
    }

    @Deprecated
    public final int zze() {
        return this.zzb.get();
    }

    @Deprecated
    public final void zzg() {
        this.zza.zzd(new Exception());
    }

    @Deprecated
    public final void zzh(Throwable th, String str) {
        this.zza.zzd(th);
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzhB)).booleanValue()) {
            zzv.zzp().zzv(th, str);
        }
    }

    @Deprecated
    public final void zzi(Object obj) {
        this.zza.zzc(obj);
    }

    @Deprecated
    public final void zzj(zzcaf zzcaf, zzcad zzcad) {
        zzgch.zzr(this.zza, new zzcah(this, zzcaf, zzcad), zzbzw.zzg);
    }
}
