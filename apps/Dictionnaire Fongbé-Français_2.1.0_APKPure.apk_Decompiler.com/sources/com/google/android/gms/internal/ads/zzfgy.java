package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzv;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfgy implements zzfgw {
    private final Context zza;
    /* access modifiers changed from: private */
    public long zzb = 0;
    /* access modifiers changed from: private */
    public long zzc = -1;
    /* access modifiers changed from: private */
    public boolean zzd = false;
    /* access modifiers changed from: private */
    public int zze = 0;
    /* access modifiers changed from: private */
    public String zzf = "";
    /* access modifiers changed from: private */
    public String zzg = "";
    /* access modifiers changed from: private */
    public String zzh = "";
    /* access modifiers changed from: private */
    public String zzi = "";
    /* access modifiers changed from: private */
    public zzfhm zzj = zzfhm.SCAR_REQUEST_TYPE_UNSPECIFIED;
    /* access modifiers changed from: private */
    public String zzk = "";
    /* access modifiers changed from: private */
    public String zzl = "";
    /* access modifiers changed from: private */
    public String zzm = "";
    private boolean zzn = false;
    private boolean zzo = false;
    /* access modifiers changed from: private */
    public final int zzp;
    /* access modifiers changed from: private */
    public int zzq = 2;
    /* access modifiers changed from: private */
    public int zzr = 2;

    zzfgy(Context context, int i) {
        this.zza = context;
        this.zzp = i;
    }

    public final synchronized zzfgy zzA() {
        this.zzc = zzv.zzC().elapsedRealtime();
        return this;
    }

    public final synchronized zzfgy zzK(int i) {
        this.zzq = i;
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfgw zza(zze zze2) {
        zzr(zze2);
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfgw zzb(zzfbz zzfbz) {
        zzs(zzfbz);
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfgw zzc(String str) {
        zzt(str);
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfgw zzd(String str) {
        zzu(str);
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfgw zze(String str) {
        zzv(str);
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfgw zzf(zzfhm zzfhm) {
        zzw(zzfhm);
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfgw zzg(boolean z) {
        zzx(z);
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfgw zzh(Throwable th) {
        zzy(th);
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfgw zzi() {
        zzz();
        return this;
    }

    public final /* bridge */ /* synthetic */ zzfgw zzj() {
        zzA();
        return this;
    }

    public final synchronized boolean zzk() {
        return this.zzo;
    }

    public final boolean zzl() {
        return !TextUtils.isEmpty(this.zzh);
    }

    public final synchronized zzfha zzm() {
        if (this.zzn) {
            return null;
        }
        this.zzn = true;
        if (!this.zzo) {
            zzz();
        }
        if (this.zzc < 0) {
            zzA();
        }
        return new zzfha(this, (zzfgz) null);
    }

    public final /* bridge */ /* synthetic */ zzfgw zzn(int i) {
        zzK(i);
        return this;
    }

    public final synchronized zzfgy zzr(zze zze2) {
        IBinder iBinder = zze2.zze;
        if (iBinder != null) {
            zzcvm zzcvm = (zzcvm) iBinder;
            String zzk2 = zzcvm.zzk();
            if (!TextUtils.isEmpty(zzk2)) {
                this.zzf = zzk2;
            }
            String zzi2 = zzcvm.zzi();
            if (!TextUtils.isEmpty(zzi2)) {
                this.zzg = zzi2;
            }
        }
        return this;
    }

    public final synchronized zzfgy zzs(zzfbz zzfbz) {
        if (!TextUtils.isEmpty(zzfbz.zzb.zzb)) {
            this.zzf = zzfbz.zzb.zzb;
        }
        Iterator it = zzfbz.zza.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zzfbo zzfbo = (zzfbo) it.next();
            if (!TextUtils.isEmpty(zzfbo.zzab)) {
                this.zzg = zzfbo.zzab;
                break;
            }
        }
        return this;
    }

    public final synchronized zzfgy zzt(String str) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zziI)).booleanValue()) {
            this.zzm = str;
        }
        return this;
    }

    public final synchronized zzfgy zzu(String str) {
        this.zzh = str;
        return this;
    }

    public final synchronized zzfgy zzv(String str) {
        this.zzi = str;
        return this;
    }

    public final synchronized zzfgy zzw(zzfhm zzfhm) {
        this.zzj = zzfhm;
        return this;
    }

    public final synchronized zzfgy zzx(boolean z) {
        this.zzd = z;
        return this;
    }

    public final synchronized zzfgy zzy(Throwable th) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zziI)).booleanValue()) {
            this.zzl = zzbuh.zzf(th);
            this.zzk = (String) zzfvc.zzb(zzfty.zzc(10)).zzd(zzbuh.zze(th)).iterator().next();
        }
        return this;
    }

    public final synchronized zzfgy zzz() {
        this.zze = zzv.zzr().zzm(this.zza);
        Resources resources = this.zza.getResources();
        int i = 2;
        if (resources != null) {
            Configuration configuration = resources.getConfiguration();
            if (configuration != null) {
                i = configuration.orientation == 2 ? 4 : 3;
            }
        }
        this.zzr = i;
        this.zzb = zzv.zzC().elapsedRealtime();
        this.zzo = true;
        return this;
    }
}
