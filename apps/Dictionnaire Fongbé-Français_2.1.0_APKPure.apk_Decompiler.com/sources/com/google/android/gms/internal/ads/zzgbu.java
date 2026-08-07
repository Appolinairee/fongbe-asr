package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzgbu extends zzgbh {
    /* access modifiers changed from: private */
    @CheckForNull
    public zzgbt zza;

    zzgbu(zzfxi zzfxi, boolean z, Executor executor, Callable callable) {
        super(zzfxi, z, false);
        this.zza = new zzgbs(this, callable, executor);
        zzv();
    }

    /* access modifiers changed from: package-private */
    public final void zzf(int i, @CheckForNull Object obj) {
    }

    /* access modifiers changed from: protected */
    public final void zzq() {
        zzgbt zzgbt = this.zza;
        if (zzgbt != null) {
            zzgbt.zzh();
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzu() {
        zzgbt zzgbt = this.zza;
        if (zzgbt != null) {
            zzgbt.zzf();
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzy(int i) {
        super.zzy(i);
        if (i == 1) {
            this.zza = null;
        }
    }
}
