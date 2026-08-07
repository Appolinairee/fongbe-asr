package com.google.android.gms.internal.ads;

import android.content.Context;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzlq {
    private final zzik zza;

    @Deprecated
    public zzlq(Context context, zzced zzced) {
        this.zza = new zzik(context, zzced);
    }

    @Deprecated
    public final zzlq zza(zzkg zzkg) {
        zzik zzik = this.zza;
        zzcw.zzf(!zzik.zzr);
        zzkg.getClass();
        zzik.zzf = new zzic(zzkg);
        return this;
    }

    @Deprecated
    public final zzlq zzb(zzyb zzyb) {
        zzik zzik = this.zza;
        zzcw.zzf(!zzik.zzr);
        zzyb.getClass();
        zzik.zze = new zzij(zzyb);
        return this;
    }

    @Deprecated
    public final zzlr zzc() {
        zzik zzik = this.zza;
        zzcw.zzf(!zzik.zzr);
        zzik.zzr = true;
        return new zzlr(zzik);
    }
}
