package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzfuz implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzfvc zzb;

    zzfuz(zzfvc zzfvc, CharSequence charSequence) {
        this.zza = charSequence;
        this.zzb = zzfvc;
    }

    public final Iterator iterator() {
        return this.zzb.zzg(this.zza);
    }

    public final String toString() {
        String str = ", ";
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        zzfuf.zzb(sb, this, ", ");
        sb.append(']');
        return sb.toString();
    }
}
