package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzg;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzbzn {
    long zza = -1;
    long zzb = -1;
    int zzc = -1;
    int zzd = -1;
    long zze = 0;
    final String zzf;
    int zzg = 0;
    int zzh = 0;
    int zzi = 0;
    private final Object zzj = new Object();
    private final zzg zzk;

    public zzbzn(String str, zzg zzg2) {
        this.zzf = str;
        this.zzk = zzg2;
    }

    private final void zzi() {
        if (((Boolean) zzbes.zza.zze()).booleanValue()) {
            synchronized (this.zzj) {
                this.zzc--;
                this.zzd--;
            }
        }
    }

    public final int zza() {
        int i;
        synchronized (this.zzj) {
            i = this.zzi;
        }
        return i;
    }

    public final Bundle zzb(Context context, String str) {
        Bundle bundle;
        synchronized (this.zzj) {
            bundle = new Bundle();
            if (!this.zzk.zzN()) {
                bundle.putString("session_id", this.zzf);
            }
            bundle.putLong("basets", this.zzb);
            bundle.putLong("currts", this.zza);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.zzc);
            bundle.putInt("preqs_in_session", this.zzd);
            bundle.putLong("time_in_session", this.zze);
            bundle.putInt("pclick", this.zzg);
            bundle.putInt("pimp", this.zzh);
            Context zza2 = zzbvu.zza(context);
            int identifier = zza2.getResources().getIdentifier("Theme.Translucent", "style", "android");
            boolean z = false;
            if (identifier == 0) {
                zzo.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            } else {
                try {
                    if (identifier == zza2.getPackageManager().getActivityInfo(new ComponentName(zza2.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                        z = true;
                    } else {
                        zzo.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    zzo.zzj("Fail to fetch AdActivity theme");
                    zzo.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                }
            }
            bundle.putBoolean("support_transparent_background", z);
            bundle.putInt("consent_form_action_identifier", zza());
        }
        return bundle;
    }

    public final void zzc() {
        synchronized (this.zzj) {
            this.zzg++;
        }
    }

    public final void zzd() {
        synchronized (this.zzj) {
            this.zzh++;
        }
    }

    public final void zze() {
        zzi();
    }

    public final void zzf() {
        zzi();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0084, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzg(com.google.android.gms.ads.internal.client.zzm r11, long r12) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.zzj
            monitor-enter(r0)
            com.google.android.gms.ads.internal.util.zzg r1 = r10.zzk     // Catch:{ all -> 0x0085 }
            long r1 = r1.zzd()     // Catch:{ all -> 0x0085 }
            com.google.android.gms.common.util.Clock r3 = com.google.android.gms.ads.internal.zzv.zzC()     // Catch:{ all -> 0x0085 }
            long r3 = r3.currentTimeMillis()     // Catch:{ all -> 0x0085 }
            long r5 = r10.zzb     // Catch:{ all -> 0x0085 }
            r7 = -1
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0040
            long r1 = r3 - r1
            com.google.android.gms.internal.ads.zzbcc r5 = com.google.android.gms.internal.ads.zzbcl.zzbd     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.ads.zzbcj r6 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ all -> 0x0085 }
            java.lang.Object r5 = r6.zza(r5)     // Catch:{ all -> 0x0085 }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ all -> 0x0085 }
            long r5 = r5.longValue()     // Catch:{ all -> 0x0085 }
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0033
            r1 = -1
            r10.zzd = r1     // Catch:{ all -> 0x0085 }
            goto L_0x003b
        L_0x0033:
            com.google.android.gms.ads.internal.util.zzg r1 = r10.zzk     // Catch:{ all -> 0x0085 }
            int r1 = r1.zzc()     // Catch:{ all -> 0x0085 }
            r10.zzd = r1     // Catch:{ all -> 0x0085 }
        L_0x003b:
            r10.zzb = r12     // Catch:{ all -> 0x0085 }
            r10.zza = r12     // Catch:{ all -> 0x0085 }
            goto L_0x0042
        L_0x0040:
            r10.zza = r12     // Catch:{ all -> 0x0085 }
        L_0x0042:
            com.google.android.gms.internal.ads.zzbcc r12 = com.google.android.gms.internal.ads.zzbcl.zzdI     // Catch:{ all -> 0x0085 }
            com.google.android.gms.internal.ads.zzbcj r13 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch:{ all -> 0x0085 }
            java.lang.Object r12 = r13.zza(r12)     // Catch:{ all -> 0x0085 }
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch:{ all -> 0x0085 }
            boolean r12 = r12.booleanValue()     // Catch:{ all -> 0x0085 }
            r13 = 1
            if (r12 != 0) goto L_0x0064
            android.os.Bundle r11 = r11.zzc     // Catch:{ all -> 0x0085 }
            if (r11 == 0) goto L_0x0064
            java.lang.String r12 = "gw"
            r1 = 2
            int r11 = r11.getInt(r12, r1)     // Catch:{ all -> 0x0085 }
            if (r11 != r13) goto L_0x0064
            monitor-exit(r0)     // Catch:{ all -> 0x0085 }
            return
        L_0x0064:
            int r11 = r10.zzc     // Catch:{ all -> 0x0085 }
            int r11 = r11 + r13
            r10.zzc = r11     // Catch:{ all -> 0x0085 }
            int r11 = r10.zzd     // Catch:{ all -> 0x0085 }
            int r11 = r11 + r13
            r10.zzd = r11     // Catch:{ all -> 0x0085 }
            if (r11 != 0) goto L_0x007a
            r11 = 0
            r10.zze = r11     // Catch:{ all -> 0x0085 }
            com.google.android.gms.ads.internal.util.zzg r11 = r10.zzk     // Catch:{ all -> 0x0085 }
            r11.zzz(r3)     // Catch:{ all -> 0x0085 }
            goto L_0x0083
        L_0x007a:
            com.google.android.gms.ads.internal.util.zzg r11 = r10.zzk     // Catch:{ all -> 0x0085 }
            long r11 = r11.zze()     // Catch:{ all -> 0x0085 }
            long r3 = r3 - r11
            r10.zze = r3     // Catch:{ all -> 0x0085 }
        L_0x0083:
            monitor-exit(r0)     // Catch:{ all -> 0x0085 }
            return
        L_0x0085:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0085 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbzn.zzg(com.google.android.gms.ads.internal.client.zzm, long):void");
    }

    public final void zzh() {
        synchronized (this.zzj) {
            this.zzi++;
        }
    }
}
