/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import mapped.Class248;
import mapped.Class252;
import mapped.Class278;
import mapped.Class556;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class AspectRatio
extends Class278 {
    private static AspectRatio INSTANCE;
    public final Class248 field753 = this.method450(new Class252("Ratio", "Ratio for aspect", Float.valueOf(0.0f), Float.valueOf(1.78f), Float.valueOf(5.0f)));

    public AspectRatio() {
        super("AspectRatio", "Change your screen aspect ratio", Class556.field2759);
        INSTANCE = this;
    }

    public static AspectRatio method2713() {
        return INSTANCE;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

