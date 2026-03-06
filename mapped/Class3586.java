/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_241
 *  net.minecraft.class_243
 *  net.minecraft.class_315
 *  net.minecraft.class_743
 */
package mapped;

import mapped.Class365;
import net.minecraft.class_241;
import net.minecraft.class_243;
import net.minecraft.class_315;
import net.minecraft.class_743;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class3586
extends class_743 {
    private static long[] field7976 = new long[1];
    public final class_315 field7977;
    final Class365 field7978;

    public static Class365 method17842(Class3586 class3586) {
        return class3586.field7978;
    }

    public void method17843() {
        this.field_3910 = (int)field7976[0];
        this.field_3909 = (int)field7976[0];
        this.field_3908 = (int)field7976[0];
        this.field_3906 = (int)field7976[0];
        this.field_3905 = 0.0f;
        this.field_3907 = 0.0f;
        this.field_3904 = (int)field7976[0];
        this.field_3903 = (int)field7976[0];
    }

    public static float method17844(class_241 class_2412) {
        return class_2412.field_1343;
    }

    public void method_3129(boolean f2, float g2) {
        if (this.field7978.field1181) {
            super.method_3129(f2, g2);
        } else {
            Class3586.method17852(this);
            float a2 = ((Float)Class3586.method17850((Class3586)this).field1186.method507()).floatValue() / 10.0f;
            float b2 = this.field7978.method4733(Class3586.method17846((Class3586)this).field_1894.method_1434(), this.field7977.field_1881.method_1434());
            float c2 = this.field7978.method4733(this.field7977.field_1913.method_1434(), this.field7977.field_1849.method_1434());
            class_241 d2 = this.field7978.method4698(a2, b2, c2);
            float e2 = 0.0f;
            if (this.field7977.field_1903.method_1434()) {
                e2 += a2;
            } else if (Class3586.method17845((Class3586)this).field_1832.method_1434()) {
                e2 -= a2;
            }
            Class3586.method17849((Class3586)this).field1190 = this.field7978.field1185;
            Class3586.method17851(Class3586.method17842(this), this.field7978.field1185.method_1031((double)Class3586.method17844(d2), (double)e2, (double)d2.field_1342));
        }
    }

    public static class_315 method17845(Class3586 class3586) {
        return class3586.field7977;
    }

    public static class_315 method17846(Class3586 class3586) {
        return class3586.field7977;
    }

    public static void method17847(Class365 class365, class_243 class_2432) {
        class365.field1185 = class_2432;
    }

    private static void method17848(long l2) {
        Class3586.field7976[0] = l2 ^ 0x60EEAB5D401ADE17L;
    }

    public static Class365 method17849(Class3586 class3586) {
        return class3586.field7978;
    }

    public static Class365 method17850(Class3586 class3586) {
        return class3586.field7978;
    }

    public Class3586(Class365 a2, class_315 b2) {
        this.field7978 = a2;
        super(b2);
        this.field7977 = b2;
    }

    private static void method17851(Class365 class365, class_243 class_2432) {
        Class3586.method17847(class365, class_2432);
    }

    static {
        Class3586.method17848(6984708489094028823L);
    }

    private static void method17852(Class3586 class3586) {
        class3586.method17843();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

