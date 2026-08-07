package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzalh {
    public static zzali zza(zzali zzali, String[] strArr, Map map) {
        int length;
        int i = 0;
        if (zzali == null) {
            if (strArr == null) {
                return null;
            }
            int length2 = strArr.length;
            if (length2 == 1) {
                return (zzali) map.get(strArr[0]);
            }
            if (length2 > 1) {
                zzali zzali2 = new zzali();
                while (i < length2) {
                    zzali2.zzl((zzali) map.get(strArr[i]));
                    i++;
                }
                return zzali2;
            }
        } else if (strArr != null && strArr.length == 1) {
            zzali.zzl((zzali) map.get(strArr[0]));
            return zzali;
        } else if (strArr != null && (length = strArr.length) > 1) {
            while (i < length) {
                zzali.zzl((zzali) map.get(strArr[i]));
                i++;
            }
        }
        return zzali;
    }
}
