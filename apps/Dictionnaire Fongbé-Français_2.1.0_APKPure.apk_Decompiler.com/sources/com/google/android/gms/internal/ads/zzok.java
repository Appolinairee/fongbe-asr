package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
final class zzok extends ContentObserver {
    final /* synthetic */ zzon zza;
    private final ContentResolver zzb;
    private final Uri zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzok(zzon zzon, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.zza = zzon;
        this.zzb = contentResolver;
        this.zzc = uri;
    }

    public final void onChange(boolean z) {
        zzon zzon = this.zza;
        this.zza.zzj(zzoi.zzc(zzon.zza, zzon.zzh, zzon.zzg));
    }

    public final void zza() {
        this.zzb.registerContentObserver(this.zzc, false, this);
    }

    public final void zzb() {
        this.zzb.unregisterContentObserver(this);
    }
}
