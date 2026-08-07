package androidx.window.embedding;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.os.IBinder;
import android.util.Log;
import androidx.window.WindowSdkExtensions;
import androidx.window.core.BuildConfig;
import androidx.window.core.ConsumerAdapter;
import androidx.window.core.ExtensionsUtil;
import androidx.window.core.VerificationMode;
import androidx.window.embedding.EmbeddingInterfaceCompat;
import androidx.window.embedding.SplitController;
import androidx.window.extensions.WindowExtensions;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import androidx.window.extensions.embedding.SplitInfo;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001'B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0017J\b\u0010\r\u001a\u00020\fH\u0017J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0017J\u0016\u0010\u001a\u001a\u00020\f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016J\u001c\u0010\u001e\u001a\u00020\f2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 H\u0017J\u0018\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\"H\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Landroidx/window/embedding/EmbeddingCompat;", "Landroidx/window/embedding/EmbeddingInterfaceCompat;", "embeddingExtension", "Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;", "adapter", "Landroidx/window/embedding/EmbeddingAdapter;", "consumerAdapter", "Landroidx/window/core/ConsumerAdapter;", "applicationContext", "Landroid/content/Context;", "(Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;Landroidx/window/embedding/EmbeddingAdapter;Landroidx/window/core/ConsumerAdapter;Landroid/content/Context;)V", "clearSplitAttributesCalculator", "", "invalidateTopVisibleSplitAttributes", "isActivityEmbedded", "", "activity", "Landroid/app/Activity;", "setEmbeddingCallback", "embeddingCallback", "Landroidx/window/embedding/EmbeddingInterfaceCompat$EmbeddingCallbackInterface;", "setLaunchingActivityStack", "Landroid/app/ActivityOptions;", "options", "token", "Landroid/os/IBinder;", "setRules", "rules", "", "Landroidx/window/embedding/EmbeddingRule;", "setSplitAttributesCalculator", "calculator", "Lkotlin/Function1;", "Landroidx/window/embedding/SplitAttributesCalculatorParams;", "Landroidx/window/embedding/SplitAttributes;", "updateSplitAttributes", "splitInfo", "Landroidx/window/embedding/SplitInfo;", "splitAttributes", "Companion", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: EmbeddingCompat.kt */
public final class EmbeddingCompat implements EmbeddingInterfaceCompat {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final boolean DEBUG = true;
    private static final String TAG = "EmbeddingCompat";
    /* access modifiers changed from: private */
    public final EmbeddingAdapter adapter;
    private final Context applicationContext;
    private final ConsumerAdapter consumerAdapter;
    private final ActivityEmbeddingComponent embeddingExtension;

    public EmbeddingCompat(ActivityEmbeddingComponent activityEmbeddingComponent, EmbeddingAdapter embeddingAdapter, ConsumerAdapter consumerAdapter2, Context context) {
        Intrinsics.checkNotNullParameter(activityEmbeddingComponent, "embeddingExtension");
        Intrinsics.checkNotNullParameter(embeddingAdapter, "adapter");
        Intrinsics.checkNotNullParameter(consumerAdapter2, "consumerAdapter");
        Intrinsics.checkNotNullParameter(context, "applicationContext");
        this.embeddingExtension = activityEmbeddingComponent;
        this.adapter = embeddingAdapter;
        this.consumerAdapter = consumerAdapter2;
        this.applicationContext = context;
    }

    public void setRules(Set<? extends EmbeddingRule> set) {
        Intrinsics.checkNotNullParameter(set, "rules");
        Iterator<? extends EmbeddingRule> it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((EmbeddingRule) it.next()) instanceof SplitRule) {
                if (!Intrinsics.areEqual((Object) SplitController.Companion.getInstance(this.applicationContext).getSplitSupportStatus(), (Object) SplitController.SplitSupportStatus.SPLIT_AVAILABLE)) {
                    if (BuildConfig.INSTANCE.getVerificationMode() == VerificationMode.LOG) {
                        Log.w(TAG, "Cannot set SplitRule because ActivityEmbedding Split is not supported or PROPERTY_ACTIVITY_EMBEDDING_SPLITS_ENABLED is not set.");
                        return;
                    }
                    return;
                }
            }
        }
        this.embeddingExtension.setEmbeddingRules(this.adapter.translate(this.applicationContext, set));
    }

    public void setEmbeddingCallback(EmbeddingInterfaceCompat.EmbeddingCallbackInterface embeddingCallbackInterface) {
        Intrinsics.checkNotNullParameter(embeddingCallbackInterface, "embeddingCallback");
        if (ExtensionsUtil.INSTANCE.getSafeVendorApiLevel() < 2) {
            this.consumerAdapter.addConsumer(this.embeddingExtension, Reflection.getOrCreateKotlinClass(List.class), "setSplitInfoCallback", new EmbeddingCompat$setEmbeddingCallback$1(embeddingCallbackInterface, this));
            return;
        }
        this.embeddingExtension.setSplitInfoCallback(new EmbeddingCompat$$ExternalSyntheticLambda0(embeddingCallbackInterface, this));
    }

    /* access modifiers changed from: private */
    public static final void setEmbeddingCallback$lambda$0(EmbeddingInterfaceCompat.EmbeddingCallbackInterface embeddingCallbackInterface, EmbeddingCompat embeddingCompat, List list) {
        Intrinsics.checkNotNullParameter(embeddingCallbackInterface, "$embeddingCallback");
        Intrinsics.checkNotNullParameter(embeddingCompat, "this$0");
        EmbeddingAdapter embeddingAdapter = embeddingCompat.adapter;
        Intrinsics.checkNotNullExpressionValue(list, "splitInfoList");
        embeddingCallbackInterface.onSplitInfoChanged(embeddingAdapter.translate((List<? extends SplitInfo>) list));
    }

    public boolean isActivityEmbedded(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return this.embeddingExtension.isActivityEmbedded(activity);
    }

    public void setSplitAttributesCalculator(Function1<? super SplitAttributesCalculatorParams, SplitAttributes> function1) {
        Intrinsics.checkNotNullParameter(function1, "calculator");
        WindowSdkExtensions.Companion.getInstance().requireExtensionVersion$window_release(2);
        this.embeddingExtension.setSplitAttributesCalculator(this.adapter.translateSplitAttributesCalculator(function1));
    }

    public void clearSplitAttributesCalculator() {
        WindowSdkExtensions.Companion.getInstance().requireExtensionVersion$window_release(2);
        this.embeddingExtension.clearSplitAttributesCalculator();
    }

    public void invalidateTopVisibleSplitAttributes() {
        WindowSdkExtensions.Companion.getInstance().requireExtensionVersion$window_release(3);
        this.embeddingExtension.invalidateTopVisibleSplitAttributes();
    }

    public void updateSplitAttributes(SplitInfo splitInfo, SplitAttributes splitAttributes) {
        Intrinsics.checkNotNullParameter(splitInfo, "splitInfo");
        Intrinsics.checkNotNullParameter(splitAttributes, "splitAttributes");
        WindowSdkExtensions.Companion.getInstance().requireExtensionVersion$window_release(3);
        this.embeddingExtension.updateSplitAttributes(splitInfo.getToken$window_release(), this.adapter.translateSplitAttributes(splitAttributes));
    }

    public ActivityOptions setLaunchingActivityStack(ActivityOptions activityOptions, IBinder iBinder) {
        Intrinsics.checkNotNullParameter(activityOptions, "options");
        Intrinsics.checkNotNullParameter(iBinder, "token");
        WindowSdkExtensions.Companion.getInstance().requireExtensionVersion$window_release(3);
        ActivityOptions launchingActivityStack = this.embeddingExtension.setLaunchingActivityStack(activityOptions, iBinder);
        Intrinsics.checkNotNullExpressionValue(launchingActivityStack, "embeddingExtension.setLa…vityStack(options, token)");
        return launchingActivityStack;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\t\u001a\u00020\bH\u0002J\u0006\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Landroidx/window/embedding/EmbeddingCompat$Companion;", "", "()V", "DEBUG", "", "TAG", "", "embeddingComponent", "Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;", "emptyActivityEmbeddingProxy", "isEmbeddingAvailable", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: EmbeddingCompat.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean isEmbeddingAvailable() {
            try {
                ClassLoader classLoader = EmbeddingCompat.class.getClassLoader();
                if (classLoader == null) {
                    return false;
                }
                ConsumerAdapter consumerAdapter = new ConsumerAdapter(classLoader);
                WindowExtensions windowExtensions = WindowExtensionsProvider.getWindowExtensions();
                Intrinsics.checkNotNullExpressionValue(windowExtensions, "getWindowExtensions()");
                if (new SafeActivityEmbeddingComponentProvider(classLoader, consumerAdapter, windowExtensions).getActivityEmbeddingComponent() != null) {
                    return true;
                }
                return false;
            } catch (NoClassDefFoundError unused) {
                Log.d(EmbeddingCompat.TAG, "Embedding extension version not found");
                return false;
            } catch (UnsupportedOperationException unused2) {
                Log.d(EmbeddingCompat.TAG, "Stub Extension");
                return false;
            }
        }

        public final ActivityEmbeddingComponent embeddingComponent() {
            if (!isEmbeddingAvailable()) {
                return emptyActivityEmbeddingProxy();
            }
            ClassLoader classLoader = EmbeddingCompat.class.getClassLoader();
            if (classLoader != null) {
                ConsumerAdapter consumerAdapter = new ConsumerAdapter(classLoader);
                WindowExtensions windowExtensions = WindowExtensionsProvider.getWindowExtensions();
                Intrinsics.checkNotNullExpressionValue(windowExtensions, "getWindowExtensions()");
                ActivityEmbeddingComponent activityEmbeddingComponent = new SafeActivityEmbeddingComponentProvider(classLoader, consumerAdapter, windowExtensions).getActivityEmbeddingComponent();
                if (activityEmbeddingComponent != null) {
                    return activityEmbeddingComponent;
                }
            }
            return emptyActivityEmbeddingProxy();
        }

        private final ActivityEmbeddingComponent emptyActivityEmbeddingProxy() {
            Object newProxyInstance = Proxy.newProxyInstance(EmbeddingCompat.class.getClassLoader(), new Class[]{ActivityEmbeddingComponent.class}, new EmbeddingCompat$Companion$$ExternalSyntheticLambda0());
            Intrinsics.checkNotNull(newProxyInstance, "null cannot be cast to non-null type androidx.window.extensions.embedding.ActivityEmbeddingComponent");
            return (ActivityEmbeddingComponent) newProxyInstance;
        }

        /* access modifiers changed from: private */
        public static final Unit emptyActivityEmbeddingProxy$lambda$2(Object obj, Method method, Object[] objArr) {
            return Unit.INSTANCE;
        }
    }
}
