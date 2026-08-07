package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzam {
    public final Uri zza;
    public final String zzb = null;
    public final zzaj zzc = null;
    public final zzae zzd = null;
    public final List zze;
    public final String zzf;
    public final zzfxn zzg;
    public final Object zzh;
    public final long zzi;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
    }

    /* synthetic */ zzam(Uri uri, String str, zzaj zzaj, zzae zzae, List list, String str2, zzfxn zzfxn, Object obj, long j, zzaq zzaq) {
        this.zza = uri;
        int i = zzbb.zza;
        this.zze = list;
        this.zzf = null;
        this.zzg = zzfxn;
        zzfxk zzfxk = new zzfxk();
        if (zzfxn.size() <= 0) {
            zzfxk.zzi();
            this.zzh = null;
            this.zzi = -9223372036854775807L;
            return;
        }
        zzap zzap = (zzap) zzfxn.get(0);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzam)) {
            return false;
        }
        zzam zzam = (zzam) obj;
        if (this.zza.equals(zzam.zza)) {
            String str = zzam.zzb;
            zzaj zzaj = zzam.zzc;
            zzae zzae = zzam.zzd;
            if (this.zze.equals(zzam.zze)) {
                String str2 = zzam.zzf;
                if (this.zzg.equals(zzam.zzg)) {
                    Object obj2 = zzam.zzh;
                    long j = zzam.zzi;
                    if (Objects.equals(-9223372036854775807L, -9223372036854775807L)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) ((((long) (((((this.zza.hashCode() * 923521) + this.zze.hashCode()) * 961) + this.zzg.hashCode()) * 31)) * 31) - Long.MAX_VALUE);
    }
}
