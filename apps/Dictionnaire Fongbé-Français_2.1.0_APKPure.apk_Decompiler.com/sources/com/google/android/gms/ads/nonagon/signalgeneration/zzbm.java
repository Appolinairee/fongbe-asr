package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.internal.ads.zzdee;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbm implements zzdee {
    private final zzb zza;
    private final int zzb;
    private final String zzc;

    public zzbm(zzb zzb2, int i, String str) {
        this.zza = zzb2;
        this.zzb = i;
        this.zzc = str;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzbk zzbk) {
        this.zza.zzd(this.zzc, zzbk);
    }

    public final void zze(zzbk zzbk) {
        if (zzbk != null && this.zzb == 2 && !TextUtils.isEmpty(this.zzc)) {
            zzs.zzh(new zzbl(this, zzbk));
        }
    }

    public final void zzf(String str) {
    }
}
