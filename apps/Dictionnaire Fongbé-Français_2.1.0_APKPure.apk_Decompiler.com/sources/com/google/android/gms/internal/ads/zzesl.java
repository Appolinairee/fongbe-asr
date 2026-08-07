package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzesl implements zzetr {
    private final Context zza;
    private final zzgcs zzb;
    private final zzfcj zzc;
    private final VersionInfoParcel zzd;

    zzesl(Context context, zzgcs zzgcs, zzfcj zzfcj, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzgcs;
        this.zzc = zzfcj;
        this.zzd = versionInfoParcel;
    }

    public final int zza() {
        return 53;
    }

    public final ListenableFuture zzb() {
        return this.zzb.zzb(new zzesk(this));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0054, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdg)).booleanValue() != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0056, code lost:
        r1 = com.google.android.gms.internal.ads.zzfre.zzj(r0).zzh(((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdp)).longValue(), com.google.android.gms.ads.internal.zzv.zzp().zzi().zzN());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00bb, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdf)).booleanValue() == false) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00cf, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdh)).booleanValue() != false) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00d1, code lost:
        r4 = com.google.android.gms.internal.ads.zzfrf.zzi(r0);
        r0 = com.google.android.gms.internal.ads.zzfrb.zza(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ed, code lost:
        if (r9.zzd.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdl)).intValue()) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ef, code lost:
        r2 = r4.zzh(((java.lang.Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzdq)).longValue(), com.google.android.gms.ads.internal.zzv.zzp().zzi().zzN());
        r3 = r0.zzd();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0113, code lost:
        r6 = r0.zze();
        r4 = r2;
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0040, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzde)).booleanValue() == false) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzesm zzc() throws java.lang.Exception {
        /*
            r9 = this;
            android.content.Context r0 = r9.zza     // Catch:{ IOException -> 0x0126 }
            com.google.android.gms.internal.ads.zzfcj r1 = r9.zzc     // Catch:{ IOException -> 0x0126 }
            boolean r7 = r1.zzb()     // Catch:{ IOException -> 0x0126 }
            com.google.android.gms.internal.ads.zzfra r1 = new com.google.android.gms.internal.ads.zzfra     // Catch:{ IOException -> 0x0126 }
            r1.<init>()     // Catch:{ IOException -> 0x0126 }
            com.google.android.gms.internal.ads.zzfra r2 = new com.google.android.gms.internal.ads.zzfra     // Catch:{ IOException -> 0x0126 }
            r2.<init>()     // Catch:{ IOException -> 0x0126 }
            r3 = 1
            if (r7 == 0) goto L_0x002e
            com.google.android.gms.internal.ads.zzbcc r4 = com.google.android.gms.internal.ads.zzbcl.zzdi     // Catch:{ IOException -> 0x0126 }
            com.google.android.gms.internal.ads.zzbcj r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ IOException -> 0x0126 }
            java.lang.Object r4 = r5.zza(r4)     // Catch:{ IOException -> 0x0126 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ IOException -> 0x0126 }
            boolean r4 = r4.booleanValue()     // Catch:{ IOException -> 0x0126 }
            if (r4 != 0) goto L_0x002e
            com.google.android.gms.internal.ads.zzesm r0 = new com.google.android.gms.internal.ads.zzesm     // Catch:{ IOException -> 0x0126 }
            r0.<init>(r3)     // Catch:{ IOException -> 0x0126 }
            goto L_0x0125
        L_0x002e:
            if (r7 != 0) goto L_0x0042
            com.google.android.gms.internal.ads.zzbcc r4 = com.google.android.gms.internal.ads.zzbcl.zzde     // Catch:{ IOException -> 0x0126 }
            com.google.android.gms.internal.ads.zzbcj r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ IOException -> 0x0126 }
            java.lang.Object r4 = r5.zza(r4)     // Catch:{ IOException -> 0x0126 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ IOException -> 0x0126 }
            boolean r4 = r4.booleanValue()     // Catch:{ IOException -> 0x0126 }
            if (r4 != 0) goto L_0x0056
        L_0x0042:
            if (r7 == 0) goto L_0x007a
            com.google.android.gms.internal.ads.zzbcc r4 = com.google.android.gms.internal.ads.zzbcl.zzdg     // Catch:{ IOException -> 0x0126 }
            com.google.android.gms.internal.ads.zzbcj r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ IOException -> 0x0126 }
            java.lang.Object r4 = r5.zza(r4)     // Catch:{ IOException -> 0x0126 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ IOException -> 0x0126 }
            boolean r4 = r4.booleanValue()     // Catch:{ IOException -> 0x0126 }
            if (r4 == 0) goto L_0x007a
        L_0x0056:
            com.google.android.gms.internal.ads.zzfre r1 = com.google.android.gms.internal.ads.zzfre.zzj(r0)     // Catch:{ IOException -> 0x0126 }
            com.google.android.gms.internal.ads.zzbcc r4 = com.google.android.gms.internal.ads.zzbcl.zzdp     // Catch:{ IOException -> 0x0126 }
            com.google.android.gms.internal.ads.zzbcj r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ IOException -> 0x0126 }
            java.lang.Object r4 = r5.zza(r4)     // Catch:{ IOException -> 0x0126 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ IOException -> 0x0126 }
            long r4 = r4.longValue()     // Catch:{ IOException -> 0x0126 }
            com.google.android.gms.internal.ads.zzbzm r6 = com.google.android.gms.ads.internal.zzv.zzp()     // Catch:{ IOException -> 0x0126 }
            com.google.android.gms.ads.internal.util.zzg r6 = r6.zzi()     // Catch:{ IOException -> 0x0126 }
            boolean r6 = r6.zzN()     // Catch:{ IOException -> 0x0126 }
            com.google.android.gms.internal.ads.zzfra r1 = r1.zzh(r4, r6)     // Catch:{ IOException -> 0x0126 }
        L_0x007a:
            com.google.android.gms.internal.ads.zzbcc r4 = com.google.android.gms.internal.ads.zzbcl.zzdm     // Catch:{ IOException -> 0x0126 }
            com.google.android.gms.internal.ads.zzbcj r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ IOException -> 0x0126 }
            java.lang.Object r4 = r5.zza(r4)     // Catch:{ IOException -> 0x0126 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ IOException -> 0x0126 }
            boolean r4 = r4.booleanValue()     // Catch:{ IOException -> 0x0126 }
            if (r4 == 0) goto L_0x00a9
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4 = r9.zzd     // Catch:{ IOException -> 0x0126 }
            int r4 = r4.clientJarVersion     // Catch:{ IOException -> 0x0126 }
            com.google.android.gms.internal.ads.zzbcc r5 = com.google.android.gms.internal.ads.zzbcl.zzdl     // Catch:{ IOException -> 0x0126 }
            com.google.android.gms.internal.ads.zzbcj r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ IOException -> 0x0126 }
            java.lang.Object r5 = r6.zza(r5)     // Catch:{ IOException -> 0x0126 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ IOException -> 0x0126 }
            int r5 = r5.intValue()     // Catch:{ IOException -> 0x0126 }
            if (r4 >= r5) goto L_0x00a9
            com.google.android.gms.internal.ads.zzfrf r4 = com.google.android.gms.internal.ads.zzfrf.zzi(r0)     // Catch:{ IOException -> 0x0126 }
            r4.zzj()     // Catch:{ IOException -> 0x0126 }
        L_0x00a9:
            if (r7 != 0) goto L_0x00bd
            com.google.android.gms.internal.ads.zzbcc r4 = com.google.android.gms.internal.ads.zzbcl.zzdf     // Catch:{ IOException -> 0x0126 }
            com.google.android.gms.internal.ads.zzbcj r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ IOException -> 0x0126 }
            java.lang.Object r4 = r5.zza(r4)     // Catch:{ IOException -> 0x0126 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ IOException -> 0x0126 }
            boolean r4 = r4.booleanValue()     // Catch:{ IOException -> 0x0126 }
            if (r4 != 0) goto L_0x00d1
        L_0x00bd:
            if (r7 == 0) goto L_0x011b
            com.google.android.gms.internal.ads.zzbcc r4 = com.google.android.gms.internal.ads.zzbcl.zzdh     // Catch:{ IOException -> 0x0126 }
            com.google.android.gms.internal.ads.zzbcj r5 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ IOException -> 0x0126 }
            java.lang.Object r4 = r5.zza(r4)     // Catch:{ IOException -> 0x0126 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ IOException -> 0x0126 }
            boolean r4 = r4.booleanValue()     // Catch:{ IOException -> 0x0126 }
            if (r4 == 0) goto L_0x011b
        L_0x00d1:
            com.google.android.gms.internal.ads.zzfrf r4 = com.google.android.gms.internal.ads.zzfrf.zzi(r0)     // Catch:{ IOException -> 0x0126 }
            com.google.android.gms.internal.ads.zzfrb r0 = com.google.android.gms.internal.ads.zzfrb.zza(r0)     // Catch:{ IOException -> 0x0126 }
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r5 = r9.zzd     // Catch:{ IOException -> 0x0126 }
            int r5 = r5.clientJarVersion     // Catch:{ IOException -> 0x0126 }
            com.google.android.gms.internal.ads.zzbcc r6 = com.google.android.gms.internal.ads.zzbcl.zzdl     // Catch:{ IOException -> 0x0126 }
            com.google.android.gms.internal.ads.zzbcj r8 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ IOException -> 0x0126 }
            java.lang.Object r6 = r8.zza(r6)     // Catch:{ IOException -> 0x0126 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ IOException -> 0x0126 }
            int r6 = r6.intValue()     // Catch:{ IOException -> 0x0126 }
            if (r5 < r6) goto L_0x0113
            com.google.android.gms.internal.ads.zzbcc r2 = com.google.android.gms.internal.ads.zzbcl.zzdq     // Catch:{ IOException -> 0x0126 }
            com.google.android.gms.internal.ads.zzbcj r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ IOException -> 0x0126 }
            java.lang.Object r2 = r3.zza(r2)     // Catch:{ IOException -> 0x0126 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ IOException -> 0x0126 }
            long r2 = r2.longValue()     // Catch:{ IOException -> 0x0126 }
            com.google.android.gms.internal.ads.zzbzm r5 = com.google.android.gms.ads.internal.zzv.zzp()     // Catch:{ IOException -> 0x0126 }
            com.google.android.gms.ads.internal.util.zzg r5 = r5.zzi()     // Catch:{ IOException -> 0x0126 }
            boolean r5 = r5.zzN()     // Catch:{ IOException -> 0x0126 }
            com.google.android.gms.internal.ads.zzfra r2 = r4.zzh(r2, r5)     // Catch:{ IOException -> 0x0126 }
            boolean r3 = r0.zzd()     // Catch:{ IOException -> 0x0126 }
        L_0x0113:
            boolean r0 = r0.zze()     // Catch:{ IOException -> 0x0126 }
            r6 = r0
            r4 = r2
            r5 = r3
            goto L_0x011e
        L_0x011b:
            r4 = r2
            r5 = 1
            r6 = 1
        L_0x011e:
            com.google.android.gms.internal.ads.zzesm r0 = new com.google.android.gms.internal.ads.zzesm     // Catch:{ IOException -> 0x0126 }
            r2 = r0
            r3 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ IOException -> 0x0126 }
        L_0x0125:
            return r0
        L_0x0126:
            r0 = move-exception
            java.lang.String r1 = "PerAppIdSignal"
            com.google.android.gms.internal.ads.zzbzm r2 = com.google.android.gms.ads.internal.zzv.zzp()
            r2.zzw(r0, r1)
            com.google.android.gms.internal.ads.zzfcj r0 = r9.zzc
            com.google.android.gms.internal.ads.zzesm r1 = new com.google.android.gms.internal.ads.zzesm
            boolean r0 = r0.zzb()
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzesl.zzc():com.google.android.gms.internal.ads.zzesm");
    }
}
