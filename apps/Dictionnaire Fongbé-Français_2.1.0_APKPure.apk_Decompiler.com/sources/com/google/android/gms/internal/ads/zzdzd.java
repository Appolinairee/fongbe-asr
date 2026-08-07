package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzdzd implements zzgbo {
    public /* synthetic */ zzdzd(zzdzl zzdzl) {
    }

    public final ListenableFuture zza(Object obj) {
        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
        ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
        zzbzw.zza.execute(new zzfdj((InputStream) obj, createPipe[1]));
        return zzgch.zzh(parcelFileDescriptor);
    }
}
