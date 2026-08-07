package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzalw implements zzakf {
    private final zzdy zza = new zzdy();
    private final zzalm zzb = new zzalm();

    public final void zza(byte[] bArr, int i, int i2, zzake zzake, zzdb zzdb) {
        this.zza.zzJ(bArr, i2 + i);
        this.zza.zzL(i);
        ArrayList arrayList = new ArrayList();
        try {
            zzdy zzdy = this.zza;
            int zzd = zzdy.zzd();
            String zzz = zzdy.zzz(StandardCharsets.UTF_8);
            if (zzz == null || !zzz.startsWith("WEBVTT")) {
                zzdy.zzL(zzd);
                throw zzbc.zza("Expected WEBVTT. Got ".concat(String.valueOf(zzdy.zzz(StandardCharsets.UTF_8))), (Throwable) null);
            }
            do {
            } while (!TextUtils.isEmpty(this.zza.zzz(StandardCharsets.UTF_8)));
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                zzdy zzdy2 = this.zza;
                char c = 65535;
                int i3 = 0;
                while (c == 65535) {
                    i3 = zzdy2.zzd();
                    String zzz2 = zzdy2.zzz(StandardCharsets.UTF_8);
                    if (zzz2 == null) {
                        c = 0;
                    } else if ("STYLE".equals(zzz2)) {
                        c = 2;
                    } else {
                        c = zzz2.startsWith("NOTE") ? (char) 1 : 3;
                    }
                }
                zzdy2.zzL(i3);
                if (c == 0) {
                    zzajz.zza(new zzalz(arrayList2), zzake, zzdb);
                    return;
                } else if (c == 1) {
                    do {
                    } while (!TextUtils.isEmpty(this.zza.zzz(StandardCharsets.UTF_8)));
                } else if (c != 2) {
                    zzalo zzc = zzalv.zzc(this.zza, arrayList);
                    if (zzc != null) {
                        arrayList2.add(zzc);
                    }
                } else if (arrayList2.isEmpty()) {
                    this.zza.zzz(StandardCharsets.UTF_8);
                    arrayList.addAll(this.zzb.zzb(this.zza));
                } else {
                    throw new IllegalArgumentException("A style block was found after the first cue.");
                }
            }
        } catch (zzbc e) {
            throw new IllegalArgumentException(e);
        }
    }
}
