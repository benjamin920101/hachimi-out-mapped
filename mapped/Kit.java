/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.effect.StatusEffectInstance
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.PotionItem
 *  net.minecraft.item.TippedArrowItem
 *  net.minecraft.component.type.PotionContentsComponent
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.component.ComponentType
 *  net.minecraft.component.DataComponentTypes
 *  org.apache.commons.io.IOUtils
 */
package mapped;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import mapped.Class1;
import mapped.Class117;
import mapped.Class1234;
import mapped.Class1365;
import mapped.Class1462;
import mapped.Class1745;
import mapped.Class248;
import mapped.Class250;
import mapped.Class254;
import mapped.Class256;
import mapped.FreeLook;
import mapped.Class34;
import mapped.Class3979;
import mapped.Class4036;
import mapped.Class4146;
import mapped.Class451;
import mapped.Class556;
import mapped.Class5668;
import mapped.Class5836;
import mapped.Class6139;
import mapped.Class673;
import mapped.Class923;
import mapped.Class942;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PotionItem;
import net.minecraft.item.TippedArrowItem;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.component.ComponentType;
import net.minecraft.component.DataComponentTypes;
import org.apache.commons.io.IOUtils;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class Kit
extends Class451 {
    private static Kit INSTANCE;
    Class248 field2382 = this.method450(new Class250("Saved", "You cant see this setting", "default", Kit::method10539));
    public static final HashMap field2383;
    Class248 field2384 = this.method450(new Class250("Name", "The name of the kit", "default"));
    private static long[] field2385;
    Class248 field2386;
    Class248 field2387 = this.method450(new Class254(this, "Load", "Load kit from file", (boolean)field2385[0]));

    public static Class1462 method10525() {
        return Class3979.field9083;
    }

    public static HashMap method10526() {
        return field2383;
    }

    public static class_1844 method10527() {
        return class_1844.field_49274;
    }

    private static void method10528(float f2, float f3, float f4, float f5, float f6, float f7) {
        Class4036.method20085(f2, f3, f4, f5, f6, f7);
    }

    private static void method10529(long l2) {
        Kit.field2385[0] = l2 ^ 0x820EDBCAB6C0651AL;
        Kit.field2385[1] = l2 ^ 0x820EDBCAB6C0651BL;
        Kit.field2385[2] = l2 ^ 0x820EDBCAB6C06532L;
    }

    public static File method10530(Class1462 class1462) {
        return class1462.field5551;
    }

    private static boolean method10531(Kit class454, boolean bl2) {
        return class454.method10536(bl2);
    }

    public String method10532() {
        return (String)this.field2382.method507();
    }

    @Class1
    public void method10533(Class117 a2) {
        Kit.method10542(Kit.method10546(), (boolean)field2385[1]);
    }

    public void method10534(String c2) {
        if (Kit.field290.field_1724 == null || Kit.field290.field_1687 == null) {
            return;
        }
        try {
            File a2 = new File(Kit.method10525().field5551, c2 + ".data");
            if (a2.exists()) {
                a2.delete();
                Class1365.method13919("\u00a7fThe kit \u00a7s" + c2 + " \u00a7fhas been deleted!");
            } else {
                Class1365.method13946("\u00a7cCould not found kit " + c2);
            }
        }
        catch (Exception b2) {
            Kit.method10545("Failed to delete kit " + c2);
            Kit.method10552("\u00a7cFailed to delete kit " + c2);
            b2.printStackTrace();
        }
    }

    public static class_638 method10535(class_310 class_3102) {
        return class_3102.field_1687;
    }

    public boolean method10536(boolean g2) {
        String h2 = (String)this.field2382.method507();
        try {
            File e2 = new File(Class3979.field9083.field5551, h2 + ".data");
            if (e2.exists()) {
                field2383.clear();
                List d2 = IOUtils.readLines((InputStream)new FileInputStream(e2), (Charset)StandardCharsets.UTF_8);
                for (String c2 : d2) {
                    String[] a2 = c2.split(":");
                    Class942 b2 = Kit.method10547(c2, (boolean)field2385[0]);
                    Kit.method10526().put(Integer.parseInt(a2[(int)field2385[1]]), b2);
                }
                if (g2) {
                    Class1365.method13919("\u00a7fThe kit \u00a7s" + h2 + " \u00a7fhas been loaded!");
                }
                return (int)field2385[0] != 0;
            }
            if (g2) {
                Class1365.method13946("\u00a7cCould not found kit " + h2);
            }
        }
        catch (Exception f2) {
            field2383.clear();
            Kit.method10544("Failed to load kit " + h2);
            Class1365.method13946("\u00a7cFailed to load kit " + h2);
            f2.printStackTrace();
        }
        return (int)field2385[1] != 0;
    }

    private static void method10537(String string) {
        Class3979.method19554(string);
    }

    public static class_746 method10538(class_310 class_3102) {
        return class_3102.field_1724;
    }

    private static Boolean method10539() {
        return (boolean)field2385[1];
    }

    private static boolean method10540() {
        return Class3979.method19543();
    }

    public static String method10541(Class942 class942) {
        return class942.field3953;
    }

    private static boolean method10542(Kit class454, boolean bl2) {
        return class454.method10536(bl2);
    }

    private static int method10543(int n2, int n3, FreeLook class281, Class34 class34) {
        return Class5668.method22232(n2, n3, class281, class34);
    }

    private static void method10544(String string) {
        Class3979.method19554(string);
    }

    private static void method10545(String string) {
        Class3979.method19554(string);
    }

    public static Kit method10546() {
        return INSTANCE;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Class942 method10547(String d2, boolean e2) {
        for (Class942 c2 : Kit.method10550().values()) {
            if (e2) {
                int a2 = d2.indexOf(":");
                String b2 = d2.substring(a2 + (int)field2385[0]);
                if (!Integer.valueOf(b2.hashCode()).equals(Kit.method10541(c2).hashCode())) continue;
                return c2;
            }
            if (Integer.valueOf(d2.hashCode()).equals(c2.field3953.hashCode())) return c2;
        }
        int n2 = e2 ? 5858 : 5859;
        block5: while (true) {
            switch (n2) {
                case 5859: {
                    n2 = 5857;
                    continue block5;
                }
                case 5858: {
                    Class942 class942 = new Class942(d2);
                    return class942;
                }
            }
            break;
        }
        return null;
    }

    public void method10548(String i2) {
        if (Kit.field290.field_1724 == null || Kit.method10535(field290) == null) {
            return;
        }
        try {
            File f2 = new File(Class3979.field9083.field5551, i2 + ".data");
            PrintWriter g2 = new PrintWriter(new OutputStreamWriter((OutputStream)new FileOutputStream(f2), StandardCharsets.UTF_8));
            for (int e2 = (int)field2385[1]; e2 < (int)field2385[2]; ++e2) {
                class_1799 d2 = Kit.field290.field_1724.method_31548().method_5438(e2);
                if (d2.method_7909() instanceof class_1812 || d2.method_7909() instanceof class_1833) {
                    StringBuilder b2 = new StringBuilder();
                    class_1844 c2 = (class_1844)d2.method_57825(class_9334.field_49651, (Object)class_1844.field_49274);
                    for (class_1293 a2 : c2.method_57397()) {
                        b2.append(":").append(a2.method_5586()).append("-").append(a2.method_5578());
                    }
                    g2.println(e2 + ":" + d2.method_7909().method_7876() + String.valueOf(b2));
                    Class5836.method22890();
                    return;
                }
                g2.println(e2 + ":" + d2.method_7909().method_7876());
            }
            g2.close();
            Class1365.method13919("\u00a7fThe kit \u00a7s" + i2 + " \u00a7fhas been saved!");
        }
        catch (Exception h2) {
            Kit.method10537("Failed to save kit " + i2);
            Class1365.method13946("\u00a7cFailed to save kit " + i2);
            h2.printStackTrace();
            return;
        }
        Class4036.method20085(Class6139.field12423, 0.53682053f, 0.9444518f, 0.71424645f, 0.6335565f, Class923.field3915);
    }

    public static class_9331 method10549() {
        return class_9334.field_49651;
    }

    public static HashMap method10550() {
        return field2383;
    }

    public static Class942 method10551(class_1799 c2) {
        StringBuilder d2 = new StringBuilder();
        d2.append(c2.method_7909().method_7876());
        if (!(c2.method_7909() instanceof class_1812) && !(c2.method_7909() instanceof class_1833)) {
            Class4036.method20085(0.3766396f, Class673.field3234, 0.82531136f, 0.2605446f, 0.050899267f, Class1234.field4844);
            return null;
        }
        class_1844 b2 = (class_1844)c2.method_57825(Kit.method10549(), (Object)Kit.method10527());
        for (class_1293 a2 : b2.method_57397()) {
            d2.append(":").append(a2.method_5586()).append("-").append(a2.method_5578());
        }
        return Kit.method10547(d2.toString(), (boolean)field2385[1]);
    }

    private static void method10552(String string) {
        Class1365.method13946(string);
    }

    static {
        field2385 = new long[3];
        Kit.method10529(-9075074535409031909L);
        field2383 = new HashMap();
    }

    private static void method10553() {
        Class1745.method15538();
    }

    private static void method10554() {
        Class1745.method15538();
    }

    public void method10555(String c2) {
        if (Kit.method10538(field290) == null || Kit.field290.field_1687 == null) {
            return;
        }
        try {
            File a2 = new File(Kit.method10530(Class3979.field9083), c2 + ".data");
            if (a2.exists()) {
                this.field2382.method505(c2);
                Kit.method10531(this, (boolean)field2385[0]);
                Class4146.method20694();
                return;
            }
            Class1365.method13946("\u00a7cCould not found kit " + c2);
        }
        catch (Exception b2) {
            Class3979.method19554("Failed to load kit " + c2);
            Class1365.method13946("\u00a7cFailed to load kit " + c2);
            b2.printStackTrace();
        }
    }

    public Kit() {
        super("Kit", "Save your kit", Class556.field2756);
        this.field2386 = this.method450(new Class256(this, "Save", "Save kit from your inventory", (boolean)field2385[0]));
        INSTANCE = this;
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

