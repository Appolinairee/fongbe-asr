package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdtu implements Runnable {
    public final /* synthetic */ zzcab zza;

    public /* synthetic */ zzdtu(zzdua zzdua, zzcab zzcab) {
        this.zza = zzcab;
    }

    public final void run() {
        String zzc = zzv.zzp().zzi().zzg().zzc();
        boolean isEmpty = TextUtils.isEmpty(zzc);
        zzcab zzcab = this.zza;
        if (!isEmpty) {
            zzcab.zzc(zzc);
        } else {
            zzcab.zzd(new Exception());
        }
    }
}
