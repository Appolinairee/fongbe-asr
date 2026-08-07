package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.core.view.PointerIconCompat;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzxh extends zzbw {
    public final boolean zzD;
    public final boolean zzE;
    public final boolean zzF;
    public final boolean zzG;
    public final boolean zzH;
    public final boolean zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    /* access modifiers changed from: private */
    public final SparseArray zzS;
    /* access modifiers changed from: private */
    public final SparseBooleanArray zzT;

    static {
        new zzxh(new zzxg());
        Integer.toString(1000, 36);
        Integer.toString(1001, 36);
        Integer.toString(PointerIconCompat.TYPE_HAND, 36);
        Integer.toString(PointerIconCompat.TYPE_HELP, 36);
        Integer.toString(PointerIconCompat.TYPE_WAIT, 36);
        Integer.toString(1005, 36);
        Integer.toString(PointerIconCompat.TYPE_CELL, 36);
        Integer.toString(PointerIconCompat.TYPE_CROSSHAIR, 36);
        Integer.toString(PointerIconCompat.TYPE_TEXT, 36);
        Integer.toString(PointerIconCompat.TYPE_VERTICAL_TEXT, 36);
        Integer.toString(PointerIconCompat.TYPE_ALIAS, 36);
        Integer.toString(PointerIconCompat.TYPE_COPY, 36);
        Integer.toString(PointerIconCompat.TYPE_NO_DROP, 36);
        Integer.toString(PointerIconCompat.TYPE_ALL_SCROLL, 36);
        Integer.toString(PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW, 36);
        Integer.toString(PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW, 36);
        Integer.toString(PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW, 36);
        Integer.toString(PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW, 36);
        Integer.toString(PointerIconCompat.TYPE_ZOOM_IN, 36);
    }

    private zzxh(zzxg zzxg) {
        super(zzxg);
        this.zzD = zzxg.zza;
        this.zzE = false;
        this.zzF = zzxg.zzb;
        this.zzG = false;
        this.zzH = zzxg.zzc;
        this.zzI = false;
        this.zzJ = false;
        this.zzK = false;
        this.zzL = false;
        this.zzM = zzxg.zzd;
        this.zzN = zzxg.zze;
        this.zzO = zzxg.zzf;
        this.zzP = false;
        this.zzQ = zzxg.zzg;
        this.zzR = false;
        this.zzS = zzxg.zzh;
        this.zzT = zzxg.zzi;
    }

    public static zzxh zzd(Context context) {
        return new zzxh(new zzxg(context));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzxh zzxh = (zzxh) obj;
            if (super.equals(zzxh) && this.zzD == zzxh.zzD && this.zzF == zzxh.zzF && this.zzH == zzxh.zzH && this.zzM == zzxh.zzM && this.zzN == zzxh.zzN && this.zzO == zzxh.zzO && this.zzQ == zzxh.zzQ) {
                SparseBooleanArray sparseBooleanArray = this.zzT;
                SparseBooleanArray sparseBooleanArray2 = zzxh.zzT;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = this.zzS;
                            SparseArray sparseArray2 = zzxh.zzS;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                int i2 = 0;
                                while (i2 < size2) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i2);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                zzwj zzwj = (zzwj) entry.getKey();
                                                if (map2.containsKey(zzwj)) {
                                                    if (!Objects.equals(entry.getValue(), map2.get(zzwj))) {
                                                    }
                                                }
                                            }
                                            i2++;
                                        }
                                    }
                                }
                                return true;
                            }
                        } else if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.zzD ? 1 : 0)) * 961) + (this.zzF ? 1 : 0)) * 961) + (this.zzH ? 1 : 0)) * 28629151) + (this.zzM ? 1 : 0)) * 31) + (this.zzN ? 1 : 0)) * 31) + (this.zzO ? 1 : 0)) * 961) + (this.zzQ ? 1 : 0)) * 31;
    }

    public final zzxg zzc() {
        return new zzxg(this, (zzxs) null);
    }

    @Deprecated
    public final zzxi zze(int i, zzwj zzwj) {
        Map map = (Map) this.zzS.get(i);
        if (map != null) {
            return (zzxi) map.get(zzwj);
        }
        return null;
    }

    public final boolean zzf(int i) {
        return this.zzT.get(i);
    }

    @Deprecated
    public final boolean zzg(int i, zzwj zzwj) {
        Map map = (Map) this.zzS.get(i);
        return map != null && map.containsKey(zzwj);
    }
}
