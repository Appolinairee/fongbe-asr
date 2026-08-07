package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public class zzsf extends zzhf {
    public final String zza;
    public final int zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzsf(Throwable th, zzsg zzsg) {
        super("Decoder failed: ".concat(String.valueOf(zzsg == null ? null : zzsg.zza)), th);
        int i;
        String str = null;
        boolean z = th instanceof MediaCodec.CodecException;
        str = z ? ((MediaCodec.CodecException) th).getDiagnosticInfo() : str;
        this.zza = str;
        if (zzei.zza >= 23) {
            i = z ? ((MediaCodec.CodecException) th).getErrorCode() : 0;
        } else {
            i = zzei.zzm(str);
        }
        this.zzb = i;
    }
}
