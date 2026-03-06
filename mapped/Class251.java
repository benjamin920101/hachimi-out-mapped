/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  skidonion.sAnhI.___.____
 */
package mapped;

import com.google.gson.JsonObject;
import java.awt.Color;
import java.util.function.Supplier;
import mapped.Class1108;
import mapped.Class248;
import mapped.Class4045;
import mapped.Class4146;
import mapped.Colors;
import mapped.Class5550;
import mapped.Class6009;
import mapped.Class6322;
import skidonion.sAnhI.___;
import skidonion.sAnhI.___.____;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class251
extends Class248 {
    private boolean field307;
    private static long[] field308;
    private final boolean field309;
    public static boolean $skidonion$998555155;

    public float[] method535() {
        float[] a2 = Color.RGBtoHSB(((Color)this.field305).getRed(), ((Color)this.field305).getGreen(), ((Color)this.field305).getBlue(), null);
        float[] fArray = new float[(int)field308[6]];
        fArray[(int)Class251.field308[2]] = a2[(int)field308[2]];
        fArray[(int)Class251.field308[0]] = a2[(int)field308[0]];
        fArray[(int)Class251.field308[5]] = a2[(int)field308[5]];
        fArray[(int)Class251.field308[4]] = this.field309 ? (float)((Color)this.field305).getAlpha() / 255.0f : 1.0f;
        return fArray;
    }

    public Class251(String a2, String b2, Integer c2, boolean d2) {
        this(a2, b2, new Color(c2, ((c2 & (int)field308[1]) != (int)field308[1] ? (int)field308[0] : (int)field308[2]) != 0), d2, (boolean)field308[0]);
    }

    public int method536() {
        return ((Color)this.field305).getBlue();
    }

    public void method537(int a2) {
        Color b2 = new Color(a2, ((a2 & (int)field308[1]) != (int)field308[1] ? (int)field308[0] : (int)field308[2]) != 0);
        this.method505(b2);
    }

    public Class251(String a2, String b2, Color c2, boolean d2, boolean e2, Supplier f2) {
        super(a2, b2, c2, f2);
        this.field309 = d2;
        this.method543(e2);
    }

    private static int method538(int n2) {
        return Class4045.method20103(n2);
    }

    public int method539() {
        return ((Color)this.field305).getGreen();
    }

    private static void method540() {
        Class4146.method20694();
    }

    @Override
    public Object method507() {
        return this.method552();
    }

    public Color method541(int a2) {
        if (Colors.method10620() != null && this.field307) {
            return Colors.method10620().method10618(a2);
        }
        return new Color(((Color)this.field305).getRed(), ((Color)this.field305).getGreen(), ((Color)this.field305).getBlue(), a2);
    }

    public int method542() {
        return this.method552().getRGB();
    }

    public void method543(boolean a2) {
        this.field307 = a2;
        this.field302.method24284(a2);
        if (Class251.method550() != null && a2) {
            this.method505(Class251.method547(Colors.method10620(), this.method554()));
        }
    }

    public Class251(String a2, String b2, Color c2) {
        this(a2, b2, c2, (boolean)field308[0], (boolean)field308[0]);
    }

    private static void method544(boolean bl2) {
        Class1108.method12918(bl2);
    }

    public static boolean method545(Class251 class251) {
        return class251.field307;
    }

    private static void method546(float f2, float f3) {
        Class6322.method24332(f2, f3);
    }

    private static Color method547(Colors class457, int n2) {
        return class457.method10618(n2);
    }

    public int method548(int a2) {
        return this.method541(a2).getRGB();
    }

    @Override
    public native Object method482(JsonObject var1);

    public native Color method549(JsonObject var1);

    private static Colors method550() {
        return Colors.method10620();
    }

    public Color method551(String a2) {
        return new Color((int)Long.parseLong(a2, (int)field308[7]), (boolean)field308[0]);
    }

    public Class251(String a2, String b2, Color c2, boolean d2, Supplier e2) {
        this(a2, b2, c2, d2, (boolean)field308[0], e2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public Color method552() {
        int n2;
        if (Colors.method10620() != null && this.field307) {
            return Colors.method10620().method10618(this.method554());
        }
        int n3 = ((Color)this.field305).getRed();
        int n4 = ((Color)this.field305).getGreen();
        int n5 = ((Color)this.field305).getBlue();
        if (!Class251.method555(this)) {
            int n6 = 46997;
            Class6009.method23559(false);
            return null;
        }
        int n7 = 46996;
        block4: while (true) {
            switch (n7) {
                case 46997: {
                    n7 = 46995;
                    continue block4;
                }
                case 46996: {
                    n2 = ((Color)this.field305).getAlpha();
                    return new Color(n3, n4, n5, n2);
                }
            }
            break;
        }
        n2 = (int)field308[3];
        return new Color(n3, n4, n5, n2);
    }

    public boolean method553() {
        return Class251.method545(this);
    }

    public int method554() {
        return this.field309 ? ((Color)this.field305).getAlpha() : (int)field308[3];
    }

    public static boolean method555(Class251 class251) {
        return class251.field309;
    }

    public boolean method556() {
        return this.field309;
    }

    public int method557() {
        return ((Color)this.field305).getRed();
    }

    public Class251(String a2, String b2, Color c2, Supplier d2) {
        this(a2, b2, c2, (boolean)field308[0], d2);
    }

    public Class251(String a2, String b2, Color c2, boolean d2, boolean e2) {
        super(a2, b2, c2);
        this.field309 = d2;
        this.method543(e2);
    }

    private static void method558(long l2) {
        Class251.field308[3] = l2 ^ 0xC550A9E8F35A9158L;
        Class251.field308[4] = l2 ^ 0xC550A9E8F35A91A4L;
        Class251.field308[6] = l2 ^ 0xC550A9E8F35A91A3L;
        Class251.field308[5] = l2 ^ 0xC550A9E8F35A91A5L;
        Class251.field308[1] = l2 ^ 0x3AAF56170C5A91A7L;
        Class251.field308[7] = l2 ^ 0xC550A9E8F35A91B7L;
        Class251.field308[0] = l2 ^ 0xC550A9E8F35A91A6L;
        Class251.field308[2] = l2 ^ 0xC550A9E8F35A91A7L;
    }

    static {
        ___.___(12, Class251.class);
        ____.___12_440(Class251.class);
    }

    public Class251(String a2, String b2, Integer c2) {
        this(a2, b2, c2, (boolean)field308[2]);
    }

    private static int method559() {
        return Class5550.method21885();
    }

    public void method560() {
        this.method543((boolean)field308[0]);
    }

    @Override
    public JsonObject method438() {
        JsonObject a2 = super.method438();
        a2.addProperty("value", Integer.toHexString(this.method542()));
        a2.addProperty("global", Boolean.valueOf(this.field307));
        return a2;
    }

    private static native Object 1(char var0);
}

