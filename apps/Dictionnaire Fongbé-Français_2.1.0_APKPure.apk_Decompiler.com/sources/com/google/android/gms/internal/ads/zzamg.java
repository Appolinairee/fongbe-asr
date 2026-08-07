package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.common.primitives.SignedBytes;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzamg implements zzanw {
    private final List zza;

    public zzamg() {
        this(0);
    }

    public zzamg(int i, List list) {
        this.zza = list;
    }

    private final zzann zzc(zzanv zzanv) {
        return new zzann(zze(zzanv));
    }

    private final zzaoa zzd(zzanv zzanv) {
        return new zzaoa(zze(zzanv));
    }

    private final List zze(zzanv zzanv) {
        String str;
        int i;
        List list;
        zzdy zzdy = new zzdy(zzanv.zze);
        List list2 = this.zza;
        while (zzdy.zzb() > 0) {
            int zzm = zzdy.zzm();
            int zzd = zzdy.zzd() + zzdy.zzm();
            if (zzm == 134) {
                list2 = new ArrayList();
                int zzm2 = zzdy.zzm() & 31;
                for (int i2 = 0; i2 < zzm2; i2++) {
                    String zzB = zzdy.zzB(3, StandardCharsets.UTF_8);
                    int zzm3 = zzdy.zzm();
                    boolean z = (zzm3 & 128) != 0;
                    if (z) {
                        i = zzm3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte zzm4 = (byte) zzdy.zzm();
                    zzdy.zzM(1);
                    if (z) {
                        byte b = zzm4 & SignedBytes.MAX_POWER_OF_TWO;
                        int i3 = zzcy.zza;
                        list = Collections.singletonList(b != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    zzz zzz = new zzz();
                    zzz.zzaa(str);
                    zzz.zzQ(zzB);
                    zzz.zzx(i);
                    zzz.zzN(list);
                    list2.add(zzz.zzag());
                }
            }
            zzdy.zzL(zzd);
        }
        return list2;
    }

    public final SparseArray zza() {
        return new SparseArray();
    }

    public zzamg(int i) {
        this.zza = zzfxn.zzn();
    }

    public final zzany zzb(int i, zzanv zzanv) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new zzand(new zzamv(zzanv.zzb, zzanv.zza()));
            }
            if (i == 21) {
                return new zzand(new zzamt());
            }
            if (i == 27) {
                return new zzand(new zzamq(zzc(zzanv), false, false));
            }
            if (i == 36) {
                return new zzand(new zzams(zzc(zzanv)));
            }
            if (i == 45) {
                return new zzand(new zzamw());
            }
            if (i == 89) {
                return new zzand(new zzami(zzanv.zzd));
            }
            if (i == 172) {
                return new zzand(new zzamd(zzanv.zzb, zzanv.zza()));
            }
            if (i == 257) {
                return new zzanl(new zzanc("application/vnd.dvb.ait"));
            }
            if (i != 128) {
                if (i != 129) {
                    if (i != 138) {
                        if (i == 139) {
                            return new zzand(new zzamh(zzanv.zzb, zzanv.zza(), 5408));
                        }
                        switch (i) {
                            case 15:
                                return new zzand(new zzamf(false, zzanv.zzb, zzanv.zza()));
                            case 16:
                                return new zzand(new zzamo(zzd(zzanv)));
                            case 17:
                                return new zzand(new zzamu(zzanv.zzb, zzanv.zza()));
                            default:
                                switch (i) {
                                    case 134:
                                        return new zzanl(new zzanc("application/x-scte35"));
                                    case 135:
                                        break;
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                        }
                    }
                    return new zzand(new zzamh(zzanv.zzb, zzanv.zza(), 4096));
                }
                return new zzand(new zzamb(zzanv.zzb, zzanv.zza()));
            }
        }
        return new zzand(new zzaml(zzd(zzanv)));
    }
}
