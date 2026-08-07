package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzg;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzbic extends zzbhg {
    /* access modifiers changed from: private */
    public final OnAdManagerAdViewLoadedListener zza;

    public zzbic(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener) {
        this.zza = onAdManagerAdViewLoadedListener;
    }

    public final void zze(zzby zzby, IObjectWrapper iObjectWrapper) {
        if (zzby != null && iObjectWrapper != null) {
            AdManagerAdView adManagerAdView = new AdManagerAdView((Context) ObjectWrapper.unwrap(iObjectWrapper));
            AppEventListener appEventListener = null;
            try {
                if (zzby.zzi() instanceof zzg) {
                    zzg zzg = (zzg) zzby.zzi();
                    adManagerAdView.setAdListener(zzg != null ? zzg.zzb() : null);
                }
            } catch (RemoteException e) {
                zzo.zzh("", e);
            }
            try {
                if (zzby.zzj() instanceof zzayy) {
                    zzayy zzayy = (zzayy) zzby.zzj();
                    if (zzayy != null) {
                        appEventListener = zzayy.zzb();
                    }
                    adManagerAdView.setAppEventListener(appEventListener);
                }
            } catch (RemoteException e2) {
                zzo.zzh("", e2);
            }
            zzf.zza.post(new zzbib(this, adManagerAdView, zzby));
        }
    }
}
