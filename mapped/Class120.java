/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.Identifier
 *  net.minecraft.client.gui.DrawContext
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class3;
import mapped.Class8;
import net.minecraft.util.Identifier;
import net.minecraft.client.gui.DrawContext;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Class3
public class Class120
extends Class8 {
    private final int field151;
    private final int field152;
    private final class_332 field153;
    private final int field154;
    private final class_2960 field155;
    private final int field156;

    private static class_2960 method211(Class120 class120) {
        return Class120.method213(class120);
    }

    public class_2960 method212() {
        return Class120.method211(this);
    }

    public static class_2960 method213(Class120 class120) {
        return class120.field155;
    }

    public static CallSite pJ2K2vtb9gUv47VG(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class120.oS4SRISTTpSqnoxS(string7), Class120.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class120.oS4SRISTTpSqnoxS(string5)), Class120.oS4SRISTTpSqnoxS(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class120.oS4SRISTTpSqnoxS(string5)), Class120.oS4SRISTTpSqnoxS(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static int method214(Class120 class120) {
        return class120.field152;
    }

    private static String oS4SRISTTpSqnoxS(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0x6C91EDE3));
            ++n2;
        }
        return stringBuilder.toString();
    }

    public int method215() {
        return this.field154;
    }

    public int method216() {
        return this.field156;
    }

    public Class120(class_332 a2, class_2960 b2, int c2, int d2, int e2, int f2) {
        this.field153 = a2;
        this.field155 = b2;
        this.field154 = c2;
        this.field156 = d2;
        this.field152 = e2;
        this.field151 = f2;
    }

    public int method217() {
        return this.field151;
    }

    public class_332 method218() {
        return this.field153;
    }

    public int method219() {
        return Class120.method214(this);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

