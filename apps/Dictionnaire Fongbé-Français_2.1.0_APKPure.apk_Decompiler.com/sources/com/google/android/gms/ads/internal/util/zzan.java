package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzan implements DialogInterface.OnClickListener {
    public final /* synthetic */ AtomicInteger zza;

    public /* synthetic */ zzan(AtomicInteger atomicInteger) {
        this.zza = atomicInteger;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.set(i);
    }
}
