package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeur implements zzetr {
    private final Context zza;
    private final ScheduledExecutorService zzb;
    private final Executor zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final zzbzd zzg;

    zzeur(zzbzd zzbzd, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, boolean z, boolean z2) {
        this.zzg = zzbzd;
        this.zza = context;
        this.zzb = scheduledExecutorService;
        this.zzc = executor;
        this.zzd = i;
        this.zze = z;
        this.zzf = z2;
    }

    public final int zza() {
        return 40;
    }

    public final ListenableFuture zzb() {
        return (zzgby) zzgch.zze((zzgby) zzgch.zzo((zzgby) zzgch.zzm(zzgby.zzu(this.zzg.zza(this.zza, this.zzd)), new zzeup(this), this.zzc), ((Long) zzbe.zzc().zza(zzbcl.zzbe)).longValue(), TimeUnit.MILLISECONDS, this.zzb), Throwable.class, new zzeuq(this), this.zzc);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0065, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0068, code lost:
        com.google.android.gms.ads.internal.zzv.zzp().zzw(r0, "AdIdInfoSignalSource.getPaidV1");
        r0 = new com.google.android.gms.internal.ads.zzfra();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdj)).booleanValue() == false) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002f, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdk)).booleanValue() != false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r0 = com.google.android.gms.internal.ads.zzfre.zzj(r7.zza).zzi((java.lang.String) java.util.Objects.requireNonNull(((com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) java.util.Objects.requireNonNull(r8)).getId()), r7.zza.getPackageName(), ((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdp)).longValue(), r7.zzf);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzeus zzc(com.google.android.gms.ads.identifier.AdvertisingIdClient.Info r8) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzfra r0 = new com.google.android.gms.internal.ads.zzfra
            r0.<init>()
            boolean r1 = r7.zze
            if (r1 != 0) goto L_0x001b
            com.google.android.gms.internal.ads.zzbcc r1 = com.google.android.gms.internal.ads.zzbcl.zzdj
            com.google.android.gms.internal.ads.zzbcj r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0031
        L_0x001b:
            boolean r1 = r7.zze
            if (r1 == 0) goto L_0x0076
            com.google.android.gms.internal.ads.zzbcc r1 = com.google.android.gms.internal.ads.zzbcl.zzdk
            com.google.android.gms.internal.ads.zzbcj r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zza(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0076
        L_0x0031:
            android.content.Context r0 = r7.zza     // Catch:{ IOException -> 0x0067, IllegalArgumentException -> 0x0065 }
            com.google.android.gms.internal.ads.zzfre r1 = com.google.android.gms.internal.ads.zzfre.zzj(r0)     // Catch:{ IOException -> 0x0067, IllegalArgumentException -> 0x0065 }
            java.lang.Object r0 = java.util.Objects.requireNonNull(r8)     // Catch:{ IOException -> 0x0067, IllegalArgumentException -> 0x0065 }
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r0 = (com.google.android.gms.ads.identifier.AdvertisingIdClient.Info) r0     // Catch:{ IOException -> 0x0067, IllegalArgumentException -> 0x0065 }
            java.lang.String r0 = r0.getId()     // Catch:{ IOException -> 0x0067, IllegalArgumentException -> 0x0065 }
            java.lang.Object r0 = java.util.Objects.requireNonNull(r0)     // Catch:{ IOException -> 0x0067, IllegalArgumentException -> 0x0065 }
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ IOException -> 0x0067, IllegalArgumentException -> 0x0065 }
            android.content.Context r0 = r7.zza     // Catch:{ IOException -> 0x0067, IllegalArgumentException -> 0x0065 }
            java.lang.String r3 = r0.getPackageName()     // Catch:{ IOException -> 0x0067, IllegalArgumentException -> 0x0065 }
            com.google.android.gms.internal.ads.zzbcc r0 = com.google.android.gms.internal.ads.zzbcl.zzdp     // Catch:{ IOException -> 0x0067, IllegalArgumentException -> 0x0065 }
            com.google.android.gms.internal.ads.zzbcj r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ IOException -> 0x0067, IllegalArgumentException -> 0x0065 }
            java.lang.Object r0 = r4.zza(r0)     // Catch:{ IOException -> 0x0067, IllegalArgumentException -> 0x0065 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ IOException -> 0x0067, IllegalArgumentException -> 0x0065 }
            long r4 = r0.longValue()     // Catch:{ IOException -> 0x0067, IllegalArgumentException -> 0x0065 }
            boolean r6 = r7.zzf     // Catch:{ IOException -> 0x0067, IllegalArgumentException -> 0x0065 }
            com.google.android.gms.internal.ads.zzfra r0 = r1.zzi(r2, r3, r4, r6)     // Catch:{ IOException -> 0x0067, IllegalArgumentException -> 0x0065 }
            goto L_0x0076
        L_0x0065:
            r0 = move-exception
            goto L_0x0068
        L_0x0067:
            r0 = move-exception
        L_0x0068:
            java.lang.String r1 = "AdIdInfoSignalSource.getPaidV1"
            com.google.android.gms.internal.ads.zzbzm r2 = com.google.android.gms.ads.internal.zzv.zzp()
            r2.zzw(r0, r1)
            com.google.android.gms.internal.ads.zzfra r0 = new com.google.android.gms.internal.ads.zzfra
            r0.<init>()
        L_0x0076:
            com.google.android.gms.internal.ads.zzeus r1 = new com.google.android.gms.internal.ads.zzeus
            r2 = 0
            r1.<init>(r8, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeur.zzc(com.google.android.gms.ads.identifier.AdvertisingIdClient$Info):com.google.android.gms.internal.ads.zzeus");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzeus zzd(Throwable th) {
        String str;
        zzbc.zzb();
        ContentResolver contentResolver = this.zza.getContentResolver();
        if (contentResolver == null) {
            str = null;
        } else {
            str = Settings.Secure.getString(contentResolver, "android_id");
        }
        return new zzeus((AdvertisingIdClient.Info) null, str, new zzfra());
    }
}
