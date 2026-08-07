package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcnc {
    private final String zza;
    private final zzbop zzb;
    /* access modifiers changed from: private */
    public final Executor zzc;
    /* access modifiers changed from: private */
    public zzcnh zzd;
    private final zzbjp zze = new zzcmz(this);
    private final zzbjp zzf = new zzcnb(this);

    public zzcnc(String str, zzbop zzbop, Executor executor) {
        this.zza = str;
        this.zzb = zzbop;
        this.zzc = executor;
    }

    static /* bridge */ /* synthetic */ boolean zzg(zzcnc zzcnc, Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(zzcnc.zza);
    }

    public final void zzc(zzcnh zzcnh) {
        this.zzb.zzb("/updateActiveView", this.zze);
        this.zzb.zzb("/untrackActiveViewUnit", this.zzf);
        this.zzd = zzcnh;
    }

    public final void zzd(zzcex zzcex) {
        zzcex.zzag("/updateActiveView", this.zze);
        zzcex.zzag("/untrackActiveViewUnit", this.zzf);
    }

    public final void zze() {
        this.zzb.zzc("/updateActiveView", this.zze);
        this.zzb.zzc("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzf(zzcex zzcex) {
        zzcex.zzaz("/updateActiveView", this.zze);
        zzcex.zzaz("/untrackActiveViewUnit", this.zzf);
    }
}
