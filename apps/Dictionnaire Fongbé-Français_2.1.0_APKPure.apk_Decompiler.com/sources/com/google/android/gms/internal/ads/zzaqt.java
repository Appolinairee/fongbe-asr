package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzaqt {
    public static zzapp zza(Context context, zzaqa zzaqa) {
        zzaqb zzaqb;
        if (zzaqa == null) {
            zzaqb = new zzaqb(new zzaqn((zzaqm) null, (SSLSocketFactory) null));
        } else {
            zzaqb = new zzaqb(zzaqa);
        }
        zzapp zzapp = new zzapp(new zzaqi((zzaqh) new zzaqs(context.getApplicationContext()), 5242880), zzaqb, 4);
        zzapp.zzd();
        return zzapp;
    }
}
