package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzchk implements zzher {
    public zzchk(zzcha zzcha) {
    }

    public final /* synthetic */ Object zzb() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.android.vending");
        intent.setData(Uri.parse("https://play.google.com/d"));
        Intent intent2 = intent;
        return intent;
    }
}
