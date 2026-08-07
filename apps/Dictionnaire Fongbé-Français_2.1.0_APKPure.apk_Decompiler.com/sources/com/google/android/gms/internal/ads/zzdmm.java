package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdmm extends zzbmb implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzbfi {
    private View zza;
    private zzeb zzb;
    private zzdia zzc;
    private boolean zzd = false;
    private boolean zze = false;

    public zzdmm(zzdia zzdia, zzdif zzdif) {
        this.zza = zzdif.zzf();
        this.zzb = zzdif.zzj();
        this.zzc = zzdia;
        if (zzdif.zzs() != null) {
            zzdif.zzs().zzap(this);
        }
    }

    private final void zzg() {
        View view;
        zzdia zzdia = this.zzc;
        if (zzdia != null && (view = this.zza) != null) {
            zzdia.zzB(view, Collections.emptyMap(), Collections.emptyMap(), zzdia.zzY(this.zza));
        }
    }

    private final void zzh() {
        View view = this.zza;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.zza);
            }
        }
    }

    private static final void zzi(zzbmf zzbmf, int i) {
        try {
            zzbmf.zze(i);
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void onGlobalLayout() {
        zzg();
    }

    public final void onScrollChanged() {
        zzg();
    }

    public final zzeb zzb() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (!this.zzd) {
            return this.zzb;
        }
        zzo.zzg("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    public final zzbft zzc() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            zzo.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        zzdia zzdia = this.zzc;
        if (zzdia == null || zzdia.zzc() == null) {
            return null;
        }
        return zzdia.zzc().zza();
    }

    public final void zzd() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzh();
        zzdia zzdia = this.zzc;
        if (zzdia != null) {
            zzdia.zzb();
        }
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        this.zzd = true;
    }

    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzf(iObjectWrapper, new zzdml(this));
    }

    public final void zzf(IObjectWrapper iObjectWrapper, zzbmf zzbmf) throws RemoteException {
        String str;
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            zzo.zzg("Instream ad can not be shown after destroy().");
            zzi(zzbmf, 2);
            return;
        }
        View view = this.zza;
        if (view == null || this.zzb == null) {
            if (view == null) {
                str = "can not get video view.";
            } else {
                str = "can not get video controller.";
            }
            zzo.zzg("Instream internal error: ".concat(str));
            zzi(zzbmf, 0);
        } else if (this.zze) {
            zzo.zzg("Instream ad should not be used again.");
            zzi(zzbmf, 1);
        } else {
            this.zze = true;
            zzh();
            ((ViewGroup) ObjectWrapper.unwrap(iObjectWrapper)).addView(this.zza, new ViewGroup.LayoutParams(-1, -1));
            zzv.zzy();
            zzcaj.zza(this.zza, this);
            zzv.zzy();
            zzcaj.zzb(this.zza, this);
            zzg();
            try {
                zzbmf.zzf();
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
