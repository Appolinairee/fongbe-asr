package com.getkeepsafe.relinker;

import android.content.Context;
import com.getkeepsafe.relinker.ReLinker;
import java.io.File;
import java.io.FilenameFilter;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class ReLinkerInstance {
    private static final String LIB_DIR = "lib";
    protected boolean force;
    protected final ReLinker.LibraryInstaller libraryInstaller;
    protected final ReLinker.LibraryLoader libraryLoader;
    protected final Set<String> loadedLibraries;
    protected ReLinker.Logger logger;
    protected boolean recursive;

    protected ReLinkerInstance() {
        this(new SystemLibraryLoader(), new ApkLibraryInstaller());
    }

    protected ReLinkerInstance(ReLinker.LibraryLoader libraryLoader2, ReLinker.LibraryInstaller libraryInstaller2) {
        this.loadedLibraries = new HashSet();
        if (libraryLoader2 == null) {
            throw new IllegalArgumentException("Cannot pass null library loader");
        } else if (libraryInstaller2 != null) {
            this.libraryLoader = libraryLoader2;
            this.libraryInstaller = libraryInstaller2;
        } else {
            throw new IllegalArgumentException("Cannot pass null library installer");
        }
    }

    public ReLinkerInstance log(ReLinker.Logger logger2) {
        this.logger = logger2;
        return this;
    }

    public ReLinkerInstance force() {
        this.force = true;
        return this;
    }

    public ReLinkerInstance recursively() {
        this.recursive = true;
        return this;
    }

    public void loadLibrary(Context context, String str) {
        loadLibrary(context, str, (String) null, (ReLinker.LoadListener) null);
    }

    public void loadLibrary(Context context, String str, String str2) {
        loadLibrary(context, str, str2, (ReLinker.LoadListener) null);
    }

    public void loadLibrary(Context context, String str, ReLinker.LoadListener loadListener) {
        loadLibrary(context, str, (String) null, loadListener);
    }

    public void loadLibrary(Context context, String str, String str2, ReLinker.LoadListener loadListener) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        } else if (!TextUtils.isEmpty(str)) {
            log("Beginning load of %s...", str);
            if (loadListener == null) {
                loadLibraryInternal(context, str, str2);
                return;
            }
            final Context context2 = context;
            final String str3 = str;
            final String str4 = str2;
            final ReLinker.LoadListener loadListener2 = loadListener;
            new Thread(new Runnable() {
                public void run() {
                    try {
                        ReLinkerInstance.this.loadLibraryInternal(context2, str3, str4);
                        loadListener2.success();
                    } catch (UnsatisfiedLinkError e) {
                        loadListener2.failure(e);
                    } catch (MissingLibraryException e2) {
                        loadListener2.failure(e2);
                    }
                }
            }).start();
        } else {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ad A[Catch:{ IOException -> 0x00b1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void loadLibraryInternal(android.content.Context r12, java.lang.String r13, java.lang.String r14) {
        /*
            r11 = this;
            java.util.Set<java.lang.String> r0 = r11.loadedLibraries
            boolean r0 = r0.contains(r13)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0018
            boolean r0 = r11.force
            if (r0 != 0) goto L_0x0018
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r1] = r13
            java.lang.String r13 = "%s already loaded previously!"
            r11.log(r13, r12)
            return
        L_0x0018:
            r0 = 2
            com.getkeepsafe.relinker.ReLinker$LibraryLoader r3 = r11.libraryLoader     // Catch:{ UnsatisfiedLinkError -> 0x002f }
            r3.loadLibrary(r13)     // Catch:{ UnsatisfiedLinkError -> 0x002f }
            java.util.Set<java.lang.String> r3 = r11.loadedLibraries     // Catch:{ UnsatisfiedLinkError -> 0x002f }
            r3.add(r13)     // Catch:{ UnsatisfiedLinkError -> 0x002f }
            java.lang.String r3 = "%s (%s) was loaded normally!"
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ UnsatisfiedLinkError -> 0x002f }
            r4[r1] = r13     // Catch:{ UnsatisfiedLinkError -> 0x002f }
            r4[r2] = r14     // Catch:{ UnsatisfiedLinkError -> 0x002f }
            r11.log(r3, r4)     // Catch:{ UnsatisfiedLinkError -> 0x002f }
            return
        L_0x002f:
            r3 = move-exception
            java.lang.String r3 = android.util.Log.getStackTraceString(r3)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r1] = r3
            java.lang.String r3 = "Loading the library normally failed: %s"
            r11.log(r3, r4)
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r3[r1] = r13
            r3[r2] = r14
            java.lang.String r4 = "%s (%s) was not loaded normally, re-linking..."
            r11.log(r4, r3)
            java.io.File r3 = r11.getWorkaroundLibFile(r12, r13, r14)
            boolean r4 = r3.exists()
            if (r4 == 0) goto L_0x0056
            boolean r4 = r11.force
            if (r4 == 0) goto L_0x007c
        L_0x0056:
            boolean r4 = r11.force
            if (r4 == 0) goto L_0x0065
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r4[r1] = r13
            r4[r2] = r14
            java.lang.String r5 = "Forcing a re-link of %s (%s)..."
            r11.log(r5, r4)
        L_0x0065:
            r11.cleanupOldLibFiles(r12, r13, r14)
            com.getkeepsafe.relinker.ReLinker$LibraryInstaller r5 = r11.libraryInstaller
            com.getkeepsafe.relinker.ReLinker$LibraryLoader r4 = r11.libraryLoader
            java.lang.String[] r7 = r4.supportedAbis()
            com.getkeepsafe.relinker.ReLinker$LibraryLoader r4 = r11.libraryLoader
            java.lang.String r8 = r4.mapLibraryName(r13)
            r6 = r12
            r9 = r3
            r10 = r11
            r5.installLibrary(r6, r7, r8, r9, r10)
        L_0x007c:
            boolean r4 = r11.recursive     // Catch:{ IOException -> 0x00b1 }
            if (r4 == 0) goto L_0x00b1
            r4 = 0
            com.getkeepsafe.relinker.elf.ElfParser r5 = new com.getkeepsafe.relinker.elf.ElfParser     // Catch:{ all -> 0x00aa }
            r5.<init>(r3)     // Catch:{ all -> 0x00aa }
            java.util.List r4 = r5.parseNeededDependencies()     // Catch:{ all -> 0x00a7 }
            r5.close()     // Catch:{ IOException -> 0x00b1 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x00b1 }
        L_0x0091:
            boolean r5 = r4.hasNext()     // Catch:{ IOException -> 0x00b1 }
            if (r5 == 0) goto L_0x00b1
            java.lang.Object r5 = r4.next()     // Catch:{ IOException -> 0x00b1 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x00b1 }
            com.getkeepsafe.relinker.ReLinker$LibraryLoader r6 = r11.libraryLoader     // Catch:{ IOException -> 0x00b1 }
            java.lang.String r5 = r6.unmapLibraryName(r5)     // Catch:{ IOException -> 0x00b1 }
            r11.loadLibrary(r12, r5)     // Catch:{ IOException -> 0x00b1 }
            goto L_0x0091
        L_0x00a7:
            r12 = move-exception
            r4 = r5
            goto L_0x00ab
        L_0x00aa:
            r12 = move-exception
        L_0x00ab:
            if (r4 == 0) goto L_0x00b0
            r4.close()     // Catch:{ IOException -> 0x00b1 }
        L_0x00b0:
            throw r12     // Catch:{ IOException -> 0x00b1 }
        L_0x00b1:
            com.getkeepsafe.relinker.ReLinker$LibraryLoader r12 = r11.libraryLoader
            java.lang.String r3 = r3.getAbsolutePath()
            r12.loadPath(r3)
            java.util.Set<java.lang.String> r12 = r11.loadedLibraries
            r12.add(r13)
            java.lang.Object[] r12 = new java.lang.Object[r0]
            r12[r1] = r13
            r12[r2] = r14
            java.lang.String r13 = "%s (%s) was re-linked!"
            r11.log(r13, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getkeepsafe.relinker.ReLinkerInstance.loadLibraryInternal(android.content.Context, java.lang.String, java.lang.String):void");
    }

    /* access modifiers changed from: protected */
    public File getWorkaroundLibDir(Context context) {
        return context.getDir(LIB_DIR, 0);
    }

    /* access modifiers changed from: protected */
    public File getWorkaroundLibFile(Context context, String str, String str2) {
        String mapLibraryName = this.libraryLoader.mapLibraryName(str);
        if (TextUtils.isEmpty(str2)) {
            return new File(getWorkaroundLibDir(context), mapLibraryName);
        }
        File workaroundLibDir = getWorkaroundLibDir(context);
        return new File(workaroundLibDir, mapLibraryName + "." + str2);
    }

    /* access modifiers changed from: protected */
    public void cleanupOldLibFiles(Context context, String str, String str2) {
        File workaroundLibDir = getWorkaroundLibDir(context);
        File workaroundLibFile = getWorkaroundLibFile(context, str, str2);
        final String mapLibraryName = this.libraryLoader.mapLibraryName(str);
        File[] listFiles = workaroundLibDir.listFiles(new FilenameFilter() {
            public boolean accept(File file, String str) {
                return str.startsWith(mapLibraryName);
            }
        });
        if (listFiles != null) {
            for (File file : listFiles) {
                if (this.force || !file.getAbsolutePath().equals(workaroundLibFile.getAbsolutePath())) {
                    file.delete();
                }
            }
        }
    }

    public void log(String str, Object... objArr) {
        log(String.format(Locale.US, str, objArr));
    }

    public void log(String str) {
        ReLinker.Logger logger2 = this.logger;
        if (logger2 != null) {
            logger2.log(str);
        }
    }
}
