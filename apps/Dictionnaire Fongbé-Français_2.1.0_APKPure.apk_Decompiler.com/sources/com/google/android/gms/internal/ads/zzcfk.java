package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzn;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcfk {
    public static final zzcex zza(Context context, zzcgr zzcgr, String str, boolean z, boolean z2, zzava zzava, zzbds zzbds, VersionInfoParcel versionInfoParcel, zzbda zzbda, zzn zzn, zza zza, zzbbj zzbbj, zzfbo zzfbo, zzfbr zzfbr, zzebv zzebv, zzfcn zzfcn) throws zzcfj {
        StrictMode.ThreadPolicy threadPolicy;
        zzbcl.zza(context);
        try {
            zzcfg zzcfg = new zzcfg(context, zzcgr, str, z, z2, zzava, zzbds, versionInfoParcel, (zzbda) null, zzn, zza, zzbbj, zzfbo, zzfbr, zzfcn, zzebv);
            threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            Object zza2 = zzcfg.zza();
            StrictMode.setThreadPolicy(threadPolicy);
            return (zzcex) zza2;
        } catch (Throwable th) {
            throw new zzcfj("Webview initialization failed.", th);
        }
    }
}
