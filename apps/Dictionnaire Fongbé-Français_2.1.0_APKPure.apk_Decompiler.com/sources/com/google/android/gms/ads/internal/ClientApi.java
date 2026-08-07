package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzcz;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzab;
import com.google.android.gms.ads.internal.overlay.zzaf;
import com.google.android.gms.ads.internal.overlay.zzah;
import com.google.android.gms.ads.internal.overlay.zzai;
import com.google.android.gms.ads.internal.overlay.zzv;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbga;
import com.google.android.gms.internal.ads.zzbgg;
import com.google.android.gms.internal.ads.zzbko;
import com.google.android.gms.internal.ads.zzbkr;
import com.google.android.gms.internal.ads.zzbpe;
import com.google.android.gms.internal.ads.zzbsx;
import com.google.android.gms.internal.ads.zzbte;
import com.google.android.gms.internal.ads.zzbvz;
import com.google.android.gms.internal.ads.zzbwp;
import com.google.android.gms.internal.ads.zzbyu;
import com.google.android.gms.internal.ads.zzcgx;
import com.google.android.gms.internal.ads.zzdiz;
import com.google.android.gms.internal.ads.zzdjb;
import com.google.android.gms.internal.ads.zzdtg;
import com.google.android.gms.internal.ads.zzejq;
import com.google.android.gms.internal.ads.zzewo;
import com.google.android.gms.internal.ads.zzeyc;
import com.google.android.gms.internal.ads.zzezt;
import com.google.android.gms.internal.ads.zzfbh;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public class ClientApi extends zzco {
    public final zzbu zzb(IObjectWrapper iObjectWrapper, String str, zzbpe zzbpe, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return new zzejq(zzcgx.zzb(context, zzbpe, i), context, str);
    }

    public final zzby zzc(IObjectWrapper iObjectWrapper, zzs zzs, String str, zzbpe zzbpe, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzewo zzt = zzcgx.zzb(context, zzbpe, i).zzt();
        zzt.zza(str);
        zzt.zzb(context);
        return zzt.zzc().zza();
    }

    public final zzby zzd(IObjectWrapper iObjectWrapper, zzs zzs, String str, zzbpe zzbpe, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzeyc zzu = zzcgx.zzb(context, zzbpe, i).zzu();
        zzu.zzc(context);
        zzu.zza(zzs);
        zzu.zzb(str);
        return zzu.zzd().zza();
    }

    public final zzby zze(IObjectWrapper iObjectWrapper, zzs zzs, String str, zzbpe zzbpe, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzezt zzv = zzcgx.zzb(context, zzbpe, i).zzv();
        zzv.zzc(context);
        zzv.zza(zzs);
        zzv.zzb(str);
        return zzv.zzd().zza();
    }

    public final zzby zzf(IObjectWrapper iObjectWrapper, zzs zzs, String str, int i) {
        return new zzu((Context) ObjectWrapper.unwrap(iObjectWrapper), zzs, str, new VersionInfoParcel(244410000, i, true, false));
    }

    public final zzci zzg(IObjectWrapper iObjectWrapper, zzbpe zzbpe, int i) {
        return zzcgx.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbpe, i).zzA();
    }

    public final zzcz zzh(IObjectWrapper iObjectWrapper, int i) {
        return zzcgx.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), (zzbpe) null, i).zzc();
    }

    public final zzdu zzi(IObjectWrapper iObjectWrapper, zzbpe zzbpe, int i) {
        return zzcgx.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbpe, i).zzm();
    }

    public final zzbga zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new zzdjb((FrameLayout) ObjectWrapper.unwrap(iObjectWrapper), (FrameLayout) ObjectWrapper.unwrap(iObjectWrapper2), 244410000);
    }

    public final zzbgg zzk(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return new zzdiz((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    public final zzbkr zzl(IObjectWrapper iObjectWrapper, zzbpe zzbpe, int i, zzbko zzbko) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzdtg zzk = zzcgx.zzb(context, zzbpe, i).zzk();
        zzk.zzb(context);
        zzk.zza(zzbko);
        return zzk.zzc().zzd();
    }

    public final zzbsx zzm(IObjectWrapper iObjectWrapper, zzbpe zzbpe, int i) {
        return zzcgx.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbpe, i).zzn();
    }

    public final zzbte zzn(IObjectWrapper iObjectWrapper) {
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        AdOverlayInfoParcel zza = AdOverlayInfoParcel.zza(activity.getIntent());
        if (zza == null) {
            return new zzw(activity);
        }
        int i = zza.zzk;
        if (i == 1) {
            return new zzv(activity);
        }
        if (i == 2) {
            return new zzah(activity);
        }
        if (i == 3) {
            return new zzai(activity);
        }
        if (i != 4) {
            return i != 5 ? new zzw(activity) : new zzaf(activity);
        }
        return new zzab(activity, zza);
    }

    public final zzbvz zzo(IObjectWrapper iObjectWrapper, zzbpe zzbpe, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfbh zzw = zzcgx.zzb(context, zzbpe, i).zzw();
        zzw.zzb(context);
        return zzw.zzc().zzb();
    }

    public final zzbwp zzp(IObjectWrapper iObjectWrapper, String str, zzbpe zzbpe, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfbh zzw = zzcgx.zzb(context, zzbpe, i).zzw();
        zzw.zzb(context);
        zzw.zza(str);
        return zzw.zzc().zza();
    }

    public final zzbyu zzq(IObjectWrapper iObjectWrapper, zzbpe zzbpe, int i) {
        return zzcgx.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbpe, i).zzq();
    }
}
