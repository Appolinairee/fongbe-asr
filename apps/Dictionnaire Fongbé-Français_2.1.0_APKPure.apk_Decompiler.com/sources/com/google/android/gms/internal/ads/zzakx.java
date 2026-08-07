package com.google.android.gms.internal.ads;

import android.graphics.PointF;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzakx {
    private static final Pattern zzc = Pattern.compile("\\{([^}]*)\\}");
    private static final Pattern zzd = Pattern.compile(String.format(Locale.US, "\\\\pos\\((%1$s),(%1$s)\\)", new Object[]{"\\s*\\d+(?:\\.\\d+)?\\s*"}));
    private static final Pattern zze = Pattern.compile(String.format(Locale.US, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", new Object[]{"\\s*\\d+(?:\\.\\d+)?\\s*"}));
    private static final Pattern zzf = Pattern.compile("\\\\an(\\d+)");
    public final int zza;
    public final PointF zzb;

    private zzakx(int i, PointF pointF) {
        this.zza = i;
        this.zzb = pointF;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:19|(1:21)|22|23|(2:25|(1:27)(2:37|28))(1:29)|(2:31|41)(1:40)|35) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x008b */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0097 A[Catch:{ RuntimeException -> 0x00ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x000a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzakx zza(java.lang.String r12) {
        /*
            java.util.regex.Pattern r0 = zzc
            java.util.regex.Matcher r12 = r0.matcher(r12)
            r0 = 0
            r1 = -1
            r3 = r0
            r2 = -1
        L_0x000a:
            boolean r4 = r12.find()
            if (r4 == 0) goto L_0x00af
            r4 = 1
            java.lang.String r5 = r12.group(r4)
            r5.getClass()
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            java.util.regex.Pattern r6 = zzd     // Catch:{ RuntimeException -> 0x008b }
            java.util.regex.Matcher r6 = r6.matcher(r5)     // Catch:{ RuntimeException -> 0x008b }
            java.util.regex.Pattern r7 = zze     // Catch:{ RuntimeException -> 0x008b }
            java.util.regex.Matcher r7 = r7.matcher(r5)     // Catch:{ RuntimeException -> 0x008b }
            boolean r8 = r6.find()     // Catch:{ RuntimeException -> 0x008b }
            boolean r9 = r7.find()     // Catch:{ RuntimeException -> 0x008b }
            r10 = 2
            if (r8 == 0) goto L_0x0058
            if (r9 == 0) goto L_0x004f
            java.lang.String r7 = "SsaStyle.Overrides"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x008b }
            r8.<init>()     // Catch:{ RuntimeException -> 0x008b }
            java.lang.String r9 = "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='"
            r8.append(r9)     // Catch:{ RuntimeException -> 0x008b }
            r8.append(r5)     // Catch:{ RuntimeException -> 0x008b }
            java.lang.String r9 = "'"
            r8.append(r9)     // Catch:{ RuntimeException -> 0x008b }
            java.lang.String r8 = r8.toString()     // Catch:{ RuntimeException -> 0x008b }
            com.google.android.gms.internal.ads.zzdo.zze(r7, r8)     // Catch:{ RuntimeException -> 0x008b }
        L_0x004f:
            java.lang.String r7 = r6.group(r4)     // Catch:{ RuntimeException -> 0x008b }
            java.lang.String r6 = r6.group(r10)     // Catch:{ RuntimeException -> 0x008b }
            goto L_0x0065
        L_0x0058:
            if (r9 == 0) goto L_0x0087
            java.lang.String r6 = r7.group(r4)     // Catch:{ RuntimeException -> 0x008b }
            java.lang.String r7 = r7.group(r10)     // Catch:{ RuntimeException -> 0x008b }
            r11 = r7
            r7 = r6
            r6 = r11
        L_0x0065:
            android.graphics.PointF r8 = new android.graphics.PointF     // Catch:{ RuntimeException -> 0x008b }
            if (r7 == 0) goto L_0x0086
            r9 = r7
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ RuntimeException -> 0x008b }
            java.lang.String r7 = r7.trim()     // Catch:{ RuntimeException -> 0x008b }
            float r7 = java.lang.Float.parseFloat(r7)     // Catch:{ RuntimeException -> 0x008b }
            if (r6 == 0) goto L_0x0085
            r9 = r6
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ RuntimeException -> 0x008b }
            java.lang.String r6 = r6.trim()     // Catch:{ RuntimeException -> 0x008b }
            float r6 = java.lang.Float.parseFloat(r6)     // Catch:{ RuntimeException -> 0x008b }
            r8.<init>(r7, r6)     // Catch:{ RuntimeException -> 0x008b }
            goto L_0x0088
        L_0x0085:
            throw r0     // Catch:{ RuntimeException -> 0x008b }
        L_0x0086:
            throw r0     // Catch:{ RuntimeException -> 0x008b }
        L_0x0087:
            r8 = r0
        L_0x0088:
            if (r8 == 0) goto L_0x008b
            r3 = r8
        L_0x008b:
            java.util.regex.Pattern r6 = zzf     // Catch:{ RuntimeException -> 0x00ac }
            java.util.regex.Matcher r5 = r6.matcher(r5)     // Catch:{ RuntimeException -> 0x00ac }
            boolean r6 = r5.find()     // Catch:{ RuntimeException -> 0x00ac }
            if (r6 == 0) goto L_0x00a6
            java.lang.String r4 = r5.group(r4)     // Catch:{ RuntimeException -> 0x00ac }
            if (r4 == 0) goto L_0x00a5
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ RuntimeException -> 0x00ac }
            int r4 = com.google.android.gms.internal.ads.zzaky.zzd(r4)     // Catch:{ RuntimeException -> 0x00ac }
            goto L_0x00a7
        L_0x00a5:
            throw r0     // Catch:{ RuntimeException -> 0x00ac }
        L_0x00a6:
            r4 = -1
        L_0x00a7:
            if (r4 == r1) goto L_0x000a
            r2 = r4
            goto L_0x000a
        L_0x00ac:
            goto L_0x000a
        L_0x00af:
            com.google.android.gms.internal.ads.zzakx r12 = new com.google.android.gms.internal.ads.zzakx
            r12.<init>(r2, r3)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakx.zza(java.lang.String):com.google.android.gms.internal.ads.zzakx");
    }

    public static String zzb(String str) {
        return zzc.matcher(str).replaceAll("");
    }
}
