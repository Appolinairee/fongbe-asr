package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcqf extends zzcom {
    private final zzbhn zzc;
    private final Runnable zzd;
    private final Executor zze;

    public zzcqf(zzcqy zzcqy, zzbhn zzbhn, Runnable runnable, Executor executor) {
        super(zzcqy);
        this.zzc = zzbhn;
        this.zzd = runnable;
        this.zze = executor;
    }

    static /* synthetic */ void zzj(AtomicReference atomicReference) {
        Runnable runnable = (Runnable) atomicReference.getAndSet((Object) null);
        if (runnable != null) {
            runnable.run();
        }
    }

    public final int zza() {
        return -1;
    }

    public final int zzc() {
        return 0;
    }

    public final View zzd() {
        return null;
    }

    public final zzeb zze() {
        return null;
    }

    public final zzfbp zzf() {
        return null;
    }

    public final zzfbp zzg() {
        return null;
    }

    public final void zzh() {
    }

    public final void zzi(ViewGroup viewGroup, zzs zzs) {
    }

    public final void zzk() {
        this.zze.execute(new zzcqe(this, new zzcqd(new AtomicReference(this.zzd))));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzl(Runnable runnable) {
        try {
            if (!this.zzc.zze(ObjectWrapper.wrap(runnable))) {
                zzj(((zzcqd) runnable).zza);
            }
        } catch (RemoteException unused) {
            zzj(((zzcqd) runnable).zza);
        }
    }
}
