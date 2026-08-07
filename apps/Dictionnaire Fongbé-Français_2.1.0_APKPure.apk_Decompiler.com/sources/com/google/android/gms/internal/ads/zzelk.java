package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzcm;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzelk implements zzeld {
    private final zzfch zza;
    /* access modifiers changed from: private */
    public final zzcgx zzb;
    private final Context zzc;
    /* access modifiers changed from: private */
    public final zzela zzd;
    /* access modifiers changed from: private */
    public final zzfhk zze;
    private zzcro zzf;

    public zzelk(zzcgx zzcgx, Context context, zzela zzela, zzfch zzfch) {
        this.zzb = zzcgx;
        this.zzc = context;
        this.zzd = zzela;
        this.zza = zzfch;
        this.zze = zzcgx.zzz();
        zzfch.zzv(zzela.zzd());
    }

    public final boolean zza() {
        zzcro zzcro = this.zzf;
        return zzcro != null && zzcro.zzf();
    }

    public final boolean zzb(zzm zzm, String str, zzelb zzelb, zzelc zzelc) throws RemoteException {
        zzfhh zzfhh;
        zzv.zzq();
        if (zzs.zzI(this.zzc) && zzm.zzs == null) {
            zzo.zzg("Failed to load the ad because app ID is missing.");
            this.zzb.zzC().execute(new zzelf(this));
            return false;
        } else if (str == null) {
            zzo.zzg("Ad unit ID should not be null for NativeAdLoader.");
            this.zzb.zzC().execute(new zzelg(this));
            return false;
        } else {
            zzfdg.zza(this.zzc, zzm.zzf);
            if (((Boolean) zzbe.zzc().zza(zzbcl.zziN)).booleanValue() && zzm.zzf) {
                this.zzb.zzl().zzo(true);
            }
            int i = ((zzele) zzelb).zza;
            long currentTimeMillis = zzv.zzC().currentTimeMillis();
            String zza2 = zzdre.PUBLIC_API_CALL.zza();
            Long valueOf = Long.valueOf(currentTimeMillis);
            Bundle zza3 = zzdrg.zza(new Pair(zza2, valueOf), new Pair(zzdre.DYNAMITE_ENTER.zza(), valueOf));
            zzfch zzfch = this.zza;
            zzfch.zzH(zzm);
            zzfch.zzA(zza3);
            zzfch.zzC(i);
            Context context = this.zzc;
            zzfcj zzJ = zzfch.zzJ();
            zzfgw zzb2 = zzfgv.zzb(context, zzfhg.zzf(zzJ), 8, zzm);
            zzcm zzcm = zzJ.zzn;
            if (zzcm != null) {
                this.zzd.zzd().zzm(zzcm);
            }
            zzdgp zzh = this.zzb.zzh();
            zzcva zzcva = new zzcva();
            zzcva.zzf(this.zzc);
            zzcva.zzk(zzJ);
            zzh.zzf(zzcva.zzl());
            zzdbk zzdbk = new zzdbk();
            zzdbk.zzk(this.zzd.zzd(), this.zzb.zzC());
            zzh.zze(zzdbk.zzn());
            zzh.zzd(this.zzd.zzc());
            zzh.zzc(new zzcoj((ViewGroup) null));
            zzdgq zzg = zzh.zzg();
            if (((Boolean) zzbee.zzc.zze()).booleanValue()) {
                zzfhh zzf2 = zzg.zzf();
                zzf2.zzi(8);
                zzf2.zzb(zzm.zzp);
                zzf2.zzf(zzm.zzm);
                zzfhh = zzf2;
            } else {
                zzfhh = null;
            }
            this.zzb.zzy().zzc(1);
            zzcgx zzcgx = this.zzb;
            zzgcs zzc2 = zzffh.zzc();
            ScheduledExecutorService zzD = zzcgx.zzD();
            zzcsd zza4 = zzg.zza();
            zzcro zzcro = new zzcro(zzc2, zzD, zza4.zzh(zza4.zzi()));
            this.zzf = zzcro;
            zzcro.zze(new zzelj(this, zzelc, zzfhh, zzb2, zzg));
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf() {
        this.zzd.zza().zzdz(zzfdk.zzd(4, (String) null, (zze) null));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzg() {
        this.zzd.zza().zzdz(zzfdk.zzd(6, (String) null, (zze) null));
    }
}
