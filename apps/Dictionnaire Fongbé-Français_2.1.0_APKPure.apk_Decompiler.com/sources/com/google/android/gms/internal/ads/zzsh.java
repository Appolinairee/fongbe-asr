package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import io.flutter.plugin.platform.PlatformPlugin;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzsh {
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004e A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int zza(android.media.MediaCodecInfo.VideoCapabilities r2, int r3, int r4, double r5) {
        /*
            java.util.List r2 = r2.getSupportedPerformancePoints()
            r0 = 0
            if (r2 == 0) goto L_0x0050
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x000e
            goto L_0x0050
        L_0x000e:
            int r5 = (int) r5
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r3 = com.google.android.gms.internal.ads.zzoc$$ExternalSyntheticApiModelOutline2.m((int) r3, (int) r4, (int) r5)
            int r2 = zzc(r2, r3)
            r3 = 1
            if (r2 != r3) goto L_0x004f
            java.lang.Boolean r4 = com.google.android.gms.internal.ads.zzsi.zza
            if (r4 != 0) goto L_0x004f
            int r4 = com.google.android.gms.internal.ads.zzei.zza
            r5 = 35
            if (r4 < r5) goto L_0x0028
        L_0x0026:
            r3 = 0
            goto L_0x003d
        L_0x0028:
            int r4 = zzb(r0)
            int r5 = zzb(r3)
            if (r4 != 0) goto L_0x0033
            goto L_0x003d
        L_0x0033:
            r6 = 2
            if (r5 != 0) goto L_0x0039
            if (r4 == r6) goto L_0x0026
            goto L_0x003d
        L_0x0039:
            if (r4 != r6) goto L_0x003d
            if (r5 == r6) goto L_0x0026
        L_0x003d:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            com.google.android.gms.internal.ads.zzsi.zza = r3
            java.lang.Boolean r3 = com.google.android.gms.internal.ads.zzsi.zza
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x004f
            return r0
        L_0x004f:
            return r2
        L_0x0050:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsh.zza(android.media.MediaCodecInfo$VideoCapabilities, int, int, double):int");
    }

    private static int zzb(boolean z) {
        List m;
        try {
            zzz zzz = new zzz();
            zzz.zzaa("video/avc");
            zzab zzag = zzz.zzag();
            if (zzag.zzo != null) {
                List zze = zzta.zze(zzsp.zza, zzag, z, false);
                int i = 0;
                while (i < zze.size()) {
                    if (((zzsg) zze.get(i)).zzd == null || ((zzsg) zze.get(i)).zzd.getVideoCapabilities() == null || (m = ((zzsg) zze.get(i)).zzd.getVideoCapabilities().getSupportedPerformancePoints()) == null || m.isEmpty()) {
                        i++;
                    } else {
                        zzoc$$ExternalSyntheticApiModelOutline2.m$2();
                        return zzc(m, zzoc$$ExternalSyntheticApiModelOutline2.m((int) PlatformPlugin.DEFAULT_SYSTEM_UI, 720, 60));
                    }
                }
            }
        } catch (zzsu unused) {
        }
        return 0;
    }

    private static int zzc(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        for (int i = 0; i < list.size(); i++) {
            if (zzoc$$ExternalSyntheticApiModelOutline2.m(list.get(i)).covers(performancePoint)) {
                return 2;
            }
        }
        return 1;
    }
}
