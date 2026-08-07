package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.api.Releasable;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public abstract class zzcde implements Releasable {
    protected final Context zza;
    protected final String zzb;
    protected final WeakReference zzc;

    public zzcde(zzcbs zzcbs) {
        Context context = zzcbs.getContext();
        this.zza = context;
        this.zzb = zzv.zzq().zzc(context, zzcbs.zzn().afmaVersion);
        this.zzc = new WeakReference(zzcbs);
    }

    static /* bridge */ /* synthetic */ void zze(zzcde zzcde, String str, Map map) {
        zzcbs zzcbs = (zzcbs) zzcde.zzc.get();
        if (zzcbs != null) {
            zzcbs.zzd("onPrecacheEvent", map);
        }
    }

    public void release() {
    }

    public abstract void zzf();

    public final void zzg(String str, String str2, String str3, String str4) {
        zzf.zza.post(new zzcdd(this, str, str2, str3, str4));
    }

    /* access modifiers changed from: protected */
    public final void zzh(String str, String str2, int i) {
        zzf.zza.post(new zzcdb(this, str, str2, i));
    }

    public final void zzj(String str, String str2, long j) {
        zzf.zza.post(new zzcdc(this, str, str2, j));
    }

    public final void zzn(String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        zzf.zza.post(new zzcda(this, str, str2, i, i2, j, j2, z, i3, i4));
    }

    public final void zzo(String str, String str2, long j, long j2, boolean z, long j3, long j4, long j5, int i, int i2) {
        Handler handler = zzf.zza;
        zzccz zzccz = r0;
        zzccz zzccz2 = new zzccz(this, str, str2, j, j2, j3, j4, j5, z, i, i2);
        handler.post(zzccz);
    }

    /* access modifiers changed from: protected */
    public void zzp(int i) {
    }

    /* access modifiers changed from: protected */
    public void zzq(int i) {
    }

    /* access modifiers changed from: protected */
    public void zzr(int i) {
    }

    /* access modifiers changed from: protected */
    public void zzs(int i) {
    }

    public abstract boolean zzt(String str);

    public boolean zzu(String str, String[] strArr) {
        return zzt(str);
    }

    public boolean zzw(String str, String[] strArr, zzccw zzccw) {
        return zzt(str);
    }
}
