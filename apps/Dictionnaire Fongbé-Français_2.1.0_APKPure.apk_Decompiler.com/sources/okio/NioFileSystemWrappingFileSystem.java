package okio;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.CopyOption;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.io.path.FileVisitorImpl$$ExternalSyntheticApiModelOutline0;
import kotlin.io.path.PathTreeWalk$$ExternalSyntheticApiModelOutline0;
import kotlin.io.path.PathsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.Path;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00172\u0006\u0010\u0012\u001a\u00020\bH\u0016J \u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\nH\u0002J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\bH\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020 2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010!\u001a\u00020\"H\u0016J\f\u0010#\u001a\u00020$*\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lokio/NioFileSystemWrappingFileSystem;", "Lokio/NioSystemFileSystem;", "nioFileSystem", "Ljava/nio/file/FileSystem;", "(Ljava/nio/file/FileSystem;)V", "appendingSink", "Lokio/Sink;", "file", "Lokio/Path;", "mustExist", "", "atomicMove", "", "source", "target", "canonicalize", "path", "createDirectory", "dir", "mustCreate", "createSymlink", "delete", "list", "", "throwOnFailure", "listOrNull", "metadataOrNull", "Lokio/FileMetadata;", "openReadOnly", "Lokio/FileHandle;", "openReadWrite", "sink", "Lokio/Source;", "toString", "", "resolve", "Ljava/nio/file/Path;", "okio"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: NioFileSystemWrappingFileSystem.kt */
public final class NioFileSystemWrappingFileSystem extends NioSystemFileSystem {
    private final FileSystem nioFileSystem;

    public NioFileSystemWrappingFileSystem(FileSystem fileSystem) {
        Intrinsics.checkNotNullParameter(fileSystem, "nioFileSystem");
        this.nioFileSystem = fileSystem;
    }

    private final Path resolve(Path path) {
        Path m = this.nioFileSystem.getPath(path.toString(), new String[0]);
        Intrinsics.checkNotNullExpressionValue(m, "nioFileSystem.getPath(toString())");
        return m;
    }

    public Path canonicalize(Path path) {
        Intrinsics.checkNotNullParameter(path, "path");
        try {
            Path.Companion companion = Path.Companion;
            java.nio.file.Path m = PathTreeWalk$$ExternalSyntheticApiModelOutline0.m(resolve(path), new LinkOption[0]);
            Intrinsics.checkNotNullExpressionValue(m, "path.resolve().toRealPath()");
            return Path.Companion.get$default(companion, m, false, 1, (Object) null);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    public FileMetadata metadataOrNull(Path path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return metadataOrNull(resolve(path));
    }

    public List<Path> list(Path path) {
        Intrinsics.checkNotNullParameter(path, "dir");
        List<Path> list = list(path, true);
        Intrinsics.checkNotNull(list);
        return list;
    }

    public List<Path> listOrNull(Path path) {
        Intrinsics.checkNotNullParameter(path, "dir");
        return list(path, false);
    }

    private final List<Path> list(Path path, boolean z) {
        java.nio.file.Path resolve = resolve(path);
        try {
            Iterable<Object> listDirectoryEntries$default = PathsKt.listDirectoryEntries$default(resolve, (String) null, 1, (Object) null);
            Collection arrayList = new ArrayList();
            for (Object m : listDirectoryEntries$default) {
                arrayList.add(path.resolve(FileVisitorImpl$$ExternalSyntheticApiModelOutline0.m(m).toString()));
            }
            List<Path> list = (List) arrayList;
            CollectionsKt.sort(list);
            return list;
        } catch (Exception unused) {
            if (!z) {
                return null;
            }
            if (!PathTreeWalk$$ExternalSyntheticApiModelOutline0.m(resolve, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                throw new FileNotFoundException("no such file: " + path);
            }
            throw new IOException("failed to list " + path);
        }
    }

    public FileHandle openReadOnly(Path path) {
        Intrinsics.checkNotNullParameter(path, "file");
        try {
            FileChannel m = FileChannel.open(resolve(path), new OpenOption[]{NioSystemFileSystem$$ExternalSyntheticApiModelOutline0.m((Object) NioSystemFileSystem$$ExternalSyntheticApiModelOutline0.m())});
            Intrinsics.checkNotNullExpressionValue(m, "channel");
            return new NioFileSystemFileHandle(false, m);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    public FileHandle openReadWrite(Path path, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(path, "file");
        if (!z || !z2) {
            List createListBuilder = CollectionsKt.createListBuilder();
            createListBuilder.add(NioSystemFileSystem$$ExternalSyntheticApiModelOutline0.m());
            createListBuilder.add(StandardOpenOption.WRITE);
            if (z) {
                createListBuilder.add(StandardOpenOption.CREATE_NEW);
            } else if (!z2) {
                createListBuilder.add(StandardOpenOption.CREATE);
            }
            List build = CollectionsKt.build(createListBuilder);
            try {
                java.nio.file.Path resolve = resolve(path);
                StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) build.toArray(new StandardOpenOption[0]);
                FileChannel m = FileChannel.open(resolve, (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length));
                Intrinsics.checkNotNullExpressionValue(m, "channel");
                return new NioFileSystemFileHandle(true, m);
            } catch (NoSuchFileException unused) {
                throw new FileNotFoundException("no such file: " + path);
            }
        } else {
            throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.".toString());
        }
    }

    public Source source(Path path) {
        Intrinsics.checkNotNullParameter(path, "file");
        try {
            InputStream m = PathTreeWalk$$ExternalSyntheticApiModelOutline0.m(resolve(path), (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0));
            Intrinsics.checkNotNullExpressionValue(m, "newInputStream(this, *options)");
            return Okio.source(m);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    public Sink sink(Path path, boolean z) {
        Intrinsics.checkNotNullParameter(path, "file");
        List createListBuilder = CollectionsKt.createListBuilder();
        if (z) {
            createListBuilder.add(StandardOpenOption.CREATE_NEW);
        }
        List build = CollectionsKt.build(createListBuilder);
        try {
            java.nio.file.Path resolve = resolve(path);
            StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) build.toArray(new StandardOpenOption[0]);
            OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
            OutputStream m = PathTreeWalk$$ExternalSyntheticApiModelOutline0.m(resolve, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
            Intrinsics.checkNotNullExpressionValue(m, "newOutputStream(this, *options)");
            return Okio.sink(m);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    public Sink appendingSink(Path path, boolean z) {
        Intrinsics.checkNotNullParameter(path, "file");
        List createListBuilder = CollectionsKt.createListBuilder();
        createListBuilder.add(PathTreeWalk$$ExternalSyntheticApiModelOutline0.m());
        if (!z) {
            createListBuilder.add(StandardOpenOption.CREATE);
        }
        List build = CollectionsKt.build(createListBuilder);
        java.nio.file.Path resolve = resolve(path);
        StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) build.toArray(new StandardOpenOption[0]);
        OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
        OutputStream m = PathTreeWalk$$ExternalSyntheticApiModelOutline0.m(resolve, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(m, "newOutputStream(this, *options)");
        return Okio.sink(m);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r0.isDirectory() == true) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void createDirectory(okio.Path r4, boolean r5) {
        /*
            r3 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            okio.FileMetadata r0 = r3.metadataOrNull(r4)
            r1 = 0
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isDirectory()
            r2 = 1
            if (r0 != r2) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r2 = 0
        L_0x0015:
            if (r2 == 0) goto L_0x0031
            if (r5 != 0) goto L_0x001a
            goto L_0x0031
        L_0x001a:
            java.io.IOException r5 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = " already exist."
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
        L_0x0031:
            java.nio.file.Path r5 = r3.resolve(r4)     // Catch:{ IOException -> 0x0047 }
            java.nio.file.attribute.FileAttribute[] r0 = new java.nio.file.attribute.FileAttribute[r1]     // Catch:{ IOException -> 0x0047 }
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch:{ IOException -> 0x0047 }
            java.nio.file.attribute.FileAttribute[] r0 = (java.nio.file.attribute.FileAttribute[]) r0     // Catch:{ IOException -> 0x0047 }
            java.nio.file.Path r5 = java.nio.file.Files.createDirectory(r5, r0)     // Catch:{ IOException -> 0x0047 }
            java.lang.String r0 = "createDirectory(this, *attributes)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)     // Catch:{ IOException -> 0x0047 }
            return
        L_0x0047:
            r5 = move-exception
            if (r2 == 0) goto L_0x004b
            return
        L_0x004b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "failed to create directory: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            r0.<init>(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.NioFileSystemWrappingFileSystem.createDirectory(okio.Path, boolean):void");
    }

    public void atomicMove(Path path, Path path2) {
        Intrinsics.checkNotNullParameter(path, "source");
        Intrinsics.checkNotNullParameter(path2, TypedValues.AttributesType.S_TARGET);
        try {
            Intrinsics.checkNotNullExpressionValue(Files.move(resolve(path), resolve(path2), (CopyOption[]) Arrays.copyOf(new CopyOption[]{NioSystemFileSystem$$ExternalSyntheticApiModelOutline0.m((Object) NioSystemFileSystem$$ExternalSyntheticApiModelOutline0.m()), NioSystemFileSystem$$ExternalSyntheticApiModelOutline0.m((Object) PathTreeWalk$$ExternalSyntheticApiModelOutline0.m())}, 2)), "move(this, target, *options)");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        }
    }

    public void delete(Path path, boolean z) {
        Intrinsics.checkNotNullParameter(path, "path");
        if (!Thread.interrupted()) {
            java.nio.file.Path resolve = resolve(path);
            try {
                PathTreeWalk$$ExternalSyntheticApiModelOutline0.m(resolve);
            } catch (NoSuchFileException unused) {
                if (z) {
                    throw new FileNotFoundException("no such file: " + path);
                }
            } catch (IOException unused2) {
                if (PathTreeWalk$$ExternalSyntheticApiModelOutline0.m(resolve, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                    throw new IOException("failed to delete " + path);
                }
            }
        } else {
            throw new InterruptedIOException("interrupted");
        }
    }

    public void createSymlink(Path path, Path path2) {
        Intrinsics.checkNotNullParameter(path, "source");
        Intrinsics.checkNotNullParameter(path2, TypedValues.AttributesType.S_TARGET);
        Intrinsics.checkNotNullExpressionValue(Files.createSymbolicLink(resolve(path), resolve(path2), (FileAttribute[]) Arrays.copyOf(new FileAttribute[0], 0)), "createSymbolicLink(this, target, *attributes)");
    }

    public String toString() {
        String simpleName = Reflection.getOrCreateKotlinClass(this.nioFileSystem.getClass()).getSimpleName();
        Intrinsics.checkNotNull(simpleName);
        return simpleName;
    }
}
