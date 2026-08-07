package io.flutter.plugin.text;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import androidx.webkit.internal.AssetHelper;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.embedding.engine.systemchannels.ProcessTextChannel;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProcessTextPlugin implements FlutterPlugin, ActivityAware, PluginRegistry.ActivityResultListener, ProcessTextChannel.ProcessTextMethodHandler {
    private static final String TAG = "ProcessTextPlugin";
    private ActivityPluginBinding activityBinding;
    private final PackageManager packageManager;
    private final ProcessTextChannel processTextChannel;
    private Map<Integer, MethodChannel.Result> requestsByCode = new HashMap();
    private Map<String, ResolveInfo> resolveInfosById;

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
    }

    public ProcessTextPlugin(ProcessTextChannel processTextChannel2) {
        this.processTextChannel = processTextChannel2;
        this.packageManager = processTextChannel2.packageManager;
        processTextChannel2.setMethodHandler(this);
    }

    public Map<String, String> queryTextActions() {
        if (this.resolveInfosById == null) {
            cacheResolveInfos();
        }
        HashMap hashMap = new HashMap();
        for (String next : this.resolveInfosById.keySet()) {
            hashMap.put(next, this.resolveInfosById.get(next).loadLabel(this.packageManager).toString());
        }
        return hashMap;
    }

    public void processTextAction(String str, String str2, boolean z, MethodChannel.Result result) {
        if (this.activityBinding == null) {
            result.error("error", "Plugin not bound to an Activity", (Object) null);
        } else if (Build.VERSION.SDK_INT < 23) {
            result.error("error", "Android version not supported", (Object) null);
        } else {
            Map<String, ResolveInfo> map = this.resolveInfosById;
            if (map == null) {
                result.error("error", "Can not process text actions before calling queryTextActions", (Object) null);
                return;
            }
            ResolveInfo resolveInfo = map.get(str);
            if (resolveInfo == null) {
                result.error("error", "Text processing activity not found", (Object) null);
                return;
            }
            int hashCode = result.hashCode();
            Integer valueOf = Integer.valueOf(hashCode);
            this.requestsByCode.put(valueOf, result);
            Intent intent = new Intent();
            intent.setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
            intent.setAction("android.intent.action.PROCESS_TEXT");
            intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
            intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
            intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z);
            Activity activity = this.activityBinding.getActivity();
            valueOf.getClass();
            activity.startActivityForResult(intent, hashCode);
        }
    }

    private void cacheResolveInfos() {
        List<ResolveInfo> list;
        this.resolveInfosById = new HashMap();
        if (Build.VERSION.SDK_INT >= 23) {
            Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType(AssetHelper.DEFAULT_MIME_TYPE);
            if (Build.VERSION.SDK_INT >= 33) {
                list = this.packageManager.queryIntentActivities(type, PackageManager.ResolveInfoFlags.of(0));
            } else {
                list = this.packageManager.queryIntentActivities(type, 0);
            }
            for (ResolveInfo next : list) {
                String str = next.activityInfo.name;
                next.loadLabel(this.packageManager).toString();
                this.resolveInfosById.put(str, next);
            }
        }
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        if (!this.requestsByCode.containsKey(Integer.valueOf(i))) {
            return false;
        }
        this.requestsByCode.remove(Integer.valueOf(i)).success(i2 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
        return true;
    }

    public void destroy() {
        this.processTextChannel.setMethodHandler((ProcessTextChannel.ProcessTextMethodHandler) null);
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        this.activityBinding = activityPluginBinding;
        activityPluginBinding.addActivityResultListener(this);
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.activityBinding.removeActivityResultListener(this);
        this.activityBinding = null;
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        this.activityBinding = activityPluginBinding;
        activityPluginBinding.addActivityResultListener(this);
    }

    public void onDetachedFromActivity() {
        this.activityBinding.removeActivityResultListener(this);
        this.activityBinding = null;
    }
}
