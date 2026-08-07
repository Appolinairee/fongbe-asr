package com.google.android.gms.internal.ads;

import androidx.core.location.LocationRequestCompat;
import java.nio.ByteBuffer;
import okio.Utf8;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzabn {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {24000, 22050, 16000};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] zzg = {69, 87, LocationRequestCompat.QUALITY_LOW_POWER, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int zza(ByteBuffer byteBuffer) {
        int i = 3;
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) <= 10) {
            return 1536;
        }
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4;
        }
        return zzb[i] * 256;
    }

    public static int zzb(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            int i = ((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1;
            return i + i;
        }
        byte b = bArr[4];
        return zzf((b & 192) >> 6, b & Utf8.REPLACEMENT_BYTE);
    }

    public static zzab zzc(zzdy zzdy, String str, String str2, zzu zzu) {
        zzdx zzdx = new zzdx();
        zzdx.zzj(zzdy);
        int i = zzc[zzdx.zzd(2)];
        zzdx.zzn(8);
        int i2 = zze[zzdx.zzd(3)];
        if (zzdx.zzd(1) != 0) {
            i2++;
        }
        int i3 = zzf[zzdx.zzd(5)] * 1000;
        zzdx.zzf();
        zzdy.zzL(zzdx.zzb());
        zzz zzz = new zzz();
        zzz.zzM(str);
        zzz.zzaa("audio/ac3");
        zzz.zzz(i2);
        zzz.zzab(i);
        zzz.zzF(zzu);
        zzz.zzQ(str2);
        zzz.zzy(i3);
        zzz.zzV(i3);
        return zzz.zzag();
    }

    public static zzab zzd(zzdy zzdy, String str, String str2, zzu zzu) {
        String str3;
        zzdx zzdx = new zzdx();
        zzdx.zzj(zzdy);
        int zzd2 = zzdx.zzd(13) * 1000;
        zzdx.zzn(3);
        int i = zzc[zzdx.zzd(2)];
        zzdx.zzn(10);
        int i2 = zze[zzdx.zzd(3)];
        if (zzdx.zzd(1) != 0) {
            i2++;
        }
        zzdx.zzn(3);
        int zzd3 = zzdx.zzd(4);
        zzdx.zzn(1);
        if (zzd3 > 0) {
            zzdx.zzn(6);
            if (zzdx.zzd(1) != 0) {
                i2 += 2;
            }
            zzdx.zzn(1);
        }
        if (zzdx.zza() > 7) {
            zzdx.zzn(7);
            if (zzdx.zzd(1) != 0) {
                str3 = "audio/eac3-joc";
                zzdx.zzf();
                zzdy.zzL(zzdx.zzb());
                zzz zzz = new zzz();
                zzz.zzM(str);
                zzz.zzaa(str3);
                zzz.zzz(i2);
                zzz.zzab(i);
                zzz.zzF(zzu);
                zzz.zzQ(str2);
                zzz.zzV(zzd2);
                return zzz.zzag();
            }
        }
        str3 = "audio/eac3";
        zzdx.zzf();
        zzdy.zzL(zzdx.zzb());
        zzz zzz2 = new zzz();
        zzz2.zzM(str);
        zzz2.zzaa(str3);
        zzz2.zzz(i2);
        zzz2.zzab(i);
        zzz2.zzF(zzu);
        zzz2.zzQ(str2);
        zzz2.zzV(zzd2);
        return zzz2.zzag();
    }

    public static zzabl zze(zzdx zzdx) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String str;
        String str2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        zzdx zzdx2 = zzdx;
        int zzc2 = zzdx.zzc();
        zzdx2.zzn(40);
        int zzd2 = zzdx2.zzd(5);
        zzdx2.zzl(zzc2);
        int i12 = -1;
        if (zzd2 > 10) {
            zzdx2.zzn(16);
            int zzd3 = zzdx2.zzd(2);
            if (zzd3 == 0) {
                i12 = 0;
            } else if (zzd3 == 1) {
                i12 = 1;
            } else if (zzd3 == 2) {
                i12 = 2;
            }
            zzdx2.zzn(3);
            int zzd4 = zzdx2.zzd(11) + 1;
            int zzd5 = zzdx2.zzd(2);
            if (zzd5 == 3) {
                i9 = zzd[zzdx2.zzd(2)];
                i8 = 3;
                i7 = 6;
            } else {
                int zzd6 = zzdx2.zzd(2);
                int i13 = zzb[zzd6];
                i8 = zzd6;
                i9 = zzc[zzd5];
                i7 = i13;
            }
            int i14 = zzd4 + zzd4;
            int i15 = (i14 * i9) / (i7 * 32);
            int zzd7 = zzdx2.zzd(3);
            boolean zzp = zzdx.zzp();
            int i16 = zze[zzd7] + (zzp ? 1 : 0);
            zzdx2.zzn(10);
            if (zzdx.zzp()) {
                zzdx2.zzn(8);
            }
            if (zzd7 == 0) {
                zzdx2.zzn(5);
                if (zzdx.zzp()) {
                    zzdx2.zzn(8);
                }
                i10 = 0;
                zzd7 = 0;
            } else {
                i10 = zzd7;
            }
            if (i12 == 1) {
                if (zzdx.zzp()) {
                    zzdx2.zzn(16);
                }
                i11 = 1;
            } else {
                i11 = i12;
            }
            if (zzdx.zzp()) {
                if (i10 > 2) {
                    zzdx2.zzn(2);
                }
                if ((i10 & 1) != 0 && i10 > 2) {
                    zzdx2.zzn(6);
                }
                if ((i10 & 4) != 0) {
                    zzdx2.zzn(6);
                }
                if (zzp && zzdx.zzp()) {
                    zzdx2.zzn(5);
                }
                if (i11 == 0) {
                    if (zzdx.zzp()) {
                        zzdx2.zzn(6);
                    }
                    if (i10 == 0 && zzdx.zzp()) {
                        zzdx2.zzn(6);
                    }
                    if (zzdx.zzp()) {
                        zzdx2.zzn(6);
                    }
                    int zzd8 = zzdx2.zzd(2);
                    if (zzd8 == 1) {
                        zzdx2.zzn(5);
                    } else if (zzd8 == 2) {
                        zzdx2.zzn(12);
                    } else if (zzd8 == 3) {
                        int zzd9 = zzdx2.zzd(5);
                        if (zzdx.zzp()) {
                            zzdx2.zzn(5);
                            if (zzdx.zzp()) {
                                zzdx2.zzn(4);
                            }
                            if (zzdx.zzp()) {
                                zzdx2.zzn(4);
                            }
                            if (zzdx.zzp()) {
                                zzdx2.zzn(4);
                            }
                            if (zzdx.zzp()) {
                                zzdx2.zzn(4);
                            }
                            if (zzdx.zzp()) {
                                zzdx2.zzn(4);
                            }
                            if (zzdx.zzp()) {
                                zzdx2.zzn(4);
                            }
                            if (zzdx.zzp()) {
                                zzdx2.zzn(4);
                            }
                            if (zzdx.zzp()) {
                                if (zzdx.zzp()) {
                                    zzdx2.zzn(4);
                                }
                                if (zzdx.zzp()) {
                                    zzdx2.zzn(4);
                                }
                            }
                        }
                        if (zzdx.zzp()) {
                            zzdx2.zzn(5);
                            if (zzdx.zzp()) {
                                zzdx2.zzn(7);
                                if (zzdx.zzp()) {
                                    zzdx2.zzn(8);
                                }
                            }
                        }
                        zzdx2.zzn((zzd9 + 2) * 8);
                        zzdx.zzf();
                    }
                    if (i10 < 2) {
                        if (zzdx.zzp()) {
                            zzdx2.zzn(14);
                        }
                        if (zzd7 == 0 && zzdx.zzp()) {
                            zzdx2.zzn(14);
                        }
                    }
                    if (zzdx.zzp()) {
                        if (i8 == 0) {
                            zzdx2.zzn(5);
                            i11 = 0;
                            i8 = 0;
                        } else {
                            for (int i17 = 0; i17 < i7; i17++) {
                                if (zzdx.zzp()) {
                                    zzdx2.zzn(5);
                                }
                            }
                        }
                    }
                    i11 = 0;
                }
            }
            if (zzdx.zzp()) {
                zzdx2.zzn(5);
                if (i10 == 2) {
                    zzdx2.zzn(4);
                    i10 = 2;
                }
                if (i10 >= 6) {
                    zzdx2.zzn(2);
                }
                if (zzdx.zzp()) {
                    zzdx2.zzn(8);
                }
                if (i10 == 0 && zzdx.zzp()) {
                    zzdx2.zzn(8);
                }
                if (zzd5 < 3) {
                    zzdx.zzm();
                }
            }
            if (i11 == 0 && i8 != 3) {
                zzdx.zzm();
            }
            if (i11 == 2 && (i8 == 3 || zzdx.zzp())) {
                zzdx2.zzn(6);
            }
            str = (zzdx.zzp() && zzdx2.zzd(6) == 1 && zzdx2.zzd(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i6 = i12;
            i3 = i14;
            i4 = i9;
            i2 = i7 * 256;
            i = i15;
            i5 = i16;
        } else {
            zzdx2.zzn(32);
            int zzd10 = zzdx2.zzd(2);
            if (zzd10 == 3) {
                str2 = null;
            } else {
                str2 = "audio/ac3";
            }
            int zzd11 = zzdx2.zzd(6);
            int i18 = zzf[zzd11 / 2] * 1000;
            int zzf2 = zzf(zzd10, zzd11);
            zzdx2.zzn(8);
            int zzd12 = zzdx2.zzd(3);
            if (!((zzd12 & 1) == 0 || zzd12 == 1)) {
                zzdx2.zzn(2);
            }
            if ((zzd12 & 4) != 0) {
                zzdx2.zzn(2);
            }
            if (zzd12 == 2) {
                zzdx2.zzn(2);
            }
            str = str2;
            i = i18;
            i3 = zzf2;
            i4 = zzd10 < 3 ? zzc[zzd10] : -1;
            i5 = zze[zzd12] + (zzdx.zzp() ? 1 : 0);
            i6 = -1;
            i2 = 1536;
        }
        return new zzabl(str, i6, i5, i4, i3, i2, i, (zzabm) null);
    }

    private static int zzf(int i, int i2) {
        int i3;
        if (i < 0 || i >= 3 || i2 < 0 || (i3 = i2 >> 1) >= 19) {
            return -1;
        }
        int i4 = zzc[i];
        if (i4 == 44100) {
            int i5 = zzg[i3] + (i2 & 1);
            return i5 + i5;
        }
        int i6 = zzf[i3];
        return i4 == 32000 ? i6 * 6 : i6 * 4;
    }
}
