package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.net.Uri;
import android.provider.Settings;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzoi {
    public static final zzoi zza = new zzoi(zzfxn.zzo(zzoh.zza));
    static final zzfxq zzb;
    private static final zzfxn zzc = zzfxn.zzq(2, 5, 6);
    private final SparseArray zzd = new SparseArray();
    private final int zze;

    static {
        zzfxp zzfxp = new zzfxp();
        zzfxp.zza(5, 6);
        zzfxp.zza(17, 6);
        zzfxp.zza(7, 6);
        zzfxp.zza(30, 10);
        zzfxp.zza(18, 6);
        zzfxp.zza(6, 8);
        zzfxp.zza(8, 8);
        zzfxp.zza(14, 8);
        zzb = zzfxp.zzc();
    }

    private zzoi(List list) {
        for (int i = 0; i < list.size(); i++) {
            zzoh zzoh = (zzoh) list.get(i);
            this.zzd.put(zzoh.zzb, zzoh);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzd.size(); i3++) {
            i2 = Math.max(i2, ((zzoh) this.zzd.valueAt(i3)).zzc);
        }
        this.zze = i2;
    }

    static Uri zza() {
        if (zzf()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    static zzoi zzc(Context context, zze zze2, zzoo zzoo) {
        return zzd(context, context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), zze2, zzoo);
    }

    static zzoi zzd(Context context, Intent intent, zze zze2, zzoo zzoo) {
        AudioDeviceInfo[] audioDeviceInfoArr;
        Object systemService = context.getSystemService("audio");
        systemService.getClass();
        AudioManager audioManager = (AudioManager) systemService;
        if (zzoo == null) {
            zzoo zzoo2 = null;
            if (zzei.zza >= 33) {
                try {
                    AudioManager audioManager2 = audioManager;
                    List m = audioManager.getAudioDevicesForAttributes(zze2.zza().zza);
                    if (!m.isEmpty()) {
                        zzoo2 = new zzoo(zzoc$$ExternalSyntheticApiModelOutline2.m(m.get(0)));
                    }
                } catch (RuntimeException unused) {
                }
            }
            zzoo = zzoo2;
        }
        if (zzei.zza < 33 || (!zzei.zzM(context) && !zzei.zzI(context))) {
            if (zzei.zza >= 23) {
                if (zzoo == null) {
                    AudioManager audioManager3 = audioManager;
                    audioDeviceInfoArr = audioManager.getDevices(2);
                } else {
                    audioDeviceInfoArr = new AudioDeviceInfo[]{zzoo.zza};
                }
                zzfxr zzfxr = new zzfxr();
                zzfxr.zzg(8, 7);
                if (zzei.zza >= 31) {
                    zzfxr.zzg(26, 27);
                }
                if (zzei.zza >= 33) {
                    zzfxr.zzf(30);
                }
                zzfxs zzi = zzfxr.zzi();
                for (AudioDeviceInfo m2 : audioDeviceInfoArr) {
                    if (zzi.contains(Integer.valueOf(m2.getType()))) {
                        return zza;
                    }
                }
            }
            zzfxr zzfxr2 = new zzfxr();
            zzfxr2.zzf(2);
            if (zzei.zza < 29 || (!zzei.zzM(context) && !zzei.zzI(context))) {
                ContentResolver contentResolver = context.getContentResolver();
                boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
                if ((z || zzf()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                    zzfxr2.zzh(zzc);
                }
                if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
                    return new zzoi(zze(zzgaq.zzh(zzfxr2.zzi()), 10));
                }
                int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
                if (intArrayExtra != null) {
                    zzfxr2.zzh(zzgaq.zzg(intArrayExtra));
                }
                return new zzoi(zze(zzgaq.zzh(zzfxr2.zzi()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
            }
            zzfxk zzfxk = new zzfxk();
            zzfzt zze3 = zzb.keySet().iterator();
            while (zze3.hasNext()) {
                Integer num = (Integer) zze3.next();
                int intValue = num.intValue();
                if (zzei.zza >= zzei.zzh(intValue) && zzoc$$ExternalSyntheticApiModelOutline2.m(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), zze2.zza().zza)) {
                    zzfxk.zzf(num);
                }
            }
            zzfxk.zzf(2);
            zzfxr2.zzh(zzfxk.zzi());
            return new zzoi(zze(zzgaq.zzh(zzfxr2.zzi()), 10));
        }
        List m$1 = audioManager.getDirectProfilesForAttributes(zze2.zza().zza);
        HashMap hashMap = new HashMap();
        hashMap.put(2, new HashSet(zzgaq.zzg(12)));
        for (int i = 0; i < m$1.size(); i++) {
            AudioProfile m3 = zzoc$$ExternalSyntheticApiModelOutline2.m(m$1.get(i));
            if (zzoc$$ExternalSyntheticApiModelOutline2.m(m3) != 1) {
                int m$12 = m3.getFormat();
                if (zzei.zzJ(m$12) || zzb.containsKey(Integer.valueOf(m$12))) {
                    Integer valueOf = Integer.valueOf(m$12);
                    if (hashMap.containsKey(valueOf)) {
                        Set set = (Set) hashMap.get(valueOf);
                        set.getClass();
                        Set set2 = set;
                        set.addAll(zzgaq.zzg(zzoc$$ExternalSyntheticApiModelOutline2.m(m3)));
                    } else {
                        hashMap.put(valueOf, new HashSet(zzgaq.zzg(zzoc$$ExternalSyntheticApiModelOutline2.m(m3))));
                    }
                }
            }
        }
        zzfxk zzfxk2 = new zzfxk();
        for (Map.Entry entry : hashMap.entrySet()) {
            zzfxk2.zzf(new zzoh(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new zzoi(zzfxk2.zzi());
    }

    private static zzfxn zze(int[] iArr, int i) {
        zzfxk zzfxk = new zzfxk();
        for (int zzoh : iArr) {
            zzfxk.zzf(new zzoh(zzoh, i));
        }
        return zzfxk.zzi();
    }

    private static boolean zzf() {
        return "Amazon".equals(zzei.zzc) || "Xiaomi".equals(zzei.zzc);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r1.contentEquals(r3) != false) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r9 instanceof com.google.android.gms.internal.ads.zzoi
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            com.google.android.gms.internal.ads.zzoi r9 = (com.google.android.gms.internal.ads.zzoi) r9
            android.util.SparseArray r1 = r8.zzd
            android.util.SparseArray r3 = r9.zzd
            int r4 = com.google.android.gms.internal.ads.zzei.zza
            r5 = 31
            if (r4 < r5) goto L_0x001d
            boolean r1 = r1.contentEquals(r3)
            if (r1 == 0) goto L_0x0046
            goto L_0x003f
        L_0x001d:
            int r4 = r1.size()
            int r5 = r3.size()
            if (r4 != r5) goto L_0x0046
            r5 = 0
        L_0x0028:
            if (r5 >= r4) goto L_0x003f
            int r6 = r1.keyAt(r5)
            java.lang.Object r7 = r1.valueAt(r5)
            java.lang.Object r6 = r3.get(r6)
            boolean r6 = java.util.Objects.equals(r7, r6)
            if (r6 == 0) goto L_0x0046
            int r5 = r5 + 1
            goto L_0x0028
        L_0x003f:
            int r1 = r8.zze
            int r9 = r9.zze
            if (r1 != r9) goto L_0x0046
            return r0
        L_0x0046:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzoi.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int i2 = zzei.zza;
        SparseArray sparseArray = this.zzd;
        if (i2 >= 31) {
            i = sparseArray.contentHashCode();
        } else {
            int i3 = 17;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                i3 = (((i3 * 31) + sparseArray.keyAt(i4)) * 31) + Objects.hashCode(sparseArray.valueAt(i4));
            }
            i = i3;
        }
        return this.zze + (i * 31);
    }

    public final String toString() {
        String obj = this.zzd.toString();
        return "AudioCapabilities[maxChannelCount=" + this.zze + ", audioProfiles=" + obj + "]";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
        if (com.google.android.gms.internal.ads.zzei.zzG(r8.zzd, 30) == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a3, code lost:
        if (r6 != 5) goto L_0x00a6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair zzb(com.google.android.gms.internal.ads.zzab r9, com.google.android.gms.internal.ads.zze r10) {
        /*
            r8 = this;
            java.lang.String r0 = r9.zzo
            r0.getClass()
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r9.zzk
            int r0 = com.google.android.gms.internal.ads.zzbb.zza(r0, r1)
            com.google.android.gms.internal.ads.zzfxq r1 = zzb
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L_0x001c
            goto L_0x00ce
        L_0x001c:
            r1 = 7
            r2 = 6
            r3 = 8
            r4 = 18
            if (r0 != r4) goto L_0x0030
            android.util.SparseArray r0 = r8.zzd
            boolean r0 = com.google.android.gms.internal.ads.zzei.zzG(r0, r4)
            if (r0 != 0) goto L_0x002e
            r0 = 6
            goto L_0x004c
        L_0x002e:
            r0 = 18
        L_0x0030:
            if (r0 != r3) goto L_0x003f
            android.util.SparseArray r0 = r8.zzd
            boolean r0 = com.google.android.gms.internal.ads.zzei.zzG(r0, r3)
            if (r0 == 0) goto L_0x003d
            r0 = 8
            goto L_0x003f
        L_0x003d:
            r0 = 7
            goto L_0x004c
        L_0x003f:
            r5 = 30
            if (r0 != r5) goto L_0x004c
            android.util.SparseArray r6 = r8.zzd
            boolean r5 = com.google.android.gms.internal.ads.zzei.zzG(r6, r5)
            if (r5 != 0) goto L_0x004c
            goto L_0x003d
        L_0x004c:
            android.util.SparseArray r5 = r8.zzd
            boolean r5 = com.google.android.gms.internal.ads.zzei.zzG(r5, r0)
            if (r5 == 0) goto L_0x00ce
            android.util.SparseArray r5 = r8.zzd
            java.lang.Object r5 = r5.get(r0)
            com.google.android.gms.internal.ads.zzoh r5 = (com.google.android.gms.internal.ads.zzoh) r5
            r5.getClass()
            r6 = r5
            com.google.android.gms.internal.ads.zzoh r6 = (com.google.android.gms.internal.ads.zzoh) r6
            int r6 = r9.zzD
            r7 = -1
            if (r6 == r7) goto L_0x0086
            if (r0 != r4) goto L_0x006a
            goto L_0x0086
        L_0x006a:
            java.lang.String r9 = r9.zzo
            java.lang.String r10 = "audio/vnd.dts.uhd;profile=p2"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x007f
            int r9 = com.google.android.gms.internal.ads.zzei.zza
            r10 = 33
            if (r9 >= r10) goto L_0x007f
            r9 = 10
            if (r6 <= r9) goto L_0x0091
            goto L_0x00ce
        L_0x007f:
            boolean r9 = r5.zzb(r6)
            if (r9 != 0) goto L_0x0091
            goto L_0x00ce
        L_0x0086:
            int r9 = r9.zzE
            if (r9 != r7) goto L_0x008d
            r9 = 48000(0xbb80, float:6.7262E-41)
        L_0x008d:
            int r6 = r5.zza(r9, r10)
        L_0x0091:
            int r9 = com.google.android.gms.internal.ads.zzei.zza
            r10 = 28
            if (r9 > r10) goto L_0x00a6
            if (r6 != r1) goto L_0x009c
            r2 = 8
            goto L_0x00a7
        L_0x009c:
            r9 = 3
            if (r6 == r9) goto L_0x00a7
            r9 = 4
            if (r6 == r9) goto L_0x00a7
            r9 = 5
            if (r6 != r9) goto L_0x00a6
            goto L_0x00a7
        L_0x00a6:
            r2 = r6
        L_0x00a7:
            int r9 = com.google.android.gms.internal.ads.zzei.zza
            r10 = 26
            if (r9 > r10) goto L_0x00bb
            java.lang.String r9 = "fugu"
            java.lang.String r10 = com.google.android.gms.internal.ads.zzei.zzb
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x00bb
            r9 = 1
            if (r2 != r9) goto L_0x00bb
            r2 = 2
        L_0x00bb:
            int r9 = com.google.android.gms.internal.ads.zzei.zzi(r2)
            if (r9 == 0) goto L_0x00ce
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            android.util.Pair r9 = android.util.Pair.create(r10, r9)
            return r9
        L_0x00ce:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzoi.zzb(com.google.android.gms.internal.ads.zzab, com.google.android.gms.internal.ads.zze):android.util.Pair");
    }
}
