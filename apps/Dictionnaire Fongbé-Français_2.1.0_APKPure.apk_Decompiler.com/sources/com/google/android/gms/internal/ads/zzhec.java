package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public class zzhec implements Iterator, Closeable, zzara {
    private static final zzaqz zza = new zzheb("eof ");
    protected zzaqw zzb;
    protected zzhed zzc;
    zzaqz zzd = null;
    long zze = 0;
    long zzf = 0;
    private final List zzg = new ArrayList();

    static {
        zzhej.zzb(zzhec.class);
    }

    public void close() throws IOException {
    }

    public final boolean hasNext() {
        zzaqz zzaqz = this.zzd;
        if (zzaqz == zza) {
            return false;
        }
        if (zzaqz != null) {
            return true;
        }
        try {
            this.zzd = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.zzd = zza;
            return false;
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.zzg.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(((zzaqz) this.zzg.get(i)).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: zzc */
    public final zzaqz next() {
        zzaqz zzb2;
        zzaqz zzaqz = this.zzd;
        if (zzaqz == null || zzaqz == zza) {
            zzhed zzhed = this.zzc;
            if (zzhed == null || this.zze >= this.zzf) {
                this.zzd = zza;
                throw new NoSuchElementException();
            }
            try {
                synchronized (zzhed) {
                    this.zzc.zze(this.zze);
                    zzb2 = this.zzb.zzb(this.zzc, this);
                    this.zze = this.zzc.zzb();
                }
                return zzb2;
            } catch (EOFException unused) {
                throw new NoSuchElementException();
            } catch (IOException unused2) {
                throw new NoSuchElementException();
            }
        } else {
            this.zzd = null;
            return zzaqz;
        }
    }

    public final List zzd() {
        return (this.zzc == null || this.zzd == zza) ? this.zzg : new zzhei(this.zzg, this);
    }

    public final void zze(zzhed zzhed, long j, zzaqw zzaqw) throws IOException {
        this.zzc = zzhed;
        this.zze = zzhed.zzb();
        zzhed.zze(zzhed.zzb() + j);
        this.zzf = zzhed.zzb();
        this.zzb = zzaqw;
    }
}
