package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzgzg implements zzgzv {
    private final zzgzc zza;
    private final zzhah zzb;
    private final boolean zzc;
    private final zzgxc zzd;

    private zzgzg(zzhah zzhah, zzgxc zzgxc, zzgzc zzgzc) {
        this.zzb = zzhah;
        this.zzc = zzgzc instanceof zzgxn;
        this.zzd = zzgxc;
        this.zza = zzgzc;
    }

    static zzgzg zzc(zzhah zzhah, zzgxc zzgxc, zzgzc zzgzc) {
        return new zzgzg(zzhah, zzgxc, zzgzc);
    }

    public final int zza(Object obj) {
        zzhai zzhai = ((zzgxr) obj).zzt;
        zzhai zzhai2 = zzhai;
        int zzb2 = zzhai.zzb();
        return this.zzc ? zzb2 + ((zzgxn) obj).zza.zzd() : zzb2;
    }

    public final int zzb(Object obj) {
        int hashCode = ((zzgxr) obj).zzt.hashCode();
        return this.zzc ? (hashCode * 53) + ((zzgxn) obj).zza.zza.hashCode() : hashCode;
    }

    public final Object zze() {
        zzgzc zzgzc = this.zza;
        if (zzgzc instanceof zzgxr) {
            return ((zzgxr) zzgzc).zzbj();
        }
        return zzgzc.zzcX().zzbs();
    }

    public final void zzf(Object obj) {
        this.zzb.zzi(obj);
        this.zzd.zza(obj);
    }

    public final void zzg(Object obj, Object obj2) {
        zzgzx.zzq(this.zzb, obj, obj2);
        if (this.zzc) {
            zzgzx.zzp(this.zzd, obj, obj2);
        }
    }

    public final void zzh(Object obj, zzgzp zzgzp, zzgxb zzgxb) throws IOException {
        this.zzb.zza(obj);
        zzgxn zzgxn = (zzgxn) obj;
        throw null;
    }

    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzgvx zzgvx) throws IOException {
        zzgxr zzgxr = (zzgxr) obj;
        if (zzgxr.zzt == zzhai.zzc()) {
            zzgxr.zzt = zzhai.zzf();
        }
        zzgxn zzgxn = (zzgxn) obj;
        throw null;
    }

    public final void zzj(Object obj, zzhaw zzhaw) throws IOException {
        Iterator zzf = ((zzgxn) obj).zza.zzf();
        while (zzf.hasNext()) {
            Map.Entry entry = (Map.Entry) zzf.next();
            zzgxf zzgxf = (zzgxf) entry.getKey();
            if (zzgxf.zzc() != zzhav.MESSAGE || zzgxf.zze() || zzgxf.zzd()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (entry instanceof zzgyj) {
                zzhaw.zzw(zzgxf.zza(), ((zzgyj) entry).zza().zzb());
            } else {
                zzhaw.zzw(zzgxf.zza(), entry.getValue());
            }
        }
        zzhai zzhai = ((zzgxr) obj).zzt;
        zzhai zzhai2 = zzhai;
        zzhai.zzk(zzhaw);
    }

    public final boolean zzk(Object obj, Object obj2) {
        if (!((zzgxr) obj).zzt.equals(((zzgxr) obj2).zzt)) {
            return false;
        }
        if (this.zzc) {
            return ((zzgxn) obj).zza.equals(((zzgxn) obj2).zza);
        }
        return true;
    }

    public final boolean zzl(Object obj) {
        return ((zzgxn) obj).zza.zzi();
    }
}
