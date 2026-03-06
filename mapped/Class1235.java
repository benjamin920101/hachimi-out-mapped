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

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@HACHIMI_CLIENT(mv=100, d1={"\ua95d\ua95d\ua95b\ua95b\ua95a\ua95d\ua95c\ua95d", "\u13ab\u13ac\u13a9\u13af\u13af\u13a8\u13ab\u13a8", "\u6f85\u6f87\u6f87\u6f81\u6f80\u6f8f\u6f86\u6f8f", "\u09e7\u09e1\u09e1\u09e1\u09ec\u09e4\u09e0\u09e1", "\u40f8\u40fe\u40f8\u40f8\u40f8\u40f3\u40f3\u40f3", "\u5d9c\u5d91\u5d90\u5d9b\u5d9c\u5d91\u5d9c\u5d99", "\ud3e4\ud3e9\ud3e0\ud3e6\ud3e9\ud3e6\ud3e3\ud3e5", "\u91a0\u91a4\u91a2\u91a2\u91a6\u91a3\u91a3\u91aa", "\u585b\u585a\u5858\u5857\u585b\u5857\u5858\u585a", "\u5b93\u5b92\u5b98\u5b97\u5b94\u5b92\u5b96\u5b90", "\u90de\u90df\u90dc\u90dc\u90de\u90da\u90da", "\u8cf2\u8cf2\u8cf1\u8cf8\u8cf1\u8cf0\u8cf7\u8cf9", "\ue205\ue205\ue20a\ue207\ue203\ue207\ue202\ue20b", "\uba04\uba05\uba03\uba0a\uba02\uba07\uba02", "\uc6f9\uc6fd\uc6f9\uc6f8\uc6fa\uc6fe\uc6fb", "\u7589\u7589\u7584\u7585\u7588\u758a\u758c\u758a"}, d2={"\u057e\u0568\u054f\u2502\u0530\u0532\u0524\u0540\u0566\u056d\u057a\u056d\u0523\u0560\u056d\u0562\u056b\u0523\u055f\u0578\u057e\u0565\u0562\u056b\u0537\u0525\u0540\u0566\u056d\u057a\u056d\u0523\u0560\u056d\u0562\u056b\u0523\u055f\u0578\u057e\u0565\u0562\u056b\u0537", "\u0571\u0567\u0547\u250d\u053f\u053d\u052b\u054f\u0569\u0562\u0575\u0562\u052c\u056f\u0562\u056d\u0564\u052c\u0550\u0577\u0571\u056a\u056d\u0564\u0538\u052a\u054f\u0569\u0562\u0575\u0562\u052c\u056f\u0562\u056d\u0564\u052c\u0550\u0577\u0571\u056a\u056d\u0564\u0538", "\u04aa\u04f5\u04fa\u04ff\u04f8\u04ff\u04e2\u04a8\u04aa\u04a8\u04be\u04bf\u04c0", "\u0530\u0565\u0562\u0565\u0578\u0532\u0530\u0532\u0524\u0525\u055a", "\u025c\u025e\u024f\u0278\u0257\u025a\u0248\u0248\u0207\u0205\u0213\u0212\u0277\u0251\u025a\u024d\u025a\u0214\u0257\u025a\u0255\u025c\u0214\u0278\u0257\u025a\u0248\u0248\u0200", "\u03dc\u03d5\u03c7\u03dc\u03f7\u03db\u03d0\u03d1\u0388\u038a\u039c\u039d\u03fd", "\u06d6\u06c2\u06c6\u06d2\u06df\u06c0\u068f\u068d\u069b\u06ff\u06d9\u06d2\u06c5\u06d2\u069c\u06df\u06d2\u06dd\u06d4\u069c\u06fc\u06d1\u06d9\u06d6\u06d0\u06c7\u0688\u069a\u06e9", "\u0106\u0109\u010a\u010b\u0100\u0159\u015b\u014d\u014c\u0129\u010f\u0104\u0113\u0104\u014a\u0109\u0104\u010b\u0102\u014a\u012a\u0107\u010f\u0100\u0106\u0111\u015e", "\u01bc\u01a7\u019b\u01bc\u01ba\u01a1\u01a6\u01af\u01f4\u01f6\u01e0\u01e1\u0184\u01a2\u01a9\u01be\u01a9\u01e7\u01a4\u01a9\u01a6\u01af\u01e7\u019b\u01bc\u01ba\u01a1\u01a6\u01af\u01f3", "\u0778\u0779\u0762\u077f\u0770\u076f\u072a\u0728\u073e\u073f\u0740", "\u033c\u033d\u0326\u033b\u0334\u032b\u0313\u033e\u033e\u036e\u036c\u037a\u037b\u0304", "\u07cb\u07dd\u07d5\u07c8\u0780\u0782\u0794\u0795\u07ea", "#5= hj|\u001e}\u0002", "\u03bb\u03ad\u03a5\u03b8\u03fc\u03f0\u03f2\u03e4\u0386\u03e5\u039a", "\u07b4\u07a2\u07aa\u07b7\u07ff\u07fd\u07eb\u0789\u078a\u07ea\u0795", "\u05cd\u05c2\u05c5\u05ca\u05c7\u05c2\u05d1\u05ce\u0597\u0595\u0583\u0582\u05fd"})
public final class Class1235 {
    public static double field4847 = 0.14968618875918305;
    public static double field4848 = Double.longBitsToDouble(0x4000000000000000L);

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static CallSite cgOjaIXucoO4Y1(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class1235.4K5fi05CU4gelB4p(k2, -937025015));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        int n3 = p2.mv() < 100 ? 34670 : 34671;
        block10: while (true) {
            switch (n3) {
                case 34671: {
                    n3 = 34669;
                    continue block10;
                }
                case 34670: {
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
                int a2 = Integer.parseInt(Class1235.4K5fi05CU4gelB4p(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class1235.4K5fi05CU4gelB4p(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class1235.4K5fi05CU4gelB4p(k2, -937025015) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        int n4 = n2 != 1 ? 7754 : 7753;
        block12: while (true) {
            switch (n4) {
                case 7754: {
                    n4 = 7752;
                    continue block12;
                }
                case 7753: {
                    MethodHandle g2 = h2.findVirtual(o2, s2, u2);
                    return new ConstantCallSite(v2.asType(j2));
                }
            }
            break;
        }
        v2 = h2.findStatic(o2, s2, u2);
        return new ConstantCallSite(v2.asType(j2));
    }

    static {
        k\u200e = "Scale";
        aB\u200e = "Prevents tridents from rendering";
    }

    private static String 4K5fi05CU4gelB4p(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }
}

