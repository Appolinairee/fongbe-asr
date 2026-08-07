package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbpa;
import com.google.android.gms.internal.ads.zzbpe;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public class LiteSdkInfo extends zzcv {
    public LiteSdkInfo(Context context) {
    }

    public zzbpe getAdapterCreator() {
        return new zzbpa();
    }

    public zzfb getLiteSdkVersion() {
        return new zzfb(ModuleDescriptor.MODULE_VERSION, 244410000, "23.6.0");
    }
}
