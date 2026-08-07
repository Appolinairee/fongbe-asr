package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzbub {
    @Nonnull
    private final View zza;
    private final Map zzb;
    private final zzbyu zzc;

    public zzbub(zzbua zzbua) {
        View zza2 = zzbua.zza;
        this.zza = zza2;
        Map zzd = zzbua.zzb;
        this.zzb = zzd;
        zzbyu zza3 = zzbtv.zza(zzbua.zza.getContext());
        this.zzc = zza3;
        if (zza3 != null && !zzd.isEmpty()) {
            try {
                zza3.zzg(new zzbuc(ObjectWrapper.wrap(zza2).asBinder(), ObjectWrapper.wrap(zzd).asBinder()));
            } catch (RemoteException unused) {
                zzo.zzg("Failed to call remote method.");
            }
        }
    }

    public final void zza(List list) {
        if (list == null || list.isEmpty()) {
            zzo.zzj("No click urls were passed to recordClick");
            return;
        }
        if (this.zzc == null) {
            zzo.zzj("Failed to get internal reporting info generator in recordClick.");
        }
        try {
            this.zzc.zzh(list, ObjectWrapper.wrap(this.zza), new zzbtz(this, list));
        } catch (RemoteException e) {
            zzo.zzg("RemoteException recording click: ".concat(e.toString()));
        }
    }

    public final void zzb(List list) {
        if (list == null || list.isEmpty()) {
            zzo.zzj("No impression urls were passed to recordImpression");
            return;
        }
        zzbyu zzbyu = this.zzc;
        if (zzbyu != null) {
            try {
                zzbyu.zzi(list, ObjectWrapper.wrap(this.zza), new zzbty(this, list));
            } catch (RemoteException e) {
                zzo.zzg("RemoteException recording impression urls: ".concat(e.toString()));
            }
        } else {
            zzo.zzj("Failed to get internal reporting info generator from recordImpression.");
        }
    }

    public final void zzc(MotionEvent motionEvent) {
        zzbyu zzbyu = this.zzc;
        if (zzbyu != null) {
            try {
                zzbyu.zzk(ObjectWrapper.wrap(motionEvent));
            } catch (RemoteException unused) {
                zzo.zzg("Failed to call remote method.");
            }
        } else {
            zzo.zze("Failed to get internal reporting info generator.");
        }
    }

    public final void zzd(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        if (this.zzc == null) {
            updateClickUrlCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzc.zzl(new ArrayList(Arrays.asList(new Uri[]{uri})), ObjectWrapper.wrap(this.zza), new zzbtx(this, updateClickUrlCallback));
        } catch (RemoteException e) {
            updateClickUrlCallback.onFailure("Internal error: ".concat(e.toString()));
        }
    }

    public final void zze(List list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        if (this.zzc == null) {
            updateImpressionUrlsCallback.onFailure("Failed to get internal reporting info generator.");
        }
        try {
            this.zzc.zzm(list, ObjectWrapper.wrap(this.zza), new zzbtw(this, updateImpressionUrlsCallback));
        } catch (RemoteException e) {
            updateImpressionUrlsCallback.onFailure("Internal error: ".concat(e.toString()));
        }
    }
}
