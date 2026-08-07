package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzarc extends zzhea {
    private Date zzg;
    private Date zzh;
    private long zzi;
    private long zzj;
    private double zzk = 1.0d;
    private float zzl = 1.0f;
    private zzhek zzm = zzhek.zza;
    private long zzn;

    public zzarc() {
        super("mvhd");
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.zzg + ";modificationTime=" + this.zzh + ";timescale=" + this.zzi + ";duration=" + this.zzj + ";rate=" + this.zzk + ";volume=" + this.zzl + ";matrix=" + this.zzm + ";nextTrackId=" + this.zzn + "]";
    }

    public final long zzc() {
        return this.zzj;
    }

    public final long zzd() {
        return this.zzi;
    }

    public final void zze(ByteBuffer byteBuffer) {
        zzh(byteBuffer);
        if (zzg() == 1) {
            this.zzg = zzhef.zza(zzaqy.zzf(byteBuffer));
            this.zzh = zzhef.zza(zzaqy.zzf(byteBuffer));
            this.zzi = zzaqy.zze(byteBuffer);
            this.zzj = zzaqy.zzf(byteBuffer);
        } else {
            this.zzg = zzhef.zza(zzaqy.zze(byteBuffer));
            this.zzh = zzhef.zza(zzaqy.zze(byteBuffer));
            this.zzi = zzaqy.zze(byteBuffer);
            this.zzj = zzaqy.zze(byteBuffer);
        }
        this.zzk = zzaqy.zzb(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.zzl = ((float) ((short) ((bArr[1] & 255) | ((short) (65280 & (bArr[0] << 8)))))) / 256.0f;
        zzaqy.zzd(byteBuffer);
        zzaqy.zze(byteBuffer);
        zzaqy.zze(byteBuffer);
        double zzb = zzaqy.zzb(byteBuffer);
        double zzb2 = zzaqy.zzb(byteBuffer);
        double zza = zzaqy.zza(byteBuffer);
        this.zzm = new zzhek(zzb, zzb2, zzaqy.zzb(byteBuffer), zzaqy.zzb(byteBuffer), zza, zzaqy.zza(byteBuffer), zzaqy.zza(byteBuffer), zzaqy.zzb(byteBuffer), zzaqy.zzb(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.zzn = zzaqy.zze(byteBuffer);
    }
}
