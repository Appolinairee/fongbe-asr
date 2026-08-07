package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbzw {
    public static final zzgcs zza;
    public static final zzgcs zzb;
    public static final zzgcs zzc;
    public static final ScheduledExecutorService zzd;
    public static final zzgct zze;
    public static final zzgcs zzf = new zzbzu(new zzbzt(), (zzbzv) null);
    public static final zzgcs zzg = new zzbzu(zzgcz.zzc(), (zzbzv) null);

    /* JADX WARNING: type inference failed for: r0v12, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARNING: type inference failed for: r0v15, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARNING: type inference failed for: r0v30, types: [java.util.concurrent.ExecutorService] */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            boolean r0 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            java.lang.String r1 = "Default"
            if (r0 == 0) goto L_0x001a
            com.google.android.gms.internal.ads.zzfqv.zza()
            com.google.android.gms.internal.ads.zzbzs r0 = new com.google.android.gms.internal.ads.zzbzs
            r0.<init>(r1)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool(r0)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.unconfigurableExecutorService(r0)
            goto L_0x00b3
        L_0x001a:
            com.google.android.gms.internal.ads.zzbcc r0 = com.google.android.gms.internal.ads.zzbcl.zzlf
            com.google.android.gms.internal.ads.zzbcj r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r2.zzb(r0)
            if (r0 == 0) goto L_0x009b
            com.google.android.gms.internal.ads.zzbcc r0 = com.google.android.gms.internal.ads.zzbcl.zzlf
            com.google.android.gms.internal.ads.zzbcj r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r2.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x009b
            com.google.android.gms.internal.ads.zzbcc r0 = com.google.android.gms.internal.ads.zzbcl.zzlg
            com.google.android.gms.internal.ads.zzbcj r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r2.zzb(r0)
            if (r0 == 0) goto L_0x009b
            com.google.android.gms.internal.ads.zzbcc r0 = com.google.android.gms.internal.ads.zzbcl.zzlh
            com.google.android.gms.internal.ads.zzbcj r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r2.zzb(r0)
            if (r0 == 0) goto L_0x009b
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            com.google.android.gms.internal.ads.zzbcc r2 = com.google.android.gms.internal.ads.zzbcl.zzlg
            com.google.android.gms.internal.ads.zzbcj r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zzb(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r3 = r2.intValue()
            com.google.android.gms.internal.ads.zzbcc r2 = com.google.android.gms.internal.ads.zzbcl.zzlg
            com.google.android.gms.internal.ads.zzbcj r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r4.zzb(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r4 = r2.intValue()
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r8 = new java.util.concurrent.LinkedBlockingQueue
            r8.<init>()
            com.google.android.gms.internal.ads.zzbzs r9 = new com.google.android.gms.internal.ads.zzbzs
            r9.<init>(r1)
            r5 = 10
            r2 = r0
            r2.<init>(r3, r4, r5, r7, r8, r9)
            r1 = r0
            java.util.concurrent.ThreadPoolExecutor r1 = (java.util.concurrent.ThreadPoolExecutor) r1
            com.google.android.gms.internal.ads.zzbcc r1 = com.google.android.gms.internal.ads.zzbcl.zzlh
            com.google.android.gms.internal.ads.zzbcj r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.allowCoreThreadTimeOut(r1)
            goto L_0x00b3
        L_0x009b:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.SynchronousQueue r8 = new java.util.concurrent.SynchronousQueue
            r8.<init>()
            com.google.android.gms.internal.ads.zzbzs r9 = new com.google.android.gms.internal.ads.zzbzs
            r9.<init>(r1)
            r3 = 2
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5 = 10
            r2 = r0
            r2.<init>(r3, r4, r5, r7, r8, r9)
        L_0x00b3:
            com.google.android.gms.internal.ads.zzbzu r1 = new com.google.android.gms.internal.ads.zzbzu
            r2 = 0
            r1.<init>(r0, r2)
            zza = r1
            boolean r0 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            java.lang.String r1 = "Loader"
            r3 = 1
            if (r0 == 0) goto L_0x00d3
            com.google.android.gms.internal.ads.zzfqs r0 = com.google.android.gms.internal.ads.zzfqv.zza()
            com.google.android.gms.internal.ads.zzbzs r4 = new com.google.android.gms.internal.ads.zzbzs
            r4.<init>(r1)
            r1 = 5
            java.util.concurrent.ExecutorService r0 = r0.zzc(r1, r4, r3)
            goto L_0x00ef
        L_0x00d3:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            com.google.android.gms.internal.ads.zzbzs r11 = new com.google.android.gms.internal.ads.zzbzs
            r11.<init>(r1)
            r5 = 5
            r6 = 5
            r7 = 10
            r4 = r0
            r4.<init>(r5, r6, r7, r9, r10, r11)
            r1 = r0
            java.util.concurrent.ThreadPoolExecutor r1 = (java.util.concurrent.ThreadPoolExecutor) r1
            r0.allowCoreThreadTimeOut(r3)
        L_0x00ef:
            com.google.android.gms.internal.ads.zzbzu r1 = new com.google.android.gms.internal.ads.zzbzu
            r1.<init>(r0, r2)
            zzb = r1
            boolean r0 = com.google.android.gms.common.util.ClientLibraryUtils.isPackageSide()
            java.lang.String r1 = "Activeview"
            if (r0 == 0) goto L_0x010c
            com.google.android.gms.internal.ads.zzfqs r0 = com.google.android.gms.internal.ads.zzfqv.zza()
            com.google.android.gms.internal.ads.zzbzs r4 = new com.google.android.gms.internal.ads.zzbzs
            r4.<init>(r1)
            java.util.concurrent.ExecutorService r0 = r0.zzb(r4, r3)
            goto L_0x0128
        L_0x010c:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            com.google.android.gms.internal.ads.zzbzs r11 = new com.google.android.gms.internal.ads.zzbzs
            r11.<init>(r1)
            r5 = 1
            r6 = 1
            r7 = 10
            r4 = r0
            r4.<init>(r5, r6, r7, r9, r10, r11)
            r1 = r0
            java.util.concurrent.ThreadPoolExecutor r1 = (java.util.concurrent.ThreadPoolExecutor) r1
            r0.allowCoreThreadTimeOut(r3)
        L_0x0128:
            com.google.android.gms.internal.ads.zzbzu r1 = new com.google.android.gms.internal.ads.zzbzu
            r1.<init>(r0, r2)
            zzc = r1
            com.google.android.gms.internal.ads.zzbzr r0 = new com.google.android.gms.internal.ads.zzbzr
            com.google.android.gms.internal.ads.zzbzs r1 = new com.google.android.gms.internal.ads.zzbzs
            java.lang.String r3 = "Schedule"
            r1.<init>(r3)
            r3 = 3
            r0.<init>(r3, r1)
            zzd = r0
            com.google.android.gms.internal.ads.zzgct r0 = com.google.android.gms.internal.ads.zzgcz.zzb(r0)
            zze = r0
            com.google.android.gms.internal.ads.zzbzt r0 = new com.google.android.gms.internal.ads.zzbzt
            r0.<init>()
            com.google.android.gms.internal.ads.zzbzu r1 = new com.google.android.gms.internal.ads.zzbzu
            r1.<init>(r0, r2)
            zzf = r1
            java.util.concurrent.Executor r0 = com.google.android.gms.internal.ads.zzgcz.zzc()
            com.google.android.gms.internal.ads.zzbzu r1 = new com.google.android.gms.internal.ads.zzbzu
            r1.<init>(r0, r2)
            zzg = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbzw.<clinit>():void");
    }
}
