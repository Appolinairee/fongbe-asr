package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbp {
    public static final Object zza = new Object();
    private static final zzar zzp;
    public Object zzb = zza;
    @Deprecated
    public Object zzc;
    public zzar zzd = zzp;
    public long zze;
    public long zzf;
    public long zzg;
    public boolean zzh;
    public boolean zzi;
    public zzal zzj;
    public boolean zzk;
    public long zzl;
    public long zzm;
    public int zzn;
    public int zzo;

    static {
        zzaf zzaf = new zzaf();
        zzaf.zza("androidx.media3.common.Timeline");
        zzaf.zzb(Uri.EMPTY);
        zzp = zzaf.zzc();
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            zzbp zzbp = (zzbp) obj;
            return Objects.equals(this.zzb, zzbp.zzb) && Objects.equals(this.zzd, zzbp.zzd) && Objects.equals(this.zzj, zzbp.zzj) && this.zze == zzbp.zze && this.zzf == zzbp.zzf && this.zzg == zzbp.zzg && this.zzh == zzbp.zzh && this.zzi == zzbp.zzi && this.zzk == zzbp.zzk && this.zzm == zzbp.zzm && this.zzn == zzbp.zzn && this.zzo == zzbp.zzo;
        }
    }

    public final int hashCode() {
        int i;
        int hashCode = ((this.zzb.hashCode() + 217) * 31) + this.zzd.hashCode();
        zzal zzal = this.zzj;
        if (zzal == null) {
            i = 0;
        } else {
            i = zzal.hashCode();
        }
        long j = this.zze;
        long j2 = this.zzf;
        long j3 = this.zzg;
        int i2 = (((((((((((((hashCode * 961) + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0)) * 31) + (this.zzk ? 1 : 0);
        long j4 = this.zzm;
        return ((((((i2 * 961) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.zzn) * 31) + this.zzo) * 31;
    }

    public final zzbp zza(Object obj, zzar zzar, Object obj2, long j, long j2, long j3, boolean z, boolean z2, zzal zzal, long j4, long j5, int i, int i2, long j6) {
        this.zzb = obj;
        this.zzd = zzar == null ? zzp : zzar;
        this.zzc = null;
        this.zze = -9223372036854775807L;
        this.zzf = -9223372036854775807L;
        this.zzg = -9223372036854775807L;
        this.zzh = z;
        this.zzi = z2;
        this.zzj = zzal;
        this.zzl = 0;
        this.zzm = j5;
        this.zzn = 0;
        this.zzo = 0;
        this.zzk = false;
        return this;
    }

    public final boolean zzb() {
        return this.zzj != null;
    }
}
