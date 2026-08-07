package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.ads.internal.util.client.zzu;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzebf implements zzffr {
    public final /* synthetic */ zzebk zza;
    public final /* synthetic */ zzu zzb;
    public final /* synthetic */ String zzc;

    public /* synthetic */ zzebf(zzebk zzebk, zzu zzu, String str) {
        this.zza = zzebk;
        this.zzb = zzu;
        this.zzc = str;
    }

    public final Object zza(Object obj) {
        this.zza.zzg((SQLiteDatabase) obj, this.zzb, this.zzc);
        return null;
    }
}
