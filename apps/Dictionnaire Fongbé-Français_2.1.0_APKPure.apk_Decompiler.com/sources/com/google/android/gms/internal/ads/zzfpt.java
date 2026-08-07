package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzfpt extends zzfqa {
    private final String zzb;
    private final int zzc;
    private final int zzd;

    /* synthetic */ zzfpt(String str, boolean z, int i, zzfpp zzfpp, zzfpq zzfpq, int i2, zzfps zzfps) {
        this.zzb = str;
        this.zzc = i;
        this.zzd = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfqa) {
            zzfqa zzfqa = (zzfqa) obj;
            if (this.zzb.equals(zzfqa.zzc())) {
                zzfqa.zzd();
                int i = this.zzc;
                int zze = zzfqa.zze();
                if (i == 0) {
                    throw null;
                } else if (i == zze) {
                    zzfqa.zza();
                    zzfqa.zzb();
                    int i2 = this.zzd;
                    int zzf = zzfqa.zzf();
                    if (i2 == 0) {
                        throw null;
                    } else if (zzf == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzb.hashCode() ^ 1000003;
        int i = this.zzc;
        if (i != 0) {
            int i2 = (((hashCode * 1000003) ^ 1237) * 1000003) ^ i;
            if (this.zzd != 0) {
                return (i2 * 583896283) ^ 1;
            }
            throw null;
        }
        throw null;
    }

    public final String toString() {
        int i = this.zzc;
        String str = "null";
        String str2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? str : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        if (this.zzd == 1) {
            str = "READ_AND_WRITE";
        }
        String str3 = this.zzb;
        return "FileComplianceOptions{fileOwner=" + str3 + ", hasDifferentDmaOwner=false, fileChecks=" + str2 + ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=" + str + "}";
    }

    public final zzfpp zza() {
        return null;
    }

    public final zzfpq zzb() {
        return null;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final boolean zzd() {
        return false;
    }

    public final int zze() {
        return this.zzc;
    }

    public final int zzf() {
        return this.zzd;
    }
}
