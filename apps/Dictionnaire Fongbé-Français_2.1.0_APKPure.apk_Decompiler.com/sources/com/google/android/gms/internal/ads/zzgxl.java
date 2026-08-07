package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgxl;
import com.google.android.gms.internal.ads.zzgxr;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public class zzgxl<MessageType extends zzgxr<MessageType, BuilderType>, BuilderType extends zzgxl<MessageType, BuilderType>> extends zzgvr<MessageType, BuilderType> {
    protected MessageType zza;
    private final MessageType zzb;

    protected zzgxl(MessageType messagetype) {
        this.zzb = messagetype;
        if (!messagetype.zzcd()) {
            this.zza = zza();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    private MessageType zza() {
        return this.zzb.zzbj();
    }

    private static <MessageType> void zzb(MessageType messagetype, MessageType messagetype2) {
        zzgzm.zza().zzb(messagetype.getClass()).zzg(messagetype, messagetype2);
    }

    /* access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ zzgvr zzaD(zzgvs zzgvs) {
        zzbi((zzgxr) zzgvs);
        return this;
    }

    public /* bridge */ /* synthetic */ zzgvr zzaK(zzgwp zzgwp, zzgxb zzgxb) throws IOException {
        zzbk(zzgwp, zzgxb);
        return this;
    }

    public /* bridge */ /* synthetic */ zzgvr zzaN(byte[] bArr, int i, int i2) throws zzgyg {
        zzbl(bArr, i, i2);
        return this;
    }

    public /* bridge */ /* synthetic */ zzgvr zzaO(byte[] bArr, int i, int i2, zzgxb zzgxb) throws zzgyg {
        zzbm(bArr, i, i2, zzgxb);
        return this;
    }

    public /* bridge */ /* synthetic */ zzgzb zzaW(zzgwp zzgwp, zzgxb zzgxb) throws IOException {
        zzbk(zzgwp, zzgxb);
        return this;
    }

    public /* bridge */ /* synthetic */ zzgzb zzaZ(byte[] bArr, int i, int i2) throws zzgyg {
        zzbl(bArr, i, i2);
        return this;
    }

    public /* bridge */ /* synthetic */ zzgzb zzba(byte[] bArr, int i, int i2, zzgxb zzgxb) throws zzgyg {
        zzbm(bArr, i, i2, zzgxb);
        return this;
    }

    public final BuilderType zzbg() {
        if (!this.zzb.zzcd()) {
            this.zza = zza();
            return this;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    /* renamed from: zzbh */
    public BuilderType zzaP() {
        BuilderType zzbb = zzbt().zzcX();
        zzbb.zza = zzbs();
        return zzbb;
    }

    /* access modifiers changed from: protected */
    public BuilderType zzbi(MessageType messagetype) {
        zzbj(messagetype);
        return this;
    }

    public BuilderType zzbj(MessageType messagetype) {
        if (zzbt().equals(messagetype)) {
            return this;
        }
        zzbu();
        zzb(this.zza, messagetype);
        return this;
    }

    public BuilderType zzbk(zzgwp zzgwp, zzgxb zzgxb) throws IOException {
        zzbu();
        try {
            zzgzm.zza().zzb(this.zza.getClass()).zzh(this.zza, zzgwq.zzq(zzgwp), zzgxb);
            return this;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                throw ((IOException) e.getCause());
            }
            throw e;
        }
    }

    public BuilderType zzbl(byte[] bArr, int i, int i2) throws zzgyg {
        int i3 = zzgxb.zzb;
        int i4 = zzgzm.zza;
        zzbm(bArr, i, i2, zzgxb.zza);
        return this;
    }

    public BuilderType zzbm(byte[] bArr, int i, int i2, zzgxb zzgxb) throws zzgyg {
        zzbu();
        try {
            zzgzm.zza().zzb(this.zza.getClass()).zzi(this.zza, bArr, i, i + i2, new zzgvx(zzgxb));
            return this;
        } catch (zzgyg e) {
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        }
    }

    /* renamed from: zzbn */
    public final MessageType zzbr() {
        MessageType zzbo = zzbs();
        if (zzbo.zzbw()) {
            return zzbo;
        }
        throw zzbb(zzbo);
    }

    /* renamed from: zzbo */
    public MessageType zzbs() {
        if (!this.zza.zzcd()) {
            return this.zza;
        }
        this.zza.zzbU();
        return this.zza;
    }

    /* renamed from: zzbp */
    public MessageType zzbt() {
        return this.zzb;
    }

    public /* bridge */ /* synthetic */ zzgzb zzbq() {
        zzbg();
        return this;
    }

    /* access modifiers changed from: protected */
    public final void zzbu() {
        if (!this.zza.zzcd()) {
            zzbv();
        }
    }

    /* access modifiers changed from: protected */
    public void zzbv() {
        MessageType zza2 = zza();
        zzb(zza2, this.zza);
        this.zza = zza2;
    }

    public final boolean zzbw() {
        return zzgxr.zzk(this.zza, false);
    }
}
