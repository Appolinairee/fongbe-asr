package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.browser.trusted.sharing.ShareTarget;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzaou;
import com.google.android.gms.internal.ads.zzapp;
import com.google.android.gms.internal.ads.zzaqa;
import com.google.android.gms.internal.ads.zzaqt;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzcab;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbo {
    private static zzapp zza;
    private static final Object zzb = new Object();

    public zzbo(Context context) {
        zzapp zzapp;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (zzb) {
            if (zza == null) {
                zzbcl.zza(context);
                if (!ClientLibraryUtils.isPackageSide()) {
                    if (((Boolean) zzbe.zzc().zza(zzbcl.zzew)).booleanValue()) {
                        zzapp = zzaz.zzb(context);
                        zza = zzapp;
                    }
                }
                zzaqa zzaqa = null;
                zzapp = zzaqt.zza(context, (zzaqa) null);
                zza = zzapp;
            }
        }
    }

    public final ListenableFuture zza(String str) {
        zzcab zzcab = new zzcab();
        zza.zza(new zzbm(str, (Map) null, zzcab));
        return zzcab;
    }

    public final ListenableFuture zzb(int i, String str, Map map, byte[] bArr) {
        String str2 = str;
        zzbk zzbk = new zzbk((zzbn) null);
        zzbi zzbi = new zzbi(this, str2, zzbk);
        zzl zzl = new zzl((String) null);
        zzbj zzbj = new zzbj(this, i, str, zzbk, zzbi, bArr, map, zzl);
        if (zzl.zzk()) {
            try {
                zzl.zzd(str2, ShareTarget.METHOD_GET, zzbj.zzl(), zzbj.zzx());
            } catch (zzaou e) {
                zzo.zzj(e.getMessage());
            }
        }
        zza.zza(zzbj);
        return zzbk;
    }
}
