package com.google.android.gms.internal.ads;

import android.os.HandlerThread;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzrl implements zzsb {
    private final zzfvf zza;
    private final zzfvf zzb;
    private boolean zzc = true;

    public zzrl(int i) {
        zzrj zzrj = new zzrj(i);
        zzrk zzrk = new zzrk(i);
        this.zza = zzrj;
        this.zzb = zzrk;
    }

    static /* synthetic */ HandlerThread zza(int i) {
        return new HandlerThread(zzrn.zzt(i, "ExoPlayer:MediaCodecAsyncAdapter:"));
    }

    static /* synthetic */ HandlerThread zzb(int i) {
        return new HandlerThread(zzrn.zzt(i, "ExoPlayer:MediaCodecQueueingThread:"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzrn zzc(com.google.android.gms.internal.ads.zzsa r12) throws java.io.IOException {
        /*
            r11 = this;
            java.lang.String r0 = "createCodec:"
            com.google.android.gms.internal.ads.zzsg r1 = r12.zza
            java.lang.String r1 = r1.zza
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x008a }
            r3.<init>(r0)     // Catch:{ Exception -> 0x008a }
            r3.append(r1)     // Catch:{ Exception -> 0x008a }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x008a }
            android.os.Trace.beginSection(r0)     // Catch:{ Exception -> 0x008a }
            android.media.MediaCodec r0 = android.media.MediaCodec.createByCodecName(r1)     // Catch:{ Exception -> 0x008a }
            boolean r1 = r11.zzc     // Catch:{ Exception -> 0x0088 }
            r9 = 35
            if (r1 == 0) goto L_0x003e
            com.google.android.gms.internal.ads.zzab r1 = r12.zzc     // Catch:{ Exception -> 0x0088 }
            int r3 = com.google.android.gms.internal.ads.zzei.zza     // Catch:{ Exception -> 0x0088 }
            r4 = 34
            if (r3 >= r4) goto L_0x0029
            goto L_0x003e
        L_0x0029:
            int r3 = com.google.android.gms.internal.ads.zzei.zza     // Catch:{ Exception -> 0x0088 }
            if (r3 >= r9) goto L_0x0035
            java.lang.String r1 = r1.zzo     // Catch:{ Exception -> 0x0088 }
            boolean r1 = com.google.android.gms.internal.ads.zzbb.zzi(r1)     // Catch:{ Exception -> 0x0088 }
            if (r1 == 0) goto L_0x003e
        L_0x0035:
            com.google.android.gms.internal.ads.zztd r1 = new com.google.android.gms.internal.ads.zztd     // Catch:{ Exception -> 0x0088 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0088 }
            r3 = 4
            r6 = r1
            r1 = 4
            goto L_0x0053
        L_0x003e:
            com.google.android.gms.internal.ads.zzrr r1 = new com.google.android.gms.internal.ads.zzrr     // Catch:{ Exception -> 0x0088 }
            com.google.android.gms.internal.ads.zzfvf r3 = r11.zzb     // Catch:{ Exception -> 0x0088 }
            com.google.android.gms.internal.ads.zzrk r3 = (com.google.android.gms.internal.ads.zzrk) r3     // Catch:{ Exception -> 0x0088 }
            int r3 = r3.zza     // Catch:{ Exception -> 0x0088 }
            android.os.HandlerThread r3 = zzb(r3)     // Catch:{ Exception -> 0x0088 }
            r4 = r3
            android.os.HandlerThread r4 = (android.os.HandlerThread) r4     // Catch:{ Exception -> 0x0088 }
            r1.<init>(r0, r3)     // Catch:{ Exception -> 0x0088 }
            r3 = 0
            r6 = r1
            r1 = 0
        L_0x0053:
            com.google.android.gms.internal.ads.zzrn r10 = new com.google.android.gms.internal.ads.zzrn     // Catch:{ Exception -> 0x0088 }
            com.google.android.gms.internal.ads.zzfvf r3 = r11.zza     // Catch:{ Exception -> 0x0088 }
            com.google.android.gms.internal.ads.zzrj r3 = (com.google.android.gms.internal.ads.zzrj) r3     // Catch:{ Exception -> 0x0088 }
            int r3 = r3.zza     // Catch:{ Exception -> 0x0088 }
            android.os.HandlerThread r5 = zza(r3)     // Catch:{ Exception -> 0x0088 }
            r3 = r5
            android.os.HandlerThread r3 = (android.os.HandlerThread) r3     // Catch:{ Exception -> 0x0088 }
            com.google.android.gms.internal.ads.zzrz r7 = r12.zzf     // Catch:{ Exception -> 0x0088 }
            r8 = 0
            r3 = r10
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0088 }
            android.os.Trace.endSection()     // Catch:{ Exception -> 0x0085 }
            android.view.Surface r3 = r12.zzd     // Catch:{ Exception -> 0x0085 }
            if (r3 != 0) goto L_0x007d
            com.google.android.gms.internal.ads.zzsg r3 = r12.zza     // Catch:{ Exception -> 0x0085 }
            boolean r3 = r3.zzh     // Catch:{ Exception -> 0x0085 }
            if (r3 == 0) goto L_0x007d
            int r3 = com.google.android.gms.internal.ads.zzei.zza     // Catch:{ Exception -> 0x0085 }
            if (r3 < r9) goto L_0x007d
            r1 = r1 | 8
        L_0x007d:
            android.media.MediaFormat r3 = r12.zzb     // Catch:{ Exception -> 0x0085 }
            android.view.Surface r12 = r12.zzd     // Catch:{ Exception -> 0x0085 }
            com.google.android.gms.internal.ads.zzrn.zzh(r10, r3, r12, r2, r1)     // Catch:{ Exception -> 0x0085 }
            return r10
        L_0x0085:
            r12 = move-exception
            r2 = r10
            goto L_0x008c
        L_0x0088:
            r12 = move-exception
            goto L_0x008c
        L_0x008a:
            r12 = move-exception
            r0 = r2
        L_0x008c:
            if (r2 != 0) goto L_0x0094
            if (r0 == 0) goto L_0x0097
            r0.release()
            goto L_0x0097
        L_0x0094:
            r2.zzm()
        L_0x0097:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrl.zzc(com.google.android.gms.internal.ads.zzsa):com.google.android.gms.internal.ads.zzrn");
    }

    public final /* bridge */ /* synthetic */ zzsd zzd(zzsa zzsa) throws IOException {
        throw null;
    }

    public final void zze(boolean z) {
        this.zzc = true;
    }
}
