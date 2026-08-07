package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgmg {
    private static final zzgmg zza = new zzgmg();
    private final Map zzb = new HashMap();

    zzgmg() {
    }

    public static zzgmg zzb() {
        return zza;
    }

    public final synchronized zzgek zza(String str) throws GeneralSecurityException {
        if (this.zzb.containsKey("AES128_GCM")) {
        } else {
            throw new GeneralSecurityException("Name AES128_GCM does not exist");
        }
        return (zzgek) this.zzb.get("AES128_GCM");
    }

    public final synchronized void zzc(String str, zzgek zzgek) throws GeneralSecurityException {
        if (!this.zzb.containsKey(str)) {
            this.zzb.put(str, zzgek);
        } else if (!((zzgek) this.zzb.get(str)).equals(zzgek)) {
            String valueOf = String.valueOf(this.zzb.get(str));
            String valueOf2 = String.valueOf(zzgek);
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + valueOf + "), cannot insert " + valueOf2);
        }
    }

    public final synchronized void zzd(Map map) throws GeneralSecurityException {
        for (Map.Entry entry : map.entrySet()) {
            zzc((String) entry.getKey(), (zzgek) entry.getValue());
        }
    }
}
