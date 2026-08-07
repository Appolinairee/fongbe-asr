package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import androidx.core.app.NotificationManagerCompat;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzik {
    final Context zza;
    zzcx zzb = zzcx.zza;
    zzfvf zzc;
    zzfvf zzd;
    zzfvf zze;
    zzfvf zzf;
    zzfvf zzg;
    zzfuc zzh;
    Looper zzi = zzei.zzz();
    int zzj = NotificationManagerCompat.IMPORTANCE_UNSPECIFIED;
    zze zzk = zze.zza;
    int zzl = 1;
    boolean zzm = true;
    zzlp zzn = zzlp.zzb;
    long zzo = 500;
    long zzp = 2000;
    boolean zzq = true;
    boolean zzr;
    String zzs = "";
    zzhv zzt = new zzhv(0.97f, 1.03f, 1000, 1.0E-7f, zzei.zzs(20), zzei.zzs(500), 0.999f, (zzhu) null);

    static /* synthetic */ zzuf zza(Context context) {
        return new zztt(context, new zzach());
    }

    public zzik(Context context, zzced zzced) {
        Context context2 = context;
        zzid zzid = new zzid(zzced);
        zzie zzie = new zzie(context2);
        zzif zzif = new zzif(context2);
        zzig zzig = new zzig();
        zzih zzih = new zzih(context2);
        zzii zzii = new zzii();
        context.getClass();
        Context context3 = context2;
        this.zza = context2;
        this.zzc = zzid;
        this.zzd = zzie;
        this.zze = zzif;
        this.zzf = zzig;
        this.zzg = zzih;
        this.zzh = zzii;
    }
}
