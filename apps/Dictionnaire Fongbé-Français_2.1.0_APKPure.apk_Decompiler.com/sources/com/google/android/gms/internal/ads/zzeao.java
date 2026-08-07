package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbbq;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzeao extends zzeap {
    private static final SparseArray zzb;
    private final Context zzc;
    private final zzcuw zzd;
    private final TelephonyManager zze;
    /* access modifiers changed from: private */
    public final zzeag zzf;
    private zzbbq.zzq zzg;

    static {
        SparseArray sparseArray = new SparseArray();
        zzb = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzbbq.zzaf.zzd.CONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.AUTHENTICATING.ordinal(), zzbbq.zzaf.zzd.CONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzbbq.zzaf.zzd.CONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzbbq.zzaf.zzd.CONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzbbq.zzaf.zzd.DISCONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.BLOCKED.ordinal(), zzbbq.zzaf.zzd.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzbbq.zzaf.zzd.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzbbq.zzaf.zzd.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzbbq.zzaf.zzd.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzbbq.zzaf.zzd.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzbbq.zzaf.zzd.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzbbq.zzaf.zzd.CONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzbbq.zzaf.zzd.CONNECTING);
    }

    zzeao(Context context, zzcuw zzcuw, zzeag zzeag, zzeac zzeac, zzg zzg2) {
        super(zzeac, zzg2);
        this.zzc = context;
        this.zzd = zzcuw;
        this.zzf = zzeag;
        this.zze = (TelephonyManager) context.getSystemService("phone");
    }

    static /* bridge */ /* synthetic */ zzbbq.zzab zza(zzeao zzeao, Bundle bundle) {
        zzbbq.zzab.zzb zzb2;
        zzbbq.zzab.zza zza = zzbbq.zzab.zza();
        int i = bundle.getInt("cnt", -2);
        int i2 = bundle.getInt("gnt", 0);
        if (i == -1) {
            zzeao.zzg = zzbbq.zzq.ENUM_TRUE;
        } else {
            zzeao.zzg = zzbbq.zzq.ENUM_FALSE;
            if (i == 0) {
                zza.zzd(zzbbq.zzab.zzc.CELL);
            } else if (i != 1) {
                zza.zzd(zzbbq.zzab.zzc.NETWORKTYPE_UNSPECIFIED);
            } else {
                zza.zzd(zzbbq.zzab.zzc.WIFI);
            }
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    zzb2 = zzbbq.zzab.zzb.TWO_G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    zzb2 = zzbbq.zzab.zzb.THREE_G;
                    break;
                case 13:
                    zzb2 = zzbbq.zzab.zzb.LTE;
                    break;
                default:
                    zzb2 = zzbbq.zzab.zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            zza.zzc(zzb2);
        }
        return (zzbbq.zzab) zza.zzbr();
    }

    static /* bridge */ /* synthetic */ zzbbq.zzaf.zzd zzb(zzeao zzeao, Bundle bundle) {
        return (zzbbq.zzaf.zzd) zzb.get(zzfcx.zza(zzfcx.zza(bundle, "device"), "network").getInt("active_network_state", -1), zzbbq.zzaf.zzd.UNSPECIFIED);
    }

    static /* bridge */ /* synthetic */ byte[] zze(zzeao zzeao, boolean z, ArrayList arrayList, zzbbq.zzab zzab, zzbbq.zzaf.zzd zzd2) {
        zzbbq.zzaf.zza.C0002zza zzn = zzbbq.zzaf.zza.zzn();
        zzn.zzn(arrayList);
        boolean z2 = false;
        zzn.zzD(zzg(Settings.Global.getInt(zzeao.zzc.getContentResolver(), "airplane_mode_on", 0) != 0));
        zzn.zzE(zzv.zzr().zzg(zzeao.zzc, zzeao.zze));
        zzn.zzM(zzeao.zzf.zze());
        zzn.zzL(zzeao.zzf.zzb());
        zzn.zzG(zzeao.zzf.zza());
        zzn.zzH(zzd2);
        zzn.zzJ(zzab);
        zzn.zzK(zzeao.zzg);
        zzn.zzN(zzg(z));
        zzn.zzP(zzeao.zzf.zzd());
        zzn.zzO(zzv.zzC().currentTimeMillis());
        if (Settings.Global.getInt(zzeao.zzc.getContentResolver(), "wifi_on", 0) != 0) {
            z2 = true;
        }
        zzn.zzQ(zzg(z2));
        return ((zzbbq.zzaf.zza) zzn.zzbr()).zzaV();
    }

    private static final zzbbq.zzq zzg(boolean z) {
        return z ? zzbbq.zzq.ENUM_TRUE : zzbbq.zzq.ENUM_FALSE;
    }

    public final void zzd(boolean z) {
        zzgch.zzr(this.zzd.zzb(new Bundle()), new zzean(this, z), zzbzw.zzg);
    }
}
