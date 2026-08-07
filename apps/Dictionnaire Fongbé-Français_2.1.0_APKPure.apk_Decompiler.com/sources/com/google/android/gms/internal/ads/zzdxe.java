package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdxe implements zzdyg {
    /* access modifiers changed from: private */
    public static final Pattern zza = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzdwg zzb;
    private final zzgcs zzc;
    private final zzfcj zzd;
    private final ScheduledExecutorService zze;
    /* access modifiers changed from: private */
    public final zzeag zzf;
    private final zzfhh zzg;
    private final Context zzh;

    zzdxe(Context context, zzfcj zzfcj, zzdwg zzdwg, zzgcs zzgcs, ScheduledExecutorService scheduledExecutorService, zzeag zzeag, zzfhh zzfhh) {
        this.zzh = context;
        this.zzd = zzfcj;
        this.zzb = zzdwg;
        this.zzc = zzgcs;
        this.zze = scheduledExecutorService;
        this.zzf = zzeag;
        this.zzg = zzfhh;
    }

    public final ListenableFuture zzb(zzbvk zzbvk) {
        Context context = this.zzh;
        ListenableFuture zzc2 = this.zzb.zzc(zzbvk);
        zzfgw zza2 = zzfgv.zza(context, 11);
        zzfhg.zzd(zzc2, zza2);
        ListenableFuture zzn = zzgch.zzn(zzc2, new zzdxb(this), this.zzc);
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzfx)).booleanValue()) {
            zzbcc zzbcc = zzbcl.zzfy;
            Class<TimeoutException> cls = TimeoutException.class;
            zzn = zzgch.zzf(zzgch.zzo(zzn, (long) ((Integer) zzbe.zzc().zza(zzbcc)).intValue(), TimeUnit.SECONDS, this.zze), cls, new zzdxc(), zzbzw.zzg);
        }
        zzfhg.zza(zzn, this.zzg, zza2);
        zzgch.zzr(zzn, new zzdxd(this), zzbzw.zzg);
        return zzn;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzc(zzdyi zzdyi) throws Exception {
        return zzgch.zzh(new zzfca(new zzfbx(this.zzd), zzfbz.zza(new InputStreamReader(zzdyi.zzb()), zzdyi.zza())));
    }
}
