package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzy;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbbq;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzfdx implements zzfdw {
    private final ConcurrentHashMap zza;
    private final zzfed zzb;
    private final zzfdz zzc = new zzfdz();

    public zzfdx(zzfed zzfed) {
        this.zza = new ConcurrentHashMap(zzfed.zzd);
        this.zzb = zzfed;
    }

    private final void zzf() {
        Parcelable.Creator<zzfed> creator = zzfed.CREATOR;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzgh)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.zzb.zzb);
            sb.append(" PoolCollection");
            sb.append(this.zzc.zzb());
            int i = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((zzfeg) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < ((zzfdv) entry.getValue()).zzb(); i2++) {
                    sb.append("[O]");
                }
                for (int zzb2 = ((zzfdv) entry.getValue()).zzb(); zzb2 < this.zzb.zzd; zzb2++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((zzfdv) entry.getValue()).zzg());
                sb.append("\n");
            }
            while (i < this.zzb.zzc) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            zzo.zze(sb.toString());
        }
    }

    public final zzfed zza() {
        return this.zzb;
    }

    public final synchronized zzfef zzb(zzfeg zzfeg) {
        zzfef zzfef;
        zzfdv zzfdv = (zzfdv) this.zza.get(zzfeg);
        if (zzfdv != null) {
            zzfef = zzfdv.zze();
            if (zzfef == null) {
                this.zzc.zze();
            }
            zzfet zzf = zzfdv.zzf();
            if (zzfef != null) {
                zzbbq.zzb.zzc zzd = zzbbq.zzb.zzd();
                zzbbq.zzb.zza.C0003zza zza2 = zzbbq.zzb.zza.zza();
                zza2.zzf(zzbbq.zzb.zzd.IN_MEMORY);
                zzbbq.zzb.zze.zza zzb2 = zzbbq.zzb.zze.zzb();
                zzb2.zzd(zzf.zza);
                zzb2.zze(zzf.zzb);
                zza2.zzg(zzb2);
                zzd.zzd(zza2);
                zzfef.zza.zzb().zzc().zzi((zzbbq.zzb) zzd.zzbr());
            }
            zzf();
        } else {
            this.zzc.zzf();
            zzf();
            zzfef = null;
        }
        return zzfef;
    }

    @Deprecated
    public final zzfeg zzc(zzm zzm, String str, zzy zzy) {
        return new zzfeh(zzm, str, new zzbvn(this.zzb.zza).zza().zzj, this.zzb.zzf, zzy);
    }

    public final synchronized boolean zzd(zzfeg zzfeg, zzfef zzfef) {
        boolean zzh;
        zzfdv zzfdv = (zzfdv) this.zza.get(zzfeg);
        zzfef.zzd = zzv.zzC().currentTimeMillis();
        if (zzfdv == null) {
            zzfed zzfed = this.zzb;
            zzfdv zzfdv2 = new zzfdv(zzfed.zzd, zzfed.zze * 1000);
            if (this.zza.size() == this.zzb.zzc) {
                int i = this.zzb.zzg;
                int i2 = i - 1;
                zzfeg zzfeg2 = null;
                if (i != 0) {
                    long j = Long.MAX_VALUE;
                    if (i2 == 0) {
                        for (Map.Entry entry : this.zza.entrySet()) {
                            if (((zzfdv) entry.getValue()).zzc() < j) {
                                j = ((zzfdv) entry.getValue()).zzc();
                                zzfeg2 = (zzfeg) entry.getKey();
                            }
                        }
                        if (zzfeg2 != null) {
                            this.zza.remove(zzfeg2);
                        }
                    } else if (i2 == 1) {
                        for (Map.Entry entry2 : this.zza.entrySet()) {
                            if (((zzfdv) entry2.getValue()).zzd() < j) {
                                j = ((zzfdv) entry2.getValue()).zzd();
                                zzfeg2 = (zzfeg) entry2.getKey();
                            }
                        }
                        if (zzfeg2 != null) {
                            this.zza.remove(zzfeg2);
                        }
                    } else if (i2 == 2) {
                        int i3 = Integer.MAX_VALUE;
                        for (Map.Entry entry3 : this.zza.entrySet()) {
                            if (((zzfdv) entry3.getValue()).zza() < i3) {
                                i3 = ((zzfdv) entry3.getValue()).zza();
                                zzfeg2 = (zzfeg) entry3.getKey();
                            }
                        }
                        if (zzfeg2 != null) {
                            this.zza.remove(zzfeg2);
                        }
                    }
                    this.zzc.zzg();
                } else {
                    throw null;
                }
            }
            this.zza.put(zzfeg, zzfdv2);
            this.zzc.zzd();
            zzfdv = zzfdv2;
        }
        zzh = zzfdv.zzh(zzfef);
        this.zzc.zzc();
        zzfdy zza2 = this.zzc.zza();
        zzfet zzf = zzfdv.zzf();
        if (zzfef != null) {
            zzbbq.zzb.zzc zzd = zzbbq.zzb.zzd();
            zzbbq.zzb.zza.C0003zza zza3 = zzbbq.zzb.zza.zza();
            zza3.zzf(zzbbq.zzb.zzd.IN_MEMORY);
            zzbbq.zzb.zzg.zza zzb2 = zzbbq.zzb.zzg.zzb();
            zzb2.zze(zza2.zza);
            zzb2.zzf(zza2.zzb);
            zzb2.zzg(zzf.zzb);
            zza3.zzi(zzb2);
            zzd.zzd(zza3);
            zzfef.zza.zzb().zzc().zzj((zzbbq.zzb) zzd.zzbr());
        }
        zzf();
        return zzh;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r3.zzb() >= r1.zzd) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean zze(com.google.android.gms.internal.ads.zzfeg r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.concurrent.ConcurrentHashMap r0 = r2.zza     // Catch:{ all -> 0x001c }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x001c }
            com.google.android.gms.internal.ads.zzfdv r3 = (com.google.android.gms.internal.ads.zzfdv) r3     // Catch:{ all -> 0x001c }
            r0 = 1
            if (r3 == 0) goto L_0x001a
            com.google.android.gms.internal.ads.zzfed r1 = r2.zzb     // Catch:{ all -> 0x001c }
            int r3 = r3.zzb()     // Catch:{ all -> 0x001c }
            int r1 = r1.zzd     // Catch:{ all -> 0x001c }
            monitor-exit(r2)
            if (r3 >= r1) goto L_0x0018
            return r0
        L_0x0018:
            r3 = 0
            return r3
        L_0x001a:
            monitor-exit(r2)
            return r0
        L_0x001c:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001c }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfdx.zze(com.google.android.gms.internal.ads.zzfeg):boolean");
    }
}
