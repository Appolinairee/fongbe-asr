package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzelp implements zzetr {
    private final zzgcs zza;
    private final Context zzb;
    private final zzfcj zzc;
    private final View zzd;

    public zzelp(zzgcs zzgcs, Context context, zzfcj zzfcj, ViewGroup viewGroup) {
        this.zza = zzgcs;
        this.zzb = context;
        this.zzc = zzfcj;
        this.zzd = viewGroup;
    }

    public final int zza() {
        return 3;
    }

    public final ListenableFuture zzb() {
        zzbcl.zza(this.zzb);
        return this.zza.zzb(new zzelo(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzelq zzc() throws Exception {
        ArrayList arrayList = new ArrayList();
        View view = this.zzd;
        while (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                break;
            }
            int indexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", indexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return new zzelq(this.zzb, this.zzc.zze, arrayList);
    }
}
