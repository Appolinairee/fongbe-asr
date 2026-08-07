package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgmh {
    private static final zzgmh zza = new zzgmh();
    private final AtomicReference zzb = new AtomicReference(new zzgnb(new zzgmy((zzgna) null), (zzgna) null));

    zzgmh() {
    }

    public static zzgmh zza() {
        return zza;
    }

    public final Class zzb(Class cls) throws GeneralSecurityException {
        return ((zzgnb) this.zzb.get()).zza(cls);
    }

    public final Object zzc(zzgdx zzgdx, Class cls) throws GeneralSecurityException {
        return ((zzgnb) this.zzb.get()).zzb(zzgdx, cls);
    }

    public final Object zzd(zzgnf zzgnf, Class cls) throws GeneralSecurityException {
        return ((zzgnb) this.zzb.get()).zzc(zzgnf, cls);
    }

    public final synchronized void zze(zzgmx zzgmx) throws GeneralSecurityException {
        zzgmy zzgmy = new zzgmy((zzgnb) this.zzb.get(), (zzgna) null);
        zzgmy.zza(zzgmx);
        this.zzb.set(new zzgnb(zzgmy, (zzgna) null));
    }

    public final synchronized void zzf(zzgng zzgng) throws GeneralSecurityException {
        zzgmy zzgmy = new zzgmy((zzgnb) this.zzb.get(), (zzgna) null);
        zzgmy.zzb(zzgng);
        this.zzb.set(new zzgnb(zzgmy, (zzgna) null));
    }
}
