package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.text.Layout;
import androidx.core.view.ViewCompat;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzcm {
    private CharSequence zza;
    private Bitmap zzb;
    private Layout.Alignment zzc;
    private Layout.Alignment zzd;
    private float zze;
    private int zzf;
    private int zzg;
    private float zzh;
    private int zzi;
    private int zzj;
    private float zzk;
    private float zzl;
    private float zzm;
    private int zzn;
    private float zzo;

    public zzcm() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = -3.4028235E38f;
        this.zzf = Integer.MIN_VALUE;
        this.zzg = Integer.MIN_VALUE;
        this.zzh = -3.4028235E38f;
        this.zzi = Integer.MIN_VALUE;
        this.zzj = Integer.MIN_VALUE;
        this.zzk = -3.4028235E38f;
        this.zzl = -3.4028235E38f;
        this.zzm = -3.4028235E38f;
        this.zzn = Integer.MIN_VALUE;
    }

    /* synthetic */ zzcm(zzco zzco, zzcn zzcn) {
        this.zza = zzco.zza;
        this.zzb = zzco.zzd;
        this.zzc = zzco.zzb;
        this.zzd = zzco.zzc;
        this.zze = zzco.zze;
        this.zzf = zzco.zzf;
        this.zzg = zzco.zzg;
        this.zzh = zzco.zzh;
        this.zzi = zzco.zzi;
        this.zzj = zzco.zzl;
        this.zzk = zzco.zzm;
        this.zzl = zzco.zzj;
        this.zzm = zzco.zzk;
        this.zzn = zzco.zzn;
        this.zzo = zzco.zzo;
    }

    @Pure
    public final int zza() {
        return this.zzg;
    }

    @Pure
    public final int zzb() {
        return this.zzi;
    }

    public final zzcm zzc(Bitmap bitmap) {
        this.zzb = bitmap;
        return this;
    }

    public final zzcm zzd(float f) {
        this.zzm = f;
        return this;
    }

    public final zzcm zze(float f, int i) {
        this.zze = f;
        this.zzf = i;
        return this;
    }

    public final zzcm zzf(int i) {
        this.zzg = i;
        return this;
    }

    public final zzcm zzg(Layout.Alignment alignment) {
        this.zzd = alignment;
        return this;
    }

    public final zzcm zzh(float f) {
        this.zzh = f;
        return this;
    }

    public final zzcm zzi(int i) {
        this.zzi = i;
        return this;
    }

    public final zzcm zzj(float f) {
        this.zzo = f;
        return this;
    }

    public final zzcm zzk(float f) {
        this.zzl = f;
        return this;
    }

    public final zzcm zzl(CharSequence charSequence) {
        this.zza = charSequence;
        return this;
    }

    public final zzcm zzm(Layout.Alignment alignment) {
        this.zzc = alignment;
        return this;
    }

    public final zzcm zzn(float f, int i) {
        this.zzk = f;
        this.zzj = i;
        return this;
    }

    public final zzcm zzo(int i) {
        this.zzn = i;
        return this;
    }

    public final zzco zzp() {
        return new zzco(this.zza, this.zzc, this.zzd, this.zzb, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, false, ViewCompat.MEASURED_STATE_MASK, this.zzn, this.zzo, (zzcn) null);
    }

    @Pure
    public final CharSequence zzq() {
        return this.zza;
    }
}
