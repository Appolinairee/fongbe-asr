package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzop {
    /* access modifiers changed from: private */
    public boolean zza;
    /* access modifiers changed from: private */
    public boolean zzb;
    /* access modifiers changed from: private */
    public boolean zzc;

    public final zzop zza(boolean z) {
        this.zza = true;
        return this;
    }

    public final zzop zzb(boolean z) {
        this.zzb = z;
        return this;
    }

    public final zzop zzc(boolean z) {
        this.zzc = z;
        return this;
    }

    public final zzor zzd() {
        if (this.zza || (!this.zzb && !this.zzc)) {
            return new zzor(this, (zzoq) null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
