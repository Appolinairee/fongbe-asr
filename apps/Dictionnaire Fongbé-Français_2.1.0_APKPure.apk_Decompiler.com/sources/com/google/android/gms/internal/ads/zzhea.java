package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public abstract class zzhea extends zzhdy implements zzaqz {
    private int zzg;

    protected zzhea(String str) {
        super("mvhd");
    }

    public final int zzg() {
        if (!this.zzb) {
            zzf();
        }
        return this.zzg;
    }

    /* access modifiers changed from: protected */
    public final long zzh(ByteBuffer byteBuffer) {
        this.zzg = zzaqy.zzc(byteBuffer.get());
        zzaqy.zzd(byteBuffer);
        byteBuffer.get();
        return 4;
    }
}
