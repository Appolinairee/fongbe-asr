package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzgzr {
    private final ArrayDeque zza = new ArrayDeque();

    private zzgzr() {
    }

    static /* bridge */ /* synthetic */ zzgwj zza(zzgzr zzgzr, zzgwj zzgwj, zzgwj zzgwj2) {
        zzgzr.zzb(zzgwj);
        zzgzr.zzb(zzgwj2);
        zzgwj zzgwj3 = (zzgwj) zzgzr.zza.pop();
        while (!zzgzr.zza.isEmpty()) {
            zzgwj3 = new zzgzu((zzgwj) zzgzr.zza.pop(), zzgwj3);
        }
        return zzgwj3;
    }

    private final void zzb(zzgwj zzgwj) {
        if (zzgwj.zzh()) {
            int zzc = zzc(zzgwj.zzd());
            ArrayDeque arrayDeque = this.zza;
            int zzc2 = zzgzu.zzc(zzc + 1);
            if (arrayDeque.isEmpty() || ((zzgwj) this.zza.peek()).zzd() >= zzc2) {
                this.zza.push(zzgwj);
                return;
            }
            int zzc3 = zzgzu.zzc(zzc);
            zzgwj zzgwj2 = (zzgwj) this.zza.pop();
            while (!this.zza.isEmpty() && ((zzgwj) this.zza.peek()).zzd() < zzc3) {
                zzgwj2 = new zzgzu((zzgwj) this.zza.pop(), zzgwj2);
            }
            zzgzu zzgzu = new zzgzu(zzgwj2, zzgwj);
            while (!this.zza.isEmpty()) {
                ArrayDeque arrayDeque2 = this.zza;
                if (((zzgwj) arrayDeque2.peek()).zzd() >= zzgzu.zzc(zzc(zzgzu.zzd()) + 1)) {
                    break;
                }
                zzgzu = new zzgzu((zzgwj) this.zza.pop(), zzgzu);
            }
            this.zza.push(zzgzu);
        } else if (zzgwj instanceof zzgzu) {
            zzgzu zzgzu2 = (zzgzu) zzgwj;
            zzb(zzgzu2.zzd);
            zzb(zzgzu2.zze);
        } else {
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(String.valueOf(zzgwj.getClass()))));
        }
    }

    private static final int zzc(int i) {
        int binarySearch = Arrays.binarySearch(zzgzu.zza, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    /* synthetic */ zzgzr(zzgzt zzgzt) {
    }
}
