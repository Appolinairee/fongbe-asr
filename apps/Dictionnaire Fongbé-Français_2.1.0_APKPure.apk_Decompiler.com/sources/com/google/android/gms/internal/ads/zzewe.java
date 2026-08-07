package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzewe implements zzher {
    public static zzetu zza(Context context, zzbza zzbza, zzbzb zzbzb, Object obj, zzeux zzeux, zzevr zzevr, zzhel zzhel, zzhel zzhel2, zzhel zzhel3, zzhel zzhel4, zzhel zzhel5, zzhel zzhel6, zzhel zzhel7, Executor executor, zzfhh zzfhh, zzdrw zzdrw) {
        HashSet hashSet = new HashSet();
        hashSet.add((zzevk) obj);
        hashSet.add(zzeux);
        hashSet.add(zzevr);
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzfH)).booleanValue()) {
            hashSet.add((zzetr) zzhel.zzb());
        }
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzfI)).booleanValue()) {
            hashSet.add((zzetr) zzhel2.zzb());
        }
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzfK)).booleanValue()) {
            hashSet.add((zzetr) zzhel4.zzb());
        }
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzfL)).booleanValue()) {
            hashSet.add((zzetr) zzhel5.zzb());
        }
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzdd)).booleanValue()) {
            hashSet.add((zzetr) zzhel7.zzb());
        }
        zzetu zzetu = new zzetu(context, executor, hashSet, zzfhh, zzdrw);
        zzetu zzetu2 = zzetu;
        return zzetu;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }
}
