package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzez;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdif {
    private int zza;
    private zzeb zzb;
    private zzbfp zzc;
    private View zzd;
    private List zze;
    private List zzf = Collections.emptyList();
    private zzez zzg;
    private Bundle zzh;
    private zzcex zzi;
    private zzcex zzj;
    private zzcex zzk;
    private zzecr zzl;
    private ListenableFuture zzm;
    private zzcab zzn;
    private View zzo;
    private View zzp;
    private IObjectWrapper zzq;
    private double zzr;
    private zzbfw zzs;
    private zzbfw zzt;
    private String zzu;
    private final SimpleArrayMap zzv = new SimpleArrayMap();
    private final SimpleArrayMap zzw = new SimpleArrayMap();
    private float zzx;
    private String zzy;

    public static zzdif zzag(zzbpp zzbpp) {
        try {
            zzdie zzak = zzak(zzbpp.zzg(), (zzbpt) null);
            zzbfp zzh2 = zzbpp.zzh();
            String zzo2 = zzbpp.zzo();
            List zzr2 = zzbpp.zzr();
            String zzm2 = zzbpp.zzm();
            Bundle zzf2 = zzbpp.zzf();
            String zzn2 = zzbpp.zzn();
            IObjectWrapper zzl2 = zzbpp.zzl();
            String zzq2 = zzbpp.zzq();
            String zzp2 = zzbpp.zzp();
            double zze2 = zzbpp.zze();
            zzbfw zzi2 = zzbpp.zzi();
            zzdif zzdif = new zzdif();
            zzdif.zza = 2;
            zzdif.zzb = zzak;
            zzdif.zzc = zzh2;
            zzdif.zzd = (View) zzam(zzbpp.zzj());
            zzdif.zzZ("headline", zzo2);
            zzdif.zze = zzr2;
            zzdif.zzZ("body", zzm2);
            zzdif.zzh = zzf2;
            zzdif.zzZ("call_to_action", zzn2);
            zzdif.zzo = (View) zzam(zzbpp.zzk());
            zzdif.zzq = zzl2;
            zzdif.zzZ("store", zzq2);
            zzdif.zzZ("price", zzp2);
            zzdif.zzr = zze2;
            zzdif.zzs = zzi2;
            return zzdif;
        } catch (RemoteException e) {
            zzo.zzk("Failed to get native ad from app install ad mapper", e);
            return null;
        }
    }

    public static zzdif zzah(zzbpq zzbpq) {
        try {
            zzdie zzak = zzak(zzbpq.zzf(), (zzbpt) null);
            zzbfp zzg2 = zzbpq.zzg();
            String zzo2 = zzbpq.zzo();
            List zzp2 = zzbpq.zzp();
            String zzm2 = zzbpq.zzm();
            Bundle zze2 = zzbpq.zze();
            String zzn2 = zzbpq.zzn();
            IObjectWrapper zzk2 = zzbpq.zzk();
            String zzl2 = zzbpq.zzl();
            zzbfw zzh2 = zzbpq.zzh();
            zzdif zzdif = new zzdif();
            zzdif.zza = 1;
            zzdif.zzb = zzak;
            zzdif.zzc = zzg2;
            zzdif.zzd = (View) zzam(zzbpq.zzi());
            zzdif.zzZ("headline", zzo2);
            zzdif.zze = zzp2;
            zzdif.zzZ("body", zzm2);
            zzdif.zzh = zze2;
            zzdif.zzZ("call_to_action", zzn2);
            zzdif.zzo = (View) zzam(zzbpq.zzj());
            zzdif.zzq = zzk2;
            zzdif.zzZ("advertiser", zzl2);
            zzdif.zzt = zzh2;
            return zzdif;
        } catch (RemoteException e) {
            zzo.zzk("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    public static zzdif zzai(zzbpp zzbpp) {
        try {
            return zzal(zzak(zzbpp.zzg(), (zzbpt) null), zzbpp.zzh(), (View) zzam(zzbpp.zzj()), zzbpp.zzo(), zzbpp.zzr(), zzbpp.zzm(), zzbpp.zzf(), zzbpp.zzn(), (View) zzam(zzbpp.zzk()), zzbpp.zzl(), zzbpp.zzq(), zzbpp.zzp(), zzbpp.zze(), zzbpp.zzi(), (String) null, 0.0f);
        } catch (RemoteException e) {
            zzo.zzk("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    public static zzdif zzaj(zzbpq zzbpq) {
        try {
            return zzal(zzak(zzbpq.zzf(), (zzbpt) null), zzbpq.zzg(), (View) zzam(zzbpq.zzi()), zzbpq.zzo(), zzbpq.zzp(), zzbpq.zzm(), zzbpq.zze(), zzbpq.zzn(), (View) zzam(zzbpq.zzj()), zzbpq.zzk(), (String) null, (String) null, -1.0d, zzbpq.zzh(), zzbpq.zzl(), 0.0f);
        } catch (RemoteException e) {
            zzo.zzk("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    private static zzdie zzak(zzeb zzeb, zzbpt zzbpt) {
        if (zzeb == null) {
            return null;
        }
        return new zzdie(zzeb, zzbpt);
    }

    private static zzdif zzal(zzeb zzeb, zzbfp zzbfp, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d, zzbfw zzbfw, String str6, float f) {
        zzdif zzdif = new zzdif();
        zzdif.zza = 6;
        zzdif.zzb = zzeb;
        zzdif.zzc = zzbfp;
        zzdif.zzd = view;
        String str7 = str;
        zzdif.zzZ("headline", str);
        zzdif.zze = list;
        String str8 = str2;
        zzdif.zzZ("body", str2);
        zzdif.zzh = bundle;
        String str9 = str3;
        zzdif.zzZ("call_to_action", str3);
        zzdif.zzo = view2;
        zzdif.zzq = iObjectWrapper;
        String str10 = str4;
        zzdif.zzZ("store", str4);
        String str11 = str5;
        zzdif.zzZ("price", str5);
        zzdif.zzr = d;
        zzdif.zzs = zzbfw;
        zzdif.zzZ("advertiser", str6);
        zzdif.zzR(f);
        return zzdif;
    }

    private static Object zzam(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.unwrap(iObjectWrapper);
    }

    public static zzdif zzt(zzbpt zzbpt) {
        try {
            return zzal(zzak(zzbpt.zzj(), zzbpt), zzbpt.zzk(), (View) zzam(zzbpt.zzm()), zzbpt.zzs(), zzbpt.zzv(), zzbpt.zzq(), zzbpt.zzi(), zzbpt.zzr(), (View) zzam(zzbpt.zzn()), zzbpt.zzo(), zzbpt.zzu(), zzbpt.zzt(), zzbpt.zze(), zzbpt.zzl(), zzbpt.zzp(), zzbpt.zzf());
        } catch (RemoteException e) {
            zzo.zzk("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    public final synchronized String zzA() {
        return this.zzu;
    }

    public final synchronized String zzB() {
        return zzF("headline");
    }

    public final synchronized String zzC() {
        return this.zzy;
    }

    public final synchronized String zzD() {
        return zzF("price");
    }

    public final synchronized String zzE() {
        return zzF("store");
    }

    public final synchronized String zzF(String str) {
        return (String) this.zzw.get(str);
    }

    public final synchronized List zzG() {
        return this.zze;
    }

    public final synchronized List zzH() {
        return this.zzf;
    }

    public final synchronized void zzI() {
        zzcex zzcex = this.zzi;
        if (zzcex != null) {
            zzcex.destroy();
            this.zzi = null;
        }
        zzcex zzcex2 = this.zzj;
        if (zzcex2 != null) {
            zzcex2.destroy();
            this.zzj = null;
        }
        zzcex zzcex3 = this.zzk;
        if (zzcex3 != null) {
            zzcex3.destroy();
            this.zzk = null;
        }
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
            this.zzm = null;
        }
        zzcab zzcab = this.zzn;
        if (zzcab != null) {
            zzcab.cancel(false);
            this.zzn = null;
        }
        this.zzl = null;
        this.zzv.clear();
        this.zzw.clear();
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzh = null;
        this.zzo = null;
        this.zzp = null;
        this.zzq = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
    }

    public final synchronized void zzJ(zzbfp zzbfp) {
        this.zzc = zzbfp;
    }

    public final synchronized void zzK(String str) {
        this.zzu = str;
    }

    public final synchronized void zzL(zzez zzez) {
        this.zzg = zzez;
    }

    public final synchronized void zzM(zzbfw zzbfw) {
        this.zzs = zzbfw;
    }

    public final synchronized void zzN(String str, zzbfj zzbfj) {
        if (zzbfj == null) {
            this.zzv.remove(str);
        } else {
            this.zzv.put(str, zzbfj);
        }
    }

    public final synchronized void zzO(zzcex zzcex) {
        this.zzj = zzcex;
    }

    public final synchronized void zzP(List list) {
        this.zze = list;
    }

    public final synchronized void zzQ(zzbfw zzbfw) {
        this.zzt = zzbfw;
    }

    public final synchronized void zzR(float f) {
        this.zzx = f;
    }

    public final synchronized void zzS(List list) {
        this.zzf = list;
    }

    public final synchronized void zzT(zzcex zzcex) {
        this.zzk = zzcex;
    }

    public final synchronized void zzU(ListenableFuture listenableFuture) {
        this.zzm = listenableFuture;
    }

    public final synchronized void zzV(String str) {
        this.zzy = str;
    }

    public final synchronized void zzW(zzecr zzecr) {
        this.zzl = zzecr;
    }

    public final synchronized void zzX(zzcab zzcab) {
        this.zzn = zzcab;
    }

    public final synchronized void zzY(double d) {
        this.zzr = d;
    }

    public final synchronized void zzZ(String str, String str2) {
        if (str2 == null) {
            this.zzw.remove(str);
        } else {
            this.zzw.put(str, str2);
        }
    }

    public final synchronized double zza() {
        return this.zzr;
    }

    public final synchronized void zzaa(int i) {
        this.zza = i;
    }

    public final synchronized void zzab(zzeb zzeb) {
        this.zzb = zzeb;
    }

    public final synchronized void zzac(View view) {
        this.zzo = view;
    }

    public final synchronized void zzad(zzcex zzcex) {
        this.zzi = zzcex;
    }

    public final synchronized void zzae(View view) {
        this.zzp = view;
    }

    public final synchronized boolean zzaf() {
        return this.zzj != null;
    }

    public final synchronized float zzb() {
        return this.zzx;
    }

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized Bundle zzd() {
        if (this.zzh == null) {
            this.zzh = new Bundle();
        }
        return this.zzh;
    }

    public final synchronized View zze() {
        return this.zzd;
    }

    public final synchronized View zzf() {
        return this.zzo;
    }

    public final synchronized View zzg() {
        return this.zzp;
    }

    public final synchronized SimpleArrayMap zzh() {
        return this.zzv;
    }

    public final synchronized SimpleArrayMap zzi() {
        return this.zzw;
    }

    public final synchronized zzeb zzj() {
        return this.zzb;
    }

    public final synchronized zzez zzk() {
        return this.zzg;
    }

    public final synchronized zzbfp zzl() {
        return this.zzc;
    }

    public final zzbfw zzm() {
        List list = this.zze;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Object obj = this.zze.get(0);
        if (obj instanceof IBinder) {
            return zzbfv.zzg((IBinder) obj);
        }
        return null;
    }

    public final synchronized zzbfw zzn() {
        return this.zzs;
    }

    public final synchronized zzbfw zzo() {
        return this.zzt;
    }

    public final synchronized zzcab zzp() {
        return this.zzn;
    }

    public final synchronized zzcex zzq() {
        return this.zzj;
    }

    public final synchronized zzcex zzr() {
        return this.zzk;
    }

    public final synchronized zzcex zzs() {
        return this.zzi;
    }

    public final synchronized zzecr zzu() {
        return this.zzl;
    }

    public final synchronized IObjectWrapper zzv() {
        return this.zzq;
    }

    public final synchronized ListenableFuture zzw() {
        return this.zzm;
    }

    public final synchronized String zzx() {
        return zzF("advertiser");
    }

    public final synchronized String zzy() {
        return zzF("body");
    }

    public final synchronized String zzz() {
        return zzF("call_to_action");
    }
}
