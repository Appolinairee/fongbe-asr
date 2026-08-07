package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzt;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.client.zzx;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfiq {
    private final zzx zza;
    private final zzu zzb;
    private final zzgct zzc;
    private final zzfir zzd;

    public zzfiq(zzx zzx, zzu zzu, zzgct zzgct, zzfir zzfir) {
        this.zza = zzx;
        this.zzb = zzu;
        this.zzc = zzgct;
        this.zzd = zzfir;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzt zza(String str) throws Exception {
        return this.zzb.zza(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzt zzb(String str) throws Exception {
        return this.zzb.zza(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzc(int i, long j, String str, zzt zzt) throws Exception {
        if (zzt != zzt.RETRIABLE_FAILURE) {
            return zzgch.zzh(zzt);
        }
        zzx zzx = this.zza;
        long zzb2 = (long) zzx.zzb();
        if (i != 1) {
            zzb2 = (long) (zzx.zza() * ((double) j));
        }
        return zze(str, zzb2, i + 1);
    }

    public final ListenableFuture zzd(String str) {
        try {
            return zze(str, 0, 1);
        } catch (NullPointerException | RejectedExecutionException unused) {
            return zzgch.zzh(zzt.PERMANENT_FAILURE);
        }
    }

    private final ListenableFuture zze(String str, long j, int i) {
        String str2;
        zzx zzx = this.zza;
        if (i > zzx.zzc()) {
            zzfir zzfir = this.zzd;
            if (zzfir == null || !zzx.zzd()) {
                return zzgch.zzh(zzt.RETRIABLE_FAILURE);
            }
            zzfir.zza(str, "", 2);
            return zzgch.zzh(zzt.BUFFERED);
        }
        if (((Boolean) zzbe.zzc().zza(zzbcl.zziv)).booleanValue()) {
            Uri parse = Uri.parse(str);
            String encodedQuery = parse.getEncodedQuery();
            Uri.Builder clearQuery = parse.buildUpon().clearQuery();
            clearQuery.appendQueryParameter("pa", Integer.toString(i));
            str2 = String.valueOf(clearQuery.build()) + "&" + encodedQuery;
        } else {
            str2 = str;
        }
        zzfip zzfip = new zzfip(this, i, j, str);
        if (j == 0) {
            return zzgch.zzn(this.zzc.zzb(new zzfio(this, str2)), zzfip, this.zzc);
        }
        return zzgch.zzn(this.zzc.zzc(new zzfin(this, str2), j, TimeUnit.MILLISECONDS), zzfip, this.zzc);
    }
}
