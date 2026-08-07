package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzenl implements zzetr {
    final Context zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final zzcsp zze;
    private final zzfdq zzf;
    private final zzfcj zzg;
    private final zzg zzh = zzv.zzp().zzi();
    private final zzdrq zzi;
    private final zzctc zzj;

    public zzenl(Context context, String str, String str2, zzcsp zzcsp, zzfdq zzfdq, zzfcj zzfcj, zzdrq zzdrq, zzctc zzctc, long j) {
        this.zza = context;
        this.zzb = str;
        this.zzc = str2;
        this.zze = zzcsp;
        this.zzf = zzfdq;
        this.zzg = zzfcj;
        this.zzi = zzdrq;
        this.zzj = zzctc;
        this.zzd = j;
    }

    public final int zza() {
        return 12;
    }

    public final ListenableFuture zzb() {
        String str;
        Bundle bundle = new Bundle();
        this.zzi.zzb().put("seq_num", this.zzb);
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzck)).booleanValue()) {
            this.zzi.zzc("tsacc", String.valueOf(zzv.zzC().currentTimeMillis() - this.zzd));
            zzdrq zzdrq = this.zzi;
            zzv.zzq();
            if (true != zzs.zzH(this.zza)) {
                str = "1";
            } else {
                str = "0";
            }
            zzdrq.zzc("foreground", str);
        }
        this.zze.zzk(this.zzg.zzd);
        bundle.putAll(this.zzf.zzb());
        Context context = this.zza;
        String str2 = this.zzb;
        String str3 = this.zzc;
        zzg zzg2 = this.zzh;
        zzfcj zzfcj = this.zzg;
        return zzgch.zzh(new zzenm(context, bundle, str2, str3, zzg2, zzfcj.zzf, this.zzj));
    }
}
