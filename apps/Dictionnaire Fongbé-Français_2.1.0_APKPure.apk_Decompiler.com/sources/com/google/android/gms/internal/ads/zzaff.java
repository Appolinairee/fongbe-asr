package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzaff extends zzada {
    final /* synthetic */ zzadm zza;
    final /* synthetic */ zzafg zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzaff(zzafg zzafg, zzadm zzadm, zzadm zzadm2) {
        super(zzadm);
        this.zza = zzadm2;
        this.zzb = zzafg;
    }

    public final zzadk zzg(long j) {
        zzadk zzg = this.zza.zzg(j);
        zzadn zzadn = zzg.zza;
        zzadn zzadn2 = new zzadn(zzadn.zzb, zzadn.zzc + this.zzb.zzb);
        zzadn zzadn3 = zzg.zzb;
        return new zzadk(zzadn2, new zzadn(zzadn3.zzb, zzadn3.zzc + this.zzb.zzb));
    }
}
