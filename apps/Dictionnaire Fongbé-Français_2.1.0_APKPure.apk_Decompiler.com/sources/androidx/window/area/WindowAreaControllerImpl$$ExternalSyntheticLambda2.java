package androidx.window.area;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class WindowAreaControllerImpl$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ WindowAreaSessionCallback f$0;

    public /* synthetic */ WindowAreaControllerImpl$$ExternalSyntheticLambda2(WindowAreaSessionCallback windowAreaSessionCallback) {
        this.f$0 = windowAreaSessionCallback;
    }

    public final void run() {
        WindowAreaControllerImpl.transferActivityToWindowArea$lambda$1(this.f$0);
    }
}
