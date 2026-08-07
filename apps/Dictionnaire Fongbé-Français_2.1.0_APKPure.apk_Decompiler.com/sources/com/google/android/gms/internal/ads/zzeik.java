package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public class zzeik extends zzbpj {
    private final zzcvr zza;
    private final zzddq zzb;
    private final zzcwl zzc;
    private final zzcxa zzd;
    private final zzcxf zze;
    private final zzdap zzf;
    private final zzcxz zzg;
    private final zzden zzh;
    private final zzdal zzi;
    private final zzcwg zzj;

    public zzeik(zzcvr zzcvr, zzddq zzddq, zzcwl zzcwl, zzcxa zzcxa, zzcxf zzcxf, zzdap zzdap, zzcxz zzcxz, zzden zzden, zzdal zzdal, zzcwg zzcwg) {
        this.zza = zzcvr;
        this.zzb = zzddq;
        this.zzc = zzcwl;
        this.zzd = zzcxa;
        this.zze = zzcxf;
        this.zzf = zzdap;
        this.zzg = zzcxz;
        this.zzh = zzden;
        this.zzi = zzdal;
        this.zzj = zzcwg;
    }

    public final void zze() {
        this.zza.onAdClicked();
        this.zzb.zzdd();
    }

    public final void zzf() {
        this.zzg.zzds(4);
    }

    public final void zzg(int i) {
    }

    public final void zzh(zze zze2) {
    }

    public final void zzi(int i, String str) {
    }

    @Deprecated
    public final void zzj(int i) throws RemoteException {
        zzk(new zze(i, "", AdError.UNDEFINED_DOMAIN, (zze) null, (IBinder) null));
    }

    public final void zzk(zze zze2) {
        this.zzj.zza(zzfdk.zzc(8, zze2));
    }

    public final void zzl(String str) {
        zzk(new zze(0, str, AdError.UNDEFINED_DOMAIN, (zze) null, (IBinder) null));
    }

    public void zzm() {
        this.zzc.zza();
        this.zzi.zzb();
    }

    public final void zzn() {
        this.zzd.zzb();
    }

    public final void zzo() {
        this.zze.zzs();
    }

    public final void zzp() {
        this.zzg.zzdp();
        this.zzi.zza();
    }

    public final void zzq(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    public final void zzr(zzbgq zzbgq, String str) {
    }

    public void zzs(zzbwi zzbwi) {
    }

    public void zzt(zzbwm zzbwm) throws RemoteException {
    }

    public void zzu() throws RemoteException {
    }

    public void zzv() {
        this.zzh.zza();
    }

    public final void zzw() {
        this.zzh.zzb();
    }

    public final void zzx() throws RemoteException {
        this.zzh.zzc();
    }

    public void zzy() {
        this.zzh.zzd();
    }
}
