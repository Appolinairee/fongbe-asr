package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzbbc extends PushbackInputStream {
    final /* synthetic */ zzbbd zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzbbc(zzbbd zzbbd, InputStream inputStream, int i) {
        super(inputStream, 1);
        this.zza = zzbbd;
    }

    public final synchronized void close() throws IOException {
        zzbbf.zze(this.zza.zzc);
        super.close();
    }
}
