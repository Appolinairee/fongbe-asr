package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzddm extends zzdbj implements zzayk {
    private final Map zzb = new WeakHashMap(1);
    private final Context zzc;
    private final zzfbo zzd;

    public zzddm(Context context, Set set, zzfbo zzfbo) {
        super(set);
        this.zzc = context;
        this.zzd = zzfbo;
    }

    public final synchronized void zza(View view) {
        zzayl zzayl = (zzayl) this.zzb.get(view);
        if (zzayl == null) {
            zzayl zzayl2 = new zzayl(this.zzc, view);
            zzayl2.zzc(this);
            this.zzb.put(view, zzayl2);
            zzayl = zzayl2;
        }
        if (this.zzd.zzX) {
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzbx)).booleanValue()) {
                zzayl.zzg(((Long) zzbe.zzc().zza(zzbcl.zzbw)).longValue());
                return;
            }
        }
        zzayl.zzf();
    }

    public final synchronized void zzb(View view) {
        if (this.zzb.containsKey(view)) {
            ((zzayl) this.zzb.get(view)).zze(this);
            this.zzb.remove(view);
        }
    }

    public final synchronized void zzdn(zzayj zzayj) {
        zzq(new zzddl(zzayj));
    }
}
