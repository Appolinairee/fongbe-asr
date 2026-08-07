package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzbbq;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcsp implements zzcxh, zza, zzcyq, zzcwn, zzcvt, zzdbc {
    private final Clock zza;
    private final zzbzf zzb;

    public zzcsp(Clock clock, zzbzf zzbzf) {
        this.zza = clock;
        this.zzb = zzbzf;
    }

    public final void onAdClicked() {
        this.zzb.zzd();
    }

    public final void zza() {
        this.zzb.zze();
    }

    public final void zzb() {
    }

    public final void zzc() {
    }

    public final void zzdl(zzbvk zzbvk) {
    }

    public final void zzdm(zzfca zzfca) {
        this.zzb.zzk(this.zza.elapsedRealtime());
    }

    public final void zzdq(zzbvw zzbvw, String str, String str2) {
    }

    public final void zze() {
    }

    public final void zzf() {
    }

    public final String zzg() {
        return this.zzb.zzc();
    }

    public final void zzh() {
    }

    public final void zzi(zzbbq.zzb zzb2) {
        this.zzb.zzi();
    }

    public final void zzj(zzbbq.zzb zzb2) {
    }

    public final void zzk(zzm zzm) {
        this.zzb.zzj(zzm);
    }

    public final void zzl(boolean z) {
    }

    public final void zzm(zzbbq.zzb zzb2) {
        this.zzb.zzg();
    }

    public final void zzn(boolean z) {
    }

    public final void zzr() {
        this.zzb.zzf();
    }

    public final void zzs() {
        this.zzb.zzh(true);
    }
}
