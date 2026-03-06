/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_3532
 */
package mapped;

import java.awt.Color;
import mapped.Class1;
import mapped.Class248;
import mapped.Class251;
import mapped.Class451;
import mapped.Class556;
import mapped.Class86;
import net.minecraft.class_3532;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class457
extends Class451 {
    private static Class457 INSTANCE;
    Class248 field2411 = this.method450(new Class251("Global", "The primary client color", new Color((int)field2412[3], (int)field2412[0], (int)field2412[1]), (boolean)field2412[2], (boolean)field2412[2]));
    private static long[] field2412;

    @Class1
    public void method10612(Class86 a2) {
        a2.method175(this.method10621());
    }

    private static int method10613(Class251 class251) {
        return class251.method557();
    }

    public Color method10614() {
        return (Color)this.field2411.method507();
    }

    public int method10615(int a2) {
        return this.method10618(a2).getRGB();
    }

    private static int method10616(Class251 class251) {
        return class251.method536();
    }

    public Class457() {
        super("Colors", "Client color scheme", Class556.field2757);
        INSTANCE = this;
    }

    private static void method10617(long l2) {
        Class457.field2412[2] = l2 ^ 0xA0CA40AA8349AED1L;
        Class457.field2412[0] = l2 ^ 0xA0CA40AA8349AE4DL;
        Class457.field2412[1] = l2 ^ 0xA0CA40AA8349AE2EL;
        Class457.field2412[3] = l2 ^ 0xA0CA40AA8349AE64L;
    }

    public Color method10618(int a2) {
        Class251 b2 = (Class251)this.field2411;
        return new Color(Class457.method10613(b2), b2.method539(), Class457.method10616(b2), class_3532.method_15340((int)a2, (int)((int)field2412[2]), (int)((int)field2412[1])));
    }

    public Color method10619(float a2) {
        Class251 b2 = (Class251)this.field2411;
        return new Color((float)b2.method557() / 255.0f, (float)b2.method539() / 255.0f, (float)b2.method536() / 255.0f, class_3532.method_15363((float)a2, (float)0.0f, (float)1.0f));
    }

    public static Class457 method10620() {
        return INSTANCE;
    }

    public Integer method10621() {
        return this.method10614().getRGB();
    }

    static {
        field2412 = new long[4];
        Class457.method10617(-6860599981254267183L);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

