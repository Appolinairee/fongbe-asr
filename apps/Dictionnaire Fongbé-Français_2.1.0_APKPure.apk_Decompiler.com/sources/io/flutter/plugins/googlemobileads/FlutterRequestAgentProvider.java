package io.flutter.plugins.googlemobileads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;

class FlutterRequestAgentProvider {
    static final String GAME_VERSION_KEY = "io.flutter.plugins.googlemobileads.FLUTTER_GAME_TEMPLATE_VERSION";
    static final String NEWS_VERSION_KEY = "io.flutter.plugins.googlemobileads.FLUTTER_NEWS_TEMPLATE_VERSION";
    private String gameTemplateVersion;
    private String newsTemplateVersion;

    FlutterRequestAgentProvider(Context context) {
        processGameAndNewsTemplateVersions(context);
    }

    private void processGameAndNewsTemplateVersions(Context context) {
        ApplicationInfo applicationInfo;
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                applicationInfo = context.getApplicationContext().getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128));
            } else {
                applicationInfo = context.getApplicationContext().getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            }
            if (applicationInfo.metaData != null) {
                this.gameTemplateVersion = applicationInfo.metaData.getString(GAME_VERSION_KEY);
                this.newsTemplateVersion = applicationInfo.metaData.getString(NEWS_VERSION_KEY);
            }
        } catch (PackageManager.NameNotFoundException | ClassCastException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public String getRequestAgent() {
        StringBuilder sb = new StringBuilder(Constants.REQUEST_AGENT_PREFIX_VERSIONED);
        if (this.newsTemplateVersion != null) {
            sb.append("_News-");
            sb.append(this.newsTemplateVersion);
        }
        if (this.gameTemplateVersion != null) {
            sb.append("_Game-");
            sb.append(this.gameTemplateVersion);
        }
        return sb.toString();
    }
}
