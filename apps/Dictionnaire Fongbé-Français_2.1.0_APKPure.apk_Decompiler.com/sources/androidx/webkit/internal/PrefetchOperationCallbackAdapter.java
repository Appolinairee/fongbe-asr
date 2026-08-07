package androidx.webkit.internal;

import androidx.webkit.OutcomeReceiverCompat;
import androidx.webkit.PrefetchException;
import androidx.webkit.PrefetchNetworkException;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.PrefetchOperationCallbackBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

public class PrefetchOperationCallbackAdapter {
    public static InvocationHandler buildInvocationHandler(final OutcomeReceiverCompat<Void, PrefetchException> outcomeReceiverCompat) {
        return BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new PrefetchOperationCallbackBoundaryInterface() {
            public void onSuccess() {
                OutcomeReceiverCompat.this.onResult(null);
            }

            public void onFailure(int i, String str, int i2) {
                if (i == 1) {
                    OutcomeReceiverCompat.this.onError(new PrefetchNetworkException(str, i2));
                } else {
                    OutcomeReceiverCompat.this.onError(new PrefetchException(str));
                }
            }
        });
    }
}
