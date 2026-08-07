package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzadz {
    public static int zza(int i) {
        int i2 = 0;
        while (i > 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    public static zzay zzb(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            int i2 = zzei.zza;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                zzdo.zzf("VorbisUtil", "Failed to parse Vorbis comment: ".concat(String.valueOf(str)));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzafn.zzb(new zzdy(Base64.decode(split[1], 0))));
                } catch (RuntimeException e) {
                    zzdo.zzg("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new zzahe(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzay((List) arrayList);
    }

    public static zzadw zzc(zzdy zzdy, boolean z, boolean z2) throws zzbc {
        if (z) {
            zzd(3, zzdy, false);
        }
        String zzB = zzdy.zzB((int) zzdy.zzs(), StandardCharsets.UTF_8);
        int length = zzB.length();
        long zzs = zzdy.zzs();
        String[] strArr = new String[((int) zzs)];
        int i = length + 15;
        for (int i2 = 0; ((long) i2) < zzs; i2++) {
            String zzB2 = zzdy.zzB((int) zzdy.zzs(), StandardCharsets.UTF_8);
            strArr[i2] = zzB2;
            i = i + 4 + zzB2.length();
        }
        if (!z2 || (zzdy.zzm() & 1) != 0) {
            return new zzadw(zzB, strArr, i + 1);
        }
        throw zzbc.zza("framing bit expected to be set", (Throwable) null);
    }

    public static boolean zzd(int i, zzdy zzdy, boolean z) throws zzbc {
        if (zzdy.zzb() < 7) {
            if (z) {
                return false;
            }
            int zzb = zzdy.zzb();
            throw zzbc.zza("too short header: " + zzb, (Throwable) null);
        } else if (zzdy.zzm() != i) {
            if (z) {
                return false;
            }
            throw zzbc.zza("expected header type ".concat(String.valueOf(Integer.toHexString(i))), (Throwable) null);
        } else if (zzdy.zzm() == 118 && zzdy.zzm() == 111 && zzdy.zzm() == 114 && zzdy.zzm() == 98 && zzdy.zzm() == 105 && zzdy.zzm() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw zzbc.zza("expected characters 'vorbis'", (Throwable) null);
        }
    }
}
