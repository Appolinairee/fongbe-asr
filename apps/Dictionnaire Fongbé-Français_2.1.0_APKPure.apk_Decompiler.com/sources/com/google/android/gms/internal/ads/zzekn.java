package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbl;
import com.google.android.gms.ads.internal.client.zzbo;
import com.google.android.gms.ads.internal.client.zzcm;
import com.google.android.gms.ads.internal.client.zzct;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzekn implements AppEventListener, zzcyq, zzcxh, zzcvw, zzcwn, zza, zzcvt, zzcye, zzcwj, zzdds {
    final zzdrw zza;
    final BlockingQueue zzb = new ArrayBlockingQueue(((Integer) zzbe.zzc().zza(zzbcl.zziK)).intValue());
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicBoolean zzh = new AtomicBoolean(true);
    private final AtomicBoolean zzi = new AtomicBoolean(false);
    private final AtomicBoolean zzj = new AtomicBoolean(false);

    public zzekn(zzdrw zzdrw) {
        this.zza = zzdrw;
    }

    private final void zzo() {
        if (this.zzi.get() && this.zzj.get()) {
            for (Pair zzejy : this.zzb) {
                zzeyt.zza(this.zzd, new zzejy(zzejy));
            }
            this.zzb.clear();
            this.zzh.set(false);
        }
    }

    public final void onAdClicked() {
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzkE)).booleanValue()) {
            zzeyt.zza(this.zzc, new zzekl());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void onAppEvent(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.zzh     // Catch:{ all -> 0x0047 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x003b
            java.util.concurrent.BlockingQueue r0 = r3.zzb     // Catch:{ all -> 0x0047 }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x0047 }
            r1.<init>(r4, r5)     // Catch:{ all -> 0x0047 }
            boolean r0 = r0.offer(r1)     // Catch:{ all -> 0x0047 }
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = "The queue for app events is full, dropping the new event."
            com.google.android.gms.ads.internal.util.client.zzo.zze(r0)     // Catch:{ all -> 0x0047 }
            com.google.android.gms.internal.ads.zzdrw r0 = r3.zza     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0039
            com.google.android.gms.internal.ads.zzdrv r0 = r0.zza()     // Catch:{ all -> 0x0047 }
            java.lang.String r1 = "action"
            java.lang.String r2 = "dae_action"
            r0.zzb(r1, r2)     // Catch:{ all -> 0x0047 }
            java.lang.String r1 = "dae_name"
            r0.zzb(r1, r4)     // Catch:{ all -> 0x0047 }
            java.lang.String r4 = "dae_data"
            r0.zzb(r4, r5)     // Catch:{ all -> 0x0047 }
            r0.zzg()     // Catch:{ all -> 0x0047 }
            monitor-exit(r3)
            return
        L_0x0039:
            monitor-exit(r3)
            return
        L_0x003b:
            java.util.concurrent.atomic.AtomicReference r0 = r3.zzd     // Catch:{ all -> 0x0047 }
            com.google.android.gms.internal.ads.zzekf r1 = new com.google.android.gms.internal.ads.zzekf     // Catch:{ all -> 0x0047 }
            r1.<init>(r4, r5)     // Catch:{ all -> 0x0047 }
            com.google.android.gms.internal.ads.zzeyt.zza(r0, r1)     // Catch:{ all -> 0x0047 }
            monitor-exit(r3)
            return
        L_0x0047:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0047 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzekn.onAppEvent(java.lang.String, java.lang.String):void");
    }

    public final void zza() {
        zzeyt.zza(this.zzc, new zzejv());
        zzeyt.zza(this.zzg, new zzejw());
    }

    public final void zzb() {
        zzeyt.zza(this.zzc, new zzekg());
    }

    public final void zzc() {
        zzeyt.zza(this.zzc, new zzeki());
        zzeyt.zza(this.zzg, new zzekj());
        zzeyt.zza(this.zzg, new zzekk());
    }

    public final void zzdd() {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzkE)).booleanValue()) {
            zzeyt.zza(this.zzc, new zzekl());
        }
        zzeyt.zza(this.zzg, new zzejx());
    }

    public final void zzdl(zzbvk zzbvk) {
    }

    public final void zzdm(zzfca zzfca) {
        this.zzh.set(true);
        this.zzj.set(false);
    }

    public final void zzdq(zzbvw zzbvw, String str, String str2) {
    }

    public final void zzdz(zze zze2) {
        zzeyt.zza(this.zzc, new zzejz(zze2));
        zzeyt.zza(this.zzc, new zzeka(zze2));
        zzeyt.zza(this.zzf, new zzekb(zze2));
        this.zzh.set(false);
        this.zzb.clear();
    }

    public final void zze() {
    }

    public final void zzf() {
    }

    public final synchronized zzbl zzg() {
        return (zzbl) this.zzc.get();
    }

    public final void zzh(zzu zzu) {
        zzeyt.zza(this.zze, new zzekm(zzu));
    }

    public final synchronized zzcm zzi() {
        return (zzcm) this.zzd.get();
    }

    public final void zzj(zzbl zzbl) {
        this.zzc.set(zzbl);
    }

    public final void zzk(zzbo zzbo) {
        this.zzf.set(zzbo);
    }

    public final void zzl(zzdr zzdr) {
        this.zze.set(zzdr);
    }

    public final void zzm(zzcm zzcm) {
        this.zzd.set(zzcm);
        this.zzi.set(true);
        zzo();
    }

    public final void zzn(zzct zzct) {
        this.zzg.set(zzct);
    }

    public final void zzq(zze zze2) {
        zzeyt.zza(this.zzg, new zzeke(zze2));
    }

    public final void zzr() {
        zzeyt.zza(this.zzc, new zzeju());
    }

    public final synchronized void zzs() {
        zzeyt.zza(this.zzc, new zzekc());
        zzeyt.zza(this.zzf, new zzekd());
        this.zzj.set(true);
        zzo();
    }

    public final void zzu() {
        zzeyt.zza(this.zzc, new zzekh());
    }
}
