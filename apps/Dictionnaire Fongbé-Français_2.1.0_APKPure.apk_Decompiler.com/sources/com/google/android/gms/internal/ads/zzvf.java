package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzvf implements zzyt, zztv {
    final /* synthetic */ zzvk zza;
    /* access modifiers changed from: private */
    public final long zzb = zztx.zza();
    private final Uri zzc;
    /* access modifiers changed from: private */
    public final zzgx zzd;
    private final zzuz zze;
    private final zzacq zzf;
    private final zzda zzg;
    private final zzadj zzh = new zzadj();
    private volatile boolean zzi;
    private boolean zzj = true;
    /* access modifiers changed from: private */
    public long zzk;
    /* access modifiers changed from: private */
    public zzgd zzl = zzi(0);
    private zzadt zzm;
    private boolean zzn;

    public zzvf(zzvk zzvk, Uri uri, zzfy zzfy, zzuz zzuz, zzacq zzacq, zzda zzda) {
        this.zza = zzvk;
        this.zzc = uri;
        this.zzd = new zzgx(zzfy);
        this.zze = zzuz;
        this.zzf = zzacq;
        this.zzg = zzda;
    }

    static /* bridge */ /* synthetic */ void zzf(zzvf zzvf, long j, long j2) {
        zzvf.zzh.zza = j;
        zzvf.zzk = j2;
        zzvf.zzj = true;
        zzvf.zzn = false;
    }

    private final zzgd zzi(long j) {
        zzgb zzgb = new zzgb();
        zzgb.zzd(this.zzc);
        zzgb.zzc(j);
        zzgb.zza(6);
        zzgb.zzb(zzvk.zzb);
        return zzgb.zze();
    }

    public final void zzg() {
        this.zzi = true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(16:59|60|63|64|(0)|68|(0)(0)|74|(0)|77|(0)(0)|85|(2:(0)(0)|123)|(0)(0)|109|(0)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0120 */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0227 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01e5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009e A[Catch:{ all -> 0x0207 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a8 A[Catch:{ all -> 0x0207 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b4 A[Catch:{ all -> 0x0207 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00be A[Catch:{ all -> 0x0207 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ca A[Catch:{ all -> 0x0207 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d4 A[Catch:{ all -> 0x0207 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e0 A[Catch:{ all -> 0x0207 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f0 A[Catch:{ all -> 0x0207 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00fc A[Catch:{ all -> 0x0207 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0132 A[Catch:{ all -> 0x0207 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x014e A[Catch:{ all -> 0x0207 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x016a A[Catch:{ all -> 0x0207 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0186 A[Catch:{ all -> 0x0207 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x018f A[Catch:{ all -> 0x0207 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01a2 A[SYNTHETIC, Splitter:B:87:0x01a2] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzh() throws java.io.IOException {
        /*
            r24 = this;
            r1 = r24
            java.lang.String r0 = "Invalid metadata interval: "
        L_0x0004:
            boolean r2 = r1.zzi
            if (r2 != 0) goto L_0x0227
            r2 = -1
            r5 = 0
            com.google.android.gms.internal.ads.zzadj r6 = r1.zzh     // Catch:{ all -> 0x0207 }
            long r13 = r6.zza     // Catch:{ all -> 0x0207 }
            com.google.android.gms.internal.ads.zzgd r6 = r1.zzi(r13)     // Catch:{ all -> 0x0207 }
            r1.zzl = r6     // Catch:{ all -> 0x0207 }
            com.google.android.gms.internal.ads.zzgx r7 = r1.zzd     // Catch:{ all -> 0x0207 }
            long r6 = r7.zzb(r6)     // Catch:{ all -> 0x0207 }
            boolean r8 = r1.zzi     // Catch:{ all -> 0x0207 }
            if (r8 == 0) goto L_0x0037
            com.google.android.gms.internal.ads.zzuz r0 = r1.zze
            long r4 = r0.zzb()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0031
            com.google.android.gms.internal.ads.zzadj r2 = r1.zzh
            long r3 = r0.zzb()
            r2.zza = r3
        L_0x0031:
            com.google.android.gms.internal.ads.zzgx r0 = r1.zzd
            com.google.android.gms.internal.ads.zzga.zza(r0)
            return
        L_0x0037:
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 == 0) goto L_0x0041
            long r6 = r6 + r13
            com.google.android.gms.internal.ads.zzvk r8 = r1.zza     // Catch:{ all -> 0x0207 }
            r8.zzq.post(new com.google.android.gms.internal.ads.zzva(r8))     // Catch:{ all -> 0x0207 }
        L_0x0041:
            r15 = r6
            com.google.android.gms.internal.ads.zzvk r6 = r1.zza     // Catch:{ all -> 0x0207 }
            com.google.android.gms.internal.ads.zzgx r7 = r1.zzd     // Catch:{ all -> 0x0207 }
            java.util.Map r7 = r7.zze()     // Catch:{ all -> 0x0207 }
            java.lang.String r8 = "icy-br"
            java.lang.Object r8 = r7.get(r8)     // Catch:{ all -> 0x0207 }
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x0207 }
            java.lang.String r9 = "IcyHeaders"
            r10 = -1
            if (r8 == 0) goto L_0x0090
            java.lang.Object r8 = r8.get(r5)     // Catch:{ all -> 0x0207 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0207 }
            int r11 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x007e }
            int r11 = r11 * 1000
            if (r11 <= 0) goto L_0x0069
            r18 = r11
            r2 = 1
            goto L_0x0093
        L_0x0069:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x007f }
            r12.<init>()     // Catch:{ NumberFormatException -> 0x007f }
            java.lang.String r2 = "Invalid bitrate: "
            r12.append(r2)     // Catch:{ NumberFormatException -> 0x007f }
            r12.append(r8)     // Catch:{ NumberFormatException -> 0x007f }
            java.lang.String r2 = r12.toString()     // Catch:{ NumberFormatException -> 0x007f }
            com.google.android.gms.internal.ads.zzdo.zzf(r9, r2)     // Catch:{ NumberFormatException -> 0x007f }
            goto L_0x0090
        L_0x007e:
            r11 = -1
        L_0x007f:
            java.lang.String r2 = "Invalid bitrate header: "
            java.lang.String r3 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0207 }
            java.lang.String r2 = r2.concat(r3)     // Catch:{ all -> 0x0207 }
            com.google.android.gms.internal.ads.zzdo.zzf(r9, r2)     // Catch:{ all -> 0x0207 }
            r18 = r11
            r2 = 0
            goto L_0x0093
        L_0x0090:
            r2 = 0
            r18 = -1
        L_0x0093:
            java.lang.String r3 = "icy-genre"
            java.lang.Object r3 = r7.get(r3)     // Catch:{ all -> 0x0207 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x0207 }
            r8 = 0
            if (r3 == 0) goto L_0x00a8
            java.lang.Object r2 = r3.get(r5)     // Catch:{ all -> 0x0207 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0207 }
            r19 = r2
            r2 = 1
            goto L_0x00aa
        L_0x00a8:
            r19 = r8
        L_0x00aa:
            java.lang.String r3 = "icy-name"
            java.lang.Object r3 = r7.get(r3)     // Catch:{ all -> 0x0207 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x0207 }
            if (r3 == 0) goto L_0x00be
            java.lang.Object r2 = r3.get(r5)     // Catch:{ all -> 0x0207 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0207 }
            r20 = r2
            r2 = 1
            goto L_0x00c0
        L_0x00be:
            r20 = r8
        L_0x00c0:
            java.lang.String r3 = "icy-url"
            java.lang.Object r3 = r7.get(r3)     // Catch:{ all -> 0x0207 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x0207 }
            if (r3 == 0) goto L_0x00d4
            java.lang.Object r2 = r3.get(r5)     // Catch:{ all -> 0x0207 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0207 }
            r21 = r2
            r2 = 1
            goto L_0x00d6
        L_0x00d4:
            r21 = r8
        L_0x00d6:
            java.lang.String r3 = "icy-pub"
            java.lang.Object r3 = r7.get(r3)     // Catch:{ all -> 0x0207 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x0207 }
            if (r3 == 0) goto L_0x00f0
            java.lang.Object r2 = r3.get(r5)     // Catch:{ all -> 0x0207 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0207 }
            java.lang.String r3 = "1"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0207 }
            r22 = r2
            r2 = 1
            goto L_0x00f2
        L_0x00f0:
            r22 = 0
        L_0x00f2:
            java.lang.String r3 = "icy-metaint"
            java.lang.Object r3 = r7.get(r3)     // Catch:{ all -> 0x0207 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x0207 }
            if (r3 == 0) goto L_0x012e
            java.lang.Object r3 = r3.get(r5)     // Catch:{ all -> 0x0207 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0207 }
            int r7 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x011f }
            if (r7 <= 0) goto L_0x010c
            r23 = r7
            r2 = 1
            goto L_0x0130
        L_0x010c:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0120 }
            r11.<init>()     // Catch:{ NumberFormatException -> 0x0120 }
            r11.append(r0)     // Catch:{ NumberFormatException -> 0x0120 }
            r11.append(r3)     // Catch:{ NumberFormatException -> 0x0120 }
            java.lang.String r11 = r11.toString()     // Catch:{ NumberFormatException -> 0x0120 }
            com.google.android.gms.internal.ads.zzdo.zzf(r9, r11)     // Catch:{ NumberFormatException -> 0x0120 }
            goto L_0x012e
        L_0x011f:
            r7 = -1
        L_0x0120:
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0207 }
            java.lang.String r3 = r0.concat(r3)     // Catch:{ all -> 0x0207 }
            com.google.android.gms.internal.ads.zzdo.zzf(r9, r3)     // Catch:{ all -> 0x0207 }
            r23 = r7
            goto L_0x0130
        L_0x012e:
            r23 = -1
        L_0x0130:
            if (r2 == 0) goto L_0x0139
            com.google.android.gms.internal.ads.zzafr r8 = new com.google.android.gms.internal.ads.zzafr     // Catch:{ all -> 0x0207 }
            r17 = r8
            r17.<init>(r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x0207 }
        L_0x0139:
            r6.zzs = r8     // Catch:{ all -> 0x0207 }
            com.google.android.gms.internal.ads.zzgx r2 = r1.zzd     // Catch:{ all -> 0x0207 }
            com.google.android.gms.internal.ads.zzvk r3 = r1.zza     // Catch:{ all -> 0x0207 }
            com.google.android.gms.internal.ads.zzafr r6 = r3.zzs     // Catch:{ all -> 0x0207 }
            if (r6 == 0) goto L_0x016a
            com.google.android.gms.internal.ads.zzafr r6 = r3.zzs     // Catch:{ all -> 0x0207 }
            int r6 = r6.zzf     // Catch:{ all -> 0x0207 }
            if (r6 == r10) goto L_0x016a
            com.google.android.gms.internal.ads.zztw r6 = new com.google.android.gms.internal.ads.zztw     // Catch:{ all -> 0x0207 }
            com.google.android.gms.internal.ads.zzafr r3 = r3.zzs     // Catch:{ all -> 0x0207 }
            int r3 = r3.zzf     // Catch:{ all -> 0x0207 }
            r6.<init>(r2, r3, r1)     // Catch:{ all -> 0x0207 }
            com.google.android.gms.internal.ads.zzvk r2 = r1.zza     // Catch:{ all -> 0x0207 }
            com.google.android.gms.internal.ads.zzadt r2 = r2.zzv()     // Catch:{ all -> 0x0207 }
            r1.zzm = r2     // Catch:{ all -> 0x0207 }
            com.google.android.gms.internal.ads.zzab r3 = com.google.android.gms.internal.ads.zzvk.zzc     // Catch:{ all -> 0x0207 }
            r2.zzm(r3)     // Catch:{ all -> 0x0207 }
            r8 = r6
            goto L_0x016b
        L_0x016a:
            r8 = r2
        L_0x016b:
            com.google.android.gms.internal.ads.zzuz r7 = r1.zze     // Catch:{ all -> 0x0207 }
            android.net.Uri r9 = r1.zzc     // Catch:{ all -> 0x0207 }
            com.google.android.gms.internal.ads.zzgx r2 = r1.zzd     // Catch:{ all -> 0x0207 }
            java.util.Map r10 = r2.zze()     // Catch:{ all -> 0x0207 }
            com.google.android.gms.internal.ads.zzacq r2 = r1.zzf     // Catch:{ all -> 0x0207 }
            r11 = r13
            r4 = r13
            r13 = r15
            r15 = r2
            r7.zzd(r8, r9, r10, r11, r13, r15)     // Catch:{ all -> 0x0207 }
            com.google.android.gms.internal.ads.zzvk r2 = r1.zza     // Catch:{ all -> 0x0207 }
            com.google.android.gms.internal.ads.zzafr r2 = r2.zzs     // Catch:{ all -> 0x0207 }
            if (r2 == 0) goto L_0x018b
            com.google.android.gms.internal.ads.zzuz r2 = r1.zze     // Catch:{ all -> 0x0207 }
            r2.zzc()     // Catch:{ all -> 0x0207 }
        L_0x018b:
            boolean r2 = r1.zzj     // Catch:{ all -> 0x0207 }
            if (r2 == 0) goto L_0x019d
            com.google.android.gms.internal.ads.zzuz r2 = r1.zze     // Catch:{ all -> 0x0207 }
            long r7 = r1.zzk     // Catch:{ all -> 0x0207 }
            r2.zzf(r4, r7)     // Catch:{ all -> 0x0207 }
            r2 = 0
            r1.zzj = r2     // Catch:{ all -> 0x019a }
            goto L_0x019e
        L_0x019a:
            r0 = move-exception
            goto L_0x0209
        L_0x019d:
            r2 = 0
        L_0x019e:
            r13 = r4
            r4 = 0
        L_0x01a0:
            if (r4 != 0) goto L_0x01e5
            boolean r5 = r1.zzi     // Catch:{ all -> 0x01e1 }
            if (r5 != 0) goto L_0x01de
            com.google.android.gms.internal.ads.zzda r5 = r1.zzg     // Catch:{ InterruptedException -> 0x01d8 }
            r5.zza()     // Catch:{ InterruptedException -> 0x01d8 }
            com.google.android.gms.internal.ads.zzuz r5 = r1.zze     // Catch:{ all -> 0x01e1 }
            com.google.android.gms.internal.ads.zzadj r6 = r1.zzh     // Catch:{ all -> 0x01e1 }
            int r4 = r5.zza(r6)     // Catch:{ all -> 0x01e1 }
            com.google.android.gms.internal.ads.zzuz r5 = r1.zze     // Catch:{ all -> 0x01e1 }
            long r5 = r5.zzb()     // Catch:{ all -> 0x01e1 }
            com.google.android.gms.internal.ads.zzvk r7 = r1.zza     // Catch:{ all -> 0x01e1 }
            long r7 = r7.zzj     // Catch:{ all -> 0x01e1 }
            long r7 = r7 + r13
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x01a0
            com.google.android.gms.internal.ads.zzda r7 = r1.zzg     // Catch:{ all -> 0x01e1 }
            r7.zzc()     // Catch:{ all -> 0x01e1 }
            com.google.android.gms.internal.ads.zzvk r7 = r1.zza     // Catch:{ all -> 0x01e1 }
            android.os.Handler r8 = r7.zzq     // Catch:{ all -> 0x01e1 }
            java.lang.Runnable r7 = r7.zzp     // Catch:{ all -> 0x01e1 }
            r8.post(r7)     // Catch:{ all -> 0x01e1 }
            r13 = r5
            goto L_0x01a0
        L_0x01d8:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch:{ all -> 0x01e1 }
            r0.<init>()     // Catch:{ all -> 0x01e1 }
            throw r0     // Catch:{ all -> 0x01e1 }
        L_0x01de:
            r3 = 1
            r4 = 0
            goto L_0x01e6
        L_0x01e1:
            r0 = move-exception
            r5 = r4
            r2 = 1
            goto L_0x020b
        L_0x01e5:
            r3 = 1
        L_0x01e6:
            if (r4 != r3) goto L_0x01ea
            r5 = 0
            goto L_0x01ff
        L_0x01ea:
            com.google.android.gms.internal.ads.zzuz r2 = r1.zze
            long r5 = r2.zzb()
            r7 = -1
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x01fe
            com.google.android.gms.internal.ads.zzadj r3 = r1.zzh
            long r5 = r2.zzb()
            r3.zza = r5
        L_0x01fe:
            r5 = r4
        L_0x01ff:
            com.google.android.gms.internal.ads.zzgx r2 = r1.zzd
            com.google.android.gms.internal.ads.zzga.zza(r2)
            if (r5 == 0) goto L_0x0004
            goto L_0x0227
        L_0x0207:
            r0 = move-exception
            r2 = 0
        L_0x0209:
            r2 = 1
            r5 = 0
        L_0x020b:
            if (r5 == r2) goto L_0x0221
            com.google.android.gms.internal.ads.zzuz r2 = r1.zze
            long r3 = r2.zzb()
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0221
            com.google.android.gms.internal.ads.zzadj r3 = r1.zzh
            long r4 = r2.zzb()
            r3.zza = r4
        L_0x0221:
            com.google.android.gms.internal.ads.zzgx r2 = r1.zzd
            com.google.android.gms.internal.ads.zzga.zza(r2)
            throw r0
        L_0x0227:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvf.zzh():void");
    }

    public final void zza(zzdy zzdy) {
        long j;
        if (!this.zzn) {
            j = this.zzk;
        } else {
            j = Math.max(this.zza.zzR(true), this.zzk);
        }
        int zzb2 = zzdy.zzb();
        zzadt zzadt = this.zzm;
        zzadt.getClass();
        zzadt zzadt2 = zzadt;
        zzadt.zzr(zzdy, zzb2);
        zzadt.zzt(j, 1, zzb2, 0, (zzads) null);
        this.zzn = true;
    }
}
