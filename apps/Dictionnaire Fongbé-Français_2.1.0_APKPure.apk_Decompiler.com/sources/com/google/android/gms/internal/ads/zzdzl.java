package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdzl extends zzbux {
    private final Context zza;
    private final zzgcs zzb;
    private final zzdzt zzc;
    private final zzckx zzd;
    private final ArrayDeque zze;
    private final zzfhk zzf;
    private final zzbvs zzg;

    public zzdzl(Context context, zzgcs zzgcs, zzbvs zzbvs, zzckx zzckx, zzdzt zzdzt, ArrayDeque arrayDeque, zzdzq zzdzq, zzfhk zzfhk) {
        zzbcl.zza(context);
        this.zza = context;
        this.zzb = zzgcs;
        this.zzg = zzbvs;
        this.zzc = zzdzt;
        this.zzd = zzckx;
        this.zze = arrayDeque;
        this.zzf = zzfhk;
    }

    private final synchronized zzdzi zzl(String str) {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            zzdzi zzdzi = (zzdzi) it.next();
            if (zzdzi.zzc.equals(str)) {
                it.remove();
                return zzdzi;
            }
        }
        return null;
    }

    private static ListenableFuture zzm(ListenableFuture listenableFuture, zzfgn zzfgn, zzbog zzbog, zzfhh zzfhh, zzfgw zzfgw) {
        zzbnw zza2 = zzbog.zza("AFMA_getAdDictionary", zzbod.zza, new zzdzc());
        zzfhg.zzd(listenableFuture, zzfgw);
        zzfft zza3 = zzfgn.zzb(zzfgh.BUILD_URL, listenableFuture).zzf(zza2).zza();
        zzfhg.zzc(zza3, zzfhh, zzfgw);
        return zza3;
    }

    private static ListenableFuture zzn(zzbvk zzbvk, zzfgn zzfgn, zzeuu zzeuu) {
        zzdyw zzdyw = new zzdyw(zzeuu, zzbvk);
        return zzfgn.zzb(zzfgh.GMS_SIGNALS, zzgch.zzh(zzbvk.zza)).zzf(zzdyw).zze(new zzdyx()).zza();
    }

    private final synchronized void zzo(zzdzi zzdzi) {
        zzp();
        this.zze.addLast(zzdzi);
    }

    private final synchronized void zzp() {
        int intValue = ((Long) zzbes.zzb.zze()).intValue();
        while (this.zze.size() >= intValue) {
            this.zze.removeFirst();
        }
    }

    private final void zzq(ListenableFuture listenableFuture, zzbvc zzbvc, zzbvk zzbvk) {
        zzgch.zzr(zzgch.zzn(listenableFuture, new zzdzd(this), zzbzw.zza), new zzdzh(this, zzbvk, zzbvc), zzbzw.zzg);
    }

    public final ListenableFuture zzb(zzbvk zzbvk, int i) {
        if (!((Boolean) zzbes.zza.zze()).booleanValue()) {
            return zzgch.zzg(new Exception("Split request is disabled."));
        }
        zzfed zzfed = zzbvk.zzi;
        if (zzfed == null) {
            return zzgch.zzg(new Exception("Pool configuration missing from request."));
        }
        if (zzfed.zzc == 0 || zzfed.zzd == 0) {
            return zzgch.zzg(new Exception("Caching is disabled."));
        }
        zzbog zzb2 = zzv.zzg().zzb(this.zza, VersionInfoParcel.forPackage(), this.zzf);
        zzeuu zzr = this.zzd.zzr(zzbvk, i);
        zzfgn zzc2 = zzr.zzc();
        ListenableFuture zzn = zzn(zzbvk, zzc2, zzr);
        zzfhh zzd2 = zzr.zzd();
        zzfgw zza2 = zzfgv.zza(this.zza, 9);
        ListenableFuture zzm = zzm(zzn, zzc2, zzb2, zzd2, zza2);
        return zzc2.zza(zzfgh.GET_URL_AND_CACHE_KEY, zzn, zzm).zza(new zzdza(this, zzm, zzn, zzbvk, zza2)).zza();
    }

    public final ListenableFuture zzc(zzbvk zzbvk, int i) {
        zzdzi zzdzi;
        zzfgw zzfgw;
        zzfft zzfft;
        zzbog zzb2 = zzv.zzg().zzb(this.zza, VersionInfoParcel.forPackage(), this.zzf);
        zzeuu zzr = this.zzd.zzr(zzbvk, i);
        zzbnw zza2 = zzb2.zza("google.afma.response.normalize", zzdzk.zza, zzbod.zzb);
        if (!((Boolean) zzbes.zza.zze()).booleanValue()) {
            String str = zzbvk.zzj;
            zzdzi = null;
            if (str != null && !str.isEmpty()) {
                zze.zza("Request contained a PoolKey but split request is disabled.");
            }
        } else {
            zzdzi = zzl(zzbvk.zzh);
            if (zzdzi == null) {
                zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        }
        if (zzdzi == null) {
            zzfgw = zzfgv.zza(this.zza, 9);
        } else {
            zzfgw = zzdzi.zzd;
        }
        zzfhh zzd2 = zzr.zzd();
        zzd2.zzd(zzbvk.zza.getStringArrayList("ad_types"));
        zzdzs zzdzs = new zzdzs(zzbvk.zzg, zzd2, zzfgw);
        zzdzp zzdzp = new zzdzp(this.zza, zzbvk.zzb.afmaVersion, this.zzg, i);
        zzfgn zzc2 = zzr.zzc();
        zzfgw zza3 = zzfgv.zza(this.zza, 11);
        if (zzdzi == null) {
            ListenableFuture zzn = zzn(zzbvk, zzc2, zzr);
            ListenableFuture zzm = zzm(zzn, zzc2, zzb2, zzd2, zzfgw);
            zzfgw zza4 = zzfgv.zza(this.zza, 10);
            zzfft zza5 = zzc2.zza(zzfgh.HTTP, zzm, zzn).zza(new zzdyy(zzm, zzbvk, zzn)).zze(zzdzs).zze(new zzfhc(zza4)).zze(zzdzp).zza();
            zzfhg.zza(zza5, zzd2, zza4);
            zzfhg.zzd(zza5, zza3);
            zzfft = zzc2.zza(zzfgh.PRE_PROCESS, zzn, zzm, zza5).zza(new zzdyz(zzbvk, zza5, zzn, zzm)).zzf(zza2).zza();
        } else {
            zzdzr zzdzr = new zzdzr(zzdzi.zzb, zzdzi.zza);
            zzfgw zza6 = zzfgv.zza(this.zza, 10);
            zzfft zza7 = zzc2.zzb(zzfgh.HTTP, zzgch.zzh(zzdzr)).zze(zzdzs).zze(new zzfhc(zza6)).zze(zzdzp).zza();
            zzfhg.zza(zza7, zzd2, zza6);
            ListenableFuture zzh = zzgch.zzh(zzdzi);
            zzfhg.zzd(zza7, zza3);
            zzfft = zzc2.zza(zzfgh.PRE_PROCESS, zza7, zzh).zza(new zzdyv(zza7, zzh)).zzf(zza2).zza();
        }
        zzfhg.zza(zzfft, zzd2, zza3);
        return zzfft;
    }

    public final ListenableFuture zzd(zzbvk zzbvk, int i) {
        zzbog zzb2 = zzv.zzg().zzb(this.zza, VersionInfoParcel.forPackage(), this.zzf);
        if (!((Boolean) zzbex.zza.zze()).booleanValue()) {
            return zzgch.zzg(new Exception("Signal collection disabled."));
        }
        zzeuu zzr = this.zzd.zzr(zzbvk, i);
        zzetu zza2 = zzr.zza();
        zzbnw zza3 = zzb2.zza("google.afma.request.getSignals", zzbod.zza, zzbod.zzb);
        zzfgw zza4 = zzfgv.zza(this.zza, 22);
        zzfft zza5 = zzr.zzc().zzb(zzfgh.GET_SIGNALS, zzgch.zzh(zzbvk.zza)).zze(new zzfhc(zza4)).zzf(new zzdze(zza2, zzbvk)).zzb(zzfgh.JS_SIGNALS).zzf(zza3).zza();
        zzfhh zzd2 = zzr.zzd();
        zzd2.zzd(zzbvk.zza.getStringArrayList("ad_types"));
        zzd2.zzf(zzbvk.zza.getBundle("extras"));
        zzfhg.zzb(zza5, zzd2, zza4);
        if (((Boolean) zzbel.zzf.zze()).booleanValue()) {
            zzdzt zzdzt = this.zzc;
            Objects.requireNonNull(zzdzt);
            zza5.addListener(new zzdzb(zzdzt), this.zzb);
        }
        return zza5;
    }

    public final void zze(zzbvk zzbvk, zzbvc zzbvc) {
        zzq(zzb(zzbvk, Binder.getCallingUid()), zzbvc, zzbvk);
    }

    public final void zzf(zzbvk zzbvk, zzbvc zzbvc) {
        Bundle bundle;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzck)).booleanValue() && (bundle = zzbvk.zzm) != null) {
            bundle.putLong(zzdre.SERVICE_CONNECTED.zza(), zzv.zzC().currentTimeMillis());
        }
        zzq(zzd(zzbvk, Binder.getCallingUid()), zzbvc, zzbvk);
    }

    public final void zzg(zzbvk zzbvk, zzbvc zzbvc) {
        Bundle bundle;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzck)).booleanValue() && (bundle = zzbvk.zzm) != null) {
            bundle.putLong(zzdre.SERVICE_CONNECTED.zza(), zzv.zzC().currentTimeMillis());
        }
        ListenableFuture zzc2 = zzc(zzbvk, Binder.getCallingUid());
        zzq(zzc2, zzbvc, zzbvk);
        if (((Boolean) zzbel.zze.zze()).booleanValue()) {
            zzdzt zzdzt = this.zzc;
            Objects.requireNonNull(zzdzt);
            zzc2.addListener(new zzdzb(zzdzt), this.zzb);
        }
    }

    public final void zzh(String str, zzbvc zzbvc) {
        zzq(zzj(str), zzbvc, (zzbvk) null);
    }

    public final void zzi(zzbuu zzbuu, zzbvd zzbvd) {
        if (!((Boolean) zzbez.zza.zze()).booleanValue()) {
            try {
                zzbvd.zzf("", zzbuu);
            } catch (RemoteException e) {
                zze.zzb("Service can't call client", e);
            }
        } else {
            this.zzd.zzF();
            String str = zzbuu.zza;
            zzgch.zzr(zzgch.zzh((Object) null), new zzdzf(this, zzbvd, zzbuu), zzbzw.zzg);
        }
    }

    public final ListenableFuture zzj(String str) {
        if (!((Boolean) zzbes.zza.zze()).booleanValue()) {
            return zzgch.zzg(new Exception("Split request is disabled."));
        }
        zzdzg zzdzg = new zzdzg(this);
        if (zzl(str) == null) {
            return zzgch.zzg(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str))));
        }
        return zzgch.zzh(zzdzg);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ InputStream zzk(ListenableFuture listenableFuture, ListenableFuture listenableFuture2, zzbvk zzbvk, zzfgw zzfgw) throws Exception {
        String zze2 = ((zzbvm) listenableFuture.get()).zze();
        String str = zzbvk.zzh;
        zzo(new zzdzi((zzbvm) listenableFuture.get(), (JSONObject) listenableFuture2.get(), str, zze2, zzfgw));
        return new ByteArrayInputStream(zze2.getBytes(StandardCharsets.UTF_8));
    }
}
