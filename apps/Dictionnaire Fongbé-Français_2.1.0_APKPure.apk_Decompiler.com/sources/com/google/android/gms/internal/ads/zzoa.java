package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzoa implements zzoe {
    public static final zzfvf zza = new zzny();
    private static final Random zzb = new Random();
    /* access modifiers changed from: private */
    public final zzbp zzc;
    /* access modifiers changed from: private */
    public final zzbo zzd;
    private final HashMap zze;
    private zzod zzf;
    private zzbq zzg;
    private String zzh;
    private long zzi;

    public zzoa() {
        throw null;
    }

    public zzoa(zzfvf zzfvf) {
        this.zzc = new zzbp();
        this.zzd = new zzbo();
        this.zze = new HashMap();
        this.zzg = zzbq.zza;
        this.zzi = -1;
    }

    /* access modifiers changed from: private */
    public final long zzl() {
        zznz zznz = (zznz) this.zze.get(this.zzh);
        return (zznz == null || zznz.zzd == -1) ? this.zzi + 1 : zznz.zzd;
    }

    private final zznz zzm(int i, zzug zzug) {
        int i2;
        long j = Long.MAX_VALUE;
        zznz zznz = null;
        for (zznz zznz2 : this.zze.values()) {
            zznz2.zzg(i, zzug);
            if (zznz2.zzj(i, zzug)) {
                long zzb2 = zznz2.zzd;
                if (zzb2 == -1 || zzb2 < j) {
                    zznz = zznz2;
                    j = zzb2;
                } else if (i2 == 0) {
                    int i3 = zzei.zza;
                    zznz zznz3 = zznz;
                    if (!(zznz.zze == null || zznz2.zze == null)) {
                        zznz = zznz2;
                    }
                }
            }
        }
        if (zznz != null) {
            return zznz;
        }
        String zzn = zzn();
        String str = zzn;
        zznz zznz4 = new zznz(this, zzn, i, zzug);
        this.zze.put(zzn, zznz4);
        return zznz4;
    }

    /* access modifiers changed from: private */
    public static String zzn() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private final void zzo(zznz zznz) {
        if (zznz.zzd != -1) {
            this.zzi = zznz.zzd;
        }
        this.zzh = null;
    }

    @RequiresNonNull({"listener"})
    private final void zzp(zzlu zzlu) {
        if (zzlu.zzb.zzo()) {
            String str = this.zzh;
            if (str != null) {
                zznz zznz = (zznz) this.zze.get(str);
                zznz.getClass();
                zznz zznz2 = zznz;
                zzo(zznz);
                return;
            }
            return;
        }
        zznz zznz3 = (zznz) this.zze.get(this.zzh);
        zznz zzm = zzm(zzlu.zzc, zzlu.zzd);
        this.zzh = zzm.zzb;
        zzi(zzlu);
        zzug zzug = zzlu.zzd;
        if (zzug != null && zzug.zzb()) {
            if (zznz3 != null) {
                if (zznz3.zzd == zzug.zzd && zznz3.zze != null && zznz3.zze.zzb == zzlu.zzd.zzb && zznz3.zze.zzc == zzlu.zzd.zzc) {
                    return;
                }
            }
            zzug zzug2 = zzlu.zzd;
            String unused = zzm(zzlu.zzc, new zzug(zzug2.zza, zzug2.zzd)).zzb;
            String unused2 = zzm.zzb;
        }
    }

    public final synchronized String zze() {
        return this.zzh;
    }

    public final synchronized String zzf(zzbq zzbq, zzug zzug) {
        return zzm(zzbq.zzn(zzug.zza, this.zzd).zzc, zzug).zzb;
    }

    public final synchronized void zzg(zzlu zzlu) {
        zzod zzod;
        String str = this.zzh;
        if (str != null) {
            zznz zznz = (zznz) this.zze.get(str);
            if (zznz != null) {
                zznz zznz2 = zznz;
                zzo(zznz);
            } else {
                throw null;
            }
        }
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zznz zznz3 = (zznz) it.next();
            it.remove();
            if (zznz3.zzf && (zzod = this.zzf) != null) {
                zzod.zzd(zzlu, zznz3.zzb, false);
            }
        }
    }

    public final void zzh(zzod zzod) {
        this.zzf = zzod;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        if (r0.zzc == r10.zzc) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c4, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzi(com.google.android.gms.internal.ads.zzlu r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.zzod r0 = r9.zzf     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x00c5
            com.google.android.gms.internal.ads.zzbq r0 = r10.zzb     // Catch:{ all -> 0x00c7 }
            boolean r0 = r0.zzo()     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x000f
            goto L_0x00c3
        L_0x000f:
            com.google.android.gms.internal.ads.zzug r0 = r10.zzd     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x003b
            long r1 = r9.zzl()     // Catch:{ all -> 0x00c7 }
            long r3 = r0.zzd     // Catch:{ all -> 0x00c7 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00c3
            java.util.HashMap r0 = r9.zze     // Catch:{ all -> 0x00c7 }
            java.lang.String r1 = r9.zzh     // Catch:{ all -> 0x00c7 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x00c7 }
            com.google.android.gms.internal.ads.zznz r0 = (com.google.android.gms.internal.ads.zznz) r0     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x003b
            long r1 = r0.zzd     // Catch:{ all -> 0x00c7 }
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x003b
            int r0 = r0.zzc     // Catch:{ all -> 0x00c7 }
            int r1 = r10.zzc     // Catch:{ all -> 0x00c7 }
            if (r0 != r1) goto L_0x00c3
        L_0x003b:
            int r0 = r10.zzc     // Catch:{ all -> 0x00c7 }
            com.google.android.gms.internal.ads.zzug r1 = r10.zzd     // Catch:{ all -> 0x00c7 }
            com.google.android.gms.internal.ads.zznz r0 = r9.zzm(r0, r1)     // Catch:{ all -> 0x00c7 }
            java.lang.String r1 = r9.zzh     // Catch:{ all -> 0x00c7 }
            if (r1 != 0) goto L_0x004d
            java.lang.String r1 = r0.zzb     // Catch:{ all -> 0x00c7 }
            r9.zzh = r1     // Catch:{ all -> 0x00c7 }
        L_0x004d:
            com.google.android.gms.internal.ads.zzug r1 = r10.zzd     // Catch:{ all -> 0x00c7 }
            r2 = 1
            if (r1 == 0) goto L_0x0097
            boolean r3 = r1.zzb()     // Catch:{ all -> 0x00c7 }
            if (r3 == 0) goto L_0x0097
            java.lang.Object r3 = r1.zza     // Catch:{ all -> 0x00c7 }
            long r4 = r1.zzd     // Catch:{ all -> 0x00c7 }
            int r1 = r1.zzb     // Catch:{ all -> 0x00c7 }
            com.google.android.gms.internal.ads.zzug r6 = new com.google.android.gms.internal.ads.zzug     // Catch:{ all -> 0x00c7 }
            r6.<init>(r3, r4, r1)     // Catch:{ all -> 0x00c7 }
            int r1 = r10.zzc     // Catch:{ all -> 0x00c7 }
            com.google.android.gms.internal.ads.zznz r1 = r9.zzm(r1, r6)     // Catch:{ all -> 0x00c7 }
            boolean r3 = r1.zzf     // Catch:{ all -> 0x00c7 }
            if (r3 != 0) goto L_0x0097
            r1.zzf = true     // Catch:{ all -> 0x00c7 }
            com.google.android.gms.internal.ads.zzbq r3 = r10.zzb     // Catch:{ all -> 0x00c7 }
            com.google.android.gms.internal.ads.zzug r4 = r10.zzd     // Catch:{ all -> 0x00c7 }
            com.google.android.gms.internal.ads.zzbo r5 = r9.zzd     // Catch:{ all -> 0x00c7 }
            java.lang.Object r4 = r4.zza     // Catch:{ all -> 0x00c7 }
            r3.zzn(r4, r5)     // Catch:{ all -> 0x00c7 }
            com.google.android.gms.internal.ads.zzbo r3 = r9.zzd     // Catch:{ all -> 0x00c7 }
            com.google.android.gms.internal.ads.zzug r4 = r10.zzd     // Catch:{ all -> 0x00c7 }
            int r4 = r4.zzb     // Catch:{ all -> 0x00c7 }
            r3.zzg(r4)     // Catch:{ all -> 0x00c7 }
            r3 = 0
            long r5 = com.google.android.gms.internal.ads.zzei.zzv(r3)     // Catch:{ all -> 0x00c7 }
            long r7 = com.google.android.gms.internal.ads.zzei.zzv(r3)     // Catch:{ all -> 0x00c7 }
            long r5 = r5 + r7
            java.lang.Math.max(r3, r5)     // Catch:{ all -> 0x00c7 }
            java.lang.String unused = r1.zzb     // Catch:{ all -> 0x00c7 }
        L_0x0097:
            boolean r1 = r0.zzf     // Catch:{ all -> 0x00c7 }
            if (r1 != 0) goto L_0x00a3
            r0.zzf = true     // Catch:{ all -> 0x00c7 }
            java.lang.String unused = r0.zzb     // Catch:{ all -> 0x00c7 }
        L_0x00a3:
            java.lang.String r1 = r0.zzb     // Catch:{ all -> 0x00c7 }
            java.lang.String r3 = r9.zzh     // Catch:{ all -> 0x00c7 }
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x00c7 }
            if (r1 == 0) goto L_0x00c3
            boolean r1 = r0.zzg     // Catch:{ all -> 0x00c7 }
            if (r1 != 0) goto L_0x00c3
            r0.zzg = true     // Catch:{ all -> 0x00c7 }
            com.google.android.gms.internal.ads.zzod r1 = r9.zzf     // Catch:{ all -> 0x00c7 }
            java.lang.String r0 = r0.zzb     // Catch:{ all -> 0x00c7 }
            r1.zzc(r10, r0)     // Catch:{ all -> 0x00c7 }
            monitor-exit(r9)
            return
        L_0x00c3:
            monitor-exit(r9)
            return
        L_0x00c5:
            r10 = 0
            throw r10     // Catch:{ all -> 0x00c7 }
        L_0x00c7:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00c7 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzoa.zzi(com.google.android.gms.internal.ads.zzlu):void");
    }

    public final synchronized void zzj(zzlu zzlu, int i) {
        if (this.zzf != null) {
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zznz zznz = (zznz) it.next();
                if (zznz.zzk(zzlu)) {
                    it.remove();
                    if (zznz.zzf) {
                        boolean equals = zznz.zzb.equals(this.zzh);
                        boolean z = false;
                        if (i == 0 && equals && zznz.zzg) {
                            z = true;
                        }
                        if (equals) {
                            zzo(zznz);
                        }
                        this.zzf.zzd(zzlu, zznz.zzb, z);
                    }
                }
            }
            zzp(zzlu);
        } else {
            throw null;
        }
    }

    public final synchronized void zzk(zzlu zzlu) {
        if (this.zzf != null) {
            zzbq zzbq = this.zzg;
            this.zzg = zzlu.zzb;
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zznz zznz = (zznz) it.next();
                if (!zznz.zzl(zzbq, this.zzg) || zznz.zzk(zzlu)) {
                    it.remove();
                    if (zznz.zzf) {
                        if (zznz.zzb.equals(this.zzh)) {
                            zzo(zznz);
                        }
                        this.zzf.zzd(zzlu, zznz.zzb, false);
                    }
                }
            }
            zzp(zzlu);
        } else {
            throw null;
        }
    }
}
