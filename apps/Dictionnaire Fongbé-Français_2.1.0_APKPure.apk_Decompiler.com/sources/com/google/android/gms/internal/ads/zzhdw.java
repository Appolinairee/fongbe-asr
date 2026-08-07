package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzhdw extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzhdw zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private String zzd = "";
    private String zze = "";
    private int zzf = 4;
    private zzgyd zzg = zzgxr.zzbK();
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private double zzk;
    private zzgyd zzl = zzbK();
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzu;

    static {
        zzhdw zzhdw = new zzhdw();
        zza = zzhdw;
        zzgxr.zzbZ(zzhdw.class, zzhdw);
    }

    private zzhdw() {
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        int ordinal = zzgxq.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zzc", "zzd", "zzf", zzhdv.zza, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzhdu.class, "zze", "zzm", zzhds.zza, "zzn", "zzo", "zzp", "zzu"});
        } else if (ordinal == 3) {
            return new zzhdw();
        } else {
            if (ordinal == 4) {
                return new zzhdr((zzhdx) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzhdw.class) {
                        zzgzk = zzb;
                        if (zzgzk == null) {
                            zzgzk = new zzgxm(zza);
                            zzb = zzgzk;
                        }
                    }
                }
                return zzgzk;
            }
            throw null;
        }
    }
}
