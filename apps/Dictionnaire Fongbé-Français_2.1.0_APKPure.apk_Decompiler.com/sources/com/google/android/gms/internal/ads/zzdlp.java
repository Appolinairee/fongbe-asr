package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzez;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzn;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdlp {
    private final Context zza;
    private final zzdkt zzb;
    private final zzava zzc;
    private final VersionInfoParcel zzd;
    private final zza zze;
    private final zzbbj zzf;
    private final Executor zzg;
    private final zzbfl zzh;
    private final zzdmh zzi;
    private final zzdow zzj;
    private final ScheduledExecutorService zzk;
    private final zzdnr zzl;
    private final zzdrw zzm;
    private final zzfja zzn;
    private final zzebk zzo;
    private final zzebv zzp;
    private final zzfcn zzq;

    public zzdlp(Context context, zzdkt zzdkt, zzava zzava, VersionInfoParcel versionInfoParcel, zza zza2, zzbbj zzbbj, Executor executor, zzfcj zzfcj, zzdmh zzdmh, zzdow zzdow, ScheduledExecutorService scheduledExecutorService, zzdrw zzdrw, zzfja zzfja, zzebk zzebk, zzdnr zzdnr, zzebv zzebv, zzfcn zzfcn) {
        this.zza = context;
        this.zzb = zzdkt;
        this.zzc = zzava;
        this.zzd = versionInfoParcel;
        this.zze = zza2;
        this.zzf = zzbbj;
        this.zzg = executor;
        this.zzh = zzfcj.zzi;
        this.zzi = zzdmh;
        this.zzj = zzdow;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdrw;
        this.zzn = zzfja;
        this.zzo = zzebk;
        this.zzl = zzdnr;
        this.zzp = zzebv;
        this.zzq = zzfcn;
    }

    public static final zzez zzi(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzr(optJSONObject);
    }

    public static final List zzj(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return zzfxn.zzn();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzfxn.zzn();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            zzez zzr = zzr(optJSONArray.optJSONObject(i));
            if (zzr != null) {
                arrayList.add(zzr);
            }
        }
        return zzfxn.zzl(arrayList);
    }

    private static ListenableFuture zzl(ListenableFuture listenableFuture, Object obj) {
        return zzgch.zzf(listenableFuture, Exception.class, new zzdlk((Object) null), zzbzw.zzg);
    }

    private static ListenableFuture zzm(boolean z, ListenableFuture listenableFuture, Object obj) {
        if (z) {
            return zzgch.zzn(listenableFuture, new zzdll(listenableFuture), zzbzw.zzg);
        }
        return zzl(listenableFuture, (Object) null);
    }

    private final ListenableFuture zzn(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return zzgch.zzh((Object) null);
        }
        String optString = jSONObject.optString(ImagesContract.URL);
        if (TextUtils.isEmpty(optString)) {
            return zzgch.zzh((Object) null);
        }
        double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        int optInt = jSONObject.optInt("width", -1);
        int optInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return zzgch.zzh(new zzbfj((Drawable) null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return zzm(jSONObject.optBoolean("require"), zzgch.zzm(this.zzb.zzb(optString, optDouble, optBoolean), new zzdld(optString, optDouble, optInt, optInt2), this.zzg), (Object) null);
    }

    private final ListenableFuture zzo(JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzgch.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            arrayList.add(zzn(jSONArray.optJSONObject(i), z));
        }
        return zzgch.zzm(zzgch.zzd(arrayList), new zzdli(), this.zzg);
    }

    private final ListenableFuture zzp(JSONObject jSONObject, zzfbo zzfbo, zzfbr zzfbr) {
        ListenableFuture zzb2 = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString("html"), zzfbo, zzfbr, zzk(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return zzgch.zzn(zzb2, new zzdlf(zzb2), zzbzw.zzg);
    }

    private static Integer zzq(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static final zzez zzr(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new zzez(optString, optString2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzbfg zza(JSONObject jSONObject, List list) {
        Integer num = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer zzq2 = zzq(jSONObject, "bg_color");
        Integer zzq3 = zzq(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        int optInt3 = jSONObject.optInt("presentation_ms", 4000);
        if (optInt > 0) {
            num = Integer.valueOf(optInt);
        }
        return new zzbfg(optString, list, zzq2, zzq3, num, optInt3 + optInt2, this.zzh.zze, optBoolean);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzb(zzs zzs, zzfbo zzfbo, zzfbr zzfbr, String str, String str2, Object obj) throws Exception {
        zzcex zza2 = this.zzj.zza(zzs, zzfbo, zzfbr);
        zzcaa zza3 = zzcaa.zza(zza2);
        zzdno zzb2 = this.zzl.zzb();
        zzdno zzdno = zzb2;
        zzcgp zzN = zza2.zzN();
        zzb zzb3 = r3;
        zzb zzb4 = new zzb(this.zza, (zzbxu) null, (zzbus) null);
        zzN.zzV(zzb2, zzdno, zzb2, zzb2, zzb2, false, (zzbjs) null, zzb3, (zzbsj) null, (zzbxu) null, this.zzo, this.zzn, this.zzm, (zzbkj) null, zzb2, (zzbki) null, (zzbkc) null, (zzbjq) null, (zzcmk) null);
        zza2.zzag("/getNativeAdViewSignals", zzbjo.zzs);
        zza2.zzag("/getNativeClickMeta", zzbjo.zzt);
        zza2.zzN().zzF(true);
        zza2.zzN().zzC(new zzdlm(zza3));
        zza2.zzae(str, str2, (String) null);
        return zza3;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzc(String str, Object obj) throws Exception {
        zzv.zzA();
        zzcex zza2 = zzcfk.zza(this.zza, zzcgr.zza(), "native-omid", false, false, this.zzc, (zzbds) null, this.zzd, (zzbda) null, (zzn) null, this.zze, this.zzf, (zzfbo) null, (zzfbr) null, this.zzp, this.zzq);
        zzcaa zza3 = zzcaa.zza(zza2);
        zza2.zzN().zzC(new zzdlc(zza3));
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzfi)).booleanValue()) {
            zza2.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        } else {
            zza2.loadData(str, "text/html", "UTF-8");
        }
        return zza3;
    }

    public final ListenableFuture zzd(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return zzgch.zzh((Object) null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return zzm(optJSONObject.optBoolean("require"), zzgch.zzm(zzo(optJSONArray, false, true), new zzdlj(this, optJSONObject), this.zzg), (Object) null);
    }

    public final ListenableFuture zze(JSONObject jSONObject, String str) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb);
    }

    public final ListenableFuture zzf(JSONObject jSONObject, String str) {
        zzbfl zzbfl = this.zzh;
        return zzo(jSONObject.optJSONArray("images"), zzbfl.zzb, zzbfl.zzd);
    }

    public final ListenableFuture zzg(JSONObject jSONObject, String str, zzfbo zzfbo, zzfbr zzfbr) {
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzjS)).booleanValue()) {
            return zzgch.zzh((Object) null);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzgch.zzh((Object) null);
        }
        JSONObject optJSONObject = optJSONArray.optJSONObject(0);
        if (optJSONObject == null) {
            return zzgch.zzh((Object) null);
        }
        String optString = optJSONObject.optString("base_url");
        String optString2 = optJSONObject.optString("html");
        zzs zzk2 = zzk(optJSONObject.optInt("width", 0), optJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(optString2)) {
            return zzgch.zzh((Object) null);
        }
        ListenableFuture zzn2 = zzgch.zzn(zzgch.zzh((Object) null), new zzdlg(this, zzk2, zzfbo, zzfbr, optString, optString2), zzbzw.zzf);
        return zzgch.zzn(zzn2, new zzdlh(zzn2), zzbzw.zzg);
    }

    public final ListenableFuture zzh(JSONObject jSONObject, zzfbo zzfbo, zzfbr zzfbr) {
        ListenableFuture listenableFuture;
        JSONObject zzh2 = zzbs.zzh(jSONObject, "html_containers", "instream");
        if (zzh2 != null) {
            return zzp(zzh2, zzfbo, zzfbr);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("video");
        if (optJSONObject == null) {
            return zzgch.zzh((Object) null);
        }
        String optString = optJSONObject.optString("vast_xml");
        boolean z = false;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzjR)).booleanValue() && optJSONObject.has("html")) {
            z = true;
        }
        if (TextUtils.isEmpty(optString)) {
            if (!z) {
                zzo.zzj("Required field 'vast_xml' or 'html' is missing");
                return zzgch.zzh((Object) null);
            }
        } else if (!z) {
            listenableFuture = this.zzi.zza(optJSONObject);
            zzbcc zzbcc = zzbcl.zzdS;
            return zzl(zzgch.zzo(listenableFuture, (long) ((Integer) zzbe.zzc().zza(zzbcc)).intValue(), TimeUnit.SECONDS, this.zzk), (Object) null);
        }
        listenableFuture = zzp(optJSONObject, zzfbo, zzfbr);
        zzbcc zzbcc2 = zzbcl.zzdS;
        return zzl(zzgch.zzo(listenableFuture, (long) ((Integer) zzbe.zzc().zza(zzbcc2)).intValue(), TimeUnit.SECONDS, this.zzk), (Object) null);
    }

    private final zzs zzk(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return zzs.zzc();
            }
            i = 0;
        }
        return new zzs(this.zza, new AdSize(i, i2));
    }
}
