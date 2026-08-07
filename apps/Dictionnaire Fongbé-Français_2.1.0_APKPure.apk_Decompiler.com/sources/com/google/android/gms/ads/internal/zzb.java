package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.internal.ads.zzbus;
import com.google.android.gms.internal.ads.zzbxu;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzb {
    private final Context zza;
    private boolean zzb;
    private final zzbxu zzc;
    private final zzbus zzd = new zzbus(false, Collections.emptyList());

    public zzb(Context context, zzbxu zzbxu, zzbus zzbus) {
        this.zza = context;
        this.zzc = zzbxu;
    }

    private final boolean zzd() {
        zzbxu zzbxu = this.zzc;
        return (zzbxu != null && zzbxu.zza().zzf) || this.zzd.zza;
    }

    public final void zza() {
        this.zzb = true;
    }

    public final void zzb(String str) {
        List<String> list;
        if (zzd()) {
            if (str == null) {
                str = "";
            }
            zzbxu zzbxu = this.zzc;
            if (zzbxu != null) {
                zzbxu.zzd(str, (Map) null, 3);
                return;
            }
            zzbus zzbus = this.zzd;
            if (zzbus.zza && (list = zzbus.zzb) != null) {
                for (String str2 : list) {
                    if (!TextUtils.isEmpty(str2)) {
                        String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                        Context context = this.zza;
                        zzv.zzq();
                        zzs.zzM(context, "", replace);
                    }
                }
            }
        }
    }

    public final boolean zzc() {
        return !zzd() || this.zzb;
    }
}
