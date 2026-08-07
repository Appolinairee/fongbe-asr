package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzxb implements zzxn {
    public final /* synthetic */ zzxh zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzxb(zzxh zzxh, String str) {
        this.zza = zzxh;
        this.zzb = str;
    }

    public final List zza(int i, zzbr zzbr, int[] iArr) {
        int i2 = zzxt.zzb;
        zzfxk zzfxk = new zzfxk();
        for (int i3 = 0; i3 < zzbr.zza; i3++) {
            int i4 = i;
            zzbr zzbr2 = zzbr;
            int i5 = i3;
            zzfxk.zzf(new zzxm(i4, zzbr2, i5, this.zza, iArr[i3], this.zzb));
        }
        return zzfxk.zzi();
    }
}
