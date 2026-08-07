package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcdn extends zzcde implements zzcbi {
    public static final /* synthetic */ int zzd = 0;
    private zzcbj zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzccw zzi;
    private long zzj;
    private long zzk;

    public zzcdn(zzcbs zzcbs, zzcbr zzcbr) {
        super(zzcbs);
        zzcef zzcef = new zzcef(zzcbs.getContext(), zzcbr, (zzcbs) this.zzc.get(), (Integer) null);
        zzo.zzi("ExoPlayerAdapter initialized.");
        this.zze = zzcef;
        zzcef.zzL(this);
    }

    protected static final String zzc(String str) {
        return "cache:".concat(String.valueOf(zzf.zzf(str)));
    }

    private static String zzd(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        return str + "/" + canonicalName + ":" + message;
    }

    private final void zzx(long j) {
        zzs.zza.postDelayed(new zzcdm(this), j);
    }

    public final void release() {
        zzcbj zzcbj = this.zze;
        if (zzcbj != null) {
            zzcbj.zzL((zzcbi) null);
            this.zze.zzH();
        }
    }

    public final void zzD(int i, int i2) {
    }

    public final zzcbj zza() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzL((zzcbi) null);
        zzcbj zzcbj = this.zze;
        this.zze = null;
        return zzcbj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: com.google.android.gms.internal.ads.zzcdn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v30, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v22, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v32, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v33, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v23, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: com.google.android.gms.internal.ads.zzcdn} */
    /* JADX WARNING: type inference failed for: r3v11, types: [boolean] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005a, code lost:
        r3 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x010f, code lost:
        r3.zzx(((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzL)).longValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0122, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void zzb() {
        /*
            r31 = this;
            r15 = r31
            java.lang.String r0 = "Timeout reached. Limit: "
            java.lang.String r1 = r15.zzf
            java.lang.String r13 = zzc(r1)
            java.lang.String r17 = "error"
            com.google.android.gms.internal.ads.zzbcc r1 = com.google.android.gms.internal.ads.zzbcl.zzK     // Catch:{ Exception -> 0x0167 }
            com.google.android.gms.internal.ads.zzbcj r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ Exception -> 0x0167 }
            java.lang.Object r1 = r2.zza(r1)     // Catch:{ Exception -> 0x0167 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x0167 }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x0167 }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            com.google.android.gms.internal.ads.zzbcc r3 = com.google.android.gms.internal.ads.zzbcl.zzs     // Catch:{ Exception -> 0x0167 }
            com.google.android.gms.internal.ads.zzbcj r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ Exception -> 0x0167 }
            java.lang.Object r3 = r4.zza(r3)     // Catch:{ Exception -> 0x0167 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x0167 }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x0167 }
            long r11 = (long) r3     // Catch:{ Exception -> 0x0167 }
            com.google.android.gms.internal.ads.zzbcc r3 = com.google.android.gms.internal.ads.zzbcl.zzbY     // Catch:{ Exception -> 0x0167 }
            com.google.android.gms.internal.ads.zzbcj r4 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ Exception -> 0x0167 }
            java.lang.Object r3 = r4.zza(r3)     // Catch:{ Exception -> 0x0167 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ Exception -> 0x0167 }
            boolean r3 = r3.booleanValue()     // Catch:{ Exception -> 0x0167 }
            monitor-enter(r31)     // Catch:{ Exception -> 0x0167 }
            com.google.android.gms.common.util.Clock r4 = com.google.android.gms.ads.internal.zzv.zzC()     // Catch:{ all -> 0x0160 }
            long r4 = r4.currentTimeMillis()     // Catch:{ all -> 0x0160 }
            long r6 = r15.zzj     // Catch:{ all -> 0x0160 }
            long r4 = r4 - r6
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 > 0) goto L_0x013f
            boolean r0 = r15.zzg     // Catch:{ all -> 0x0160 }
            if (r0 != 0) goto L_0x012f
            boolean r0 = r15.zzh     // Catch:{ all -> 0x0160 }
            if (r0 == 0) goto L_0x005d
            monitor-exit(r31)     // Catch:{ all -> 0x0160 }
            r3 = r15
            goto L_0x01a0
        L_0x005d:
            com.google.android.gms.internal.ads.zzcbj r0 = r15.zze     // Catch:{ all -> 0x0160 }
            boolean r0 = r0.zzV()     // Catch:{ all -> 0x0160 }
            if (r0 == 0) goto L_0x0123
            com.google.android.gms.internal.ads.zzcbj r0 = r15.zze     // Catch:{ all -> 0x0160 }
            long r9 = r0.zzz()     // Catch:{ all -> 0x0160 }
            r18 = 0
            int r0 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x010c
            com.google.android.gms.internal.ads.zzcbj r0 = r15.zze     // Catch:{ all -> 0x0160 }
            long r6 = r0.zzv()     // Catch:{ all -> 0x0160 }
            long r0 = r15.zzk     // Catch:{ all -> 0x0160 }
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x00df
            int r0 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x0084
            r0 = 1
            r8 = 1
            goto L_0x0086
        L_0x0084:
            r0 = 0
            r8 = 0
        L_0x0086:
            java.lang.String r2 = r15.zzf     // Catch:{ all -> 0x00da }
            r0 = -1
            if (r3 == 0) goto L_0x0095
            com.google.android.gms.internal.ads.zzcbj r4 = r15.zze     // Catch:{ all -> 0x0160 }
            long r4 = r4.zzA()     // Catch:{ all -> 0x0160 }
            r20 = r4
            goto L_0x0097
        L_0x0095:
            r20 = r0
        L_0x0097:
            if (r3 == 0) goto L_0x00a2
            com.google.android.gms.internal.ads.zzcbj r4 = r15.zze     // Catch:{ all -> 0x0160 }
            long r4 = r4.zzx()     // Catch:{ all -> 0x0160 }
            r22 = r4
            goto L_0x00a4
        L_0x00a2:
            r22 = r0
        L_0x00a4:
            if (r3 == 0) goto L_0x00ac
            com.google.android.gms.internal.ads.zzcbj r0 = r15.zze     // Catch:{ all -> 0x0160 }
            long r0 = r0.zzB()     // Catch:{ all -> 0x0160 }
        L_0x00ac:
            r24 = r0
            int r0 = com.google.android.gms.internal.ads.zzcbj.zzs()     // Catch:{ all -> 0x00da }
            int r16 = com.google.android.gms.internal.ads.zzcbj.zzu()     // Catch:{ all -> 0x00da }
            r1 = r31
            r3 = r13
            r4 = r6
            r26 = r6
            r6 = r9
            r28 = r9
            r9 = r20
            r20 = r11
            r11 = r22
            r30 = r13
            r13 = r24
            r15 = r0
            r1.zzo(r2, r3, r4, r6, r8, r9, r11, r13, r15, r16)     // Catch:{ all -> 0x00d6 }
            r3 = r31
            r0 = r26
            r3.zzk = r0     // Catch:{ all -> 0x00f4 }
            r4 = r28
            goto L_0x00e6
        L_0x00d6:
            r0 = move-exception
            r3 = r31
            goto L_0x00f5
        L_0x00da:
            r0 = move-exception
            r30 = r13
            r3 = r15
            goto L_0x00f5
        L_0x00df:
            r0 = r6
            r20 = r11
            r30 = r13
            r3 = r15
            r4 = r9
        L_0x00e6:
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x00f9
            java.lang.String r0 = r3.zzf     // Catch:{ all -> 0x00f4 }
            r6 = r30
            r3.zzj(r0, r6, r4)     // Catch:{ all -> 0x015e }
            monitor-exit(r31)     // Catch:{ all -> 0x015e }
            goto L_0x01a0
        L_0x00f4:
            r0 = move-exception
        L_0x00f5:
            r6 = r30
            goto L_0x0163
        L_0x00f9:
            r6 = r30
            com.google.android.gms.internal.ads.zzcbj r2 = r3.zze     // Catch:{ all -> 0x015e }
            long r4 = r2.zzw()     // Catch:{ all -> 0x015e }
            int r2 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r2 < 0) goto L_0x010e
            int r2 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r2 <= 0) goto L_0x010e
            monitor-exit(r31)     // Catch:{ all -> 0x015e }
            goto L_0x01a0
        L_0x010c:
            r6 = r13
            r3 = r15
        L_0x010e:
            monitor-exit(r31)     // Catch:{ all -> 0x015e }
            com.google.android.gms.internal.ads.zzbcc r0 = com.google.android.gms.internal.ads.zzbcl.zzL
            com.google.android.gms.internal.ads.zzbcj r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r3.zzx(r0)
            return
        L_0x0123:
            r6 = r13
            r3 = r15
            java.lang.String r1 = "exoPlayerReleased"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x013b }
            java.lang.String r2 = "ExoPlayer was released during preloading."
            r0.<init>(r2)     // Catch:{ all -> 0x013b }
            throw r0     // Catch:{ all -> 0x013b }
        L_0x012f:
            r6 = r13
            r3 = r15
            java.lang.String r1 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x013b }
            java.lang.String r2 = "Abort requested before buffering finished. "
            r0.<init>(r2)     // Catch:{ all -> 0x013b }
            throw r0     // Catch:{ all -> 0x013b }
        L_0x013b:
            r0 = move-exception
            r17 = r1
            goto L_0x0163
        L_0x013f:
            r6 = r13
            r3 = r15
            java.lang.String r4 = "downloadTimeout"
            java.io.IOException r5 = new java.io.IOException     // Catch:{ all -> 0x015a }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x015a }
            r7.<init>(r0)     // Catch:{ all -> 0x015a }
            r7.append(r1)     // Catch:{ all -> 0x015a }
            java.lang.String r0 = " ms"
            r7.append(r0)     // Catch:{ all -> 0x015a }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x015a }
            r5.<init>(r0)     // Catch:{ all -> 0x015a }
            throw r5     // Catch:{ all -> 0x015a }
        L_0x015a:
            r0 = move-exception
            r17 = r4
            goto L_0x0163
        L_0x015e:
            r0 = move-exception
            goto L_0x0163
        L_0x0160:
            r0 = move-exception
            r6 = r13
            r3 = r15
        L_0x0163:
            monitor-exit(r31)     // Catch:{ all -> 0x015e }
            throw r0     // Catch:{ Exception -> 0x0165 }
        L_0x0165:
            r0 = move-exception
            goto L_0x016a
        L_0x0167:
            r0 = move-exception
            r6 = r13
            r3 = r15
        L_0x016a:
            r1 = r17
            java.lang.String r2 = r3.zzf
            java.lang.String r4 = r0.getMessage()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "Failed to preload url "
            r5.<init>(r7)
            r5.append(r2)
            java.lang.String r2 = " Exception: "
            r5.append(r2)
            r5.append(r4)
            java.lang.String r2 = r5.toString()
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r2)
            java.lang.String r2 = "VideoStreamExoPlayerCache.preload"
            com.google.android.gms.internal.ads.zzbzm r4 = com.google.android.gms.ads.internal.zzv.zzp()
            r4.zzv(r0, r2)
            r31.release()
            java.lang.String r0 = zzd(r1, r0)
            java.lang.String r2 = r3.zzf
            r3.zzg(r2, r6, r1, r0)
        L_0x01a0:
            com.google.android.gms.internal.ads.zzccx r0 = com.google.android.gms.ads.internal.zzv.zzz()
            com.google.android.gms.internal.ads.zzccw r1 = r3.zzi
            r0.zzc(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdn.zzb():void");
    }

    public final void zzf() {
        synchronized (this) {
            this.zzg = true;
            notify();
            release();
        }
        String str = this.zzf;
        if (str != null) {
            zzg(this.zzf, zzc(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    public final void zzi(boolean z, long j) {
        zzcbs zzcbs = (zzcbs) this.zzc.get();
        if (zzcbs != null) {
            zzbzw.zzf.execute(new zzcdl(zzcbs, z, j));
        }
    }

    public final void zzk(String str, Exception exc) {
        zzo.zzk("Precache error", exc);
        zzv.zzp().zzv(exc, "VideoStreamExoPlayerCache.onError");
    }

    public final void zzl(String str, Exception exc) {
        zzo.zzk("Precache exception", exc);
        zzv.zzp().zzv(exc, "VideoStreamExoPlayerCache.onException");
    }

    public final void zzm(int i) {
    }

    public final void zzp(int i) {
        this.zze.zzJ(i);
    }

    public final void zzq(int i) {
        this.zze.zzK(i);
    }

    public final void zzr(int i) {
        this.zze.zzM(i);
    }

    public final void zzs(int i) {
        this.zze.zzN(i);
    }

    public final boolean zzt(String str) {
        return zzu(str, new String[]{str});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009d, code lost:
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0133, code lost:
        r5 = r45;
        r6 = r46;
        r7 = r44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r5.zzj(r6, r7, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzu(java.lang.String r46, java.lang.String[] r47) {
        /*
            r45 = this;
            r15 = r45
            r13 = r46
            r0 = r47
            r15.zzf = r13
            java.lang.String r17 = "error"
            java.lang.String r14 = zzc(r46)
            r18 = 0
            int r1 = r0.length     // Catch:{ Exception -> 0x01c4 }
            android.net.Uri[] r1 = new android.net.Uri[r1]     // Catch:{ Exception -> 0x01c4 }
            r2 = 0
        L_0x0014:
            int r3 = r0.length     // Catch:{ Exception -> 0x01c4 }
            if (r2 >= r3) goto L_0x0022
            r3 = r0[r2]     // Catch:{ Exception -> 0x01c4 }
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ Exception -> 0x01c4 }
            r1[r2] = r3     // Catch:{ Exception -> 0x01c4 }
            int r2 = r2 + 1
            goto L_0x0014
        L_0x0022:
            com.google.android.gms.internal.ads.zzcbj r0 = r15.zze     // Catch:{ Exception -> 0x01c4 }
            java.lang.String r2 = r15.zzb     // Catch:{ Exception -> 0x01c4 }
            r0.zzF(r1, r2)     // Catch:{ Exception -> 0x01c4 }
            java.lang.ref.WeakReference r0 = r15.zzc     // Catch:{ Exception -> 0x01c4 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01c4 }
            com.google.android.gms.internal.ads.zzcbs r0 = (com.google.android.gms.internal.ads.zzcbs) r0     // Catch:{ Exception -> 0x01c4 }
            if (r0 == 0) goto L_0x0036
            r0.zzt(r14, r15)     // Catch:{ Exception -> 0x01c4 }
        L_0x0036:
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzv.zzC()     // Catch:{ Exception -> 0x01c4 }
            long r19 = r0.currentTimeMillis()     // Catch:{ Exception -> 0x01c4 }
            com.google.android.gms.internal.ads.zzbcc r1 = com.google.android.gms.internal.ads.zzbcl.zzL     // Catch:{ Exception -> 0x01c4 }
            com.google.android.gms.internal.ads.zzbcj r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ Exception -> 0x01c4 }
            java.lang.Object r1 = r2.zza(r1)     // Catch:{ Exception -> 0x01c4 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x01c4 }
            long r11 = r1.longValue()     // Catch:{ Exception -> 0x01c4 }
            com.google.android.gms.internal.ads.zzbcc r1 = com.google.android.gms.internal.ads.zzbcl.zzK     // Catch:{ Exception -> 0x01c4 }
            com.google.android.gms.internal.ads.zzbcj r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ Exception -> 0x01c4 }
            java.lang.Object r1 = r2.zza(r1)     // Catch:{ Exception -> 0x01c4 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x01c4 }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x01c4 }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r9 = r1 * r3
            com.google.android.gms.internal.ads.zzbcc r1 = com.google.android.gms.internal.ads.zzbcl.zzs     // Catch:{ Exception -> 0x01c4 }
            com.google.android.gms.internal.ads.zzbcj r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ Exception -> 0x01c4 }
            java.lang.Object r1 = r2.zza(r1)     // Catch:{ Exception -> 0x01c4 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x01c4 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x01c4 }
            long r6 = (long) r1     // Catch:{ Exception -> 0x01c4 }
            com.google.android.gms.internal.ads.zzbcc r1 = com.google.android.gms.internal.ads.zzbcl.zzbY     // Catch:{ Exception -> 0x01c4 }
            com.google.android.gms.internal.ads.zzbcj r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ Exception -> 0x01c4 }
            java.lang.Object r1 = r2.zza(r1)     // Catch:{ Exception -> 0x01c4 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ Exception -> 0x01c4 }
            boolean r21 = r1.booleanValue()     // Catch:{ Exception -> 0x01c4 }
            r22 = -1
            r1 = r22
        L_0x0087:
            monitor-enter(r45)     // Catch:{ Exception -> 0x01c4 }
            long r3 = r0.currentTimeMillis()     // Catch:{ all -> 0x01bc }
            long r3 = r3 - r19
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r5 > 0) goto L_0x0191
            boolean r3 = r15.zzg     // Catch:{ all -> 0x01bc }
            if (r3 != 0) goto L_0x0184
            boolean r3 = r15.zzh     // Catch:{ all -> 0x01bc }
            r24 = 1
            if (r3 == 0) goto L_0x00a0
            monitor-exit(r45)     // Catch:{ all -> 0x01bc }
            r5 = r15
            goto L_0x0153
        L_0x00a0:
            com.google.android.gms.internal.ads.zzcbj r3 = r15.zze     // Catch:{ all -> 0x01bc }
            boolean r3 = r3.zzV()     // Catch:{ all -> 0x01bc }
            if (r3 == 0) goto L_0x0177
            com.google.android.gms.internal.ads.zzcbj r3 = r15.zze     // Catch:{ all -> 0x01bc }
            long r4 = r3.zzz()     // Catch:{ all -> 0x01bc }
            r25 = 0
            int r3 = (r4 > r25 ? 1 : (r4 == r25 ? 0 : -1))
            if (r3 <= 0) goto L_0x0157
            com.google.android.gms.internal.ads.zzcbj r3 = r15.zze     // Catch:{ all -> 0x01bc }
            long r27 = r3.zzv()     // Catch:{ all -> 0x01bc }
            int r3 = (r27 > r1 ? 1 : (r27 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x0126
            int r1 = (r27 > r25 ? 1 : (r27 == r25 ? 0 : -1))
            if (r1 <= 0) goto L_0x00c4
            r8 = 1
            goto L_0x00c5
        L_0x00c4:
            r8 = 0
        L_0x00c5:
            if (r21 == 0) goto L_0x00d0
            com.google.android.gms.internal.ads.zzcbj r1 = r15.zze     // Catch:{ all -> 0x01bc }
            long r1 = r1.zzA()     // Catch:{ all -> 0x01bc }
            r29 = r1
            goto L_0x00d2
        L_0x00d0:
            r29 = r22
        L_0x00d2:
            if (r21 == 0) goto L_0x00dd
            com.google.android.gms.internal.ads.zzcbj r1 = r15.zze     // Catch:{ all -> 0x01bc }
            long r1 = r1.zzx()     // Catch:{ all -> 0x01bc }
            r31 = r1
            goto L_0x00df
        L_0x00dd:
            r31 = r22
        L_0x00df:
            if (r21 == 0) goto L_0x00ea
            com.google.android.gms.internal.ads.zzcbj r1 = r15.zze     // Catch:{ all -> 0x01bc }
            long r1 = r1.zzB()     // Catch:{ all -> 0x01bc }
            r33 = r1
            goto L_0x00ec
        L_0x00ea:
            r33 = r22
        L_0x00ec:
            int r16 = com.google.android.gms.internal.ads.zzcbj.zzs()     // Catch:{ all -> 0x011b }
            int r35 = com.google.android.gms.internal.ads.zzcbj.zzu()     // Catch:{ all -> 0x011b }
            r1 = r45
            r2 = r46
            r3 = r14
            r36 = r4
            r4 = r27
            r38 = r6
            r6 = r36
            r40 = r9
            r9 = r29
            r42 = r11
            r11 = r31
            r44 = r14
            r13 = r33
            r15 = r16
            r16 = r35
            r1.zzo(r2, r3, r4, r6, r8, r9, r11, r13, r15, r16)     // Catch:{ all -> 0x0119 }
            r1 = r27
            r3 = r36
            goto L_0x012f
        L_0x0119:
            r0 = move-exception
            goto L_0x011e
        L_0x011b:
            r0 = move-exception
            r44 = r14
        L_0x011e:
            r5 = r45
            r6 = r46
            r7 = r44
            goto L_0x01c0
        L_0x0126:
            r38 = r6
            r40 = r9
            r42 = r11
            r44 = r14
            r3 = r4
        L_0x012f:
            int r5 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x013e
            r5 = r45
            r6 = r46
            r7 = r44
            r5.zzj(r6, r7, r3)     // Catch:{ all -> 0x01ba }
            monitor-exit(r45)     // Catch:{ all -> 0x01ba }
            goto L_0x0153
        L_0x013e:
            r5 = r45
            r6 = r46
            r7 = r44
            com.google.android.gms.internal.ads.zzcbj r3 = r5.zze     // Catch:{ all -> 0x01ba }
            long r3 = r3.zzw()     // Catch:{ all -> 0x01ba }
            int r8 = (r3 > r38 ? 1 : (r3 == r38 ? 0 : -1))
            if (r8 < 0) goto L_0x0154
            int r3 = (r27 > r25 ? 1 : (r27 == r25 ? 0 : -1))
            if (r3 <= 0) goto L_0x0154
            monitor-exit(r45)     // Catch:{ all -> 0x01ba }
        L_0x0153:
            return r24
        L_0x0154:
            r3 = r42
            goto L_0x015f
        L_0x0157:
            r38 = r6
            r40 = r9
            r6 = r13
            r7 = r14
            r5 = r15
            r3 = r11
        L_0x015f:
            r5.wait(r3)     // Catch:{ InterruptedException -> 0x016d }
            monitor-exit(r45)     // Catch:{ all -> 0x01ba }
            r11 = r3
            r15 = r5
            r13 = r6
            r14 = r7
            r6 = r38
            r9 = r40
            goto L_0x0087
        L_0x016d:
            java.lang.String r1 = "interrupted"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01b6 }
            java.lang.String r2 = "Wait interrupted."
            r0.<init>(r2)     // Catch:{ all -> 0x01b6 }
            throw r0     // Catch:{ all -> 0x01b6 }
        L_0x0177:
            r6 = r13
            r7 = r14
            r5 = r15
            java.lang.String r1 = "exoPlayerReleased"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01b6 }
            java.lang.String r2 = "ExoPlayer was released during preloading."
            r0.<init>(r2)     // Catch:{ all -> 0x01b6 }
            throw r0     // Catch:{ all -> 0x01b6 }
        L_0x0184:
            r6 = r13
            r7 = r14
            r5 = r15
            java.lang.String r1 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01b6 }
            java.lang.String r2 = "Abort requested before buffering finished. "
            r0.<init>(r2)     // Catch:{ all -> 0x01b6 }
            throw r0     // Catch:{ all -> 0x01b6 }
        L_0x0191:
            r40 = r9
            r6 = r13
            r7 = r14
            r5 = r15
            java.lang.String r1 = "downloadTimeout"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01b6 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b6 }
            r2.<init>()     // Catch:{ all -> 0x01b6 }
            java.lang.String r3 = "Timeout reached. Limit: "
            r2.append(r3)     // Catch:{ all -> 0x01b6 }
            r3 = r40
            r2.append(r3)     // Catch:{ all -> 0x01b6 }
            java.lang.String r3 = " ms"
            r2.append(r3)     // Catch:{ all -> 0x01b6 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01b6 }
            r0.<init>(r2)     // Catch:{ all -> 0x01b6 }
            throw r0     // Catch:{ all -> 0x01b6 }
        L_0x01b6:
            r0 = move-exception
            r17 = r1
            goto L_0x01c0
        L_0x01ba:
            r0 = move-exception
            goto L_0x01c0
        L_0x01bc:
            r0 = move-exception
            r6 = r13
            r7 = r14
            r5 = r15
        L_0x01c0:
            monitor-exit(r45)     // Catch:{ all -> 0x01ba }
            throw r0     // Catch:{ Exception -> 0x01c2 }
        L_0x01c2:
            r0 = move-exception
            goto L_0x01c8
        L_0x01c4:
            r0 = move-exception
            r6 = r13
            r7 = r14
            r5 = r15
        L_0x01c8:
            r1 = r17
            java.lang.String r2 = r0.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to preload url "
            r3.<init>(r4)
            r3.append(r6)
            java.lang.String r4 = " Exception: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r2)
            java.lang.String r2 = "VideoStreamExoPlayerCache.preload"
            com.google.android.gms.internal.ads.zzbzm r3 = com.google.android.gms.ads.internal.zzv.zzp()
            r3.zzv(r0, r2)
            r45.release()
            java.lang.String r0 = zzd(r1, r0)
            r5.zzg(r6, r7, r1, r0)
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdn.zzu(java.lang.String, java.lang.String[]):boolean");
    }

    public final void zzv() {
        zzo.zzj("Precache onRenderedFirstFrame");
    }

    public final boolean zzw(String str, String[] strArr, zzccw zzccw) {
        this.zzf = str;
        this.zzi = zzccw;
        String zzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.zze.zzF(uriArr, this.zzb);
            zzcbs zzcbs = (zzcbs) this.zzc.get();
            if (zzcbs != null) {
                zzcbs.zzt(zzc, this);
            }
            this.zzj = zzv.zzC().currentTimeMillis();
            this.zzk = -1;
            zzx(0);
            return true;
        } catch (Exception e) {
            String message = e.getMessage();
            zzo.zzj("Failed to preload url " + str + " Exception: " + message);
            zzv.zzp().zzv(e, "VideoStreamExoPlayerCache.preload");
            release();
            zzg(str, zzc, "error", zzd("error", e));
            return false;
        }
    }
}
