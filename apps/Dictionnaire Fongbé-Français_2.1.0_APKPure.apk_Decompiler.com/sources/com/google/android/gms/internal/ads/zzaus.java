package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzaus implements zzauv {
    private static zzaus zzb;
    volatile long zza = 0;
    private final Context zzc;
    private final zzfox zzd;
    private final zzfpe zze;
    private final zzfpg zzf;
    private final zzavx zzg;
    /* access modifiers changed from: private */
    public final zzfni zzh;
    private final Executor zzi;
    private final zzfpd zzj;
    private final CountDownLatch zzk;
    private final zzawm zzl;
    private final zzawe zzm;
    private final zzavv zzn;
    /* access modifiers changed from: private */
    public final Object zzo = new Object();
    /* access modifiers changed from: private */
    public volatile boolean zzp;
    private volatile boolean zzq = false;
    private final int zzr;

    zzaus(Context context, zzfni zzfni, zzfox zzfox, zzfpe zzfpe, zzfpg zzfpg, zzavx zzavx, Executor executor, zzfnd zzfnd, int i, zzawm zzawm, zzawe zzawe, zzavv zzavv) {
        this.zzc = context;
        this.zzh = zzfni;
        this.zzd = zzfox;
        this.zze = zzfpe;
        this.zzf = zzfpg;
        this.zzg = zzavx;
        this.zzi = executor;
        this.zzr = i;
        this.zzl = zzawm;
        this.zzm = zzawe;
        this.zzn = zzavv;
        this.zzq = false;
        this.zzk = new CountDownLatch(1);
        this.zzj = new zzauq(this, zzfnd);
    }

    public static synchronized zzaus zza(Context context, zzarg zzarg, boolean z) {
        zzaus zzs;
        synchronized (zzaus.class) {
            zzfnj zzc2 = zzfnk.zzc();
            zzc2.zza(zzarg.zzf());
            zzc2.zzg(zzarg.zzi());
            zzs = zzs(context, Executors.newCachedThreadPool(), zzc2.zzh(), z);
        }
        return zzs;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009a, code lost:
        if (r4.zzc().zzj().equals(r5.zzj()) != false) goto L_0x00f5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* bridge */ /* synthetic */ void zzj(com.google.android.gms.internal.ads.zzaus r12) {
        /*
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1
            com.google.android.gms.internal.ads.zzfow r3 = r12.zzu(r2)
            if (r3 == 0) goto L_0x001e
            com.google.android.gms.internal.ads.zzaxz r4 = r3.zza()
            java.lang.String r4 = r4.zzk()
            com.google.android.gms.internal.ads.zzaxz r3 = r3.zza()
            java.lang.String r3 = r3.zzj()
            r9 = r3
            r8 = r4
            goto L_0x0021
        L_0x001e:
            r4 = 0
            r8 = r4
            r9 = r8
        L_0x0021:
            android.content.Context r5 = r12.zzc     // Catch:{ zzgyg -> 0x011e }
            int r7 = r12.zzr     // Catch:{ zzgyg -> 0x011e }
            java.lang.String r10 = "1"
            com.google.android.gms.internal.ads.zzfni r11 = r12.zzh     // Catch:{ zzgyg -> 0x011e }
            r6 = 1
            com.google.android.gms.internal.ads.zzfpb r3 = com.google.android.gms.internal.ads.zzfns.zza(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ zzgyg -> 0x011e }
            byte[] r4 = r3.zzb     // Catch:{ zzgyg -> 0x011e }
            if (r4 == 0) goto L_0x010f
            int r5 = r4.length     // Catch:{ zzgyg -> 0x011e }
            if (r5 != 0) goto L_0x0037
            goto L_0x010f
        L_0x0037:
            r6 = 0
            com.google.android.gms.internal.ads.zzgwj r4 = com.google.android.gms.internal.ads.zzgwj.zzv(r4, r6, r5)     // Catch:{ NullPointerException -> 0x0102 }
            com.google.android.gms.internal.ads.zzgxb r5 = com.google.android.gms.internal.ads.zzgxb.zza()     // Catch:{ NullPointerException -> 0x0102 }
            com.google.android.gms.internal.ads.zzaxw r4 = com.google.android.gms.internal.ads.zzaxw.zzb(r4, r5)     // Catch:{ NullPointerException -> 0x0102 }
            com.google.android.gms.internal.ads.zzaxz r5 = r4.zzc()     // Catch:{ zzgyg -> 0x011e }
            java.lang.String r5 = r5.zzk()     // Catch:{ zzgyg -> 0x011e }
            boolean r5 = r5.isEmpty()     // Catch:{ zzgyg -> 0x011e }
            if (r5 != 0) goto L_0x00f5
            com.google.android.gms.internal.ads.zzaxz r5 = r4.zzc()     // Catch:{ zzgyg -> 0x011e }
            java.lang.String r5 = r5.zzj()     // Catch:{ zzgyg -> 0x011e }
            boolean r5 = r5.isEmpty()     // Catch:{ zzgyg -> 0x011e }
            if (r5 != 0) goto L_0x00f5
            com.google.android.gms.internal.ads.zzgwj r5 = r4.zzd()     // Catch:{ zzgyg -> 0x011e }
            byte[] r5 = r5.zzA()     // Catch:{ zzgyg -> 0x011e }
            int r5 = r5.length     // Catch:{ zzgyg -> 0x011e }
            if (r5 != 0) goto L_0x006d
            goto L_0x00f5
        L_0x006d:
            com.google.android.gms.internal.ads.zzfow r5 = r12.zzu(r2)     // Catch:{ zzgyg -> 0x011e }
            if (r5 != 0) goto L_0x0074
            goto L_0x009c
        L_0x0074:
            com.google.android.gms.internal.ads.zzaxz r5 = r5.zza()     // Catch:{ zzgyg -> 0x011e }
            com.google.android.gms.internal.ads.zzaxz r6 = r4.zzc()     // Catch:{ zzgyg -> 0x011e }
            java.lang.String r6 = r6.zzk()     // Catch:{ zzgyg -> 0x011e }
            java.lang.String r7 = r5.zzk()     // Catch:{ zzgyg -> 0x011e }
            boolean r6 = r6.equals(r7)     // Catch:{ zzgyg -> 0x011e }
            if (r6 == 0) goto L_0x009c
            com.google.android.gms.internal.ads.zzaxz r6 = r4.zzc()     // Catch:{ zzgyg -> 0x011e }
            java.lang.String r6 = r6.zzj()     // Catch:{ zzgyg -> 0x011e }
            java.lang.String r5 = r5.zzj()     // Catch:{ zzgyg -> 0x011e }
            boolean r5 = r6.equals(r5)     // Catch:{ zzgyg -> 0x011e }
            if (r5 != 0) goto L_0x00f5
        L_0x009c:
            com.google.android.gms.internal.ads.zzfpd r5 = r12.zzj     // Catch:{ zzgyg -> 0x011e }
            int r3 = r3.zzc     // Catch:{ zzgyg -> 0x011e }
            com.google.android.gms.internal.ads.zzbcc r6 = com.google.android.gms.internal.ads.zzbcl.zzcu     // Catch:{ zzgyg -> 0x011e }
            com.google.android.gms.internal.ads.zzbcj r7 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ zzgyg -> 0x011e }
            java.lang.Object r6 = r7.zza(r6)     // Catch:{ zzgyg -> 0x011e }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ zzgyg -> 0x011e }
            boolean r6 = r6.booleanValue()     // Catch:{ zzgyg -> 0x011e }
            if (r6 == 0) goto L_0x00c6
            r6 = 3
            if (r3 != r6) goto L_0x00bc
            com.google.android.gms.internal.ads.zzfpe r3 = r12.zze     // Catch:{ zzgyg -> 0x011e }
            boolean r3 = r3.zza(r4)     // Catch:{ zzgyg -> 0x011e }
            goto L_0x00cc
        L_0x00bc:
            r6 = 4
            if (r3 != r6) goto L_0x00ce
            com.google.android.gms.internal.ads.zzfpe r3 = r12.zze     // Catch:{ zzgyg -> 0x011e }
            boolean r3 = r3.zzb(r4, r5)     // Catch:{ zzgyg -> 0x011e }
            goto L_0x00cc
        L_0x00c6:
            com.google.android.gms.internal.ads.zzfox r3 = r12.zzd     // Catch:{ zzgyg -> 0x011e }
            boolean r3 = r3.zza(r4, r5)     // Catch:{ zzgyg -> 0x011e }
        L_0x00cc:
            if (r3 != 0) goto L_0x00db
        L_0x00ce:
            com.google.android.gms.internal.ads.zzfni r2 = r12.zzh     // Catch:{ zzgyg -> 0x011e }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ zzgyg -> 0x011e }
            long r3 = r3 - r0
            r5 = 4009(0xfa9, float:5.618E-42)
            r2.zzd(r5, r3)     // Catch:{ zzgyg -> 0x011e }
            goto L_0x012b
        L_0x00db:
            com.google.android.gms.internal.ads.zzfow r3 = r12.zzu(r2)     // Catch:{ zzgyg -> 0x011e }
            if (r3 == 0) goto L_0x012b
            com.google.android.gms.internal.ads.zzfpg r4 = r12.zzf     // Catch:{ zzgyg -> 0x011e }
            boolean r3 = r4.zzc(r3)     // Catch:{ zzgyg -> 0x011e }
            if (r3 == 0) goto L_0x00eb
            r12.zzq = r2     // Catch:{ zzgyg -> 0x011e }
        L_0x00eb:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ zzgyg -> 0x011e }
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            r12.zza = r2     // Catch:{ zzgyg -> 0x011e }
            goto L_0x012b
        L_0x00f5:
            com.google.android.gms.internal.ads.zzfni r2 = r12.zzh     // Catch:{ zzgyg -> 0x011e }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ zzgyg -> 0x011e }
            long r3 = r3 - r0
            r5 = 5010(0x1392, float:7.02E-42)
            r2.zzd(r5, r3)     // Catch:{ zzgyg -> 0x011e }
            goto L_0x012b
        L_0x0102:
            com.google.android.gms.internal.ads.zzfni r2 = r12.zzh     // Catch:{ zzgyg -> 0x011e }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ zzgyg -> 0x011e }
            long r3 = r3 - r0
            r5 = 2030(0x7ee, float:2.845E-42)
            r2.zzd(r5, r3)     // Catch:{ zzgyg -> 0x011e }
            goto L_0x012b
        L_0x010f:
            com.google.android.gms.internal.ads.zzfni r2 = r12.zzh     // Catch:{ zzgyg -> 0x011e }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ zzgyg -> 0x011e }
            long r3 = r3 - r0
            r5 = 5009(0x1391, float:7.019E-42)
            r2.zzd(r5, r3)     // Catch:{ zzgyg -> 0x011e }
            goto L_0x012b
        L_0x011c:
            r0 = move-exception
            goto L_0x0131
        L_0x011e:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzfni r3 = r12.zzh     // Catch:{ all -> 0x011c }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x011c }
            long r4 = r4 - r0
            r0 = 4002(0xfa2, float:5.608E-42)
            r3.zzc(r0, r4, r2)     // Catch:{ all -> 0x011c }
        L_0x012b:
            java.util.concurrent.CountDownLatch r12 = r12.zzk
            r12.countDown()
            return
        L_0x0131:
            java.util.concurrent.CountDownLatch r12 = r12.zzk
            r12.countDown()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaus.zzj(com.google.android.gms.internal.ads.zzaus):void");
    }

    private static synchronized zzaus zzs(Context context, Executor executor, zzfnk zzfnk, boolean z) {
        zzaus zzaus;
        zzavv zzavv;
        zzfnk zzfnk2;
        Context context2 = context;
        Executor executor2 = executor;
        synchronized (zzaus.class) {
            if (zzb == null) {
                zzfni zza2 = zzfni.zza(context2, executor2, z);
                zzavg zzc2 = ((Boolean) zzbe.zzc().zza(zzbcl.zzdw)).booleanValue() ? zzavg.zzc(context) : null;
                zzawm zzd2 = ((Boolean) zzbe.zzc().zza(zzbcl.zzdx)).booleanValue() ? zzawm.zzd(context, executor) : null;
                zzawe zzawe = ((Boolean) zzbe.zzc().zza(zzbcl.zzcM)).booleanValue() ? new zzawe() : null;
                if (((Boolean) zzbe.zzc().zza(zzbcl.zzcT)).booleanValue()) {
                    zzavv = new zzavv();
                    zzfnk2 = zzfnk;
                } else {
                    zzfnk2 = zzfnk;
                    zzavv = null;
                }
                zzfob zze2 = zzfob.zze(context2, executor2, zza2, zzfnk2);
                zzavw zzavw = new zzavw(context2);
                zzavx zzavx = new zzavx(zzfnk, zze2, new zzawk(context2, zzavw), zzavw, zzc2, zzd2, zzawe, zzavv);
                int zzb2 = zzfok.zzb(context2, zza2);
                zzfnd zzfnd = new zzfnd();
                zzaus zzaus2 = new zzaus(context, zza2, new zzfox(context2, zzb2), new zzfpe(context2, zzb2, new zzaup(zza2), ((Boolean) zzbe.zzc().zza(zzbcl.zzcw)).booleanValue()), new zzfpg(context2, zzavx, zza2, zzfnd), zzavx, executor, zzfnd, zzb2, zzd2, zzawe, zzavv);
                zzb = zzaus2;
                zzaus2.zzm();
                zzb.zzp();
            }
            zzaus = zzb;
        }
        return zzaus;
    }

    private final void zzt() {
        zzawm zzawm = this.zzl;
        if (zzawm != null) {
            zzawm.zzh();
        }
    }

    private final zzfow zzu(int i) {
        if (!zzfok.zza(this.zzr)) {
            return null;
        }
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzcu)).booleanValue()) {
            return this.zze.zzc(1);
        }
        return this.zzd.zzc(1);
    }

    public final String zzd(Context context, String str, View view) {
        return zze(context, str, view, (Activity) null);
    }

    public final String zze(Context context, String str, View view, Activity activity) {
        zzt();
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzcM)).booleanValue()) {
            this.zzm.zzi();
        }
        zzp();
        zzfnl zza2 = this.zzf.zza();
        if (zza2 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zza3 = zza2.zza(context, (String) null, str, view, activity);
        this.zzh.zzf(5000, System.currentTimeMillis() - currentTimeMillis, zza3, (Map) null);
        return zza3;
    }

    public final String zzf(Context context) {
        zzt();
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzcM)).booleanValue()) {
            this.zzm.zzj();
        }
        zzp();
        zzfnl zza2 = this.zzf.zza();
        if (zza2 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zzc2 = zza2.zzc(context, (String) null);
        this.zzh.zzf(5001, System.currentTimeMillis() - currentTimeMillis, zzc2, (Map) null);
        return zzc2;
    }

    public final String zzg(Context context) {
        return "19";
    }

    public final String zzh(Context context, View view, Activity activity) {
        zzt();
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzcM)).booleanValue()) {
            this.zzm.zzk(context, view);
        }
        zzp();
        zzfnl zza2 = this.zzf.zza();
        if (zza2 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zzb2 = zza2.zzb(context, (String) null, view, activity);
        this.zzh.zzf(5002, System.currentTimeMillis() - currentTimeMillis, zzb2, (Map) null);
        return zzb2;
    }

    public final void zzk(MotionEvent motionEvent) {
        zzfnl zza2 = this.zzf.zza();
        if (zza2 != null) {
            try {
                zza2.zzd((String) null, motionEvent);
            } catch (zzfpf e) {
                this.zzh.zzc(e.zza(), -1, e);
            }
        }
    }

    public final void zzl(int i, int i2, int i3) {
        DisplayMetrics displayMetrics;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzlP)).booleanValue() && (displayMetrics = this.zzc.getResources().getDisplayMetrics()) != null) {
            float f = (float) i;
            float f2 = (float) i2;
            MotionEvent obtain = MotionEvent.obtain(0, 0, 0, f * displayMetrics.density, f2 * displayMetrics.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            zzk(obtain);
            obtain.recycle();
            MotionEvent obtain2 = MotionEvent.obtain(0, 0, 2, f * displayMetrics.density, f2 * displayMetrics.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            zzk(obtain2);
            obtain2.recycle();
            MotionEvent obtain3 = MotionEvent.obtain(0, (long) i3, 1, f * displayMetrics.density, f2 * displayMetrics.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            zzk(obtain3);
            obtain3.recycle();
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zzm() {
        long currentTimeMillis = System.currentTimeMillis();
        zzfow zzu = zzu(1);
        if (zzu == null) {
            this.zzh.zzd(4013, System.currentTimeMillis() - currentTimeMillis);
        } else if (this.zzf.zzc(zzu)) {
            this.zzq = true;
            this.zzk.countDown();
        }
    }

    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzavv zzavv = this.zzn;
        if (zzavv != null) {
            zzavv.zzb(Arrays.asList(stackTraceElementArr));
        }
    }

    public final void zzo(View view) {
        this.zzg.zzd(view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzp() {
        /*
            r6 = this;
            boolean r0 = r6.zzp
            if (r0 != 0) goto L_0x0042
            java.lang.Object r0 = r6.zzo
            monitor-enter(r0)
            boolean r1 = r6.zzp     // Catch:{ all -> 0x003f }
            if (r1 != 0) goto L_0x003d
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x003f }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            long r3 = r6.zza     // Catch:{ all -> 0x003f }
            long r1 = r1 - r3
            r3 = 3600(0xe10, double:1.7786E-320)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x001d
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x001d:
            com.google.android.gms.internal.ads.zzfpg r1 = r6.zzf     // Catch:{ all -> 0x003f }
            com.google.android.gms.internal.ads.zzfow r1 = r1.zzb()     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x002b
            boolean r1 = r1.zzd(r3)     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003d
        L_0x002b:
            int r1 = r6.zzr     // Catch:{ all -> 0x003f }
            boolean r1 = com.google.android.gms.internal.ads.zzfok.zza(r1)     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003d
            java.util.concurrent.Executor r1 = r6.zzi     // Catch:{ all -> 0x003f }
            com.google.android.gms.internal.ads.zzaur r2 = new com.google.android.gms.internal.ads.zzaur     // Catch:{ all -> 0x003f }
            r2.<init>(r6)     // Catch:{ all -> 0x003f }
            r1.execute(r2)     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return
        L_0x003f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r1
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaus.zzp():void");
    }

    public final synchronized boolean zzr() {
        return this.zzq;
    }
}
