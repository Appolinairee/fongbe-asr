package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.core.app.NotificationManagerCompat;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.NotificationHandlerActivity;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.offline.buffering.zza;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.net.HttpHeaders;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzebv extends zzbsw {
    final Map zza = new HashMap();
    private final Context zzb;
    private final zzdrw zzc;
    private final zzu zzd;
    private final zzebk zze;
    private String zzf;
    private String zzg;

    public zzebv(Context context, zzebk zzebk, zzu zzu, zzdrw zzdrw) {
        this.zzb = context;
        this.zzc = zzdrw;
        this.zzd = zzu;
        this.zze = zzebk;
    }

    public static void zzc(Context context, zzdrw zzdrw, zzebk zzebk, String str, String str2) {
        zzd(context, zzdrw, zzebk, str, str2, new HashMap());
    }

    public static void zzd(Context context, zzdrw zzdrw, zzebk zzebk, String str, String str2, Map map) {
        String str3;
        String str4 = true != zzv.zzp().zzA(context) ? "offline" : CustomTabsCallback.ONLINE_EXTRAS_KEY;
        if (zzdrw != null) {
            zzdrv zza2 = zzdrw.zza();
            zza2.zzb("gqi", str);
            zza2.zzb("action", str2);
            zza2.zzb("device_connectivity", str4);
            zza2.zzb("event_timestamp", String.valueOf(zzv.zzC().currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                zza2.zzb((String) entry.getKey(), (String) entry.getValue());
            }
            str3 = zza2.zze();
        } else {
            str3 = "";
        }
        zzebk.zzd(new zzebm(zzv.zzC().currentTimeMillis(), str, str3, 2));
    }

    public static final PendingIntent zzr(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, AdService.CLASS_NAME);
            return zzfrk.zzb(context, 0, intent, zzfrk.zza | 1073741824, 0);
        }
        intent.setClassName(context, NotificationHandlerActivity.CLASS_NAME);
        return zzfrk.zza(context, 0, intent, 201326592);
    }

    private final AlertDialog zzs(Activity activity, zzm zzm) {
        zzv.zzq();
        AlertDialog.Builder onCancelListener = zzs.zzL(activity).setOnCancelListener(new zzebn(zzm));
        XmlResourceParser zzt = zzt(R.layout.offline_ads_dialog);
        if (zzt == null) {
            onCancelListener.setMessage(zzv(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
        try {
            Drawable drawable = null;
            View inflate = activity.getLayoutInflater().inflate(zzt, (ViewGroup) null);
            onCancelListener.setView(inflate);
            String zzu = zzu();
            if (!TextUtils.isEmpty(zzu)) {
                TextView textView = (TextView) inflate.findViewById(R.id.offline_dialog_advertiser_name);
                textView.setVisibility(0);
                textView.setText(zzu);
            }
            zzebc zzebc = (zzebc) this.zza.get(this.zzf);
            if (zzebc != null) {
                drawable = zzebc.zza();
            }
            if (drawable != null) {
                ((ImageView) inflate.findViewById(R.id.offline_dialog_image)).setImageDrawable(drawable);
            }
            AlertDialog create = onCancelListener.create();
            create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            return create;
        } catch (Resources.NotFoundException unused) {
            onCancelListener.setMessage(zzv(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
    }

    private static XmlResourceParser zzt(int i) {
        Resources zze2 = zzv.zzp().zze();
        if (zze2 == null) {
            return null;
        }
        try {
            return zze2.getLayout(i);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    private final String zzu() {
        zzebc zzebc = (zzebc) this.zza.get(this.zzf);
        return zzebc == null ? "" : zzebc.zzb();
    }

    private static String zzv(int i, String str) {
        Resources zze2 = zzv.zzp().zze();
        if (zze2 == null) {
            return str;
        }
        try {
            return zze2.getString(i);
        } catch (Resources.NotFoundException unused) {
            return str;
        }
    }

    private final void zzw(String str, String str2, Map map) {
        zzd(this.zzb, this.zzc, this.zze, str, str2, map);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzx() {
        /*
            r6 = this;
            com.google.android.gms.ads.internal.zzv.zzq()     // Catch:{ RemoteException -> 0x0040 }
            android.content.Context r0 = r6.zzb     // Catch:{ RemoteException -> 0x0040 }
            com.google.android.gms.ads.internal.util.zzbr r0 = com.google.android.gms.ads.internal.util.zzs.zzA(r0)     // Catch:{ RemoteException -> 0x0040 }
            android.content.Context r1 = r6.zzb     // Catch:{ RemoteException -> 0x0040 }
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r1)     // Catch:{ RemoteException -> 0x0040 }
            com.google.android.gms.ads.internal.offline.buffering.zza r2 = new com.google.android.gms.ads.internal.offline.buffering.zza     // Catch:{ RemoteException -> 0x0040 }
            java.lang.String r3 = r6.zzg     // Catch:{ RemoteException -> 0x0040 }
            java.lang.String r4 = r6.zzf     // Catch:{ RemoteException -> 0x0040 }
            java.util.Map r5 = r6.zza     // Catch:{ RemoteException -> 0x0040 }
            java.lang.Object r5 = r5.get(r4)     // Catch:{ RemoteException -> 0x0040 }
            com.google.android.gms.internal.ads.zzebc r5 = (com.google.android.gms.internal.ads.zzebc) r5     // Catch:{ RemoteException -> 0x0040 }
            if (r5 != 0) goto L_0x0022
            java.lang.String r5 = ""
            goto L_0x0026
        L_0x0022:
            java.lang.String r5 = r5.zzc()     // Catch:{ RemoteException -> 0x0040 }
        L_0x0026:
            r2.<init>(r3, r4, r5)     // Catch:{ RemoteException -> 0x0040 }
            boolean r1 = r0.zzg(r1, r2)     // Catch:{ RemoteException -> 0x0040 }
            if (r1 != 0) goto L_0x0047
            android.content.Context r2 = r6.zzb     // Catch:{ RemoteException -> 0x003e }
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r2)     // Catch:{ RemoteException -> 0x003e }
            java.lang.String r3 = r6.zzg     // Catch:{ RemoteException -> 0x003e }
            java.lang.String r4 = r6.zzf     // Catch:{ RemoteException -> 0x003e }
            boolean r1 = r0.zzf(r2, r3, r4)     // Catch:{ RemoteException -> 0x003e }
            goto L_0x0047
        L_0x003e:
            r0 = move-exception
            goto L_0x0042
        L_0x0040:
            r0 = move-exception
            r1 = 0
        L_0x0042:
            java.lang.String r2 = "Failed to schedule offline notification poster."
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r2, r0)
        L_0x0047:
            if (r1 != 0) goto L_0x005b
            com.google.android.gms.internal.ads.zzebk r0 = r6.zze
            java.lang.String r1 = r6.zzf
            r0.zzc(r1)
            java.lang.String r0 = r6.zzf
            java.lang.String r1 = "offline_notification_worker_not_scheduled"
            com.google.android.gms.internal.ads.zzfxq r2 = com.google.android.gms.internal.ads.zzfxq.zzd()
            r6.zzw(r0, r1, r2)
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzebv.zzx():void");
    }

    private final void zzy(Activity activity, zzm zzm) {
        zzv.zzq();
        if (NotificationManagerCompat.from(activity).areNotificationsEnabled()) {
            zzx();
            zzz(activity, zzm);
        } else if (Build.VERSION.SDK_INT < 33) {
            zzv.zzq();
            AlertDialog.Builder zzL = zzs.zzL(activity);
            zzL.setTitle(zzv(R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(zzv(R.string.notifications_permission_confirm, HttpHeaders.ALLOW), new zzebo(this, activity, zzm)).setNegativeButton(zzv(R.string.notifications_permission_decline, "Don't allow"), new zzebp(this, zzm)).setOnCancelListener(new zzebq(this, zzm));
            zzL.create().show();
            zzw(this.zzf, "rtsdi", zzfxq.zzd());
        } else {
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
            zzw(this.zzf, "asnpdi", zzfxq.zzd());
        }
    }

    private final void zzz(Activity activity, zzm zzm) {
        AlertDialog zzs = zzs(activity, zzm);
        zzs.show();
        Timer timer = new Timer();
        timer.schedule(new zzebu(this, zzs, timer, zzm), 3000);
    }

    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            boolean zzA = zzv.zzp().zzA(this.zzb);
            HashMap hashMap = new HashMap();
            char c = 2;
            if (stringExtra.equals("offline_notification_clicked")) {
                hashMap.put("offline_notification_action", "offline_notification_clicked");
                if (true == zzA) {
                    c = 1;
                }
                hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                hashMap.put("olaih", String.valueOf(stringExtra3.startsWith(ProxyConfig.MATCH_HTTP)));
                try {
                    Intent launchIntentForPackage = this.zzb.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    this.zzb.startActivity(launchIntentForPackage);
                    hashMap.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    hashMap.put("olaa", "olaf");
                }
            } else {
                hashMap.put("offline_notification_action", "offline_notification_dismissed");
            }
            zzw(stringExtra2, "offline_notification_action", hashMap);
            try {
                SQLiteDatabase writableDatabase = this.zze.getWritableDatabase();
                if (c == 1) {
                    this.zze.zzg(writableDatabase, this.zzd, stringExtra2);
                } else {
                    zzebk.zzi(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e) {
                zzo.zzg("Failed to get writable offline buffering database: ".concat(e.toString()));
            }
        }
    }

    public final void zzf(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) {
        int i = 0;
        while (i < strArr.length) {
            if (!strArr[i].equals("android.permission.POST_NOTIFICATIONS")) {
                i++;
            } else {
                zzebx zzebx = (zzebx) ObjectWrapper.unwrap(iObjectWrapper);
                Activity zza2 = zzebx.zza();
                zzm zzb2 = zzebx.zzb();
                HashMap hashMap = new HashMap();
                if (iArr[i] == 0) {
                    hashMap.put("dialog_action", "confirm");
                    zzx();
                    zzz(zza2, zzb2);
                } else {
                    hashMap.put("dialog_action", "dismiss");
                    if (zzb2 != null) {
                        zzb2.zzb();
                    }
                }
                zzw(this.zzf, "asnpdc", hashMap);
                return;
            }
        }
    }

    public final void zzg(IObjectWrapper iObjectWrapper) {
        zzebx zzebx = (zzebx) ObjectWrapper.unwrap(iObjectWrapper);
        Activity zza2 = zzebx.zza();
        zzm zzb2 = zzebx.zzb();
        this.zzf = zzebx.zzc();
        this.zzg = zzebx.zzd();
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzip)).booleanValue()) {
            zzw(this.zzf, "dialog_impression", zzfxq.zzd());
            zzv.zzq();
            AlertDialog.Builder zzL = zzs.zzL(zza2);
            zzL.setTitle(zzv(R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(zzv(R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(zzv(R.string.offline_opt_in_confirm, "OK"), new zzebr(this, zza2, zzb2)).setNegativeButton(zzv(R.string.offline_opt_in_decline, "No thanks"), new zzebs(this, zzb2)).setOnCancelListener(new zzebt(this, zzb2));
            zzL.create().show();
            return;
        }
        zzy(zza2, zzb2);
    }

    public final void zzh() {
        this.zze.zze(new zzebd(this.zzd));
    }

    public final void zzi(IObjectWrapper iObjectWrapper, String str, String str2) {
        zzj(iObjectWrapper, new zza(str, str2, ""));
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x00ab A[SYNTHETIC, Splitter:B:13:0x00ab] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzj(com.google.android.gms.dynamic.IObjectWrapper r10, com.google.android.gms.ads.internal.offline.buffering.zza r11) {
        /*
            r9 = this;
            java.lang.Object r10 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r10)
            android.content.Context r10 = (android.content.Context) r10
            java.lang.String r0 = r11.zza
            java.lang.String r1 = r11.zzb
            java.lang.String r11 = r11.zzc
            java.lang.String r2 = r9.zzu()
            com.google.android.gms.ads.internal.util.zzaa r3 = com.google.android.gms.ads.internal.zzv.zzr()
            java.lang.String r4 = "offline_notification_channel"
            java.lang.String r5 = "AdMob Offline Notifications"
            r3.zzh(r10, r4, r5)
            java.lang.String r3 = "offline_notification_clicked"
            android.app.PendingIntent r3 = zzr(r10, r3, r1, r0)
            java.lang.String r5 = "offline_notification_dismissed"
            android.app.PendingIntent r0 = zzr(r10, r5, r1, r0)
            androidx.core.app.NotificationCompat$Builder r5 = new androidx.core.app.NotificationCompat$Builder
            r5.<init>((android.content.Context) r10, (java.lang.String) r4)
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            r6 = 1
            if (r4 != 0) goto L_0x0048
            int r4 = com.google.android.gms.ads.impl.R.string.offline_notification_title_with_advertiser
            java.lang.String r7 = "You are back online! Continue learning about %s"
            java.lang.String r4 = zzv(r4, r7)
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r8 = 0
            r7[r8] = r2
            java.lang.String r2 = java.lang.String.format(r4, r7)
            r5.setContentTitle(r2)
            goto L_0x0053
        L_0x0048:
            int r2 = com.google.android.gms.ads.impl.R.string.offline_notification_title
            java.lang.String r4 = "You are back online! Let's pick up where we left off"
            java.lang.String r2 = zzv(r2, r4)
            r5.setContentTitle(r2)
        L_0x0053:
            androidx.core.app.NotificationCompat$Builder r2 = r5.setAutoCancel(r6)
            androidx.core.app.NotificationCompat$Builder r0 = r2.setDeleteIntent(r0)
            androidx.core.app.NotificationCompat$Builder r0 = r0.setContentIntent(r3)
            android.content.pm.ApplicationInfo r2 = r10.getApplicationInfo()
            int r2 = r2.icon
            androidx.core.app.NotificationCompat$Builder r0 = r0.setSmallIcon((int) r2)
            com.google.android.gms.internal.ads.zzbcc r2 = com.google.android.gms.internal.ads.zzbcl.zziq
            com.google.android.gms.internal.ads.zzbcj r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r2 = r3.zza(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.setPriority(r2)
            com.google.android.gms.internal.ads.zzbcc r0 = com.google.android.gms.internal.ads.zzbcl.zzis
            com.google.android.gms.internal.ads.zzbcj r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r2.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 0
            if (r0 == 0) goto L_0x00a8
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x00a8
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x00a7 }
            r0.<init>(r11)     // Catch:{ IOException -> 0x00a7 }
            java.net.URLConnection r11 = r0.openConnection()     // Catch:{ IOException -> 0x00a7 }
            java.io.InputStream r11 = r11.getInputStream()     // Catch:{ IOException -> 0x00a7 }
            android.graphics.Bitmap r11 = android.graphics.BitmapFactory.decodeStream(r11)     // Catch:{ IOException -> 0x00a7 }
            goto L_0x00a9
        L_0x00a7:
        L_0x00a8:
            r11 = r2
        L_0x00a9:
            if (r11 == 0) goto L_0x00c2
            androidx.core.app.NotificationCompat$Builder r0 = r5.setLargeIcon((android.graphics.Bitmap) r11)     // Catch:{ NotFoundException -> 0x00c2 }
            androidx.core.app.NotificationCompat$BigPictureStyle r3 = new androidx.core.app.NotificationCompat$BigPictureStyle     // Catch:{ NotFoundException -> 0x00c2 }
            r3.<init>()     // Catch:{ NotFoundException -> 0x00c2 }
            androidx.core.app.NotificationCompat$BigPictureStyle r11 = r3.bigPicture((android.graphics.Bitmap) r11)     // Catch:{ NotFoundException -> 0x00c2 }
            r3 = r2
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3     // Catch:{ NotFoundException -> 0x00c2 }
            androidx.core.app.NotificationCompat$BigPictureStyle r11 = r11.bigLargeIcon((android.graphics.Bitmap) r2)     // Catch:{ NotFoundException -> 0x00c2 }
            r0.setStyle(r11)     // Catch:{ NotFoundException -> 0x00c2 }
        L_0x00c2:
            java.lang.String r11 = "notification"
            java.lang.Object r10 = r10.getSystemService(r11)
            android.app.NotificationManager r10 = (android.app.NotificationManager) r10
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            android.app.Notification r0 = r5.build()     // Catch:{ IllegalArgumentException -> 0x00dc }
            r2 = 54321(0xd431, float:7.612E-41)
            r10.notify(r1, r2, r0)     // Catch:{ IllegalArgumentException -> 0x00dc }
            java.lang.String r10 = "offline_notification_impression"
            goto L_0x00e8
        L_0x00dc:
            r10 = move-exception
            java.lang.String r0 = "notification_not_shown_reason"
            java.lang.String r10 = r10.getMessage()
            r11.put(r0, r10)
            java.lang.String r10 = "offline_notification_failed"
        L_0x00e8:
            r9.zzw(r1, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzebv.zzj(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzk(Activity activity, zzm zzm, DialogInterface dialogInterface, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "confirm");
        zzw(this.zzf, "rtsdc", hashMap);
        activity.startActivity(zzv.zzr().zzf(activity));
        zzx();
        if (zzm != null) {
            zzm.zzb();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzl(zzm zzm, DialogInterface dialogInterface, int i) {
        this.zze.zzc(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzw(this.zzf, "rtsdc", hashMap);
        if (zzm != null) {
            zzm.zzb();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzm(zzm zzm, DialogInterface dialogInterface) {
        this.zze.zzc(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzw(this.zzf, "rtsdc", hashMap);
        if (zzm != null) {
            zzm.zzb();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzn(Activity activity, zzm zzm, DialogInterface dialogInterface, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "confirm");
        zzw(this.zzf, "dialog_click", hashMap);
        zzy(activity, zzm);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(zzm zzm, DialogInterface dialogInterface, int i) {
        this.zze.zzc(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzw(this.zzf, "dialog_click", hashMap);
        if (zzm != null) {
            zzm.zzb();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(zzm zzm, DialogInterface dialogInterface) {
        this.zze.zzc(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzw(this.zzf, "dialog_click", hashMap);
        if (zzm != null) {
            zzm.zzb();
        }
    }

    public final void zzq(String str, zzdif zzdif) {
        String zzx = zzdif.zzx();
        String zzB = zzdif.zzB();
        String str2 = "";
        if (TextUtils.isEmpty(zzx)) {
            zzx = zzB != null ? zzB : str2;
        }
        zzbfw zzm = zzdif.zzm();
        if (zzm != null) {
            try {
                str2 = zzm.zze().toString();
            } catch (RemoteException unused) {
            }
        }
        zzbfw zzn = zzdif.zzn();
        Drawable drawable = null;
        if (zzn != null) {
            try {
                IObjectWrapper zzf2 = zzn.zzf();
                if (zzf2 != null) {
                    drawable = (Drawable) ObjectWrapper.unwrap(zzf2);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.zza.put(str, new zzeay(zzx, str2, drawable));
    }
}
