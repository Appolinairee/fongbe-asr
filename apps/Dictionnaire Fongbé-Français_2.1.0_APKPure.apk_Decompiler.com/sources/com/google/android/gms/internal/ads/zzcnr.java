package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcnr implements zzayk {
    private zzcex zza;
    private final Executor zzb;
    private final zzcnd zzc;
    private final Clock zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final zzcng zzg = new zzcng();

    public zzcnr(Executor executor, zzcnd zzcnd, Clock clock) {
        this.zzb = executor;
        this.zzc = zzcnd;
        this.zzd = clock;
    }

    private final void zzg() {
        try {
            JSONObject zza2 = this.zzc.zzb(this.zzg);
            if (this.zza != null) {
                this.zzb.execute(new zzcnq(this, zza2));
            }
        } catch (JSONException e) {
            zze.zzb("Failed to call video active view js", e);
        }
    }

    public final void zza() {
        this.zze = false;
    }

    public final void zzb() {
        this.zze = true;
        zzg();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(JSONObject jSONObject) {
        this.zza.zzl("AFMA_updateActiveView", jSONObject);
    }

    public final void zzdn(zzayj zzayj) {
        boolean z;
        if (this.zzf) {
            z = false;
        } else {
            z = zzayj.zzj;
        }
        zzcng zzcng = this.zzg;
        zzcng.zza = z;
        zzcng.zzd = this.zzd.elapsedRealtime();
        this.zzg.zzf = zzayj;
        if (this.zze) {
            zzg();
        }
    }

    public final void zze(boolean z) {
        this.zzf = z;
    }

    public final void zzf(zzcex zzcex) {
        this.zza = zzcex;
    }
}
