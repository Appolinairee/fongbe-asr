package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
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
public final class zzezr implements zzeld {
    private final Context zza;
    /* access modifiers changed from: private */
    public final Executor zzb;
    private final zzcgx zzc;
    /* access modifiers changed from: private */
    public final zzekn zzd;
    /* access modifiers changed from: private */
    public final zzfar zze;
    private zzbdg zzf;
    /* access modifiers changed from: private */
    public final zzfhk zzg;
    private final zzfch zzh;
    /* access modifiers changed from: private */
    public ListenableFuture zzi;

    public zzezr(Context context, Executor executor, zzcgx zzcgx, zzekn zzekn, zzfar zzfar, zzfch zzfch) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzcgx;
        this.zzd = zzekn;
        this.zzh = zzfch;
        this.zze = zzfar;
        this.zzg = zzcgx.zzz();
    }

    public final boolean zza() {
        ListenableFuture listenableFuture = this.zzi;
        return listenableFuture != null && !listenableFuture.isDone();
    }

    public final boolean zzb(zzm zzm, String str, zzelb zzelb, zzelc zzelc) {
        zzdfu zzf2;
        zzfhh zzfhh;
        if (str == null) {
            zzo.zzg("Ad unit ID should not be null for interstitial ad.");
            this.zzb.execute(new zzezl(this));
            return false;
        } else if (zza()) {
            return false;
        } else {
            if (((Boolean) zzbe.zzc().zza(zzbcl.zziN)).booleanValue() && zzm.zzf) {
                this.zzc.zzl().zzo(true);
            }
            zzs zzs = ((zzezk) zzelb).zza;
            Bundle zza2 = zzdrg.zza(new Pair(zzdre.PUBLIC_API_CALL.zza(), Long.valueOf(zzm.zzz)), new Pair(zzdre.DYNAMITE_ENTER.zza(), Long.valueOf(zzv.zzC().currentTimeMillis())));
            zzfch zzfch = this.zzh;
            zzfch.zzt(str);
            zzfch.zzs(zzs);
            zzfch.zzH(zzm);
            zzfch.zzA(zza2);
            Context context = this.zza;
            zzfcj zzJ = zzfch.zzJ();
            zzfgw zzb2 = zzfgv.zzb(context, zzfhg.zzf(zzJ), 4, zzm);
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzib)).booleanValue()) {
                zzdft zzg2 = this.zzc.zzg();
                zzcva zzcva = new zzcva();
                zzcva.zzf(this.zza);
                zzcva.zzk(zzJ);
                zzg2.zze(zzcva.zzl());
                zzdbk zzdbk = new zzdbk();
                zzdbk.zzj(this.zzd, this.zzb);
                zzdbk.zzk(this.zzd, this.zzb);
                zzg2.zzd(zzdbk.zzn());
                zzg2.zzc(new zzeiw(this.zzf));
                zzf2 = zzg2.zzf();
            } else {
                zzdbk zzdbk2 = new zzdbk();
                zzfar zzfar = this.zze;
                if (zzfar != null) {
                    zzdbk2.zze(zzfar, this.zzb);
                    zzdbk2.zzf(this.zze, this.zzb);
                    zzdbk2.zzb(this.zze, this.zzb);
                }
                zzdft zzg3 = this.zzc.zzg();
                zzcva zzcva2 = new zzcva();
                zzcva2.zzf(this.zza);
                zzcva2.zzk(zzJ);
                zzg3.zze(zzcva2.zzl());
                zzdbk2.zzj(this.zzd, this.zzb);
                zzdbk2.zze(this.zzd, this.zzb);
                zzdbk2.zzf(this.zzd, this.zzb);
                zzdbk2.zzb(this.zzd, this.zzb);
                zzdbk2.zza(this.zzd, this.zzb);
                zzdbk2.zzl(this.zzd, this.zzb);
                zzdbk2.zzk(this.zzd, this.zzb);
                zzdbk2.zzi(this.zzd, this.zzb);
                zzdbk2.zzc(this.zzd, this.zzb);
                zzg3.zzd(zzdbk2.zzn());
                zzg3.zzc(new zzeiw(this.zzf));
                zzf2 = zzg3.zzf();
            }
            zzdfu zzdfu = zzf2;
            if (((Boolean) zzbee.zzc.zze()).booleanValue()) {
                zzfhh zzf3 = zzdfu.zzf();
                zzf3.zzi(4);
                zzf3.zzb(zzm.zzp);
                zzf3.zzf(zzm.zzm);
                zzfhh = zzf3;
            } else {
                zzfhh = null;
            }
            zzcsd zza3 = zzdfu.zza();
            ListenableFuture zzh2 = zza3.zzh(zza3.zzi());
            this.zzi = zzh2;
            zzgch.zzr(zzh2, new zzezq(this, zzelc, zzfhh, zzb2, zzdfu), this.zzb);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzh() {
        this.zzd.zzdz(zzfdk.zzd(6, (String) null, (zze) null));
    }

    public final void zzi(zzbdg zzbdg) {
        this.zzf = zzbdg;
    }
}
