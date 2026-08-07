package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbnx {
    private final Object zza = new Object();
    private final Object zzb = new Object();
    private zzbog zzc;
    private zzbog zzd;

    private static final Context zzc(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final zzbog zza(Context context, VersionInfoParcel versionInfoParcel, zzfhk zzfhk) {
        zzbog zzbog;
        synchronized (this.zza) {
            if (this.zzc == null) {
                this.zzc = new zzbog(zzc(context), versionInfoParcel, (String) zzbe.zzc().zza(zzbcl.zza), zzfhk);
            }
            zzbog = this.zzc;
        }
        return zzbog;
    }

    public final zzbog zzb(Context context, VersionInfoParcel versionInfoParcel, zzfhk zzfhk) {
        zzbog zzbog;
        synchronized (this.zzb) {
            if (this.zzd == null) {
                this.zzd = new zzbog(zzc(context), versionInfoParcel, (String) zzbev.zza.zze(), zzfhk);
            }
            zzbog = this.zzd;
        }
        return zzbog;
    }
}
