package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public abstract class zzfxq implements Map, Serializable {
    @CheckForNull
    private transient zzfxs zza;
    @CheckForNull
    private transient zzfxs zzb;
    @CheckForNull
    private transient zzfxi zzc;

    zzfxq() {
    }

    public static zzfxq zzc(Map map) {
        Set entrySet = map.entrySet();
        zzfxp zzfxp = new zzfxp(entrySet instanceof Collection ? entrySet.size() : 4);
        zzfxp.zzb(entrySet);
        return zzfxp.zzc();
    }

    public static zzfxq zzd() {
        return zzfze.zza;
    }

    public static zzfxq zze(Object obj, Object obj2) {
        zzfwk.zzb("dialog_not_shown_reason", obj2);
        return zzfze.zzj(1, new Object[]{"dialog_not_shown_reason", obj2}, (zzfxp) null);
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final boolean containsKey(@CheckForNull Object obj) {
        return get(obj) != null;
    }

    public final boolean containsValue(@CheckForNull Object obj) {
        return values().contains(obj);
    }

    public final boolean equals(@CheckForNull Object obj) {
        return zzfyk.zzb(this, obj);
    }

    @CheckForNull
    public abstract Object get(@CheckForNull Object obj);

    @CheckForNull
    public final Object getOrDefault(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public final int hashCode() {
        return zzfzp.zza(entrySet());
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    @CheckForNull
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @CheckForNull
    @Deprecated
    public final Object remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzfwk.zza(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public abstract zzfxi zza();

    /* renamed from: zzb */
    public final zzfxi values() {
        zzfxi zzfxi = this.zzc;
        if (zzfxi != null) {
            return zzfxi;
        }
        zzfxi zza2 = zza();
        this.zzc = zza2;
        return zza2;
    }

    /* access modifiers changed from: package-private */
    public abstract zzfxs zzf();

    /* access modifiers changed from: package-private */
    public abstract zzfxs zzg();

    /* renamed from: zzh */
    public final zzfxs entrySet() {
        zzfxs zzfxs = this.zza;
        if (zzfxs != null) {
            return zzfxs;
        }
        zzfxs zzf = zzf();
        this.zza = zzf;
        return zzf;
    }

    /* renamed from: zzi */
    public final zzfxs keySet() {
        zzfxs zzfxs = this.zzb;
        if (zzfxs != null) {
            return zzfxs;
        }
        zzfxs zzg = zzg();
        this.zzb = zzg;
        return zzg;
    }
}
