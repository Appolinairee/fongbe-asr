package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzfut extends zzfva {
    final /* synthetic */ zzfty zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfut(zzfuu zzfuu, zzfvc zzfvc, CharSequence charSequence, zzfty zzfty) {
        super(zzfvc, charSequence);
        this.zza = zzfty;
    }

    /* access modifiers changed from: package-private */
    public final int zzc(int i) {
        return i + 1;
    }

    /* access modifiers changed from: package-private */
    public final int zzd(int i) {
        CharSequence charSequence = this.zzb;
        int length = charSequence.length();
        zzfun.zzb(i, length, "index");
        while (i < length) {
            if (this.zza.zzb(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
