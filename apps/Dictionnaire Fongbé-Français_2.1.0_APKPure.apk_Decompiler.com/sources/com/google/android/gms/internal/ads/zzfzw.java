package com.google.android.gms.internal.ads;

import java.io.IOException;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzfzw extends zzfzz {
    final char[] zza;

    private zzfzw(zzfzv zzfzv) {
        super(zzfzv, (Character) null);
        this.zza = new char[512];
        zzfun.zze(zzfzv.zzf.length == 16);
        for (int i = 0; i < 256; i++) {
            this.zza[i] = zzfzv.zza(i >>> 4);
            this.zza[i | 256] = zzfzv.zza(i & 15);
        }
    }

    /* access modifiers changed from: package-private */
    public final int zza(byte[] bArr, CharSequence charSequence) throws zzfzy {
        if (charSequence.length() % 2 != 1) {
            int i = 0;
            int i2 = 0;
            while (i < charSequence.length()) {
                bArr[i2] = (byte) ((this.zzb.zzb(charSequence.charAt(i)) << 4) | this.zzb.zzb(charSequence.charAt(i + 1)));
                i += 2;
                i2++;
            }
            return i2;
        }
        int length = charSequence.length();
        throw new zzfzy("Invalid input length " + length);
    }

    /* access modifiers changed from: package-private */
    public final zzgaa zzb(zzfzv zzfzv, @CheckForNull Character ch) {
        return new zzfzw(zzfzv);
    }

    /* access modifiers changed from: package-private */
    public final void zzc(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        zzfun.zzk(0, i2, bArr.length);
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = bArr[i3] & 255;
            appendable.append(this.zza[b]);
            appendable.append(this.zza[b | 256]);
        }
    }

    zzfzw(String str, String str2) {
        this(new zzfzv("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
