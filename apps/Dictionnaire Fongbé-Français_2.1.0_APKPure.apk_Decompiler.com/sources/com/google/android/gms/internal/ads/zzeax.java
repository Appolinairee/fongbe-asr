package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbbq;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeax {
    private final zzbbj zza;
    private final Context zzb;
    private final zzeac zzc;
    private final VersionInfoParcel zzd;

    public zzeax(Context context, VersionInfoParcel versionInfoParcel, zzbbj zzbbj, zzeac zzeac) {
        this.zzb = context;
        this.zzd = versionInfoParcel;
        this.zza = zzbbj;
        this.zzc = zzeac;
    }

    public final void zzb(boolean z) {
        try {
            this.zzc.zza(new zzeau(this, z));
        } catch (Exception e) {
            zzo.zzg("Error in offline signals database startup: ".concat(String.valueOf(e.getMessage())));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void zza(boolean z, SQLiteDatabase sQLiteDatabase) throws Exception {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        if (z) {
            this.zzb.deleteDatabase("OfflineUpload.db");
        } else {
            ArrayList arrayList = new ArrayList();
            Cursor query = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, (String) null, (String[]) null, (String) null, (String) null, (String) null);
            while (query.moveToNext()) {
                try {
                    arrayList.add(zzbbq.zzaf.zza.zzx(query.getBlob(query.getColumnIndexOrThrow("serialized_proto_data"))));
                } catch (zzgyg e) {
                    zzo.zzg("Unable to deserialize proto from offline signals database:");
                    zzo.zzg(e.getMessage());
                }
            }
            query.close();
            Context context = this.zzb;
            zzbbq.zzaf.zzc zzi = zzbbq.zzaf.zzi();
            zzi.zzv(context.getPackageName());
            zzi.zzy(Build.MODEL);
            zzi.zzA(zzear.zza(sQLiteDatabase2, 0));
            zzi.zzh(arrayList);
            zzi.zzE(zzear.zza(sQLiteDatabase2, 1));
            zzi.zzx(zzear.zza(sQLiteDatabase2, 3));
            zzi.zzF(zzv.zzC().currentTimeMillis());
            zzi.zzB(zzear.zzb(sQLiteDatabase2, 2));
            zzbbq.zzaf zzaf = (zzbbq.zzaf) zzi.zzbr();
            int size = arrayList.size();
            long j = 0;
            for (int i = 0; i < size; i++) {
                zzbbq.zzaf.zza zza2 = (zzbbq.zzaf.zza) arrayList.get(i);
                if (zza2.zzk() == zzbbq.zzq.ENUM_TRUE && zza2.zze() > j) {
                    j = zza2.zze();
                }
            }
            if (j != 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, Long.valueOf(j));
                sQLiteDatabase2.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", (String[]) null);
            }
            this.zza.zzb(new zzeav(zzaf));
            VersionInfoParcel versionInfoParcel = this.zzd;
            zzbbq.zzar.zza zzd2 = zzbbq.zzar.zzd();
            zzd2.zzg(versionInfoParcel.buddyApkVersion);
            zzd2.zzi(this.zzd.clientJarVersion);
            zzd2.zzh(true != this.zzd.isClientJar ? 2 : 0);
            this.zza.zzb(new zzeaw((zzbbq.zzar) zzd2.zzbr()));
            this.zza.zzc(10004);
            zzear.zze(sQLiteDatabase);
        }
        return null;
    }
}
