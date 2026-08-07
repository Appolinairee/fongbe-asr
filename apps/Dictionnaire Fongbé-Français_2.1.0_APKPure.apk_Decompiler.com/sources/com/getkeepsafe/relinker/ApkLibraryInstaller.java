package com.getkeepsafe.relinker;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.getkeepsafe.relinker.ReLinker;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ApkLibraryInstaller implements ReLinker.LibraryInstaller {
    private static final int COPY_BUFFER_SIZE = 4096;
    private static final int MAX_TRIES = 5;

    private String[] sourceDirectories(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo.splitSourceDirs == null || applicationInfo.splitSourceDirs.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr = new String[(applicationInfo.splitSourceDirs.length + 1)];
        strArr[0] = applicationInfo.sourceDir;
        System.arraycopy(applicationInfo.splitSourceDirs, 0, strArr, 1, applicationInfo.splitSourceDirs.length);
        return strArr;
    }

    private static class ZipFileInZipEntry {
        public ZipEntry zipEntry;
        public ZipFile zipFile;

        public ZipFileInZipEntry(ZipFile zipFile2, ZipEntry zipEntry2) {
            this.zipFile = zipFile2;
            this.zipEntry = zipEntry2;
        }
    }

    private ZipFileInZipEntry findAPKWithLibrary(Context context, String[] strArr, String str, ReLinkerInstance reLinkerInstance) {
        String[] strArr2 = strArr;
        String[] sourceDirectories = sourceDirectories(context);
        int length = sourceDirectories.length;
        char c = 0;
        int i = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i >= length) {
                return null;
            }
            String str2 = sourceDirectories[i];
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i2 = i3;
                }
            }
            if (zipFile == null) {
                String str3 = str;
                ReLinkerInstance reLinkerInstance2 = reLinkerInstance;
            } else {
                int i4 = 0;
                while (true) {
                    int i5 = i4 + 1;
                    if (i4 < 5) {
                        int length2 = strArr2.length;
                        int i6 = 0;
                        while (i6 < length2) {
                            String str4 = "lib" + File.separatorChar + strArr2[i6] + File.separatorChar + str;
                            Object[] objArr = new Object[2];
                            objArr[c] = str4;
                            objArr[1] = str2;
                            reLinkerInstance.log("Looking for %s in APK %s...", objArr);
                            ZipEntry entry = zipFile.getEntry(str4);
                            if (entry != null) {
                                return new ZipFileInZipEntry(zipFile, entry);
                            }
                            i6++;
                            c = 0;
                        }
                        String str5 = str;
                        ReLinkerInstance reLinkerInstance3 = reLinkerInstance;
                        i4 = i5;
                        c = 0;
                    } else {
                        String str6 = str;
                        ReLinkerInstance reLinkerInstance4 = reLinkerInstance;
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i++;
            c = 0;
        }
    }

    private String[] getSupportedABIs(Context context, String str) {
        Pattern compile = Pattern.compile("lib" + File.separatorChar + "([^\\" + File.separatorChar + "]*)" + File.separatorChar + str);
        HashSet hashSet = new HashSet();
        for (String file : sourceDirectories(context)) {
            try {
                Enumeration<? extends ZipEntry> entries = new ZipFile(new File(file), 1).entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(((ZipEntry) entries.nextElement()).getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.getkeepsafe.relinker.ApkLibraryInstaller$ZipFileInZipEntry} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00b6 A[SYNTHETIC, Splitter:B:74:0x00b6] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void installLibrary(android.content.Context r11, java.lang.String[] r12, java.lang.String r13, java.io.File r14, com.getkeepsafe.relinker.ReLinkerInstance r15) {
        /*
            r10 = this;
            r0 = 0
            com.getkeepsafe.relinker.ApkLibraryInstaller$ZipFileInZipEntry r1 = r10.findAPKWithLibrary(r11, r12, r13, r15)     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x009c
            r11 = 0
            r12 = 0
        L_0x0009:
            int r2 = r12 + 1
            r3 = 5
            if (r12 >= r3) goto L_0x008b
            java.lang.String r12 = "Found %s! Extracting..."
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x00a1 }
            r4[r11] = r13     // Catch:{ all -> 0x00a1 }
            r15.log(r12, r4)     // Catch:{ all -> 0x00a1 }
            boolean r12 = r14.exists()     // Catch:{ IOException -> 0x0087 }
            if (r12 != 0) goto L_0x0026
            boolean r12 = r14.createNewFile()     // Catch:{ IOException -> 0x0087 }
            if (r12 != 0) goto L_0x0026
            goto L_0x0088
        L_0x0026:
            java.util.zip.ZipFile r12 = r1.zipFile     // Catch:{ FileNotFoundException -> 0x0081, IOException -> 0x007b, all -> 0x0072 }
            java.util.zip.ZipEntry r4 = r1.zipEntry     // Catch:{ FileNotFoundException -> 0x0081, IOException -> 0x007b, all -> 0x0072 }
            java.io.InputStream r12 = r12.getInputStream(r4)     // Catch:{ FileNotFoundException -> 0x0081, IOException -> 0x007b, all -> 0x0072 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0070, IOException -> 0x006e, all -> 0x006a }
            r4.<init>(r14)     // Catch:{ FileNotFoundException -> 0x0070, IOException -> 0x006e, all -> 0x006a }
            long r5 = r10.copy(r12, r4)     // Catch:{ FileNotFoundException -> 0x0083, IOException -> 0x007d, all -> 0x0068 }
            java.io.FileDescriptor r7 = r4.getFD()     // Catch:{ FileNotFoundException -> 0x0083, IOException -> 0x007d, all -> 0x0068 }
            r7.sync()     // Catch:{ FileNotFoundException -> 0x0083, IOException -> 0x007d, all -> 0x0068 }
            long r7 = r14.length()     // Catch:{ FileNotFoundException -> 0x0083, IOException -> 0x007d, all -> 0x0068 }
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x004d
            r10.closeSilently(r12)     // Catch:{ all -> 0x00a1 }
        L_0x0049:
            r10.closeSilently(r4)     // Catch:{ all -> 0x00a1 }
            goto L_0x0088
        L_0x004d:
            r10.closeSilently(r12)     // Catch:{ all -> 0x00a1 }
            r10.closeSilently(r4)     // Catch:{ all -> 0x00a1 }
            r14.setReadable(r3, r11)     // Catch:{ all -> 0x00a1 }
            r14.setExecutable(r3, r11)     // Catch:{ all -> 0x00a1 }
            r14.setWritable(r3)     // Catch:{ all -> 0x00a1 }
            if (r1 == 0) goto L_0x0067
            java.util.zip.ZipFile r11 = r1.zipFile     // Catch:{ IOException -> 0x0067 }
            if (r11 == 0) goto L_0x0067
            java.util.zip.ZipFile r11 = r1.zipFile     // Catch:{ IOException -> 0x0067 }
            r11.close()     // Catch:{ IOException -> 0x0067 }
        L_0x0067:
            return
        L_0x0068:
            r11 = move-exception
            goto L_0x006c
        L_0x006a:
            r11 = move-exception
            r4 = r0
        L_0x006c:
            r0 = r12
            goto L_0x0074
        L_0x006e:
            r4 = r0
            goto L_0x007d
        L_0x0070:
            r4 = r0
            goto L_0x0083
        L_0x0072:
            r11 = move-exception
            r4 = r0
        L_0x0074:
            r10.closeSilently(r0)     // Catch:{ all -> 0x00a1 }
            r10.closeSilently(r4)     // Catch:{ all -> 0x00a1 }
            throw r11     // Catch:{ all -> 0x00a1 }
        L_0x007b:
            r12 = r0
            r4 = r12
        L_0x007d:
            r10.closeSilently(r12)     // Catch:{ all -> 0x00a1 }
            goto L_0x0049
        L_0x0081:
            r12 = r0
            r4 = r12
        L_0x0083:
            r10.closeSilently(r12)     // Catch:{ all -> 0x00a1 }
            goto L_0x0049
        L_0x0087:
        L_0x0088:
            r12 = r2
            goto L_0x0009
        L_0x008b:
            java.lang.String r11 = "FATAL! Couldn't extract the library from the APK!"
            r15.log((java.lang.String) r11)     // Catch:{ all -> 0x00a1 }
            if (r1 == 0) goto L_0x009b
            java.util.zip.ZipFile r11 = r1.zipFile     // Catch:{ IOException -> 0x009b }
            if (r11 == 0) goto L_0x009b
            java.util.zip.ZipFile r11 = r1.zipFile     // Catch:{ IOException -> 0x009b }
            r11.close()     // Catch:{ IOException -> 0x009b }
        L_0x009b:
            return
        L_0x009c:
            java.lang.String[] r11 = r10.getSupportedABIs(r11, r13)     // Catch:{ Exception -> 0x00a4 }
            goto L_0x00ad
        L_0x00a1:
            r11 = move-exception
            r0 = r1
            goto L_0x00b4
        L_0x00a4:
            r11 = move-exception
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00a1 }
            java.lang.String[] r11 = new java.lang.String[]{r11}     // Catch:{ all -> 0x00a1 }
        L_0x00ad:
            com.getkeepsafe.relinker.MissingLibraryException r14 = new com.getkeepsafe.relinker.MissingLibraryException     // Catch:{ all -> 0x00a1 }
            r14.<init>(r13, r12, r11)     // Catch:{ all -> 0x00a1 }
            throw r14     // Catch:{ all -> 0x00a1 }
        L_0x00b3:
            r11 = move-exception
        L_0x00b4:
            if (r0 == 0) goto L_0x00bf
            java.util.zip.ZipFile r12 = r0.zipFile     // Catch:{ IOException -> 0x00bf }
            if (r12 == 0) goto L_0x00bf
            java.util.zip.ZipFile r12 = r0.zipFile     // Catch:{ IOException -> 0x00bf }
            r12.close()     // Catch:{ IOException -> 0x00bf }
        L_0x00bf:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getkeepsafe.relinker.ApkLibraryInstaller.installLibrary(android.content.Context, java.lang.String[], java.lang.String, java.io.File, com.getkeepsafe.relinker.ReLinkerInstance):void");
    }

    private long copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                outputStream.flush();
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    private void closeSilently(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
