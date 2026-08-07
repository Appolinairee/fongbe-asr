package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzbzr extends ScheduledThreadPoolExecutor {
    zzbzr(int i, ThreadFactory threadFactory) {
        super(3, threadFactory);
    }
}
