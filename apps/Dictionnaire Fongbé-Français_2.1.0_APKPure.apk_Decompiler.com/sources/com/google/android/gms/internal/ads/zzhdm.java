package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzhdm extends zzgxr implements zzgzd {
    /* access modifiers changed from: private */
    public static final zzhdm zza;
    private static volatile zzgzk zzb;
    private zzgyd zzA = zzgxr.zzbK();
    private zzgyd zzB = zzgxr.zzbK();
    private zzhdi zzC;
    private zzgyd zzD = zzbK();
    private zzhbt zzE;
    private String zzF = "";
    private zzhbl zzG;
    private zzgyd zzH = zzbK();
    private zzhcm zzI;
    private int zzJ;
    private zzgyd zzK = zzbK();
    private zzgyd zzL = zzbK();
    private long zzM;
    private zzhdl zzN;
    private zzhcr zzO;
    private String zzP = "";
    private byte zzQ = 2;
    private int zzc;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private zzhbp zzi;
    private zzgyd zzj = zzbK();
    private zzgyd zzk = zzbK();
    private String zzl = "";
    private zzhcx zzm;
    private boolean zzn;
    private zzgyd zzo = zzgxr.zzbK();
    private String zzp = "";
    private boolean zzu;
    private boolean zzv;
    private zzgwj zzw = zzgwj.zzb;
    private zzhde zzx;
    private boolean zzy;
    private String zzz = "";

    static {
        zzhdm zzhdm = new zzhdm();
        zza = zzhdm;
        zzgxr.zzbZ(zzhdm.class, zzhdm);
    }

    private zzhdm() {
    }

    public static zzhbn zzc() {
        return (zzhbn) zza.zzaZ();
    }

    static /* synthetic */ void zzi(zzhdm zzhdm, Iterable iterable) {
        zzgyd zzgyd = zzhdm.zzA;
        if (!zzgyd.zzc()) {
            zzhdm.zzA = zzgxr.zzbL(zzgyd);
        }
        zzgvs.zzaQ(iterable, zzhdm.zzA);
    }

    static /* synthetic */ void zzj(zzhdm zzhdm, Iterable iterable) {
        zzgyd zzgyd = zzhdm.zzB;
        if (!zzgyd.zzc()) {
            zzhdm.zzB = zzgxr.zzbL(zzgyd);
        }
        zzgvs.zzaQ(iterable, zzhdm.zzB);
    }

    static /* synthetic */ void zzk(zzhdm zzhdm, zzhdc zzhdc) {
        zzhdc.getClass();
        zzgyd zzgyd = zzhdm.zzj;
        if (!zzgyd.zzc()) {
            zzhdm.zzj = zzgxr.zzbL(zzgyd);
        }
        zzhdm.zzj.add(zzhdc);
    }

    static /* synthetic */ void zzl(zzhdm zzhdm) {
        zzhdm.zzc &= -65;
        zzhdm.zzl = zza.zzl;
    }

    static /* synthetic */ void zzm(zzhdm zzhdm, String str) {
        zzhdm.zzc |= 64;
        zzhdm.zzl = str;
    }

    static /* synthetic */ void zzn(zzhdm zzhdm, zzhde zzhde) {
        zzhde.getClass();
        zzhdm.zzx = zzhde;
        zzhdm.zzc |= 8192;
    }

    static /* synthetic */ void zzo(zzhdm zzhdm, zzhbp zzhbp) {
        zzhbp.getClass();
        zzhdm.zzi = zzhbp;
        zzhdm.zzc |= 32;
    }

    static /* synthetic */ void zzp(zzhdm zzhdm, String str) {
        str.getClass();
        zzhdm.zzc |= 8;
        zzhdm.zzg = str;
    }

    static /* synthetic */ void zzq(zzhdm zzhdm, zzhcx zzhcx) {
        zzhcx.getClass();
        zzhdm.zzm = zzhcx;
        zzhdm.zzc |= 128;
    }

    static /* synthetic */ void zzr(zzhdm zzhdm, String str) {
        str.getClass();
        zzhdm.zzc |= 4;
        zzhdm.zzf = str;
    }

    static /* synthetic */ void zzs(zzhdm zzhdm, int i) {
        zzhdm.zzd = i - 1;
        zzhdm.zzc |= 1;
    }

    /* access modifiers changed from: protected */
    public final Object zzdc(zzgxq zzgxq, Object obj, Object obj2) {
        byte b = 1;
        switch (zzgxq.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzQ);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.zzQ = b;
                return null;
            case 2:
                return zzbQ(zza, "\u0001#\u0000\u0001\u0001##\u0000\t\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015\u001e\u001b\u001f\u001b ဂ\u0016!ဉ\u0017\"ဉ\u0018#ဈ\u0019", new Object[]{"zzc", "zzf", "zzg", "zzh", "zzj", zzhdc.class, "zzn", "zzo", "zzp", "zzu", "zzv", "zzd", zzhcy.zza, "zze", zzhbm.zza, "zzi", "zzl", "zzm", "zzw", "zzk", zzhdq.class, "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", zzhdw.class, "zzE", "zzF", "zzG", "zzH", zzhbx.class, "zzI", "zzJ", zzhdg.zza, "zzK", zzhcp.class, "zzL", zzhcu.class, "zzM", "zzN", "zzO", "zzP"});
            case 3:
                return new zzhdm();
            case 4:
                return new zzhbn((zzhdx) null);
            case 5:
                return zza;
            case 6:
                zzgzk zzgzk = zzb;
                if (zzgzk == null) {
                    synchronized (zzhdm.class) {
                        zzgzk = zzb;
                        if (zzgzk == null) {
                            zzgzk = new zzgxm(zza);
                            zzb = zzgzk;
                        }
                    }
                }
                return zzgzk;
            default:
                throw null;
        }
    }

    public final String zzf() {
        return this.zzl;
    }

    public final String zzg() {
        return this.zzf;
    }

    public final List zzh() {
        return this.zzj;
    }
}
