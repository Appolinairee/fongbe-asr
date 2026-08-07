package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzce {
    private final zzfxn zza;
    private final List zzb = new ArrayList();
    private ByteBuffer[] zzc = new ByteBuffer[0];
    private boolean zzd;

    public zzce(zzfxn zzfxn) {
        this.zza = zzfxn;
        zzcf zzcf = zzcf.zza;
        this.zzd = false;
    }

    private final int zzi() {
        return this.zzc.length - 1;
    }

    private final void zzj(ByteBuffer byteBuffer) {
        boolean z;
        ByteBuffer byteBuffer2;
        do {
            z = false;
            for (int i = 0; i <= zzi(); i++) {
                if (!this.zzc[i].hasRemaining()) {
                    zzch zzch = (zzch) this.zzb.get(i);
                    if (!zzch.zzh()) {
                        if (i > 0) {
                            byteBuffer2 = this.zzc[i - 1];
                        } else {
                            byteBuffer2 = byteBuffer.hasRemaining() ? byteBuffer : zzch.zza;
                        }
                        zzch.zze(byteBuffer2);
                        this.zzc[i] = zzch.zzb();
                        boolean z2 = true;
                        if (((long) byteBuffer2.remaining()) - ((long) byteBuffer2.remaining()) <= 0 && !this.zzc[i].hasRemaining()) {
                            z2 = false;
                        }
                        z |= z2;
                    } else if (!this.zzc[i].hasRemaining() && i < zzi()) {
                        ((zzch) this.zzb.get(i + 1)).zzd();
                    }
                }
            }
        } while (z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzce)) {
            return false;
        }
        zzce zzce = (zzce) obj;
        if (this.zza.size() != zzce.zza.size()) {
            return false;
        }
        for (int i = 0; i < this.zza.size(); i++) {
            if (this.zza.get(i) != zzce.zza.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final zzcf zza(zzcf zzcf) throws zzcg {
        if (!zzcf.equals(zzcf.zza)) {
            for (int i = 0; i < this.zza.size(); i++) {
                zzch zzch = (zzch) this.zza.get(i);
                zzcf zza2 = zzch.zza(zzcf);
                if (zzch.zzg()) {
                    zzcw.zzf(!zza2.equals(zzcf.zza));
                    zzcf = zza2;
                }
            }
            return zzcf;
        }
        throw new zzcg("Unhandled input format:", zzcf);
    }

    public final ByteBuffer zzb() {
        if (!zzh()) {
            return zzch.zza;
        }
        ByteBuffer byteBuffer = this.zzc[zzi()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        zzj(zzch.zza);
        return this.zzc[zzi()];
    }

    public final void zzc() {
        this.zzb.clear();
        this.zzd = false;
        for (int i = 0; i < this.zza.size(); i++) {
            zzch zzch = (zzch) this.zza.get(i);
            zzch.zzc();
            if (zzch.zzg()) {
                this.zzb.add(zzch);
            }
        }
        this.zzc = new ByteBuffer[this.zzb.size()];
        for (int i2 = 0; i2 <= zzi(); i2++) {
            this.zzc[i2] = ((zzch) this.zzb.get(i2)).zzb();
        }
    }

    public final void zzd() {
        if (zzh() && !this.zzd) {
            this.zzd = true;
            ((zzch) this.zzb.get(0)).zzd();
        }
    }

    public final void zze(ByteBuffer byteBuffer) {
        if (zzh() && !this.zzd) {
            zzj(byteBuffer);
        }
    }

    public final void zzf() {
        for (int i = 0; i < this.zza.size(); i++) {
            zzch zzch = (zzch) this.zza.get(i);
            zzch.zzc();
            zzch.zzf();
        }
        this.zzc = new ByteBuffer[0];
        zzcf zzcf = zzcf.zza;
        this.zzd = false;
    }

    public final boolean zzg() {
        return this.zzd && ((zzch) this.zzb.get(zzi())).zzh() && !this.zzc[zzi()].hasRemaining();
    }

    public final boolean zzh() {
        return !this.zzb.isEmpty();
    }
}
