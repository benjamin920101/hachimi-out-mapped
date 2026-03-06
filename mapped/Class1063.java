/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import mapped.Class1503;
import mapped.Class4196;
import mapped.Class5659;
import mapped.Class634;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class1063 {
    private static long[] field4344 = new long[2];

    private static boolean method12893(File b2) {
        try {
            if (!Desktop.isDesktopSupported()) {
                return (int)field4344[1] != 0;
            }
            if (!Desktop.getDesktop().isSupported(Desktop.Action.EDIT)) {
                return (int)field4344[1] != 0;
            }
            Desktop.getDesktop().edit(b2);
            return (int)field4344[0] != 0;
        }
        catch (Throwable a2) {
            a2.printStackTrace();
            return (int)field4344[1] != 0;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean method12894(String a2) {
        Class634 b2 = Class1063.method12905();
        if (b2.method11414()) {
            if (Class1063.method12903("kde-open", "%s", a2)) {
                return (int)field4344[0] != 0;
            }
            int n2 = Class1063.method12903("gnome-open", "%s", a2) ? 49722 : 49723;
            block4: while (true) {
                switch (n2) {
                    case 49723: {
                        n2 = 49721;
                        continue block4;
                    }
                    case 49722: {
                        return (int)field4344[0] != 0;
                    }
                }
                break;
            }
            if (Class1063.method12903("xdg-open", "%s", a2)) {
                return (int)field4344[0] != 0;
            }
        }
        if (b2.method11420() && Class1063.method12903("open", "%s", a2)) {
            return (int)field4344[0] != 0;
        }
        if (b2.method11418()) {
            return Class1063.method12903("explorer", "%s", a2);
        }
        return (int)field4344[1] != 0;
    }

    private static String[] method12895(String b2, String c2, String d2) {
        ArrayList<String> e2 = new ArrayList<String>();
        e2.add(b2);
        if (c2 != null) {
            String[] stringArray = c2.split(" ");
            int n2 = stringArray.length;
            for (int i2 = (int)field4344[1]; i2 < n2; ++i2) {
                String a2 = stringArray[i2];
                Object[] objectArray = new Object[(int)field4344[0]];
                objectArray[(int)Class1063.field4344[1]] = d2;
                a2 = String.format(a2, objectArray);
                e2.add(a2.trim());
            }
        }
        return e2.toArray(new String[(int)field4344[1]]);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean method12896(File a2) {
        int n2 = Class1063.method12894(a2.getPath()) ? 6951 : 6952;
        block4: while (true) {
            switch (n2) {
                case 6952: {
                    n2 = 6950;
                    continue block4;
                }
                case 6951: {
                    return (int)field4344[0] != 0;
                }
            }
            break;
        }
        return Class1063.method12893(a2);
    }

    private static boolean method12897() {
        return Class5659.method22194();
    }

    public static Desktop.Action method12898() {
        return Desktop.Action.BROWSE;
    }

    private static void method12899(long l2) {
        Class1063.field4344[0] = l2 ^ 0xE5C06BAF8EDB39EAL;
        Class1063.field4344[1] = l2 ^ 0xE5C06BAF8EDB39EBL;
    }

    static {
        Class1063.method12899(-1891393441735427605L);
    }

    private static boolean method12900(URI b2) {
        try {
            if (!Desktop.isDesktopSupported()) {
                return (int)field4344[1] != 0;
            }
            if (!Desktop.getDesktop().isSupported(Class1063.method12898())) {
                return (int)field4344[1] != 0;
            }
            Desktop.getDesktop().browse(b2);
            return (int)field4344[0] != 0;
        }
        catch (Throwable a2) {
            return (int)field4344[1] != 0;
        }
    }

    private static boolean method12901(int n2) {
        return Class4196.method20803(n2);
    }

    private static boolean method12902(double d2, double d3, double d4, double d5) {
        return Class5659.method22188(d2, d3, d4, d5);
    }

    private static boolean method12903(String e2, String f2, String g2) {
        String[] h2 = Class1063.method12895(e2, f2, g2);
        try {
            Process c2 = Runtime.getRuntime().exec(h2);
            if (c2 == null) {
                return (int)field4344[1] != 0;
            }
            try {
                int a2 = c2.exitValue();
                return (int)field4344[1] != 0;
            }
            catch (IllegalThreadStateException b2) {
                return (int)field4344[0] != 0;
            }
        }
        catch (IOException d2) {
            return (int)field4344[1] != 0;
        }
    }

    private static boolean method12904(File b2) {
        try {
            if (!Desktop.isDesktopSupported()) {
                return (int)field4344[1] != 0;
            }
            if (!Desktop.getDesktop().isSupported(Desktop.Action.OPEN)) {
                return (int)field4344[1] != 0;
            }
            Desktop.getDesktop().open(b2);
            return (int)field4344[0] != 0;
        }
        catch (Throwable a2) {
            return (int)field4344[1] != 0;
        }
    }

    public static Class634 method12905() {
        String a2 = System.getProperty("os.name").toLowerCase();
        if (a2.contains("win")) {
            return Class634.field3097;
        }
        if (a2.contains("mac")) {
            return Class634.field3099;
        }
        if (a2.contains("solaris")) {
            return Class634.field3100;
        }
        if (a2.contains("sunos")) {
            return Class634.field3100;
        }
        if (a2.contains("linux")) {
            return Class634.field3098;
        }
        if (a2.contains("unix")) {
            return Class634.field3098;
        }
        return Class634.field3102;
    }

    private static boolean method12906() {
        return Class5659.method22194();
    }

    private static void method12907(float f2, float f3) {
        Class1503.method14417(f2, f3);
    }

    private static boolean method12908(String string) {
        return Class1063.method12894(string);
    }

    public static boolean method12909(File a2) {
        if (Class1063.method12894(a2.getPath())) {
            return (int)field4344[0] != 0;
        }
        return Class1063.method12904(a2);
    }

    public static boolean method12910(URI a2) {
        if (Class1063.method12908(a2.toString())) {
            return (int)field4344[0] != 0;
        }
        return Class1063.method12900(a2);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

