package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzbga;
import com.google.android.gms.internal.ads.zzbgg;
import com.google.android.gms.internal.ads.zzbhv;
import com.google.android.gms.internal.ads.zzbhw;
import com.google.android.gms.internal.ads.zzbkr;
import com.google.android.gms.internal.ads.zzbpe;
import com.google.android.gms.internal.ads.zzbsx;
import com.google.android.gms.internal.ads.zzbtb;
import com.google.android.gms.internal.ads.zzbte;
import com.google.android.gms.internal.ads.zzbuj;
import com.google.android.gms.internal.ads.zzbwp;
import com.google.android.gms.internal.ads.zzbxb;
import com.google.android.gms.internal.ads.zzbyu;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzba {
    /* access modifiers changed from: private */
    public final zzk zza;
    /* access modifiers changed from: private */
    public final zzi zzb;
    /* access modifiers changed from: private */
    public final zzfe zzc;
    /* access modifiers changed from: private */
    public final zzbhv zzd;
    /* access modifiers changed from: private */
    public final zzbtb zze;
    /* access modifiers changed from: private */
    public final zzbhw zzf;
    /* access modifiers changed from: private */
    public zzbuj zzg;
    /* access modifiers changed from: private */
    public final zzl zzh;

    public zzba(zzk zzk, zzi zzi, zzfe zzfe, zzbhv zzbhv, zzbxb zzbxb, zzbtb zzbtb, zzbhw zzbhw, zzl zzl) {
        this.zza = zzk;
        this.zzb = zzi;
        this.zzc = zzfe;
        this.zzd = zzbhv;
        this.zze = zzbtb;
        this.zzf = zzbhw;
        this.zzh = zzl;
    }

    static /* bridge */ /* synthetic */ void zzv(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzbc.zzb().zzn(context, zzbc.zzc().afmaVersion, "gmob-apps", bundle, true);
    }

    public final zzbu zzd(Context context, String str, zzbpe zzbpe) {
        return (zzbu) new zzar(this, context, str, zzbpe).zzd(context, false);
    }

    public final zzby zze(Context context, zzs zzs, String str, zzbpe zzbpe) {
        return (zzby) new zzan(this, context, zzs, str, zzbpe).zzd(context, false);
    }

    public final zzby zzf(Context context, zzs zzs, String str, zzbpe zzbpe) {
        return (zzby) new zzap(this, context, zzs, str, zzbpe).zzd(context, false);
    }

    public final zzci zzg(Context context, zzbpe zzbpe) {
        return (zzci) new zzat(this, context, zzbpe).zzd(context, false);
    }

    public final zzdu zzh(Context context, zzbpe zzbpe) {
        return (zzdu) new zzaf(this, context, zzbpe).zzd(context, false);
    }

    public final zzbga zzj(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zzbga) new zzax(this, frameLayout, frameLayout2, context).zzd(context, false);
    }

    public final zzbgg zzk(View view, HashMap hashMap, HashMap hashMap2) {
        return (zzbgg) new zzaz(this, view, hashMap, hashMap2).zzd(view.getContext(), false);
    }

    public final zzbkr zzn(Context context, zzbpe zzbpe, OnH5AdsEventListener onH5AdsEventListener) {
        return (zzbkr) new zzal(this, context, zzbpe, onH5AdsEventListener).zzd(context, false);
    }

    public final zzbsx zzo(Context context, zzbpe zzbpe) {
        return (zzbsx) new zzaj(this, context, zzbpe).zzd(context, false);
    }

    public final zzbte zzq(Activity activity) {
        zzad zzad = new zzad(this, activity);
        Intent intent = activity.getIntent();
        boolean z = false;
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            zzo.zzg("useClientJar flag not found in activity intent extras.");
        } else {
            z = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        return (zzbte) zzad.zzd(activity, z);
    }

    public final zzbwp zzs(Context context, String str, zzbpe zzbpe) {
        return (zzbwp) new zzab(this, context, str, zzbpe).zzd(context, false);
    }

    public final zzbyu zzt(Context context, zzbpe zzbpe) {
        return (zzbyu) new zzah(this, context, zzbpe).zzd(context, false);
    }
}
