package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public abstract class zzci implements zzch {
    protected zzcf zzb;
    protected zzcf zzc;
    private zzcf zzd = zzcf.zza;
    private zzcf zze;
    private ByteBuffer zzf;
    private ByteBuffer zzg;
    private boolean zzh;

    public zzci() {
        ByteBuffer byteBuffer = zza;
        this.zzf = byteBuffer;
        this.zzg = byteBuffer;
        zzcf zzcf = zzcf.zza;
        this.zze = zzcf;
        this.zzb = zzcf;
        this.zzc = zzcf;
    }

    public final zzcf zza(zzcf zzcf) throws zzcg {
        this.zzd = zzcf;
        this.zze = zzi(zzcf);
        return zzg() ? this.zze : zzcf.zza;
    }

    public ByteBuffer zzb() {
        ByteBuffer byteBuffer = this.zzg;
        this.zzg = zza;
        return byteBuffer;
    }

    public final void zzc() {
        this.zzg = zza;
        this.zzh = false;
        this.zzb = this.zzd;
        this.zzc = this.zze;
        zzk();
    }

    public final void zzd() {
        this.zzh = true;
        zzl();
    }

    public final void zzf() {
        zzc();
        this.zzf = zza;
        this.zzd = zzcf.zza;
        zzcf zzcf = zzcf.zza;
        this.zze = zzcf;
        this.zzb = zzcf;
        this.zzc = zzcf;
        zzm();
    }

    public boolean zzg() {
        return this.zze != zzcf.zza;
    }

    public boolean zzh() {
        return this.zzh && this.zzg == zza;
    }

    /* access modifiers changed from: protected */
    public zzcf zzi(zzcf zzcf) throws zzcg {
        throw null;
    }

    /* access modifiers changed from: protected */
    public final ByteBuffer zzj(int i) {
        if (this.zzf.capacity() < i) {
            this.zzf = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.zzf.clear();
        }
        ByteBuffer byteBuffer = this.zzf;
        this.zzg = byteBuffer;
        return byteBuffer;
    }

    /* access modifiers changed from: protected */
    public void zzk() {
    }

    /* access modifiers changed from: protected */
    public void zzl() {
    }

    /* access modifiers changed from: protected */
    public void zzm() {
    }

    /* access modifiers changed from: protected */
    public final boolean zzn() {
        return this.zzg.hasRemaining();
    }
}
