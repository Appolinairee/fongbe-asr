package io.flutter.plugins.webviewflutter;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "it", "Lkotlin/Result;", "invoke", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: ResultCompat.kt */
final class ResultCompat$Companion$asCompatCallback$1 extends Lambda implements Function1<Result<? extends T>, Unit> {
    final /* synthetic */ Function1<ResultCompat<T>, Unit> $result;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ResultCompat$Companion$asCompatCallback$1(Function1<? super ResultCompat<T>, Unit> function1) {
        super(1);
        this.$result = function1;
    }

    public final void invoke(Object obj) {
        this.$result.invoke(new ResultCompat(obj));
    }
}
