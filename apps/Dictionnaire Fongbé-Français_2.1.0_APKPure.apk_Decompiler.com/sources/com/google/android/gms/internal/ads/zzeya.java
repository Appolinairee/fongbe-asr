package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbi;
import com.google.android.gms.ads.internal.client.zzbl;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeya implements zzeld {
    private final Context zza;
    private final Executor zzb;
    private final zzcgx zzc;
    private final zzekn zzd;
    private final zzekr zze;
    private final ViewGroup zzf;
    private zzbdg zzg;
    /* access modifiers changed from: private */
    public final zzcyl zzh;
    /* access modifiers changed from: private */
    public final zzfhk zzi;
    /* access modifiers changed from: private */
    public final zzdar zzj;
    private final zzfch zzk;
    private ListenableFuture zzl;
    /* access modifiers changed from: private */
    public boolean zzm = true;
    /* access modifiers changed from: private */
    public zze zzn = null;
    private zzelc zzo = null;

    public zzeya(Context context, Executor executor, zzs zzs, zzcgx zzcgx, zzekn zzekn, zzekr zzekr, zzfch zzfch, zzdar zzdar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcgx;
        this.zzd = zzekn;
        this.zze = zzekr;
        this.zzk = zzfch;
        this.zzh = zzcgx.zzf();
        this.zzi = zzcgx.zzz();
        this.zzf = new FrameLayout(context);
        this.zzj = zzdar;
        zzfch.zzs(zzs);
    }

    /* access modifiers changed from: private */
    public final void zzt() {
        this.zzl = null;
        zze zze2 = this.zzn;
        this.zzn = null;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzhZ)).booleanValue() && zze2 != null) {
            this.zzb.execute(new zzexw(this, zze2));
        }
        zzelc zzelc = this.zzo;
        if (zzelc != null) {
            zzelc.zza();
        }
    }

    public final boolean zza() {
        ListenableFuture listenableFuture = this.zzl;
        return listenableFuture != null && !listenableFuture.isDone();
    }

    public final boolean zzb(zzm zzm2, String str, zzelb zzelb, zzelc zzelc) throws RemoteException {
        zzcpq zzcpq;
        if (str == null) {
            zzo.zzg("Ad unit ID should not be null for banner ad.");
            this.zzb.execute(new zzexy(this));
            return false;
        }
        if (!zza()) {
            if (((Boolean) zzbe.zzc().zza(zzbcl.zziN)).booleanValue() && zzm2.zzf) {
                this.zzc.zzl().zzo(true);
            }
            Bundle zza2 = zzdrg.zza(new Pair(zzdre.PUBLIC_API_CALL.zza(), Long.valueOf(zzm2.zzz)), new Pair(zzdre.DYNAMITE_ENTER.zza(), Long.valueOf(zzv.zzC().currentTimeMillis())));
            zzfch zzfch = this.zzk;
            zzfch.zzt(str);
            zzfch.zzH(zzm2);
            zzfch.zzA(zza2);
            Context context = this.zza;
            zzfcj zzJ = zzfch.zzJ();
            zzfgw zzb2 = zzfgv.zzb(context, zzfhg.zzf(zzJ), 3, zzm2);
            zzfhh zzfhh = null;
            if (!((Boolean) zzber.zzd.zze()).booleanValue() || !this.zzk.zzh().zzk) {
                if (((Boolean) zzbe.zzc().zza(zzbcl.zzhZ)).booleanValue()) {
                    zzcpp zze2 = this.zzc.zze();
                    zzcva zzcva = new zzcva();
                    zzcva.zzf(this.zza);
                    zzcva.zzk(zzJ);
                    zze2.zzi(zzcva.zzl());
                    zzdbk zzdbk = new zzdbk();
                    zzdbk.zzj(this.zzd, this.zzb);
                    zzdbk.zzk(this.zzd, this.zzb);
                    zze2.zzf(zzdbk.zzn());
                    zze2.zze(new zzeiw(this.zzg));
                    zze2.zzd(new zzdgl(zzdiq.zza, (zzbl) null));
                    zze2.zzg(new zzcqr(this.zzh, this.zzj));
                    zze2.zzc(new zzcoj(this.zzf));
                    zzcpq = zze2.zzk();
                } else {
                    zzcpp zze3 = this.zzc.zze();
                    zzcva zzcva2 = new zzcva();
                    zzcva2.zzf(this.zza);
                    zzcva2.zzk(zzJ);
                    zze3.zzi(zzcva2.zzl());
                    zzdbk zzdbk2 = new zzdbk();
                    zzdbk2.zzj(this.zzd, this.zzb);
                    zzdbk2.zza(this.zzd, this.zzb);
                    zzdbk2.zza(this.zze, this.zzb);
                    zzdbk2.zzl(this.zzd, this.zzb);
                    zzdbk2.zzd(this.zzd, this.zzb);
                    zzdbk2.zze(this.zzd, this.zzb);
                    zzdbk2.zzf(this.zzd, this.zzb);
                    zzdbk2.zzb(this.zzd, this.zzb);
                    zzdbk2.zzk(this.zzd, this.zzb);
                    zzdbk2.zzi(this.zzd, this.zzb);
                    zze3.zzf(zzdbk2.zzn());
                    zze3.zze(new zzeiw(this.zzg));
                    zze3.zzd(new zzdgl(zzdiq.zza, (zzbl) null));
                    zze3.zzg(new zzcqr(this.zzh, this.zzj));
                    zze3.zzc(new zzcoj(this.zzf));
                    zzcpq = zze3.zzk();
                }
                if (((Boolean) zzbee.zzc.zze()).booleanValue()) {
                    zzfhh = zzcpq.zzj();
                    zzfhh.zzi(3);
                    zzfhh.zzb(zzm2.zzp);
                    zzfhh.zzf(zzm2.zzm);
                }
                this.zzo = zzelc;
                zzcsd zzd2 = zzcpq.zzd();
                ListenableFuture zzh2 = zzd2.zzh(zzd2.zzi());
                this.zzl = zzh2;
                zzgch.zzr(zzh2, new zzexz(this, zzfhh, zzb2, zzcpq), this.zzb);
                return true;
            }
            zzekn zzekn = this.zzd;
            if (zzekn != null) {
                zzekn.zzdz(zzfdk.zzd(7, (String) null, (zze) null));
            }
        } else if (!this.zzk.zzS()) {
            this.zzm = true;
        }
        return false;
    }

    public final ViewGroup zzc() {
        return this.zzf;
    }

    public final zzfch zzf() {
        return this.zzk;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(zze zze2) {
        this.zzd.zzdz(zze2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzk() {
        this.zzd.zzdz(zzfdk.zzd(6, (String) null, (zze) null));
    }

    public final void zzl() {
        this.zzh.zzd(this.zzj.zzc());
    }

    public final void zzm() {
        this.zzh.zze(this.zzj.zzd());
    }

    public final void zzn(zzbi zzbi) {
        this.zze.zza(zzbi);
    }

    public final void zzo(zzcyf zzcyf) {
        this.zzh.zzo(zzcyf, this.zzb);
    }

    public final void zzp(zzbdg zzbdg) {
        this.zzg = zzbdg;
    }

    public final void zzq() {
        synchronized (this) {
            ListenableFuture listenableFuture = this.zzl;
            if (listenableFuture != null && listenableFuture.isDone()) {
                try {
                    zzcom zzcom = (zzcom) this.zzl.get();
                    this.zzl = null;
                    this.zzf.removeAllViews();
                    if (zzcom.zzd() != null) {
                        ViewParent parent = zzcom.zzd().getParent();
                        if (parent instanceof ViewGroup) {
                            String str = "";
                            if (zzcom.zzm() != null) {
                                str = zzcom.zzm().zzg();
                            }
                            zzo.zzj("Banner view provided from " + str + " already has a parent view. Removing its old parent.");
                            ((ViewGroup) parent).removeView(zzcom.zzd());
                        }
                    }
                    if (((Boolean) zzbe.zzc().zza(zzbcl.zzhZ)).booleanValue()) {
                        zzczz zzo2 = zzcom.zzo();
                        zzo2.zza(this.zzd);
                        zzo2.zzc(this.zze);
                    }
                    this.zzf.addView(zzcom.zzd());
                    zzelc zzelc = this.zzo;
                    if (zzelc != null) {
                        zzelc.zzb(zzcom);
                    }
                    if (((Boolean) zzbe.zzc().zza(zzbcl.zzhZ)).booleanValue()) {
                        Executor executor = this.zzb;
                        zzekn zzekn = this.zzd;
                        Objects.requireNonNull(zzekn);
                        executor.execute(new zzexx(zzekn));
                    }
                    if (zzcom.zza() >= 0) {
                        this.zzm = false;
                        this.zzh.zzd(zzcom.zza());
                        this.zzh.zze(zzcom.zzc());
                    } else {
                        this.zzm = true;
                        this.zzh.zzd(zzcom.zzc());
                    }
                } catch (InterruptedException | ExecutionException e) {
                    zzt();
                    com.google.android.gms.ads.internal.util.zze.zzb("Error occurred while refreshing the ad. Making a new ad request.", e);
                    this.zzm = true;
                    this.zzh.zza();
                }
            } else if (this.zzl != null) {
                com.google.android.gms.ads.internal.util.zze.zza("Show timer went off but there is an ongoing ad request.");
                this.zzm = true;
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("No ad request was in progress or an ad was cached when show timer went off. Hence requesting a new ad.");
                this.zzm = true;
                this.zzh.zza();
            }
        }
    }

    public final boolean zzs() {
        ViewParent parent = this.zzf.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        zzv.zzq();
        return com.google.android.gms.ads.internal.util.zzs.zzW(view, view.getContext());
    }
}
