package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgax;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
abstract class zzgbm extends zzgax.zzi {
    private static final zzgbi zzbe;
    private static final zzgcq zzbf;
    /* access modifiers changed from: private */
    public volatile int remaining;
    /* access modifiers changed from: private */
    @CheckForNull
    public volatile Set<Throwable> seenExceptions = null;

    static {
        Throwable th;
        zzgbi zzgbi;
        Class<zzgbm> cls = zzgbm.class;
        zzbf = new zzgcq(cls);
        try {
            zzgbi = new zzgbj(AtomicReferenceFieldUpdater.newUpdater(cls, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(cls, "remaining"));
            th = null;
        } catch (Throwable th2) {
            zzgbi = new zzgbk((zzgbl) null);
            th = th2;
        }
        zzbe = zzgbi;
        if (th != null) {
            zzbf.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    zzgbm(int i) {
        this.remaining = i;
    }

    /* access modifiers changed from: package-private */
    public final int zzA() {
        return zzbe.zza(this);
    }

    /* access modifiers changed from: package-private */
    public final Set zzC() {
        Set<Throwable> set = this.seenExceptions;
        if (set != null) {
            return set;
        }
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        zze(newSetFromMap);
        zzbe.zzb(this, (Set) null, newSetFromMap);
        return (Set) Objects.requireNonNull(this.seenExceptions);
    }

    /* access modifiers changed from: package-private */
    public final void zzF() {
        this.seenExceptions = null;
    }

    /* access modifiers changed from: package-private */
    public abstract void zze(Set set);
}
