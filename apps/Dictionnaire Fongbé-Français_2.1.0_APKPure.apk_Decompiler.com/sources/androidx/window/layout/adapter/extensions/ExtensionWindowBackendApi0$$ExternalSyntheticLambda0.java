package androidx.window.layout.adapter.extensions;

import androidx.core.util.Consumer;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class ExtensionWindowBackendApi0$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ Consumer f$0;

    public /* synthetic */ ExtensionWindowBackendApi0$$ExternalSyntheticLambda0(Consumer consumer) {
        this.f$0 = consumer;
    }

    public final void run() {
        ExtensionWindowBackendApi0.registerLayoutChangeCallback$lambda$0(this.f$0);
    }
}
