package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzher;
import com.google.android.gms.internal.ads.zzhfj;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class CsiParamDefaults_Factory implements zzher<CsiParamDefaults> {
    private final zzhfj zza;
    private final zzhfj zzb;

    public CsiParamDefaults_Factory(zzhfj<Context> zzhfj, zzhfj<VersionInfoParcel> zzhfj2) {
        this.zza = zzhfj;
        this.zzb = zzhfj2;
    }

    public static CsiParamDefaults_Factory create(zzhfj<Context> zzhfj, zzhfj<VersionInfoParcel> zzhfj2) {
        return new CsiParamDefaults_Factory(zzhfj, zzhfj2);
    }

    public static CsiParamDefaults newInstance(Context context, VersionInfoParcel versionInfoParcel) {
        return new CsiParamDefaults(context, versionInfoParcel);
    }

    /* renamed from: get */
    public CsiParamDefaults zzb() {
        return newInstance((Context) this.zza.zzb(), (VersionInfoParcel) this.zzb.zzb());
    }
}
