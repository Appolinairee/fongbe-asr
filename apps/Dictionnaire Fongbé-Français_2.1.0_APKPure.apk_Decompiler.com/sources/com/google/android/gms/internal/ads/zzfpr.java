package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzfpr extends zzfpz {
    private String zza;
    private byte zzb;
    private int zzc;
    private int zzd;

    zzfpr() {
    }

    public final zzfpz zza(String str) {
        this.zza = "";
        return this;
    }

    public final zzfpz zzb(boolean z) {
        this.zzb = 1;
        return this;
    }

    public final zzfqa zzc() {
        if (this.zzb == 1 && this.zza != null && this.zzc != 0 && this.zzd != 0) {
            return new zzfpt(this.zza, false, this.zzc, (zzfpp) null, (zzfpq) null, this.zzd, (zzfps) null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" fileOwner");
        }
        if (this.zzb == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if (this.zzc == 0) {
            sb.append(" fileChecks");
        }
        if (this.zzd == 0) {
            sb.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* access modifiers changed from: package-private */
    public final zzfpz zzd(int i) {
        this.zzc = i;
        return this;
    }

    public final zzfpz zze(int i) {
        this.zzd = 1;
        return this;
    }
}
