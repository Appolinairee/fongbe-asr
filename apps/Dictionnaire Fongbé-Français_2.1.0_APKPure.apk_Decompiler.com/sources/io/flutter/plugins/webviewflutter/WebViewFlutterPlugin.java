package io.flutter.plugins.webviewflutter;

import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugins.webviewflutter.FlutterAssetManager;

public class WebViewFlutterPlugin implements FlutterPlugin, ActivityAware {
    private FlutterPlugin.FlutterPluginBinding pluginBinding;
    private ProxyApiRegistrar proxyApiRegistrar;

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.pluginBinding = flutterPluginBinding;
        this.proxyApiRegistrar = new ProxyApiRegistrar(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext(), new FlutterAssetManager.PluginBindingFlutterAssetManager(flutterPluginBinding.getApplicationContext().getAssets(), flutterPluginBinding.getFlutterAssets()));
        flutterPluginBinding.getPlatformViewRegistry().registerViewFactory("plugins.flutter.io/webview", new FlutterViewFactory(this.proxyApiRegistrar.getInstanceManager()));
        this.proxyApiRegistrar.setUp();
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        ProxyApiRegistrar proxyApiRegistrar2 = this.proxyApiRegistrar;
        if (proxyApiRegistrar2 != null) {
            proxyApiRegistrar2.tearDown();
            this.proxyApiRegistrar.getInstanceManager().stopFinalizationListener();
            this.proxyApiRegistrar = null;
        }
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        ProxyApiRegistrar proxyApiRegistrar2 = this.proxyApiRegistrar;
        if (proxyApiRegistrar2 != null) {
            proxyApiRegistrar2.setContext(activityPluginBinding.getActivity());
        }
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.proxyApiRegistrar.setContext(this.pluginBinding.getApplicationContext());
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        this.proxyApiRegistrar.setContext(activityPluginBinding.getActivity());
    }

    public void onDetachedFromActivity() {
        this.proxyApiRegistrar.setContext(this.pluginBinding.getApplicationContext());
    }

    public AndroidWebkitLibraryPigeonInstanceManager getInstanceManager() {
        return this.proxyApiRegistrar.getInstanceManager();
    }
}
