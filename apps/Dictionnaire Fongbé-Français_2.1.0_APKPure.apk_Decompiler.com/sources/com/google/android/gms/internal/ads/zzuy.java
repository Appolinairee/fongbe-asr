package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzuy extends zzto {
    private static final zzar zza;
    private final zzui[] zzb;
    private final List zzc;
    private final zzbq[] zzd;
    private final ArrayList zze;
    private int zzf = -1;
    private long[][] zzg;
    private zzuv zzh;
    private final zztr zzi;

    static {
        zzaf zzaf = new zzaf();
        zzaf.zza("MergingMediaSource");
        zza = zzaf.zzc();
    }

    public zzuy(boolean z, boolean z2, zztr zztr, zzui... zzuiArr) {
        this.zzb = zzuiArr;
        this.zzi = zztr;
        this.zze = new ArrayList(Arrays.asList(zzuiArr));
        this.zzc = new ArrayList(zzuiArr.length);
        int i = 0;
        while (true) {
            int length = zzuiArr.length;
            if (i < length) {
                this.zzc.add(new ArrayList());
                i++;
            } else {
                this.zzd = new zzbq[length];
                this.zzg = new long[0][];
                new HashMap();
                zzfyt.zzb(8).zzb(2).zza();
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void zzA(Object obj, zzui zzui, zzbq zzbq) {
        int i;
        Integer num = (Integer) obj;
        if (this.zzh == null) {
            if (this.zzf == -1) {
                i = zzbq.zzb();
                this.zzf = i;
            } else {
                int zzb2 = zzbq.zzb();
                int i2 = this.zzf;
                if (zzb2 != i2) {
                    this.zzh = new zzuv(0);
                    return;
                }
                i = i2;
            }
            if (this.zzg.length == 0) {
                int[] iArr = new int[2];
                iArr[1] = this.zzd.length;
                iArr[0] = i;
                this.zzg = (long[][]) Array.newInstance(Long.TYPE, iArr);
            }
            this.zze.remove(zzui);
            this.zzd[num.intValue()] = zzbq;
            if (this.zze.isEmpty()) {
                zzo(this.zzd[0]);
            }
        }
    }

    public final void zzG(zzue zzue) {
        zzuu zzuu = (zzuu) zzue;
        for (int i = 0; i < this.zzb.length; i++) {
            List list = (List) this.zzc.get(i);
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                } else if (((zzuw) list.get(i2)).zzb.equals(zzue)) {
                    list.remove(i2);
                    break;
                } else {
                    i2++;
                }
            }
            this.zzb[i].zzG(zzuu.zzn(i));
        }
    }

    public final zzue zzI(zzug zzug, zzyk zzyk, long j) {
        zzbq[] zzbqArr = this.zzd;
        int length = this.zzb.length;
        zzue[] zzueArr = new zzue[length];
        int zza2 = zzbqArr[0].zza(zzug.zza);
        for (int i = 0; i < length; i++) {
            zzug zza3 = zzug.zza(this.zzd[i].zzf(zza2));
            zzueArr[i] = this.zzb[i].zzI(zza3, zzyk, j - this.zzg[zza2][i]);
            ((List) this.zzc.get(i)).add(new zzuw(zza3, zzueArr[i], (zzux) null));
        }
        return new zzuu(this.zzi, this.zzg[zza2], zzueArr);
    }

    public final zzar zzJ() {
        zzui[] zzuiArr = this.zzb;
        return zzuiArr.length > 0 ? zzuiArr[0].zzJ() : zza;
    }

    /* access modifiers changed from: protected */
    public final void zzn(zzgy zzgy) {
        super.zzn(zzgy);
        int i = 0;
        while (true) {
            zzui[] zzuiArr = this.zzb;
            if (i < zzuiArr.length) {
                zzB(Integer.valueOf(i), zzuiArr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void zzq() {
        super.zzq();
        Arrays.fill(this.zzd, (Object) null);
        this.zzf = -1;
        this.zzh = null;
        this.zze.clear();
        Collections.addAll(this.zze, this.zzb);
    }

    public final void zzt(zzar zzar) {
        this.zzb[0].zzt(zzar);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ zzug zzy(Object obj, zzug zzug) {
        List list = (List) this.zzc.get(((Integer) obj).intValue());
        for (int i = 0; i < list.size(); i++) {
            if (((zzuw) list.get(i)).zza.equals(zzug)) {
                return ((zzuw) ((List) this.zzc.get(0)).get(i)).zza;
            }
        }
        return null;
    }

    public final void zzz() throws IOException {
        zzuv zzuv = this.zzh;
        if (zzuv == null) {
            super.zzz();
            return;
        }
        throw zzuv;
    }
}
