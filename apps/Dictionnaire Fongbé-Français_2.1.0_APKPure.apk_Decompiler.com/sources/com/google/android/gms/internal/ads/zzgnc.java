package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgnc {
    private final Class zza;
    private Map zzb = new HashMap();
    private final List zzc = new ArrayList();
    private zzgnd zzd;
    private zzglo zze;

    /* synthetic */ zzgnc(Class cls, zzgne zzgne) {
        this.zza = cls;
        this.zze = zzglo.zza;
    }

    private final zzgnc zze(Object obj, zzgdx zzgdx, zzgsv zzgsv, boolean z) throws GeneralSecurityException {
        byte[] bArr;
        if (this.zzb == null) {
            throw new IllegalStateException("addEntry cannot be called after build");
        } else if (obj == null) {
            throw new NullPointerException("`fullPrimitive` must not be null");
        } else if (zzgsv.zzk() == 3) {
            int ordinal = zzgsv.zzf().ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        bArr = zzgds.zza;
                    } else if (ordinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                }
                bArr = zzgml.zza(zzgsv.zza()).zzc();
            } else {
                bArr = zzgml.zzb(zzgsv.zza()).zzc();
            }
            zzgnd zzgnd = new zzgnd(obj, zzgvo.zzb(bArr), zzgsv.zzk(), zzgsv.zzf(), zzgsv.zza(), zzgsv.zzb().zzg(), zzgdx, (zzgne) null);
            Map map = this.zzb;
            List list = this.zzc;
            ArrayList arrayList = new ArrayList();
            arrayList.add(zzgnd);
            List list2 = (List) map.put(zzgnd.zzb, Collections.unmodifiableList(arrayList));
            if (list2 != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(list2);
                arrayList2.add(zzgnd);
                map.put(zzgnd.zzb, Collections.unmodifiableList(arrayList2));
            }
            list.add(zzgnd);
            if (z) {
                if (this.zzd == null) {
                    this.zzd = zzgnd;
                } else {
                    throw new IllegalStateException("you cannot set two primary primitives");
                }
            }
            return this;
        } else {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
    }

    public final zzgnc zza(Object obj, zzgdx zzgdx, zzgsv zzgsv) throws GeneralSecurityException {
        zze(obj, zzgdx, zzgsv, false);
        return this;
    }

    public final zzgnc zzb(Object obj, zzgdx zzgdx, zzgsv zzgsv) throws GeneralSecurityException {
        zze(obj, zzgdx, zzgsv, true);
        return this;
    }

    public final zzgnc zzc(zzglo zzglo) {
        if (this.zzb != null) {
            this.zze = zzglo;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build");
    }

    public final zzgnf zzd() throws GeneralSecurityException {
        Map map = this.zzb;
        if (map != null) {
            zzgnf zzgnf = new zzgnf(map, this.zzc, this.zzd, this.zze, this.zza, (zzgne) null);
            this.zzb = null;
            return zzgnf;
        }
        throw new IllegalStateException("build cannot be called twice");
    }
}
