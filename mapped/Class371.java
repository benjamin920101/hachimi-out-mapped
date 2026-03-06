/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class1;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class248;
import mapped.Class252;
import mapped.Class278;
import mapped.Class3993;
import mapped.Class543;
import mapped.Class556;
import mapped.Class5723;
import mapped.Class6322;
import mapped.Class65;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class371
extends Class278 {
    Class248 field1214 = this.method450(new Class252("MaxTicks", "Maximum charge ticks", (int)field1217[0], (int)field1217[1], (int)field1217[3]));
    Class248 field1215;
    Class248 field1216 = this.method450(new Class252("Packets", "Packets to release from storage every tick", (int)field1217[0], (int)field1217[0], (int)field1217[2]));
    private static long[] field1217 = new long[5];
    private int field1218;

    public Class371() {
        super("TickShift", "Exploits NCP to speed up ticks", Class556.field2752);
        this.field1215 = this.method450(new Class252("ChargeSpeed", "The speed to charge the stored packets", (int)field1217[0], (int)field1217[0], (int)field1217[2]));
    }

    public static int method4858(Class371 class371) {
        return class371.field1218;
    }

    @Override
    public String method1248() {
        return String.valueOf(this.field1218);
    }

    private static void method4859(long l2) {
        Class371.field1217[4] = l2 ^ 0x7BC19F7F4F0DAF53L;
        Class371.field1217[2] = l2 ^ 0x7BC19F7F4F0DAF56L;
        Class371.field1217[3] = l2 ^ 0x7BC19F7F4F0DAF7BL;
        Class371.field1217[0] = l2 ^ 0x7BC19F7F4F0DAF52L;
        Class371.field1217[1] = l2 ^ 0x7BC19F7F4F0DAF47L;
    }

    private static int method4860(Class371 class371) {
        return Class371.method4863(class371);
    }

    private static void method4861(long l2) {
        Class371.method4859(l2);
    }

    private static void method4862() {
        Class1745.method15538();
    }

    public static int method4863(Class371 class371) {
        return class371.field1218;
    }

    static {
        Class371.method4861(8917584106306252627L);
    }

    public static CallSite SH9kdL1xOlHlb53A(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class371.0djASNQharjBogQD(string7), Class371.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class371.0djASNQharjBogQD(string5)), Class371.0djASNQharjBogQD(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class371.0djASNQharjBogQD(string5)), Class371.0djASNQharjBogQD(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    @Class1
    public void method4864(Class65 a2) {
        if (a2.method128() != Class543.field2690) {
            return;
        }
        if (!Class371.method4865()) {
            while (true) {
                // Infinite loop
            }
        }
        Class6322.method24332(0.8212809f, Class3993.field9133);
    }

    private static String 0djASNQharjBogQD(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0xA3038FB));
            ++n2;
        }
        return stringBuilder.toString();
    }

    private static boolean method4865() {
        return Class1807.method15769();
    }

    @Override
    public void method1279() {
        Class5723.field11047.method19512(1.0f);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

