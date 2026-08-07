package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdov {
    private final zzcvr zza;
    private final zzddq zzb;
    /* access modifiers changed from: private */
    public final zzcxa zzc;
    private final zzcxn zzd;
    private final zzcxz zze;
    private final zzdap zzf;
    private final Executor zzg;
    private final zzddm zzh;
    private final zzcnh zzi;
    private final zzb zzj;
    private final zzbxu zzk;
    private final zzava zzl;
    /* access modifiers changed from: private */
    public final zzdag zzm;
    private final zzebk zzn;
    private final zzfja zzo;
    private final zzdrw zzp;
    private final zzcmk zzq;
    private final zzdpb zzr;

    public zzdov(zzcvr zzcvr, zzcxa zzcxa, zzcxn zzcxn, zzcxz zzcxz, zzdap zzdap, Executor executor, zzddm zzddm, zzcnh zzcnh, zzb zzb2, zzbxu zzbxu, zzava zzava, zzdag zzdag, zzebk zzebk, zzfja zzfja, zzdrw zzdrw, zzddq zzddq, zzcmk zzcmk, zzdpb zzdpb) {
        this.zza = zzcvr;
        this.zzc = zzcxa;
        this.zzd = zzcxn;
        this.zze = zzcxz;
        this.zzf = zzdap;
        this.zzg = executor;
        this.zzh = zzddm;
        this.zzi = zzcnh;
        this.zzj = zzb2;
        this.zzk = zzbxu;
        this.zzl = zzava;
        this.zzm = zzdag;
        this.zzn = zzebk;
        this.zzo = zzfja;
        this.zzp = zzdrw;
        this.zzb = zzddq;
        this.zzq = zzcmk;
        this.zzr = zzdpb;
    }

    public static final ListenableFuture zzj(zzcex zzcex, String str, String str2, Bundle bundle) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzcm)).booleanValue()) {
            bundle.putLong(zzdre.RENDERING_WEBVIEW_LOAD_HTML_START.zza(), zzv.zzC().currentTimeMillis());
        }
        zzcab zzcab = new zzcab();
        zzcex.zzN().zzC(new zzdom(bundle, zzcab));
        zzcex.zzae(str, str2, (String) null);
        return zzcab;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc() {
        this.zza.onAdClicked();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze() {
        this.zzc.zzb();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(View view) {
        this.zzj.zza();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(zzcex zzcex, zzcex zzcex2, Map map) {
        this.zzi.zzh(zzcex);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean zzh(View view, MotionEvent motionEvent) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzjT)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
            this.zzr.zzb(motionEvent);
        }
        this.zzj.zza();
        if (view == null) {
            return false;
        }
        view.performClick();
        return false;
    }

    public final void zzi(zzcex zzcex, boolean z, zzbjs zzbjs, Bundle bundle) {
        zzauv zzc2;
        zzcex zzcex2 = zzcex;
        Bundle bundle2 = bundle;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzcm)).booleanValue()) {
            bundle2.putLong(zzdre.RENDERING_CONFIGURE_WEBVIEW_START.zza(), zzv.zzC().currentTimeMillis());
        }
        zzcgp zzN = zzcex.zzN();
        zzdon zzdon = r3;
        zzdon zzdon2 = new zzdon(this);
        zzcxn zzcxn = this.zzd;
        zzcxz zzcxz = this.zze;
        zzdoo zzdoo = r3;
        zzdoo zzdoo2 = new zzdoo(this);
        zzdop zzdop = r3;
        zzdop zzdop2 = new zzdop(this);
        zzb zzb2 = this.zzj;
        zzdou zzdou = r3;
        zzdou zzdou2 = new zzdou(this);
        zzN.zzV(zzdon, zzcxn, zzcxz, zzdoo, zzdop, z, zzbjs, zzb2, zzdou, this.zzk, this.zzn, this.zzo, this.zzp, (zzbkj) null, this.zzb, (zzbki) null, (zzbkc) null, (zzbjq) null, this.zzq);
        zzcex2.setOnTouchListener(new zzdoq(this));
        zzcex2.setOnClickListener(new zzdor(this));
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzcK)).booleanValue() && (zzc2 = this.zzl.zzc()) != null) {
            zzc2.zzo(zzcex.zzF());
        }
        this.zzh.zzo(zzcex2, this.zzg);
        this.zzh.zzo(new zzdos(zzcex2), this.zzg);
        this.zzh.zza(zzcex.zzF());
        zzcex2.zzag("/trackActiveViewUnit", new zzdot(this, zzcex2));
        this.zzi.zzi(zzcex2);
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzcm)).booleanValue()) {
            bundle2.putLong(zzdre.RENDERING_CONFIGURE_WEBVIEW_END.zza(), zzv.zzC().currentTimeMillis());
        }
    }
}
