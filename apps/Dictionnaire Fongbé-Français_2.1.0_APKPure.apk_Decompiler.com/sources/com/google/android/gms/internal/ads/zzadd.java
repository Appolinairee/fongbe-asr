package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzadd {
    private final zzdy zza = new zzdy(10);

    public final zzay zza(zzaco zzaco, zzage zzage) throws IOException {
        zzay zzay = null;
        int i = 0;
        while (true) {
            try {
                zzaco.zzh(this.zza.zzN(), 0, 10);
                this.zza.zzL(0);
                if (this.zza.zzo() != 4801587) {
                    break;
                }
                this.zza.zzM(3);
                int zzl = this.zza.zzl();
                int i2 = zzl + 10;
                if (zzay == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.zza.zzN(), 0, bArr, 0, 10);
                    zzaco.zzh(bArr, 10, zzl);
                    zzay = zzagg.zza(bArr, i2, zzage, new zzafi());
                } else {
                    zzaco.zzg(zzl);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        zzaco.zzj();
        zzaco.zzg(i);
        return zzay;
    }
}
