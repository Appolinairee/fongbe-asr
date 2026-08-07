package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import java.util.LinkedHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzego implements zzgcd {
    final /* synthetic */ long zza;
    final /* synthetic */ zzfbr zzb;
    final /* synthetic */ zzfbo zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzfiv zze;
    final /* synthetic */ zzfca zzf;
    final /* synthetic */ zzegq zzg;

    zzego(zzegq zzegq, long j, zzfbr zzfbr, zzfbo zzfbo, String str, zzfiv zzfiv, zzfca zzfca) {
        this.zza = j;
        this.zzb = zzfbr;
        this.zzc = zzfbo;
        this.zzd = str;
        this.zze = zzfiv;
        this.zzf = zzfca;
        this.zzg = zzegq;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void zza(java.lang.Throwable r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            com.google.android.gms.internal.ads.zzegq r2 = r1.zzg
            com.google.android.gms.common.util.Clock r2 = r2.zza
            long r2 = r2.elapsedRealtime()
            long r4 = r1.zza
            long r2 = r2 - r4
            boolean r4 = r0 instanceof java.util.concurrent.TimeoutException
            r5 = 3
            r6 = 0
            if (r4 == 0) goto L_0x001a
            r4 = 2
        L_0x0018:
            r13 = r6
            goto L_0x0067
        L_0x001a:
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzefy
            if (r4 == 0) goto L_0x0021
            r13 = r6
            r4 = 3
            goto L_0x0067
        L_0x0021:
            boolean r4 = r0 instanceof java.util.concurrent.CancellationException
            if (r4 == 0) goto L_0x0027
            r4 = 4
            goto L_0x0018
        L_0x0027:
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzfcq
            if (r4 == 0) goto L_0x002d
            r4 = 5
            goto L_0x0018
        L_0x002d:
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzdvy
            r7 = 6
            if (r4 == 0) goto L_0x0065
            com.google.android.gms.ads.internal.client.zze r4 = com.google.android.gms.internal.ads.zzfdk.zza(r17)
            int r4 = r4.zza
            if (r4 != r5) goto L_0x003b
            r7 = 1
        L_0x003b:
            com.google.android.gms.internal.ads.zzbcc r4 = com.google.android.gms.internal.ads.zzbcl.zzbK
            com.google.android.gms.internal.ads.zzbcj r8 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r4 = r8.zza(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0062
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzeda
            if (r4 == 0) goto L_0x0062
            r4 = r0
            com.google.android.gms.internal.ads.zzeda r4 = (com.google.android.gms.internal.ads.zzeda) r4
            com.google.android.gms.ads.internal.client.zze r4 = r4.zzb()
            if (r4 == 0) goto L_0x0062
            int r4 = r4.zza
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r13 = r4
            goto L_0x0063
        L_0x0062:
            r13 = r6
        L_0x0063:
            r4 = r7
            goto L_0x0067
        L_0x0065:
            r13 = r6
            r4 = 6
        L_0x0067:
            com.google.android.gms.internal.ads.zzegq r14 = r1.zzg
            monitor-enter(r14)
            com.google.android.gms.internal.ads.zzegq r7 = r1.zzg     // Catch:{ all -> 0x010a }
            boolean r8 = r7.zze     // Catch:{ all -> 0x010a }
            if (r8 == 0) goto L_0x008a
            com.google.android.gms.internal.ads.zzegs r7 = r7.zzb     // Catch:{ all -> 0x010a }
            com.google.android.gms.internal.ads.zzfbr r8 = r1.zzb     // Catch:{ all -> 0x010a }
            com.google.android.gms.internal.ads.zzfbo r9 = r1.zzc     // Catch:{ all -> 0x010a }
            boolean r10 = r0 instanceof com.google.android.gms.internal.ads.zzeda     // Catch:{ all -> 0x010a }
            if (r10 == 0) goto L_0x0081
            r6 = r0
            com.google.android.gms.internal.ads.zzeda r6 = (com.google.android.gms.internal.ads.zzeda) r6     // Catch:{ all -> 0x010a }
        L_0x0081:
            r10 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r4
            r11 = r2
            r6.zza(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x010a }
        L_0x008a:
            com.google.android.gms.internal.ads.zzbcc r6 = com.google.android.gms.internal.ads.zzbcl.zzij     // Catch:{ all -> 0x010a }
            com.google.android.gms.internal.ads.zzbcj r7 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ all -> 0x010a }
            java.lang.Object r6 = r7.zza(r6)     // Catch:{ all -> 0x010a }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x010a }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x010a }
            if (r6 == 0) goto L_0x00b5
            com.google.android.gms.internal.ads.zzegq r6 = r1.zzg     // Catch:{ all -> 0x010a }
            com.google.android.gms.internal.ads.zzfja r6 = r6.zzc     // Catch:{ all -> 0x010a }
            com.google.android.gms.internal.ads.zzfiv r7 = r1.zze     // Catch:{ all -> 0x010a }
            com.google.android.gms.internal.ads.zzfca r8 = r1.zzf     // Catch:{ all -> 0x010a }
            com.google.android.gms.internal.ads.zzfbo r9 = r1.zzc     // Catch:{ all -> 0x010a }
            java.util.List r10 = r9.zzn     // Catch:{ all -> 0x010a }
            java.util.List r7 = r7.zzc(r8, r9, r10)     // Catch:{ all -> 0x010a }
            com.google.android.gms.internal.ads.zzfbo r8 = r1.zzc     // Catch:{ all -> 0x010a }
            com.google.android.gms.ads.internal.util.client.zzv r8 = r8.zzax     // Catch:{ all -> 0x010a }
            r6.zze(r7, r8)     // Catch:{ all -> 0x010a }
        L_0x00b5:
            com.google.android.gms.internal.ads.zzegq r6 = r1.zzg     // Catch:{ all -> 0x010a }
            boolean r7 = r6.zzg     // Catch:{ all -> 0x010a }
            if (r7 == 0) goto L_0x00bf
            monitor-exit(r14)     // Catch:{ all -> 0x010a }
            return
        L_0x00bf:
            java.util.LinkedHashMap r15 = r6.zzd     // Catch:{ all -> 0x010a }
            com.google.android.gms.internal.ads.zzfbo r12 = r1.zzc     // Catch:{ all -> 0x010a }
            com.google.android.gms.internal.ads.zzegp r10 = new com.google.android.gms.internal.ads.zzegp     // Catch:{ all -> 0x010a }
            java.lang.String r7 = r1.zzd     // Catch:{ all -> 0x010a }
            java.lang.String r8 = r12.zzaf     // Catch:{ all -> 0x010a }
            r6 = r10
            r9 = r4
            r4 = r10
            r10 = r2
            r5 = r12
            r12 = r13
            r6.<init>(r7, r8, r9, r10, r12)     // Catch:{ all -> 0x010a }
            r15.put(r5, r4)     // Catch:{ all -> 0x010a }
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzfdk.zza(r17)     // Catch:{ all -> 0x010a }
            int r4 = r0.zza     // Catch:{ all -> 0x010a }
            r5 = 3
            if (r4 == r5) goto L_0x00e2
            if (r4 != 0) goto L_0x00fd
        L_0x00e2:
            com.google.android.gms.ads.internal.client.zze r4 = r0.zzd     // Catch:{ all -> 0x010a }
            if (r4 == 0) goto L_0x00fd
            java.lang.String r4 = r4.zzc     // Catch:{ all -> 0x010a }
            java.lang.String r5 = "com.google.android.gms.ads"
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x010a }
            if (r4 != 0) goto L_0x00fd
            com.google.android.gms.internal.ads.zzeda r4 = new com.google.android.gms.internal.ads.zzeda     // Catch:{ all -> 0x010a }
            com.google.android.gms.ads.internal.client.zze r0 = r0.zzd     // Catch:{ all -> 0x010a }
            r5 = 13
            r4.<init>(r5, r0)     // Catch:{ all -> 0x010a }
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzfdk.zza(r4)     // Catch:{ all -> 0x010a }
        L_0x00fd:
            com.google.android.gms.internal.ads.zzegq r4 = r1.zzg     // Catch:{ all -> 0x010a }
            com.google.android.gms.internal.ads.zzedb r4 = r4.zzf     // Catch:{ all -> 0x010a }
            com.google.android.gms.internal.ads.zzfbo r5 = r1.zzc     // Catch:{ all -> 0x010a }
            r4.zzf(r5, r2, r0)     // Catch:{ all -> 0x010a }
            monitor-exit(r14)     // Catch:{ all -> 0x010a }
            return
        L_0x010a:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x010a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzego.zza(java.lang.Throwable):void");
    }

    public final void zzb(Object obj) {
        long elapsedRealtime = this.zzg.zza.elapsedRealtime() - this.zza;
        synchronized (this.zzg) {
            zzegq zzegq = this.zzg;
            if (zzegq.zze) {
                zzegq.zzb.zza(this.zzb, this.zzc, 0, (zzeda) null, elapsedRealtime);
            }
            zzegq zzegq2 = this.zzg;
            if (!zzegq2.zzg) {
                if (zzegq2.zzq(this.zzc)) {
                    ((zzegp) this.zzg.zzd.get(this.zzc)).zzd = elapsedRealtime;
                } else {
                    LinkedHashMap zzh = this.zzg.zzd;
                    zzfbo zzfbo = this.zzc;
                    zzh.put(zzfbo, new zzegp(this.zzd, zzfbo.zzaf, 0, elapsedRealtime, (Integer) null));
                }
                this.zzg.zzf.zzg(this.zzc, elapsedRealtime, (zze) null);
            }
        }
    }
}
