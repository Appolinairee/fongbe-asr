package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults_Factory;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder_Factory;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdsg implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;

    public zzdsg(zzhfj zzhfj, zzhfj zzhfj2, zzhfj zzhfj3, zzhfj zzhfj4, zzhfj zzhfj5) {
        this.zza = zzhfj2;
        this.zzb = zzhfj3;
        this.zzc = zzhfj4;
        this.zzd = zzhfj5;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        CsiParamDefaults csiParamDefaults = ((CsiParamDefaults_Factory) this.zzb).zzb();
        CsiParamDefaults csiParamDefaults2 = csiParamDefaults;
        CsiUrlBuilder csiUrlBuilder = ((CsiUrlBuilder_Factory) this.zzc).zzb();
        CsiUrlBuilder csiUrlBuilder2 = csiUrlBuilder;
        Context zza2 = ((zzche) this.zzd).zza();
        Context context = zza2;
        return new zzdsb(zzffh.zzc(), (zzu) this.zza.zzb(), csiParamDefaults, csiUrlBuilder, zza2);
    }
}
