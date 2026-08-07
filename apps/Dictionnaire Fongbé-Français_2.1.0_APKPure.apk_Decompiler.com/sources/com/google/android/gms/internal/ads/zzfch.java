package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzcm;
import com.google.android.gms.ads.internal.client.zzcq;
import com.google.android.gms.ads.internal.client.zzga;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.client.zzy;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfch {
    /* access modifiers changed from: private */
    public zzm zza;
    /* access modifiers changed from: private */
    public zzs zzb;
    /* access modifiers changed from: private */
    public String zzc;
    /* access modifiers changed from: private */
    public zzga zzd;
    /* access modifiers changed from: private */
    public boolean zze;
    /* access modifiers changed from: private */
    public ArrayList zzf;
    /* access modifiers changed from: private */
    public ArrayList zzg;
    /* access modifiers changed from: private */
    public zzbfl zzh;
    /* access modifiers changed from: private */
    public zzy zzi;
    /* access modifiers changed from: private */
    public AdManagerAdViewOptions zzj;
    /* access modifiers changed from: private */
    public PublisherAdViewOptions zzk;
    /* access modifiers changed from: private */
    public zzcm zzl;
    /* access modifiers changed from: private */
    public int zzm = 1;
    /* access modifiers changed from: private */
    public zzblz zzn;
    /* access modifiers changed from: private */
    public final zzfbu zzo = new zzfbu();
    /* access modifiers changed from: private */
    public boolean zzp = false;
    /* access modifiers changed from: private */
    public boolean zzq = false;
    /* access modifiers changed from: private */
    public zzekn zzr;
    /* access modifiers changed from: private */
    public boolean zzs = false;
    /* access modifiers changed from: private */
    public Bundle zzt;
    /* access modifiers changed from: private */
    public zzcq zzu;

    public final zzfch zzA(Bundle bundle) {
        this.zzt = bundle;
        return this;
    }

    public final zzfch zzB(boolean z) {
        this.zze = z;
        return this;
    }

    public final zzfch zzC(int i) {
        this.zzm = i;
        return this;
    }

    public final zzfch zzD(zzbfl zzbfl) {
        this.zzh = zzbfl;
        return this;
    }

    public final zzfch zzE(ArrayList arrayList) {
        this.zzf = arrayList;
        return this;
    }

    public final zzfch zzF(ArrayList arrayList) {
        this.zzg = arrayList;
        return this;
    }

    public final zzfch zzG(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzk = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.zze = publisherAdViewOptions.zzc();
            this.zzl = publisherAdViewOptions.zza();
        }
        return this;
    }

    public final zzfch zzH(zzm zzm2) {
        this.zza = zzm2;
        return this;
    }

    public final zzfch zzI(zzga zzga) {
        this.zzd = zzga;
        return this;
    }

    public final zzfcj zzJ() {
        Preconditions.checkNotNull(this.zzc, "ad unit must not be null");
        Preconditions.checkNotNull(this.zzb, "ad size must not be null");
        Preconditions.checkNotNull(this.zza, "ad request must not be null");
        return new zzfcj(this, (zzfci) null);
    }

    public final String zzL() {
        return this.zzc;
    }

    public final boolean zzS() {
        return this.zzp;
    }

    public final boolean zzT() {
        return this.zzq;
    }

    public final zzfch zzV(zzcq zzcq) {
        this.zzu = zzcq;
        return this;
    }

    public final zzm zzf() {
        return this.zza;
    }

    public final zzs zzh() {
        return this.zzb;
    }

    public final zzfbu zzp() {
        return this.zzo;
    }

    public final zzfch zzq(zzfcj zzfcj) {
        this.zzo.zza(zzfcj.zzo.zza);
        this.zza = zzfcj.zzd;
        this.zzb = zzfcj.zze;
        this.zzu = zzfcj.zzt;
        this.zzc = zzfcj.zzf;
        this.zzd = zzfcj.zza;
        this.zzf = zzfcj.zzg;
        this.zzg = zzfcj.zzh;
        this.zzh = zzfcj.zzi;
        this.zzi = zzfcj.zzj;
        zzr(zzfcj.zzl);
        zzG(zzfcj.zzm);
        this.zzp = zzfcj.zzp;
        this.zzq = zzfcj.zzq;
        this.zzr = zzfcj.zzc;
        this.zzs = zzfcj.zzr;
        this.zzt = zzfcj.zzs;
        return this;
    }

    public final zzfch zzr(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zzj = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.zze = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        return this;
    }

    public final zzfch zzs(zzs zzs2) {
        this.zzb = zzs2;
        return this;
    }

    public final zzfch zzt(String str) {
        this.zzc = str;
        return this;
    }

    public final zzfch zzu(zzy zzy) {
        this.zzi = zzy;
        return this;
    }

    public final zzfch zzv(zzekn zzekn) {
        this.zzr = zzekn;
        return this;
    }

    public final zzfch zzw(zzblz zzblz) {
        this.zzn = zzblz;
        this.zzd = new zzga(false, true, false);
        return this;
    }

    public final zzfch zzx(boolean z) {
        this.zzp = z;
        return this;
    }

    public final zzfch zzy(boolean z) {
        this.zzq = z;
        return this;
    }

    public final zzfch zzz(boolean z) {
        this.zzs = true;
        return this;
    }
}
