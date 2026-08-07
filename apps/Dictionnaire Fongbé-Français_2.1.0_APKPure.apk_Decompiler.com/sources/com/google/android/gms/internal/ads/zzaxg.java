package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzaxg extends zzaxr {
    public zzaxg(zzawd zzawd, String str, String str2, zzasc zzasc, int i, int i2) {
        super(zzawd, "VbyGv7sES/oWGQr2qJ1ojtDXkdOVtq/qZqCmKZiE07d+0W3i1KsQhhRGQ9Xgn5dY", "qVy1S3GZ9+f6FFC31TUnbavXTKbKjAeTCoTlnIfZI+M=", zzasc, i, 73);
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        try {
            int i = 1;
            boolean booleanValue = ((Boolean) this.zze.invoke((Object) null, new Object[]{this.zza.zzb()})).booleanValue();
            zzasc zzasc = this.zzd;
            if (true == booleanValue) {
                i = 2;
            }
            zzasc.zzaf(i);
        } catch (InvocationTargetException unused) {
            this.zzd.zzaf(3);
        }
    }
}
