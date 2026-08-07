package com.google.android.gms.internal.ads;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgha implements zzgdn {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = new byte[0];
    private static final Set zzc;
    private final String zzd;
    private final zzgdn zze;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzc = Collections.unmodifiableSet(hashSet);
    }

    @Deprecated
    zzgha(zzgsp zzgsp, zzgdn zzgdn) throws GeneralSecurityException {
        if (zzc.contains(zzgsp.zzi())) {
            this.zzd = zzgsp.zzi();
            zzgsn zzb2 = zzgsp.zzb(zzgsp);
            zzb2.zza(zzgtp.RAW);
            zzgeq.zza(((zzgsp) zzb2.zzbr()).zzaV());
            this.zze = zzgdn;
            return;
        }
        String zzi = zzgsp.zzi();
        throw new IllegalArgumentException("Unsupported DEK key type: " + zzi + ". Only Tink AEAD key types are supported.");
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i = wrap.getInt();
            if (i <= 0 || i > 4096 || i > bArr.length - 4) {
                throw new GeneralSecurityException("length of encrypted DEK too large");
            }
            byte[] bArr3 = new byte[i];
            wrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            byte[] zza2 = this.zze.zza(bArr3, zzb);
            String str = this.zzd;
            zzgwj zzgwj = zzgwj.zzb;
            return ((zzgdn) zzgmh.zza().zzc(zzgmk.zzc().zza(zzgnh.zza(str, zzgwj.zzv(zza2, 0, zza2.length), zzgsj.SYMMETRIC, zzgtp.RAW, (Integer) null), zzgdw.zza()), zzgdn.class)).zza(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e) {
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
