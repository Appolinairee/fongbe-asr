package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzemf implements zzetr {
    private final zzetr zza;
    private final zzfcj zzb;
    private final Context zzc;
    private final zzbzm zzd;

    zzemf(zzeoj zzeoj, zzfcj zzfcj, Context context, zzbzm zzbzm) {
        this.zza = zzeoj;
        this.zzb = zzfcj;
        this.zzc = context;
        this.zzd = zzbzm;
    }

    public final int zza() {
        return 7;
    }

    public final ListenableFuture zzb() {
        return zzgch.zzm(this.zza.zzb(), new zzeme(this), zzbzw.zzg);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzemg zzc(zzeua zzeua) {
        boolean z;
        String str;
        String str2;
        int i;
        float f;
        int i2;
        int i3;
        DisplayMetrics displayMetrics;
        zzs zzs = this.zzb.zze;
        zzs[] zzsArr = zzs.zzg;
        if (zzsArr != null) {
            str = null;
            boolean z2 = false;
            boolean z3 = false;
            z = false;
            for (zzs zzs2 : zzsArr) {
                boolean z4 = zzs2.zzi;
                if (!z4 && !z2) {
                    str = zzs2.zza;
                    z2 = true;
                }
                if (z4) {
                    if (!z3) {
                        z3 = true;
                        z = true;
                    } else {
                        z3 = true;
                    }
                }
                if (z2 && z3) {
                    break;
                }
            }
        } else {
            str = zzs.zza;
            z = zzs.zzi;
        }
        Resources resources = this.zzc.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            str2 = null;
            i2 = 0;
            f = 0.0f;
            i = 0;
        } else {
            zzbzm zzbzm = this.zzd;
            f = displayMetrics.density;
            i = displayMetrics.widthPixels;
            i2 = displayMetrics.heightPixels;
            str2 = zzbzm.zzi().zzj();
        }
        StringBuilder sb = new StringBuilder();
        zzs[] zzsArr2 = zzs.zzg;
        if (zzsArr2 != null) {
            boolean z5 = false;
            for (zzs zzs3 : zzsArr2) {
                if (zzs3.zzi) {
                    z5 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    int i4 = zzs3.zze;
                    if (i4 == -1) {
                        i4 = f != 0.0f ? (int) (((float) zzs3.zzf) / f) : -1;
                    }
                    sb.append(i4);
                    sb.append("x");
                    int i5 = zzs3.zzb;
                    if (i5 == -2) {
                        i5 = f != 0.0f ? (int) (((float) zzs3.zzc) / f) : -2;
                    }
                    sb.append(i5);
                }
            }
            if (z5) {
                if (sb.length() != 0) {
                    i3 = 0;
                    sb.insert(0, "|");
                } else {
                    i3 = 0;
                }
                sb.insert(i3, "320x50");
            }
        }
        return new zzemg(zzs, str, z, sb.toString(), f, i, i2, str2, this.zzb.zzq);
    }
}
