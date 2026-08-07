package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzans implements zzank {
    final /* synthetic */ zzant zza;
    private final zzdx zzb = new zzdx(new byte[5], 5);
    private final SparseArray zzc = new SparseArray();
    private final SparseIntArray zzd = new SparseIntArray();
    private final int zze;

    public zzans(zzant zzant, int i) {
        this.zza = zzant;
        this.zze = i;
    }

    public final void zza(zzdy zzdy) {
        zzef zzef;
        zzef zzef2;
        zzdy zzdy2 = zzdy;
        if (zzdy.zzm() == 2) {
            zzef zzef3 = (zzef) this.zza.zzb.get(0);
            if ((zzdy.zzm() & 128) != 0) {
                zzdy2.zzM(1);
                int zzq = zzdy.zzq();
                int i = 3;
                zzdy2.zzM(3);
                zzdy2.zzG(this.zzb, 2);
                this.zzb.zzn(3);
                int i2 = 13;
                this.zza.zzr = this.zzb.zzd(13);
                zzdy2.zzG(this.zzb, 2);
                int i3 = 4;
                this.zzb.zzn(4);
                int i4 = 12;
                zzdy2.zzM(this.zzb.zzd(12));
                this.zzc.clear();
                this.zzd.clear();
                int zzb2 = zzdy.zzb();
                while (zzb2 > 0) {
                    int i5 = 5;
                    zzdy2.zzG(this.zzb, 5);
                    zzdx zzdx = this.zzb;
                    int zzd2 = zzdx.zzd(8);
                    zzdx.zzn(i);
                    int zzd3 = this.zzb.zzd(i2);
                    this.zzb.zzn(i3);
                    int zzd4 = this.zzb.zzd(i4);
                    int zzd5 = zzdy.zzd();
                    int i6 = zzd5 + zzd4;
                    String str = null;
                    ArrayList arrayList = null;
                    int i7 = -1;
                    int i8 = 0;
                    while (zzdy.zzd() < i6) {
                        int zzm = zzdy.zzm();
                        int zzd6 = zzdy.zzd() + zzdy.zzm();
                        if (zzd6 > i6) {
                            break;
                        }
                        if (zzm == i5) {
                            long zzu = zzdy.zzu();
                            if (zzu != 1094921523) {
                                if (zzu != 1161904947) {
                                    if (zzu != 1094921524) {
                                        if (zzu == 1212503619) {
                                            zzef2 = zzef3;
                                            i7 = 36;
                                            zzdy2.zzM(zzd6 - zzdy.zzd());
                                            zzef3 = zzef2;
                                            i = 3;
                                            i3 = 4;
                                            i5 = 5;
                                        }
                                        zzef2 = zzef3;
                                        zzdy2.zzM(zzd6 - zzdy.zzd());
                                        zzef3 = zzef2;
                                        i = 3;
                                        i3 = 4;
                                        i5 = 5;
                                    }
                                }
                                zzef2 = zzef3;
                                i7 = 135;
                                zzdy2.zzM(zzd6 - zzdy.zzd());
                                zzef3 = zzef2;
                                i = 3;
                                i3 = 4;
                                i5 = 5;
                            }
                            zzef2 = zzef3;
                            i7 = 129;
                            zzdy2.zzM(zzd6 - zzdy.zzd());
                            zzef3 = zzef2;
                            i = 3;
                            i3 = 4;
                            i5 = 5;
                        } else {
                            if (zzm != 106) {
                                if (zzm != 122) {
                                    if (zzm == 127) {
                                        int zzm2 = zzdy.zzm();
                                        if (zzm2 != 21) {
                                            if (zzm2 == 14) {
                                                zzef2 = zzef3;
                                                i7 = 136;
                                            } else {
                                                if (zzm2 == 33) {
                                                    zzef2 = zzef3;
                                                    i7 = 139;
                                                }
                                                zzef2 = zzef3;
                                            }
                                        }
                                    } else if (zzm == 123) {
                                        zzef2 = zzef3;
                                        i7 = 138;
                                    } else if (zzm == 10) {
                                        String trim = zzdy2.zzB(i, StandardCharsets.UTF_8).trim();
                                        i8 = zzdy.zzm();
                                        zzef2 = zzef3;
                                        str = trim;
                                    } else if (zzm == 89) {
                                        ArrayList arrayList2 = new ArrayList();
                                        while (zzdy.zzd() < zzd6) {
                                            String trim2 = zzdy2.zzB(i, StandardCharsets.UTF_8).trim();
                                            int zzm3 = zzdy.zzm();
                                            zzef zzef4 = zzef3;
                                            byte[] bArr = new byte[i3];
                                            zzdy2.zzH(bArr, 0, i3);
                                            arrayList2.add(new zzanu(trim2, zzm3, bArr));
                                            zzef3 = zzef4;
                                            i = 3;
                                            i3 = 4;
                                        }
                                        zzef2 = zzef3;
                                        arrayList = arrayList2;
                                        i7 = 89;
                                    } else {
                                        zzef2 = zzef3;
                                        if (zzm == 111) {
                                            i7 = 257;
                                        }
                                    }
                                    zzdy2.zzM(zzd6 - zzdy.zzd());
                                    zzef3 = zzef2;
                                    i = 3;
                                    i3 = 4;
                                    i5 = 5;
                                }
                                zzef2 = zzef3;
                                i7 = 135;
                                zzdy2.zzM(zzd6 - zzdy.zzd());
                                zzef3 = zzef2;
                                i = 3;
                                i3 = 4;
                                i5 = 5;
                            }
                            zzef2 = zzef3;
                            i7 = 129;
                            zzdy2.zzM(zzd6 - zzdy.zzd());
                            zzef3 = zzef2;
                            i = 3;
                            i3 = 4;
                            i5 = 5;
                        }
                        zzef2 = zzef3;
                        i7 = 172;
                        zzdy2.zzM(zzd6 - zzdy.zzd());
                        zzef3 = zzef2;
                        i = 3;
                        i3 = 4;
                        i5 = 5;
                    }
                    zzef zzef5 = zzef3;
                    zzdy2.zzL(i6);
                    zzanv zzanv = new zzanv(i7, str, i8, arrayList, Arrays.copyOfRange(zzdy.zzN(), zzd5, i6));
                    if (zzd2 == 6 || zzd2 == 5) {
                        zzd2 = zzanv.zza;
                    }
                    zzb2 -= zzd4 + 5;
                    if (!this.zza.zzh.get(zzd3)) {
                        zzany zzb3 = this.zza.zze.zzb(zzd2, zzanv);
                        this.zzd.put(zzd3, zzd3);
                        this.zzc.put(zzd3, zzb3);
                    }
                    zzef3 = zzef5;
                    i = 3;
                    i3 = 4;
                    i4 = 12;
                    i2 = 13;
                }
                zzef zzef6 = zzef3;
                int size = this.zzd.size();
                int i9 = 0;
                while (i9 < size) {
                    SparseIntArray sparseIntArray = this.zzd;
                    zzant zzant = this.zza;
                    int keyAt = sparseIntArray.keyAt(i9);
                    int valueAt = sparseIntArray.valueAt(i9);
                    zzant.zzh.put(keyAt, true);
                    this.zza.zzi.put(valueAt, true);
                    zzany zzany = (zzany) this.zzc.valueAt(i9);
                    if (zzany != null) {
                        zzacq zzk = this.zza.zzl;
                        zzanx zzanx = new zzanx(zzq, keyAt, 8192);
                        zzef = zzef6;
                        zzany.zzb(zzef, zzk, zzanx);
                        this.zza.zzg.put(valueAt, zzany);
                    } else {
                        zzef = zzef6;
                    }
                    i9++;
                    zzef6 = zzef;
                }
                this.zza.zzg.remove(this.zze);
                this.zza.zzm = 0;
                zzant zzant2 = this.zza;
                if (zzant2.zzm == 0) {
                    zzant2.zzl.zzD();
                    this.zza.zzn = true;
                }
            }
        }
    }

    public final void zzb(zzef zzef, zzacq zzacq, zzanx zzanx) {
    }
}
