package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzaf {
    private String zza;
    private Uri zzb;
    private final zzag zzc = new zzag();
    private final List zzd;
    private final zzfxn zze;
    private final zzak zzf;
    private final zzao zzg;

    public zzaf() {
        zzfxn.zzn();
        this.zzd = Collections.emptyList();
        this.zze = zzfxn.zzn();
        this.zzf = new zzak();
        this.zzg = zzao.zza;
    }

    public final zzaf zza(String str) {
        String str2 = str;
        this.zza = str;
        return this;
    }

    public final zzaf zzb(Uri uri) {
        this.zzb = uri;
        return this;
    }

    public final zzar zzc() {
        Uri uri = this.zzb;
        zzam zzam = uri != null ? new zzam(uri, (String) null, (zzaj) null, (zzae) null, this.zzd, (String) null, this.zze, (Object) null, -9223372036854775807L, (zzaq) null) : null;
        String str = this.zza;
        if (str == null) {
            str = "";
        }
        return new zzar(str, new zzai(this.zzc, (zzaq) null), zzam, new zzal(this.zzf, (zzaq) null), zzav.zza, this.zzg, (zzaq) null);
    }
}
