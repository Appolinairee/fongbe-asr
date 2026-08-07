package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzsg {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    private final boolean zzi;

    public static zzsg zzc(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        String str4 = str;
        MediaCodecInfo.CodecCapabilities codecCapabilities2 = codecCapabilities;
        return new zzsg(str, str2, str3, codecCapabilities, z, z2, z3, codecCapabilities2 != null && codecCapabilities2.isFeatureSupported("adaptive-playback") && (zzei.zza > 22 || ((!"ODROID-XU3".equals(zzei.zzd) && !"Nexus 10".equals(zzei.zzd)) || (!"OMX.Exynos.AVC.Decoder".equals(str) && !"OMX.Exynos.AVC.Decoder.secure".equals(str)))), codecCapabilities2 != null && codecCapabilities2.isFeatureSupported("tunneled-playback"), z5 || (codecCapabilities2 != null && codecCapabilities2.isFeatureSupported("secure-playback")), zzei.zza >= 35 && codecCapabilities2 != null && codecCapabilities2.isFeatureSupported("detached-surface"));
    }

    private static Point zzi(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i3 = zzei.zza;
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    private final void zzj(String str) {
        String str2 = zzei.zze;
        zzdo.zzb("MediaCodecInfo", "NoSupport [" + str + "] [" + this.zza + ", " + this.zzb + "] [" + str2 + "]");
    }

    private static boolean zzk(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point zzi2 = zzi(videoCapabilities, i, i2);
        int i3 = zzi2.x;
        int i4 = zzi2.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0099, code lost:
        r4 = r4.getVideoCapabilities();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzl(com.google.android.gms.internal.ads.zzab r12, boolean r13) {
        /*
            r11 = this;
            int r0 = com.google.android.gms.internal.ads.zzta.zza
            android.util.Pair r0 = com.google.android.gms.internal.ads.zzcy.zza(r12)
            java.lang.String r1 = r12.zzo
            java.lang.String r2 = "video/hevc"
            if (r1 == 0) goto L_0x0039
            java.lang.String r3 = "video/mv-hevc"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0039
            java.lang.String r1 = r11.zzc
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0039
            java.util.List r0 = r12.zzr
            java.lang.String r0 = com.google.android.gms.internal.ads.zzfk.zzg(r0)
            if (r0 != 0) goto L_0x0026
            r0 = 0
            goto L_0x0039
        L_0x0026:
            java.lang.String r1 = r0.trim()
            int r3 = com.google.android.gms.internal.ads.zzei.zza
            java.lang.String r3 = "\\."
            r4 = -1
            java.lang.String[] r1 = r1.split(r3, r4)
            com.google.android.gms.internal.ads.zzk r3 = r12.zzC
            android.util.Pair r0 = com.google.android.gms.internal.ads.zzcy.zzb(r0, r1, r3)
        L_0x0039:
            r1 = 1
            if (r0 != 0) goto L_0x003e
            goto L_0x0139
        L_0x003e:
            java.lang.Object r3 = r0.first
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r0 = r0.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.String r4 = r12.zzo
            java.lang.String r5 = "video/dolby-vision"
            boolean r4 = r5.equals(r4)
            r5 = 8
            r6 = 2
            r7 = 0
            if (r4 == 0) goto L_0x0074
            java.lang.String r4 = r11.zzb
            java.lang.String r8 = "video/avc"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x006a
            r0 = 0
            r3 = 8
            goto L_0x0074
        L_0x006a:
            java.lang.String r4 = r11.zzb
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x0074
            r0 = 0
            r3 = 2
        L_0x0074:
            boolean r4 = r11.zzi
            if (r4 != 0) goto L_0x007e
            r4 = 42
            if (r3 != r4) goto L_0x0139
            r3 = 42
        L_0x007e:
            android.media.MediaCodecInfo$CodecProfileLevel[] r4 = r11.zzh()
            int r8 = com.google.android.gms.internal.ads.zzei.zza
            r9 = 23
            if (r8 > r9) goto L_0x010a
            java.lang.String r8 = r11.zzb
            java.lang.String r9 = "video/x-vnd.on2.vp9"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x010a
            int r8 = r4.length
            if (r8 != 0) goto L_0x010a
            android.media.MediaCodecInfo$CodecCapabilities r4 = r11.zzd
            if (r4 == 0) goto L_0x00ae
            android.media.MediaCodecInfo$VideoCapabilities r4 = r4.getVideoCapabilities()
            if (r4 == 0) goto L_0x00ae
            android.util.Range r4 = r4.getBitrateRange()
            java.lang.Comparable r4 = r4.getUpper()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            goto L_0x00af
        L_0x00ae:
            r4 = 0
        L_0x00af:
            r8 = 180000000(0xaba9500, float:1.7967196E-32)
            if (r4 < r8) goto L_0x00b7
            r5 = 1024(0x400, float:1.435E-42)
            goto L_0x00fc
        L_0x00b7:
            r8 = 120000000(0x7270e00, float:1.2567798E-34)
            if (r4 < r8) goto L_0x00bf
            r5 = 512(0x200, float:7.175E-43)
            goto L_0x00fc
        L_0x00bf:
            r8 = 60000000(0x3938700, float:8.670878E-37)
            if (r4 < r8) goto L_0x00c7
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x00fc
        L_0x00c7:
            r8 = 30000000(0x1c9c380, float:7.411627E-38)
            if (r4 < r8) goto L_0x00cf
            r5 = 128(0x80, float:1.794E-43)
            goto L_0x00fc
        L_0x00cf:
            r8 = 18000000(0x112a880, float:2.6936858E-38)
            if (r4 < r8) goto L_0x00d7
            r5 = 64
            goto L_0x00fc
        L_0x00d7:
            r8 = 12000000(0xb71b00, float:1.6815582E-38)
            if (r4 < r8) goto L_0x00df
            r5 = 32
            goto L_0x00fc
        L_0x00df:
            r8 = 7200000(0x6ddd00, float:1.0089349E-38)
            if (r4 < r8) goto L_0x00e7
            r5 = 16
            goto L_0x00fc
        L_0x00e7:
            r8 = 3600000(0x36ee80, float:5.044674E-39)
            if (r4 < r8) goto L_0x00ed
            goto L_0x00fc
        L_0x00ed:
            r5 = 1800000(0x1b7740, float:2.522337E-39)
            if (r4 < r5) goto L_0x00f4
            r5 = 4
            goto L_0x00fc
        L_0x00f4:
            r5 = 800000(0xc3500, float:1.121039E-39)
            if (r4 < r5) goto L_0x00fb
            r5 = 2
            goto L_0x00fc
        L_0x00fb:
            r5 = 1
        L_0x00fc:
            android.media.MediaCodecInfo$CodecProfileLevel r4 = new android.media.MediaCodecInfo$CodecProfileLevel
            r4.<init>()
            r4.profile = r1
            r4.level = r5
            android.media.MediaCodecInfo$CodecProfileLevel[] r5 = new android.media.MediaCodecInfo.CodecProfileLevel[r1]
            r5[r7] = r4
            r4 = r5
        L_0x010a:
            int r5 = r4.length
            r8 = 0
        L_0x010c:
            if (r8 >= r5) goto L_0x013d
            r9 = r4[r8]
            int r10 = r9.profile
            if (r10 != r3) goto L_0x013a
            int r9 = r9.level
            if (r9 >= r0) goto L_0x011a
            if (r13 != 0) goto L_0x013a
        L_0x011a:
            java.lang.String r9 = r11.zzb
            boolean r9 = r2.equals(r9)
            if (r9 == 0) goto L_0x0139
            if (r3 != r6) goto L_0x0139
            java.lang.String r9 = "sailfish"
            java.lang.String r10 = com.google.android.gms.internal.ads.zzei.zzb
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x013a
            java.lang.String r9 = "marlin"
            java.lang.String r10 = com.google.android.gms.internal.ads.zzei.zzb
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0139
            goto L_0x013a
        L_0x0139:
            return r1
        L_0x013a:
            int r8 = r8 + 1
            goto L_0x010c
        L_0x013d:
            java.lang.String r12 = r12.zzk
            java.lang.String r13 = r11.zzc
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "codec.profileLevel, "
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r12 = ", "
            r0.append(r12)
            r0.append(r13)
            java.lang.String r12 = r0.toString()
            r11.zzj(r12)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsg.zzl(com.google.android.gms.internal.ads.zzab, boolean):boolean");
    }

    private final boolean zzm(zzab zzab) {
        return this.zzb.equals(zzab.zzo) || this.zzb.equals(zzta.zzb(zzab));
    }

    public final String toString() {
        return this.zza;
    }

    public final Point zza(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzi(videoCapabilities, i, i2);
    }

    public final zzht zzb(zzab zzab, zzab zzab2) {
        int i = true != Objects.equals(zzab.zzo, zzab2.zzo) ? 8 : 0;
        if (this.zzi) {
            if (zzab.zzy != zzab2.zzy) {
                i |= 1024;
            }
            if (!this.zze && !(zzab.zzv == zzab2.zzv && zzab.zzw == zzab2.zzw)) {
                i |= 512;
            }
            if ((!zzk.zzg(zzab.zzC) || !zzk.zzg(zzab2.zzC)) && !Objects.equals(zzab.zzC, zzab2.zzC)) {
                i |= 2048;
            }
            String str = this.zza;
            if (zzei.zzd.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !zzab.zzd(zzab2)) {
                i |= 2;
            }
            if (i == 0) {
                return new zzht(this.zza, zzab, zzab2, true != zzab.zzd(zzab2) ? 2 : 3, 0);
            }
        } else {
            if (zzab.zzD != zzab2.zzD) {
                i |= 4096;
            }
            if (zzab.zzE != zzab2.zzE) {
                i |= 8192;
            }
            if (zzab.zzF != zzab2.zzF) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.zzb)) {
                int i2 = zzta.zza;
                Pair zza2 = zzcy.zza(zzab);
                Pair zza3 = zzcy.zza(zzab2);
                if (!(zza2 == null || zza3 == null)) {
                    int intValue = ((Integer) zza2.first).intValue();
                    int intValue2 = ((Integer) zza3.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new zzht(this.zza, zzab, zzab2, 3, 0);
                    }
                }
            }
            if (!zzab.zzd(zzab2)) {
                i |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i |= 2;
            }
            if (i == 0) {
                return new zzht(this.zza, zzab, zzab2, 1, 0);
            }
        }
        return new zzht(this.zza, zzab, zzab2, 0, i);
    }

    public final boolean zzd(zzab zzab) {
        if (!zzm(zzab) || !zzl(zzab, false)) {
            return false;
        }
        return true;
    }

    public final boolean zze(zzab zzab) throws zzsu {
        int i;
        int i2;
        if (!zzm(zzab) || !zzl(zzab, true)) {
            return false;
        }
        if (this.zzi) {
            int i3 = zzab.zzv;
            if (i3 <= 0 || (i2 = zzab.zzw) <= 0) {
                return true;
            }
            return zzg(i3, i2, (double) zzab.zzx);
        }
        int i4 = zzab.zzE;
        if (i4 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
            if (codecCapabilities == null) {
                zzj("sampleRate.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                zzj("sampleRate.aCaps");
                return false;
            } else if (!audioCapabilities.isSampleRateSupported(i4)) {
                zzj("sampleRate.support, " + i4);
                return false;
            }
        }
        int i5 = zzab.zzD;
        if (i5 == -1) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
        if (codecCapabilities2 == null) {
            zzj("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
        if (audioCapabilities2 == null) {
            zzj("channelCount.aCaps");
            return false;
        }
        String str = this.zza;
        String str2 = this.zzb;
        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
        if (maxInputChannelCount <= 1 && ((zzei.zza < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
            if ("audio/ac3".equals(str2)) {
                i = 6;
            } else {
                i = "audio/eac3".equals(str2) ? 16 : 30;
            }
            zzdo.zzf("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i + "]");
            maxInputChannelCount = i;
        }
        if (maxInputChannelCount >= i5) {
            return true;
        }
        zzj("channelCount.support, " + i5);
        return false;
    }

    public final boolean zzf(zzab zzab) {
        if (this.zzi) {
            return this.zze;
        }
        int i = zzta.zza;
        Pair zza2 = zzcy.zza(zzab);
        return zza2 != null && ((Integer) zza2.first).intValue() == 42;
    }

    public final boolean zzg(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null) {
            zzj("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzj("sizeAndRate.vCaps");
            return false;
        }
        if (zzei.zza >= 29) {
            int zza2 = zzsi.zza(videoCapabilities, i, i2, d);
            if (zza2 != 2) {
                if (zza2 == 1) {
                    zzj("sizeAndRate.cover, " + i + "x" + i2 + "@" + d);
                    return false;
                }
            }
            return true;
        }
        if (!zzk(videoCapabilities, i, i2, d)) {
            if (i >= i2 || (("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.zza) && "mcv5a".equals(zzei.zzb)) || !zzk(videoCapabilities, i2, i, d))) {
                zzj("sizeAndRate.support, " + i + "x" + i2 + "@" + d);
                return false;
            }
            zzdo.zzb("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i + "x" + i2 + "@" + d) + "] [" + this.zza + ", " + this.zzb + "] [" + zzei.zze + "]");
        }
        return true;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzh() {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || codecCapabilities.profileLevels == null) {
            return new MediaCodecInfo.CodecProfileLevel[0];
        }
        return this.zzd.profileLevels;
    }

    zzsg(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        str.getClass();
        String str4 = str;
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z;
        this.zze = z4;
        this.zzf = z6;
        this.zzh = z7;
        this.zzi = zzbb.zzi(str2);
    }
}
