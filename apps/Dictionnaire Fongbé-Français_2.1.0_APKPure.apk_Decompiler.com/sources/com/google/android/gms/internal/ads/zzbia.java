package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.zzf;
import com.google.android.gms.ads.formats.zzg;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzbia {
    /* access modifiers changed from: private */
    public final zzg zza;
    /* access modifiers changed from: private */
    public final zzf zzb;
    private zzbgr zzc;

    public zzbia(zzg zzg, zzf zzf) {
        this.zza = zzg;
        this.zzb = zzf;
    }

    /* access modifiers changed from: private */
    public final synchronized zzbgr zzf(zzbgq zzbgq) {
        zzbgr zzbgr = this.zzc;
        if (zzbgr != null) {
            return zzbgr;
        }
        zzbgr zzbgr2 = new zzbgr(zzbgq);
        this.zzc = zzbgr2;
        return zzbgr2;
    }

    public final zzbha zzc() {
        if (this.zzb == null) {
            return null;
        }
        return new zzbhx(this, (zzbhz) null);
    }

    public final zzbhd zzd() {
        return new zzbhy(this, (zzbhz) null);
    }
}
