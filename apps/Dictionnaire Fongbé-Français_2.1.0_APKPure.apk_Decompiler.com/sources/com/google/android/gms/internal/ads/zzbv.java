package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public class zzbv {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public boolean zzg;
    /* access modifiers changed from: private */
    public final zzfxn zzh;
    /* access modifiers changed from: private */
    public final zzfxn zzi;
    /* access modifiers changed from: private */
    public final zzfxn zzj;
    private final int zzk;
    private final int zzl;
    /* access modifiers changed from: private */
    public final zzfxn zzm;
    /* access modifiers changed from: private */
    public final zzbu zzn;
    /* access modifiers changed from: private */
    public zzfxn zzo;
    /* access modifiers changed from: private */
    public int zzp;
    /* access modifiers changed from: private */
    public final HashMap zzq;
    /* access modifiers changed from: private */
    public final HashSet zzr;

    @Deprecated
    public zzbv() {
        this.zza = Integer.MAX_VALUE;
        this.zzb = Integer.MAX_VALUE;
        this.zzc = Integer.MAX_VALUE;
        this.zzd = Integer.MAX_VALUE;
        this.zze = Integer.MAX_VALUE;
        this.zzf = Integer.MAX_VALUE;
        this.zzg = true;
        this.zzh = zzfxn.zzn();
        this.zzi = zzfxn.zzn();
        this.zzj = zzfxn.zzn();
        this.zzk = Integer.MAX_VALUE;
        this.zzl = Integer.MAX_VALUE;
        this.zzm = zzfxn.zzn();
        this.zzn = zzbu.zza;
        this.zzo = zzfxn.zzn();
        this.zzp = 0;
        this.zzq = new HashMap();
        this.zzr = new HashSet();
    }

    public final zzbv zze(Context context) {
        CaptioningManager captioningManager;
        if ((zzei.zza >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.zzp = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.zzo = zzfxn.zzo(locale.toLanguageTag());
            }
        }
        return this;
    }

    public final zzbv zzf(int i, int i2, boolean z) {
        this.zze = i;
        this.zzf = i2;
        this.zzg = true;
        return this;
    }

    protected zzbv(zzbw zzbw) {
        this.zza = Integer.MAX_VALUE;
        this.zzb = Integer.MAX_VALUE;
        this.zzc = Integer.MAX_VALUE;
        this.zzd = Integer.MAX_VALUE;
        this.zze = zzbw.zzi;
        this.zzf = zzbw.zzj;
        this.zzg = zzbw.zzk;
        this.zzh = zzbw.zzl;
        this.zzi = zzbw.zzm;
        this.zzj = zzbw.zzo;
        this.zzk = Integer.MAX_VALUE;
        this.zzl = Integer.MAX_VALUE;
        this.zzm = zzbw.zzs;
        this.zzn = zzbw.zzt;
        this.zzo = zzbw.zzu;
        this.zzp = zzbw.zzv;
        this.zzr = new HashSet(zzbw.zzC);
        this.zzq = new HashMap(zzbw.zzB);
    }
}
