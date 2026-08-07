package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzby {
    public static final zzby zza = new zzby(zzfxn.zzn());
    private final zzfxn zzb;

    static {
        Integer.toString(0, 36);
    }

    public zzby(List list) {
        this.zzb = zzfxn.zzl(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zzb.equals(((zzby) obj).zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final zzfxn zza() {
        return this.zzb;
    }

    public final boolean zzb(int i) {
        for (int i2 = 0; i2 < this.zzb.size(); i2++) {
            zzbx zzbx = (zzbx) this.zzb.get(i2);
            if (zzbx.zzc() && zzbx.zza() == i) {
                return true;
            }
        }
        return false;
    }
}
