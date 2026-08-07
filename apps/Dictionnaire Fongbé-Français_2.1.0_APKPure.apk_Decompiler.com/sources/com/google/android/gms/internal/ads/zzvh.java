package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzvh implements zzvy {
    final /* synthetic */ zzvk zza;
    /* access modifiers changed from: private */
    public final int zzb;

    public zzvh(zzvk zzvk, int i) {
        this.zza = zzvk;
        this.zzb = i;
    }

    public final int zza(zzke zzke, zzhh zzhh, int i) {
        return this.zza.zzg(this.zzb, zzke, zzhh, i);
    }

    public final int zzb(long j) {
        return this.zza.zzi(this.zzb, j);
    }

    public final void zzd() throws IOException {
        this.zza.zzI(this.zzb);
    }

    public final boolean zze() {
        return this.zza.zzP(this.zzb);
    }
}
