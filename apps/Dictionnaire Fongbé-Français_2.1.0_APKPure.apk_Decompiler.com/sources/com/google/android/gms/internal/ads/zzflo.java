package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzflo {
    private static final Pattern zza = Pattern.compile("^[a-zA-Z0-9 ]+$");
    private final List zzb = new ArrayList();

    public final List zza() {
        return this.zzb;
    }

    public final void zzb(View view, zzfkw zzfkw, String str) {
        zzfln zzfln;
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        } else if (zza.matcher("Ad overlay").matches()) {
            Iterator it = this.zzb.iterator();
            while (true) {
                if (!it.hasNext()) {
                    zzfln = null;
                    break;
                }
                zzfln = (zzfln) it.next();
                if (zzfln.zzb().get() == view) {
                    break;
                }
            }
            if (zzfln == null) {
                this.zzb.add(new zzfln(view, zzfkw, "Ad overlay"));
            }
        } else {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
    }

    public final void zzc() {
        this.zzb.clear();
    }
}
