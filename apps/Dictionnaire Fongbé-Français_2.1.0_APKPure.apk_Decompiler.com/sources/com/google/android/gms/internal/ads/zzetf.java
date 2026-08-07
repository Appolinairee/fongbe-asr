package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzetf implements zzetr {
    private final zzgcs zza;
    private final Context zzb;
    private final VersionInfoParcel zzc;
    private final String zzd;

    zzetf(zzgcs zzgcs, Context context, VersionInfoParcel versionInfoParcel, String str) {
        this.zza = zzgcs;
        this.zzb = context;
        this.zzc = versionInfoParcel;
        this.zzd = str;
    }

    public final int zza() {
        return 35;
    }

    public final ListenableFuture zzb() {
        return this.zza.zzb(new zzete(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzetg zzc() throws Exception {
        int i;
        boolean isCallerInstantApp = Wrappers.packageManager(this.zzb).isCallerInstantApp();
        zzv.zzq();
        boolean zzF = zzs.zzF(this.zzb);
        String str = this.zzc.afmaVersion;
        zzv.zzq();
        boolean zzG = zzs.zzG();
        zzv.zzq();
        ApplicationInfo applicationInfo = this.zzb.getApplicationInfo();
        if (applicationInfo == null) {
            i = 0;
        } else {
            i = applicationInfo.targetSdkVersion;
        }
        Context context = this.zzb;
        String str2 = this.zzd;
        return new zzetg(isCallerInstantApp, zzF, str, zzG, i, DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID), DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID), str2);
    }
}
