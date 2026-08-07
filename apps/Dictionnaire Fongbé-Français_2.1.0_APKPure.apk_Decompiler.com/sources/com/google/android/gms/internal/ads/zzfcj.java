package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzcm;
import com.google.android.gms.ads.internal.client.zzcq;
import com.google.android.gms.ads.internal.client.zzga;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.client.zzy;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfcj {
    public final zzga zza;
    public final zzblz zzb;
    public final zzekn zzc;
    public final zzm zzd;
    public final zzs zze;
    public final String zzf;
    public final ArrayList zzg;
    public final ArrayList zzh;
    public final zzbfl zzi;
    public final zzy zzj;
    public final int zzk;
    public final AdManagerAdViewOptions zzl;
    public final PublisherAdViewOptions zzm;
    public final zzcm zzn;
    public final zzfbw zzo;
    public final boolean zzp;
    public final boolean zzq;
    public final boolean zzr;
    public final Bundle zzs;
    public final zzcq zzt;

    /* synthetic */ zzfcj(zzfch zzfch, zzfci zzfci) {
        zzga zzga;
        zzbfl zzbfl;
        this.zze = zzfch.zzb;
        this.zzf = zzfch.zzc;
        this.zzt = zzfch.zzu;
        int i = zzfch.zza.zza;
        long j = zzfch.zza.zzb;
        Bundle bundle = zzfch.zza.zzc;
        int i2 = zzfch.zza.zzd;
        List list = zzfch.zza.zze;
        boolean z = zzfch.zza.zzf;
        int i3 = zzfch.zza.zzg;
        boolean z2 = true;
        if (!zzfch.zza.zzh && !zzfch.zze) {
            z2 = false;
        }
        this.zzd = new zzm(i, j, bundle, i2, list, z, i3, z2, zzfch.zza.zzi, zzfch.zza.zzj, zzfch.zza.zzk, zzfch.zza.zzl, zzfch.zza.zzm, zzfch.zza.zzn, zzfch.zza.zzo, zzfch.zza.zzp, zzfch.zza.zzq, zzfch.zza.zzr, zzfch.zza.zzs, zzfch.zza.zzt, zzfch.zza.zzu, zzfch.zza.zzv, com.google.android.gms.ads.internal.util.zzs.zza(zzfch.zza.zzw), zzfch.zza.zzx, zzfch.zza.zzy, zzfch.zza.zzz);
        if (zzfch.zzd != null) {
            zzga = zzfch.zzd;
        } else {
            zzga = zzfch.zzh != null ? zzfch.zzh.zzf : null;
        }
        this.zza = zzga;
        this.zzg = zzfch.zzf;
        this.zzh = zzfch.zzg;
        if (zzfch.zzf == null) {
            zzbfl = null;
        } else {
            zzbfl = zzfch.zzh == null ? new zzbfl(new NativeAdOptions.Builder().build()) : zzfch.zzh;
        }
        this.zzi = zzbfl;
        this.zzj = zzfch.zzi;
        this.zzk = zzfch.zzm;
        this.zzl = zzfch.zzj;
        this.zzm = zzfch.zzk;
        this.zzn = zzfch.zzl;
        this.zzb = zzfch.zzn;
        this.zzo = new zzfbw(zzfch.zzo, (zzfbv) null);
        this.zzp = zzfch.zzp;
        this.zzq = zzfch.zzq;
        this.zzc = zzfch.zzr;
        this.zzr = zzfch.zzs;
        this.zzs = zzfch.zzt;
    }

    public final zzbhn zza() {
        PublisherAdViewOptions publisherAdViewOptions = this.zzm;
        if (publisherAdViewOptions == null && this.zzl == null) {
            return null;
        }
        if (publisherAdViewOptions != null) {
            return publisherAdViewOptions.zzb();
        }
        return this.zzl.zza();
    }

    public final boolean zzb() {
        zzbcc zzbcc = zzbcl.zzdn;
        return this.zzf.matches((String) zzbe.zzc().zza(zzbcc));
    }
}
