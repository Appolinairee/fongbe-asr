package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.InputEvent;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzv;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcmk {
    zzbuj zza;
    zzbuj zzb;
    /* access modifiers changed from: private */
    public final Context zzc;
    private final zzg zzd;
    private final zzecs zze;
    private final zzdpb zzf;
    /* access modifiers changed from: private */
    public final zzgcs zzg;
    private final Executor zzh;
    private final ScheduledExecutorService zzi;

    zzcmk(Context context, zzg zzg2, zzecs zzecs, zzdpb zzdpb, zzgcs zzgcs, zzgcs zzgcs2, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = context;
        this.zzd = zzg2;
        this.zze = zzecs;
        this.zzf = zzdpb;
        this.zzg = zzgcs;
        this.zzh = zzgcs2;
        this.zzi = scheduledExecutorService;
    }

    public static boolean zzj(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) zzbe.zzc().zza(zzbcl.zzka));
    }

    private final ListenableFuture zzk(String str, InputEvent inputEvent, Random random) {
        try {
            if (!str.contains((CharSequence) zzbe.zzc().zza(zzbcl.zzka)) || this.zzd.zzN()) {
                return zzgch.zzh(str);
            }
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            long nextInt = (long) random.nextInt(Integer.MAX_VALUE);
            buildUpon.appendQueryParameter((String) zzbe.zzc().zza(zzbcl.zzkb), String.valueOf(nextInt));
            if (inputEvent != null) {
                return (zzgby) zzgch.zzf((zzgby) zzgch.zzn(zzgby.zzu(this.zze.zza()), new zzcme(this, buildUpon, str, inputEvent), this.zzh), Throwable.class, new zzcmf(this, buildUpon), this.zzg);
            }
            buildUpon.appendQueryParameter((String) zzbe.zzc().zza(zzbcl.zzkc), "11");
            return zzgch.zzh(buildUpon.toString());
        } catch (Exception e) {
            return zzgch.zzg(e);
        }
    }

    public final ListenableFuture zzb(String str, Random random) {
        if (TextUtils.isEmpty(str)) {
            return zzgch.zzh(str);
        }
        return zzgch.zzf(zzk(str, this.zzf.zza(), random), Throwable.class, new zzcmb(this, str), this.zzg);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzc(String str, Throwable th) throws Exception {
        this.zzg.zza(new zzcmd(this, th));
        return zzgch.zzh(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzd(Uri.Builder builder, String str, InputEvent inputEvent, Integer num) throws Exception {
        if (num.intValue() == 1) {
            Uri.Builder buildUpon = builder.build().buildUpon();
            buildUpon.appendQueryParameter((String) zzbe.zzc().zza(zzbcl.zzkd), "1");
            buildUpon.appendQueryParameter((String) zzbe.zzc().zza(zzbcl.zzkc), "12");
            if (str.contains((CharSequence) zzbe.zzc().zza(zzbcl.zzke))) {
                buildUpon.authority((String) zzbe.zzc().zza(zzbcl.zzkf));
            }
            return (zzgby) zzgch.zzn(zzgby.zzu(this.zze.zzb(buildUpon.build(), inputEvent)), new zzcmg(builder), this.zzh);
        }
        builder.appendQueryParameter((String) zzbe.zzc().zza(zzbcl.zzkc), "10");
        return zzgch.zzh(builder.toString());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zze(Uri.Builder builder, Throwable th) throws Exception {
        this.zzg.zza(new zzcmc(this, th));
        builder.appendQueryParameter((String) zzbe.zzc().zza(zzbcl.zzkc), "9");
        return zzgch.zzh(builder.toString());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(Throwable th) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzkh)).booleanValue()) {
            zzbuj zzc2 = zzbuh.zzc(this.zzc);
            this.zzb = zzc2;
            zzc2.zzh(th, "AttributionReporting.getUpdatedUrlAndRegisterSource");
            return;
        }
        zzbuj zza2 = zzbuh.zza(this.zzc);
        this.zza = zza2;
        zza2.zzh(th, "AttributionReportingSampled.getUpdatedUrlAndRegisterSource");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzh(Throwable th) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzkh)).booleanValue()) {
            zzbuj zzc2 = zzbuh.zzc(this.zzc);
            this.zzb = zzc2;
            zzc2.zzh(th, "AttributionReporting");
            return;
        }
        zzbuj zza2 = zzbuh.zza(this.zzc);
        this.zza = zza2;
        zza2.zzh(th, "AttributionReportingSampled");
    }

    public final void zzi(String str, zzfja zzfja, Random random, zzv zzv) {
        if (!TextUtils.isEmpty(str)) {
            ListenableFuture zzk = zzk(str, this.zzf.zza(), random);
            zzbcc zzbcc = zzbcl.zzkg;
            zzgch.zzr(zzgch.zzo(zzk, (long) ((Integer) zzbe.zzc().zza(zzbcc)).intValue(), TimeUnit.MILLISECONDS, this.zzi), new zzcmj(this, zzfja, str, zzv), this.zzg);
        }
    }
}
