package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzbkv {
    private final Context zza;
    private final OnH5AdsEventListener zzb;
    private zzbkr zzc;

    public zzbkv(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        Preconditions.checkState(true, "Android version must be Lollipop or higher");
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(onH5AdsEventListener);
        this.zza = context;
        this.zzb = onH5AdsEventListener;
        zzbcl.zza(context);
    }

    public static final boolean zzc(String str) {
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzjN)).booleanValue()) {
            return false;
        }
        Preconditions.checkNotNull(str);
        if (str.length() > ((Integer) zzbe.zzc().zza(zzbcl.zzjP)).intValue()) {
            zzo.zze("H5 GMSG exceeds max length");
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!"gmsg".equals(parse.getScheme()) || !"mobileads.google.com".equals(parse.getHost()) || !"/h5ads".equals(parse.getPath())) {
            return false;
        }
        return true;
    }

    private final void zzd() {
        if (this.zzc == null) {
            this.zzc = zzbc.zza().zzn(this.zza, new zzbpa(), this.zzb);
        }
    }

    public final void zza() {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzjN)).booleanValue()) {
            zzd();
            zzbkr zzbkr = this.zzc;
            if (zzbkr != null) {
                try {
                    zzbkr.zze();
                } catch (RemoteException e) {
                    zzo.zzl("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final boolean zzb(String str) {
        if (!zzc(str)) {
            return false;
        }
        zzd();
        zzbkr zzbkr = this.zzc;
        if (zzbkr == null) {
            return false;
        }
        try {
            zzbkr.zzf(str);
            return true;
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            return true;
        }
    }
}
