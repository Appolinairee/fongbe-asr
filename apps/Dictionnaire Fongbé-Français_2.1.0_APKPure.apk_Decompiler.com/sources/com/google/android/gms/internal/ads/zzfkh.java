package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.impl.utils.ProcessUtils$$ExternalSyntheticApiModelOutline0;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzft;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.Optional;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public abstract class zzfkh {
    protected final ClientApi zza;
    protected final Context zzb;
    protected final int zzc;
    protected final zzbpe zzd;
    protected zzft zze;
    protected final AtomicBoolean zzf = new AtomicBoolean(true);
    private final zzcf zzg;
    private final ConcurrentLinkedQueue zzh = new ConcurrentLinkedQueue();
    private final zzfjg zzi;
    private final AtomicBoolean zzj = new AtomicBoolean(false);
    private final ScheduledExecutorService zzk;
    private final AtomicBoolean zzl;
    private final AtomicBoolean zzm;
    private zzfjp zzn;
    private final Clock zzo;

    public zzfkh(ClientApi clientApi, Context context, int i, zzbpe zzbpe, zzft zzft, zzcf zzcf, ScheduledExecutorService scheduledExecutorService, zzfjg zzfjg, Clock clock) {
        this.zza = clientApi;
        this.zzb = context;
        this.zzc = i;
        this.zzd = zzbpe;
        this.zze = zzft;
        this.zzg = zzcf;
        this.zzk = scheduledExecutorService;
        this.zzi = zzfjg;
        this.zzl = new AtomicBoolean(true);
        this.zzm = new AtomicBoolean(false);
        this.zzo = clock;
    }

    /* access modifiers changed from: private */
    public final synchronized void zzA(zze zze2) {
        this.zzj.set(false);
        int i = zze2.zza;
        if (i == 1 || i == 8 || i == 10 || i == 11) {
            zzft zzft = this.zze;
            int i2 = zzft.zzb;
            String str = zzft.zza;
            zzo.zzi("Preloading " + i2 + ", for adUnitId:" + str + ", Ad load failed. Stop preloading due to non-retriable error:");
            this.zzf.set(false);
            return;
        }
        zzC(true);
    }

    private final synchronized void zzB() {
        Iterator it = this.zzh.iterator();
        while (it.hasNext()) {
            if (((zzfjx) it.next()).zzc()) {
                it.remove();
            }
        }
    }

    private final synchronized void zzC(boolean z) {
        if (!this.zzi.zze()) {
            if (z) {
                this.zzi.zzb();
            }
            this.zzk.schedule(new zzfjy(this), this.zzi.zza(), TimeUnit.MILLISECONDS);
        }
    }

    private static final Optional zzD(Optional optional) {
        return optional.filter(new zzfjz(zzcvm.class)).map(new zzfka(zzcvm.class)).map(new zzfkb());
    }

    private final synchronized void zzu(Object obj) {
        zzfjx zzfjx = new zzfjx(obj, this.zzo);
        this.zzh.add(zzfjx);
        Clock clock = this.zzo;
        Optional zzb2 = zzb(obj);
        long currentTimeMillis = clock.currentTimeMillis();
        zzs.zza.post(new zzfkc(this));
        this.zzk.execute(new zzfkd(this, currentTimeMillis, zzb2));
        this.zzk.schedule(new zzfjy(this), zzfjx.zza(), TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: private */
    public final synchronized void zzv(Throwable th) {
        this.zzj.set(false);
        if (th instanceof zzfjc) {
            if (((zzfjc) th).zza() == 0) {
                throw null;
            }
        }
        zzC(true);
    }

    /* access modifiers changed from: private */
    public final synchronized void zzw(Object obj) {
        boolean z = false;
        this.zzj.set(false);
        if (obj != null) {
            this.zzi.zzc();
            this.zzm.set(true);
            zzu(obj);
        }
        if (obj == null) {
            z = true;
        }
        zzC(z);
    }

    /* access modifiers changed from: private */
    public final synchronized void zzx() {
        if (this.zzl.get()) {
            try {
                this.zzg.zze(this.zze);
            } catch (RemoteException unused) {
                zzo.zzj("Failed to call onAdsAvailable");
            }
        }
    }

    /* access modifiers changed from: private */
    public final synchronized void zzy() {
        if (this.zzl.get()) {
            try {
                this.zzg.zzf(this.zze);
            } catch (RemoteException unused) {
                zzo.zzj("Failed to call onAdsExhausted");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void zzz() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.zzm     // Catch:{ all -> 0x002f }
            boolean r0 = r0.get()     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x002d
            java.util.concurrent.ConcurrentLinkedQueue r0 = r2.zzh     // Catch:{ all -> 0x002f }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x002d
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.zzm     // Catch:{ all -> 0x002f }
            r1 = 0
            r0.set(r1)     // Catch:{ all -> 0x002f }
            com.google.android.gms.internal.ads.zzfqw r0 = com.google.android.gms.ads.internal.util.zzs.zza     // Catch:{ all -> 0x002f }
            com.google.android.gms.internal.ads.zzfke r1 = new com.google.android.gms.internal.ads.zzfke     // Catch:{ all -> 0x002f }
            r1.<init>(r2)     // Catch:{ all -> 0x002f }
            r0.post(r1)     // Catch:{ all -> 0x002f }
            java.util.concurrent.ScheduledExecutorService r0 = r2.zzk     // Catch:{ all -> 0x002f }
            com.google.android.gms.internal.ads.zzfkf r1 = new com.google.android.gms.internal.ads.zzfkf     // Catch:{ all -> 0x002f }
            r1.<init>(r2)     // Catch:{ all -> 0x002f }
            r0.execute(r1)     // Catch:{ all -> 0x002f }
            monitor-exit(r2)
            return
        L_0x002d:
            monitor-exit(r2)
            return
        L_0x002f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfkh.zzz():void");
    }

    /* access modifiers changed from: protected */
    public abstract ListenableFuture zza();

    /* access modifiers changed from: protected */
    public abstract Optional zzb(Object obj);

    public final synchronized zzfkh zzc() {
        this.zzk.submit(new zzfjy(this));
        return this;
    }

    /* access modifiers changed from: protected */
    public final synchronized Object zzd() {
        zzfjx zzfjx = (zzfjx) this.zzh.peek();
        if (zzfjx == null) {
            return null;
        }
        return zzfjx.zzb();
    }

    public final synchronized Object zze() {
        this.zzi.zzc();
        zzfjx zzfjx = (zzfjx) this.zzh.poll();
        this.zzm.set(zzfjx != null);
        zzl();
        if (zzfjx == null) {
            return null;
        }
        return zzfjx.zzb();
    }

    public final synchronized Optional zzf() {
        Optional optional;
        Object zzd2 = zzd();
        if (zzd2 == null) {
            optional = ProcessUtils$$ExternalSyntheticApiModelOutline0.m();
        } else {
            optional = zzb(zzd2);
        }
        return zzD(optional);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzl() {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.zzB()     // Catch:{ all -> 0x003c }
            r3.zzz()     // Catch:{ all -> 0x003c }
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.zzj     // Catch:{ all -> 0x003c }
            boolean r0 = r0.get()     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x003a
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.zzf     // Catch:{ all -> 0x003c }
            boolean r0 = r0.get()     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x003a
            java.util.concurrent.ConcurrentLinkedQueue r0 = r3.zzh     // Catch:{ all -> 0x003c }
            int r0 = r0.size()     // Catch:{ all -> 0x003c }
            com.google.android.gms.ads.internal.client.zzft r1 = r3.zze     // Catch:{ all -> 0x003c }
            int r1 = r1.zzd     // Catch:{ all -> 0x003c }
            if (r0 < r1) goto L_0x0024
            goto L_0x003a
        L_0x0024:
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.zzj     // Catch:{ all -> 0x003c }
            r1 = 1
            r0.set(r1)     // Catch:{ all -> 0x003c }
            com.google.common.util.concurrent.ListenableFuture r0 = r3.zza()     // Catch:{ all -> 0x003c }
            com.google.android.gms.internal.ads.zzfkg r1 = new com.google.android.gms.internal.ads.zzfkg     // Catch:{ all -> 0x003c }
            r1.<init>(r3)     // Catch:{ all -> 0x003c }
            java.util.concurrent.ScheduledExecutorService r2 = r3.zzk     // Catch:{ all -> 0x003c }
            com.google.android.gms.internal.ads.zzgch.zzr(r0, r1, r2)     // Catch:{ all -> 0x003c }
            monitor-exit(r3)
            return
        L_0x003a:
            monitor-exit(r3)
            return
        L_0x003c:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x003c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfkh.zzl():void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzm(long j, Optional optional) {
        zzfjp zzfjp = this.zzn;
        if (zzfjp != null) {
            zzfjp.zzb(AdFormat.getAdFormat(this.zze.zzb), j, zzD(optional));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzn() {
        zzfjp zzfjp = this.zzn;
        if (zzfjp != null) {
            zzfjp.zzc(AdFormat.getAdFormat(this.zze.zzb), this.zzo.currentTimeMillis());
        }
    }

    public final synchronized void zzo(int i) {
        Preconditions.checkArgument(i >= 5);
        this.zzi.zzd(i);
    }

    public final synchronized void zzp() {
        this.zzf.set(true);
        this.zzl.set(true);
        this.zzk.submit(new zzfjy(this));
    }

    public final void zzq(zzfjp zzfjp) {
        this.zzn = zzfjp;
    }

    public final void zzr() {
        this.zzf.set(false);
        this.zzl.set(false);
    }

    /* access modifiers changed from: protected */
    public final synchronized void zzs(int i) {
        Preconditions.checkArgument(i > 0);
        zzft zzft = this.zze;
        String str = zzft.zza;
        int i2 = zzft.zzb;
        zzm zzm2 = zzft.zzc;
        if (i <= 0) {
            i = zzft.zzd;
        }
        this.zze = new zzft(str, i2, zzm2, i);
    }

    public final synchronized boolean zzt() {
        zzB();
        return !this.zzh.isEmpty();
    }
}
