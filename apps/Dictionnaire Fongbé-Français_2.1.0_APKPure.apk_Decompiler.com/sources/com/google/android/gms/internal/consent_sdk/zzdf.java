package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
final class zzdf extends zzdb {
    final transient Object zza;

    zzdf(Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    public final boolean contains(@CheckForNull Object obj) {
        return this.zza.equals(obj);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final /* synthetic */ Iterator iterator() {
        return new zzdc(this.zza);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        String obj = this.zza.toString();
        return "[" + obj + "]";
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i) {
        objArr[0] = this.zza;
        return 1;
    }

    public final zzdg zzd() {
        return new zzdc(this.zza);
    }
}
