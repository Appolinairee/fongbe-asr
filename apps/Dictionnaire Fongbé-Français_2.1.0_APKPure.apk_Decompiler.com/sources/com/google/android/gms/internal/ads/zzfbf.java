package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzdo;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfbf extends zzbwo {
    private final zzfbb zza;
    private final zzfar zzb;
    private final String zzc;
    /* access modifiers changed from: private */
    public final zzfcb zzd;
    private final Context zze;
    private final VersionInfoParcel zzf;
    private final zzava zzg;
    private final zzdrw zzh;
    /* access modifiers changed from: private */
    public zzdoa zzi;
    private boolean zzj = ((Boolean) zzbe.zzc().zza(zzbcl.zzaO)).booleanValue();

    public zzfbf(String str, zzfbb zzfbb, Context context, zzfar zzfar, zzfcb zzfcb, VersionInfoParcel versionInfoParcel, zzava zzava, zzdrw zzdrw) {
        this.zzc = str;
        this.zza = zzfbb;
        this.zzb = zzfar;
        this.zzd = zzfcb;
        this.zze = context;
        this.zzf = versionInfoParcel;
        this.zzg = zzava;
        this.zzh = zzdrw;
    }

    private final synchronized void zzu(zzm zzm, zzbww zzbww, int i) throws RemoteException {
        if (!zzm.zzb()) {
            boolean z = false;
            if (((Boolean) zzbej.zzk.zze()).booleanValue()) {
                if (((Boolean) zzbe.zzc().zza(zzbcl.zzla)).booleanValue()) {
                    z = true;
                }
            }
            if (this.zzf.clientJarVersion < ((Integer) zzbe.zzc().zza(zzbcl.zzlb)).intValue() || !z) {
                Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
            }
        }
        this.zzb.zzk(zzbww);
        zzv.zzq();
        if (zzs.zzI(this.zze)) {
            if (zzm.zzs == null) {
                zzo.zzg("Failed to load the ad because app ID is missing.");
                this.zzb.zzdz(zzfdk.zzd(4, (String) null, (zze) null));
                return;
            }
        }
        if (this.zzi == null) {
            zzfat zzfat = new zzfat((String) null);
            this.zza.zzj(i);
            this.zza.zzb(zzm, this.zzc, zzfat, new zzfbe(this));
        }
    }

    public final Bundle zzb() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdoa zzdoa = this.zzi;
        return zzdoa != null ? zzdoa.zza() : new Bundle();
    }

    public final zzdy zzc() {
        zzdoa zzdoa;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzgC)).booleanValue() && (zzdoa = this.zzi) != null) {
            return zzdoa.zzm();
        }
        return null;
    }

    public final zzbwm zzd() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdoa zzdoa = this.zzi;
        if (zzdoa != null) {
            return zzdoa.zzc();
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String zze() throws android.os.RemoteException {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzdoa r0 = r2.zzi     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x0015
            com.google.android.gms.internal.ads.zzcvm r1 = r0.zzm()     // Catch:{ all -> 0x0018 }
            if (r1 == 0) goto L_0x0015
            com.google.android.gms.internal.ads.zzcvm r0 = r0.zzm()     // Catch:{ all -> 0x0018 }
            java.lang.String r0 = r0.zzg()     // Catch:{ all -> 0x0018 }
            monitor-exit(r2)
            return r0
        L_0x0015:
            monitor-exit(r2)
            r0 = 0
            return r0
        L_0x0018:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0018 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfbf.zze():java.lang.String");
    }

    public final synchronized void zzf(zzm zzm, zzbww zzbww) throws RemoteException {
        zzu(zzm, zzbww, 2);
    }

    public final synchronized void zzg(zzm zzm, zzbww zzbww) throws RemoteException {
        zzu(zzm, zzbww, 3);
    }

    public final synchronized void zzh(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzj = z;
    }

    public final void zzi(zzdo zzdo) {
        if (zzdo == null) {
            this.zzb.zzg((OnAdMetadataChangedListener) null);
        } else {
            this.zzb.zzg(new zzfbd(this, zzdo));
        }
    }

    public final void zzj(zzdr zzdr) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdr.zzf()) {
                this.zzh.zze();
            }
        } catch (RemoteException e) {
            zzo.zzf("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzb.zzi(zzdr);
    }

    public final void zzk(zzbws zzbws) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzj(zzbws);
    }

    public final synchronized void zzl(zzbxd zzbxd) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzfcb zzfcb = this.zzd;
        zzfcb.zza = zzbxd.zza;
        zzfcb.zzb = zzbxd.zzb;
    }

    public final synchronized void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzn(iObjectWrapper, this.zzj);
    }

    public final synchronized void zzn(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzi == null) {
            zzo.zzj("Rewarded can not be shown before loaded");
            this.zzb.zzq(zzfdk.zzd(9, (String) null, (zze) null));
            return;
        }
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzcT)).booleanValue()) {
            this.zzg.zzc().zzn(new Throwable().getStackTrace());
        }
        this.zzi.zzh(z, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
    }

    public final boolean zzo() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdoa zzdoa = this.zzi;
        return zzdoa != null && !zzdoa.zzf();
    }

    public final void zzp(zzbwx zzbwx) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzo(zzbwx);
    }
}
