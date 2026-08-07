package com.google.android.gms.internal.ads;

import android.net.Network;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
public final class zzfqr extends zzfqf {
    private zzfvf<Integer> zza;
    private zzfvf<Integer> zzb;
    private zzfqq zzc;
    private HttpURLConnection zzd;

    zzfqr() {
        this(new zzfqh(), new zzfqi(), (zzfqq) null);
    }

    zzfqr(zzfvf<Integer> zzfvf, zzfvf<Integer> zzfvf2, zzfqq zzfqq) {
        this.zza = zzfvf;
        this.zzb = zzfvf2;
        this.zzc = zzfqq;
    }

    static /* synthetic */ Integer zzf() {
        return -1;
    }

    static /* synthetic */ Integer zzg() {
        return -1;
    }

    public static void zzs(HttpURLConnection httpURLConnection) {
        zzfqg.zza();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public void close() {
        zzs(this.zzd);
    }

    public HttpURLConnection zzm() throws IOException {
        zzfqg.zzb(((Integer) this.zza.zza()).intValue(), ((Integer) this.zzb.zza()).intValue());
        zzfqq zzfqq = this.zzc;
        zzfqq.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzfqq.zza();
        this.zzd = httpURLConnection;
        return httpURLConnection;
    }

    public HttpURLConnection zzn(zzfqq zzfqq, int i, int i2) throws IOException {
        this.zza = new zzfqj(i);
        this.zzb = new zzfqk(i2);
        this.zzc = zzfqq;
        return zzm();
    }

    public HttpURLConnection zzo(Network network, URL url, int i, int i2) throws IOException {
        this.zza = new zzfql(i);
        this.zzb = new zzfqm(i2);
        this.zzc = new zzfqn(network, url);
        return zzm();
    }

    public URLConnection zzr(URL url, int i) throws IOException {
        this.zza = new zzfqo(i);
        this.zzc = new zzfqp(url);
        return zzm();
    }
}
