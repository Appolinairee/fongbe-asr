package com.google.android.gms.ads.internal.util;

import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.internal.ads.zzaou;
import com.google.android.gms.internal.ads.zzapq;
import com.google.android.gms.internal.ads.zzapr;
import com.google.android.gms.internal.ads.zzaqr;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzbj extends zzaqr {
    final /* synthetic */ byte[] zza;
    final /* synthetic */ Map zzb;
    final /* synthetic */ zzl zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzbj(zzbo zzbo, int i, String str, zzapr zzapr, zzapq zzapq, byte[] bArr, Map map, zzl zzl) {
        super(i, str, zzapr, zzapq);
        this.zza = bArr;
        this.zzb = map;
        this.zzc = zzl;
    }

    public final Map zzl() throws zzaou {
        Map map = this.zzb;
        return map == null ? Collections.emptyMap() : map;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void zzo(Object obj) {
        zzo((String) obj);
    }

    public final byte[] zzx() throws zzaou {
        byte[] bArr = this.zza;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    public final void zzz(String str) {
        this.zzc.zzg(str);
        super.zzo(str);
    }
}
