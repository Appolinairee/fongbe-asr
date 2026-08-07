package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfw extends zzfr {
    private zzgd zza;
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzfw() {
        super(false);
    }

    public final int zza(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.zzd;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.zzb;
        int i4 = zzei.zza;
        System.arraycopy(bArr2, this.zzc, bArr, i, min);
        this.zzc += min;
        this.zzd -= min;
        zzg(min);
        return min;
    }

    public final long zzb(zzgd zzgd) throws IOException {
        zzi(zzgd);
        this.zza = zzgd;
        Uri normalizeScheme = zzgd.zza.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        zzcw.zze("data".equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        int i = zzei.zza;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.zzb = Base64.decode(str, 0);
                } catch (IllegalArgumentException e) {
                    throw zzbc.zzb("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e);
                }
            } else {
                this.zzb = URLDecoder.decode(str, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
            }
            long j = zzgd.zze;
            int length = this.zzb.length;
            if (j <= ((long) length)) {
                int i2 = (int) j;
                this.zzc = i2;
                int i3 = length - i2;
                this.zzd = i3;
                long j2 = zzgd.zzf;
                if (j2 != -1) {
                    this.zzd = (int) Math.min((long) i3, j2);
                }
                zzj(zzgd);
                long j3 = zzgd.zzf;
                return j3 != -1 ? j3 : (long) this.zzd;
            }
            this.zzb = null;
            throw new zzfz(2008);
        }
        throw zzbc.zzb("Unexpected URI format: ".concat(String.valueOf(String.valueOf(normalizeScheme))), (Throwable) null);
    }

    public final Uri zzc() {
        zzgd zzgd = this.zza;
        if (zzgd != null) {
            return zzgd.zza;
        }
        return null;
    }

    public final void zzd() {
        if (this.zzb != null) {
            this.zzb = null;
            zzh();
        }
        this.zza = null;
    }
}
