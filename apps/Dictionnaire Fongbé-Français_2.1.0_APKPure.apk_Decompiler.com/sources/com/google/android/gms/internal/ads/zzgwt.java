package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzgwt extends IOException {
    zzgwt() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    zzgwt(long j, long j2, int i, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(String.format(Locale.US, "Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)}))), th);
    }

    zzgwt(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
