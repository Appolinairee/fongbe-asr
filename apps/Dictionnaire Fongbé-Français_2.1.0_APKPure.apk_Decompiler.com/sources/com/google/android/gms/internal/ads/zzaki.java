package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzaki implements zzadt {
    private final zzadt zza;
    private final zzakd zzb;
    private final zzdy zzc = new zzdy();
    private int zzd = 0;
    private int zze = 0;
    private byte[] zzf = zzei.zzf;
    private zzakf zzg;
    private zzab zzh;

    public zzaki(zzadt zzadt, zzakd zzakd) {
        this.zza = zzadt;
        this.zzb = zzakd;
    }

    private final void zzb(int i) {
        byte[] bArr;
        int length = this.zzf.length;
        int i2 = this.zze;
        if (length - i2 < i) {
            int i3 = i2 - this.zzd;
            int max = Math.max(i3 + i3, i + i3);
            byte[] bArr2 = this.zzf;
            if (max <= bArr2.length) {
                bArr = bArr2;
            } else {
                bArr = new byte[max];
            }
            System.arraycopy(bArr2, this.zzd, bArr, 0, i3);
            this.zzd = 0;
            this.zze = i3;
            this.zzf = bArr;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(long j, int i, zzajx zzajx) {
        zzcw.zzb(this.zzh);
        zzfxn<zzco> zzfxn = zzajx.zza;
        long j2 = zzajx.zzc;
        ArrayList arrayList = new ArrayList(zzfxn.size());
        for (zzco zza2 : zzfxn) {
            Bundle zza3 = zza2.zza();
            Bundle bundle = zza3;
            arrayList.add(zza3);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelableArrayList("c", arrayList);
        bundle2.putLong("d", j2);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle2);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        zzdy zzdy = this.zzc;
        int length = marshall.length;
        zzdy.zzJ(marshall, length);
        this.zza.zzr(this.zzc, length);
        long j3 = zzajx.zzb;
        if (j3 == -9223372036854775807L) {
            zzcw.zzf(this.zzh.zzt == Long.MAX_VALUE);
        } else {
            long j4 = this.zzh.zzt;
            j = j4 == Long.MAX_VALUE ? j + j3 : j3 + j4;
        }
        this.zza.zzt(j, i, length, 0, (zzads) null);
    }

    public final /* synthetic */ int zzf(zzl zzl, int i, boolean z) {
        return zzadr.zza(this, zzl, i, z);
    }

    public final int zzg(zzl zzl, int i, boolean z, int i2) throws IOException {
        if (this.zzg == null) {
            return this.zza.zzg(zzl, i, z, 0);
        }
        zzb(i);
        int zza2 = zzl.zza(this.zzf, this.zze, i);
        if (zza2 != -1) {
            this.zze += zza2;
            return zza2;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public final /* synthetic */ void zzl(long j) {
    }

    public final void zzm(zzab zzab) {
        String str = zzab.zzo;
        str.getClass();
        zzcw.zzd(zzbb.zzb(str) == 3);
        if (!zzab.equals(this.zzh)) {
            this.zzh = zzab;
            this.zzg = this.zzb.zzc(zzab) ? this.zzb.zzb(zzab) : null;
        }
        if (this.zzg == null) {
            this.zza.zzm(zzab);
            return;
        }
        zzadt zzadt = this.zza;
        zzz zzb2 = zzab.zzb();
        zzb2.zzaa("application/x-media3-cues");
        zzb2.zzA(zzab.zzo);
        zzb2.zzae(Long.MAX_VALUE);
        zzb2.zzE(this.zzb.zza(zzab));
        zzadt.zzm(zzb2.zzag());
    }

    public final /* synthetic */ void zzr(zzdy zzdy, int i) {
        zzadr.zzb(this, zzdy, i);
    }

    public final void zzs(zzdy zzdy, int i, int i2) {
        if (this.zzg == null) {
            this.zza.zzs(zzdy, i, i2);
            return;
        }
        zzb(i);
        zzdy.zzH(this.zzf, this.zze, i);
        this.zze += i;
    }

    public final void zzt(long j, int i, int i2, int i3, zzads zzads) {
        if (this.zzg == null) {
            this.zza.zzt(j, i, i2, i3, zzads);
            return;
        }
        zzcw.zze(zzads == null, "DRM on subtitles is not supported");
        int i4 = (this.zze - i3) - i2;
        this.zzg.zza(this.zzf, i4, i2, zzake.zza(), new zzakh(this, j, i));
        int i5 = i4 + i2;
        this.zzd = i5;
        if (i5 == this.zze) {
            this.zzd = 0;
            this.zze = 0;
        }
    }
}
