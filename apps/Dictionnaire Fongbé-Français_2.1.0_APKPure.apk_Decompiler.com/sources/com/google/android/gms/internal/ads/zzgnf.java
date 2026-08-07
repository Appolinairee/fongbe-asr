package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgnf {
    private final Map zza;
    private final zzgnd zzb;
    private final Class zzc;
    private final zzglo zzd;

    /* synthetic */ zzgnf(Map map, List list, zzgnd zzgnd, zzglo zzglo, Class cls, zzgne zzgne) {
        this.zza = map;
        this.zzb = zzgnd;
        this.zzc = cls;
        this.zzd = zzglo;
    }

    public static zzgnc zzb(Class cls) {
        return new zzgnc(cls, (zzgne) null);
    }

    public final zzglo zza() {
        return this.zzd;
    }

    @Nullable
    public final zzgnd zzc() {
        return this.zzb;
    }

    public final Class zzd() {
        return this.zzc;
    }

    public final Collection zze() {
        return this.zza.values();
    }

    public final List zzf(byte[] bArr) {
        List list = (List) this.zza.get(zzgvo.zzb(bArr));
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }

    public final boolean zzg() {
        return !this.zzd.zza().isEmpty();
    }
}
