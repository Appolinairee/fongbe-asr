package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdni implements Callable {
    /* access modifiers changed from: private */
    public final zza zza;
    /* access modifiers changed from: private */
    public final Context zzb;
    /* access modifiers changed from: private */
    public final zzdrw zzc;
    /* access modifiers changed from: private */
    public final zzebk zzd;
    /* access modifiers changed from: private */
    public final Executor zze;
    /* access modifiers changed from: private */
    public final zzava zzf;
    /* access modifiers changed from: private */
    public final VersionInfoParcel zzg;
    /* access modifiers changed from: private */
    public final zzfja zzh;
    /* access modifiers changed from: private */
    public final zzebv zzi;
    /* access modifiers changed from: private */
    public final zzfcn zzj;

    public zzdni(Context context, Executor executor, zzava zzava, VersionInfoParcel versionInfoParcel, zza zza2, zzcfk zzcfk, zzebk zzebk, zzfja zzfja, zzdrw zzdrw, zzebv zzebv, zzfcn zzfcn) {
        this.zzb = context;
        this.zze = executor;
        this.zzf = zzava;
        this.zzg = versionInfoParcel;
        this.zza = zza2;
        this.zzd = zzebk;
        this.zzh = zzfja;
        this.zzc = zzdrw;
        this.zzi = zzebv;
        this.zzj = zzfcn;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzdnl zzdnl = new zzdnl(this);
        zzdnl.zzk();
        return zzdnl;
    }
}
