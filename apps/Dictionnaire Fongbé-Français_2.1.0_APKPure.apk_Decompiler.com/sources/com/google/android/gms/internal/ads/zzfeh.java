package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfeh implements zzfeg {
    private final Object[] zza;

    public zzfeh(zzm zzm, String str, int i, String str2, zzy zzy) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(zzm.zzb));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(zza(zzm.zzc));
        } else if (hashSet.contains("npa")) {
            arrayList.add(zzm.zzc.getString("npa"));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(zzm.zzd));
        }
        if (hashSet.contains("keywords")) {
            List list = zzm.zze;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add((Object) null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(zzm.zzf));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(zzm.zzg));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(zzm.zzh));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(zzm.zzi);
        }
        if (hashSet.contains("location")) {
            Location location = zzm.zzk;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add((Object) null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(zzm.zzl);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(zza(zzm.zzm));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(zza(zzm.zzn));
        }
        if (hashSet.contains("categoryExclusions")) {
            List list2 = zzm.zzo;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add((Object) null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(zzm.zzp);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(zzm.zzq);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(zzm.zzr));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(zzm.zzt));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(zzm.zzu);
        }
        if (hashSet.contains("orientation")) {
            if (zzy != null) {
                arrayList.add(Integer.valueOf(zzy.zza));
            } else {
                arrayList.add((Object) null);
            }
        }
        this.zza = arrayList.toArray();
    }

    private static String zza(Bundle bundle) {
        String str;
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            if (obj == null) {
                str = "null";
            } else if (obj instanceof Bundle) {
                str = zza((Bundle) obj);
            } else {
                str = obj.toString();
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzfeh)) {
            return false;
        }
        return Arrays.equals(this.zza, ((zzfeh) obj).zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        Object[] objArr = this.zza;
        int hashCode = Arrays.hashCode(objArr);
        String arrays = Arrays.toString(objArr);
        return "[PoolKey#" + hashCode + " " + arrays + "]";
    }
}
