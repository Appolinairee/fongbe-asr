package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzhq {
    private final zzfvf zza;
    private final zzho zzb;
    private zzhp zzc;
    private int zzd;
    private float zze = 1.0f;

    public zzhq(Context context, Handler handler, zzhp zzhp) {
        this.zza = zzfvj.zza(new zzhm(context));
        this.zzc = zzhp;
        this.zzb = new zzho(this, handler);
        this.zzd = 0;
    }

    private final void zze() {
        int i = this.zzd;
        if (i != 1 && i != 0 && zzei.zza < 26) {
            ((AudioManager) this.zza.zza()).abandonAudioFocus(this.zzb);
        }
    }

    private final void zzf(int i) {
        zzhp zzhp = this.zzc;
        if (zzhp != null) {
            int zzC = zzjp.zzS(i);
            zzjp zzjp = ((zzjl) zzhp).zza;
            zzjp.zzae(zzjp.zzu(), i, zzC);
        }
    }

    private final void zzg(int i) {
        if (this.zzd != i) {
            this.zzd = i;
            float f = i == 4 ? 0.2f : 1.0f;
            if (this.zze != f) {
                this.zze = f;
                zzhp zzhp = this.zzc;
                if (zzhp != null) {
                    ((zzjl) zzhp).zza.zzab();
                }
            }
        }
    }

    public final float zza() {
        return this.zze;
    }

    public final int zzb(boolean z, int i) {
        zze();
        zzg(0);
        return 1;
    }

    public final void zzd() {
        this.zzc = null;
        zze();
        zzg(0);
    }

    static /* bridge */ /* synthetic */ void zzc(zzhq zzhq, int i) {
        if (i == -3 || i == -2) {
            if (i != -2) {
                zzhq.zzg(4);
                return;
            }
            zzhq.zzf(0);
            zzhq.zzg(3);
        } else if (i == -1) {
            zzhq.zzf(-1);
            zzhq.zze();
            zzhq.zzg(1);
        } else if (i != 1) {
            zzdo.zzf("AudioFocusManager", "Unknown focus change type: " + i);
        } else {
            zzhq.zzg(2);
            zzhq.zzf(1);
        }
    }
}
