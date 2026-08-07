package okio;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileTime;
import java.util.Map;
import kotlin.Metadata;
import kotlin.io.path.FileVisitorImpl$$ExternalSyntheticApiModelOutline0;
import kotlin.io.path.PathTreeWalk$$ExternalSyntheticApiModelOutline0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Path;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0004J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\u00020\u0012H\u0002¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"Lokio/NioSystemFileSystem;", "Lokio/JvmSystemFileSystem;", "()V", "atomicMove", "", "source", "Lokio/Path;", "target", "createSymlink", "metadataOrNull", "Lokio/FileMetadata;", "nioPath", "Ljava/nio/file/Path;", "path", "toString", "", "zeroToNull", "", "Ljava/nio/file/attribute/FileTime;", "(Ljava/nio/file/attribute/FileTime;)Ljava/lang/Long;", "okio"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: NioSystemFileSystem.kt */
public class NioSystemFileSystem extends JvmSystemFileSystem {
    public FileMetadata metadataOrNull(Path path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return metadataOrNull(path.toNioPath());
    }

    /* access modifiers changed from: protected */
    public final FileMetadata metadataOrNull(Path path) {
        Path path2 = path;
        Intrinsics.checkNotNullParameter(path2, "nioPath");
        Long l = null;
        try {
            BasicFileAttributes m = PathTreeWalk$$ExternalSyntheticApiModelOutline0.m(path2, PathTreeWalk$$ExternalSyntheticApiModelOutline0.m(), new LinkOption[]{FileVisitorImpl$$ExternalSyntheticApiModelOutline0.m()});
            Path m$1 = NioSystemFileSystem$$ExternalSyntheticApiModelOutline0.m(m) ? PathTreeWalk$$ExternalSyntheticApiModelOutline0.m$1(path) : null;
            boolean m$12 = NioSystemFileSystem$$ExternalSyntheticApiModelOutline0.m$1(m);
            boolean m2 = m.isDirectory();
            Path path3 = m$1 != null ? Path.Companion.get$default(Path.Companion, m$1, false, 1, (Object) null) : null;
            Long valueOf = Long.valueOf(NioSystemFileSystem$$ExternalSyntheticApiModelOutline0.m(m));
            FileTime m3 = NioSystemFileSystem$$ExternalSyntheticApiModelOutline0.m(m);
            Long zeroToNull = m3 != null ? zeroToNull(m3) : null;
            FileTime m$13 = NioSystemFileSystem$$ExternalSyntheticApiModelOutline0.m$1(m);
            Long zeroToNull2 = m$13 != null ? zeroToNull(m$13) : null;
            FileTime m$2 = m.lastAccessTime();
            if (m$2 != null) {
                l = zeroToNull(m$2);
            }
            return new FileMetadata(m$12, m2, path3, valueOf, zeroToNull, zeroToNull2, l, (Map) null, 128, (DefaultConstructorMarker) null);
        } catch (FileSystemException | NoSuchFileException unused) {
            return null;
        }
    }

    private final Long zeroToNull(FileTime fileTime) {
        Long valueOf = Long.valueOf(fileTime.toMillis());
        if (valueOf.longValue() != 0) {
            return valueOf;
        }
        return null;
    }

    public void atomicMove(Path path, Path path2) {
        Intrinsics.checkNotNullParameter(path, "source");
        Intrinsics.checkNotNullParameter(path2, TypedValues.AttributesType.S_TARGET);
        try {
            java.nio.file.Path unused = Files.move(path.toNioPath(), path2.toNioPath(), new CopyOption[]{NioSystemFileSystem$$ExternalSyntheticApiModelOutline0.m((Object) NioSystemFileSystem$$ExternalSyntheticApiModelOutline0.m()), NioSystemFileSystem$$ExternalSyntheticApiModelOutline0.m((Object) PathTreeWalk$$ExternalSyntheticApiModelOutline0.m())});
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        } catch (UnsupportedOperationException unused2) {
            throw new IOException("atomic move not supported");
        }
    }

    public void createSymlink(Path path, Path path2) {
        Intrinsics.checkNotNullParameter(path, "source");
        Intrinsics.checkNotNullParameter(path2, TypedValues.AttributesType.S_TARGET);
        java.nio.file.Path unused = Files.createSymbolicLink(path.toNioPath(), path2.toNioPath(), new FileAttribute[0]);
    }

    public String toString() {
        return "NioSystemFileSystem";
    }
}
