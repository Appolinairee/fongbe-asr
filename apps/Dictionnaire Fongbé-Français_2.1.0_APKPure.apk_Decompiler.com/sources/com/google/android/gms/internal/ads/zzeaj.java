package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.ads.zzbbq;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzeaj implements zzffr {
    public final /* synthetic */ zzeak zza;
    public final /* synthetic */ long zzb;

    public /* synthetic */ zzeaj(zzeak zzeak, long j) {
        this.zza = zzeak;
        this.zzb = j;
    }

    public final Object zza(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (this.zza.zzf()) {
            return null;
        }
        long j = this.zzb;
        zzbbq.zzaf.zza.C0002zza zzn = zzbbq.zzaf.zza.zzn();
        zzn.zzP(j);
        byte[] zzaV = ((zzbbq.zzaf.zza) zzn.zzbr()).zzaV();
        zzear.zzf(sQLiteDatabase, false, false);
        zzear.zzc(sQLiteDatabase, j, zzaV);
        return null;
    }
}
