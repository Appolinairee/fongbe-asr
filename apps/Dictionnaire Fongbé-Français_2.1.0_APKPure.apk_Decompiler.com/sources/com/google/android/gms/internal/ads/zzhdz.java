package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public class zzhdz extends zzhec implements zzaqz {
    protected final String zza = "moov";

    public zzhdz(String str) {
    }

    public final String zza() {
        return this.zza;
    }

    public final void zzb(zzhed zzhed, ByteBuffer byteBuffer, long j, zzaqw zzaqw) throws IOException {
        zzhed.zzb();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.zzc = zzhed;
        this.zze = zzhed.zzb();
        zzhed.zze(zzhed.zzb() + j);
        this.zzf = zzhed.zzb();
        this.zzb = zzaqw;
    }
}
