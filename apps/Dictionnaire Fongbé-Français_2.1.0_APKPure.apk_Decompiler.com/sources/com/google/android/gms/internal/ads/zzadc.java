package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzadc {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final float zzi;
    public final int zzj;
    public final String zzk;
    public final zzfh zzl;

    private zzadc(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, int i10, String str, zzfh zzfh) {
        this.zza = list;
        this.zzb = i;
        this.zzc = i4;
        this.zzd = i5;
        this.zze = i6;
        this.zzf = i7;
        this.zzg = i8;
        this.zzh = i9;
        this.zzi = f;
        this.zzj = i10;
        this.zzk = str;
        this.zzl = zzfh;
    }

    public static zzadc zza(zzdy zzdy) throws zzbc {
        return zzc(zzdy, false, (zzfh) null);
    }

    public static zzadc zzb(zzdy zzdy, zzfh zzfh) throws zzbc {
        return zzc(zzdy, true, zzfh);
    }

    private static zzadc zzc(zzdy zzdy, boolean z, zzfh zzfh) throws zzbc {
        List list;
        int i;
        int i2;
        int i3;
        int i4;
        zzfd zzfd;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        String str;
        zzdy zzdy2 = zzdy;
        boolean z3 = z;
        int i11 = 4;
        if (z3) {
            try {
                zzdy2.zzM(4);
            } catch (ArrayIndexOutOfBoundsException e) {
                if (true != z3) {
                    str = "HEVC config";
                } else {
                    str = "L-HEVC config";
                }
                throw zzbc.zza("Error parsing".concat(str), e);
            }
        } else {
            zzdy2.zzM(21);
        }
        int zzm = zzdy.zzm() & 3;
        int zzm2 = zzdy.zzm();
        int zzd2 = zzdy.zzd();
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < zzm2; i14++) {
            zzdy2.zzM(1);
            int zzq = zzdy.zzq();
            for (int i15 = 0; i15 < zzq; i15++) {
                int zzq2 = zzdy.zzq();
                i13 += zzq2 + 4;
                zzdy2.zzM(zzq2);
            }
        }
        zzdy2.zzL(zzd2);
        byte[] bArr = new byte[i13];
        zzfh zzfh2 = zzfh;
        int i16 = 0;
        int i17 = 0;
        int i18 = -1;
        int i19 = -1;
        int i20 = -1;
        int i21 = -1;
        int i22 = -1;
        int i23 = -1;
        int i24 = -1;
        int i25 = -1;
        float f = 1.0f;
        int i26 = -1;
        String str2 = null;
        while (i16 < zzm2) {
            int zzm3 = zzdy.zzm() & 63;
            int zzq3 = zzdy.zzq();
            zzfh zzfh3 = zzfh2;
            int i27 = 0;
            while (i27 < zzq3) {
                int zzq4 = zzdy.zzq();
                int i28 = zzm2;
                System.arraycopy(zzfk.zza, i12, bArr, i17, i11);
                int i29 = i17 + 4;
                System.arraycopy(zzdy.zzN(), zzdy.zzd(), bArr, i29, zzq4);
                int i30 = 32;
                if (zzm3 != 32) {
                    i30 = zzm3;
                } else if (i27 == 0) {
                    zzfh3 = zzfk.zzd(bArr, i29, i29 + zzq4);
                    i2 = zzq3;
                    i = zzm3;
                    i27 = 0;
                    i17 = i29 + zzq4;
                    zzdy2.zzM(zzq4);
                    i27++;
                    zzm2 = i28;
                    zzq3 = i2;
                    zzm3 = i;
                    i11 = 4;
                    i12 = 0;
                }
                i2 = zzq3;
                int i31 = 8;
                if (i30 != 33) {
                    i = zzm3;
                    if (i30 == 39 && i27 == 0) {
                        int i32 = i17 + 6;
                        int i33 = (i29 + zzq4) - 1;
                        while (true) {
                            byte b = bArr[i33];
                            if (b == 0) {
                                if (i33 <= i32) {
                                    break;
                                }
                                i33--;
                            } else if (b != 0) {
                                if (i33 > i32) {
                                    zzfl zzfl = new zzfl(bArr, i32, i33 + 1);
                                    while (true) {
                                        if (!zzfl.zzg(16)) {
                                            break;
                                        }
                                        int zza2 = zzfl.zza(i31);
                                        int i34 = 0;
                                        while (zza2 == 255) {
                                            i34 += 255;
                                            zza2 = zzfl.zza(i31);
                                        }
                                        int i35 = i34 + zza2;
                                        int zza3 = zzfl.zza(i31);
                                        int i36 = 0;
                                        while (zza3 == 255) {
                                            i36 += 255;
                                            zza3 = zzfl.zza(8);
                                        }
                                        int i37 = i36 + zza3;
                                        if (i37 == 0) {
                                            break;
                                        } else if (!zzfl.zzg(i37)) {
                                            break;
                                        } else if (i35 == 176) {
                                            int zzc2 = zzfl.zzc();
                                            boolean zzh2 = zzfl.zzh();
                                            int zzc3 = zzh2 ? zzfl.zzc() : 0;
                                            int zzc4 = zzfl.zzc();
                                            int i38 = 0;
                                            int i39 = -1;
                                            int i40 = -1;
                                            int i41 = -1;
                                            int i42 = -1;
                                            int i43 = -1;
                                            int i44 = -1;
                                            while (i38 <= zzc4) {
                                                i39 = zzfl.zzc();
                                                i40 = zzfl.zzc();
                                                i4 = i27;
                                                int zza4 = zzfl.zza(6);
                                                if (zza4 != 63) {
                                                    if (zza4 == 0) {
                                                        i3 = i18;
                                                        i5 = Math.max(0, zzc2 - 30);
                                                    } else {
                                                        i3 = i18;
                                                        i5 = Math.max(0, (zza4 + zzc2) - 31);
                                                    }
                                                    i42 = zzfl.zza(i5);
                                                    if (zzh2) {
                                                        int zza5 = zzfl.zza(6);
                                                        if (zza5 != 63) {
                                                            if (zza5 == 0) {
                                                                z2 = zzh2;
                                                                i6 = Math.max(0, zzc3 - 30);
                                                            } else {
                                                                z2 = zzh2;
                                                                i6 = Math.max(0, (zza5 + zzc3) - 31);
                                                            }
                                                            i44 = zzfl.zza(i6);
                                                            i43 = zza5;
                                                        }
                                                    } else {
                                                        z2 = zzh2;
                                                    }
                                                    if (zzfl.zzh()) {
                                                        zzfl.zzf(10);
                                                    }
                                                    i38++;
                                                    i41 = zza4;
                                                    i27 = i4;
                                                    zzh2 = z2;
                                                    i18 = i3;
                                                }
                                            }
                                            i4 = i27;
                                            i3 = i18;
                                            zzfd = new zzfd(zzc2, zzc3, zzc4 + 1, i39, i40, i41, i42, i43, i44);
                                        } else {
                                            i31 = 8;
                                        }
                                    }
                                }
                            }
                        }
                        i4 = i27;
                        i3 = i18;
                        zzfd = null;
                        if (!(zzfd == null || zzfh3 == null)) {
                            if (zzfd.zza == ((zzex) zzfh3.zza.get(0)).zzb) {
                                i27 = i4;
                                i18 = i3;
                                i25 = 4;
                            } else {
                                i27 = i4;
                                i18 = i3;
                                i25 = 5;
                            }
                            i17 = i29 + zzq4;
                            zzdy2.zzM(zzq4);
                            i27++;
                            zzm2 = i28;
                            zzq3 = i2;
                            zzm3 = i;
                            i11 = 4;
                            i12 = 0;
                        }
                        i27 = i4;
                        i18 = i3;
                        i17 = i29 + zzq4;
                        zzdy2.zzM(zzq4);
                        i27++;
                        zzm2 = i28;
                        zzq3 = i2;
                        zzm3 = i;
                        i11 = 4;
                        i12 = 0;
                    }
                } else if (i27 == 0) {
                    zzfe zzc5 = zzfk.zzc(bArr, i29, i29 + zzq4, zzfh3);
                    int i45 = zzc5.zzd;
                    int i46 = zzc5.zze;
                    int i47 = zzc5.zzb + 8;
                    int i48 = i45;
                    int i49 = zzc5.zzh;
                    int i50 = zzc5.zzc + 8;
                    int i51 = zzc5.zzi;
                    int i52 = zzc5.zzj;
                    float f2 = zzc5.zzf;
                    int i53 = zzc5.zzg;
                    zzez zzez = zzc5.zza;
                    if (zzez != null) {
                        i10 = i53;
                        i9 = i49;
                        i8 = i46;
                        i = zzm3;
                        i7 = i47;
                        str2 = zzcy.zzd(zzez.zza, zzez.zzb, zzez.zzc, zzez.zzd, zzez.zze, zzez.zzf);
                    } else {
                        i10 = i53;
                        i9 = i49;
                        i8 = i46;
                        i = zzm3;
                        i7 = i47;
                    }
                    i18 = i48;
                    i19 = i8;
                    i26 = i10;
                    i24 = i52;
                    i22 = i9;
                    f = f2;
                    i23 = i51;
                    i21 = i50;
                    i20 = i7;
                    i17 = i29 + zzq4;
                    zzdy2.zzM(zzq4);
                    i27++;
                    zzm2 = i28;
                    zzq3 = i2;
                    zzm3 = i;
                    i11 = 4;
                    i12 = 0;
                } else {
                    i = zzm3;
                }
                i4 = i27;
                i3 = i18;
                i27 = i4;
                i18 = i3;
                i17 = i29 + zzq4;
                zzdy2.zzM(zzq4);
                i27++;
                zzm2 = i28;
                zzq3 = i2;
                zzm3 = i;
                i11 = 4;
                i12 = 0;
            }
            int i54 = zzm2;
            int i55 = i18;
            i16++;
            zzfh2 = zzfh3;
            i11 = 4;
            i12 = 0;
        }
        if (i13 == 0) {
            list = Collections.emptyList();
        } else {
            list = Collections.singletonList(bArr);
        }
        return new zzadc(list, zzm + 1, i18, i19, i20, i21, i22, i23, i24, i25, f, i26, str2, zzfh2);
    }
}
