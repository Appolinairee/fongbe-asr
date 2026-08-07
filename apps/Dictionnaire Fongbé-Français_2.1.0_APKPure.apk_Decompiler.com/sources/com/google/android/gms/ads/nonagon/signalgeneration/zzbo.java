package com.google.android.gms.ads.nonagon.signalgeneration;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final /* synthetic */ class zzbo implements Callable {
    public final /* synthetic */ TaggingLibraryJsInterface zza;

    public /* synthetic */ zzbo(TaggingLibraryJsInterface taggingLibraryJsInterface) {
        this.zza = taggingLibraryJsInterface;
    }

    public final Object call() {
        return this.zza.getViewSignals();
    }
}
