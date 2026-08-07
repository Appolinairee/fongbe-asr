package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzv;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdsv implements AppEventListener, zzcyq, zza, zzcvt, zzcwn, zzcwo, zzcxh, zzcvw, zzfgo {
    private final List zza;
    private final zzdsj zzb;
    private long zzc;

    public zzdsv(zzdsj zzdsj, zzcgx zzcgx) {
        this.zzb = zzdsj;
        this.zza = Collections.singletonList(zzcgx);
    }

    private final void zzg(Class cls, String str, Object... objArr) {
        this.zzb.zza(this.zza, "Event-".concat(String.valueOf(cls.getSimpleName())), str, objArr);
    }

    public final void onAdClicked() {
        zzg(zza.class, "onAdClicked", new Object[0]);
    }

    public final void onAppEvent(String str, String str2) {
        zzg(AppEventListener.class, "onAppEvent", str, str2);
    }

    public final void zza() {
        zzg(zzcvt.class, "onAdClosed", new Object[0]);
    }

    public final void zzb() {
        zzg(zzcvt.class, "onAdLeftApplication", new Object[0]);
    }

    public final void zzc() {
        zzg(zzcvt.class, "onAdOpened", new Object[0]);
    }

    public final void zzd(zzfgh zzfgh, String str) {
        zzg(zzfgg.class, "onTaskSucceeded", str);
    }

    public final void zzdA(zzfgh zzfgh, String str) {
        zzg(zzfgg.class, "onTaskCreated", str);
    }

    public final void zzdB(zzfgh zzfgh, String str, Throwable th) {
        zzg(zzfgg.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    public final void zzdC(zzfgh zzfgh, String str) {
        zzg(zzfgg.class, "onTaskStarted", str);
    }

    public final void zzdh(Context context) {
        zzg(zzcwo.class, "onDestroy", context);
    }

    public final void zzdj(Context context) {
        zzg(zzcwo.class, "onPause", context);
    }

    public final void zzdk(Context context) {
        zzg(zzcwo.class, "onResume", context);
    }

    public final void zzdl(zzbvk zzbvk) {
        this.zzc = zzv.zzC().elapsedRealtime();
        zzg(zzcyq.class, "onAdRequest", new Object[0]);
    }

    public final void zzdm(zzfca zzfca) {
    }

    @ParametersAreNonnullByDefault
    public final void zzdq(zzbvw zzbvw, String str, String str2) {
        zzg(zzcvt.class, "onRewarded", zzbvw, str, str2);
    }

    public final void zzdz(zze zze) {
        zzg(zzcvw.class, "onAdFailedToLoad", Integer.valueOf(zze.zza), zze.zzb, zze.zzc);
    }

    public final void zze() {
        zzg(zzcvt.class, "onRewardedVideoCompleted", new Object[0]);
    }

    public final void zzf() {
        zzg(zzcvt.class, "onRewardedVideoStarted", new Object[0]);
    }

    public final void zzr() {
        zzg(zzcwn.class, "onAdImpression", new Object[0]);
    }

    public final void zzs() {
        long elapsedRealtime = zzv.zzC().elapsedRealtime() - this.zzc;
        com.google.android.gms.ads.internal.util.zze.zza("Ad Request Latency : " + elapsedRealtime);
        zzg(zzcxh.class, "onAdLoaded", new Object[0]);
    }
}
