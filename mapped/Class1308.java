/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  it.unimi.dsi.fastutil.objects.Object2IntMaps
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1890
 *  net.minecraft.class_1893
 *  net.minecraft.class_5321
 *  net.minecraft.class_6880
 *  net.minecraft.class_9304
 *  net.minecraft.class_9331
 *  net.minecraft.class_9334
 */
package mapped;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Iterator;
import java.util.Set;
import mapped.Class1807;
import mapped.Class4045;
import mapped.Class5550;
import mapped.Class5659;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1890;
import net.minecraft.class_1893;
import net.minecraft.class_5321;
import net.minecraft.class_6880;
import net.minecraft.class_9304;
import net.minecraft.class_9331;
import net.minecraft.class_9334;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class1308 {
    private static long[] field5079 = new long[2];

    private static int method13615() {
        return Class5550.method21885();
    }

    private static int method13616(int n2) {
        return Class4045.method20096(n2);
    }

    private static int method13617() {
        return Class5659.method22101();
    }

    static {
        Class1308.method13619(-630714298526017297L);
    }

    private static int method13618() {
        return Class5659.method22101();
    }

    private static void method13619(long l2) {
        Class1308.method13622(l2);
    }

    private static int method13620(int n2) {
        return Class4045.method20105(n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int method13621(class_1799 b2, class_5321 c2) {
        if (!b2.method_57353().method_57832(class_9334.field_49633)) {
            return (int)field5079[0];
        }
        Iterator iterator = ((class_9304)b2.method_57353().method_57829(Class1308.method13630())).method_57539().iterator();
        block4: while (iterator.hasNext()) {
            Object2IntMap.Entry a2 = (Object2IntMap.Entry)iterator.next();
            int n2 = ((class_6880)a2.getKey()).method_40230().isPresent() ? 59776 : 59777;
            block5: while (true) {
                switch (n2) {
                    case 59777: {
                        n2 = 59775;
                        continue block5;
                    }
                    case 59776: {
                        if (!((class_5321)((class_6880)a2.getKey()).method_40230().get()).equals(c2)) continue block4;
                        return a2.getIntValue();
                    }
                }
                break;
            }
        }
        return (int)field5079[0];
    }

    private static void method13622(long l2) {
        Class1308.field5079[1] = l2 ^ 0xF73F40AFE998D8EEL;
        Class1308.field5079[0] = l2 ^ 0xF73F40AFE998D8EFL;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void method13623(class_1799 c2, Object2IntMap d2) {
        d2.clear();
        int n2 = !c2.method_7960() ? 54525 : 54526;
        block4: while (true) {
            switch (n2) {
                case 54526: {
                    n2 = 54524;
                    continue block4;
                }
                case 54525: {
                    Set b2 = c2.method_7909() == class_1802.field_8598 ? ((class_9304)c2.method_57825(class_9334.field_49643, (Object)class_9304.field_49385)).method_57539() : c2.method_58657().method_57539();
                    for (Object2IntMap.Entry a2 : b2) {
                        d2.put((Object)((class_6880)a2.getKey()), a2.getIntValue());
                    }
                    return;
                }
            }
            break;
        }
    }

    private static int method13624() {
        return Class5550.method21885();
    }

    private static int method13625(float f2, float f3) {
        return Class5659.method22205(f2, f3);
    }

    private static boolean method13626() {
        return Class1807.method15769();
    }

    public static boolean method13627(class_1799 d2) {
        Set e2 = class_1890.method_57532((class_1799)d2).method_57539();
        if (e2.size() > (int)field5079[1]) {
            return (int)field5079[0] != 0;
        }
        for (Object2IntMap.Entry c2 : e2) {
            class_6880 a2 = (class_6880)c2.getKey();
            int b2 = c2.getIntValue();
            if (b2 != 0 || !a2.method_40230().isPresent()) continue;
            if (a2.method_40230().get() != class_1893.field_9111) continue;
            return (int)field5079[1] != 0;
        }
        return (int)field5079[0] != 0;
    }

    /*
     * Unable to fully structure code
     */
    public static int method13628(class_1799 a, class_5321 b) {
        block1: {
            block2: {
                if (!a.method_7960()) break block2;
                v0 = 35567;
                ** GOTO lbl9
            }
            v0 = 35568;
            if (true) ** GOTO lbl9
            do {
                v0 = var2_2 = 35566;
lbl9:
                // 3 sources

                if (var2_2 == 35567) break block1;
            } while (var2_2 == 35568);
            return Class1308.method13625(0.75983584f, 0.27293712f);
        }
        return (int)Class1308.field5079[0];
    }

    public static int method13629(Object2IntMap b2, class_5321 c2) {
        Object2IntMap.Entry a2;
        ObjectIterator objectIterator = Object2IntMaps.fastIterable((Object2IntMap)b2).iterator();
        do {
            if (objectIterator.hasNext()) continue;
            return Class5659.method22205(0.7944511f, 0.4092461f);
        } while (!((class_6880)(a2 = (Object2IntMap.Entry)objectIterator.next()).getKey()).method_40225(c2));
        return a2.getIntValue();
    }

    public static class_9331 method13630() {
        return class_9334.field_49633;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

