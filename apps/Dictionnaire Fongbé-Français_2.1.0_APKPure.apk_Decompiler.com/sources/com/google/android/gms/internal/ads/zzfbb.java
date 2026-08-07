package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfbb implements zzeld {
    private final Context zza;
    /* access modifiers changed from: private */
    public final Executor zzb;
    private final zzcgx zzc;
    /* access modifiers changed from: private */
    public final zzfar zzd;
    /* access modifiers changed from: private */
    public final zzezf zze;
    private final zzfcb zzf;
    /* access modifiers changed from: private */
    public final zzfhk zzg;
    private final zzfch zzh;
    private ListenableFuture zzi;

    public zzfbb(Context context, Executor executor, zzcgx zzcgx, zzezf zzezf, zzfar zzfar, zzfch zzfch, zzfcb zzfcb) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcgx;
        this.zze = zzezf;
        this.zzd = zzfar;
        this.zzh = zzfch;
        this.zzf = zzfcb;
        this.zzg = zzcgx.zzz();
    }

    /* access modifiers changed from: private */
    public final zzdoe zzk(zzezd zzezd) {
        zzdoe zzi2 = this.zzc.zzi();
        zzcva zzcva = new zzcva();
        zzcva.zzf(this.zza);
        zzcva.zzk(((zzfaz) zzezd).zza);
        zzcva.zzj(this.zzf);
        zzi2.zzd(zzcva.zzl());
        zzi2.zzc(new zzdbk().zzn());
        return zzi2;
    }

    public final boolean zza() {
        throw null;
    }

    public final boolean zzb(zzm zzm, String str, zzelb zzelb, zzelc zzelc) throws RemoteException {
        zzfhh zzfhh;
        zzbwd zzbwd = new zzbwd(zzm, str);
        zzfat zzfat = (zzfat) zzelb;
        if (zzbwd.zzb == null) {
            zzo.zzg("Ad unit ID should not be null for rewarded video ad.");
            this.zzb.execute(new zzfau(this));
            return false;
        }
        ListenableFuture listenableFuture = this.zzi;
        if (listenableFuture != null && !listenableFuture.isDone()) {
            return false;
        }
        if (((Boolean) zzbee.zzc.zze()).booleanValue()) {
            zzezf zzezf = this.zze;
            if (zzezf.zzd() != null) {
                zzfhh zzh2 = ((zzdof) zzezf.zzd()).zzh();
                zzh2.zzi(5);
                zzh2.zzb(zzbwd.zza.zzp);
                zzh2.zzf(zzbwd.zza.zzm);
                zzfhh = zzh2;
                zzfdg.zza(this.zza, zzbwd.zza.zzf);
                if (((Boolean) zzbe.zzc().zza(zzbcl.zziN)).booleanValue() && zzbwd.zza.zzf) {
                    this.zzc.zzl().zzo(true);
                }
                Bundle zza2 = zzdrg.zza(new Pair(zzdre.PUBLIC_API_CALL.zza(), Long.valueOf(zzbwd.zza.zzz)), new Pair(zzdre.DYNAMITE_ENTER.zza(), Long.valueOf(zzv.zzC().currentTimeMillis())));
                zzfch zzfch = this.zzh;
                zzfch.zzt(zzbwd.zzb);
                zzfch.zzs(zzs.zzd());
                zzfch.zzH(zzbwd.zza);
                zzfch.zzA(zza2);
                Context context = this.zza;
                zzfcj zzJ = zzfch.zzJ();
                zzfgw zzb2 = zzfgv.zzb(context, zzfhg.zzf(zzJ), 5, zzbwd.zza);
                zzfaz zzfaz = new zzfaz((zzfba) null);
                zzfaz.zza = zzJ;
                ListenableFuture zzc2 = this.zze.zzc(new zzezg(zzfaz, (zzbvk) null), new zzfav(this), (Object) null);
                this.zzi = zzc2;
                zzgch.zzr(zzc2, new zzfay(this, zzelc, zzfhh, zzb2, zzfaz), this.zzb);
                return true;
            }
        }
        zzfhh = null;
        zzfdg.zza(this.zza, zzbwd.zza.zzf);
        this.zzc.zzl().zzo(true);
        Bundle zza22 = zzdrg.zza(new Pair(zzdre.PUBLIC_API_CALL.zza(), Long.valueOf(zzbwd.zza.zzz)), new Pair(zzdre.DYNAMITE_ENTER.zza(), Long.valueOf(zzv.zzC().currentTimeMillis())));
        zzfch zzfch2 = this.zzh;
        zzfch2.zzt(zzbwd.zzb);
        zzfch2.zzs(zzs.zzd());
        zzfch2.zzH(zzbwd.zza);
        zzfch2.zzA(zza22);
        Context context2 = this.zza;
        zzfcj zzJ2 = zzfch2.zzJ();
        zzfgw zzb22 = zzfgv.zzb(context2, zzfhg.zzf(zzJ2), 5, zzbwd.zza);
        zzfaz zzfaz2 = new zzfaz((zzfba) null);
        zzfaz2.zza = zzJ2;
        ListenableFuture zzc22 = this.zze.zzc(new zzezg(zzfaz2, (zzbvk) null), new zzfav(this), (Object) null);
        this.zzi = zzc22;
        zzgch.zzr(zzc22, new zzfay(this, zzelc, zzfhh, zzb22, zzfaz2), this.zzb);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzi() {
        this.zzd.zzdz(zzfdk.zzd(6, (String) null, (zze) null));
    }

    /* access modifiers changed from: package-private */
    public final void zzj(int i) {
        this.zzh.zzp().zza(i);
    }
}
