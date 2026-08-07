package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdjl implements View.OnClickListener {
    String zza;
    Long zzb;
    WeakReference zzc;
    private final zzdnl zzd;
    private final Clock zze;
    private zzbhq zzf;
    private zzbjp zzg;

    public zzdjl(zzdnl zzdnl, Clock clock) {
        this.zzd = zzdnl;
        this.zze = clock;
    }

    private final void zzd() {
        View view;
        this.zza = null;
        this.zzb = null;
        WeakReference weakReference = this.zzc;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            view.setClickable(false);
            view.setOnClickListener((View.OnClickListener) null);
            this.zzc = null;
        }
    }

    public final void onClick(View view) {
        WeakReference weakReference = this.zzc;
        if (weakReference != null && weakReference.get() == view) {
            if (!(this.zza == null || this.zzb == null)) {
                HashMap hashMap = new HashMap();
                hashMap.put("id", this.zza);
                hashMap.put("time_interval", String.valueOf(this.zze.currentTimeMillis() - this.zzb.longValue()));
                hashMap.put("messageType", "onePointFiveClick");
                this.zzd.zzj("sendMessageToNativeJs", hashMap);
            }
            zzd();
        }
    }

    public final zzbhq zza() {
        return this.zzf;
    }

    public final void zzb() {
        if (this.zzf != null && this.zzb != null) {
            zzd();
            try {
                this.zzf.zze();
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    public final void zzc(zzbhq zzbhq) {
        this.zzf = zzbhq;
        zzbjp zzbjp = this.zzg;
        if (zzbjp != null) {
            this.zzd.zzn("/unconfirmedClick", zzbjp);
        }
        zzdjk zzdjk = new zzdjk(this, zzbhq);
        this.zzg = zzdjk;
        this.zzd.zzl("/unconfirmedClick", zzdjk);
    }
}
