package com.google.android.gms.internal.ads;

import androidx.core.view.PointerIconCompat;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzhax implements zzgxx {
    static final zzgxx zza = new zzhax();

    private zzhax() {
    }

    public final boolean zza(int i) {
        if (!(i == 0 || i == 1 || i == 2 || i == 1999)) {
            switch (i) {
                case 1000:
                case 1001:
                case PointerIconCompat.TYPE_HAND:
                case PointerIconCompat.TYPE_HELP:
                case PointerIconCompat.TYPE_WAIT:
                case 1005:
                case PointerIconCompat.TYPE_CELL:
                case PointerIconCompat.TYPE_CROSSHAIR:
                case PointerIconCompat.TYPE_TEXT:
                case PointerIconCompat.TYPE_VERTICAL_TEXT:
                case PointerIconCompat.TYPE_ALIAS:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
