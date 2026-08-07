package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzbl;
import com.google.android.gms.ads.internal.client.zzbr;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzcq;
import com.google.android.gms.ads.internal.client.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzejq extends zzbt {
    final zzfch zza;
    final zzdio zzb = new zzdio();
    private final Context zzc;
    private final zzcgx zzd;
    private zzbl zze;

    public zzejq(zzcgx zzcgx, Context context, String str) {
        zzfch zzfch = new zzfch();
        this.zza = zzfch;
        this.zzd = zzcgx;
        zzfch.zzt(str);
        this.zzc = context;
    }

    public final zzbr zze() {
        zzdiq zzg = this.zzb.zzg();
        this.zza.zzE(zzg.zzi());
        this.zza.zzF(zzg.zzh());
        zzfch zzfch = this.zza;
        if (zzfch.zzh() == null) {
            zzfch.zzs(zzs.zzc());
        }
        return new zzejr(this.zzc, this.zzd, this.zza, zzg, this.zze);
    }

    public final void zzf(zzbgu zzbgu) {
        this.zzb.zza(zzbgu);
    }

    public final void zzg(zzbgx zzbgx) {
        this.zzb.zzb(zzbgx);
    }

    public final void zzh(String str, zzbhd zzbhd, zzbha zzbha) {
        this.zzb.zzc(str, zzbhd, zzbha);
    }

    public final void zzi(zzbmi zzbmi) {
        this.zzb.zzd(zzbmi);
    }

    public final void zzj(zzbhh zzbhh, zzs zzs) {
        this.zzb.zze(zzbhh);
        this.zza.zzs(zzs);
    }

    public final void zzk(zzbhk zzbhk) {
        this.zzb.zzf(zzbhk);
    }

    public final void zzl(zzbl zzbl) {
        this.zze = zzbl;
    }

    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zza.zzr(adManagerAdViewOptions);
    }

    public final void zzn(zzblz zzblz) {
        this.zza.zzw(zzblz);
    }

    public final void zzo(zzbfl zzbfl) {
        this.zza.zzD(zzbfl);
    }

    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) {
        this.zza.zzG(publisherAdViewOptions);
    }

    public final void zzq(zzcq zzcq) {
        this.zza.zzV(zzcq);
    }
}
