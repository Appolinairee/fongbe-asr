package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgmk {
    private static final zzgmk zza = ((zzgmk) zzgnt.zza(new zzgmi()));
    private final AtomicReference zzb = new AtomicReference(new zzgnr(new zzgnn(), (zzgnq) null));

    public static zzgmk zzc() {
        return zza;
    }

    public final zzgdx zza(zzgnm zzgnm, @Nullable zzgeo zzgeo) throws GeneralSecurityException {
        return ((zzgnr) this.zzb.get()).zza(zzgnm, zzgeo);
    }

    public final zzgek zzb(zzgnm zzgnm) throws GeneralSecurityException {
        return ((zzgnr) this.zzb.get()).zzb(zzgnm);
    }

    public final zzgnm zzd(zzgdx zzgdx, Class cls, @Nullable zzgeo zzgeo) throws GeneralSecurityException {
        return ((zzgnr) this.zzb.get()).zzc(zzgdx, cls, zzgeo);
    }

    public final zzgnm zze(zzgek zzgek, Class cls) throws GeneralSecurityException {
        return ((zzgnr) this.zzb.get()).zzd(zzgek, cls);
    }

    public final synchronized void zzf(zzgld zzgld) throws GeneralSecurityException {
        zzgnn zzgnn = new zzgnn((zzgnr) this.zzb.get());
        zzgnn.zza(zzgld);
        this.zzb.set(new zzgnr(zzgnn, (zzgnq) null));
    }

    public final synchronized void zzg(zzglh zzglh) throws GeneralSecurityException {
        zzgnn zzgnn = new zzgnn((zzgnr) this.zzb.get());
        zzgnn.zzb(zzglh);
        this.zzb.set(new zzgnr(zzgnn, (zzgnq) null));
    }

    public final synchronized void zzh(zzgmp zzgmp) throws GeneralSecurityException {
        zzgnn zzgnn = new zzgnn((zzgnr) this.zzb.get());
        zzgnn.zzc(zzgmp);
        this.zzb.set(new zzgnr(zzgnn, (zzgnq) null));
    }

    public final synchronized void zzi(zzgmt zzgmt) throws GeneralSecurityException {
        zzgnn zzgnn = new zzgnn((zzgnr) this.zzb.get());
        zzgnn.zzd(zzgmt);
        this.zzb.set(new zzgnr(zzgnn, (zzgnq) null));
    }

    public final boolean zzj(zzgnm zzgnm) {
        return ((zzgnr) this.zzb.get()).zzi(zzgnm);
    }

    public final boolean zzk(zzgnm zzgnm) {
        return ((zzgnr) this.zzb.get()).zzj(zzgnm);
    }
}
