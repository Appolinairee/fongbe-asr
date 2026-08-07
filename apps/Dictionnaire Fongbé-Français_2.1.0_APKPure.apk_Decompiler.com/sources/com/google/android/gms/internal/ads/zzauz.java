package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzauz extends zzauy {
    private zzauz(Context context, zzaux zzaux) {
        super(context, zzaux);
    }

    public static zzauz zzu(Context context, zzaux zzaux) {
        zzs(context, zzaux);
        return new zzauz(context, zzaux);
    }

    /* access modifiers changed from: protected */
    public final List zzq(zzawd zzawd, Context context, zzasc zzasc, zzarp zzarp) {
        if (zzawd.zzk() == null || !this.zzu.zza) {
            return super.zzq(zzawd, context, zzasc, (zzarp) null);
        }
        int zza = zzawd.zza();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.zzq(zzawd, context, zzasc, (zzarp) null));
        arrayList.add(new zzawv(zzawd, "mYdY7l5D+eRA2n+1DSS0l4Onm7QwkKst2ndSMEehloNd2MnZiOwv+qpmI2KWHSFP", "85J7Wr+LLVwpDfypFtzN1eoOiAfuTMa63SuSJgN9bwE=", zzasc, zza, 24));
        return arrayList;
    }
}
