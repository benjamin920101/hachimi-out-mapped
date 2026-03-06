/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2596
 *  net.minecraft.class_2815
 *  net.minecraft.class_310
 *  net.minecraft.class_746
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class1;
import mapped.Class131;
import mapped.Class248;
import mapped.Class253;
import mapped.Class278;
import mapped.Class556;
import mapped.Class5836;
import net.minecraft.class_2596;
import net.minecraft.class_2815;
import net.minecraft.class_310;
import net.minecraft.class_746;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class387
extends Class278 {
    Class248 field1321 = this.method450(new Class253("ForceCancel", "Cancels all close window packets", (boolean)field1322[0]));
    private static long[] field1322 = new long[1];

    private static void method5385(long l2) {
        Class387.field1322[0] = l2 ^ 0x25B89E062FA32D53L;
    }

    static {
        Class387.method5385(2718096124524309843L);
    }

    public static class_746 method5386(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static class_746 method5387(class_310 class_3102) {
        return Class387.method5386(class_3102);
    }

    private static String xO9oVK972BqOV0h8(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0x2789F74));
            ++n2;
        }
        return stringBuilder.toString();
    }

    @Class1
    public void method5388(Class131 b2) {
        class_2815 a2;
        if (Class387.field290.field_1724 == null) {
            return;
        }
        class_2596 class_25962 = b2.method251();
        if (class_25962 instanceof class_2815 && ((a2 = (class_2815)class_25962).method_36168() == Class387.method5387((class_310)Class387.field290).field_7498.field_7763 || ((Boolean)this.field1321.method507()).booleanValue())) {
            b2.method10();
        }
    }

    public static CallSite XKr1Ckdwi9vPkMnI(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class387.xO9oVK972BqOV0h8(string7), Class387.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class387.xO9oVK972BqOV0h8(string5)), Class387.xO9oVK972BqOV0h8(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class387.xO9oVK972BqOV0h8(string5)), Class387.xO9oVK972BqOV0h8(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    public Class387() {
        super("XCarry", "Allow player to carry items in the crafting slots", Class556.field2755);
    }

    private static void method5389() {
        Class5836.method22885();
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

