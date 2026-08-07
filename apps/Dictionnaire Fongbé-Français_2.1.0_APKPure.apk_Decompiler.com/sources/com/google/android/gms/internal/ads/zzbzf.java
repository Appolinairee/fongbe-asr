package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbzf {
    /* access modifiers changed from: private */
    public final Clock zza;
    private final zzbzq zzb;
    private final LinkedList zzc;
    private final Object zzd = new Object();
    private final String zze;
    private final String zzf;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = 0;
    private long zzj = -1;
    private long zzk = -1;

    zzbzf(Clock clock, zzbzq zzbzq, String str, String str2) {
        this.zza = clock;
        this.zzb = zzbzq;
        this.zze = str;
        this.zzf = str2;
        this.zzc = new LinkedList();
    }

    public final Bundle zza() {
        Bundle bundle;
        synchronized (this.zzd) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.zze);
            bundle.putString("slotid", this.zzf);
            bundle.putBoolean("ismediation", false);
            bundle.putLong("treq", this.zzj);
            bundle.putLong("tresponse", this.zzk);
            bundle.putLong("timp", this.zzg);
            bundle.putLong("tload", this.zzh);
            bundle.putLong("pcc", this.zzi);
            bundle.putLong("tfetch", -1);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                arrayList.add(((zzbze) it.next()).zzb());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }

    public final String zzc() {
        return this.zze;
    }

    public final void zzd() {
        synchronized (this.zzd) {
            if (this.zzk != -1) {
                zzbze zzbze = new zzbze(this);
                zzbze.zzd();
                this.zzc.add(zzbze);
                this.zzi++;
                this.zzb.zzf();
                this.zzb.zze(this);
            }
        }
    }

    public final void zze() {
        synchronized (this.zzd) {
            if (this.zzk != -1 && !this.zzc.isEmpty()) {
                zzbze zzbze = (zzbze) this.zzc.getLast();
                if (zzbze.zza() == -1) {
                    zzbze.zzc();
                    this.zzb.zze(this);
                }
            }
        }
    }

    public final void zzf() {
        synchronized (this.zzd) {
            if (this.zzk != -1 && this.zzg == -1) {
                this.zzg = this.zza.elapsedRealtime();
                this.zzb.zze(this);
            }
            this.zzb.zzg();
        }
    }

    public final void zzg() {
        synchronized (this.zzd) {
            this.zzb.zzh();
        }
    }

    public final void zzh(boolean z) {
        synchronized (this.zzd) {
            if (this.zzk != -1) {
                this.zzh = this.zza.elapsedRealtime();
            }
        }
    }

    public final void zzi() {
        synchronized (this.zzd) {
            this.zzb.zzi();
        }
    }

    public final void zzj(zzm zzm) {
        synchronized (this.zzd) {
            long elapsedRealtime = this.zza.elapsedRealtime();
            this.zzj = elapsedRealtime;
            this.zzb.zzj(zzm, elapsedRealtime);
        }
    }

    public final void zzk(long j) {
        synchronized (this.zzd) {
            this.zzk = j;
            if (j != -1) {
                this.zzb.zze(this);
            }
        }
    }
}
