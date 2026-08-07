package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public class zzbc extends IOException {
    public final boolean zza;
    public final int zzb;

    protected zzbc(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.zza = z;
        this.zzb = i;
    }

    public static zzbc zza(String str, Throwable th) {
        return new zzbc(str, th, true, 1);
    }

    public static zzbc zzb(String str, Throwable th) {
        return new zzbc(str, th, true, 0);
    }

    public static zzbc zzc(String str) {
        return new zzbc(str, (Throwable) null, false, 1);
    }

    public final String getMessage() {
        String message = super.getMessage();
        return message + " {contentIsMalformed=" + this.zza + ", dataType=" + this.zzb + "}";
    }
}
