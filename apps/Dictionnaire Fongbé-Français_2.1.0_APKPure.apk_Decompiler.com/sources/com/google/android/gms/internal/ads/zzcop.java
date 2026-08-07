package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzcop extends zzcom {
    private final Context zzc;
    private final View zzd;
    private final zzcex zze;
    private final zzfbp zzf;
    private final zzcqx zzg;
    private final zzdiq zzh;
    private final zzddu zzi;
    private final zzhel zzj;
    private final Executor zzk;
    private zzs zzl;

    zzcop(zzcqy zzcqy, Context context, zzfbp zzfbp, View view, zzcex zzcex, zzcqx zzcqx, zzdiq zzdiq, zzddu zzddu, zzhel zzhel, Executor executor) {
        super(zzcqy);
        this.zzc = context;
        this.zzd = view;
        this.zze = zzcex;
        this.zzf = zzfbp;
        this.zzg = zzcqx;
        this.zzh = zzdiq;
        this.zzi = zzddu;
        this.zzj = zzhel;
        this.zzk = executor;
    }

    public static /* synthetic */ void zzj(zzcop zzcop) {
        zzbhh zze2 = zzcop.zzh.zze();
        if (zze2 != null) {
            try {
                zze2.zze((zzby) zzcop.zzj.zzb(), ObjectWrapper.wrap(zzcop.zzc));
            } catch (RemoteException e) {
                zzo.zzh("RemoteException when notifyAdLoad is called", e);
            }
        }
    }

    public final int zza() {
        return this.zza.zzb.zzb.zzd;
    }

    public final int zzc() {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzhJ)).booleanValue() && this.zzb.zzag) {
            if (!((Boolean) zzbe.zzc().zza(zzbcl.zzhK)).booleanValue()) {
                return 0;
            }
        }
        return this.zza.zzb.zzb.zzc;
    }

    public final View zzd() {
        return this.zzd;
    }

    public final zzeb zze() {
        try {
            return this.zzg.zza();
        } catch (zzfcq unused) {
            return null;
        }
    }

    public final zzfbp zzf() {
        zzs zzs = this.zzl;
        if (zzs != null) {
            return zzfcp.zzb(zzs);
        }
        zzfbo zzfbo = this.zzb;
        if (zzfbo.zzac) {
            for (String str : zzfbo.zza) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.zzd;
            return new zzfbp(view.getWidth(), view.getHeight(), false);
        }
        return (zzfbp) this.zzb.zzr.get(0);
    }

    public final zzfbp zzg() {
        return this.zzf;
    }

    public final void zzh() {
        this.zzi.zza();
    }

    public final void zzi(ViewGroup viewGroup, zzs zzs) {
        zzcex zzcex;
        if (viewGroup != null && (zzcex = this.zze) != null) {
            zzcex.zzaj(zzcgr.zzc(zzs));
            viewGroup.setMinimumHeight(zzs.zzc);
            viewGroup.setMinimumWidth(zzs.zzf);
            this.zzl = zzs;
        }
    }

    public final void zzk() {
        this.zzk.execute(new zzcoo(this));
        super.zzk();
    }
}
