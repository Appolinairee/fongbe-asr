package androidx.window.embedding;

import android.app.Activity;
import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007J\u001c\u0010\f\u001a\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0007J\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00122\u0006\u0010\u0015\u001a\u00020\u0016J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0010H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u001c"}, d2 = {"Landroidx/window/embedding/SplitController;", "", "embeddingBackend", "Landroidx/window/embedding/EmbeddingBackend;", "(Landroidx/window/embedding/EmbeddingBackend;)V", "splitSupportStatus", "Landroidx/window/embedding/SplitController$SplitSupportStatus;", "getSplitSupportStatus", "()Landroidx/window/embedding/SplitController$SplitSupportStatus;", "clearSplitAttributesCalculator", "", "invalidateTopVisibleSplitAttributes", "setSplitAttributesCalculator", "calculator", "Lkotlin/Function1;", "Landroidx/window/embedding/SplitAttributesCalculatorParams;", "Landroidx/window/embedding/SplitAttributes;", "splitInfoList", "Lkotlinx/coroutines/flow/Flow;", "", "Landroidx/window/embedding/SplitInfo;", "activity", "Landroid/app/Activity;", "updateSplitAttributes", "splitInfo", "splitAttributes", "Companion", "SplitSupportStatus", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: SplitController.kt */
public final class SplitController {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final boolean sDebug = false;
    /* access modifiers changed from: private */
    public final EmbeddingBackend embeddingBackend;

    @JvmStatic
    public static final SplitController getInstance(Context context) {
        return Companion.getInstance(context);
    }

    public SplitController(EmbeddingBackend embeddingBackend2) {
        Intrinsics.checkNotNullParameter(embeddingBackend2, "embeddingBackend");
        this.embeddingBackend = embeddingBackend2;
    }

    public final Flow<List<SplitInfo>> splitInfoList(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return FlowKt.callbackFlow(new SplitController$splitInfoList$1(this, activity, (Continuation<? super SplitController$splitInfoList$1>) null));
    }

    public final SplitSupportStatus getSplitSupportStatus() {
        return this.embeddingBackend.getSplitSupportStatus();
    }

    public final void setSplitAttributesCalculator(Function1<? super SplitAttributesCalculatorParams, SplitAttributes> function1) {
        Intrinsics.checkNotNullParameter(function1, "calculator");
        this.embeddingBackend.setSplitAttributesCalculator(function1);
    }

    public final void clearSplitAttributesCalculator() {
        this.embeddingBackend.clearSplitAttributesCalculator();
    }

    public final void invalidateTopVisibleSplitAttributes() {
        this.embeddingBackend.invalidateTopVisibleSplitAttributes();
    }

    public final void updateSplitAttributes(SplitInfo splitInfo, SplitAttributes splitAttributes) {
        Intrinsics.checkNotNullParameter(splitInfo, "splitInfo");
        Intrinsics.checkNotNullParameter(splitAttributes, "splitAttributes");
        this.embeddingBackend.updateSplitAttributes(splitInfo, splitAttributes);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Landroidx/window/embedding/SplitController$SplitSupportStatus;", "", "rawValue", "", "(I)V", "toString", "", "Companion", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: SplitController.kt */
    public static final class SplitSupportStatus {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        public static final SplitSupportStatus SPLIT_AVAILABLE = new SplitSupportStatus(0);
        public static final SplitSupportStatus SPLIT_ERROR_PROPERTY_NOT_DECLARED = new SplitSupportStatus(2);
        public static final SplitSupportStatus SPLIT_UNAVAILABLE = new SplitSupportStatus(1);
        private final int rawValue;

        private SplitSupportStatus(int i) {
            this.rawValue = i;
        }

        public String toString() {
            int i = this.rawValue;
            if (i == 0) {
                return "SplitSupportStatus: AVAILABLE";
            }
            if (i == 1) {
                return "SplitSupportStatus: UNAVAILABLE";
            }
            if (i != 2) {
                return "UNKNOWN";
            }
            return "SplitSupportStatus: ERROR_SPLIT_PROPERTY_NOT_DECLARED";
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/window/embedding/SplitController$SplitSupportStatus$Companion;", "", "()V", "SPLIT_AVAILABLE", "Landroidx/window/embedding/SplitController$SplitSupportStatus;", "SPLIT_ERROR_PROPERTY_NOT_DECLARED", "SPLIT_UNAVAILABLE", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* compiled from: SplitController.kt */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/window/embedding/SplitController$Companion;", "", "()V", "sDebug", "", "getInstance", "Landroidx/window/embedding/SplitController;", "context", "Landroid/content/Context;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: SplitController.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SplitController getInstance(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new SplitController(EmbeddingBackend.Companion.getInstance(context));
        }
    }
}
