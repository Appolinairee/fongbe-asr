package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
final class zzgxd extends zzgxc {
    zzgxd() {
    }

    /* access modifiers changed from: package-private */
    public final void zza(Object obj) {
        ((zzgxn) obj).zza.zzg();
    }

    /* access modifiers changed from: package-private */
    public final void zzb(zzhaw zzhaw, Map.Entry entry) throws IOException {
        zzgxo zzgxo = (zzgxo) entry.getKey();
        if (zzgxo.zzc) {
            zzhau zzhau = zzhau.DOUBLE;
            switch (zzgxo.zzb.ordinal()) {
                case 0:
                    zzgzx.zzt(zzgxo.zza, (List) entry.getValue(), zzhaw, zzgxo.zzd);
                    return;
                case 1:
                    zzgzx.zzx(zzgxo.zza, (List) entry.getValue(), zzhaw, zzgxo.zzd);
                    return;
                case 2:
                    zzgzx.zzA(zzgxo.zza, (List) entry.getValue(), zzhaw, zzgxo.zzd);
                    return;
                case 3:
                    zzgzx.zzI(zzgxo.zza, (List) entry.getValue(), zzhaw, zzgxo.zzd);
                    return;
                case 4:
                    zzgzx.zzz(zzgxo.zza, (List) entry.getValue(), zzhaw, zzgxo.zzd);
                    return;
                case 5:
                    zzgzx.zzw(zzgxo.zza, (List) entry.getValue(), zzhaw, zzgxo.zzd);
                    return;
                case 6:
                    zzgzx.zzv(zzgxo.zza, (List) entry.getValue(), zzhaw, zzgxo.zzd);
                    return;
                case 7:
                    zzgzx.zzr(zzgxo.zza, (List) entry.getValue(), zzhaw, zzgxo.zzd);
                    return;
                case 8:
                    zzgzx.zzG(zzgxo.zza, (List) entry.getValue(), zzhaw);
                    return;
                case 9:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        zzgzx.zzy(zzgxo.zza, (List) entry.getValue(), zzhaw, zzgzm.zza().zzb(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 10:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        zzgzx.zzB(zzgxo.zza, (List) entry.getValue(), zzhaw, zzgzm.zza().zzb(list2.get(0).getClass()));
                        return;
                    }
                    return;
                case 11:
                    zzgzx.zzs(zzgxo.zza, (List) entry.getValue(), zzhaw);
                    return;
                case 12:
                    zzgzx.zzH(zzgxo.zza, (List) entry.getValue(), zzhaw, zzgxo.zzd);
                    return;
                case 13:
                    zzgzx.zzz(zzgxo.zza, (List) entry.getValue(), zzhaw, zzgxo.zzd);
                    return;
                case 14:
                    zzgzx.zzC(zzgxo.zza, (List) entry.getValue(), zzhaw, zzgxo.zzd);
                    return;
                case 15:
                    zzgzx.zzD(zzgxo.zza, (List) entry.getValue(), zzhaw, zzgxo.zzd);
                    return;
                case 16:
                    zzgzx.zzE(zzgxo.zza, (List) entry.getValue(), zzhaw, zzgxo.zzd);
                    return;
                case 17:
                    zzgzx.zzF(zzgxo.zza, (List) entry.getValue(), zzhaw, zzgxo.zzd);
                    return;
                default:
                    return;
            }
        } else {
            zzhau zzhau2 = zzhau.DOUBLE;
            switch (zzgxo.zzb.ordinal()) {
                case 0:
                    zzhaw.zzf(zzgxo.zza, ((Double) entry.getValue()).doubleValue());
                    return;
                case 1:
                    zzhaw.zzo(zzgxo.zza, ((Float) entry.getValue()).floatValue());
                    return;
                case 2:
                    zzhaw.zzt(zzgxo.zza, ((Long) entry.getValue()).longValue());
                    return;
                case 3:
                    zzhaw.zzK(zzgxo.zza, ((Long) entry.getValue()).longValue());
                    return;
                case 4:
                    zzhaw.zzr(zzgxo.zza, ((Integer) entry.getValue()).intValue());
                    return;
                case 5:
                    zzhaw.zzm(zzgxo.zza, ((Long) entry.getValue()).longValue());
                    return;
                case 6:
                    zzhaw.zzk(zzgxo.zza, ((Integer) entry.getValue()).intValue());
                    return;
                case 7:
                    zzhaw.zzb(zzgxo.zza, ((Boolean) entry.getValue()).booleanValue());
                    return;
                case 8:
                    zzhaw.zzG(zzgxo.zza, (String) entry.getValue());
                    return;
                case 9:
                    zzhaw.zzq(zzgxo.zza, entry.getValue(), zzgzm.zza().zzb(entry.getValue().getClass()));
                    return;
                case 10:
                    zzhaw.zzv(zzgxo.zza, entry.getValue(), zzgzm.zza().zzb(entry.getValue().getClass()));
                    return;
                case 11:
                    zzhaw.zzd(zzgxo.zza, (zzgwj) entry.getValue());
                    return;
                case 12:
                    zzhaw.zzI(zzgxo.zza, ((Integer) entry.getValue()).intValue());
                    return;
                case 13:
                    zzhaw.zzr(zzgxo.zza, ((Integer) entry.getValue()).intValue());
                    return;
                case 14:
                    zzhaw.zzx(zzgxo.zza, ((Integer) entry.getValue()).intValue());
                    return;
                case 15:
                    zzhaw.zzz(zzgxo.zza, ((Long) entry.getValue()).longValue());
                    return;
                case 16:
                    zzhaw.zzB(zzgxo.zza, ((Integer) entry.getValue()).intValue());
                    return;
                case 17:
                    zzhaw.zzD(zzgxo.zza, ((Long) entry.getValue()).longValue());
                    return;
                default:
                    return;
            }
        }
    }
}
