/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_4587
 */
package mapped;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class1503;
import mapped.Class187;
import mapped.Class3821;
import mapped.Class3979;
import mapped.Class489;
import mapped.Class5836;
import mapped.Class5855;
import mapped.Class6283;
import mapped.Class6454;
import mapped.Class749;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_4587;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class1394 {
    public final int field5374;
    public boolean field5375 = (int)field5377[0];
    public final class_243 field5376;
    private static long[] field5377 = new long[2];
    public final Class6283 field5378;
    public static final int field5379;

    private static void method14132() {
        Class3979.method19561();
    }

    private static double method14133(class_243 class_2432) {
        return Class1394.method14137(class_2432);
    }

    private static void method14134() {
        Class5836.method22885();
    }

    private static int method14135(int n2, int n3, Class3821 class3821, Class187 class187) {
        return Class5855.method22982(n2, n3, class3821, class187);
    }

    public static Class6283 method14136(Class1394 class1394) {
        return class1394.field5378;
    }

    public static double method14137(class_243 class_2432) {
        return class_2432.field_1350;
    }

    public boolean method14138() {
        return this.field5375;
    }

    private static void method14139(long l2) {
        Class1394.field5377[1] = l2 ^ 0x16F7470631CBDA83L;
        Class1394.field5377[0] = l2 ^ 0x16F7470631CBDA82L;
    }

    static {
        Class1394.method14139(1654869480012765827L);
        field5379 = new Color((int)field5377[1], (int)field5377[1], (int)field5377[1], (int)field5377[1]).getRGB();
    }

    public void method14140(class_4587 a2) {
        this.field5375 = this.field5378.method24281() >= 0.97 ? (int)field5377[0] : (int)field5377[1];
        double b2 = this.field5378.method24281() * 8.0;
        double c2 = (1.0 - Class1394.method14142(Class1394.method14136(this))) * Class749.field3387;
        class_238 d2 = new class_238(this.field5376.field_1352 - c2, this.field5376.field_1351, this.field5376.field_1350 - c2, this.field5376.field_1352 + c2, this.field5376.field_1351 + b2, Class1394.method14133(this.field5376) + c2);
        Class6454.method24694(a2, d2, this.field5374, field5379);
    }

    public static CallSite JWajqw0cNVgJsqjI(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class1394.GJ04bbDGt72mF6xd(string7), Class1394.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class1394.GJ04bbDGt72mF6xd(string5)), Class1394.GJ04bbDGt72mF6xd(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class1394.GJ04bbDGt72mF6xd(string5)), Class1394.GJ04bbDGt72mF6xd(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    public Class1394(class_243 a2, int b2, long c2) {
        this.field5378 = new Class6283((boolean)field5377[0], c2, Class489.field2555);
        this.field5376 = a2;
        this.field5374 = b2;
    }

    public Class1394 method14141() {
        this.field5378.method24280();
        return this;
    }

    private static double method14142(Class6283 class6283) {
        return class6283.method24281();
    }

    private static String GJ04bbDGt72mF6xd(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0xAA0D661A));
            ++n2;
        }
        return stringBuilder.toString();
    }

    private static void method14143() {
        Class1503.method14420();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

