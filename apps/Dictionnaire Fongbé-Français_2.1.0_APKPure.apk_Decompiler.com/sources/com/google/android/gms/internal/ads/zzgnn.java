package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgnn {
    /* access modifiers changed from: private */
    public final Map zza;
    /* access modifiers changed from: private */
    public final Map zzb;
    /* access modifiers changed from: private */
    public final Map zzc;
    /* access modifiers changed from: private */
    public final Map zzd;

    public zzgnn() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashMap();
    }

    public final zzgnn zza(zzgld zzgld) throws GeneralSecurityException {
        zzgno zzgno = new zzgno(zzgld.zzd(), zzgld.zzc(), (zzgnq) null);
        if (this.zzb.containsKey(zzgno)) {
            zzgld zzgld2 = (zzgld) this.zzb.get(zzgno);
            if (!zzgld2.equals(zzgld) || !zzgld.equals(zzgld2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgno.toString()));
            }
        } else {
            this.zzb.put(zzgno, zzgld);
        }
        return this;
    }

    public final zzgnn zzb(zzglh zzglh) throws GeneralSecurityException {
        zzgnp zzgnp = new zzgnp(zzglh.zzc(), zzglh.zzd(), (zzgnq) null);
        if (this.zza.containsKey(zzgnp)) {
            zzglh zzglh2 = (zzglh) this.zza.get(zzgnp);
            if (!zzglh2.equals(zzglh) || !zzglh.equals(zzglh2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzgnp.toString()));
            }
        } else {
            this.zza.put(zzgnp, zzglh);
        }
        return this;
    }

    public final zzgnn zzc(zzgmp zzgmp) throws GeneralSecurityException {
        zzgno zzgno = new zzgno(zzgmp.zzd(), zzgmp.zzc(), (zzgnq) null);
        if (this.zzd.containsKey(zzgno)) {
            zzgmp zzgmp2 = (zzgmp) this.zzd.get(zzgno);
            if (!zzgmp2.equals(zzgmp) || !zzgmp.equals(zzgmp2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgno.toString()));
            }
        } else {
            this.zzd.put(zzgno, zzgmp);
        }
        return this;
    }

    public final zzgnn zzd(zzgmt zzgmt) throws GeneralSecurityException {
        zzgnp zzgnp = new zzgnp(zzgmt.zzc(), zzgmt.zzd(), (zzgnq) null);
        if (this.zzc.containsKey(zzgnp)) {
            zzgmt zzgmt2 = (zzgmt) this.zzc.get(zzgnp);
            if (!zzgmt2.equals(zzgmt) || !zzgmt.equals(zzgmt2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzgnp.toString()));
            }
        } else {
            this.zzc.put(zzgnp, zzgmt);
        }
        return this;
    }

    public zzgnn(zzgnr zzgnr) {
        this.zza = new HashMap(zzgnr.zza);
        this.zzb = new HashMap(zzgnr.zzb);
        this.zzc = new HashMap(zzgnr.zzc);
        this.zzd = new HashMap(zzgnr.zzd);
    }
}
