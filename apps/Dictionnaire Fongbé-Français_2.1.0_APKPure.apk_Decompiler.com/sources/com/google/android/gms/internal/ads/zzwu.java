package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzwu implements zzxn {
    public final /* synthetic */ zzxh zza;

    public /* synthetic */ zzwu(zzxh zzxh) {
        this.zza = zzxh;
    }

    public final List zza(int i, zzbr zzbr, int[] iArr) {
        int i2 = zzxt.zzb;
        zzfxk zzfxk = new zzfxk();
        for (int i3 = 0; i3 < zzbr.zza; i3++) {
            zzfxk.zzf(new zzxe(i, zzbr, i3, this.zza, iArr[i3]));
        }
        return zzfxk.zzi();
    }
}
