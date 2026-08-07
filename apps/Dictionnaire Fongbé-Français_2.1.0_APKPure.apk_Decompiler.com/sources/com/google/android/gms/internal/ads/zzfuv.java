package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzfuv extends zzfva {
    final /* synthetic */ zzftz zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfuv(zzfuw zzfuw, zzfvc zzfvc, CharSequence charSequence, zzftz zzftz) {
        super(zzfvc, charSequence);
        this.zza = zzftz;
    }

    public final int zzc(int i) {
        return ((zzfud) this.zza).zza.end();
    }

    public final int zzd(int i) {
        if (((zzfud) this.zza).zza.find(i)) {
            return ((zzfud) this.zza).zza.start();
        }
        return -1;
    }
}
