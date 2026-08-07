package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzauq implements zzfpd {
    final /* synthetic */ zzfnd zza;

    zzauq(zzaus zzaus, zzfnd zzfnd) {
        this.zza = zzfnd;
    }

    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
