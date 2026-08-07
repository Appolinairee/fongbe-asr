package io.flutter.plugins.webviewflutter;

import io.flutter.plugin.common.BasicMessageChannel;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "result", "Lkotlin/Result;", "", "invoke", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: AndroidWebkitLibrary.g.kt */
final class PigeonApiCookieManager$Companion$setUpMessageHandlers$3$1$1 extends Lambda implements Function1<Result<? extends Boolean>, Unit> {
    final /* synthetic */ BasicMessageChannel.Reply<Object> $reply;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PigeonApiCookieManager$Companion$setUpMessageHandlers$3$1$1(BasicMessageChannel.Reply<Object> reply) {
        super(1);
        this.$reply = reply;
    }

    public final void invoke(Object obj) {
        Throwable r0 = Result.m514exceptionOrNullimpl(obj);
        if (r0 != null) {
            this.$reply.reply(AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapError(r0));
            return;
        }
        if (Result.m517isFailureimpl(obj)) {
            obj = null;
        }
        this.$reply.reply(AndroidWebkitLibraryPigeonUtils.INSTANCE.wrapResult((Boolean) obj));
    }
}
