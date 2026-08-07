package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzadb {
    private static final Pattern zzc = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int zza = -1;
    public int zzb = -1;

    private final boolean zzc(String str) {
        Matcher matcher = zzc.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            int i = zzei.zza;
            String str2 = group;
            int parseInt = Integer.parseInt(group, 16);
            String group2 = matcher.group(2);
            String str3 = group2;
            int parseInt2 = Integer.parseInt(group2, 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.zza = parseInt;
            this.zzb = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final boolean zza() {
        return (this.zza == -1 || this.zzb == -1) ? false : true;
    }

    public final boolean zzb(zzay zzay) {
        for (int i = 0; i < zzay.zza(); i++) {
            zzax zzb2 = zzay.zzb(i);
            if (zzb2 instanceof zzagb) {
                zzagb zzagb = (zzagb) zzb2;
                if ("iTunSMPB".equals(zzagb.zzb) && zzc(zzagb.zzc)) {
                    return true;
                }
            } else if (zzb2 instanceof zzagk) {
                zzagk zzagk = (zzagk) zzb2;
                if ("com.apple.iTunes".equals(zzagk.zza) && "iTunSMPB".equals(zzagk.zzb) && zzc(zzagk.zzc)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
