package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzfwq extends AbstractSet {
    final /* synthetic */ zzfww zza;

    zzfwq(zzfww zzfww) {
        this.zza = zzfww;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final boolean contains(@CheckForNull Object obj) {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int zzd = this.zza.zzw(entry.getKey());
            if (zzd == -1 || !zzfuk.zza(zzfww.zzj(this.zza, zzd), entry.getValue())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        zzfww zzfww = this.zza;
        Map zzl = zzfww.zzl();
        if (zzl != null) {
            return zzl.entrySet().iterator();
        }
        return new zzfwo(zzfww);
    }

    public final boolean remove(@CheckForNull Object obj) {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        zzfww zzfww = this.zza;
        if (zzfww.zzr()) {
            return false;
        }
        int zzc = zzfww.zzv();
        Object key = entry.getKey();
        Object value = entry.getValue();
        zzfww zzfww2 = this.zza;
        int zzb = zzfwx.zzb(key, value, zzc, Objects.requireNonNull(zzfww2.zze), zzfww2.zzA(), zzfww2.zzB(), zzfww2.zzC());
        if (zzb == -1) {
            return false;
        }
        this.zza.zzq(zzb, zzc);
        zzfww zzfww3 = this.zza;
        zzfww3.zzg = zzfww3.zzg - 1;
        this.zza.zzo();
        return true;
    }

    public final int size() {
        return this.zza.size();
    }
}
