package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzzs extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzzq zzd;
    private boolean zze;

    /* synthetic */ zzzs(zzzq zzzq, SurfaceTexture surfaceTexture, boolean z, zzzr zzzr) {
        super(surfaceTexture);
        this.zzd = zzzq;
        this.zza = z;
    }

    public static zzzs zza(Context context, boolean z) {
        int i = 0;
        boolean z2 = true;
        if (z && !zzb(context)) {
            z2 = false;
        }
        zzcw.zzf(z2);
        zzzq zzzq = new zzzq();
        if (z) {
            i = zzb;
        }
        return zzzq.zza(i);
    }

    public static synchronized boolean zzb(Context context) {
        int i;
        synchronized (zzzs.class) {
            if (!zzc) {
                zzb = zzdf.zzb(context) ? zzdf.zzc() ? 1 : 2 : 0;
                zzc = true;
            }
            i = zzb;
        }
        return i != 0;
    }

    public final void release() {
        super.release();
        synchronized (this.zzd) {
            if (!this.zze) {
                this.zzd.zzb();
                this.zze = true;
            }
        }
    }
}
