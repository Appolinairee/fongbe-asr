package com.google.android.gms.internal.ads;

import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.Provider;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzgur implements zzguu {
    private final zzgve zza;

    /* synthetic */ zzgur(zzgve zzgve, zzguv zzguv) {
        this.zza = zzgve;
    }

    public final Object zza(String str) throws GeneralSecurityException {
        for (Provider zza2 : zzguw.zzb(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL")) {
            try {
                return this.zza.zza(str, zza2);
            } catch (Exception unused) {
            }
        }
        return this.zza.zza(str, (Provider) null);
    }
}
