/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.hachimi.HACHIMI_CLIENT;

@HACHIMI_CLIENT(mv=100, d1={"\uc6a5\uc6a2\uc6a1\uc6aa\uc6a5\uc6a4\uc6a7\uc6a3", "\u6dba\u6db7\u6dbc\u6dbc\u6dbb\u6dbc\u6dba\u6dbf", "\u1974\u1970\u1979\u1976\u1978\u1973\u1975", "\u52f7\u52f4\u52f1\u52f4\u52f0\u52f3\u52f2\u52fa", "\u7552\u7555\u7552\u7552\u7552\u7556\u7555\u7559", "\u5d82\u5d82\u5d8f\u5d8e\u5d8f\u5d83\u5d84\u5d83", "\u8074\u8079\u8078\u8072\u8075\u8076\u8071\u8077", "\uaca6\uaca1\uaca0\uaca9\uaca0\uaca1\uaca0\uaca1", "\u9f0f\u9f0a\u9f0e\u9f0e\u9f0a\u9f02\u9f02\u9f09", "\u1e50\u1e50\u1e54\u1e5f\u1e56\u1e5f", "\u510d\u510d\u5105\u5105\u510d\u510b\u5109\u510f", "\u7968\u796f\u7968\u7962\u7969\u7968\u7969\u796e", "\u48a9\u48a1\u48aa\u48ac\u48ac\u48a8\u48a0", "\u3c98\u3c9e\u3c9d\u3c93\u3c9b\u3c98\u3c9e\u3c98", "\u2ae4\u2ae1\u2ae3\u2ae6\u2ae3\u2aee\u2aee", "\u4093\u4096\u4093\u4094\u4096\u4093\u4091\u4094", "\ub5d1\ub5d3\ub5d2\ub5dd\ub5d3\ub5d3\ub5d0\ub5d4"}, d2={"\u01d0\u01e7\u01d9\u21ae\u019c\u019e\u0188\u01ec\u01ca\u01c1\u01d6\u01c1\u018f\u01cc\u01c1\u01ce\u01c7\u018f\u01f3\u01d4\u01d2\u01c9\u01ce\u01c7\u019b\u0189\u01ec\u01ca\u01c1\u01d6\u01c1\u018f\u01cc\u01c1\u01ce\u01c7\u018f\u01f3\u01d4\u01d2\u01c9\u01ce\u01c7\u019b", "\u01c5\u01f2\u01cf\u21bb\u0189\u018b\u019d\u01f9\u01df\u01d4\u01c3\u01d4\u019a\u01d9\u01d4\u01db\u01d2\u019a\u01e6\u01c1\u01c7\u01dc\u01db\u01d2\u018e\u019c\u01f9\u01df\u01d4\u01c3\u01d4\u019a\u01d9\u01d4\u01db\u01d2\u019a\u01e6\u01c1\u01c7\u01dc\u01db\u01d2\u018e", "\u0176\u0141\u0147\u2108\u013a\u0138\u012e\u014a\u016c\u0167\u0170\u0167\u0129\u016a\u0167\u0168\u0161\u0129\u0155\u0172\u0174\u016f\u0168\u0161\u013d\u012f\u014a\u016c\u0167\u0170\u0167\u0129\u016a\u0167\u0168\u0161\u0129\u0155\u0172\u0174\u016f\u0168\u0161\u013d", "\u03f7\u03a8\u03a7\u03a2\u03a5\u03a2\u03bf\u03f5\u03f7\u03f5\u03e3\u03e2\u039d", "\u0700\u0755\u0752\u0755\u0748\u0702\u0700\u0702\u0714\u0715\u076a", "\u02b1\u02b3\u02a2\u0295\u02ba\u02b7\u02a5\u02a5\u02ea\u02e8\u02fe\u02ff\u029a\u02bc\u02b7\u02a0\u02b7\u02f9\u02ba\u02b7\u02b8\u02b1\u02f9\u0295\u02ba\u02b7\u02a5\u02a5\u02ed", "\u06dc\u06d5\u06c7\u06dc\u06f7\u06db\u06d0\u06d1\u0688\u068a\u069c\u069d\u06fd", "\u00ba\u00ae\u00aa\u00be\u00b3\u00ac\u00e3\u00e1\u00f7\u0093\u00b5\u00be\u00a9\u00be\u00f0\u00b3\u00be\u00b1\u00b8\u00f0\u0090\u00bd\u00b5\u00ba\u00bc\u00ab\u00e4\u00f6\u0085", "\u0254\u025b\u0258\u0259\u0252\u020b\u0209\u021f\u021e\u027b\u025d\u0256\u0241\u0256\u0218\u025b\u0256\u0259\u0250\u0218\u0278\u0255\u025d\u0252\u0254\u0243\u020c", "f}Af`{|u.,:;^xsds=~s|u=Af`{|u)", "\b\t\u0012\u000f\u0000\u001fZXNO0", "\u064e\u064f\u0654\u0649\u0646\u0659\u0661\u064c\u064c\u061c\u061e\u0608\u0609\u0676", "\u0518\u050e\u0506\u051b\u0553\u0551\u0547\u0546\u0539", "\u033b\u032d\u0325\u0338\u0370\u0372\u0364\u0306\u0365\u031a", "\u02a8\u02be\u02b6\u02ab\u02ef\u02e3\u02e1\u02f7\u0295\u02f6\u0289", "\u0577\u0561\u0569\u0574\u053c\u053e\u0528\u054a\u0549\u0529\u0556", "\u04e1\u04ee\u04e9\u04e6\u04eb\u04ee\u04fd\u04e2\u04bb\u04b9\u04af\u04ae\u04d1"})
public final class Class1476 {
    public static int field5588 = 555601247;
    public static double field5589;
    public static double field5590 = -1.0;
    public static float field5591;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite PgXeB6LZqA41tr(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1476.mNSL9aPaFg4QMMgQ(k2, -439457319));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        int n3 = p2.mv() < 100 ? 57107 : 57108;
        block6: while (true) {
            switch (n3) {
                case 57108: {
                    n3 = 57106;
                    continue block6;
                }
                case 57107: {
                    throw new Exception("Outdated metadata version");
                }
            }
            break;
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class1476.mNSL9aPaFg4QMMgQ(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1476.mNSL9aPaFg4QMMgQ(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1476.mNSL9aPaFg4QMMgQ(k2, -439457319) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 != 1) {
            v2 = h2.findStatic(o2, s2, u2);
            return new ConstantCallSite(v2.asType(j2));
        }
        MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        field5591 = Float.intBitsToFloat(1060559726);
        H\u200e = "Logs UpdateSelectedSlotC2SPacket";
        ab\u200e = "Swap";
        ar\u200e = "TileEntities";
        field5589 = Double.longBitsToDouble(4601104522872504772L);
    }

    private static String mNSL9aPaFg4QMMgQ(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

