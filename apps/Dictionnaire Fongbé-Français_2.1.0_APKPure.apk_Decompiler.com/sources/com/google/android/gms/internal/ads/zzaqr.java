package com.google.android.gms.internal.ads;

import com.google.common.net.HttpHeaders;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public class zzaqr extends zzapm {
    private final Object zza = new Object();
    private final zzapr zzb;

    public zzaqr(int i, String str, zzapr zzapr, zzapq zzapq) {
        super(i, str, zzapq);
        this.zzb = zzapr;
    }

    /* access modifiers changed from: protected */
    public final zzaps zzh(zzapi zzapi) {
        String str;
        try {
            byte[] bArr = zzapi.zzb;
            Map map = zzapi.zzc;
            String str2 = "ISO-8859-1";
            if (map != null) {
                String str3 = (String) map.get(HttpHeaders.CONTENT_TYPE);
                if (str3 != null) {
                    String[] split = str3.split(";", 0);
                    int i = 1;
                    while (true) {
                        if (i >= split.length) {
                            break;
                        }
                        String[] split2 = split[i].trim().split("=", 0);
                        if (split2.length == 2 && split2[0].equals("charset")) {
                            str2 = split2[1];
                            break;
                        }
                        i++;
                    }
                }
            }
            str = new String(bArr, str2);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzapi.zzb);
        }
        return zzaps.zzb(str, zzaqj.zzb(zzapi));
    }

    /* access modifiers changed from: protected */
    /* renamed from: zzz */
    public void zzo(String str) {
        zzapr zzapr;
        synchronized (this.zza) {
            zzapr = this.zzb;
        }
        zzapr.zza(str);
    }
}
