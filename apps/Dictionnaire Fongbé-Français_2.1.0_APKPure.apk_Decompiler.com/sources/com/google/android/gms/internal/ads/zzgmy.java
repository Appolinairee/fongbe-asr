package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgmy {
    /* access modifiers changed from: private */
    public final Map zza;
    /* access modifiers changed from: private */
    public final Map zzb;

    private zzgmy() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zzgmy zza(zzgmx zzgmx) throws GeneralSecurityException {
        if (zzgmx != null) {
            zzgmz zzgmz = new zzgmz(zzgmx.zzc(), zzgmx.zzd(), (zzgna) null);
            if (this.zza.containsKey(zzgmz)) {
                zzgmx zzgmx2 = (zzgmx) this.zza.get(zzgmz);
                if (!zzgmx2.equals(zzgmx) || !zzgmx.equals(zzgmx2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(zzgmz.toString()));
                }
            } else {
                this.zza.put(zzgmz, zzgmx);
            }
            return this;
        }
        throw new NullPointerException("primitive constructor must be non-null");
    }

    public final zzgmy zzb(zzgng zzgng) throws GeneralSecurityException {
        Map map = this.zzb;
        Class zzb2 = zzgng.zzb();
        if (map.containsKey(zzb2)) {
            zzgng zzgng2 = (zzgng) this.zzb.get(zzb2);
            if (!zzgng2.equals(zzgng) || !zzgng.equals(zzgng2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(zzb2.toString()));
            }
        } else {
            this.zzb.put(zzb2, zzgng);
        }
        return this;
    }

    /* synthetic */ zzgmy(zzgna zzgna) {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    /* synthetic */ zzgmy(zzgnb zzgnb, zzgna zzgna) {
        this.zza = new HashMap(zzgnb.zza);
        this.zzb = new HashMap(zzgnb.zzb);
    }
}
