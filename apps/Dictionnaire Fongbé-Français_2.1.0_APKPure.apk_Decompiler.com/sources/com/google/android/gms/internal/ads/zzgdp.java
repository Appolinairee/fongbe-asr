package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgdp {
    private final OutputStream zza;

    private zzgdp(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzgdp zzb(OutputStream outputStream) {
        return new zzgdp(outputStream);
    }

    public final void zza(zzgsx zzgsx) throws IOException {
        try {
            zzgsx.zzaU(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
