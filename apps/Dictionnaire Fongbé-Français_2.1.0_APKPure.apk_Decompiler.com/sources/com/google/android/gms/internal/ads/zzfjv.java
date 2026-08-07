package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.work.impl.utils.ProcessUtils$$ExternalSyntheticApiModelOutline0;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzft;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfjv {
    private final ConcurrentMap zza = new ConcurrentHashMap();
    private final ConcurrentMap zzb = new ConcurrentHashMap();
    private final zzfki zzc;
    private final zzfjp zzd;
    private final Context zze;
    private volatile ConnectivityManager zzf;
    private final Clock zzg;
    private AtomicInteger zzh;

    zzfjv(zzfki zzfki, zzfjp zzfjp, Context context, Clock clock) {
        this.zzc = zzfki;
        this.zzd = zzfjp;
        this.zze = context;
        this.zzg = clock;
    }

    static String zzd(String str, AdFormat adFormat) {
        String name = adFormat == null ? "NULL" : adFormat.name();
        return str + "#" + name;
    }

    private final synchronized zzfkh zzn(String str, AdFormat adFormat) {
        return (zzfkh) this.zza.get(zzd(str, adFormat));
    }

    private final synchronized List zzo(List list) {
        ArrayList arrayList;
        HashSet hashSet = new HashSet();
        arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzft zzft = (zzft) it.next();
            String zzd2 = zzd(zzft.zza, AdFormat.getAdFormat(zzft.zzb));
            hashSet.add(zzd2);
            zzfkh zzfkh = (zzfkh) this.zza.get(zzd2);
            if (zzfkh != null) {
                if (!zzfkh.zze.equals(zzft)) {
                    this.zzb.put(zzd2, zzfkh);
                    this.zza.remove(zzd2);
                } else {
                    zzfkh.zzs(zzft.zzd);
                }
            } else if (this.zzb.containsKey(zzd2)) {
                zzfkh zzfkh2 = (zzfkh) this.zzb.get(zzd2);
                if (zzfkh2.zze.equals(zzft)) {
                    zzfkh2.zzs(zzft.zzd);
                    zzfkh2.zzp();
                    this.zza.put(zzd2, zzfkh2);
                    this.zzb.remove(zzd2);
                }
            } else {
                arrayList.add(zzft);
            }
        }
        Iterator it2 = this.zza.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            if (!hashSet.contains((String) entry.getKey())) {
                this.zzb.put((String) entry.getKey(), (zzfkh) entry.getValue());
                it2.remove();
            }
        }
        Iterator it3 = this.zzb.entrySet().iterator();
        while (it3.hasNext()) {
            zzfkh zzfkh3 = (zzfkh) ((Map.Entry) it3.next()).getValue();
            zzfkh3.zzr();
            if (!zzfkh3.zzt()) {
                it3.remove();
            }
        }
        return arrayList;
    }

    private final synchronized Optional zzp(Class cls, String str, AdFormat adFormat) {
        this.zzd.zzd(adFormat, this.zzg.currentTimeMillis());
        zzfkh zzn = zzn(str, adFormat);
        if (zzn == null) {
            return ProcessUtils$$ExternalSyntheticApiModelOutline0.m();
        }
        try {
            Optional zzf2 = zzn.zzf();
            Optional m = ProcessUtils$$ExternalSyntheticApiModelOutline0.m(zzn.zze());
            Objects.requireNonNull(cls);
            Optional m2 = m.map(new zzfjr(cls));
            m2.ifPresent(new zzfjs(this, adFormat, zzf2));
            return m2;
        } catch (ClassCastException e) {
            zzv.zzp().zzw(e, "PreloadAdManager.pollAd");
            zze.zzb("Unable to cast ad to the requested type:".concat(String.valueOf(cls.getName())), e);
            return ProcessUtils$$ExternalSyntheticApiModelOutline0.m();
        }
    }

    private final synchronized void zzq(String str, zzfkh zzfkh) {
        zzfkh.zzc();
        this.zza.put(str, zzfkh);
    }

    /* access modifiers changed from: private */
    public final synchronized void zzr(boolean z) {
        if (z) {
            for (zzfkh zzp : this.zza.values()) {
                zzp.zzp();
            }
        } else {
            for (zzfkh zzfkh : this.zza.values()) {
                zzfkh.zzf.set(false);
            }
        }
    }

    /* access modifiers changed from: private */
    public final synchronized void zzs(boolean z) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzt)).booleanValue()) {
            zzr(z);
        }
    }

    private final synchronized boolean zzt(String str, AdFormat adFormat) {
        boolean z;
        long currentTimeMillis = this.zzg.currentTimeMillis();
        zzfkh zzn = zzn(str, adFormat);
        z = false;
        if (zzn != null && zzn.zzt()) {
            z = true;
        }
        this.zzd.zza(adFormat, currentTimeMillis, z ? Optional.of(Long.valueOf(this.zzg.currentTimeMillis())) : ProcessUtils$$ExternalSyntheticApiModelOutline0.m(), zzn == null ? ProcessUtils$$ExternalSyntheticApiModelOutline0.m() : zzn.zzf());
        return z;
    }

    public final synchronized zzbad zza(String str) {
        return (zzbad) zzp(zzbad.class, str, AdFormat.APP_OPEN_AD).orElse((Object) null);
    }

    public final synchronized zzby zzb(String str) {
        return (zzby) zzp(zzby.class, str, AdFormat.INTERSTITIAL).orElse((Object) null);
    }

    public final synchronized zzbwp zzc(String str) {
        return (zzbwp) zzp(zzbwp.class, str, AdFormat.REWARDED).orElse((Object) null);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(AdFormat adFormat, Optional optional, Object obj) {
        this.zzd.zze(adFormat, this.zzg.currentTimeMillis(), optional);
    }

    public final void zzh() {
        if (this.zzf == null) {
            synchronized (this) {
                if (this.zzf == null) {
                    try {
                        this.zzf = (ConnectivityManager) this.zze.getSystemService("connectivity");
                    } catch (ClassCastException e) {
                        zzo.zzk("Failed to get connectivity manager", e);
                    }
                }
            }
        }
        if (!PlatformVersion.isAtLeastO() || this.zzf == null) {
            this.zzh = new AtomicInteger(((Integer) zzbe.zzc().zza(zzbcl.zzy)).intValue());
            return;
        }
        try {
            this.zzf.registerDefaultNetworkCallback(new zzfju(this));
        } catch (RuntimeException e2) {
            zzo.zzk("Failed to register network callback", e2);
            this.zzh = new AtomicInteger(((Integer) zzbe.zzc().zza(zzbcl.zzy)).intValue());
        }
    }

    public final void zzi(zzbpe zzbpe) {
        this.zzc.zzb(zzbpe);
    }

    public final synchronized void zzj(List list, zzcf zzcf) {
        List<zzft> zzo = zzo(list);
        EnumMap enumMap = new EnumMap(AdFormat.class);
        for (zzft zzft : zzo) {
            String str = zzft.zza;
            AdFormat adFormat = AdFormat.getAdFormat(zzft.zzb);
            zzfkh zza2 = this.zzc.zza(zzft, zzcf);
            if (!(adFormat == null || zza2 == null)) {
                AtomicInteger atomicInteger = this.zzh;
                if (atomicInteger != null) {
                    zza2.zzo(atomicInteger.get());
                }
                zza2.zzq(this.zzd);
                zzq(zzd(str, adFormat), zza2);
                enumMap.put(adFormat, Integer.valueOf(((Integer) enumMap.getOrDefault(adFormat, 0)).intValue() + 1));
            }
        }
        this.zzd.zzf(enumMap, this.zzg.currentTimeMillis());
        zzv.zzb().zzc(new zzfjt(this));
    }

    public final synchronized boolean zzk(String str) {
        return zzt(str, AdFormat.APP_OPEN_AD);
    }

    public final synchronized boolean zzl(String str) {
        return zzt(str, AdFormat.INTERSTITIAL);
    }

    public final synchronized boolean zzm(String str) {
        return zzt(str, AdFormat.REWARDED);
    }
}
