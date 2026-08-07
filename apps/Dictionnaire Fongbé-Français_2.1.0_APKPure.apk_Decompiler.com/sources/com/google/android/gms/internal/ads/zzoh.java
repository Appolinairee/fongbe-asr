package com.google.android.gms.internal.ads;

import android.media.AudioFormat;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzoh {
    public static final zzoh zza;
    public final int zzb;
    public final int zzc;
    private final zzfxs zzd;

    static {
        zzoh zzoh;
        if (zzei.zza >= 33) {
            zzfxr zzfxr = new zzfxr();
            for (int i = 1; i <= 10; i++) {
                zzfxr.zzf(Integer.valueOf(zzei.zzi(i)));
            }
            zzoh = new zzoh(2, (Set) zzfxr.zzi());
        } else {
            zzoh = new zzoh(2, 10);
        }
        zza = zzoh;
    }

    public zzoh(int i, int i2) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = null;
    }

    public zzoh(int i, Set set) {
        this.zzb = i;
        zzfxs zzl = zzfxs.zzl(set);
        this.zzd = zzl;
        zzfzt zze = zzl.iterator();
        int i2 = 0;
        while (zze.hasNext()) {
            i2 = Math.max(i2, Integer.bitCount(((Integer) zze.next()).intValue()));
        }
        this.zzc = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzoh)) {
            return false;
        }
        zzoh zzoh = (zzoh) obj;
        return this.zzb == zzoh.zzb && this.zzc == zzoh.zzc && Objects.equals(this.zzd, zzoh.zzd);
    }

    public final int hashCode() {
        zzfxs zzfxs = this.zzd;
        return (((this.zzb * 31) + this.zzc) * 31) + (zzfxs == null ? 0 : zzfxs.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzd);
        return "AudioProfile[format=" + this.zzb + ", maxChannelCount=" + this.zzc + ", channelMasks=" + valueOf + "]";
    }

    public final int zza(int i, zze zze) {
        if (this.zzd != null) {
            return this.zzc;
        }
        if (zzei.zza >= 29) {
            int i2 = this.zzb;
            for (int i3 = 10; i3 > 0; i3--) {
                int zzi = zzei.zzi(i3);
                if (zzi != 0 && zzoc$$ExternalSyntheticApiModelOutline2.m(new AudioFormat.Builder().setEncoding(i2).setSampleRate(i).setChannelMask(zzi).build(), zze.zza().zza)) {
                    return i3;
                }
            }
            return 0;
        }
        Integer num = (Integer) zzoi.zzb.getOrDefault(Integer.valueOf(this.zzb), 0);
        num.getClass();
        Integer num2 = num;
        return num.intValue();
    }

    public final boolean zzb(int i) {
        if (this.zzd == null) {
            return i <= this.zzc;
        }
        int zzi = zzei.zzi(i);
        if (zzi == 0) {
            return false;
        }
        return this.zzd.contains(Integer.valueOf(zzi));
    }
}
