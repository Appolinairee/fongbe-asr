package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzd {
    private SharedPreferences zza;
    private SharedPreferences.Editor zzb;
    private final Context zzc;
    private final Object zzd = new Object();

    zzd(Context context) {
        this.zzc = context;
    }

    private final void zzk() {
        synchronized (this.zzd) {
            if (this.zza == null) {
                SharedPreferences sharedPreferences = this.zzc.getSharedPreferences("query_info_shared_prefs", 0);
                this.zza = sharedPreferences;
                this.zzb = sharedPreferences.edit();
            }
        }
    }

    public final int zza() {
        int i;
        zzk();
        synchronized (this.zzd) {
            i = this.zza.getInt("aav", -1);
        }
        return i;
    }

    public final int zzb() {
        int i;
        zzk();
        synchronized (this.zzd) {
            i = this.zza.getInt("vc", -1);
        }
        return i;
    }

    public final String zzc(String str) {
        String string;
        zzk();
        synchronized (this.zzd) {
            string = this.zza.getString(str, (String) null);
            this.zzb.remove(str).commit();
        }
        return string;
    }

    public final String zzd() {
        String string;
        zzk();
        synchronized (this.zzd) {
            string = this.zza.getString("dm", (String) null);
        }
        return string;
    }

    public final String zze() {
        String string;
        zzk();
        synchronized (this.zzd) {
            string = this.zza.getString("pn", (String) null);
        }
        return string;
    }

    public final Map zzf() {
        HashMap hashMap;
        zzk();
        synchronized (this.zzd) {
            Map<String, ?> all = this.zza.getAll();
            hashMap = new HashMap();
            for (Map.Entry next : all.entrySet()) {
                if ((next.getValue() instanceof String) && !Objects.equals(next.getKey(), "pn") && !Objects.equals(next.getKey(), "vc") && !Objects.equals(next.getKey(), "dm") && !Objects.equals(next.getKey(), "aav")) {
                    hashMap.put((String) next.getKey(), (String) next.getValue());
                }
            }
        }
        return hashMap;
    }

    public final void zzg() {
        zzk();
        synchronized (this.zzd) {
            this.zzb.clear().commit();
        }
    }

    public final void zzh(String str, String str2) {
        zzk();
        synchronized (this.zzd) {
            this.zzb.putString(str, str2).commit();
        }
    }

    public final void zzi(String str, int i, String str2, int i2) {
        zzk();
        synchronized (this.zzd) {
            this.zzb.putString("pn", str).putInt("vc", i).putString("dm", str2).putInt("aav", i2).commit();
        }
    }

    public final boolean zzj(String str) {
        boolean contains;
        zzk();
        synchronized (this.zzd) {
            contains = this.zza.contains(str);
        }
        return contains;
    }
}
