package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzghn {
    @Nullable
    private zzghp zza;
    @Nullable
    private String zzb;
    @Nullable
    private zzgho zzc;
    @Nullable
    private zzgeu zzd;

    private zzghn() {
        throw null;
    }

    /* synthetic */ zzghn(zzghq zzghq) {
    }

    public final zzghn zza(zzgeu zzgeu) {
        this.zzd = zzgeu;
        return this;
    }

    public final zzghn zzb(zzgho zzgho) {
        this.zzc = zzgho;
        return this;
    }

    public final zzghn zzc(String str) {
        this.zzb = str;
        return this;
    }

    public final zzghn zzd(zzghp zzghp) {
        this.zza = zzghp;
        return this;
    }

    public final zzghr zze() throws GeneralSecurityException {
        if (this.zza == null) {
            this.zza = zzghp.zzb;
        }
        if (this.zzb != null) {
            zzgho zzgho = this.zzc;
            if (zzgho != null) {
                zzgeu zzgeu = this.zzd;
                if (zzgeu == null) {
                    throw new GeneralSecurityException("dekParametersForNewKeys must be set");
                } else if (zzgeu.zza()) {
                    throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
                } else if ((zzgho.equals(zzgho.zza) && (zzgeu instanceof zzggf)) || ((zzgho.equals(zzgho.zzc) && (zzgeu instanceof zzggw)) || ((zzgho.equals(zzgho.zzb) && (zzgeu instanceof zzgir)) || ((zzgho.equals(zzgho.zzd) && (zzgeu instanceof zzgfk)) || ((zzgho.equals(zzgho.zze) && (zzgeu instanceof zzgfu)) || (zzgho.equals(zzgho.zzf) && (zzgeu instanceof zzggq))))))) {
                    return new zzghr(this.zza, this.zzb, this.zzc, this.zzd, (zzghq) null);
                } else {
                    String zzgho2 = this.zzc.toString();
                    String valueOf = String.valueOf(this.zzd);
                    throw new GeneralSecurityException("Cannot use parsing strategy " + zzgho2 + " when new keys are picked according to " + valueOf + ".");
                }
            } else {
                throw new GeneralSecurityException("dekParsingStrategy must be set");
            }
        } else {
            throw new GeneralSecurityException("kekUri must be set");
        }
    }
}
