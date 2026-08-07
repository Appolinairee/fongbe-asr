package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.ads.zzbbq;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzeam implements zzffr {
    public final /* synthetic */ zzean zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ ArrayList zzc;
    public final /* synthetic */ zzbbq.zzab zzd;
    public final /* synthetic */ zzbbq.zzaf.zzd zze;

    public /* synthetic */ zzeam(zzean zzean, boolean z, ArrayList arrayList, zzbbq.zzab zzab, zzbbq.zzaf.zzd zzd2) {
        this.zza = zzean;
        this.zzb = z;
        this.zzc = arrayList;
        this.zzd = zzab;
        this.zze = zzd2;
    }

    public final Object zza(Object obj) {
        zzean zzean = this.zza;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (zzean.zzb.zzf()) {
            return null;
        }
        zzbbq.zzaf.zzd zzd2 = this.zze;
        zzbbq.zzab zzab = this.zzd;
        ArrayList arrayList = this.zzc;
        boolean z = this.zzb;
        byte[] zze2 = zzeao.zze(zzean.zzb, z, arrayList, zzab, zzd2);
        zzear.zzf(sQLiteDatabase, z, true);
        zzear.zzc(sQLiteDatabase, zzean.zzb.zzf.zzd(), zze2);
        return null;
    }
}
