package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzr;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdno extends zzdmy implements zzdds {
    private zzdds zza;

    public final synchronized void zzdd() {
        zzdds zzdds = this.zza;
        if (zzdds != null) {
            zzdds.zzdd();
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void zzi(zza zza2, zzbif zzbif, zzr zzr, zzbih zzbih, zzac zzac, zzdds zzdds) {
        super.zzh(zza2, zzbif, zzr, zzbih, zzac);
        this.zza = zzdds;
    }

    public final synchronized void zzu() {
        zzdds zzdds = this.zza;
        if (zzdds != null) {
            zzdds.zzu();
        }
    }
}
