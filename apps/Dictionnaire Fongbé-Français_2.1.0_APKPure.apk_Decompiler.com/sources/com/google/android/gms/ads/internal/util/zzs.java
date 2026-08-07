package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.formats.zzj;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbcc;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbdm;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbvu;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzceo;
import com.google.android.gms.internal.ads.zzcga;
import com.google.android.gms.internal.ads.zzcgq;
import com.google.android.gms.internal.ads.zzdoz;
import com.google.android.gms.internal.ads.zzdrv;
import com.google.android.gms.internal.ads.zzdrw;
import com.google.android.gms.internal.ads.zzfbo;
import com.google.android.gms.internal.ads.zzfbr;
import com.google.android.gms.internal.ads.zzfir;
import com.google.android.gms.internal.ads.zzfqw;
import com.google.android.gms.internal.ads.zzfty;
import com.google.android.gms.internal.ads.zzfvc;
import com.google.android.gms.internal.ads.zzfve;
import com.google.android.gms.internal.ads.zzgch;
import com.google.android.gms.internal.ads.zzhfk;
import com.google.common.net.HttpHeaders;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzs {
    public static final zzfqw zza = new zzf(Looper.getMainLooper());
    private final AtomicReference zzb = new AtomicReference((Object) null);
    private final AtomicReference zzc = new AtomicReference((Object) null);
    private final AtomicReference zzd = new AtomicReference(new Bundle());
    private final AtomicBoolean zze = new AtomicBoolean();
    /* access modifiers changed from: private */
    public boolean zzf = true;
    private final Object zzg = new Object();
    private String zzh;
    private volatile String zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private final Executor zzl = Executors.newSingleThreadExecutor();

    public static final zzbr zzA(Context context) {
        try {
            Object newInstance = context.getClassLoader().loadClass("com.google.android.gms.ads.internal.util.WorkManagerUtil").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
            if (!(newInstance instanceof IBinder)) {
                zzo.zzg("Instantiated WorkManagerUtil not instance of IBinder.");
                return null;
            }
            IBinder iBinder = (IBinder) newInstance;
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
            if (queryLocalInterface instanceof zzbr) {
                return (zzbr) queryLocalInterface;
            }
            return new zzbp(iBinder);
        } catch (Exception e) {
            zzv.zzp().zzw(e, "Failed to instantiate WorkManagerUtil");
            return null;
        }
    }

    public static final boolean zzB(Context context, String str) {
        Context zza2 = zzbvu.zza(context);
        return Wrappers.packageManager(zza2).checkPermission(str, zza2.getPackageName()) == 0;
    }

    public static final boolean zzC(Context context) {
        try {
            return DeviceProperties.isBstar(context);
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    public static final boolean zzD(String str) {
        if (!zzl.zzk()) {
            return false;
        }
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzeY)).booleanValue()) {
            return false;
        }
        String str2 = (String) zzbe.zzc().zza(zzbcl.zzfa);
        if (!str2.isEmpty()) {
            for (String equals : str2.split(";")) {
                if (equals.equals(str)) {
                    return false;
                }
            }
        }
        String str3 = (String) zzbe.zzc().zza(zzbcl.zzeZ);
        if (str3.isEmpty()) {
            return true;
        }
        for (String equals2 : str3.split(";")) {
            if (equals2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean zzE(Context context) {
        KeyguardManager zzY;
        if (context == null || (zzY = zzY(context)) == null || !zzY.isKeyguardLocked()) {
            return false;
        }
        return true;
    }

    public static final boolean zzF(Context context) {
        try {
            context.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        } catch (Throwable th) {
            zzo.zzh("Error loading class.", th);
            zzv.zzp().zzw(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final boolean zzG() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    public static final boolean zzH(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager != null) {
                if (keyguardManager != null) {
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                    if (runningAppProcesses == null) {
                        return false;
                    }
                    for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                        if (Process.myPid() == next.pid) {
                            if (next.importance != 100 || keyguardManager.inKeyguardRestrictedInputMode()) {
                                return true;
                            }
                            PowerManager powerManager = (PowerManager) context.getSystemService("power");
                            if (powerManager == null) {
                                return true;
                            }
                            if (powerManager.isScreenOn()) {
                                return false;
                            }
                            return true;
                        }
                    }
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static final boolean zzI(Context context) {
        try {
            Bundle zzZ = zzZ(context);
            String string = zzZ.getString("com.google.android.gms.ads.INTEGRATION_MANAGER");
            if (!TextUtils.isEmpty(zzaa(zzZ)) || TextUtils.isEmpty(string)) {
                return false;
            }
            return true;
        } catch (RemoteException unused) {
        }
    }

    public static final boolean zzJ(Context context) {
        Window window;
        if (!(!(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null || window.getDecorView() == null)) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            window.getDecorView().getGlobalVisibleRect(rect, (Point) null);
            window.getDecorView().getWindowVisibleDisplayFrame(rect2);
            if (rect.bottom == 0 || rect2.bottom == 0 || rect.top != rect2.top) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final void zzK(View view, int i, MotionEvent motionEvent) {
        int i2;
        String str;
        int i3;
        int i4;
        String str2;
        zzfbo zzD;
        View view2 = view;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        try {
            String packageName = view.getContext().getPackageName();
            if (view2 instanceof zzdoz) {
                view2 = ((zzdoz) view2).getChildAt(0);
            }
            if ((view2 instanceof zzj) || (view2 instanceof NativeAdView)) {
                str = "NATIVE";
                i2 = 1;
            } else {
                str = "UNKNOWN";
                i2 = 0;
            }
            if (view2.getLocalVisibleRect(rect)) {
                i3 = rect.width();
                i4 = rect.height();
            } else {
                i4 = 0;
                i3 = 0;
            }
            zzv.zzq();
            long zzx = zzx(view2);
            view2.getLocationOnScreen(iArr);
            int i5 = iArr[0];
            int i6 = iArr[1];
            String str3 = "none";
            if (view2 instanceof zzcga) {
                zzfbr zzR = ((zzcga) view2).zzR();
                if (zzR != null) {
                    str2 = zzR.zzb;
                    int hashCode = view2.hashCode();
                    view2.setContentDescription(str2 + ":" + hashCode);
                    if ((view2 instanceof zzceo) && (zzD = ((zzceo) view2).zzD()) != null) {
                        str = zzfbo.zza(zzD.zzb);
                        i2 = zzD.zze;
                        str3 = zzD.zzE;
                    }
                    zzo.zzi(String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", new Object[]{Integer.valueOf(view2.hashCode()), packageName, str3, str2, str, Integer.valueOf(i2), view2.getClass().getName(), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(view2.getWidth()), Integer.valueOf(view2.getHeight()), Integer.valueOf(i3), Integer.valueOf(i4), Long.valueOf(zzx), Integer.toString(i, 2)}));
                }
            }
            str2 = str3;
            str = zzfbo.zza(zzD.zzb);
            i2 = zzD.zze;
            str3 = zzD.zzE;
            zzo.zzi(String.format(Locale.US, "<Ad hashCode=%d, package=%s, adNetCls=%s, gwsQueryId=%s, format=%s, impType=%d, class=%s, x=%d, y=%d, width=%d, height=%d, vWidth=%d, vHeight=%d, alpha=%d, state=%s>", new Object[]{Integer.valueOf(view2.hashCode()), packageName, str3, str2, str, Integer.valueOf(i2), view2.getClass().getName(), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(view2.getWidth()), Integer.valueOf(view2.getHeight()), Integer.valueOf(i3), Integer.valueOf(i4), Long.valueOf(zzx), Integer.toString(i, 2)}));
        } catch (Exception e) {
            zzo.zzh("Failure getting view location.", e);
        }
    }

    public static final AlertDialog.Builder zzL(Context context) {
        zzv.zzr();
        return new AlertDialog.Builder(context, 16974374);
    }

    public static final void zzM(Context context, String str, String str2) {
        new zzbw(context, str, str2, (zzfir) null, (com.google.android.gms.ads.internal.util.client.zzv) null).zzb();
    }

    public static final void zzN(Context context, Throwable th) {
        if (context != null) {
            try {
                if (((Boolean) zzbeu.zzb.zze()).booleanValue()) {
                    CrashUtils.addDynamiteErrorToDropBox(context, th);
                }
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static final int zzO(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            zzo.zzj("Could not parse value:".concat(e.toString()));
            return 0;
        }
    }

    public static final Map zzP(Uri uri) {
        String encodedQuery;
        String str;
        if (uri == null) {
            return null;
        }
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzp)).booleanValue()) {
            HashMap hashMap = new HashMap();
            if (!uri.isOpaque() && (encodedQuery = uri.getEncodedQuery()) != null) {
                int i = 0;
                while (true) {
                    int indexOf = encodedQuery.indexOf(38, i);
                    int length = encodedQuery.length();
                    if (indexOf != -1) {
                        length = indexOf;
                    }
                    int indexOf2 = encodedQuery.indexOf(61, i);
                    if (indexOf2 > length || indexOf2 == -1) {
                        indexOf2 = length;
                    }
                    String decode = Uri.decode(encodedQuery.substring(i, indexOf2));
                    if (indexOf2 == length) {
                        str = "";
                    } else {
                        str = Uri.decode(encodedQuery.substring(indexOf2 + 1, length));
                    }
                    hashMap.put(decode, str);
                    if (indexOf == -1) {
                        break;
                    }
                    i = indexOf + 1;
                }
            }
            return hashMap;
        }
        HashMap hashMap2 = new HashMap();
        for (String next : uri.getQueryParameterNames()) {
            if (!TextUtils.isEmpty(next)) {
                hashMap2.put(next, uri.getQueryParameter(next));
            }
        }
        return hashMap2;
    }

    public static final int[] zzQ(Activity activity) {
        View findViewById;
        Window window = activity.getWindow();
        if (window == null || (findViewById = window.findViewById(16908290)) == null) {
            return zzv();
        }
        return new int[]{findViewById.getWidth(), findViewById.getHeight()};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.findViewById(16908290);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int[] zzR(android.app.Activity r5) {
        /*
            android.view.Window r0 = r5.getWindow()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0021
            r3 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r3)
            if (r0 == 0) goto L_0x0021
            r3 = 2
            int[] r3 = new int[r3]
            int r4 = r0.getTop()
            r3[r2] = r4
            int r0 = r0.getBottom()
            r3[r1] = r0
            goto L_0x0025
        L_0x0021:
            int[] r3 = zzv()
        L_0x0025:
            com.google.android.gms.ads.internal.util.client.zzf r0 = com.google.android.gms.ads.internal.client.zzbc.zzb()
            r2 = r3[r2]
            int r0 = r0.zzb(r5, r2)
            com.google.android.gms.ads.internal.util.client.zzf r2 = com.google.android.gms.ads.internal.client.zzbc.zzb()
            r1 = r3[r1]
            int r5 = r2.zzb(r5, r1)
            int[] r5 = new int[]{r0, r5}
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzs.zzR(android.app.Activity):int[]");
    }

    public static final boolean zzS(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z = zzv.zzq().zzf || keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode() || zzo(view);
        long zzx = zzx(view);
        if (view.getVisibility() == 0 && view.isShown() && ((powerManager == null || powerManager.isScreenOn()) && z)) {
            if (!((Boolean) zzbe.zzc().zza(zzbcl.zzbu)).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect())) {
                if (!((Boolean) zzbe.zzc().zza(zzbcl.zzkv)).booleanValue()) {
                    return true;
                }
                if (zzx < ((long) ((Integer) zzbe.zzc().zza(zzbcl.zzkx)).intValue())) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static final void zzT(Context context, Intent intent) {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzkS)).booleanValue()) {
            try {
                zzad(context, intent);
            } catch (SecurityException e) {
                zzo.zzk("", e);
                zzv.zzp().zzw(e, "AdUtil.startActivityWithUnknownContext");
            }
        } else {
            zzad(context, intent);
        }
    }

    public static final void zzU(Context context, Uri uri) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            Bundle bundle = new Bundle();
            intent.putExtras(bundle);
            zzp(context, intent);
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(intent);
            String uri2 = uri.toString();
            zzo.zze("Opening " + uri2 + " in a new browser.");
        } catch (ActivityNotFoundException e) {
            zzo.zzh("No browser is found.", e);
        }
    }

    public static final int[] zzV(Activity activity) {
        int[] zzQ = zzQ(activity);
        return new int[]{zzbc.zzb().zzb(activity, zzQ[0]), zzbc.zzb().zzb(activity, zzQ[1])};
    }

    public static final boolean zzW(View view, Context context) {
        Context applicationContext = context.getApplicationContext();
        return zzS(view, applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null, zzY(context));
    }

    public static final void zzX(Context context, Intent intent, zzdrw zzdrw, String str) {
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzmU)).booleanValue() || !(context instanceof zzcgq)) {
            zzT(context, intent);
            return;
        }
        try {
            Uri data = intent.getData();
            if (!(data == null || data.toString() == null)) {
                if (data.toString().matches((String) zzbe.zzc().zza(zzbcl.zzmW))) {
                    ((zzcgq) context).zzc(intent, 236);
                    if (((Boolean) zzbe.zzc().zza(zzbcl.zzmV)).booleanValue() && zzdrw != null) {
                        zzdrv zza2 = zzdrw.zza();
                        zza2.zzb("action", "hila");
                        zza2.zzb("gqi", zzfve.zzc(str));
                        zza2.zzf();
                        return;
                    }
                    return;
                }
            }
            zzT(context, intent);
        } catch (ActivityNotFoundException | SecurityException e) {
            zzo.zzh("Error occurred while starting activity for result", e);
            zzv.zzp().zzw(e, "AdUtil.startActivityForResult");
            zzT(context, intent);
        } catch (Exception e2) {
            zzo.zzh("Error occurred while starting activity for result", e2);
            zzv.zzp().zzw(e2, "AdUtil.startActivityForResult");
            zzT(context, intent);
        }
    }

    private static KeyguardManager zzY(Context context) {
        Object systemService = context.getSystemService("keyguard");
        if (systemService == null || !(systemService instanceof KeyguardManager)) {
            return null;
        }
        return (KeyguardManager) systemService;
    }

    private static Bundle zzZ(Context context) throws RemoteException {
        try {
            return Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            zze.zzb("Error getting metadata", e);
            return null;
        }
    }

    public static int zza(int i) {
        if (i >= 5000) {
            return i;
        }
        if (i <= 0) {
            return 60000;
        }
        zzo.zzj("HTTP timeout too low: " + i + " milliseconds. Reverting to default timeout: 60000 milliseconds.");
        return 60000;
    }

    private static String zzaa(Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
        if (TextUtils.isEmpty(string)) {
            return "";
        }
        if (string.matches("^ca-app-pub-[0-9]{16}~[0-9]{10}$") || string.matches("^/\\d+~.+$")) {
            return string;
        }
        return "";
    }

    private static boolean zzab(String str, AtomicReference atomicReference, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Pattern pattern = (Pattern) atomicReference.get();
            if (pattern == null || !str2.equals(pattern.pattern())) {
                pattern = Pattern.compile(str2);
                atomicReference.set(pattern);
            }
            return pattern.matcher(str).matches();
        } catch (PatternSyntaxException unused) {
            return false;
        }
    }

    private static final void zzac(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    private static final void zzad(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    private static final String zzae(Context context, String str) {
        String str2;
        String str3;
        if (str == null) {
            return zzr();
        }
        try {
            zzcg zza2 = zzcg.zza();
            if (TextUtils.isEmpty(zza2.zza)) {
                if (ClientLibraryUtils.isPackageSide()) {
                    str3 = (String) zzcd.zza(context, new zzce(context));
                } else {
                    str3 = (String) zzcd.zza(context, new zzcf(GooglePlayServicesUtilLight.getRemoteContext(context), context));
                }
                zza2.zza = str3;
            }
            str2 = zza2.zza;
        } catch (Exception unused) {
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = WebSettings.getDefaultUserAgent(context);
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = zzr();
        }
        String str4 = str2 + " (Mobile; " + str;
        try {
            if (Wrappers.packageManager(context).isCallerInstantApp()) {
                str4 = str4 + ";aia";
            }
        } catch (Exception e) {
            zzv.zzp().zzw(e, "AdUtil.getUserAgent");
        }
        return str4.concat(")");
    }

    public static List zzd() {
        zzbcc zzbcc = zzbcl.zza;
        List<String> zzb2 = zzbe.zza().zzb();
        ArrayList arrayList = new ArrayList();
        for (String zzd2 : zzb2) {
            for (String valueOf : zzfvc.zzb(zzfty.zzc(',')).zzd(zzd2)) {
                try {
                    arrayList.add(Long.valueOf(valueOf));
                } catch (NumberFormatException unused) {
                    zze.zza("Experiment ID is not a number");
                }
            }
        }
        return arrayList;
    }

    public static void zzh(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            zzbzw.zza.execute(runnable);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean zzo(android.view.View r2) {
        /*
            android.view.View r2 = r2.getRootView()
            r0 = 0
            if (r2 != 0) goto L_0x0009
        L_0x0007:
            r2 = r0
            goto L_0x0013
        L_0x0009:
            android.content.Context r2 = r2.getContext()
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0007
            android.app.Activity r2 = (android.app.Activity) r2
        L_0x0013:
            r1 = 0
            if (r2 != 0) goto L_0x0017
            return r1
        L_0x0017:
            android.view.Window r2 = r2.getWindow()
            if (r2 != 0) goto L_0x001e
            goto L_0x0022
        L_0x001e:
            android.view.WindowManager$LayoutParams r0 = r2.getAttributes()
        L_0x0022:
            if (r0 == 0) goto L_0x002d
            int r2 = r0.flags
            r0 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x002d
            r2 = 1
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzs.zzo(android.view.View):boolean");
    }

    public static final void zzp(Context context, Intent intent) {
        if (intent != null) {
            Bundle extras = intent.getExtras() != null ? intent.getExtras() : new Bundle();
            extras.putBinder(CustomTabsIntent.EXTRA_SESSION, (IBinder) null);
            extras.putString("com.android.browser.application_id", context.getPackageName());
            intent.putExtras(extras);
        }
    }

    public static final String zzq(Context context) throws RemoteException {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        return zzaa(zzZ(context));
    }

    static final String zzr() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("Mozilla/5.0 (Linux; U; Android");
        if (Build.VERSION.RELEASE != null) {
            sb.append(" ");
            sb.append(Build.VERSION.RELEASE);
        }
        sb.append("; ");
        sb.append(Locale.getDefault());
        if (Build.DEVICE != null) {
            sb.append("; ");
            sb.append(Build.DEVICE);
            if (Build.DISPLAY != null) {
                sb.append(" Build/");
                sb.append(Build.DISPLAY);
            }
        }
        sb.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return sb.toString();
    }

    public static final String zzs() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return str2;
        }
        return str + " " + str2;
    }

    public static final Integer zzt(Context context) {
        Object systemService = context.getSystemService("display");
        if (systemService instanceof DisplayManager) {
            return Integer.valueOf(((DisplayManager) systemService).getDisplays().length);
        }
        return null;
    }

    public static final DisplayMetrics zzu(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    protected static final int[] zzv() {
        return new int[]{0, 0};
    }

    public static final Map zzw(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                HashSet hashSet = new HashSet();
                JSONArray optJSONArray = jSONObject.optJSONArray(next);
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        String optString = optJSONArray.optString(i);
                        if (optString != null) {
                            hashSet.add(optString);
                        }
                    }
                    hashMap.put(next, hashSet);
                }
            }
            return hashMap;
        } catch (JSONException e) {
            zzv.zzp().zzw(e, "AdUtil.getMapOfFileNamesToKeysFromJsonString");
            return hashMap;
        }
    }

    public static final long zzx(View view) {
        float f;
        int i;
        float f2 = Float.MAX_VALUE;
        Object obj = view;
        do {
            f = 0.0f;
            if (!(obj instanceof View)) {
                break;
            }
            View view2 = (View) obj;
            f2 = Math.min(f2, view2.getAlpha());
            i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            obj = view2.getParent();
        } while (i > 0);
        if (f2 >= 0.0f) {
            f = f2;
        }
        return (long) Math.round(f * 100.0f);
    }

    public static final WebResourceResponse zzy(Context context, String str, String str2) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put(HttpHeaders.USER_AGENT, zzv.zzq().zzc(context, str));
            hashMap.put(HttpHeaders.CACHE_CONTROL, "max-stale=3600");
            String str3 = (String) new zzbo(context).zzb(0, str2, hashMap, (byte[]) null).get(60, TimeUnit.SECONDS);
            if (str3 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(str3.getBytes("UTF-8")));
            }
        } catch (IOException | InterruptedException | ExecutionException | TimeoutException e) {
            zzo.zzk("Could not fetch MRAID JS.", e);
        }
        return null;
    }

    public static final String zzz() {
        Resources zze2 = zzv.zzp().zze();
        return zze2 != null ? zze2.getString(R.string.s7) : "Test Ad";
    }

    public final ListenableFuture zzb(Uri uri) {
        return zzgch.zzj(new zzn(uri), this.zzl);
    }

    public final String zzc(Context context, String str) {
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzle)).booleanValue()) {
            synchronized (this.zzg) {
                String str2 = this.zzh;
                if (str2 != null) {
                    return str2;
                }
                String zzae = zzae(context, str);
                this.zzh = zzae;
                return zzae;
            }
        } else if (this.zzi != null) {
            return this.zzi;
        } else {
            this.zzi = zzae(context, str);
            return this.zzi;
        }
    }

    public final void zzf(Context context, String str, boolean z, HttpURLConnection httpURLConnection, boolean z2, int i) {
        int zza2 = zza(i);
        zzo.zzi("HTTP timeout: " + zza2 + " milliseconds.");
        httpURLConnection.setConnectTimeout(zza2);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setReadTimeout(zza2);
        if (TextUtils.isEmpty(httpURLConnection.getRequestProperty(HttpHeaders.USER_AGENT))) {
            httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, zzc(context, str));
        }
        httpURLConnection.setUseCaches(false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(Context context, String str, SharedPreferences sharedPreferences, String str2) {
        this.zzd.set(zzad.zzb(context, str));
    }

    public final void zzi(Context context, String str, String str2, Bundle bundle, boolean z) {
        zzv.zzq();
        bundle.putString("device", zzs());
        zzbcc zzbcc = zzbcl.zza;
        bundle.putString("eids", TextUtils.join(",", zzbe.zza().zza()));
        if (bundle.isEmpty()) {
            zzo.zze("Empty or null bundle.");
        } else {
            String str3 = (String) zzbe.zzc().zza(zzbcl.zzkt);
            if (!this.zze.getAndSet(true)) {
                this.zzd.set(zzad.zza(context, str3, new zzm(this, context, str3)));
            }
            bundle.putAll((Bundle) this.zzd.get());
        }
        zzbc.zzb();
        zzf.zzw(context, str, "gmob-apps", bundle, true, new zzl(context, str));
    }

    public final boolean zzj(String str) {
        zzbcc zzbcc = zzbcl.zzao;
        return zzab(str, this.zzb, (String) zzbe.zzc().zza(zzbcc));
    }

    public final boolean zzk(String str) {
        zzbcc zzbcc = zzbcl.zzap;
        return zzab(str, this.zzc, (String) zzbe.zzc().zza(zzbcc));
    }

    public final boolean zzl(Context context) {
        if (this.zzk) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.ads.intent.DEBUG_LOGGING_ENABLEMENT_CHANGED");
        zzbcl.zza(context);
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzkR)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new zzp(this, (zzr) null), intentFilter);
        } else {
            Intent unused = context.getApplicationContext().registerReceiver(new zzp(this, (zzr) null), intentFilter, 4);
        }
        this.zzk = true;
        return true;
    }

    public final boolean zzm(Context context) {
        if (this.zzj) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        zzbcl.zza(context);
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzkR)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.getApplicationContext().registerReceiver(new zzq(this, (zzr) null), intentFilter);
        } else {
            Intent unused = context.getApplicationContext().registerReceiver(new zzq(this, (zzr) null), intentFilter, 4);
        }
        this.zzj = true;
        return true;
    }

    public final int zzn(Context context, Uri uri) {
        if (context == null) {
            zze.zza("Trying to open chrome custom tab on a null context");
            return 3;
        } else if (!(context instanceof Activity)) {
            zzac(context, uri);
            return 2;
        } else {
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzeG)).booleanValue()) {
                CustomTabsIntent build = new CustomTabsIntent.Builder(zzv.zzf().zza()).build();
                build.intent.setPackage(zzhfk.zza(context));
                build.launchUrl(context, uri);
                return 5;
            }
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzeE)).booleanValue()) {
                zzbdm zzbdm = new zzbdm();
                zzbdm.zze(new zzo(this, zzbdm, context, uri));
                zzbdm.zzb((Activity) context);
                return 5;
            }
            zzac(context, uri);
            return 9;
        }
    }
}
