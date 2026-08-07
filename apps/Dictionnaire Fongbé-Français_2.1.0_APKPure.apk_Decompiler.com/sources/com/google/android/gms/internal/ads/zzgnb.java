package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgnb {
    /* access modifiers changed from: private */
    public final Map zza;
    /* access modifiers changed from: private */
    public final Map zzb;

    /* synthetic */ zzgnb(zzgmy zzgmy, zzgna zzgna) {
        this.zza = new HashMap(zzgmy.zza);
        this.zzb = new HashMap(zzgmy.zzb);
    }

    public final Class zza(Class cls) throws GeneralSecurityException {
        if (this.zzb.containsKey(cls)) {
            return ((zzgng) this.zzb.get(cls)).zza();
        }
        String obj = cls.toString();
        throw new GeneralSecurityException("No input primitive class for " + obj + " available");
    }

    public final Object zzb(zzgdx zzgdx, Class cls) throws GeneralSecurityException {
        zzgmz zzgmz = new zzgmz(zzgdx.getClass(), cls, (zzgna) null);
        if (this.zza.containsKey(zzgmz)) {
            return ((zzgmx) this.zza.get(zzgmz)).zza(zzgdx);
        }
        String obj = zzgmz.toString();
        throw new GeneralSecurityException("No PrimitiveConstructor for " + obj + " available");
    }

    public final Object zzc(zzgnf zzgnf, Class cls) throws GeneralSecurityException {
        if (this.zzb.containsKey(cls)) {
            zzgng zzgng = (zzgng) this.zzb.get(cls);
            if (zzgnf.zzd().equals(zzgng.zza()) && zzgng.zza().equals(zzgnf.zzd())) {
                return zzgng.zzc(zzgnf);
            }
            throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
    }
}
