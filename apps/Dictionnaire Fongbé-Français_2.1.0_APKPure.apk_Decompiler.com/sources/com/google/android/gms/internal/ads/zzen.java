package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzen extends zzeq {
    public final long zza;
    public final List zzb = new ArrayList();
    public final List zzc = new ArrayList();

    public zzen(int i, long j) {
        super(i, (zzep) null);
        this.zza = j;
    }

    public final String toString() {
        List list = this.zzb;
        String zze = zze(this.zzd);
        String arrays = Arrays.toString(list.toArray());
        String arrays2 = Arrays.toString(this.zzc.toArray());
        return zze + " leaves: " + arrays + " containers: " + arrays2;
    }

    public final zzen zza(int i) {
        int size = this.zzc.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzen zzen = (zzen) this.zzc.get(i2);
            if (zzen.zzd == i) {
                return zzen;
            }
        }
        return null;
    }

    public final zzeo zzb(int i) {
        int size = this.zzb.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzeo zzeo = (zzeo) this.zzb.get(i2);
            if (zzeo.zzd == i) {
                return zzeo;
            }
        }
        return null;
    }

    public final void zzc(zzen zzen) {
        this.zzc.add(zzen);
    }

    public final void zzd(zzeo zzeo) {
        this.zzb.add(zzeo);
    }
}
