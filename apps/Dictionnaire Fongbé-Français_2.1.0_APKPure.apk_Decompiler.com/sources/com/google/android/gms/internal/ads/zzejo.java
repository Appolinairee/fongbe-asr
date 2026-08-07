package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbi;
import com.google.android.gms.ads.internal.client.zzbl;
import com.google.android.gms.ads.internal.client.zzbo;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.ads.internal.client.zzcc;
import com.google.android.gms.ads.internal.client.zzcm;
import com.google.android.gms.ads.internal.client.zzcq;
import com.google.android.gms.ads.internal.client.zzct;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzef;
import com.google.android.gms.ads.internal.client.zzga;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.client.zzy;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzejo extends zzbx {
    private final Context zza;
    private final zzbl zzb;
    private final zzfcj zzc;
    private final zzcom zzd;
    private final ViewGroup zze;
    private final zzdrw zzf;

    public zzejo(Context context, zzbl zzbl, zzfcj zzfcj, zzcom zzcom, zzdrw zzdrw) {
        this.zza = context;
        this.zzb = zzbl;
        this.zzc = zzfcj;
        this.zzd = zzcom;
        this.zzf = zzdrw;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View zzd2 = zzcom.zzd();
        zzv.zzq();
        frameLayout.addView(zzd2, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(zzg().zzc);
        frameLayout.setMinimumWidth(zzg().zzf);
        this.zze = frameLayout;
    }

    public final void zzA() throws RemoteException {
        this.zzd.zzh();
    }

    public final void zzB() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzn().zzc((Context) null);
    }

    public final void zzC(zzbi zzbi) throws RemoteException {
        zzo.zzi("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzD(zzbl zzbl) throws RemoteException {
        zzo.zzi("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzE(zzcc zzcc) throws RemoteException {
        zzo.zzi("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzF(zzs zzs) throws RemoteException {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        zzcom zzcom = this.zzd;
        if (zzcom != null) {
            zzcom.zzi(this.zze, zzs);
        }
    }

    public final void zzG(zzcm zzcm) throws RemoteException {
        zzekn zzekn = this.zzc.zzc;
        if (zzekn != null) {
            zzekn.zzm(zzcm);
        }
    }

    public final void zzH(zzbag zzbag) throws RemoteException {
    }

    public final void zzI(zzy zzy) throws RemoteException {
    }

    public final void zzJ(zzct zzct) {
    }

    public final void zzK(zzef zzef) throws RemoteException {
    }

    public final void zzL(boolean z) throws RemoteException {
    }

    public final void zzM(zzbtn zzbtn) throws RemoteException {
    }

    public final void zzN(boolean z) throws RemoteException {
        zzo.zzi("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzO(zzbdg zzbdg) throws RemoteException {
        zzo.zzi("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzP(zzdr zzdr) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzlt)).booleanValue()) {
            zzekn zzekn = this.zzc.zzc;
            if (zzekn != null) {
                try {
                    if (!zzdr.zzf()) {
                        this.zzf.zze();
                    }
                } catch (RemoteException e) {
                    zzo.zzf("Error in making CSI ping for reporting paid event callback", e);
                }
                zzekn.zzl(zzdr);
                return;
            }
            return;
        }
        zzo.zzi("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzQ(zzbtq zzbtq, String str) throws RemoteException {
    }

    public final void zzR(String str) throws RemoteException {
    }

    public final void zzS(zzbwc zzbwc) throws RemoteException {
    }

    public final void zzT(String str) throws RemoteException {
    }

    public final void zzU(zzga zzga) throws RemoteException {
        zzo.zzi("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    public final void zzX() throws RemoteException {
    }

    public final boolean zzY() throws RemoteException {
        zzcom zzcom = this.zzd;
        return zzcom != null && zzcom.zzs();
    }

    public final boolean zzZ() throws RemoteException {
        return false;
    }

    public final boolean zzaa() throws RemoteException {
        return false;
    }

    public final boolean zzab(zzm zzm) throws RemoteException {
        zzo.zzi("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    public final void zzac(zzcq zzcq) throws RemoteException {
        zzo.zzi("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    public final Bundle zzd() throws RemoteException {
        zzo.zzi("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    public final zzs zzg() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        return zzfcp.zza(this.zza, Collections.singletonList(this.zzd.zzf()));
    }

    public final zzbl zzi() throws RemoteException {
        return this.zzb;
    }

    public final zzcm zzj() throws RemoteException {
        return this.zzc.zzn;
    }

    public final zzdy zzk() {
        return this.zzd.zzm();
    }

    public final zzeb zzl() throws RemoteException {
        return this.zzd.zze();
    }

    public final IObjectWrapper zzn() throws RemoteException {
        return ObjectWrapper.wrap(this.zze);
    }

    public final String zzr() throws RemoteException {
        return this.zzc.zzf;
    }

    public final String zzs() throws RemoteException {
        if (this.zzd.zzm() != null) {
            return this.zzd.zzm().zzg();
        }
        return null;
    }

    public final String zzt() throws RemoteException {
        if (this.zzd.zzm() != null) {
            return this.zzd.zzm().zzg();
        }
        return null;
    }

    public final void zzx() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzb();
    }

    public final void zzy(zzm zzm, zzbo zzbo) {
    }

    public final void zzz() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzn().zzb((Context) null);
    }
}
