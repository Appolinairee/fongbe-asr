package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcmw implements zzcvt, zzcxh, zzcwn, zza, zzcwj, zzddj {
    /* access modifiers changed from: private */
    public final Context zza;
    private final Executor zzb;
    private final Executor zzc;
    private final ScheduledExecutorService zzd;
    /* access modifiers changed from: private */
    public final zzfca zze;
    /* access modifiers changed from: private */
    public final zzfbo zzf;
    /* access modifiers changed from: private */
    public final zzfiv zzg;
    /* access modifiers changed from: private */
    public final zzfcv zzh;
    private final zzava zzi;
    private final zzbds zzj;
    private final WeakReference zzk;
    private final WeakReference zzl;
    private final zzcut zzm;
    private boolean zzn;
    private final AtomicBoolean zzo = new AtomicBoolean();

    zzcmw(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, zzfca zzfca, zzfbo zzfbo, zzfiv zzfiv, zzfcv zzfcv, View view, zzcex zzcex, zzava zzava, zzbds zzbds, zzbdu zzbdu, zzfhh zzfhh, zzcut zzcut) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = executor2;
        this.zzd = scheduledExecutorService;
        this.zze = zzfca;
        this.zzf = zzfbo;
        this.zzg = zzfiv;
        this.zzh = zzfcv;
        this.zzi = zzava;
        this.zzk = new WeakReference(view);
        this.zzl = new WeakReference(zzcex);
        this.zzj = zzbds;
        this.zzm = zzcut;
    }

    /* access modifiers changed from: private */
    public final List zzu() {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzll)).booleanValue()) {
            zzv.zzq();
            if (zzs.zzC(this.zza)) {
                zzv.zzq();
                Integer zzt = zzs.zzt(this.zza);
                if (zzt != null) {
                    int min = Math.min(zzt.intValue(), 20);
                    Integer valueOf = Integer.valueOf(min);
                    ArrayList arrayList = new ArrayList();
                    for (String parse : this.zzf.zzd) {
                        Uri.Builder buildUpon = Uri.parse(parse).buildUpon();
                        valueOf.getClass();
                        arrayList.add(buildUpon.appendQueryParameter("dspct", Integer.toString(min)).toString());
                    }
                    return arrayList;
                }
            }
        }
        return this.zzf.zzd;
    }

    /* access modifiers changed from: private */
    public final void zzv() {
        String str;
        int i;
        List list = this.zzf.zzd;
        if (list != null && !list.isEmpty()) {
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzdE)).booleanValue()) {
                str = this.zzi.zzc().zzh(this.zza, (View) this.zzk.get(), (Activity) null);
            } else {
                str = null;
            }
            if ((!((Boolean) zzbe.zzc().zza(zzbcl.zzaB)).booleanValue() || !this.zze.zzb.zzb.zzh) && ((Boolean) zzbek.zzh.zze()).booleanValue()) {
                if (((Boolean) zzbek.zzg.zze()).booleanValue() && ((i = this.zzf.zzb) == 1 || i == 2 || i == 5)) {
                    zzcex zzcex = (zzcex) this.zzl.get();
                }
                zzgch.zzr((zzgby) zzgch.zzo(zzgby.zzu(zzgch.zzh((Object) null)), ((Long) zzbe.zzc().zza(zzbcl.zzbe)).longValue(), TimeUnit.MILLISECONDS, this.zzd), new zzcmv(this, str), this.zzb);
                return;
            }
            this.zzh.zza(this.zzg.zzd(this.zze, this.zzf, false, str, (String) null, zzu()));
        }
    }

    private final void zzw(int i, int i2) {
        View view;
        if (i <= 0 || !((view = (View) this.zzk.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            zzv();
        } else {
            this.zzd.schedule(new zzcms(this, i, i2), (long) i2, TimeUnit.MILLISECONDS);
        }
    }

    public final void onAdClicked() {
        if ((!((Boolean) zzbe.zzc().zza(zzbcl.zzaB)).booleanValue() || !this.zze.zzb.zzb.zzh) && ((Boolean) zzbek.zzd.zze()).booleanValue()) {
            zzgch.zzr((zzgby) zzgch.zze(zzgby.zzu(this.zzj.zza()), Throwable.class, new zzcmq(), zzbzw.zzg), new zzcmu(this), this.zzb);
            return;
        }
        zzfcv zzfcv = this.zzh;
        zzfiv zzfiv = this.zzg;
        zzfca zzfca = this.zze;
        zzfbo zzfbo = this.zzf;
        Context context = this.zza;
        List zzc2 = zzfiv.zzc(zzfca, zzfbo, zzfbo.zzc);
        int i = 1;
        if (true == zzv.zzp().zzA(context)) {
            i = 2;
        }
        zzfcv.zzc(zzc2, i);
    }

    public final void zza() {
    }

    public final void zzb() {
    }

    public final void zzc() {
    }

    public final void zzdq(zzbvw zzbvw, String str, String str2) {
        zzfcv zzfcv = this.zzh;
        zzfiv zzfiv = this.zzg;
        zzfbo zzfbo = this.zzf;
        zzfcv.zza(zzfiv.zze(zzfbo, zzfbo.zzh, zzbvw));
    }

    public final void zze() {
        zzfcv zzfcv = this.zzh;
        zzfiv zzfiv = this.zzg;
        zzfca zzfca = this.zze;
        zzfbo zzfbo = this.zzf;
        zzfcv.zza(zzfiv.zzc(zzfca, zzfbo, zzfbo.zzi));
    }

    public final void zzf() {
        zzfcv zzfcv = this.zzh;
        zzfiv zzfiv = this.zzg;
        zzfca zzfca = this.zze;
        zzfbo zzfbo = this.zzf;
        zzfcv.zza(zzfiv.zzc(zzfca, zzfbo, zzfbo.zzg));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzn() {
        this.zzb.execute(new zzcmr(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(int i, int i2) {
        this.zzb.execute(new zzcmt(this, i, i2));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(int i, int i2) {
        zzw(i - 1, i2);
    }

    public final void zzq(zze zze2) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzbD)).booleanValue()) {
            this.zzh.zza(this.zzg.zzc(this.zze, this.zzf, zzfiv.zzf(2, zze2.zza, this.zzf.zzo)));
        }
    }

    public final void zzr() {
        if (this.zzo.compareAndSet(false, true)) {
            int intValue = ((Integer) zzbe.zzc().zza(zzbcl.zzdN)).intValue();
            if (intValue > 0) {
                zzw(intValue, ((Integer) zzbe.zzc().zza(zzbcl.zzdO)).intValue());
                return;
            }
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzdM)).booleanValue()) {
                this.zzc.execute(new zzcmp(this));
            } else {
                zzv();
            }
        }
    }

    public final synchronized void zzs() {
        zzcut zzcut;
        if (this.zzn) {
            ArrayList arrayList = new ArrayList(zzu());
            arrayList.addAll(this.zzf.zzf);
            this.zzh.zza(this.zzg.zzd(this.zze, this.zzf, true, (String) null, (String) null, arrayList));
        } else {
            zzfcv zzfcv = this.zzh;
            zzfiv zzfiv = this.zzg;
            zzfca zzfca = this.zze;
            zzfbo zzfbo = this.zzf;
            zzfcv.zza(zzfiv.zzc(zzfca, zzfbo, zzfbo.zzm));
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzdJ)).booleanValue() && (zzcut = this.zzm) != null) {
                List zzh2 = zzfiv.zzh(zzfiv.zzg(zzcut.zzb().zzm, zzcut.zza().zzg()), this.zzm.zza().zza());
                zzfcv zzfcv2 = this.zzh;
                zzfiv zzfiv2 = this.zzg;
                zzcut zzcut2 = this.zzm;
                zzfcv2.zza(zzfiv2.zzc(zzcut2.zzc(), zzcut2.zzb(), zzh2));
            }
            zzfcv zzfcv3 = this.zzh;
            zzfiv zzfiv3 = this.zzg;
            zzfca zzfca2 = this.zze;
            zzfbo zzfbo2 = this.zzf;
            zzfcv3.zza(zzfiv3.zzc(zzfca2, zzfbo2, zzfbo2.zzf));
        }
        this.zzn = true;
    }

    public final void zzt() {
        zzfcv zzfcv = this.zzh;
        zzfiv zzfiv = this.zzg;
        zzfca zzfca = this.zze;
        zzfbo zzfbo = this.zzf;
        zzfcv.zza(zzfiv.zzc(zzfca, zzfbo, zzfbo.zzau));
    }
}
