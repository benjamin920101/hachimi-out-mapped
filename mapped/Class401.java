/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class1;
import mapped.Class248;
import mapped.Class252;
import mapped.Class278;
import mapped.Class29;
import mapped.Class556;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class401
extends Class278 {
    Class248 field1402 = this.method450(new Class252("Limit", "The FPS limit when game is in the background", (int)field1403[0], (int)field1403[1], (int)field1403[2]));
    private static long[] field1403 = new long[3];

    private static void method5899(long l2) {
        Class401.field1403[1] = l2 ^ 0x5E657E202EB1EF0DL;
        Class401.field1403[0] = l2 ^ 0x5E657E202EB1EF16L;
        Class401.field1403[2] = l2 ^ 0x5E657E202EB1EF6BL;
    }

    public Class401() {
        super("UnfocusedFPS", "Reduces FPS when game is in the background", Class556.field2756);
    }

    private static Object method5900(Class248 class248) {
        return class248.method507();
    }

    @Class1
    public void method5901(Class29 a2) {
        if (!field290.method_1569()) {
            a2.method10();
            a2.method58((Integer)Class401.method5900(this.field1402));
        }
    }

    private static String aj5iaYQy35yPDibZ(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0x1A857981));
            ++n2;
        }
        return stringBuilder.toString();
    }

    public static CallSite 7dJ94xdhfxr6Lwb3(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class401.aj5iaYQy35yPDibZ(string7), Class401.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class401.aj5iaYQy35yPDibZ(string5)), Class401.aj5iaYQy35yPDibZ(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class401.aj5iaYQy35yPDibZ(string5)), Class401.aj5iaYQy35yPDibZ(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    static {
        Class401.method5899(6801981488900468499L);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

