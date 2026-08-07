package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgvl implements zzgej {
    private static final byte[] zza = {0};
    private final zzgpy zzb;
    private final int zzc;
    private final byte[] zzd;
    private final byte[] zze;

    private zzgvl(zzgnx zzgnx) throws GeneralSecurityException {
        this.zzb = new zzgvi(zzgnx.zzd().zzd(zzgdw.zza()));
        this.zzc = zzgnx.zzb().zzb();
        this.zzd = zzgnx.zzc().zzc();
        if (zzgnx.zzb().zzf().equals(zzgod.zzc)) {
            this.zze = Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public static zzgej zza(zzgnx zzgnx) throws GeneralSecurityException {
        return new zzgvl(zzgnx);
    }

    public static zzgej zzb(zzgom zzgom) throws GeneralSecurityException {
        return new zzgvl(zzgom);
    }

    public final byte[] zzc(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = this.zze;
        if (bArr2.length > 0) {
            return zzguo.zzb(this.zzd, this.zzb.zza(zzguo.zzb(bArr, bArr2), this.zzc));
        }
        return zzguo.zzb(this.zzd, this.zzb.zza(bArr, this.zzc));
    }

    private zzgvl(zzgom zzgom) throws GeneralSecurityException {
        String valueOf = String.valueOf(String.valueOf(zzgom.zzb().zzf()));
        this.zzb = new zzgvk("HMAC".concat(valueOf), new SecretKeySpec(zzgom.zzd().zzd(zzgdw.zza()), "HMAC"));
        this.zzc = zzgom.zzb().zzb();
        this.zzd = zzgom.zzc().zzc();
        if (zzgom.zzb().zzg().equals(zzgou.zzc)) {
            this.zze = Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public zzgvl(zzgpy zzgpy, int i) throws GeneralSecurityException {
        this.zzb = zzgpy;
        this.zzc = i;
        this.zzd = new byte[0];
        this.zze = new byte[0];
        zzgpy.zza(new byte[0], i);
    }
}
