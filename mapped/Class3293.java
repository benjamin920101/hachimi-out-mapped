/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.util.LinkedList;
import mapped.Class4045;
import mapped.Class6454;
import mapped.Class889;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Class3293 {
    private final LinkedList field7085 = new LinkedList();
    private static long[] field7086 = new long[1];

    static {
        Class3293.method16845(648238876707742870L);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int method16841() {
        long b2 = System.currentTimeMillis();
        try {
            if (this.field7085.isEmpty()) return this.field7085.size();
            if (this.field7085.peek() == null) return this.field7085.size();
            int n2 = (Long)this.field7085.peek() < b2 ? 57442 : 57443;
            while (true) {
                int n3;
                if ((n3 = n2) == 57442) {
                    return Class4045.method20100(-1927315721, Class889.field3820);
                }
                if (n3 != 57443) {
                    return this.field7085.size();
                }
                n2 = 57441;
            }
        }
        catch (Exception a2) {
            this.field7085.clear();
            a2.printStackTrace();
        }
        return this.field7085.size();
    }

    private static int method16842(int n2) {
        return Class4045.method20095(n2);
    }

    private static int method16843() {
        return Class6454.method24637();
    }

    private static int method16844(int n2) {
        return Class4045.method20103(n2);
    }

    private static void method16845(long l2) {
        Class3293.field7086[0] = l2 ^ 0x8FF01D2E7C3677EL;
    }

    private static int method16846() {
        return Class6454.method24637();
    }

    private static int method16847(int n2, float f2) {
        return Class4045.method20100(n2, f2);
    }

    public void method16848() {
        this.field7085.add(System.currentTimeMillis() + field7086[0]);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

