package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgnr {
    /* access modifiers changed from: private */
    public final Map zza;
    /* access modifiers changed from: private */
    public final Map zzb;
    /* access modifiers changed from: private */
    public final Map zzc;
    /* access modifiers changed from: private */
    public final Map zzd;

    /* synthetic */ zzgnr(zzgnn zzgnn, zzgnq zzgnq) {
        this.zza = new HashMap(zzgnn.zza);
        this.zzb = new HashMap(zzgnn.zzb);
        this.zzc = new HashMap(zzgnn.zzc);
        this.zzd = new HashMap(zzgnn.zzd);
    }

    public final zzgdx zza(zzgnm zzgnm, @Nullable zzgeo zzgeo) throws GeneralSecurityException {
        zzgno zzgno = new zzgno(zzgnm.getClass(), zzgnm.zzd(), (zzgnq) null);
        if (this.zzb.containsKey(zzgno)) {
            return ((zzgld) this.zzb.get(zzgno)).zza(zzgnm, zzgeo);
        }
        String obj = zzgno.toString();
        throw new GeneralSecurityException("No Key Parser for requested key type " + obj + " available");
    }

    public final zzgek zzb(zzgnm zzgnm) throws GeneralSecurityException {
        zzgno zzgno = new zzgno(zzgnm.getClass(), zzgnm.zzd(), (zzgnq) null);
        if (this.zzd.containsKey(zzgno)) {
            return ((zzgmp) this.zzd.get(zzgno)).zza(zzgnm);
        }
        String obj = zzgno.toString();
        throw new GeneralSecurityException("No Parameters Parser for requested key type " + obj + " available");
    }

    public final zzgnm zzc(zzgdx zzgdx, Class cls, @Nullable zzgeo zzgeo) throws GeneralSecurityException {
        zzgnp zzgnp = new zzgnp(zzgdx.getClass(), cls, (zzgnq) null);
        if (this.zza.containsKey(zzgnp)) {
            return ((zzglh) this.zza.get(zzgnp)).zza(zzgdx, zzgeo);
        }
        String obj = zzgnp.toString();
        throw new GeneralSecurityException("No Key serializer for " + obj + " available");
    }

    public final zzgnm zzd(zzgek zzgek, Class cls) throws GeneralSecurityException {
        zzgnp zzgnp = new zzgnp(zzgek.getClass(), cls, (zzgnq) null);
        if (this.zzc.containsKey(zzgnp)) {
            return ((zzgmt) this.zzc.get(zzgnp)).zza(zzgek);
        }
        String obj = zzgnp.toString();
        throw new GeneralSecurityException("No Key Format serializer for " + obj + " available");
    }

    public final boolean zzi(zzgnm zzgnm) {
        return this.zzb.containsKey(new zzgno(zzgnm.getClass(), zzgnm.zzd(), (zzgnq) null));
    }

    public final boolean zzj(zzgnm zzgnm) {
        return this.zzd.containsKey(new zzgno(zzgnm.getClass(), zzgnm.zzd(), (zzgnq) null));
    }
}
