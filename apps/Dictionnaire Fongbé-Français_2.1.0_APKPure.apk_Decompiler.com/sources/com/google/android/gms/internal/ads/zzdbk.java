package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzr;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdbk {
    /* access modifiers changed from: private */
    public final Set zza = new HashSet();
    /* access modifiers changed from: private */
    public final Set zzb = new HashSet();
    /* access modifiers changed from: private */
    public final Set zzc = new HashSet();
    /* access modifiers changed from: private */
    public final Set zzd = new HashSet();
    /* access modifiers changed from: private */
    public final Set zze = new HashSet();
    /* access modifiers changed from: private */
    public final Set zzf = new HashSet();
    /* access modifiers changed from: private */
    public final Set zzg = new HashSet();
    /* access modifiers changed from: private */
    public final Set zzh = new HashSet();
    /* access modifiers changed from: private */
    public final Set zzi = new HashSet();
    /* access modifiers changed from: private */
    public final Set zzj = new HashSet();
    /* access modifiers changed from: private */
    public final Set zzk = new HashSet();
    /* access modifiers changed from: private */
    public final Set zzl = new HashSet();
    /* access modifiers changed from: private */
    public final Set zzm = new HashSet();
    /* access modifiers changed from: private */
    public final Set zzn = new HashSet();
    /* access modifiers changed from: private */
    public zzezc zzo;

    public final zzdbk zza(zza zza2, Executor executor) {
        this.zzc.add(new zzddk(zza2, executor));
        return this;
    }

    public final zzdbk zzb(zzcvw zzcvw, Executor executor) {
        this.zzi.add(new zzddk(zzcvw, executor));
        return this;
    }

    public final zzdbk zzc(zzcwj zzcwj, Executor executor) {
        this.zzl.add(new zzddk(zzcwj, executor));
        return this;
    }

    public final zzdbk zzd(zzcwn zzcwn, Executor executor) {
        this.zzf.add(new zzddk(zzcwn, executor));
        return this;
    }

    public final zzdbk zze(zzcvt zzcvt, Executor executor) {
        this.zze.add(new zzddk(zzcvt, executor));
        return this;
    }

    public final zzdbk zzf(zzcxh zzcxh, Executor executor) {
        this.zzh.add(new zzddk(zzcxh, executor));
        return this;
    }

    public final zzdbk zzg(zzcxs zzcxs, Executor executor) {
        this.zzg.add(new zzddk(zzcxs, executor));
        return this;
    }

    public final zzdbk zzh(zzr zzr, Executor executor) {
        this.zzn.add(new zzddk(zzr, executor));
        return this;
    }

    public final zzdbk zzi(zzcye zzcye, Executor executor) {
        this.zzm.add(new zzddk(zzcye, executor));
        return this;
    }

    public final zzdbk zzj(zzcyq zzcyq, Executor executor) {
        this.zzb.add(new zzddk(zzcyq, executor));
        return this;
    }

    public final zzdbk zzk(AppEventListener appEventListener, Executor executor) {
        this.zzk.add(new zzddk(appEventListener, executor));
        return this;
    }

    public final zzdbk zzl(zzdds zzdds, Executor executor) {
        this.zzd.add(new zzddk(zzdds, executor));
        return this;
    }

    public final zzdbk zzm(zzezc zzezc) {
        this.zzo = zzezc;
        return this;
    }

    public final zzdbm zzn() {
        return new zzdbm(this, (zzdbl) null);
    }
}
