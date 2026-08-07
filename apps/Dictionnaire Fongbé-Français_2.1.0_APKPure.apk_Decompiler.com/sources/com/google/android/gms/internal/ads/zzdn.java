package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdn {
    private final zzcx zza;
    private final zzdh zzb;
    private final zzdl zzc;
    private final CopyOnWriteArraySet zzd;
    private final ArrayDeque zze;
    private final ArrayDeque zzf;
    private final Object zzg;
    private boolean zzh;
    private boolean zzi;

    public zzdn(Looper looper, zzcx zzcx, zzdl zzdl) {
        this(new CopyOnWriteArraySet(), looper, zzcx, zzdl, true);
    }

    public static /* synthetic */ boolean zzg(zzdn zzdn, Message message) {
        Iterator it = zzdn.zzd.iterator();
        while (it.hasNext()) {
            ((zzdm) it.next()).zzb(zzdn.zzc);
            if (zzdn.zzb.zzg(1)) {
                break;
            }
        }
        return true;
    }

    private final void zzh() {
        if (this.zzi) {
            zzcw.zzf(Thread.currentThread() == this.zzb.zza().getThread());
        }
    }

    public final zzdn zza(Looper looper, zzdl zzdl) {
        return new zzdn(this.zzd, looper, this.zza, zzdl, this.zzi);
    }

    public final void zzb(Object obj) {
        synchronized (this.zzg) {
            if (!this.zzh) {
                this.zzd.add(new zzdm(obj));
            }
        }
    }

    public final void zzc() {
        zzh();
        if (!this.zzf.isEmpty()) {
            if (!this.zzb.zzg(1)) {
                zzdh zzdh = this.zzb;
                zzdh.zzk(zzdh.zzb(1));
            }
            boolean isEmpty = this.zze.isEmpty();
            this.zze.addAll(this.zzf);
            this.zzf.clear();
            if (isEmpty) {
                while (!this.zze.isEmpty()) {
                    ((Runnable) this.zze.peekFirst()).run();
                    this.zze.removeFirst();
                }
            }
        }
    }

    public final void zzd(int i, zzdk zzdk) {
        zzh();
        this.zzf.add(new zzdj(new CopyOnWriteArraySet(this.zzd), i, zzdk));
    }

    public final void zze() {
        zzh();
        synchronized (this.zzg) {
            this.zzh = true;
        }
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            ((zzdm) it.next()).zzc(this.zzc);
        }
        this.zzd.clear();
    }

    public final void zzf(Object obj) {
        zzh();
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            zzdm zzdm = (zzdm) it.next();
            if (zzdm.zza.equals(obj)) {
                zzdm.zzc(this.zzc);
                this.zzd.remove(zzdm);
            }
        }
    }

    private zzdn(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, zzcx zzcx, zzdl zzdl, boolean z) {
        this.zza = zzcx;
        this.zzd = copyOnWriteArraySet;
        this.zzc = zzdl;
        this.zzg = new Object();
        this.zze = new ArrayDeque();
        this.zzf = new ArrayDeque();
        this.zzb = zzcx.zzd(looper, new zzdi(this));
        this.zzi = z;
    }
}
