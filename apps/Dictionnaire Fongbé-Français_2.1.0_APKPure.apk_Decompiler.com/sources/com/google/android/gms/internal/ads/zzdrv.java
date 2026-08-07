package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdrv {
    final /* synthetic */ zzdrw zza;
    private final Map zzb = new ConcurrentHashMap();

    zzdrv(zzdrw zzdrw) {
        this.zza = zzdrw;
    }

    public final zzdrv zzb(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final zzdrv zzc(zzfbo zzfbo) {
        zzb("aai", zzfbo.zzw);
        zzb("request_id", zzfbo.zzan);
        zzb("ad_format", zzfbo.zza(zzfbo.zzb));
        return this;
    }

    public final zzdrv zzd(zzfbr zzfbr) {
        zzb("gqi", zzfbr.zzb);
        return this;
    }

    public final String zze() {
        return this.zza.zza.zzb(this.zzb);
    }

    public final void zzf() {
        this.zza.zzb.execute(new zzdru(this));
    }

    public final void zzg() {
        this.zza.zzb.execute(new zzdrs(this));
    }

    public final void zzh() {
        this.zza.zzb.execute(new zzdrt(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzi() {
        this.zza.zza.zze(this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzj() {
        this.zza.zza.zzg(this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzk() {
        this.zza.zza.zzf(this.zzb);
    }
}
