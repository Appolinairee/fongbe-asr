package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzf;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcdk extends zzcde implements zzgy {
    private static final AtomicInteger zzd = new AtomicInteger(0);
    private String zze;
    private final zzcbr zzf;
    private boolean zzg;
    private final zzcdj zzh = new zzcdj();
    private final zzcco zzi = new zzcco();
    private ByteBuffer zzj;
    private boolean zzk;
    private final Object zzl = new Object();
    private final String zzm;
    private final int zzn;
    private boolean zzo;

    public zzcdk(zzcbs zzcbs, zzcbr zzcbr) {
        super(zzcbs);
        this.zzf = zzcbr;
        this.zzm = (String) zzful.zzd(zzcbs != null ? zzcbs.zzr() : null).zzb("");
        this.zzn = zzcbs != null ? zzcbs.zzf() : 0;
        zzd.incrementAndGet();
    }

    public static int zzi() {
        return zzd.get();
    }

    protected static final String zzv(String str) {
        return "cache:".concat(String.valueOf(zzf.zzf(str)));
    }

    private final void zzx() {
        int zza = (int) this.zzh.zza();
        int zza2 = (int) this.zzi.zza(this.zzj);
        int position = this.zzj.position();
        int round = Math.round(((float) zza2) * (((float) position) / ((float) zza)));
        int zzs = zzcbj.zzs();
        int zzu = zzcbj.zzu();
        String str = this.zze;
        zzn(str, zzv(str), position, zza, (long) round, (long) zza2, round > 0, zzs, zzu);
    }

    public final void release() {
        zzd.decrementAndGet();
    }

    public final void zza(zzfy zzfy, zzgd zzgd, boolean z, int i) {
    }

    public final void zzb(zzfy zzfy, zzgd zzgd, boolean z) {
    }

    public final void zzc(zzfy zzfy, zzgd zzgd, boolean z) {
    }

    public final void zzd(zzfy zzfy, zzgd zzgd, boolean z) {
        if (zzfy instanceof zzgl) {
            this.zzh.zzb((zzgl) zzfy);
        }
    }

    public final void zzf() {
        this.zzg = true;
    }

    public final String zzk() {
        return this.zze;
    }

    public final ByteBuffer zzl() {
        synchronized (this.zzl) {
            ByteBuffer byteBuffer = this.zzj;
            if (byteBuffer != null && !this.zzk) {
                byteBuffer.flip();
                this.zzk = true;
            }
            this.zzg = true;
        }
        return this.zzj;
    }

    public final boolean zzm() {
        return this.zzo;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: com.google.android.gms.internal.ads.zzgl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: com.google.android.gms.internal.ads.zzgl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: com.google.android.gms.internal.ads.zzccm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: com.google.android.gms.internal.ads.zzgl} */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d9, code lost:
        if (r1.zzj.remaining() > 0) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00db, code lost:
        zzx();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e3, code lost:
        if (r1.zzg != false) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e5, code lost:
        r5 = r0.currentTimeMillis();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ed, code lost:
        if ((r5 - r16) < r10) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ef, code lost:
        zzx();
        r16 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00fb, code lost:
        if ((r5 - r7) > (1000 * r12)) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0120, code lost:
        throw new java.io.IOException("Timeout exceeded. Limit: " + r12 + " sec");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0121, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0123, code lost:
        r3 = "externalAbort";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0146, code lost:
        throw new java.io.IOException("Precache abort at " + r1.zzj.limit() + " bytes");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0147, code lost:
        r0 = e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzt(java.lang.String r22) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            r1.zze = r2
            java.lang.String r3 = "error"
            java.lang.String r4 = zzv(r22)
            r5 = 0
            com.google.android.gms.internal.ads.zzgg r0 = new com.google.android.gms.internal.ads.zzgg     // Catch:{ Exception -> 0x0150 }
            r0.<init>()     // Catch:{ Exception -> 0x0150 }
            java.lang.String r6 = r1.zzb     // Catch:{ Exception -> 0x0150 }
            r0.zzf(r6)     // Catch:{ Exception -> 0x0150 }
            com.google.android.gms.internal.ads.zzcbr r6 = r1.zzf     // Catch:{ Exception -> 0x0150 }
            int r6 = r6.zzd     // Catch:{ Exception -> 0x0150 }
            r0.zzc(r6)     // Catch:{ Exception -> 0x0150 }
            com.google.android.gms.internal.ads.zzcbr r6 = r1.zzf     // Catch:{ Exception -> 0x0150 }
            int r6 = r6.zze     // Catch:{ Exception -> 0x0150 }
            r0.zzd(r6)     // Catch:{ Exception -> 0x0150 }
            r6 = 1
            r0.zzb(r6)     // Catch:{ Exception -> 0x0150 }
            r0.zze(r1)     // Catch:{ Exception -> 0x0150 }
            com.google.android.gms.internal.ads.zzgl r9 = r0.zza()     // Catch:{ Exception -> 0x0150 }
            com.google.android.gms.internal.ads.zzcbr r0 = r1.zzf     // Catch:{ Exception -> 0x0150 }
            boolean r0 = r0.zzi     // Catch:{ Exception -> 0x0150 }
            if (r0 == 0) goto L_0x0045
            com.google.android.gms.internal.ads.zzccm r0 = new com.google.android.gms.internal.ads.zzccm     // Catch:{ Exception -> 0x0150 }
            android.content.Context r8 = r1.zza     // Catch:{ Exception -> 0x0150 }
            java.lang.String r10 = r1.zzm     // Catch:{ Exception -> 0x0150 }
            int r11 = r1.zzn     // Catch:{ Exception -> 0x0150 }
            r12 = 0
            r13 = 0
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0150 }
            r9 = r0
        L_0x0045:
            android.net.Uri r11 = android.net.Uri.parse(r22)     // Catch:{ Exception -> 0x0150 }
            com.google.android.gms.internal.ads.zzgd r0 = new com.google.android.gms.internal.ads.zzgd     // Catch:{ Exception -> 0x0150 }
            r14 = -1
            r16 = 0
            r12 = 0
            r10 = r0
            r10.<init>(r11, r12, r14, r16)     // Catch:{ Exception -> 0x0150 }
            r9.zzb(r0)     // Catch:{ Exception -> 0x0150 }
            java.lang.ref.WeakReference r0 = r1.zzc     // Catch:{ Exception -> 0x0150 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0150 }
            com.google.android.gms.internal.ads.zzcbs r0 = (com.google.android.gms.internal.ads.zzcbs) r0     // Catch:{ Exception -> 0x0150 }
            if (r0 == 0) goto L_0x0065
            r0.zzt(r4, r1)     // Catch:{ Exception -> 0x0150 }
        L_0x0065:
            com.google.android.gms.common.util.Clock r0 = com.google.android.gms.ads.internal.zzv.zzC()     // Catch:{ Exception -> 0x0150 }
            long r7 = r0.currentTimeMillis()     // Catch:{ Exception -> 0x0150 }
            com.google.android.gms.internal.ads.zzbcc r10 = com.google.android.gms.internal.ads.zzbcl.zzL     // Catch:{ Exception -> 0x0150 }
            com.google.android.gms.internal.ads.zzbcj r11 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ Exception -> 0x0150 }
            java.lang.Object r10 = r11.zza(r10)     // Catch:{ Exception -> 0x0150 }
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ Exception -> 0x0150 }
            long r10 = r10.longValue()     // Catch:{ Exception -> 0x0150 }
            com.google.android.gms.internal.ads.zzbcc r12 = com.google.android.gms.internal.ads.zzbcl.zzK     // Catch:{ Exception -> 0x0150 }
            com.google.android.gms.internal.ads.zzbcj r13 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ Exception -> 0x0150 }
            java.lang.Object r12 = r13.zza(r12)     // Catch:{ Exception -> 0x0150 }
            java.lang.Long r12 = (java.lang.Long) r12     // Catch:{ Exception -> 0x0150 }
            long r12 = r12.longValue()     // Catch:{ Exception -> 0x0150 }
            com.google.android.gms.internal.ads.zzcbr r14 = r1.zzf     // Catch:{ Exception -> 0x0150 }
            int r14 = r14.zzc     // Catch:{ Exception -> 0x0150 }
            java.nio.ByteBuffer r14 = java.nio.ByteBuffer.allocate(r14)     // Catch:{ Exception -> 0x0150 }
            r1.zzj = r14     // Catch:{ Exception -> 0x0150 }
            r14 = 8192(0x2000, float:1.14794E-41)
            byte[] r15 = new byte[r14]     // Catch:{ Exception -> 0x0150 }
            r16 = r7
        L_0x009d:
            java.nio.ByteBuffer r6 = r1.zzj     // Catch:{ Exception -> 0x0150 }
            int r6 = r6.remaining()     // Catch:{ Exception -> 0x0150 }
            int r6 = java.lang.Math.min(r6, r14)     // Catch:{ Exception -> 0x0150 }
            int r6 = r9.zza(r15, r5, r6)     // Catch:{ Exception -> 0x0150 }
            r14 = -1
            if (r6 != r14) goto L_0x00c0
            r14 = 1
            r1.zzo = r14     // Catch:{ Exception -> 0x0150 }
            com.google.android.gms.internal.ads.zzcco r0 = r1.zzi     // Catch:{ Exception -> 0x0150 }
            java.nio.ByteBuffer r6 = r1.zzj     // Catch:{ Exception -> 0x0150 }
            long r6 = r0.zza(r6)     // Catch:{ Exception -> 0x0150 }
            int r0 = (int) r6     // Catch:{ Exception -> 0x0150 }
            long r6 = (long) r0     // Catch:{ Exception -> 0x0150 }
            r1.zzj(r2, r4, r6)     // Catch:{ Exception -> 0x0150 }
        L_0x00be:
            r3 = 1
            goto L_0x00df
        L_0x00c0:
            java.lang.Object r14 = r1.zzl     // Catch:{ Exception -> 0x0150 }
            monitor-enter(r14)     // Catch:{ Exception -> 0x0150 }
            boolean r5 = r1.zzg     // Catch:{ all -> 0x014b }
            if (r5 != 0) goto L_0x00d0
            java.nio.ByteBuffer r5 = r1.zzj     // Catch:{ all -> 0x014b }
            r18 = r3
            r3 = 0
            r5.put(r15, r3, r6)     // Catch:{ all -> 0x0149 }
            goto L_0x00d2
        L_0x00d0:
            r18 = r3
        L_0x00d2:
            monitor-exit(r14)     // Catch:{ all -> 0x0149 }
            java.nio.ByteBuffer r3 = r1.zzj     // Catch:{ Exception -> 0x0147 }
            int r3 = r3.remaining()     // Catch:{ Exception -> 0x0147 }
            if (r3 > 0) goto L_0x00e0
            r21.zzx()     // Catch:{ Exception -> 0x0147 }
            goto L_0x00be
        L_0x00df:
            return r3
        L_0x00e0:
            r3 = 1
            boolean r5 = r1.zzg     // Catch:{ Exception -> 0x0147 }
            if (r5 != 0) goto L_0x0123
            long r5 = r0.currentTimeMillis()     // Catch:{ Exception -> 0x0147 }
            long r19 = r5 - r16
            int r14 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
            if (r14 < 0) goto L_0x00f4
            r21.zzx()     // Catch:{ Exception -> 0x0147 }
            r16 = r5
        L_0x00f4:
            long r5 = r5 - r7
            r19 = 1000(0x3e8, double:4.94E-321)
            long r19 = r19 * r12
            int r14 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r14 > 0) goto L_0x0103
            r3 = r18
            r5 = 0
            r14 = 8192(0x2000, float:1.14794E-41)
            goto L_0x009d
        L_0x0103:
            java.lang.String r3 = "downloadTimeout"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0121 }
            r0.<init>()     // Catch:{ Exception -> 0x0121 }
            java.lang.String r5 = "Timeout exceeded. Limit: "
            r0.append(r5)     // Catch:{ Exception -> 0x0121 }
            r0.append(r12)     // Catch:{ Exception -> 0x0121 }
            java.lang.String r5 = " sec"
            r0.append(r5)     // Catch:{ Exception -> 0x0121 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0121 }
            java.io.IOException r5 = new java.io.IOException     // Catch:{ Exception -> 0x0121 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x0121 }
            throw r5     // Catch:{ Exception -> 0x0121 }
        L_0x0121:
            r0 = move-exception
            goto L_0x0155
        L_0x0123:
            java.lang.String r3 = "externalAbort"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x0121 }
            java.nio.ByteBuffer r5 = r1.zzj     // Catch:{ Exception -> 0x0121 }
            int r5 = r5.limit()     // Catch:{ Exception -> 0x0121 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0121 }
            r6.<init>()     // Catch:{ Exception -> 0x0121 }
            java.lang.String r7 = "Precache abort at "
            r6.append(r7)     // Catch:{ Exception -> 0x0121 }
            r6.append(r5)     // Catch:{ Exception -> 0x0121 }
            java.lang.String r5 = " bytes"
            r6.append(r5)     // Catch:{ Exception -> 0x0121 }
            java.lang.String r5 = r6.toString()     // Catch:{ Exception -> 0x0121 }
            r0.<init>(r5)     // Catch:{ Exception -> 0x0121 }
            throw r0     // Catch:{ Exception -> 0x0121 }
        L_0x0147:
            r0 = move-exception
            goto L_0x0153
        L_0x0149:
            r0 = move-exception
            goto L_0x014e
        L_0x014b:
            r0 = move-exception
            r18 = r3
        L_0x014e:
            monitor-exit(r14)     // Catch:{ all -> 0x0149 }
            throw r0     // Catch:{ Exception -> 0x0147 }
        L_0x0150:
            r0 = move-exception
            r18 = r3
        L_0x0153:
            r3 = r18
        L_0x0155:
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getCanonicalName()
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = ":"
            r6.append(r5)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Failed to preload url "
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r6 = " Exception: "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r5)
            r1.zzg(r2, r4, r3, r0)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdk.zzt(java.lang.String):boolean");
    }
}
