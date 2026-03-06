/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  skidonion.sAnhI.___.____
 */
package mapped;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Iterator;
import mapped.Class134;
import mapped.Class1658;
import mapped.Class1661;
import mapped.Class1807;
import mapped.Class181;
import mapped.Class242;
import mapped.Class243;
import mapped.Class3;
import mapped.Class3979;
import mapped.Class4070;
import mapped.Class4079;
import mapped.Class4146;
import mapped.Class5460;
import mapped.Class5723;
import mapped.Class5836;
import mapped.Class6009;
import mapped.Class78;
import skidonion.sAnhI.___;
import skidonion.sAnhI.___.____;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class1660
extends Class1658 {
    private static long[] field6162;
    public static boolean $skidonion$998553572;

    static {
        ___.___(50, Class1660.class);
        ____.___50_00(Class1660.class);
    }

    private static int method15054(int n2, int n3, Class78 class78, Class5460 class5460) {
        return Class4079.method20331(n2, n3, class78, class5460);
    }

    private static int method15055(int n2, int n3, Class1661 class1661, Class134 class134) {
        return Class4079.method20326(n2, n3, class1661, class134);
    }

    public Class1660(Path a2) {
        super(a2, "waypoints");
    }

    public static CallSite ZiewzgxP2dJTWdiv(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class1660.rBIRleNrqsaIyQwT(string7), Class1660.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class1660.rBIRleNrqsaIyQwT(string5)), Class1660.rBIRleNrqsaIyQwT(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class1660.rBIRleNrqsaIyQwT(string5)), Class1660.rBIRleNrqsaIyQwT(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static void method15056() {
        Class6009.method23561();
    }

    private static void method15057(boolean bl2) {
        Class6009.method23559(bl2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void method15037() {
        try {
            Path b2 = this.method15046();
            int n2 = !Files.exists(b2, new LinkOption[(int)field6162[0]]) ? 27057 : 27058;
            block6: while (true) {
                switch (n2) {
                    case 27058: {
                        n2 = 27056;
                        continue block6;
                    }
                    case 27057: {
                        Files.createFile(b2, new FileAttribute[(int)field6162[0]]);
                        break block6;
                    }
                }
                break;
            }
            JsonArray c2 = new JsonArray();
            Iterator iterator = Class5723.field11046.method20254().iterator();
            if (iterator.hasNext()) {
                Class243 a2 = (Class243)iterator.next();
                if (a2 instanceof Class242) {
                    c2.add((JsonElement)Class1660.method15064(a2));
                }
                Class5836.method22897();
                return;
            }
            this.method15030(b2, this.method15044(c2));
        }
        catch (IOException d2) {
            Class3979.method19554("Could not save file for waypoints.json!");
            d2.printStackTrace();
            return;
        }
        Class1807.method15744();
    }

    private static void method15058() {
        Class4146.method20697();
    }

    private static void method15059(Class4070 class4070, Class243 class243) {
        class4070.method20253(class243);
    }

    private static int method15060(int n2, int n3, Class3 class3, Class181 class181) {
        return Class4079.method20345(n2, n3, class3, class181);
    }

    private static void method15061(long l2) {
        Class1660.field6162[0] = l2 ^ 0x49B4D431957AFB6EL;
    }

    private static void method15062() {
        Class4146.method20697();
    }

    private static void method15063(boolean bl2) {
        Class6009.method23559(bl2);
    }

    private static JsonObject method15064(Class243 class243) {
        return class243.method438();
    }

    private static String rBIRleNrqsaIyQwT(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        while (n2 < string.length()) {
            stringBuilder.append((char)(string.charAt(n2) ^ 0xF82F2BB8));
            ++n2;
        }
        return stringBuilder.toString();
    }

    @Override
    public native void method15040();

    private static native Object 1(char var0);
}

