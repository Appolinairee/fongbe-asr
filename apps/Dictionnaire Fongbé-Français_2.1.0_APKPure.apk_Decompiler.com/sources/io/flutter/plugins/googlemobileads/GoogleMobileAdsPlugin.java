package io.flutter.plugins.googlemobileads;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import io.flutter.plugins.googlemobileads.FlutterAd;
import io.flutter.plugins.googlemobileads.FlutterAdSize;
import io.flutter.plugins.googlemobileads.FlutterNativeAd;
import io.flutter.plugins.googlemobileads.nativetemplates.FlutterNativeTemplateStyle;
import io.flutter.plugins.googlemobileads.usermessagingplatform.UserMessagingPlatformManager;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GoogleMobileAdsPlugin implements FlutterPlugin, ActivityAware, MethodChannel.MethodCallHandler {
    private static final String TAG = "GoogleMobileAdsPlugin";
    private AdMessageCodec adMessageCodec;
    private AppStateNotifier appStateNotifier;
    private final FlutterMobileAdsWrapper flutterMobileAds;
    private AdInstanceManager instanceManager;
    private MediationNetworkExtrasProvider mediationNetworkExtrasProvider;
    private final Map<String, NativeAdFactory> nativeAdFactories;
    private FlutterPlugin.FlutterPluginBinding pluginBinding;
    private UserMessagingPlatformManager userMessagingPlatformManager;

    public interface NativeAdFactory {
        NativeAdView createNativeAd(NativeAd nativeAd, Map<String, Object> map);
    }

    private static <T> T requireNonNull(T t) {
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException();
    }

    public GoogleMobileAdsPlugin() {
        this.nativeAdFactories = new HashMap();
        this.flutterMobileAds = new FlutterMobileAdsWrapper();
    }

    protected GoogleMobileAdsPlugin(FlutterPlugin.FlutterPluginBinding flutterPluginBinding, AdInstanceManager adInstanceManager, FlutterMobileAdsWrapper flutterMobileAdsWrapper) {
        this.nativeAdFactories = new HashMap();
        this.pluginBinding = flutterPluginBinding;
        this.instanceManager = adInstanceManager;
        this.flutterMobileAds = flutterMobileAdsWrapper;
    }

    protected GoogleMobileAdsPlugin(AppStateNotifier appStateNotifier2) {
        this.nativeAdFactories = new HashMap();
        this.appStateNotifier = appStateNotifier2;
        this.flutterMobileAds = new FlutterMobileAdsWrapper();
    }

    public static boolean registerNativeAdFactory(FlutterEngine flutterEngine, String str, NativeAdFactory nativeAdFactory) {
        return registerNativeAdFactory((GoogleMobileAdsPlugin) flutterEngine.getPlugins().get(GoogleMobileAdsPlugin.class), str, nativeAdFactory);
    }

    @Deprecated
    public static boolean registerMediationNetworkExtrasProvider(FlutterEngine flutterEngine, MediationNetworkExtrasProvider mediationNetworkExtrasProvider2) {
        GoogleMobileAdsPlugin googleMobileAdsPlugin = (GoogleMobileAdsPlugin) flutterEngine.getPlugins().get(GoogleMobileAdsPlugin.class);
        if (googleMobileAdsPlugin == null) {
            return false;
        }
        googleMobileAdsPlugin.mediationNetworkExtrasProvider = mediationNetworkExtrasProvider2;
        AdMessageCodec adMessageCodec2 = googleMobileAdsPlugin.adMessageCodec;
        if (adMessageCodec2 == null) {
            return true;
        }
        adMessageCodec2.setMediationNetworkExtrasProvider(mediationNetworkExtrasProvider2);
        return true;
    }

    @Deprecated
    public static void unregisterMediationNetworkExtrasProvider(FlutterEngine flutterEngine) {
        GoogleMobileAdsPlugin googleMobileAdsPlugin = (GoogleMobileAdsPlugin) flutterEngine.getPlugins().get(GoogleMobileAdsPlugin.class);
        if (googleMobileAdsPlugin != null) {
            AdMessageCodec adMessageCodec2 = googleMobileAdsPlugin.adMessageCodec;
            if (adMessageCodec2 != null) {
                adMessageCodec2.setMediationNetworkExtrasProvider((MediationNetworkExtrasProvider) null);
            }
            googleMobileAdsPlugin.mediationNetworkExtrasProvider = null;
        }
    }

    private static boolean registerNativeAdFactory(GoogleMobileAdsPlugin googleMobileAdsPlugin, String str, NativeAdFactory nativeAdFactory) {
        if (googleMobileAdsPlugin != null) {
            return googleMobileAdsPlugin.addNativeAdFactory(str, nativeAdFactory);
        }
        throw new IllegalStateException(String.format("Could not find a %s instance. The plugin may have not been registered.", new Object[]{TAG}));
    }

    public static NativeAdFactory unregisterNativeAdFactory(FlutterEngine flutterEngine, String str) {
        FlutterPlugin flutterPlugin = flutterEngine.getPlugins().get(GoogleMobileAdsPlugin.class);
        if (flutterPlugin != null) {
            return ((GoogleMobileAdsPlugin) flutterPlugin).removeNativeAdFactory(str);
        }
        return null;
    }

    private boolean addNativeAdFactory(String str, NativeAdFactory nativeAdFactory) {
        if (this.nativeAdFactories.containsKey(str)) {
            Log.e(TAG, String.format("A NativeAdFactory with the following factoryId already exists: %s", new Object[]{str}));
            return false;
        }
        this.nativeAdFactories.put(str, nativeAdFactory);
        return true;
    }

    private NativeAdFactory removeNativeAdFactory(String str) {
        return this.nativeAdFactories.remove(str);
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.pluginBinding = flutterPluginBinding;
        AdMessageCodec adMessageCodec2 = new AdMessageCodec(flutterPluginBinding.getApplicationContext(), new FlutterRequestAgentProvider(flutterPluginBinding.getApplicationContext()));
        this.adMessageCodec = adMessageCodec2;
        MediationNetworkExtrasProvider mediationNetworkExtrasProvider2 = this.mediationNetworkExtrasProvider;
        if (mediationNetworkExtrasProvider2 != null) {
            adMessageCodec2.setMediationNetworkExtrasProvider(mediationNetworkExtrasProvider2);
        }
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "plugins.flutter.io/google_mobile_ads", new StandardMethodCodec(this.adMessageCodec));
        methodChannel.setMethodCallHandler(this);
        this.instanceManager = new AdInstanceManager(methodChannel);
        flutterPluginBinding.getPlatformViewRegistry().registerViewFactory("plugins.flutter.io/google_mobile_ads/ad_widget", new GoogleMobileAdsViewFactory(this.instanceManager));
        this.appStateNotifier = new AppStateNotifier(flutterPluginBinding.getBinaryMessenger());
        this.userMessagingPlatformManager = new UserMessagingPlatformManager(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext());
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        AppStateNotifier appStateNotifier2 = this.appStateNotifier;
        if (appStateNotifier2 != null) {
            appStateNotifier2.stop();
            this.appStateNotifier = null;
        }
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        AdInstanceManager adInstanceManager = this.instanceManager;
        if (adInstanceManager != null) {
            adInstanceManager.setActivity(activityPluginBinding.getActivity());
        }
        AdMessageCodec adMessageCodec2 = this.adMessageCodec;
        if (adMessageCodec2 != null) {
            adMessageCodec2.setContext(activityPluginBinding.getActivity());
        }
        UserMessagingPlatformManager userMessagingPlatformManager2 = this.userMessagingPlatformManager;
        if (userMessagingPlatformManager2 != null) {
            userMessagingPlatformManager2.setActivity(activityPluginBinding.getActivity());
        }
    }

    public void onDetachedFromActivityForConfigChanges() {
        FlutterPlugin.FlutterPluginBinding flutterPluginBinding;
        AdMessageCodec adMessageCodec2 = this.adMessageCodec;
        if (!(adMessageCodec2 == null || (flutterPluginBinding = this.pluginBinding) == null)) {
            adMessageCodec2.setContext(flutterPluginBinding.getApplicationContext());
        }
        AdInstanceManager adInstanceManager = this.instanceManager;
        if (adInstanceManager != null) {
            adInstanceManager.setActivity((Activity) null);
        }
        UserMessagingPlatformManager userMessagingPlatformManager2 = this.userMessagingPlatformManager;
        if (userMessagingPlatformManager2 != null) {
            userMessagingPlatformManager2.setActivity((Activity) null);
        }
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        AdInstanceManager adInstanceManager = this.instanceManager;
        if (adInstanceManager != null) {
            adInstanceManager.setActivity(activityPluginBinding.getActivity());
        }
        AdMessageCodec adMessageCodec2 = this.adMessageCodec;
        if (adMessageCodec2 != null) {
            adMessageCodec2.setContext(activityPluginBinding.getActivity());
        }
        UserMessagingPlatformManager userMessagingPlatformManager2 = this.userMessagingPlatformManager;
        if (userMessagingPlatformManager2 != null) {
            userMessagingPlatformManager2.setActivity(activityPluginBinding.getActivity());
        }
    }

    public void onDetachedFromActivity() {
        FlutterPlugin.FlutterPluginBinding flutterPluginBinding;
        AdMessageCodec adMessageCodec2 = this.adMessageCodec;
        if (!(adMessageCodec2 == null || (flutterPluginBinding = this.pluginBinding) == null)) {
            adMessageCodec2.setContext(flutterPluginBinding.getApplicationContext());
        }
        AdInstanceManager adInstanceManager = this.instanceManager;
        if (adInstanceManager != null) {
            adInstanceManager.setActivity((Activity) null);
        }
        UserMessagingPlatformManager userMessagingPlatformManager2 = this.userMessagingPlatformManager;
        if (userMessagingPlatformManager2 != null) {
            userMessagingPlatformManager2.setActivity((Activity) null);
        }
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        Context context;
        FlutterRewardedAd flutterRewardedAd;
        FlutterRewardedInterstitialAd flutterRewardedInterstitialAd;
        MethodCall methodCall2 = methodCall;
        final MethodChannel.Result result2 = result;
        AdInstanceManager adInstanceManager = this.instanceManager;
        if (adInstanceManager == null || this.pluginBinding == null) {
            Log.e(TAG, "method call received before instanceManager initialized: " + methodCall2.method);
            return;
        }
        if (adInstanceManager.getActivity() != null) {
            context = this.instanceManager.getActivity();
        } else {
            context = this.pluginBinding.getApplicationContext();
        }
        String str = methodCall2.method;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1959534605:
                if (str.equals("MobileAds#openDebugMenu")) {
                    c = 0;
                    break;
                }
                break;
            case -1941808395:
                if (str.equals("loadInterstitialAd")) {
                    c = 1;
                    break;
                }
                break;
            case -1826439721:
                if (str.equals("MobileAds#setAppMuted")) {
                    c = 2;
                    break;
                }
                break;
            case -1771320504:
                if (str.equals("loadAppOpenAd")) {
                    c = 3;
                    break;
                }
                break;
            case -1557947903:
                if (str.equals("MobileAds#registerWebView")) {
                    c = 4;
                    break;
                }
                break;
            case -1548893609:
                if (str.equals("loadRewardedAd")) {
                    c = 5;
                    break;
                }
                break;
            case -1395015128:
                if (str.equals("MobileAds#getRequestConfiguration")) {
                    c = 6;
                    break;
                }
                break;
            case -1273455673:
                if (str.equals("loadFluidAd")) {
                    c = 7;
                    break;
                }
                break;
            case -965504608:
                if (str.equals("loadNativeAd")) {
                    c = 8;
                    break;
                }
                break;
            case -918684377:
                if (str.equals("setServerSideVerificationOptions")) {
                    c = 9;
                    break;
                }
                break;
            case -768079951:
                if (str.equals("AdSize#getAnchoredAdaptiveBannerAdSize")) {
                    c = 10;
                    break;
                }
                break;
            case -676596397:
                if (str.equals("loadAdManagerInterstitialAd")) {
                    c = 11;
                    break;
                }
                break;
            case -572043403:
                if (str.equals("loadBannerAd")) {
                    c = 12;
                    break;
                }
                break;
            case -533157842:
                if (str.equals("MobileAds#setAppVolume")) {
                    c = 13;
                    break;
                }
                break;
            case -436783448:
                if (str.equals("MobileAds#getVersionString")) {
                    c = 14;
                    break;
                }
                break;
            case -172783533:
                if (str.equals("loadAdManagerBannerAd")) {
                    c = 15;
                    break;
                }
                break;
            case 90971631:
                if (str.equals("_init")) {
                    c = 16;
                    break;
                }
                break;
            case 250880674:
                if (str.equals("disposeAd")) {
                    c = 17;
                    break;
                }
                break;
            case 273004986:
                if (str.equals("getAdSize")) {
                    c = 18;
                    break;
                }
                break;
            case 288452133:
                if (str.equals("MobileAds#updateRequestConfiguration")) {
                    c = 19;
                    break;
                }
                break;
            case 316173893:
                if (str.equals("MobileAds#disableMediationInitialization")) {
                    c = 20;
                    break;
                }
                break;
            case 1064076149:
                if (str.equals("MobileAds#openAdInspector")) {
                    c = 21;
                    break;
                }
                break;
            case 1355848557:
                if (str.equals("showAdWithoutView")) {
                    c = 22;
                    break;
                }
                break;
            case 1403601573:
                if (str.equals("MobileAds#initialize")) {
                    c = 23;
                    break;
                }
                break;
            case 1661969852:
                if (str.equals("setImmersiveMode")) {
                    c = 24;
                    break;
                }
                break;
            case 1882741923:
                if (str.equals("loadRewardedInterstitialAd")) {
                    c = 25;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.flutterMobileAds.openDebugMenu(context, (String) methodCall2.argument("adUnitId"));
                result2.success((Object) null);
                return;
            case 1:
                FlutterInterstitialAd flutterInterstitialAd = new FlutterInterstitialAd(((Integer) methodCall2.argument("adId")).intValue(), this.instanceManager, (String) methodCall2.argument("adUnitId"), (FlutterAdRequest) methodCall2.argument("request"), new FlutterAdLoader(context));
                this.instanceManager.trackAd(flutterInterstitialAd, ((Integer) methodCall2.argument("adId")).intValue());
                flutterInterstitialAd.load();
                result2.success((Object) null);
                return;
            case 2:
                this.flutterMobileAds.setAppMuted(((Boolean) methodCall2.argument("muted")).booleanValue());
                result2.success((Object) null);
                return;
            case 3:
                FlutterAppOpenAd flutterAppOpenAd = new FlutterAppOpenAd(((Integer) methodCall2.argument("adId")).intValue(), (AdInstanceManager) requireNonNull(this.instanceManager), (String) requireNonNull((String) methodCall2.argument("adUnitId")), (FlutterAdRequest) methodCall2.argument("request"), (FlutterAdManagerAdRequest) methodCall2.argument("adManagerRequest"), new FlutterAdLoader(context));
                this.instanceManager.trackAd(flutterAppOpenAd, ((Integer) methodCall2.argument("adId")).intValue());
                flutterAppOpenAd.load();
                result2.success((Object) null);
                return;
            case 4:
                this.flutterMobileAds.registerWebView(((Integer) methodCall2.argument("webViewId")).intValue(), this.pluginBinding.getFlutterEngine());
                result2.success((Object) null);
                return;
            case 5:
                String str2 = (String) requireNonNull((String) methodCall2.argument("adUnitId"));
                FlutterAdRequest flutterAdRequest = (FlutterAdRequest) methodCall2.argument("request");
                FlutterAdManagerAdRequest flutterAdManagerAdRequest = (FlutterAdManagerAdRequest) methodCall2.argument("adManagerRequest");
                if (flutterAdRequest != null) {
                    flutterRewardedAd = new FlutterRewardedAd(((Integer) methodCall2.argument("adId")).intValue(), (AdInstanceManager) requireNonNull(this.instanceManager), str2, flutterAdRequest, new FlutterAdLoader(context));
                } else if (flutterAdManagerAdRequest != null) {
                    flutterRewardedAd = new FlutterRewardedAd(((Integer) methodCall2.argument("adId")).intValue(), (AdInstanceManager) requireNonNull(this.instanceManager), str2, flutterAdManagerAdRequest, new FlutterAdLoader(context));
                } else {
                    result2.error("InvalidRequest", "A null or invalid ad request was provided.", (Object) null);
                    return;
                }
                this.instanceManager.trackAd(flutterRewardedAd, ((Integer) requireNonNull((Integer) methodCall2.argument("adId"))).intValue());
                flutterRewardedAd.load();
                result2.success((Object) null);
                return;
            case 6:
                result2.success(this.flutterMobileAds.getRequestConfiguration());
                return;
            case 7:
                FluidAdManagerBannerAd fluidAdManagerBannerAd = new FluidAdManagerBannerAd(((Integer) methodCall2.argument("adId")).intValue(), this.instanceManager, (String) methodCall2.argument("adUnitId"), (FlutterAdManagerAdRequest) methodCall2.argument("request"), getBannerAdCreator(context));
                this.instanceManager.trackAd(fluidAdManagerBannerAd, ((Integer) methodCall2.argument("adId")).intValue());
                fluidAdManagerBannerAd.load();
                result2.success((Object) null);
                return;
            case 8:
                String str3 = (String) methodCall2.argument("factoryId");
                NativeAdFactory nativeAdFactory = this.nativeAdFactories.get(str3);
                FlutterNativeTemplateStyle flutterNativeTemplateStyle = (FlutterNativeTemplateStyle) methodCall2.argument("nativeTemplateStyle");
                if (nativeAdFactory == null && flutterNativeTemplateStyle == null) {
                    result2.error("NativeAdError", String.format("No NativeAdFactory with id: %s or nativeTemplateStyle", new Object[]{str3}), (Object) null);
                    return;
                }
                FlutterNativeAd build = new FlutterNativeAd.Builder(context).setManager(this.instanceManager).setAdUnitId((String) methodCall2.argument("adUnitId")).setAdFactory(nativeAdFactory).setRequest((FlutterAdRequest) methodCall2.argument("request")).setAdManagerRequest((FlutterAdManagerAdRequest) methodCall2.argument("adManagerRequest")).setCustomOptions((Map) methodCall2.argument("customOptions")).setId(((Integer) methodCall2.argument("adId")).intValue()).setNativeAdOptions((FlutterNativeAdOptions) methodCall2.argument("nativeAdOptions")).setFlutterAdLoader(new FlutterAdLoader(context)).setNativeTemplateStyle((FlutterNativeTemplateStyle) methodCall2.argument("nativeTemplateStyle")).build();
                this.instanceManager.trackAd(build, ((Integer) methodCall2.argument("adId")).intValue());
                build.load();
                result2.success((Object) null);
                return;
            case 9:
                FlutterAd adForId = this.instanceManager.adForId(((Integer) methodCall2.argument("adId")).intValue());
                FlutterServerSideVerificationOptions flutterServerSideVerificationOptions = (FlutterServerSideVerificationOptions) methodCall2.argument("serverSideVerificationOptions");
                if (adForId == null) {
                    Log.w(TAG, "Error - null ad in setServerSideVerificationOptions");
                } else if (adForId instanceof FlutterRewardedAd) {
                    ((FlutterRewardedAd) adForId).setServerSideVerificationOptions(flutterServerSideVerificationOptions);
                } else if (adForId instanceof FlutterRewardedInterstitialAd) {
                    ((FlutterRewardedInterstitialAd) adForId).setServerSideVerificationOptions(flutterServerSideVerificationOptions);
                } else {
                    Log.w(TAG, "Error - setServerSideVerificationOptions called on non-rewarded ad");
                }
                result2.success((Object) null);
                return;
            case 10:
                FlutterAdSize.AnchoredAdaptiveBannerAdSize anchoredAdaptiveBannerAdSize = new FlutterAdSize.AnchoredAdaptiveBannerAdSize(context, new FlutterAdSize.AdSizeFactory(), (String) methodCall2.argument("orientation"), ((Integer) methodCall2.argument("width")).intValue());
                if (AdSize.INVALID.equals(anchoredAdaptiveBannerAdSize.size)) {
                    result2.success((Object) null);
                    return;
                } else {
                    result2.success(Integer.valueOf(anchoredAdaptiveBannerAdSize.height));
                    return;
                }
            case 11:
                FlutterAdManagerInterstitialAd flutterAdManagerInterstitialAd = new FlutterAdManagerInterstitialAd(((Integer) methodCall2.argument("adId")).intValue(), (AdInstanceManager) requireNonNull(this.instanceManager), (String) requireNonNull((String) methodCall2.argument("adUnitId")), (FlutterAdManagerAdRequest) methodCall2.argument("request"), new FlutterAdLoader(context));
                this.instanceManager.trackAd(flutterAdManagerInterstitialAd, ((Integer) requireNonNull((Integer) methodCall2.argument("adId"))).intValue());
                flutterAdManagerInterstitialAd.load();
                result2.success((Object) null);
                return;
            case 12:
                FlutterBannerAd flutterBannerAd = new FlutterBannerAd(((Integer) methodCall2.argument("adId")).intValue(), this.instanceManager, (String) methodCall2.argument("adUnitId"), (FlutterAdRequest) methodCall2.argument("request"), (FlutterAdSize) methodCall2.argument("size"), getBannerAdCreator(context));
                this.instanceManager.trackAd(flutterBannerAd, ((Integer) methodCall2.argument("adId")).intValue());
                flutterBannerAd.load();
                result2.success((Object) null);
                return;
            case 13:
                this.flutterMobileAds.setAppVolume(((Double) methodCall2.argument("volume")).doubleValue());
                result2.success((Object) null);
                return;
            case 14:
                result2.success(this.flutterMobileAds.getVersionString());
                return;
            case 15:
                FlutterAdManagerBannerAd flutterAdManagerBannerAd = new FlutterAdManagerBannerAd(((Integer) methodCall2.argument("adId")).intValue(), this.instanceManager, (String) methodCall2.argument("adUnitId"), (List) methodCall2.argument("sizes"), (FlutterAdManagerAdRequest) methodCall2.argument("request"), getBannerAdCreator(context));
                this.instanceManager.trackAd(flutterAdManagerBannerAd, ((Integer) methodCall2.argument("adId")).intValue());
                flutterAdManagerBannerAd.load();
                result2.success((Object) null);
                return;
            case 16:
                this.instanceManager.disposeAllAds();
                result2.success((Object) null);
                return;
            case 17:
                this.instanceManager.disposeAd(((Integer) methodCall2.argument("adId")).intValue());
                result2.success((Object) null);
                return;
            case 18:
                FlutterAd adForId2 = this.instanceManager.adForId(((Integer) methodCall2.argument("adId")).intValue());
                if (adForId2 == null) {
                    result2.success((Object) null);
                    return;
                } else if (adForId2 instanceof FlutterBannerAd) {
                    result2.success(((FlutterBannerAd) adForId2).getAdSize());
                    return;
                } else if (adForId2 instanceof FlutterAdManagerBannerAd) {
                    result2.success(((FlutterAdManagerBannerAd) adForId2).getAdSize());
                    return;
                } else {
                    result2.error("unexpected_ad_type", "Unexpected ad type for getAdSize: " + adForId2, (Object) null);
                    return;
                }
            case 19:
                RequestConfiguration.Builder builder = MobileAds.getRequestConfiguration().toBuilder();
                String str4 = (String) methodCall2.argument("maxAdContentRating");
                Integer num = (Integer) methodCall2.argument("tagForChildDirectedTreatment");
                Integer num2 = (Integer) methodCall2.argument("tagForUnderAgeOfConsent");
                List list = (List) methodCall2.argument("testDeviceIds");
                if (str4 != null) {
                    builder.setMaxAdContentRating(str4);
                }
                if (num != null) {
                    builder.setTagForChildDirectedTreatment(num.intValue());
                }
                if (num2 != null) {
                    builder.setTagForUnderAgeOfConsent(num2.intValue());
                }
                if (list != null) {
                    builder.setTestDeviceIds(list);
                }
                MobileAds.setRequestConfiguration(builder.build());
                result2.success((Object) null);
                return;
            case 20:
                this.flutterMobileAds.disableMediationInitialization(context);
                result2.success((Object) null);
                return;
            case 21:
                this.flutterMobileAds.openAdInspector(context, new OnAdInspectorClosedListener() {
                    public void onAdInspectorClosed(AdInspectorError adInspectorError) {
                        if (adInspectorError != null) {
                            result2.error(Integer.toString(adInspectorError.getCode()), adInspectorError.getMessage(), adInspectorError.getDomain());
                            return;
                        }
                        result2.success((Object) null);
                    }
                });
                return;
            case 22:
                if (!this.instanceManager.showAdWithId(((Integer) methodCall2.argument("adId")).intValue())) {
                    result2.error("AdShowError", "Ad failed to show.", (Object) null);
                    return;
                } else {
                    result2.success((Object) null);
                    return;
                }
            case 23:
                this.flutterMobileAds.initialize(context, new FlutterInitializationListener(result2));
                return;
            case 24:
                ((FlutterAd.FlutterOverlayAd) this.instanceManager.adForId(((Integer) methodCall2.argument("adId")).intValue())).setImmersiveMode(((Boolean) methodCall2.argument("immersiveModeEnabled")).booleanValue());
                result2.success((Object) null);
                return;
            case 25:
                String str5 = (String) requireNonNull((String) methodCall2.argument("adUnitId"));
                FlutterAdRequest flutterAdRequest2 = (FlutterAdRequest) methodCall2.argument("request");
                FlutterAdManagerAdRequest flutterAdManagerAdRequest2 = (FlutterAdManagerAdRequest) methodCall2.argument("adManagerRequest");
                if (flutterAdRequest2 != null) {
                    flutterRewardedInterstitialAd = new FlutterRewardedInterstitialAd(((Integer) methodCall2.argument("adId")).intValue(), (AdInstanceManager) requireNonNull(this.instanceManager), str5, flutterAdRequest2, new FlutterAdLoader(context));
                } else if (flutterAdManagerAdRequest2 != null) {
                    flutterRewardedInterstitialAd = new FlutterRewardedInterstitialAd(((Integer) methodCall2.argument("adId")).intValue(), (AdInstanceManager) requireNonNull(this.instanceManager), str5, flutterAdManagerAdRequest2, new FlutterAdLoader(context));
                } else {
                    result2.error("InvalidRequest", "A null or invalid ad request was provided.", (Object) null);
                    return;
                }
                this.instanceManager.trackAd(flutterRewardedInterstitialAd, ((Integer) requireNonNull((Integer) methodCall2.argument("adId"))).intValue());
                flutterRewardedInterstitialAd.load();
                result2.success((Object) null);
                return;
            default:
                result.notImplemented();
                return;
        }
    }

    /* access modifiers changed from: package-private */
    public BannerAdCreator getBannerAdCreator(Context context) {
        return new BannerAdCreator(context);
    }

    private static final class FlutterInitializationListener implements OnInitializationCompleteListener {
        private boolean isInitializationCompleted;
        private final MethodChannel.Result result;

        private FlutterInitializationListener(MethodChannel.Result result2) {
            this.result = result2;
            this.isInitializationCompleted = false;
        }

        public void onInitializationComplete(InitializationStatus initializationStatus) {
            if (!this.isInitializationCompleted) {
                try {
                    Method declaredMethod = Class.forName("com.google.android.gms.ads.MobileAds").getDeclaredMethod("setPlugin", new Class[]{String.class});
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke((Object) null, new Object[]{Constants.REQUEST_AGENT_PREFIX_VERSIONED});
                } catch (Exception unused) {
                }
                this.result.success(new FlutterInitializationStatus(initializationStatus));
                this.isInitializationCompleted = true;
            }
        }
    }
}
