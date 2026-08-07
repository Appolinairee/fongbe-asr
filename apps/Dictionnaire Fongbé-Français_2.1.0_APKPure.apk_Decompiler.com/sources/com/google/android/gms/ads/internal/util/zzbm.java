package com.google.android.gms.ads.internal.util;

import androidx.browser.trusted.sharing.ShareTarget;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.internal.ads.zzapi;
import com.google.android.gms.internal.ads.zzapm;
import com.google.android.gms.internal.ads.zzaps;
import com.google.android.gms.internal.ads.zzaqj;
import com.google.android.gms.internal.ads.zzcab;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbm extends zzapm {
    private final zzcab zza;
    private final zzl zzb;

    public zzbm(String str, Map map, zzcab zzcab) {
        super(0, str, new zzbl(zzcab));
        this.zza = zzcab;
        zzl zzl = new zzl((String) null);
        this.zzb = zzl;
        zzl.zzd(str, ShareTarget.METHOD_GET, (Map) null, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    public final zzaps zzh(zzapi zzapi) {
        return zzaps.zzb(zzapi, zzaqj.zzb(zzapi));
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void zzo(Object obj) {
        zzapi zzapi = (zzapi) obj;
        this.zzb.zzf(zzapi.zzc, zzapi.zza);
        byte[] bArr = zzapi.zzb;
        if (zzl.zzk() && bArr != null) {
            this.zzb.zzh(bArr);
        }
        this.zza.zzc(zzapi);
    }
}
