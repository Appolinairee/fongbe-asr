package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzall implements zzakf {
    private final zzdy zza = new zzdy();

    public final void zza(byte[] bArr, int i, int i2, zzake zzake, zzdb zzdb) {
        zzco zzco;
        this.zza.zzJ(bArr, i2 + i);
        this.zza.zzL(i);
        ArrayList arrayList = new ArrayList();
        while (true) {
            zzdy zzdy = this.zza;
            if (zzdy.zzb() > 0) {
                zzcw.zze(zzdy.zzb() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
                zzdy zzdy2 = this.zza;
                int zzg = zzdy2.zzg() - 8;
                if (zzdy2.zzg() == 1987343459) {
                    zzdy zzdy3 = this.zza;
                    CharSequence charSequence = null;
                    zzcm zzcm = null;
                    while (zzg > 0) {
                        zzcw.zze(zzg >= 8, "Incomplete vtt cue box header found.");
                        int zzg2 = zzdy3.zzg();
                        int zzg3 = zzdy3.zzg();
                        int i3 = zzg - 8;
                        int i4 = zzg2 - 8;
                        String zzC = zzei.zzC(zzdy3.zzN(), zzdy3.zzd(), i4);
                        zzdy3.zzM(i4);
                        if (zzg3 == 1937011815) {
                            zzcm = zzalv.zzb(zzC);
                        } else if (zzg3 == 1885436268) {
                            charSequence = zzalv.zza((String) null, zzC.trim(), Collections.emptyList());
                        }
                        zzg = i3 - i4;
                    }
                    if (charSequence == null) {
                        charSequence = "";
                    }
                    if (zzcm != null) {
                        zzcm.zzl(charSequence);
                        zzco = zzcm.zzp();
                    } else {
                        zzalt zzalt = new zzalt();
                        zzalt.zzc = charSequence;
                        zzco = zzalt.zza().zzp();
                    }
                    arrayList.add(zzco);
                } else {
                    this.zza.zzM(zzg);
                }
            } else {
                zzdb.zza(new zzajx(arrayList, -9223372036854775807L, -9223372036854775807L));
                return;
            }
        }
    }
}
