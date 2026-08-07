package io.flutter.plugins.googlemobileads;

import android.os.Bundle;
import android.util.Pair;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AbstractAdRequestBuilder;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

class FlutterAdRequest {
    private final Map<String, String> adMobExtras;
    private final String contentUrl;
    private final Integer httpTimeoutMillis;
    private final List<String> keywords;
    private final List<FlutterMediationExtras> mediationExtras;
    private final String mediationExtrasIdentifier;
    private final MediationNetworkExtrasProvider mediationNetworkExtrasProvider;
    private final List<String> neighboringContentUrls;
    private final Boolean nonPersonalizedAds;
    private final String requestAgent;

    protected static class Builder {
        private Map<String, String> adMobExtras;
        private String contentUrl;
        private Integer httpTimeoutMillis;
        private List<String> keywords;
        private List<FlutterMediationExtras> mediationExtras;
        private String mediationExtrasIdentifier;
        private MediationNetworkExtrasProvider mediationNetworkExtrasProvider;
        private List<String> neighboringContentUrls;
        private Boolean nonPersonalizedAds;
        private String requestAgent;

        protected Builder() {
        }

        /* access modifiers changed from: package-private */
        public Builder setRequestAgent(String str) {
            this.requestAgent = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder setKeywords(List<String> list) {
            this.keywords = list;
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder setContentUrl(String str) {
            this.contentUrl = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder setNonPersonalizedAds(Boolean bool) {
            this.nonPersonalizedAds = bool;
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder setNeighboringContentUrls(List<String> list) {
            this.neighboringContentUrls = list;
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder setHttpTimeoutMillis(Integer num) {
            this.httpTimeoutMillis = num;
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder setMediationNetworkExtrasIdentifier(String str) {
            this.mediationExtrasIdentifier = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder setMediationNetworkExtrasProvider(MediationNetworkExtrasProvider mediationNetworkExtrasProvider2) {
            this.mediationNetworkExtrasProvider = mediationNetworkExtrasProvider2;
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder setAdMobExtras(Map<String, String> map) {
            this.adMobExtras = map;
            return this;
        }

        /* access modifiers changed from: package-private */
        public Builder setMediationExtras(List<FlutterMediationExtras> list) {
            this.mediationExtras = list;
            return this;
        }

        /* access modifiers changed from: protected */
        public List<String> getKeywords() {
            return this.keywords;
        }

        /* access modifiers changed from: protected */
        public String getContentUrl() {
            return this.contentUrl;
        }

        /* access modifiers changed from: protected */
        public Boolean getNonPersonalizedAds() {
            return this.nonPersonalizedAds;
        }

        /* access modifiers changed from: protected */
        public List<String> getNeighboringContentUrls() {
            return this.neighboringContentUrls;
        }

        /* access modifiers changed from: protected */
        public Integer getHttpTimeoutMillis() {
            return this.httpTimeoutMillis;
        }

        /* access modifiers changed from: protected */
        public String getMediationExtrasIdentifier() {
            return this.mediationExtrasIdentifier;
        }

        /* access modifiers changed from: protected */
        public MediationNetworkExtrasProvider getMediationNetworkExtrasProvider() {
            return this.mediationNetworkExtrasProvider;
        }

        /* access modifiers changed from: protected */
        public Map<String, String> getAdMobExtras() {
            return this.adMobExtras;
        }

        /* access modifiers changed from: protected */
        public String getRequestAgent() {
            return this.requestAgent;
        }

        /* access modifiers changed from: protected */
        public List<FlutterMediationExtras> getMediationExtras() {
            return this.mediationExtras;
        }

        /* access modifiers changed from: package-private */
        public FlutterAdRequest build() {
            return new FlutterAdRequest(this.keywords, this.contentUrl, this.nonPersonalizedAds, this.neighboringContentUrls, this.httpTimeoutMillis, this.mediationExtrasIdentifier, this.mediationNetworkExtrasProvider, this.adMobExtras, this.requestAgent, this.mediationExtras);
        }
    }

    protected FlutterAdRequest(List<String> list, String str, Boolean bool, List<String> list2, Integer num, String str2, MediationNetworkExtrasProvider mediationNetworkExtrasProvider2, Map<String, String> map, String str3, List<FlutterMediationExtras> list3) {
        this.keywords = list;
        this.contentUrl = str;
        this.nonPersonalizedAds = bool;
        this.neighboringContentUrls = list2;
        this.httpTimeoutMillis = num;
        this.mediationExtrasIdentifier = str2;
        this.mediationNetworkExtrasProvider = mediationNetworkExtrasProvider2;
        this.adMobExtras = map;
        this.requestAgent = str3;
        this.mediationExtras = list3;
    }

    private <T extends AbstractAdRequestBuilder<T>> void addNetworkExtras(AbstractAdRequestBuilder<T> abstractAdRequestBuilder, String str) {
        HashMap hashMap = new HashMap();
        List<FlutterMediationExtras> list = this.mediationExtras;
        if (list != null) {
            for (FlutterMediationExtras mediationExtras2 : list) {
                Pair<Class<? extends MediationExtrasReceiver>, Bundle> mediationExtras3 = mediationExtras2.getMediationExtras();
                hashMap.put((Class) mediationExtras3.first, (Bundle) mediationExtras3.second);
            }
        } else {
            MediationNetworkExtrasProvider mediationNetworkExtrasProvider2 = this.mediationNetworkExtrasProvider;
            if (mediationNetworkExtrasProvider2 != null) {
                hashMap.putAll(mediationNetworkExtrasProvider2.getMediationExtras(str, this.mediationExtrasIdentifier));
            }
        }
        Map<String, String> map = this.adMobExtras;
        if (map != null && !map.isEmpty()) {
            Bundle bundle = new Bundle();
            for (Map.Entry next : this.adMobExtras.entrySet()) {
                bundle.putString((String) next.getKey(), (String) next.getValue());
            }
            hashMap.put(AdMobAdapter.class, bundle);
        }
        Boolean bool = this.nonPersonalizedAds;
        if (bool != null && bool.booleanValue()) {
            Bundle bundle2 = (Bundle) hashMap.get(AdMobAdapter.class);
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putString("npa", "1");
            hashMap.put(AdMobAdapter.class, bundle2);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            abstractAdRequestBuilder.addNetworkExtrasBundle((Class) entry.getKey(), (Bundle) entry.getValue());
        }
    }

    /* access modifiers changed from: protected */
    public <T extends AbstractAdRequestBuilder<T>> AbstractAdRequestBuilder<T> updateAdRequestBuilder(AbstractAdRequestBuilder<T> abstractAdRequestBuilder, String str) {
        List<String> list = this.keywords;
        if (list != null) {
            for (String addKeyword : list) {
                abstractAdRequestBuilder.addKeyword(addKeyword);
            }
        }
        String str2 = this.contentUrl;
        if (str2 != null) {
            abstractAdRequestBuilder.setContentUrl(str2);
        }
        addNetworkExtras(abstractAdRequestBuilder, str);
        List<String> list2 = this.neighboringContentUrls;
        if (list2 != null) {
            abstractAdRequestBuilder.setNeighboringContentUrls(list2);
        }
        Integer num = this.httpTimeoutMillis;
        if (num != null) {
            abstractAdRequestBuilder.setHttpTimeoutMillis(num.intValue());
        }
        abstractAdRequestBuilder.setRequestAgent(this.requestAgent);
        return abstractAdRequestBuilder;
    }

    /* access modifiers changed from: package-private */
    public AdRequest asAdRequest(String str) {
        return ((AdRequest.Builder) updateAdRequestBuilder(new AdRequest.Builder(), str)).build();
    }

    /* access modifiers changed from: protected */
    public List<String> getKeywords() {
        return this.keywords;
    }

    /* access modifiers changed from: protected */
    public String getContentUrl() {
        return this.contentUrl;
    }

    /* access modifiers changed from: protected */
    public Boolean getNonPersonalizedAds() {
        return this.nonPersonalizedAds;
    }

    /* access modifiers changed from: protected */
    public List<String> getNeighboringContentUrls() {
        return this.neighboringContentUrls;
    }

    /* access modifiers changed from: protected */
    public Integer getHttpTimeoutMillis() {
        return this.httpTimeoutMillis;
    }

    /* access modifiers changed from: protected */
    public String getMediationExtrasIdentifier() {
        return this.mediationExtrasIdentifier;
    }

    /* access modifiers changed from: protected */
    public Map<String, String> getAdMobExtras() {
        return this.adMobExtras;
    }

    /* access modifiers changed from: protected */
    public String getRequestAgent() {
        return this.requestAgent;
    }

    /* access modifiers changed from: protected */
    public List<FlutterMediationExtras> getMediationExtras() {
        return this.mediationExtras;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlutterAdRequest)) {
            return false;
        }
        FlutterAdRequest flutterAdRequest = (FlutterAdRequest) obj;
        if (!Objects.equals(this.keywords, flutterAdRequest.keywords) || !Objects.equals(this.contentUrl, flutterAdRequest.contentUrl) || !Objects.equals(this.nonPersonalizedAds, flutterAdRequest.nonPersonalizedAds) || !Objects.equals(this.neighboringContentUrls, flutterAdRequest.neighboringContentUrls) || !Objects.equals(this.httpTimeoutMillis, flutterAdRequest.httpTimeoutMillis) || !Objects.equals(this.mediationExtrasIdentifier, flutterAdRequest.mediationExtrasIdentifier) || !Objects.equals(this.mediationNetworkExtrasProvider, flutterAdRequest.mediationNetworkExtrasProvider) || !Objects.equals(this.adMobExtras, flutterAdRequest.adMobExtras)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.keywords, this.contentUrl, this.nonPersonalizedAds, this.neighboringContentUrls, this.httpTimeoutMillis, this.mediationExtrasIdentifier, this.mediationNetworkExtrasProvider, this.mediationExtras});
    }
}
