package androidx.window.area;

import androidx.window.area.WindowAreaControllerImpl;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class WindowAreaControllerImpl$RearDisplayPresentationSessionConsumer$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ WindowAreaControllerImpl.RearDisplayPresentationSessionConsumer f$2;

    public /* synthetic */ WindowAreaControllerImpl$RearDisplayPresentationSessionConsumer$$ExternalSyntheticLambda0(int i, int i2, WindowAreaControllerImpl.RearDisplayPresentationSessionConsumer rearDisplayPresentationSessionConsumer) {
        this.f$0 = i;
        this.f$1 = i2;
        this.f$2 = rearDisplayPresentationSessionConsumer;
    }

    public final void run() {
        WindowAreaControllerImpl.RearDisplayPresentationSessionConsumer.accept$lambda$0(this.f$0, this.f$1, this.f$2);
    }
}
