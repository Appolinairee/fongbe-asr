package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.Spanned;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzcq {
    private static final String zza = Integer.toString(0, 36);
    private static final String zzb = Integer.toString(1, 36);
    private static final String zzc = Integer.toString(2, 36);
    private static final String zzd = Integer.toString(3, 36);
    private static final String zze = Integer.toString(4, 36);

    public static ArrayList zza(Spanned spanned) {
        ArrayList arrayList = new ArrayList();
        for (zzcs zzcs : (zzcs[]) spanned.getSpans(0, spanned.length(), zzcs.class)) {
            arrayList.add(zzb(spanned, zzcs, 1, zzcs.zza()));
        }
        for (zzcu zzcu : (zzcu[]) spanned.getSpans(0, spanned.length(), zzcu.class)) {
            arrayList.add(zzb(spanned, zzcu, 2, zzcu.zza()));
        }
        for (zzcr zzb2 : (zzcr[]) spanned.getSpans(0, spanned.length(), zzcr.class)) {
            arrayList.add(zzb(spanned, zzb2, 3, (Bundle) null));
        }
        for (zzcv zzcv : (zzcv[]) spanned.getSpans(0, spanned.length(), zzcv.class)) {
            arrayList.add(zzb(spanned, zzcv, 4, zzcv.zza()));
        }
        return arrayList;
    }

    private static Bundle zzb(Spanned spanned, Object obj, int i, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(zza, spanned.getSpanStart(obj));
        bundle2.putInt(zzb, spanned.getSpanEnd(obj));
        bundle2.putInt(zzc, spanned.getSpanFlags(obj));
        bundle2.putInt(zzd, i);
        if (bundle != null) {
            bundle2.putBundle(zze, bundle);
        }
        return bundle2;
    }
}
