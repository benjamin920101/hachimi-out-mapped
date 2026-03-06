/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2378
 *  net.minecraft.class_2960
 *  net.minecraft.class_310
 *  net.minecraft.class_3414
 *  net.minecraft.class_7923
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import mapped.Class4122;
import net.hachimi.HACHIMI_CLIENT;
import net.minecraft.class_2378;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3414;
import net.minecraft.class_7923;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class5693 {
    public static final class_3414 field10944;
    public static final class_3414 field10945;
    public static final class_3414 field10946;
    public static final class_3414 field10947;
    public static final class_3414 field10948;
    public static final class_3414 field10949;

    public static class_310 method22444() {
        return Class4122.field9561;
    }

    /*
     * Unable to fully structure code
     */
    private static CallSite SIbq5L1JnWVo5i(MethodHandles.Lookup h, String i, MethodType j, String k, Integer l, Integer m, Integer n) {
        o = Class.forName(Class5693.5dVTnejeSYN9JVYl(k, -2081333556));
        p = o.getAnnotation(HACHIMI_CLIENT.class);
        if (p.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        q = p.d1();
        r = p.d2();
        s = "";
        t = "";
        f = 0;
        block6: while (true) {
            block14: {
                block13: {
                    if (f >= q.length) break block13;
                    v0 = 12295;
                    ** GOTO lbl19
                }
                v0 = 12296;
                if (true) ** GOTO lbl19
                while (true) {
                    v0 = var14_15 = 12294;
lbl19:
                    // 3 sources

                    if (var14_15 == 12295) break;
                    if (var14_15 != 12296) break block6;
                }
                try {
                    a = Integer.parseInt(Class5693.5dVTnejeSYN9JVYl(q[f], m));
                }
                catch (NumberFormatException b) {
                    ** GOTO lbl-1000
                }
                if (e % 59557 != m.intValue()) break block14;
                v1 = 14944;
                ** GOTO lbl35
            }
            v1 = 14945;
            if (true) ** GOTO lbl35
            block8: while (true) {
                v1 = 14943;
lbl35:
                // 3 sources

                switch (v1) {
                    case 14945: {
                        continue block8;
                    }
                    case 14944: {
                        c = Class5693.5dVTnejeSYN9JVYl(r[f], l);
                        d = c.split("<>");
                        s = d[0];
                        t = d[1];
                        break block6;
                    }
                    default: lbl-1000:
                    // 2 sources

                    {
                        ++f;
                        continue block6;
                    }
                }
                break;
            }
            break;
        }
        if (s.isEmpty()) {
            throw new Exception("Can't find method in " + Class5693.5dVTnejeSYN9JVYl(k, -2081333556) + " " + l + " " + m);
        }
        u = MethodType.fromMethodDescriptorString(t, o.getClassLoader());
        if (n == 1) {
            g = h.findVirtual(o, s, u);
        } else {
            v = h.findStatic(o, s, u);
        }
        return new ConstantCallSite(v.asType(j));
    }

    static {
        field10948 = Class5693.method22446("gui_click", ".ogg");
        field10944 = Class5693.method22446("twitter", ".ogg");
        field10947 = Class5693.method22446("ios", ".ogg");
        field10945 = Class5693.method22446("discord", ".ogg");
        field10949 = Class5693.method22446("steam", ".ogg");
        field10946 = Class5693.method22446("add_entity", ".ogg");
    }

    public void method22445(class_3414 a2, float b2, float c2) {
        if (Class5693.method22444().field_1724 != null) {
            Class4122.field9561.method_40000(() -> Class5693.method22447(a2, b2, c2));
        }
    }

    private static class_3414 method22446(String a2, String b2) {
        class_2960 c2 = class_2960.method_60655((String)"hachimi", (String)a2);
        return (class_3414)class_2378.method_10230((class_2378)class_7923.field_41172, (class_2960)c2, (Object)class_3414.method_47908((class_2960)c2));
    }

    private static void method22447(class_3414 a2, float b2, float c2) {
        Class4122.field9561.field_1724.method_5783(a2, b2, c2);
    }

    public void method22448(class_3414 a2) {
        this.method22445(a2, 1.2f, 1.0f);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String 5dVTnejeSYN9JVYl(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        int d2 = 0;
        block4: while (true) {
            int n2 = d2 < a2.length() ? 46998 : 46999;
            block5: while (true) {
                switch (n2) {
                    case 46999: {
                        n2 = 46997;
                        continue block5;
                    }
                    case 46998: {
                        c2.append((char)(a2.charAt(d2) ^ b2));
                        ++d2;
                        continue block4;
                    }
                }
                break;
            }
            break;
        }
        return c2.toString();
    }
}

