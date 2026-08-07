package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzfsw {
    public static final /* synthetic */ int zzb = 0;
    private static final zzfto zzc = new zzfto("OverlayDisplayService");
    private static final Intent zzd = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");
    final zzftn zza;
    private final String zze;

    zzfsw(Context context) {
        if (zzftq.zza(context)) {
            this.zza = new zzftn(context.getApplicationContext(), zzc, "OverlayDisplayService", zzd, new zzfss());
        } else {
            this.zza = null;
        }
        this.zze = context.getPackageName();
    }

    static /* synthetic */ boolean zzh(String str) {
        return !zzk(str);
    }

    private static void zzi(String str, Consumer consumer) {
        if (!zzk(str)) {
            str.getClass();
            String str2 = str;
            consumer.accept(str.trim());
        }
    }

    private static boolean zzj(zzftb zzftb, String str, List list) {
        if (list.stream().anyMatch(new zzfst())) {
            return true;
        }
        zzc.zza(str, new Object[0]);
        zzfsz zzc2 = zzfta.zzc();
        zzc2.zzb(8160);
        zzftb.zza(zzc2.zzc());
        return false;
    }

    private static boolean zzk(String str) {
        return zzfve.zzc(str).trim().isEmpty();
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        if (this.zza != null) {
            zzc.zzc("unbind LMD display overlay service", new Object[0]);
            this.zza.zzn();
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzb(zzfsd zzfsd, zzftb zzftb) {
        if (this.zza == null) {
            zzc.zza("error: %s", "Play Store not found.");
        } else if (zzj(zzftb, "Failed to apply OverlayDisplayDismissRequest: missing appId and sessionToken.", Arrays.asList(new String[]{zzfsd.zzb(), zzfsd.zza()}))) {
            this.zza.zzi(new zzfsm(this, zzfsd, zzftb));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzfsd zzfsd, zzftb zzftb) {
        try {
            zzftn zzftn = this.zza;
            if (zzftn != null) {
                zzftn zzftn2 = zzftn;
                zzfrn zzfrn = (zzfrn) zzftn.zzc();
                if (zzfrn != null) {
                    String str = this.zze;
                    Bundle bundle = new Bundle();
                    bundle.putString("callerPackage", str);
                    zzi(zzfsd.zzb(), new zzfsp(bundle));
                    zzi(zzfsd.zza(), new zzfsq(bundle));
                    zzfrn.zze(bundle, new zzfsv(this, zzftb));
                    return;
                }
                return;
            }
            throw null;
        } catch (RemoteException e) {
            String str2 = this.zze;
            zzc.zzb(e, "dismiss overlay display from: %s", str2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzfsy zzfsy, zzftb zzftb) {
        try {
            zzftn zzftn = this.zza;
            if (zzftn != null) {
                zzftn zzftn2 = zzftn;
                zzfrn zzfrn = (zzfrn) zzftn.zzc();
                if (zzfrn != null) {
                    String str = this.zze;
                    Bundle bundle = new Bundle();
                    bundle.putString("callerPackage", str);
                    bundle.putBinder("windowToken", zzfsy.zzf());
                    zzi(zzfsy.zzg(), new zzfsu(bundle));
                    bundle.putInt("layoutGravity", zzfsy.zzc());
                    bundle.putFloat("layoutVerticalMargin", zzfsy.zza());
                    bundle.putInt("displayMode", 0);
                    bundle.putInt("triggerMode", 0);
                    bundle.putInt("windowWidthPx", zzfsy.zze());
                    zzi((String) null, new zzfsi(bundle));
                    zzi((String) null, new zzfsj(bundle));
                    zzi(zzfsy.zzh(), new zzfsk(bundle));
                    zzi((String) null, new zzfsl(bundle));
                    bundle.putBoolean("stableSessionToken", true);
                    zzfrn.zzf(str, bundle, new zzfsv(this, zzftb));
                    return;
                }
                return;
            }
            throw null;
        } catch (RemoteException e) {
            zzc.zzb(e, "show overlay display from: %s", this.zze);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze(zzftd zzftd, int i, zzftb zzftb) {
        try {
            zzftn zzftn = this.zza;
            if (zzftn != null) {
                zzftn zzftn2 = zzftn;
                zzfrn zzfrn = (zzfrn) zzftn.zzc();
                if (zzfrn != null) {
                    String str = this.zze;
                    Bundle bundle = new Bundle();
                    bundle.putString("callerPackage", str);
                    bundle.putInt("displayMode", i);
                    zzi(zzftd.zzb(), new zzfsh(bundle));
                    zzi(zzftd.zza(), new zzfsn(bundle));
                    zzfrn.zzg(bundle, new zzfsv(this, zzftb));
                    return;
                }
                return;
            }
            throw null;
        } catch (RemoteException e) {
            zzc.zzb(e, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i), this.zze);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzf(zzfsy zzfsy, zzftb zzftb) {
        if (this.zza == null) {
            zzc.zza("error: %s", "Play Store not found.");
        } else if (zzj(zzftb, "Failed to apply OverlayDisplayShowRequest: missing appId and sessionToken.", Arrays.asList(new String[]{null, zzfsy.zzh()}))) {
            this.zza.zzi(new zzfsr(this, zzfsy, zzftb));
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzg(zzftd zzftd, zzftb zzftb, int i) {
        if (this.zza == null) {
            zzc.zza("error: %s", "Play Store not found.");
        } else if (zzj(zzftb, "Failed to apply OverlayDisplayUpdateRequest: missing appId and sessionToken.", Arrays.asList(new String[]{zzftd.zzb(), zzftd.zza()}))) {
            this.zza.zzi(new zzfso(this, zzftd, i, zzftb));
        }
    }
}
