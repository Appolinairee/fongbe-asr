package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzgsx extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzgsx zza;
    private static volatile zzgzk zzb;
    /* access modifiers changed from: private */
    public int zzc;
    private zzgyd zzd = zzbK();

    static {
        zzgsx zzgsx = new zzgsx();
        zza = zzgsx;
        zzgxr.zzbZ(zzgsx.class, zzgsx);
    }

    private zzgsx() {
    }

    public static zzgst zzc() {
        return (zzgst) zza.zzaZ();
    }

    public static zzgsx zzg(InputStream inputStream, zzgxb zzgxb) throws IOException {
        return (zzgsx) zzgxr.zzbu(zza, inputStream, zzgxb);
    }

    static /* synthetic */ void zzi(zzgsx zzgsx, zzgsv zzgsv) {
        zzgsv.getClass();
        zzgyd zzgyd = zzgsx.zzd;
        if (!zzgyd.zzc()) {
            zzgsx.zzd = zzgxr.zzbL(zzgyd);
        }
        zzgsx.zzd.add(zzgsv);
    }

    public final int zza() {
        return this.zzd.size();
    }

    public final int zzb() {
        return this.zzc;
    }

    public final zzgsv zzd(int i) {
        return (zzgsv) this.zzd.get(i);
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzc", "zzd", zzgsv.class});
        } else if (ordinal == 3) {
            return new zzgsx();
        } else {
            if (ordinal == 4) {
                return new zzgst((zzgsw) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzgsx.class) {
                        zzgzk = zzb;
                        if (zzgzk == null) {
                            zzgzk = new zzgxm(zza);
                            zzb = zzgzk;
                        }
                    }
                }
                return zzgzk;
            }
            throw null;
        }
    }

    public final List zzh() {
        return this.zzd;
    }
}
