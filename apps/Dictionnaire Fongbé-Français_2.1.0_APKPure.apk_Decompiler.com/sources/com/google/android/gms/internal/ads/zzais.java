package com.google.android.gms.internal.ads;

import androidx.core.view.ViewCompat;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzais {
    public static zzax zza(zzdy zzdy) {
        String str;
        zzax zzaft;
        int zzd = zzdy.zzd() + zzdy.zzg();
        int zzg = zzdy.zzg();
        int i = (zzg >> 24) & 255;
        zzax zzax = null;
        if (i == 169 || i == 253) {
            int i2 = zzg & ViewCompat.MEASURED_SIZE_MASK;
            if (i2 == 6516084) {
                int zzg2 = zzdy.zzg();
                if (zzdy.zzg() == 1684108385) {
                    zzdy.zzM(8);
                    String zzA = zzdy.zzA(zzg2 - 16);
                    zzax = new zzagb("und", zzA, zzA);
                } else {
                    zzdo.zzf("MetadataUtil", "Failed to parse comment attribute: ".concat(zzeq.zze(zzg)));
                }
            } else {
                if (i2 != 7233901) {
                    if (i2 != 7631467) {
                        if (i2 != 6516589) {
                            if (i2 != 7828084) {
                                if (i2 == 6578553) {
                                    zzax = zze(zzg, "TDRC", zzdy);
                                } else if (i2 == 4280916) {
                                    zzax = zze(zzg, "TPE1", zzdy);
                                } else if (i2 == 7630703) {
                                    zzax = zze(zzg, "TSSE", zzdy);
                                } else if (i2 == 6384738) {
                                    zzax = zze(zzg, "TALB", zzdy);
                                } else if (i2 == 7108978) {
                                    zzax = zze(zzg, "USLT", zzdy);
                                } else if (i2 == 6776174) {
                                    zzax = zze(zzg, "TCON", zzdy);
                                } else if (i2 == 6779504) {
                                    zzax = zze(zzg, "TIT1", zzdy);
                                }
                            }
                        }
                        zzax = zze(zzg, "TCOM", zzdy);
                    }
                }
                zzax = zze(zzg, "TIT2", zzdy);
            }
            return zzax;
        }
        if (zzg == 1735291493) {
            try {
                String zza = zzagi.zza(zzb(zzdy) - 1);
                if (zza != null) {
                    zzaft = new zzagq("TCON", (String) null, zzfxn.zzo(zza));
                } else {
                    zzdo.zzf("MetadataUtil", "Failed to parse standard genre code");
                    return zzax;
                }
            } finally {
                zzdy.zzL(zzd);
            }
        } else {
            if (zzg == 1684632427) {
                zzax = zzd(1684632427, "TPOS", zzdy);
            } else if (zzg == 1953655662) {
                zzax = zzd(1953655662, "TRCK", zzdy);
            } else if (zzg == 1953329263) {
                zzax = zzc(1953329263, "TBPM", zzdy, true, false);
            } else if (zzg == 1668311404) {
                zzax = zzc(1668311404, "TCMP", zzdy, true, true);
            } else if (zzg == 1668249202) {
                int zzg3 = zzdy.zzg();
                if (zzdy.zzg() == 1684108385) {
                    int zzg4 = zzdy.zzg();
                    int i3 = zzaik.zza;
                    int i4 = zzg4 & ViewCompat.MEASURED_SIZE_MASK;
                    if (i4 == 13) {
                        str = "image/jpeg";
                    } else if (i4 == 14) {
                        str = "image/png";
                        i4 = 14;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        zzdo.zzf("MetadataUtil", "Unrecognized cover art flags: " + i4);
                    } else {
                        zzdy.zzM(4);
                        int i5 = zzg3 - 16;
                        byte[] bArr = new byte[i5];
                        zzdy.zzH(bArr, 0, i5);
                        zzaft = new zzaft(str, (String) null, 3, bArr);
                    }
                } else {
                    zzdo.zzf("MetadataUtil", "Failed to parse cover art attribute");
                }
            } else if (zzg == 1631670868) {
                zzax = zze(1631670868, "TPE2", zzdy);
            } else if (zzg == 1936682605) {
                zzax = zze(1936682605, "TSOT", zzdy);
            } else if (zzg == 1936679276) {
                zzax = zze(1936679276, "TSOA", zzdy);
            } else if (zzg == 1936679282) {
                zzax = zze(1936679282, "TSOP", zzdy);
            } else if (zzg == 1936679265) {
                zzax = zze(1936679265, "TSO2", zzdy);
            } else if (zzg == 1936679791) {
                zzax = zze(1936679791, "TSOC", zzdy);
            } else if (zzg == 1920233063) {
                zzax = zzc(1920233063, "ITUNESADVISORY", zzdy, false, false);
            } else if (zzg == 1885823344) {
                zzax = zzc(1885823344, "ITUNESGAPLESS", zzdy, false, true);
            } else if (zzg == 1936683886) {
                zzax = zze(1936683886, "TVSHOWSORT", zzdy);
            } else if (zzg == 1953919848) {
                zzax = zze(1953919848, "TVSHOW", zzdy);
            } else if (zzg == 757935405) {
                String str2 = null;
                String str3 = null;
                int i6 = -1;
                int i7 = -1;
                while (zzdy.zzd() < zzd) {
                    int zzd2 = zzdy.zzd();
                    int zzg5 = zzdy.zzg();
                    int zzg6 = zzdy.zzg();
                    zzdy.zzM(4);
                    if (zzg6 == 1835360622) {
                        str2 = zzdy.zzA(zzg5 - 12);
                    } else {
                        int i8 = zzg5 - 12;
                        if (zzg6 == 1851878757) {
                            str3 = zzdy.zzA(i8);
                        } else {
                            if (zzg6 == 1684108385) {
                                i7 = zzg5;
                            }
                            if (zzg6 == 1684108385) {
                                i6 = zzd2;
                            }
                            zzdy.zzM(i8);
                        }
                    }
                }
                if (!(str2 == null || str3 == null)) {
                    if (i6 != -1) {
                        zzdy.zzL(i6);
                        zzdy.zzM(16);
                        zzax = new zzagk(str2, str3, zzdy.zzA(i7 - 16));
                    }
                }
            }
            return zzax;
        }
        zzax = zzaft;
        return zzax;
        zzdo.zzb("MetadataUtil", "Skipped unknown metadata entry: " + zzeq.zze(zzg));
        return zzax;
    }

    private static int zzb(zzdy zzdy) {
        int zzg = zzdy.zzg();
        if (zzdy.zzg() == 1684108385) {
            zzdy.zzM(8);
            int i = zzg - 16;
            if (i == 1) {
                return zzdy.zzm();
            }
            if (i == 2) {
                return zzdy.zzq();
            }
            if (i == 3) {
                return zzdy.zzo();
            }
            if (i == 4 && (zzdy.zzf() & 128) == 0) {
                return zzdy.zzp();
            }
        }
        zzdo.zzf("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    private static zzagh zzc(int i, String str, zzdy zzdy, boolean z, boolean z2) {
        int zzb = zzb(zzdy);
        if (z2) {
            zzb = Math.min(1, zzb);
        }
        if (zzb < 0) {
            zzdo.zzf("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzeq.zze(i)));
            return null;
        } else if (z) {
            return new zzagq(str, (String) null, zzfxn.zzo(Integer.toString(zzb)));
        } else {
            return new zzagb("und", str, Integer.toString(zzb));
        }
    }

    private static zzagq zzd(int i, String str, zzdy zzdy) {
        int zzg = zzdy.zzg();
        if (zzdy.zzg() == 1684108385 && zzg >= 22) {
            zzdy.zzM(10);
            int zzq = zzdy.zzq();
            if (zzq > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(zzq);
                String sb2 = sb.toString();
                int zzq2 = zzdy.zzq();
                if (zzq2 > 0) {
                    sb2 = sb2 + "/" + zzq2;
                }
                return new zzagq(str, (String) null, zzfxn.zzo(sb2));
            }
        }
        zzdo.zzf("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzeq.zze(i)));
        return null;
    }

    private static zzagq zze(int i, String str, zzdy zzdy) {
        int zzg = zzdy.zzg();
        if (zzdy.zzg() == 1684108385) {
            zzdy.zzM(8);
            return new zzagq(str, (String) null, zzfxn.zzo(zzdy.zzA(zzg - 16)));
        }
        zzdo.zzf("MetadataUtil", "Failed to parse text attribute: ".concat(zzeq.zze(i)));
        return null;
    }
}
