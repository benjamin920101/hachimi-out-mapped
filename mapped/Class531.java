/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import javax.swing.JLabel;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class Class531
extends JLabel {
    private static long[] field2633 = new long[1];
    final BufferedImage field2634;

    private static void method10938(long l2) {
        Class531.field2633[0] = l2 ^ 0x589B0E7175326145L;
    }

    Class531(BufferedImage bufferedImage) {
        this.field2634 = bufferedImage;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String 6jEhEKWk6zgN1wUk(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        block4: while (true) {
            int n3 = n2 < string.length() ? 56012 : 56011;
            block5: while (true) {
                switch (n3) {
                    default: {
                        stringBuilder.append((char)(string.charAt(n2) ^ 0x934DAD53));
                        ++n2;
                        continue block4;
                    }
                    case 56012: {
                        n3 = 56010;
                        continue block5;
                    }
                    case 56011: 
                }
                break;
            }
            break;
        }
        return stringBuilder.toString();
    }

    static {
        Class531.method10938(6384712777188139335L);
    }

    public static CallSite vbYnV9gboaDPLbZi(MethodHandles.Lookup lookup, String string, MethodType methodType, String string2, String string3, String string4, Integer n2) {
        String string5 = string2;
        String string6 = string3;
        String string7 = string4;
        int n3 = n2;
        MethodType methodType2 = MethodType.fromMethodDescriptorString(Class531.6jEhEKWk6zgN1wUk(string7), Class531.class.getClassLoader());
        try {
            if (n3 == 1) {
                return new ConstantCallSite(lookup.findVirtual(Class.forName(Class531.6jEhEKWk6zgN1wUk(string5)), Class531.6jEhEKWk6zgN1wUk(string6), methodType2).asType(methodType));
            }
            return new ConstantCallSite(lookup.findStatic(Class.forName(Class531.6jEhEKWk6zgN1wUk(string5)), Class531.6jEhEKWk6zgN1wUk(string6), methodType2).asType(methodType));
        }
        catch (Exception exception) {
            return null;
        }
    }

    @Override
    protected void paintComponent(Graphics a2) {
        super.paintComponent(a2);
        int b2 = (this.getWidth() - this.field2634.getWidth()) / (int)field2633[0];
        int c2 = (this.getHeight() - this.field2634.getHeight()) / (int)field2633[0];
        a2.drawImage(this.field2634, b2, c2, this);
    }

    private static Object 1(char c2) {
        return ((Object[])1)[c2];
    }
}

