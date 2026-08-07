package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgr extends zzgp {
    public final int zzc;

    public zzgr(int i, String str, IOException iOException, Map map, zzgd zzgd, byte[] bArr) {
        super("Response code: " + i, iOException, zzgd, 2004, 1);
        this.zzc = i;
    }
}
