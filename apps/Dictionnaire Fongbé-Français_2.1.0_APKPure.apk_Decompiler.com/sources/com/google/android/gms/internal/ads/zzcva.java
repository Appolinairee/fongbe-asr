package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcva {
    /* access modifiers changed from: private */
    public Context zza;
    /* access modifiers changed from: private */
    public zzfcj zzb;
    /* access modifiers changed from: private */
    public Bundle zzc;
    /* access modifiers changed from: private */
    public zzfcb zzd;
    /* access modifiers changed from: private */
    public zzcut zze;
    /* access modifiers changed from: private */
    public zzedb zzf;
    /* access modifiers changed from: private */
    public int zzg = 0;

    public final zzcva zze(zzedb zzedb) {
        this.zzf = zzedb;
        return this;
    }

    public final zzcva zzf(Context context) {
        this.zza = context;
        return this;
    }

    public final zzcva zzg(Bundle bundle) {
        this.zzc = bundle;
        return this;
    }

    public final zzcva zzh(zzcut zzcut) {
        this.zze = zzcut;
        return this;
    }

    public final zzcva zzi(int i) {
        this.zzg = i;
        return this;
    }

    public final zzcva zzj(zzfcb zzfcb) {
        this.zzd = zzfcb;
        return this;
    }

    public final zzcva zzk(zzfcj zzfcj) {
        this.zzb = zzfcj;
        return this;
    }

    public final zzcvc zzl() {
        return new zzcvc(this, (zzcvb) null);
    }
}
