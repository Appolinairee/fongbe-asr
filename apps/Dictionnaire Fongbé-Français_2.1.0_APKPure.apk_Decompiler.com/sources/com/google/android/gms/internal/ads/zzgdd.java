package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzgdd extends TimeoutException {
    /* synthetic */ zzgdd(String str, zzgde zzgde) {
        super(str);
    }

    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
