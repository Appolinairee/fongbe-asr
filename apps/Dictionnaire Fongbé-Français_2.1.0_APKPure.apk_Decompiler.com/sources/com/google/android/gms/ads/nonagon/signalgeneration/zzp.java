package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbeq;
import com.google.android.gms.internal.ads.zzdrq;
import com.google.android.gms.internal.ads.zzdsb;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzp extends QueryInfoGenerationCallback {
    private final zzo zza;
    private final zzdsb zzb;
    private final boolean zzc;
    private final int zzd;
    private final long zze = zzv.zzC().currentTimeMillis();
    private final Boolean zzf;

    public zzp(zzo zzo, boolean z, int i, Boolean bool, zzdsb zzdsb) {
        this.zza = zzo;
        this.zzc = z;
        this.zzd = i;
        this.zzf = bool;
        this.zzb = zzdsb;
    }

    private static long zza() {
        return zzv.zzC().currentTimeMillis() + ((Long) zzbeq.zzf.zze()).longValue();
    }

    private final long zzb() {
        return zzv.zzC().currentTimeMillis() - this.zze;
    }

    public final void onFailure(String str) {
        String str2;
        Pair pair = new Pair("sgf_reason", str);
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", AdFormat.BANNER.name());
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        Pair pair6 = new Pair("lat_ms", Long.toString(zzb()));
        Pair pair7 = new Pair("sgpc_rn", Integer.toString(this.zzd));
        Pair pair8 = new Pair("sgpc_lsu", String.valueOf(this.zzf));
        if (true != this.zzc) {
            str2 = "0";
        } else {
            str2 = "1";
        }
        zzaa.zzd(this.zzb, (zzdrq) null, "sgpcf", pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair("tpc", str2));
        this.zza.zzf(this.zzc, new zzq((QueryInfo) null, str, zza(), this.zzd));
    }

    public final void onSuccess(QueryInfo queryInfo) {
        String str;
        Pair pair = new Pair("se", "query_g");
        Pair pair2 = new Pair("ad_format", AdFormat.BANNER.name());
        Pair pair3 = new Pair("rtype", Integer.toString(6));
        Pair pair4 = new Pair("scar", "true");
        Pair pair5 = new Pair("lat_ms", Long.toString(zzb()));
        Pair pair6 = new Pair("sgpc_rn", Integer.toString(this.zzd));
        Pair pair7 = new Pair("sgpc_lsu", String.valueOf(this.zzf));
        if (true != this.zzc) {
            str = "0";
        } else {
            str = "1";
        }
        zzaa.zzd(this.zzb, (zzdrq) null, "sgpcs", pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair("tpc", str));
        this.zza.zzf(this.zzc, new zzq(queryInfo, "", zza(), this.zzd));
    }
}
