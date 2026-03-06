/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.text.Text
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.gui.screen.Screen
 */
package mapped;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import mapped.Class333;
import mapped.Class3860;
import mapped.Class447;
import mapped.Class803;
import net.minecraft.text.Text;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class5649
extends class_437 {
    public static Class803 field10815;
    private final List field10816;
    public static Class803 field10817;
    private static long[] field10818;

    public boolean method_25404(int a2, int b2, int c2) {
        this.field10816.stream().filter(Class803::method12254).forEach(arg_0 -> Class5649.method22089(a2, b2, c2, arg_0));
        return super.method_25404(a2, b2, c2);
    }

    public Class5649(Class803 ... a2) {
        super(class_2561.method_30163((String)"CustomWindows"));
        field10817 = null;
        this.field10816 = Arrays.stream(a2).toList();
    }

    private static void method22076(double a2, Class803 b2) {
        b2.method12259((int)(a2 * 5.0));
    }

    public static Class803 method22077() {
        return field10817;
    }

    private static boolean method22078(Class803 class803) {
        return class803.method12254();
    }

    private static List method22079(Class5649 class5649) {
        return Class5649.method22090(class5649);
    }

    public static Class803 method22080() {
        return field10817;
    }

    public static List method22081(Class5649 class5649) {
        return class5649.field10816;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean method_25402(double b2, double c2, int d2) {
        Class5649.method22079(this).stream().filter(Class803::method12254).forEach(arg_0 -> Class5649.method22084(b2, c2, d2, arg_0));
        int e2 = this.field_22787.method_22683().method_4486() / (int)field10818[3];
        float f2 = (float)this.field10816.size() * 20.0f / -2.0f - 23.0f;
        int n2 = Class5649.method22085(b2, c2, (float)e2 + f2 + 1.0f, this.field_22787.method_22683().method_4502() - (int)field10818[2], 15.0, 15.0) ? 20763 : 20764;
        block4: while (true) {
            switch (n2) {
                case 20764: {
                    n2 = 20762;
                    continue block4;
                }
                case 20763: {
                    this.field_22787.method_1507(Class333.method2989().method3020());
                    break block4;
                }
            }
            break;
        }
        f2 += 23.0f;
        Iterator iterator = this.field10816.iterator();
        while (iterator.hasNext()) {
            Class803 a2 = (Class803)iterator.next();
            if (Class5649.method22085(b2, c2, (float)e2 + f2, this.field_22787.method_22683().method_4502() - (int)field10818[4], 17.0, 17.0)) {
                a2.method12282((!Class5649.method22078(a2) ? (int)field10818[0] : (int)field10818[1]) != 0);
            }
            f2 += Class3860.field8776;
        }
        return super.method_25402(b2, c2, d2);
    }

    private static void method22082(double a2, double b2, int c2, Class803 d2) {
        d2.method12270(a2, b2, c2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void method22083(class_332 a2, int b2, int c2, Class803 d2) {
        int n2 = d2 != Class5649.method22080() ? 7567 : 7568;
        block4: while (true) {
            switch (n2) {
                case 7568: {
                    n2 = 7566;
                    continue block4;
                }
                case 7567: {
                    d2.method12218(a2, b2, c2);
                    return;
                }
            }
            break;
        }
    }

    private static void method22084(double a2, double b2, int c2, Class803 d2) {
        d2.method12293(a2, b2, c2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean method22085(double a2, double b2, double c2, double d2, double e2, double f2) {
        int n2;
        if (a2 >= c2 && a2 - e2 <= c2 && b2 >= d2 && b2 - f2 <= d2) {
            n2 = (int)field10818[0];
            return n2 != 0;
        }
        n2 = (int)field10818[1];
        return n2 != 0;
    }

    public boolean method_25401(double a2, double b2, double c2, double d2) {
        Class5649.method22086(this).stream().filter(Class803::method12254).forEach(arg_0 -> Class5649.method22076(d2, arg_0));
        return super.method_25401(a2, b2, c2, d2);
    }

    public boolean method_25400(char a2, int b2) {
        Class5649.method22081(this).stream().filter(Class803::method12254).forEach(arg_0 -> Class5649.method22087(a2, b2, arg_0));
        return super.method_25400(a2, b2);
    }

    public static List method22086(Class5649 class5649) {
        return class5649.field10816;
    }

    private static void method22087(char a2, int b2, Class803 c2) {
        c2.method12249(a2, b2);
    }

    public void method_25394(class_332 a2, int b2, int c2, float d2) {
        if (this.field_22787.field_1724 == null) {
            this.method_25420(a2, b2, c2, d2);
        }
        this.field10816.stream().filter(Class803::method12254).forEach(arg_0 -> Class5649.method22083(a2, b2, c2, arg_0));
        if (field10817 != null && field10817.method12254()) {
            Class5649.method22077().method12218(a2, b2, c2);
        }
    }

    private static void method22088(long l2) {
        Class5649.field10818[4] = l2 ^ 0x5B4B35D20B90FE7DL;
        Class5649.field10818[2] = l2 ^ 0x5B4B35D20B90FE72L;
        Class5649.field10818[3] = l2 ^ 0x5B4B35D20B90FE67L;
        Class5649.field10818[1] = l2 ^ 0x5B4B35D20B90FE65L;
        Class5649.field10818[0] = l2 ^ 0x5B4B35D20B90FE64L;
    }

    private static void method22089(int a2, int b2, int c2, Class803 d2) {
        d2.method12228(a2, b2, c2);
    }

    static {
        field10818 = new long[5];
        Class5649.method22088(6578410856958197349L);
    }

    public boolean method_25406(double a2, double b2, int c2) {
        this.field10816.forEach(arg_0 -> Class5649.method22082(a2, b2, c2, arg_0));
        return super.method_25406(a2, b2, c2);
    }

    public static List method22090(Class5649 class5649) {
        return class5649.field10816;
    }

    private static boolean method22091() {
        return Class447.method10322();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

