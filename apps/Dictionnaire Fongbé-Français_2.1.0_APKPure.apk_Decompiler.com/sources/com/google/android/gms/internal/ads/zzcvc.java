package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcvc {
    private final Context zza;
    private final zzfcj zzb;
    private final Bundle zzc;
    private final zzfcb zzd;
    private final zzcut zze;
    private final zzedb zzf;
    private final int zzg;

    /* synthetic */ zzcvc(zzcva zzcva, zzcvb zzcvb) {
        this.zza = zzcva.zza;
        this.zzb = zzcva.zzb;
        this.zzc = zzcva.zzc;
        this.zzd = zzcva.zzd;
        this.zze = zzcva.zze;
        this.zzf = zzcva.zzf;
        this.zzg = zzcva.zzg;
    }

    /* access modifiers changed from: package-private */
    public final int zza() {
        return this.zzg;
    }

    /* access modifiers changed from: package-private */
    public final Context zzb(Context context) {
        return this.zza;
    }

    /* access modifiers changed from: package-private */
    public final Bundle zzc() {
        return this.zzc;
    }

    /* access modifiers changed from: package-private */
    public final zzcut zzd() {
        return this.zze;
    }

    /* access modifiers changed from: package-private */
    public final zzcva zze() {
        zzcva zzcva = new zzcva();
        zzcva.zzf(this.zza);
        zzcva.zzk(this.zzb);
        zzcva.zzg(this.zzc);
        zzcva.zzh(this.zze);
        zzcva.zze(this.zzf);
        return zzcva;
    }

    /* access modifiers changed from: package-private */
    public final zzedb zzf(String str) {
        zzedb zzedb = this.zzf;
        return zzedb != null ? zzedb : new zzedb(str);
    }

    /* access modifiers changed from: package-private */
    public final zzfcb zzg() {
        return this.zzd;
    }

    /* access modifiers changed from: package-private */
    public final zzfcj zzh() {
        return this.zzb;
    }
}
