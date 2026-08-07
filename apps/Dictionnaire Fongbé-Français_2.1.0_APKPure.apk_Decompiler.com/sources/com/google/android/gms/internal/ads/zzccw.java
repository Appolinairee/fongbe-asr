package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzccw extends zzb {
    final zzcbs zza;
    final zzcde zzb;
    private final String zzc;
    private final String[] zzd;

    zzccw(zzcbs zzcbs, zzcde zzcde, String str, String[] strArr) {
        this.zza = zzcbs;
        this.zzb = zzcde;
        this.zzc = str;
        this.zzd = strArr;
        zzv.zzz().zzb(this);
    }

    public final void zza() {
        try {
            this.zzb.zzu(this.zzc, this.zzd);
        } finally {
            zzs.zza.post(new zzccv(this));
        }
    }

    public final ListenableFuture zzb() {
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzce)).booleanValue() || !(this.zzb instanceof zzcdn)) {
            return super.zzb();
        }
        return zzbzw.zzf.zzb(new zzccu(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Boolean zzd() throws Exception {
        return Boolean.valueOf(this.zzb.zzw(this.zzc, this.zzd, this));
    }

    public final String zze() {
        return this.zzc;
    }
}
