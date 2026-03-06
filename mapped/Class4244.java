/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2338
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import mapped.Class1745;
import mapped.Class1807;
import mapped.Class4971;
import mapped.Class6259;
import net.minecraft.class_2338;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class4244
implements Callable {
    private final List field9912;
    final Class4971 field9913;

    public Object call() throws Exception {
        return this.method20917();
    }

    private static void method20915() {
        Class1807.method15744();
    }

    public static CallSite ljtTteW71LTgTkEA(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class4244.zO8p7eINlqk9otR3(string7), Class4244.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class4244.zO8p7eINlqk9otR3(string5)), Class4244.zO8p7eINlqk9otR3(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class4244.zO8p7eINlqk9otR3(string5)), Class4244.zO8p7eINlqk9otR3(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static void method20916() {
        Class1745.method15538();
    }

    /*
     * Unable to fully structure code
     */
    private static String zO8p7eINlqk9otR3(String var0) {
        var1_1 = new StringBuilder();
        var2_2 = 0;
        if (true) ** GOTO lbl8
        block0: while (true) {
            block2: {
                var1_1.append((char)(var0.charAt(var2_2) ^ -805725694));
                ++var2_2;
lbl8:
                // 2 sources

                if (var2_2 < var0.length()) break block2;
                v0 = 40842;
                ** GOTO lbl16
            }
            v0 = 40843;
            if (true) ** GOTO lbl16
            do {
                v0 = var3_3 = 40841;
lbl16:
                // 3 sources

                if (var3_3 == 40842) break block0;
            } while (var3_3 == 40843);
        }
        return var1_1.toString();
    }

    public Set method20917() throws Exception {
        HashSet<Class6259> c2 = new HashSet<Class6259>();
        for (class_2338 b2 : this.field9912) {
            Class6259 a2 = this.field9913.method20967(b2);
            if (a2 == null) continue;
            c2.add(a2);
        }
        return c2;
    }

    public Class4244(Class4971 a2, List b2) {
        this.field9913 = a2;
        this.field9912 = b2;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

