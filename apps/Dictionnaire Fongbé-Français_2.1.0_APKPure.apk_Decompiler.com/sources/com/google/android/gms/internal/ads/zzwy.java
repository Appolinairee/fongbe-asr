package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzwy implements zzxn {
    public final /* synthetic */ zzxt zza;
    public final /* synthetic */ zzxh zzb;
    public final /* synthetic */ boolean zzc;
    public final /* synthetic */ int[] zzd;

    public /* synthetic */ zzwy(zzxt zzxt, zzxh zzxh, boolean z, int[] iArr) {
        this.zza = zzxt;
        this.zzb = zzxh;
        this.zzc = z;
        this.zzd = iArr;
    }

    public final List zza(int i, zzbr zzbr, int[] iArr) {
        zzxa zzxa = new zzxa(this.zza);
        int i2 = this.zzd[i];
        zzfxk zzfxk = new zzfxk();
        zzbr zzbr2 = zzbr;
        for (int i3 = 0; i3 < zzbr2.zza; i3++) {
            int i4 = i;
            zzbr zzbr3 = zzbr;
            int i5 = i3;
            zzfxk.zzf(new zzxd(i4, zzbr3, i5, this.zzb, iArr[i3], this.zzc, zzxa, i2));
        }
        return zzfxk.zzi();
    }
}
