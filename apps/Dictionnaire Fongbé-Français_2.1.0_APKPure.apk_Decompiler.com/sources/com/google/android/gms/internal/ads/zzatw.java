package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzatw implements Runnable {
    private zzatw() {
        throw null;
    }

    /* synthetic */ zzatw(zzatx zzatx) {
    }

    public final void run() {
        CountDownLatch countDownLatch;
        try {
            zzaty.zzd = MessageDigest.getInstance("MD5");
            countDownLatch = zzaty.zzb;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = zzaty.zzb;
        } catch (Throwable th) {
            zzaty.zzb.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
