package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgei {
    private static final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public static zzgeh zza(String str) throws GeneralSecurityException {
        Iterator it = zza.iterator();
        while (it.hasNext()) {
            zzgeh zzgeh = (zzgeh) it.next();
            if (zzgeh.zza()) {
                return zzgeh;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
