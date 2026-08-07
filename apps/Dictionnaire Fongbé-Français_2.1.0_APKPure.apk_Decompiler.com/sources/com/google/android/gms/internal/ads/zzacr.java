package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzacr {
    public static int zza(zzaco zzaco, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int zzb = zzaco.zzb(bArr, i + i3, i2 - i3);
            if (zzb == -1) {
                break;
            }
            i3 += zzb;
        }
        return i3;
    }

    @Pure
    public static void zzb(boolean z, String str) throws zzbc {
        if (!z) {
            throw zzbc.zza(str, (Throwable) null);
        }
    }

    public static boolean zzc(zzaco zzaco, byte[] bArr, int i, int i2, boolean z) throws IOException {
        try {
            return zzaco.zzm(bArr, 0, i2, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    public static boolean zzd(zzaco zzaco, byte[] bArr, int i, int i2) throws IOException {
        try {
            zzaco.zzi(bArr, i, i2);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zze(zzaco zzaco, int i) throws IOException {
        try {
            zzaco.zzk(i);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
