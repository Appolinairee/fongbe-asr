package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzaza {
    int zza;
    private final Object zzb = new Object();
    private final List zzc = new LinkedList();

    public final void zza(zzayz zzayz) {
        synchronized (this.zzb) {
            if (this.zzc.size() >= 10) {
                int size = this.zzc.size();
                zzo.zze("Queue is full, current size = " + size);
                this.zzc.remove(0);
            }
            int i = this.zza;
            this.zza = i + 1;
            zzayz.zzg(i);
            zzayz.zzk();
            this.zzc.add(zzayz);
        }
    }

    public final boolean zzb(zzayz zzayz) {
        synchronized (this.zzb) {
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                zzayz zzayz2 = (zzayz) it.next();
                if (!zzv.zzp().zzi().zzK()) {
                    if (!zzayz.equals(zzayz2) && zzayz2.zzc().equals(zzayz.zzc())) {
                        it.remove();
                        return true;
                    }
                } else if (!zzv.zzp().zzi().zzL() && !zzayz.equals(zzayz2) && zzayz2.zzd().equals(zzayz.zzd())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean zzc(zzayz zzayz) {
        synchronized (this.zzb) {
            if (this.zzc.contains(zzayz)) {
                return true;
            }
            return false;
        }
    }
}
