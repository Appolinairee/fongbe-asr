package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import androidx.core.util.HalfKt$$ExternalSyntheticApiModelOutline0;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentRequestParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
final class zzn {
    private final zzl zza;
    private final Activity zzb;
    private final ConsentDebugSettings zzc;
    private final ConsentRequestParameters zzd;

    /* synthetic */ zzn(zzl zzl, Activity activity, ConsentDebugSettings consentDebugSettings, ConsentRequestParameters consentRequestParameters, zzm zzm) {
        this.zza = zzl;
        this.zzb = activity;
        this.zzc = consentDebugSettings;
        this.zzd = consentRequestParameters;
    }

    static /* bridge */ /* synthetic */ zzcf zza(zzn zzn) {
        List list;
        List list2;
        PackageInfo packageInfo;
        long j;
        View view;
        WindowInsets windowInsets;
        DisplayCutout displayCutout;
        Bundle bundle;
        zzcf zzcf = new zzcf();
        String zza2 = zzn.zzd.zza();
        String str = null;
        if (TextUtils.isEmpty(zza2)) {
            try {
                bundle = zzn.zza.zza.getPackageManager().getApplicationInfo(zzn.zza.zza.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            if (bundle != null) {
                zza2 = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            }
            if (TextUtils.isEmpty(zza2)) {
                throw new zzg(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        }
        zzcf.zza = zza2;
        if (!zzn.zzc.isTestDevice()) {
            list = Collections.emptyList();
        } else {
            list = new ArrayList();
            int debugGeography = zzn.zzc.getDebugGeography();
            if (debugGeography == 1) {
                list.add(zzca.GEO_OVERRIDE_EEA);
            } else if (debugGeography == 2) {
                list.add(zzca.GEO_OVERRIDE_NON_EEA);
            } else if (debugGeography == 3) {
                list.add(zzca.GEO_OVERRIDE_REGULATED_US_STATE);
            } else if (debugGeography == 4) {
                list.add(zzca.GEO_OVERRIDE_OTHER);
            }
            list.add(zzca.PREVIEWING_DEBUG_MESSAGES);
        }
        zzcf.zzi = list;
        zzcf.zze = zzn.zza.zzb.zzc();
        zzcf.zzd = Boolean.valueOf(zzn.zzd.isTagForUnderAgeOfConsent());
        zzcf.zzc = Locale.getDefault().toLanguageTag();
        zzcb zzcb = new zzcb();
        zzcb.zzb = Integer.valueOf(Build.VERSION.SDK_INT);
        zzcb.zza = Build.MODEL;
        zzcb.zzc = 2;
        zzcf.zzb = zzcb;
        Configuration configuration = zzn.zza.zza.getResources().getConfiguration();
        zzn.zza.zza.getResources().getConfiguration();
        zzcd zzcd = new zzcd();
        zzcd.zza = Integer.valueOf(configuration.screenWidthDp);
        zzcd.zzb = Integer.valueOf(configuration.screenHeightDp);
        zzcd.zzc = Double.valueOf((double) zzn.zza.zza.getResources().getDisplayMetrics().density);
        if (Build.VERSION.SDK_INT < 28) {
            list2 = Collections.emptyList();
        } else {
            Activity activity = zzn.zzb;
            Window window = activity == null ? null : activity.getWindow();
            if (window == null) {
                view = null;
            } else {
                view = window.getDecorView();
            }
            if (view == null) {
                windowInsets = null;
            } else {
                windowInsets = view.getRootWindowInsets();
            }
            if (windowInsets == null) {
                displayCutout = null;
            } else {
                displayCutout = HalfKt$$ExternalSyntheticApiModelOutline0.m(windowInsets);
            }
            if (displayCutout == null) {
                list2 = Collections.emptyList();
            } else {
                int unused2 = displayCutout.getSafeInsetBottom();
                ArrayList arrayList = new ArrayList();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    if (rect != null) {
                        zzcc zzcc = new zzcc();
                        zzcc.zzb = Integer.valueOf(rect.left);
                        zzcc.zzc = Integer.valueOf(rect.right);
                        zzcc.zza = Integer.valueOf(rect.top);
                        zzcc.zzd = Integer.valueOf(rect.bottom);
                        arrayList.add(zzcc);
                    }
                }
                list2 = arrayList;
            }
        }
        zzcd.zzd = list2;
        zzcf.zzf = zzcd;
        zzl zzl = zzn.zza;
        Application zza3 = zzl.zza;
        try {
            packageInfo = zzl.zza.getPackageManager().getPackageInfo(zza3.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused3) {
            packageInfo = null;
        }
        zzbz zzbz = new zzbz();
        zzbz.zza = zza3.getPackageName();
        CharSequence applicationLabel = zzn.zza.zza.getPackageManager().getApplicationLabel(zzn.zza.zza.getApplicationInfo());
        if (applicationLabel != null) {
            str = applicationLabel.toString();
        }
        zzbz.zzb = str;
        if (packageInfo != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                j = packageInfo.getLongVersionCode();
            } else {
                j = (long) packageInfo.versionCode;
            }
            zzbz.zzc = Long.toString(j);
        }
        zzcf.zzg = zzbz;
        zzce zzce = new zzce();
        zzce.zza = "3.1.0";
        zzcf.zzh = zzce;
        return zzcf;
    }
}
