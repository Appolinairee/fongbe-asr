package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public abstract class zzapm implements Comparable {
    /* access modifiers changed from: private */
    public final zzapx zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;
    private final zzapq zzf;
    private Integer zzg;
    private zzapp zzh;
    private boolean zzi;
    private zzaov zzj;
    private zzapl zzk;
    private final zzapa zzl;

    public zzapm(int i, String str, zzapq zzapq) {
        Uri parse;
        String host;
        this.zza = zzapx.zza ? new zzapx() : null;
        this.zze = new Object();
        int i2 = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i;
        this.zzc = str;
        this.zzf = zzapq;
        this.zzl = new zzapa();
        if (!(TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null)) {
            i2 = host.hashCode();
        }
        this.zzd = i2;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((zzapm) obj).zzg.intValue();
    }

    public final String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.zzd));
        zzw();
        Integer num = this.zzg;
        return "[ ] " + this.zzc + " " + "0x".concat(valueOf) + " NORMAL " + num;
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzl.zzb();
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzaov zzd() {
        return this.zzj;
    }

    public final zzapm zze(zzaov zzaov) {
        this.zzj = zzaov;
        return this;
    }

    public final zzapm zzf(zzapp zzapp) {
        this.zzh = zzapp;
        return this;
    }

    public final zzapm zzg(int i) {
        this.zzg = Integer.valueOf(i);
        return this;
    }

    /* access modifiers changed from: protected */
    public abstract zzaps zzh(zzapi zzapi);

    public final String zzj() {
        int i = this.zzb;
        String str = this.zzc;
        if (i == 0) {
            return str;
        }
        String num = Integer.toString(1);
        return num + "-" + str;
    }

    public final String zzk() {
        return this.zzc;
    }

    public Map zzl() throws zzaou {
        return Collections.emptyMap();
    }

    public final void zzm(String str) {
        if (zzapx.zza) {
            this.zza.zza(str, Thread.currentThread().getId());
        }
    }

    public final void zzn(zzapv zzapv) {
        zzapq zzapq;
        synchronized (this.zze) {
            zzapq = this.zzf;
        }
        zzapq.zza(zzapv);
    }

    /* access modifiers changed from: protected */
    public abstract void zzo(Object obj);

    /* access modifiers changed from: package-private */
    public final void zzp(String str) {
        zzapp zzapp = this.zzh;
        if (zzapp != null) {
            zzapp.zzb(this);
        }
        if (zzapx.zza) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzapk(this, str, id));
                return;
            }
            this.zza.zza(str, id);
            this.zza.zzb(toString());
        }
    }

    public final void zzq() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzr() {
        zzapl zzapl;
        synchronized (this.zze) {
            zzapl = this.zzk;
        }
        if (zzapl != null) {
            zzapl.zza(this);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzs(zzaps zzaps) {
        zzapl zzapl;
        synchronized (this.zze) {
            zzapl = this.zzk;
        }
        if (zzapl != null) {
            zzapl.zzb(this, zzaps);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzt(int i) {
        zzapp zzapp = this.zzh;
        if (zzapp != null) {
            zzapp.zzc(this, i);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzu(zzapl zzapl) {
        synchronized (this.zze) {
            this.zzk = zzapl;
        }
    }

    public final boolean zzv() {
        boolean z;
        synchronized (this.zze) {
            z = this.zzi;
        }
        return z;
    }

    public final boolean zzw() {
        synchronized (this.zze) {
        }
        return false;
    }

    public byte[] zzx() throws zzaou {
        return null;
    }

    public final zzapa zzy() {
        return this.zzl;
    }
}
