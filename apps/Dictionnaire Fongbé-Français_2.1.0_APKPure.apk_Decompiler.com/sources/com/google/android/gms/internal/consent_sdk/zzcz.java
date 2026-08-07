package com.google.android.gms.internal.consent_sdk;

import java.util.List;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
final class zzcz extends zzda {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzda zzc;

    zzcz(zzda zzda, int i, int i2) {
        this.zzc = zzda;
        this.zza = i;
        this.zzb = i2;
    }

    public final Object get(int i) {
        zzct.zza(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    public final int size() {
        return this.zzb;
    }

    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    /* access modifiers changed from: package-private */
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    /* access modifiers changed from: package-private */
    @CheckForNull
    public final Object[] zze() {
        return this.zzc.zze();
    }

    public final zzda zzf(int i, int i2) {
        zzct.zzc(i, i2, this.zzb);
        int i3 = this.zza;
        return this.zzc.subList(i + i3, i2 + i3);
    }
}
