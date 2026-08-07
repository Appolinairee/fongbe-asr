package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.internal.ads.zzapi;
import com.google.android.gms.internal.ads.zzapm;
import com.google.android.gms.internal.ads.zzapp;
import com.google.android.gms.internal.ads.zzapv;
import com.google.android.gms.internal.ads.zzaqa;
import com.google.android.gms.internal.ads.zzaqb;
import com.google.android.gms.internal.ads.zzaqi;
import com.google.android.gms.internal.ads.zzaqm;
import com.google.android.gms.internal.ads.zzaqn;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzblm;
import com.google.android.gms.internal.ads.zzfpu;
import com.google.android.gms.internal.ads.zzfpv;
import java.io.File;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzaz extends zzaqb {
    private final Context zzb;

    private zzaz(Context context, zzaqa zzaqa) {
        super(zzaqa);
        this.zzb = context;
    }

    public static zzapp zzb(Context context) {
        zzapp zzapp = new zzapp(new zzaqi(new File(zzfpv.zza(zzfpu.zza(), context.getCacheDir(), "admob_volley")), 20971520), new zzaz(context, new zzaqn((zzaqm) null, (SSLSocketFactory) null)), 4);
        zzapp.zzd();
        return zzapp;
    }

    public final zzapi zza(zzapm zzapm) throws zzapv {
        if (zzapm.zza() == 0) {
            if (Pattern.matches((String) zzbe.zzc().zza(zzbcl.zzex), zzapm.zzk())) {
                Context context = this.zzb;
                zzbc.zzb();
                if (zzf.zzs(context, 13400000)) {
                    zzapi zza = new zzblm(this.zzb).zza(zzapm);
                    if (zza != null) {
                        zze.zza("Got gmscore asset response: ".concat(String.valueOf(zzapm.zzk())));
                        return zza;
                    }
                    zze.zza("Failed to get gmscore asset response: ".concat(String.valueOf(zzapm.zzk())));
                }
            }
        }
        return super.zza(zzapm);
    }
}
