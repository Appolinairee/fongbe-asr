package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzfpk {
    final zzfpn zza;
    final boolean zzb;

    private zzfpk(zzfpn zzfpn) {
        this.zza = zzfpn;
        this.zzb = zzfpn != null;
    }

    public static zzfpk zzb(Context context, String str, String str2) {
        zzfpn zzfpn;
        try {
            IBinder instantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
            IBinder iBinder = instantiate;
            if (instantiate == null) {
                zzfpn = null;
            } else {
                IInterface queryLocalInterface = instantiate.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                zzfpn = queryLocalInterface instanceof zzfpn ? (zzfpn) queryLocalInterface : new zzfpl(instantiate);
            }
            try {
                zzfpn zzfpn2 = zzfpn;
                zzfpn.zze(ObjectWrapper.wrap(context), str, (String) null);
                Log.i("GASS", "GassClearcutLogger Initialized.");
                return new zzfpk(zzfpn);
            } catch (RemoteException | zzfom | NullPointerException | SecurityException unused) {
                Log.d("GASS", "Cannot dynamite load clearcut");
                return new zzfpk(new zzfpo());
            }
        } catch (Exception e) {
            throw new zzfom(e);
        } catch (Exception e2) {
            throw new zzfom(e2);
        }
    }

    public static zzfpk zzc() {
        zzfpo zzfpo = new zzfpo();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzfpk(zzfpo);
    }

    public final zzfpi zza(byte[] bArr) {
        return new zzfpi(this, bArr, (zzfpj) null);
    }
}
