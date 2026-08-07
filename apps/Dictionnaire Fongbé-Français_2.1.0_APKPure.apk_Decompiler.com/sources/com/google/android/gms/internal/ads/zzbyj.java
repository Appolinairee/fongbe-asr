package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public abstract class zzbyj {
    static zzbyj zza;

    public static synchronized zzbyj zzd(Context context) {
        synchronized (zzbyj.class) {
            zzbyj zzbyj = zza;
            if (zzbyj != null) {
                return zzbyj;
            }
            Context applicationContext = context.getApplicationContext();
            zzbcl.zza(applicationContext);
            zzg zzi = zzv.zzp().zzi();
            zzi.zzp(applicationContext);
            zzbyb zzbyb = new zzbyb((zzbyd) null);
            zzbyb.zzb(applicationContext);
            zzbyb.zzc(zzv.zzC());
            zzbyb.zza(zzi);
            zzbyb.zzd(zzv.zzo());
            zzbyj zze = zzbyb.zze();
            zza = zze;
            zze.zza().zza();
            zzbyn zzc = zza.zzc();
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzaE)).booleanValue()) {
                zzv.zzq();
                Map zzw = zzs.zzw((String) zzbe.zzc().zza(zzbcl.zzaF));
                for (String zzc2 : zzw.keySet()) {
                    zzc.zzc(zzc2);
                }
                zzc.zzd(new zzbyl(zzc, zzw));
            }
            zzbyj zzbyj2 = zza;
            return zzbyj2;
        }
    }

    /* access modifiers changed from: package-private */
    public abstract zzbxv zza();

    /* access modifiers changed from: package-private */
    public abstract zzbxz zzb();

    /* access modifiers changed from: package-private */
    public abstract zzbyn zzc();
}
