package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzwj {
    public static final zzwj zza = new zzwj(new zzbr[0]);
    public final int zzb;
    private final zzfxn zzc;
    private int zzd;

    static {
        Integer.toString(0, 36);
    }

    public zzwj(zzbr... zzbrArr) {
        this.zzc = zzfxn.zzm(zzbrArr);
        this.zzb = zzbrArr.length;
        int i = 0;
        while (i < this.zzc.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.zzc.size(); i3++) {
                if (((zzbr) this.zzc.get(i)).equals(this.zzc.get(i3))) {
                    zzdo.zzd("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzwj zzwj = (zzwj) obj;
            return this.zzb == zzwj.zzb && this.zzc.equals(zzwj.zzc);
        }
    }

    public final int hashCode() {
        int i = this.zzd;
        if (i != 0) {
            return i;
        }
        int hashCode = this.zzc.hashCode();
        this.zzd = hashCode;
        return hashCode;
    }

    public final int zza(zzbr zzbr) {
        int indexOf = this.zzc.indexOf(zzbr);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final zzbr zzb(int i) {
        return (zzbr) this.zzc.get(i);
    }

    public final zzfxn zzc() {
        return zzfxn.zzl(zzfyd.zzb(this.zzc, new zzwi()));
    }
}
