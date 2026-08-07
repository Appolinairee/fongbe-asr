package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzaws extends zzaxr {
    public zzaws(zzawd zzawd, String str, String str2, zzasc zzasc, int i, int i2) {
        super(zzawd, "BI30n3J1CRcYA+VG0+4MYT6iqJe6ygS/jaP36BUmRAco9FZAzOIaWUnrLPPOeEgd", "opDPFauVb4cwnfQzDqDp9yn5NlOrrzIvgPDGrYZmcXE=", zzasc, i, 5);
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zzm(-1);
        this.zzd.zzl(-1);
        int[] iArr = (int[]) this.zze.invoke((Object) null, new Object[]{this.zza.zzb()});
        synchronized (this.zzd) {
            this.zzd.zzm((long) iArr[0]);
            this.zzd.zzl((long) iArr[1]);
            int i = iArr[2];
            if (i != Integer.MIN_VALUE) {
                this.zzd.zzk((long) i);
            }
        }
    }
}
