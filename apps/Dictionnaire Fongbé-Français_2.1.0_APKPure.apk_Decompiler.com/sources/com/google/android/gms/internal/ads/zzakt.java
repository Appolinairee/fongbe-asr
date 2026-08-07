package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.zip.Inflater;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzakt implements zzakf {
    private final zzdy zza = new zzdy();
    private final zzdy zzb = new zzdy();
    private final zzaks zzc = new zzaks();
    private Inflater zzd;

    public final void zza(byte[] bArr, int i, int i2, zzake zzake, zzdb zzdb) {
        this.zza.zzJ(bArr, i2 + i);
        this.zza.zzL(i);
        zzdy zzdy = this.zza;
        if (zzdy.zzb() > 0 && zzdy.zzf() == 120) {
            if (this.zzd == null) {
                this.zzd = new Inflater();
            }
            if (zzei.zzH(zzdy, this.zzb, this.zzd)) {
                zzdy zzdy2 = this.zzb;
                zzdy.zzJ(zzdy2.zzN(), zzdy2.zze());
            }
        }
        this.zzc.zze();
        ArrayList arrayList = new ArrayList();
        while (true) {
            zzdy zzdy3 = this.zza;
            if (zzdy3.zzb() >= 3) {
                zzaks zzaks = this.zzc;
                int zze = zzdy3.zze();
                int zzm = zzdy3.zzm();
                int zzq = zzdy3.zzq();
                int zzd2 = zzdy3.zzd() + zzq;
                zzco zzco = null;
                if (zzd2 > zze) {
                    zzdy3.zzL(zze);
                } else {
                    if (zzm != 128) {
                        switch (zzm) {
                            case 20:
                                zzaks.zzd(zzaks, zzdy3, zzq);
                                break;
                            case 21:
                                zzaks.zzb(zzaks, zzdy3, zzq);
                                break;
                            case 22:
                                zzaks.zzc(zzaks, zzdy3, zzq);
                                break;
                        }
                    } else {
                        zzco zza2 = zzaks.zza();
                        zzaks.zze();
                        zzco = zza2;
                    }
                    zzdy3.zzL(zzd2);
                }
                if (zzco != null) {
                    arrayList.add(zzco);
                }
            } else {
                zzdb.zza(new zzajx(arrayList, -9223372036854775807L, -9223372036854775807L));
                return;
            }
        }
    }
}
