package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.client.zzy;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.internal.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public abstract class zzeww implements zzeld {
    protected final zzcgx zza;
    private final Context zzb;
    /* access modifiers changed from: private */
    public final Executor zzc;
    /* access modifiers changed from: private */
    public final zzexm zzd;
    /* access modifiers changed from: private */
    public final zzezf zze;
    private final VersionInfoParcel zzf;
    private final ViewGroup zzg;
    /* access modifiers changed from: private */
    public final zzfhk zzh;
    private final zzfch zzi;
    /* access modifiers changed from: private */
    @Nullable
    public ListenableFuture zzj;

    protected zzeww(Context context, Executor executor, zzcgx zzcgx, zzezf zzezf, zzexm zzexm, zzfch zzfch, VersionInfoParcel versionInfoParcel) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzcgx;
        this.zze = zzezf;
        this.zzd = zzexm;
        this.zzi = zzfch;
        this.zzf = versionInfoParcel;
        this.zzg = new FrameLayout(context);
        this.zzh = zzcgx.zzz();
    }

    /* access modifiers changed from: private */
    public final synchronized zzcuy zzm(zzezd zzezd) {
        zzewu zzewu = (zzewu) zzezd;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzia)).booleanValue()) {
            zzcoj zzcoj = new zzcoj(this.zzg);
            zzcva zzcva = new zzcva();
            zzcva.zzf(this.zzb);
            zzcva.zzk(zzewu.zza);
            zzcvc zzl = zzcva.zzl();
            zzdbk zzdbk = new zzdbk();
            zzdbk.zzc(this.zzd, this.zzc);
            zzdbk.zzl(this.zzd, this.zzc);
            return zze(zzcoj, zzl, zzdbk.zzn());
        }
        zzexm zzi2 = zzexm.zzi(this.zzd);
        zzdbk zzdbk2 = new zzdbk();
        zzdbk2.zzb(zzi2, this.zzc);
        zzdbk2.zzg(zzi2, this.zzc);
        zzdbk2.zzh(zzi2, this.zzc);
        zzdbk2.zzi(zzi2, this.zzc);
        zzdbk2.zzc(zzi2, this.zzc);
        zzdbk2.zzl(zzi2, this.zzc);
        zzdbk2.zzm(zzi2);
        zzcoj zzcoj2 = new zzcoj(this.zzg);
        zzcva zzcva2 = new zzcva();
        zzcva2.zzf(this.zzb);
        zzcva2.zzk(zzewu.zza);
        return zze(zzcoj2, zzcva2.zzl(), zzdbk2.zzn());
    }

    public final boolean zza() {
        ListenableFuture listenableFuture = this.zzj;
        return listenableFuture != null && !listenableFuture.isDone();
    }

    public final synchronized boolean zzb(zzm zzm, String str, zzelb zzelb, zzelc zzelc) throws RemoteException {
        zzfhh zzfhh;
        zzcnw zzcnw;
        boolean z;
        if (!zzm.zzb()) {
            if (((Boolean) zzbej.zzd.zze()).booleanValue()) {
                if (((Boolean) zzbe.zzc().zza(zzbcl.zzla)).booleanValue()) {
                    z = true;
                    if (this.zzf.clientJarVersion < ((Integer) zzbe.zzc().zza(zzbcl.zzlb)).intValue() || !z) {
                        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
                    }
                }
            }
            z = false;
            Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        }
        if (str == null) {
            zzo.zzg("Ad unit ID should not be null for app open ad.");
            this.zzc.execute(new zzewq(this));
            return false;
        } else if (this.zzj != null) {
            return false;
        } else {
            if (!((Boolean) zzbee.zzc.zze()).booleanValue() || (zzcnw = (zzcnw) this.zze.zzd()) == null) {
                zzfhh = null;
            } else {
                zzfhh zzh2 = zzcnw.zzh();
                zzh2.zzi(7);
                zzh2.zzb(zzm.zzp);
                zzh2.zzf(zzm.zzm);
                zzfhh = zzh2;
            }
            zzfdg.zza(this.zzb, zzm.zzf);
            if (((Boolean) zzbe.zzc().zza(zzbcl.zziN)).booleanValue() && zzm.zzf) {
                this.zza.zzl().zzo(true);
            }
            Bundle zza2 = zzdrg.zza(new Pair(zzdre.PUBLIC_API_CALL.zza(), Long.valueOf(zzm.zzz)), new Pair(zzdre.DYNAMITE_ENTER.zza(), Long.valueOf(zzv.zzC().currentTimeMillis())));
            zzfch zzfch = this.zzi;
            zzfch.zzt(str);
            zzfch.zzs(zzs.zzb());
            zzfch.zzH(zzm);
            zzfch.zzA(zza2);
            Context context = this.zzb;
            zzfcj zzJ = zzfch.zzJ();
            zzfgw zzb2 = zzfgv.zzb(context, zzfhg.zzf(zzJ), 7, zzm);
            zzewu zzewu = new zzewu((zzewv) null);
            zzewu.zza = zzJ;
            ListenableFuture zzc2 = this.zze.zzc(new zzezg(zzewu, (zzbvk) null), new zzewr(this), (Object) null);
            this.zzj = zzc2;
            zzgch.zzr(zzc2, new zzewt(this, zzelc, zzfhh, zzb2, zzewu), this.zzc);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public abstract zzcuy zze(zzcoj zzcoj, zzcvc zzcvc, zzdbm zzdbm);

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzk() {
        this.zzd.zzdz(zzfdk.zzd(6, (String) null, (zze) null));
    }

    public final void zzl(zzy zzy) {
        this.zzi.zzu(zzy);
    }
}
