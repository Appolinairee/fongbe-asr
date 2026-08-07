package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.formats.zzf;
import com.google.android.gms.ads.formats.zzi;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbr;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzei;
import com.google.android.gms.ads.internal.client.zzfi;
import com.google.android.gms.ads.internal.client.zzg;
import com.google.android.gms.ads.internal.client.zzga;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbej;
import com.google.android.gms.internal.ads.zzbfl;
import com.google.android.gms.internal.ads.zzbia;
import com.google.android.gms.internal.ads.zzbic;
import com.google.android.gms.internal.ads.zzbid;
import com.google.android.gms.internal.ads.zzbpa;
import com.google.android.gms.internal.ads.zzbsr;
import com.google.android.gms.internal.ads.zzbst;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public class AdLoader {
    private final zzr zza;
    private final Context zzb;
    private final zzbr zzc;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    public static class Builder {
        private final Context zza;
        private final zzbu zzb;

        public Builder(Context context, String str) {
            zzbu zzd = zzbc.zza().zzd(context, str, new zzbpa());
            this.zza = (Context) Preconditions.checkNotNull(context, "context cannot be null");
            this.zzb = zzd;
        }

        public AdLoader build() {
            try {
                return new AdLoader(this.zza, this.zzb.zze(), zzr.zza);
            } catch (RemoteException e) {
                zzo.zzh("Failed to build AdLoader.", e);
                return new AdLoader(this.zza, new zzfi().zzc(), zzr.zza);
            }
        }

        public Builder forCustomFormatAd(String str, NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
            zzbsr zzbsr = new zzbsr(onCustomFormatAdLoadedListener, onCustomClickListener);
            try {
                this.zzb.zzh(str, zzbsr.zzb(), zzbsr.zza());
            } catch (RemoteException e) {
                zzo.zzk("Failed to add custom format ad listener", e);
            }
            return this;
        }

        public Builder forNativeAd(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
            try {
                this.zzb.zzk(new zzbst(onNativeAdLoadedListener));
            } catch (RemoteException e) {
                zzo.zzk("Failed to add google native ad listener", e);
            }
            return this;
        }

        public Builder withAdListener(AdListener adListener) {
            try {
                this.zzb.zzl(new zzg(adListener));
            } catch (RemoteException e) {
                zzo.zzk("Failed to set AdListener.", e);
            }
            return this;
        }

        public Builder withAdManagerAdViewOptions(AdManagerAdViewOptions adManagerAdViewOptions) {
            try {
                this.zzb.zzm(adManagerAdViewOptions);
            } catch (RemoteException e) {
                zzo.zzk("Failed to specify Ad Manager banner ad options", e);
            }
            return this;
        }

        public Builder withNativeAdOptions(NativeAdOptions nativeAdOptions) {
            try {
                this.zzb.zzo(new zzbfl(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), -1, nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzga(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zzc(), nativeAdOptions.getMediaAspectRatio(), nativeAdOptions.zza(), nativeAdOptions.zzb(), nativeAdOptions.zzd() - 1));
            } catch (RemoteException e) {
                zzo.zzk("Failed to specify native ad options", e);
            }
            return this;
        }

        @Deprecated
        public final Builder zza(String str, com.google.android.gms.ads.formats.zzg zzg, zzf zzf) {
            zzbia zzbia = new zzbia(zzg, zzf);
            try {
                this.zzb.zzh(str, zzbia.zzd(), zzbia.zzc());
            } catch (RemoteException e) {
                zzo.zzk("Failed to add custom template ad listener", e);
            }
            return this;
        }

        @Deprecated
        public final Builder zzb(zzi zzi) {
            try {
                this.zzb.zzk(new zzbid(zzi));
            } catch (RemoteException e) {
                zzo.zzk("Failed to add google native ad listener", e);
            }
            return this;
        }

        @Deprecated
        public final Builder zzc(com.google.android.gms.ads.formats.NativeAdOptions nativeAdOptions) {
            try {
                this.zzb.zzo(new zzbfl(nativeAdOptions));
            } catch (RemoteException e) {
                zzo.zzk("Failed to specify native ad options", e);
            }
            return this;
        }

        public Builder forAdManagerAdView(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener, AdSize... adSizeArr) {
            if (adSizeArr == null || adSizeArr.length <= 0) {
                throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
            }
            try {
                this.zzb.zzj(new zzbic(onAdManagerAdViewLoadedListener), new zzs(this.zza, adSizeArr));
            } catch (RemoteException e) {
                zzo.zzk("Failed to add Google Ad Manager banner ad listener", e);
            }
            return this;
        }
    }

    AdLoader(Context context, zzbr zzbr, zzr zzr) {
        this.zzb = context;
        this.zzc = zzbr;
        this.zza = zzr;
    }

    private final void zzb(zzei zzei) {
        zzbcl.zza(this.zzb);
        if (((Boolean) zzbej.zzc.zze()).booleanValue()) {
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzla)).booleanValue()) {
                zzb.zzb.execute(new zza(this, zzei));
                return;
            }
        }
        try {
            this.zzc.zzg(this.zza.zza(this.zzb, zzei));
        } catch (RemoteException e) {
            zzo.zzh("Failed to load ad.", e);
        }
    }

    public boolean isLoading() {
        try {
            return this.zzc.zzi();
        } catch (RemoteException e) {
            zzo.zzk("Failed to check if ad is loading.", e);
            return false;
        }
    }

    public void loadAd(AdRequest adRequest) {
        zzb(adRequest.zza);
    }

    public void loadAds(AdRequest adRequest, int i) {
        try {
            this.zzc.zzh(this.zza.zza(this.zzb, adRequest.zza), i);
        } catch (RemoteException e) {
            zzo.zzh("Failed to load ads.", e);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzei zzei) {
        try {
            this.zzc.zzg(this.zza.zza(this.zzb, zzei));
        } catch (RemoteException e) {
            zzo.zzh("Failed to load ad.", e);
        }
    }

    public void loadAd(AdManagerAdRequest adManagerAdRequest) {
        zzb(adManagerAdRequest.zza);
    }
}
