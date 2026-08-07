package androidx.webkit.internal;

import androidx.webkit.UserAgentMetadata;
import androidx.webkit.WebViewMediaIntegrityApiStatusConfig;
import java.util.Collections;
import java.util.Set;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

public class WebSettingsNoOpAdapter extends WebSettingsAdapter {
    public int getAttributionRegistrationBehavior() {
        return 1;
    }

    public boolean getBackForwardCacheEnabled() {
        return false;
    }

    public int getDisabledActionModeMenuItems() {
        return 0;
    }

    public boolean getEnterpriseAuthenticationAppLinkPolicyEnabled() {
        return false;
    }

    public int getForceDark() {
        return 1;
    }

    public int getForceDarkStrategy() {
        return 2;
    }

    public boolean getHasEnrolledInstrumentEnabled() {
        return false;
    }

    public boolean getOffscreenPreRaster() {
        return false;
    }

    public boolean getPaymentRequestEnabled() {
        return false;
    }

    public boolean getSafeBrowsingEnabled() {
        return true;
    }

    public int getSpeculativeLoadingStatus() {
        return 0;
    }

    public int getWebAuthenticationSupport() {
        return 0;
    }

    public boolean isAlgorithmicDarkeningAllowed() {
        return false;
    }

    public void setAlgorithmicDarkeningAllowed(boolean z) {
    }

    public void setAttributionRegistrationBehavior(int i) {
    }

    public void setBackForwardCacheEnabled(boolean z) {
    }

    public void setDisabledActionModeMenuItems(int i) {
    }

    public void setEnterpriseAuthenticationAppLinkPolicyEnabled(boolean z) {
    }

    public void setForceDark(int i) {
    }

    public void setForceDarkStrategy(int i) {
    }

    public void setHasEnrolledInstrumentEnabled(boolean z) {
    }

    public void setOffscreenPreRaster(boolean z) {
    }

    public void setPaymentRequestEnabled(boolean z) {
    }

    public void setRequestedWithHeaderOriginAllowList(Set<String> set) {
    }

    public void setSafeBrowsingEnabled(boolean z) {
    }

    public void setSpeculativeLoadingStatus(int i) {
    }

    public void setUserAgentMetadata(UserAgentMetadata userAgentMetadata) {
    }

    public void setWebAuthenticationSupport(int i) {
    }

    public void setWebViewMediaIntegrityApiStatus(WebViewMediaIntegrityApiStatusConfig webViewMediaIntegrityApiStatusConfig) {
    }

    public WebSettingsNoOpAdapter() {
        super((WebSettingsBoundaryInterface) null);
    }

    public Set<String> getRequestedWithHeaderOriginAllowList() {
        return Collections.emptySet();
    }

    public UserAgentMetadata getUserAgentMetadata() {
        return UserAgentMetadataInternal.getUserAgentMetadataFromMap(Collections.emptyMap());
    }

    public WebViewMediaIntegrityApiStatusConfig getWebViewMediaIntegrityApiStatus() {
        return new WebViewMediaIntegrityApiStatusConfig.Builder(2).build();
    }
}
