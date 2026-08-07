package com.google.android.gms.internal.ads;

import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdiq {
    public static final zzdiq zza = new zzdiq(new zzdio());
    private final zzbgx zzb;
    private final zzbgu zzc;
    private final zzbhk zzd;
    private final zzbhh zze;
    private final zzbmi zzf;
    private final SimpleArrayMap zzg;
    private final SimpleArrayMap zzh;

    private zzdiq(zzdio zzdio) {
        this.zzb = zzdio.zza;
        this.zzc = zzdio.zzb;
        this.zzd = zzdio.zzc;
        this.zzg = new SimpleArrayMap(zzdio.zzf);
        this.zzh = new SimpleArrayMap(zzdio.zzg);
        this.zze = zzdio.zzd;
        this.zzf = zzdio.zze;
    }

    public final zzbgu zza() {
        return this.zzc;
    }

    public final zzbgx zzb() {
        return this.zzb;
    }

    public final zzbha zzc(String str) {
        return (zzbha) this.zzh.get(str);
    }

    public final zzbhd zzd(String str) {
        if (str == null) {
            return null;
        }
        return (zzbhd) this.zzg.get(str);
    }

    public final zzbhh zze() {
        return this.zze;
    }

    public final zzbhk zzf() {
        return this.zzd;
    }

    public final zzbmi zzg() {
        return this.zzf;
    }

    public final ArrayList zzh() {
        ArrayList arrayList = new ArrayList(this.zzg.size());
        for (int i = 0; i < this.zzg.size(); i++) {
            arrayList.add((String) this.zzg.keyAt(i));
        }
        return arrayList;
    }

    public final ArrayList zzi() {
        ArrayList arrayList = new ArrayList();
        if (this.zzd != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzb != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzc != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.zzg.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzf != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }
}
