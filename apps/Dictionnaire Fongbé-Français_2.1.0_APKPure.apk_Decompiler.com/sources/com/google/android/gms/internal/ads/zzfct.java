package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzfct implements zzgcd {
    final /* synthetic */ zzcex zza;
    final /* synthetic */ zzcmk zzb;
    final /* synthetic */ zzfja zzc;
    final /* synthetic */ zzebk zzd;

    zzfct(zzcex zzcex, zzcmk zzcmk, zzfja zzfja, zzebk zzebk) {
        this.zza = zzcex;
        this.zzb = zzcmk;
        this.zzc = zzfja;
        this.zzd = zzebk;
    }

    public final void zza(Throwable th) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        zzfbo zzD = this.zza.zzD();
        if (zzD == null || zzD.zzai) {
            zzfbr zzR = this.zza.zzR();
            if (zzR == null) {
                zzv.zzp().zzw(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingClickGmsgHandler");
                return;
            }
            long currentTimeMillis = zzv.zzC().currentTimeMillis();
            boolean zzA = zzv.zzp().zzA(this.zza.getContext());
            boolean z = false;
            boolean z2 = ((Boolean) zzbe.zzc().zza(zzbcl.zzgd)).booleanValue() && zzD != null && zzD.zzS;
            if (!(zzD == null || zzD.zzad == null)) {
                z = true;
            }
            this.zzd.zzd(new zzebm(currentTimeMillis, zzR.zzb, str, (zzA || z2 || z) ? 2 : 1));
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzv zzv = zzD.zzax;
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzjT)).booleanValue() || this.zzb == null || !zzcmk.zzj(str)) {
            this.zzc.zzd(str, zzv, (zzfhh) null);
        } else {
            this.zzb.zzi(str, this.zzc, zzbc.zze(), zzv);
        }
    }
}
