package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzdgj implements zzcrc {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final zzhfj zzd;
    private final zzdiq zze;

    zzdgj(Map map, Map map2, Map map3, zzhfj zzhfj, zzdiq zzdiq) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zzhfj;
        this.zze = zzdiq;
    }

    public final zzecw zza(int i, String str) {
        zzecw zzecw;
        zzecw zzecw2 = (zzecw) this.zza.get(str);
        if (zzecw2 != null) {
            return zzecw2;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            zzefk zzefk = (zzefk) this.zzc.get(str);
            if (zzefk != null) {
                return new zzecx(zzefk, new zzcre());
            }
            zzecw = (zzecw) this.zzb.get(str);
            if (zzecw == null) {
                return null;
            }
        } else if (this.zze.zze() == null || (zzecw = ((zzcrc) this.zzd.zzb()).zza(i, str)) == null) {
            return null;
        }
        return new zzecx(zzecw, new zzcrf());
    }
}
