package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzbd;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbog {
    static final zzbd zza = new zzboe();
    static final zzbd zzb = new zzbof();
    private final zzbns zzc;

    public zzbog(Context context, VersionInfoParcel versionInfoParcel, String str, @Nullable zzfhk zzfhk) {
        this.zzc = new zzbns(context, versionInfoParcel, str, zza, zzb, zzfhk);
    }

    public final zzbnw zza(String str, zzbnz zzbnz, zzbny zzbny) {
        return new zzbok(this.zzc, str, zzbnz, zzbny);
    }

    public final zzbop zzb() {
        return new zzbop(this.zzc);
    }
}
