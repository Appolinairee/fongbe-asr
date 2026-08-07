package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzazv implements Comparator {
    public zzazv(zzazw zzazw) {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzazk zzazk = (zzazk) obj;
        zzazk zzazk2 = (zzazk) obj2;
        if (zzazk.zzd() < zzazk2.zzd()) {
            return -1;
        }
        if (zzazk.zzd() <= zzazk2.zzd()) {
            if (zzazk.zzb() < zzazk2.zzb()) {
                return -1;
            }
            if (zzazk.zzb() <= zzazk2.zzb()) {
                float zza = (zzazk.zza() - zzazk.zzd()) * (zzazk.zzc() - zzazk.zzb());
                float zza2 = (zzazk2.zza() - zzazk2.zzd()) * (zzazk2.zzc() - zzazk2.zzb());
                if (zza > zza2) {
                    return -1;
                }
                if (zza < zza2) {
                    return 1;
                }
                return 0;
            }
        }
        return 1;
    }
}
