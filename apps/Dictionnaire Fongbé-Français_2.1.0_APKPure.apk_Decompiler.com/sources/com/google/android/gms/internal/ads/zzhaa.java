package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzhaa implements Iterator {
    final /* synthetic */ zzhad zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    /* synthetic */ zzhaa(zzhad zzhad, zzhac zzhac) {
        this.zza = zzhad;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzc.entrySet().iterator();
        }
        return this.zzd;
    }

    public final boolean hasNext() {
        int i = this.zzb + 1;
        zzhad zzhad = this.zza;
        if (i >= zzhad.zzb) {
            return !zzhad.zzc.isEmpty() && zza().hasNext();
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i = this.zzb + 1;
        this.zzb = i;
        zzhad zzhad = this.zza;
        if (i < zzhad.zzb) {
            return (zzgzz) zzhad.zza[i];
        }
        return (Map.Entry) zza().next();
    }

    public final void remove() {
        if (this.zzc) {
            this.zzc = false;
            this.zza.zzo();
            int i = this.zzb;
            zzhad zzhad = this.zza;
            if (i < zzhad.zzb) {
                this.zzb = i - 1;
                Object unused = zzhad.zzm(i);
                return;
            }
            zza().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
