package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzhag extends RuntimeException {
    public zzhag(zzgzc zzgzc) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzgyg zza() {
        return new zzgyg(getMessage());
    }
}
