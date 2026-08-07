package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public class zzgyg extends IOException {
    private boolean zza;

    public zzgyg(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        this.zza = true;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzb() {
        return this.zza;
    }

    public zzgyg(String str) {
        super(str);
    }
}
