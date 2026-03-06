/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import mapped.Class248;
import mapped.Class252;
import mapped.Class260;
import mapped.Class278;
import mapped.Class556;
import mapped.Class636;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class AntiAliasing
extends Class278 {
    private static long[] field2335 = new long[3];
    Class248 field2336;
    private static AntiAliasing INSTANCE;
    Class248 field2337 = this.method450(new Class260("Mode", "mode", Class636.field3108, Class636.values()));

    public int method10350() {
        return (Integer)this.field2336.method507();
    }

    public static AntiAliasing method10351() {
        return AntiAliasing.method10354();
    }

    static {
        AntiAliasing.method10352(-3007284446216037413L);
    }

    private static void method10352(long l2) {
        AntiAliasing.method10353(l2);
    }

    private static void method10353(long l2) {
        AntiAliasing.field2335[2] = l2 ^ 0xD643FABABCBC5BDBL;
        AntiAliasing.field2335[0] = l2 ^ 0xD643FABABCBC5BFBL;
        AntiAliasing.field2335[1] = l2 ^ 0xD643FABABCBC5BCBL;
    }

    public static AntiAliasing method10354() {
        return INSTANCE;
    }

    public AntiAliasing() {
        super("AntiAliasing", "Combat the problems of aliasing in a sampled signal such as a digital image", Class556.field2759);
        this.field2336 = this.method450(new Class252("Sample", "MSAA sampling number", (int)field2335[2], (int)field2335[1], (int)field2335[0]));
        INSTANCE = this;
        this.method1264();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

