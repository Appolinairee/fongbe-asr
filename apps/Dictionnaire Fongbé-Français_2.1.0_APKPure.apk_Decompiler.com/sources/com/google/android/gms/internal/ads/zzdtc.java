package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdtc {
    private final zzbko zza;

    zzdtc(zzbko zzbko) {
        this.zza = zzbko;
    }

    private final void zzs(zzdta zzdta) throws RemoteException {
        String zza2 = zzdta.zza(zzdta);
        zzo.zzi("Dispatching AFMA event on publisher webview: ".concat(zza2));
        this.zza.zzb(zza2);
    }

    public final void zza() throws RemoteException {
        zzs(new zzdta("initialize", (zzdtb) null));
    }

    public final void zzb(long j) throws RemoteException {
        zzdta zzdta = new zzdta("interstitial", (zzdtb) null);
        zzdta.zza = Long.valueOf(j);
        zzdta.zzc = "onAdClicked";
        this.zza.zzb(zzdta.zza(zzdta));
    }

    public final void zzc(long j) throws RemoteException {
        zzdta zzdta = new zzdta("interstitial", (zzdtb) null);
        zzdta.zza = Long.valueOf(j);
        zzdta.zzc = "onAdClosed";
        zzs(zzdta);
    }

    public final void zzd(long j, int i) throws RemoteException {
        zzdta zzdta = new zzdta("interstitial", (zzdtb) null);
        zzdta.zza = Long.valueOf(j);
        zzdta.zzc = "onAdFailedToLoad";
        zzdta.zzd = Integer.valueOf(i);
        zzs(zzdta);
    }

    public final void zze(long j) throws RemoteException {
        zzdta zzdta = new zzdta("interstitial", (zzdtb) null);
        zzdta.zza = Long.valueOf(j);
        zzdta.zzc = "onAdLoaded";
        zzs(zzdta);
    }

    public final void zzf(long j) throws RemoteException {
        zzdta zzdta = new zzdta("interstitial", (zzdtb) null);
        zzdta.zza = Long.valueOf(j);
        zzdta.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdta);
    }

    public final void zzg(long j) throws RemoteException {
        zzdta zzdta = new zzdta("interstitial", (zzdtb) null);
        zzdta.zza = Long.valueOf(j);
        zzdta.zzc = "onAdOpened";
        zzs(zzdta);
    }

    public final void zzh(long j) throws RemoteException {
        zzdta zzdta = new zzdta("creation", (zzdtb) null);
        zzdta.zza = Long.valueOf(j);
        zzdta.zzc = "nativeObjectCreated";
        zzs(zzdta);
    }

    public final void zzi(long j) throws RemoteException {
        zzdta zzdta = new zzdta("creation", (zzdtb) null);
        zzdta.zza = Long.valueOf(j);
        zzdta.zzc = "nativeObjectNotCreated";
        zzs(zzdta);
    }

    public final void zzj(long j) throws RemoteException {
        zzdta zzdta = new zzdta("rewarded", (zzdtb) null);
        zzdta.zza = Long.valueOf(j);
        zzdta.zzc = "onAdClicked";
        zzs(zzdta);
    }

    public final void zzk(long j) throws RemoteException {
        zzdta zzdta = new zzdta("rewarded", (zzdtb) null);
        zzdta.zza = Long.valueOf(j);
        zzdta.zzc = "onRewardedAdClosed";
        zzs(zzdta);
    }

    public final void zzl(long j, zzbwm zzbwm) throws RemoteException {
        zzdta zzdta = new zzdta("rewarded", (zzdtb) null);
        zzdta.zza = Long.valueOf(j);
        zzdta.zzc = "onUserEarnedReward";
        zzdta.zze = zzbwm.zzf();
        zzdta.zzf = Integer.valueOf(zzbwm.zze());
        zzs(zzdta);
    }

    public final void zzm(long j, int i) throws RemoteException {
        zzdta zzdta = new zzdta("rewarded", (zzdtb) null);
        zzdta.zza = Long.valueOf(j);
        zzdta.zzc = "onRewardedAdFailedToLoad";
        zzdta.zzd = Integer.valueOf(i);
        zzs(zzdta);
    }

    public final void zzn(long j, int i) throws RemoteException {
        zzdta zzdta = new zzdta("rewarded", (zzdtb) null);
        zzdta.zza = Long.valueOf(j);
        zzdta.zzc = "onRewardedAdFailedToShow";
        zzdta.zzd = Integer.valueOf(i);
        zzs(zzdta);
    }

    public final void zzo(long j) throws RemoteException {
        zzdta zzdta = new zzdta("rewarded", (zzdtb) null);
        zzdta.zza = Long.valueOf(j);
        zzdta.zzc = "onAdImpression";
        zzs(zzdta);
    }

    public final void zzp(long j) throws RemoteException {
        zzdta zzdta = new zzdta("rewarded", (zzdtb) null);
        zzdta.zza = Long.valueOf(j);
        zzdta.zzc = "onRewardedAdLoaded";
        zzs(zzdta);
    }

    public final void zzq(long j) throws RemoteException {
        zzdta zzdta = new zzdta("rewarded", (zzdtb) null);
        zzdta.zza = Long.valueOf(j);
        zzdta.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdta);
    }

    public final void zzr(long j) throws RemoteException {
        zzdta zzdta = new zzdta("rewarded", (zzdtb) null);
        zzdta.zza = Long.valueOf(j);
        zzdta.zzc = "onRewardedAdOpened";
        zzs(zzdta);
    }
}
