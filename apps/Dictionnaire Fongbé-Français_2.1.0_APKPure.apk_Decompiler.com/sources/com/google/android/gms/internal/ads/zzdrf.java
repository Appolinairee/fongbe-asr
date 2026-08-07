package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
public final class zzdrf {
    public static final zzfxn zza;
    public static final zzfxn zzb;
    private final String zzc;
    private final zzdre zzd;
    private final zzdre zze;

    static {
        zzdre zzdre = zzdre.PUBLIC_API_CALL;
        zzdre zzdre2 = zzdre.PUBLIC_API_CALLBACK;
        zzdrf zzdrf = new zzdrf("tqgt", zzdre, zzdre2);
        zzdre zzdre3 = zzdre.PUBLIC_API_CALL;
        zzdre zzdre4 = zzdre.DYNAMITE_ENTER;
        zzdrf zzdrf2 = new zzdrf("l.dl", zzdre3, zzdre4);
        zzdre zzdre5 = zzdre.READ_FROM_DISK_START;
        zzdrf zzdrf3 = new zzdrf("l.rccde", zzdre4, zzdre5);
        zzdrf zzdrf4 = new zzdrf("l.rfd", zzdre5, zzdre.READ_FROM_DISK_END);
        zzdre zzdre6 = zzdre.CLIENT_SIGNALS_START;
        zzdrf zzdrf5 = new zzdrf("l.rcc", zzdre4, zzdre6);
        zzdre zzdre7 = zzdre.CLIENT_SIGNALS_END;
        zzdrf zzdrf6 = new zzdrf("l.cs", zzdre6, zzdre7);
        zzdrf zzdrf7 = new zzdrf("l.cts", zzdre7, zzdre.SERVICE_CONNECTED);
        zzdre zzdre8 = zzdre.GMS_SIGNALS_START;
        zzdre zzdre9 = zzdre.GMS_SIGNALS_END;
        zzdrf zzdrf8 = new zzdrf("l.gs", zzdre8, zzdre9);
        zzdre zzdre10 = zzdre.GET_SIGNALS_SDKCORE_START;
        zzdrf zzdrf9 = new zzdrf("l.jse", zzdre9, zzdre10);
        zzdre zzdre11 = zzdre.GET_SIGNALS_SDKCORE_END;
        zzdrf zzdrf10 = new zzdrf("l.gs-sdkcore", zzdre10, zzdre11);
        zzdrf zzdrf11 = new zzdrf("l.gs-pp", zzdre11, zzdre2);
        zzdre zzdre12 = zzdre.RENDERING_START;
        zzdrf zzdrf12 = new zzdrf("l.render", zzdre12, zzdre2);
        zzdre zzdre13 = zzdre.RENDERING_WEBVIEW_CREATION_START;
        zzdrf zzdrf13 = new zzdrf("l.render.pre", zzdre12, zzdre13);
        zzdre zzdre14 = zzdre.RENDERING_WEBVIEW_CREATION_END;
        zzdrf zzdrf14 = zzdrf12;
        zzdrf zzdrf15 = new zzdrf("l.render.wvc", zzdre13, zzdre14);
        zzdrf zzdrf16 = zzdrf11;
        zzdrf zzdrf17 = new zzdrf("l.render.acc", zzdre14, zzdre.RENDERING_AD_COMPONENT_CREATION_END);
        String str = "l.render.acc";
        zzdrf zzdrf18 = zzdrf10;
        zzdrf zzdrf19 = new zzdrf("l.render.cfg-wv", zzdre.RENDERING_CONFIGURE_WEBVIEW_START, zzdre.RENDERING_CONFIGURE_WEBVIEW_END);
        zzdre zzdre15 = zzdre.RENDERING_WEBVIEW_LOAD_HTML_START;
        zzdre zzdre16 = zzdre.RENDERING_WEBVIEW_LOAD_HTML_END;
        zzdrf zzdrf20 = zzdrf8;
        String str2 = "l.render.post";
        zzdrf zzdrf21 = zzdrf7;
        zzdrf zzdrf22 = zzdrf6;
        zzdrf zzdrf23 = zzdrf5;
        zzdrf[] zzdrfArr = {zzdrf13, zzdrf15, zzdrf17, zzdrf19, new zzdrf("l.render.wvlh", zzdre15, zzdre16), new zzdrf("l.render.post", zzdre16, zzdre2), new zzdrf("l.sodv", zzdre.SIGNAL_ON_DISK_VALIDATION_START, zzdre.SIGNAL_ON_DISK_VALIDATION_END), new zzdrf("l.sodck", zzdre.SIGNAL_ON_DISK_CACHE_KEY_START, zzdre.SIGNAL_ON_DISK_CACHE_KEY_END), new zzdrf("l.sodrar", zzdre.SIGNAL_ON_DISK_READ_AND_REMOVE_START, zzdre.SIGNAL_ON_DISK_READ_AND_REMOVE_END), new zzdrf("l.soddc", zzdre.SIGNAL_ON_DISK_DECODE_START, zzdre.SIGNAL_ON_DISK_DECODE_END)};
        String str3 = str2;
        String str4 = str;
        zza = zzfxn.zzt(zzdrf, zzdrf2, zzdrf3, zzdrf4, zzdrf23, zzdrf22, zzdrf21, zzdrf20, zzdrf9, zzdrf18, zzdrf16, zzdrf14, zzdrfArr);
        zzdre zzdre17 = zzdre.PUBLIC_API_CALL;
        zzdre zzdre18 = zzdre.PUBLIC_API_CALLBACK;
        zzdrf zzdrf24 = new zzdrf("l.al", zzdre17, zzdre18);
        zzdre zzdre19 = zzdre.DYNAMITE_ENTER;
        zzdrf zzdrf25 = new zzdrf("l.al2", zzdre19, zzdre18);
        zzdrf zzdrf26 = new zzdrf("l.dl", zzdre17, zzdre19);
        zzdre zzdre20 = zzdre.CLIENT_SIGNALS_START;
        zzdrf zzdrf27 = new zzdrf("l.rcc", zzdre19, zzdre20);
        zzdre zzdre21 = zzdre.CLIENT_SIGNALS_END;
        zzdrf zzdrf28 = new zzdrf("l.cs", zzdre20, zzdre21);
        zzdrf zzdrf29 = new zzdrf("l.cts", zzdre21, zzdre.SERVICE_CONNECTED);
        zzdre zzdre22 = zzdre.GMS_SIGNALS_START;
        zzdre zzdre23 = zzdre.GMS_SIGNALS_END;
        zzdrf zzdrf30 = new zzdrf("l.gs", zzdre22, zzdre23);
        zzdre zzdre24 = zzdre.GET_AD_DICTIONARY_SDKCORE_START;
        zzdrf zzdrf31 = new zzdrf("l.jse", zzdre23, zzdre24);
        zzdre zzdre25 = zzdre.GET_AD_DICTIONARY_SDKCORE_END;
        zzdrf zzdrf32 = new zzdrf("l.gad-js", zzdre24, zzdre25);
        zzdre zzdre26 = zzdre.HTTP_RESPONSE_READY;
        zzdrf zzdrf33 = new zzdrf("l.http", zzdre25, zzdre26);
        zzdre zzdre27 = zzdre.NORMALIZATION_AD_RESPONSE_START;
        zzdrf zzdrf34 = new zzdrf("l.jse-nml", zzdre26, zzdre27);
        zzdre zzdre28 = zzdre.NORMALIZATION_AD_RESPONSE_END;
        zzdrf zzdrf35 = zzdrf34;
        zzdrf zzdrf36 = new zzdrf("l.nml-js", zzdre27, zzdre28);
        zzdre zzdre29 = zzdre.BINDER_CALL_START;
        zzdrf zzdrf37 = zzdrf36;
        zzdrf zzdrf38 = new zzdrf("l.nml-gmsg", zzdre28, zzdre29);
        zzdre zzdre30 = zzdre.SERVER_RESPONSE_PARSE_START;
        zzdrf zzdrf39 = zzdrf33;
        zzdrf zzdrf40 = new zzdrf("l.binder", zzdre29, zzdre30);
        zzdre zzdre31 = zzdre.RENDERING_START;
        zzdrf zzdrf41 = zzdrf32;
        zzdrf zzdrf42 = new zzdrf("l.sr", zzdre30, zzdre31);
        zzdrf zzdrf43 = new zzdrf("l.render", zzdre31, zzdre18);
        zzdrf zzdrf44 = zzdrf31;
        zzdrf zzdrf45 = zzdrf30;
        zzdrf zzdrf46 = zzdrf29;
        zzdrf zzdrf47 = new zzdrf("l.t2", zzdre.RENDERING_ADSTRING_TYPE2_FETCH_START, zzdre.RENDERING_ADSTRING_TYPE2_FETCH_END);
        zzdre zzdre32 = zzdre.RENDERING_WEBVIEW_CREATION_START;
        zzdre zzdre33 = zzdre.RENDERING_WEBVIEW_CREATION_END;
        zzdrf zzdrf48 = new zzdrf("l.render.wvc", zzdre32, zzdre33);
        zzdrf zzdrf49 = zzdrf28;
        zzdrf zzdrf50 = zzdrf27;
        zzdrf zzdrf51 = new zzdrf(str, zzdre33, zzdre.RENDERING_AD_COMPONENT_CREATION_END);
        zzdrf zzdrf52 = zzdrf26;
        zzdrf zzdrf53 = new zzdrf("l.render.cfg-wv", zzdre.RENDERING_CONFIGURE_WEBVIEW_START, zzdre.RENDERING_CONFIGURE_WEBVIEW_END);
        zzdrf zzdrf54 = new zzdrf("l.render.pre", zzdre31, zzdre32);
        zzdre zzdre34 = zzdre.RENDERING_WEBVIEW_LOAD_HTML_END;
        zzb = zzfxn.zzt(zzdrf24, zzdrf25, zzdrf52, zzdrf50, zzdrf49, zzdrf46, zzdrf45, zzdrf44, zzdrf41, zzdrf39, zzdrf35, zzdrf37, zzdrf38, zzdrf40, zzdrf42, zzdrf43, zzdrf47, zzdrf48, zzdrf51, zzdrf53, zzdrf54, new zzdrf(str2, zzdre34, zzdre18), new zzdrf("l.render.wvlh", zzdre.RENDERING_WEBVIEW_LOAD_HTML_START, zzdre34));
    }

    public zzdrf(String str, zzdre zzdre, zzdre zzdre2) {
        this.zzc = str;
        this.zzd = zzdre;
        this.zze = zzdre2;
    }

    public final zzdre zza() {
        return this.zzd;
    }

    public final zzdre zzb() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzc;
    }
}
