package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public abstract class zzto extends zztf {
    private final HashMap zza = new HashMap();
    private Handler zzb;
    private zzgy zzc;

    protected zzto() {
    }

    /* access modifiers changed from: protected */
    public abstract void zzA(Object obj, zzui zzui, zzbq zzbq);

    /* access modifiers changed from: protected */
    public final void zzB(Object obj, zzui zzui) {
        zzcw.zzd(!this.zza.containsKey(obj));
        zztl zztl = new zztl(this, obj);
        zztm zztm = new zztm(this, obj);
        this.zza.put(obj, new zztn(zzui, zztl, zztm));
        Handler handler = this.zzb;
        handler.getClass();
        Handler handler2 = handler;
        zzui.zzh(handler, zztm);
        Handler handler3 = this.zzb;
        handler3.getClass();
        Handler handler4 = handler3;
        zzui.zzg(handler3, zztm);
        zzui.zzm(zztl, this.zzc, zzb());
        if (!zzu()) {
            zzui.zzi(zztl);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzj() {
        for (zztn zztn : this.zza.values()) {
            zztn.zza.zzi(zztn.zzb);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzl() {
        for (zztn zztn : this.zza.values()) {
            zztn.zza.zzk(zztn.zzb);
        }
    }

    /* access modifiers changed from: protected */
    public void zzn(zzgy zzgy) {
        this.zzc = zzgy;
        this.zzb = zzei.zzy((Handler.Callback) null);
    }

    /* access modifiers changed from: protected */
    public void zzq() {
        for (zztn zztn : this.zza.values()) {
            zztn.zza.zzp(zztn.zzb);
            zztn.zza.zzs(zztn.zzc);
            zztn.zza.zzr(zztn.zzc);
        }
        this.zza.clear();
    }

    /* access modifiers changed from: protected */
    public int zzw(Object obj, int i) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public long zzx(Object obj, long j, zzug zzug) {
        return j;
    }

    /* access modifiers changed from: protected */
    public zzug zzy(Object obj, zzug zzug) {
        throw null;
    }

    public void zzz() throws IOException {
        for (zztn zztn : this.zza.values()) {
            zztn.zza.zzz();
        }
    }
}
