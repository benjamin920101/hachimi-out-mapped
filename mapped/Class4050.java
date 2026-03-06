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

@HACHIMI_CLIENT(mv=100, d1={"\u8373\u837d\u837d\u837d\u8374\u8371\u837c\u8372", "\ud5de\ud5d5\ud5d9\ud5df\ud5d9\ud5d8\ud5db\ud5d5", "\u0d21\u0d22\u0d28\u0d26\u0d27\u0d26\u0d25\u0d26", "\ua368\ua36c\ua36a\ua36c\ua36c\ua36d\ua36f\ua36b", "\u4d19\u4d18\u4d19\u4d1e\u4d19\u4d16\u4d1a\u4d1b", "\ubdca\ubdcb\ubdcf\ubdcd\ubdcd\ubdcc\ubdc6\ubdc9", "\u2ba6\u2ba3\u2ba1\u2ba6\u2ba1\u2ba5\u2ba3\u2ba0", "\u6ef4\u6ef0\u6ef3\u6ef5\u6ef6\u6ef2\u6ef6\u6ef2", "\u0a18\u0a1a\u0a18\u0a16\u0a1f\u0a1b\u0a1e\u0a16", "\u77af\u77ab\u77ac\u77af\u77a9\u77a8\u77ab\u77a9", "\u0d67\u0d6a\u0d61\u0d62\u0d6b\u0d65\u0d63\u0d61", "\u72e7\u72e1\u72e7\u72e5\u72ec\u72e0\u72e6\u72ec", "\u8a27\u8a24\u8a20\u8a27\u8a25\u8a23\u8a27\u8a26", "\u0d41\u0d41\u0d4a\u0d41\u0d43\u0d4a\u0d43\u0d4a", "\udb02\udb04\udb05\udb02\udb07\udb03\udb0e\udb0e", "\ubc6a\ubc6a\ubc6b\ubc6a\ubc6a\ubc6d\ubc6b\ubc6c", "\u9b81\u9b86\u9b86\u9b8c\u9b82\u9b86\u9b80\u9b82", "\u4779\u477d\u477e\u4776\u477a\u4778\u4779\u477c", "\u6566\u6567\u6566\u6562\u6563\u6561\u6563\u6561", "\u79ce\u79c5\u79ca\u79cf\u79cd\u79cc\u79c9\u79cb", "\ua1e5\ua1e6\ua1e4\ua1e3\ua1e5\ua1ed\ua1e0\ua1e6", "\uc8e0\uc8e2\uc8e4\uc8e0\uc8e6\uc8e4\uc8e0\uc8e6"}, d2={"\u0624\u0608\u0634\u264f\u067d\u067f\u0669\u060d\u062b\u0620\u0637\u0620\u066e\u062d\u0620\u062f\u0626\u066e\u0612\u0635\u0633\u0628\u062f\u0626\u067a\u0668\u060d\u062b\u0620\u0637\u0620\u066e\u062d\u0620\u062f\u0626\u066e\u0612\u0635\u0633\u0628\u062f\u0626\u067a", "\u01af\u0183\u01bc\u21c4\u01f6\u01f4\u01e2\u0186\u01a0\u01ab\u01bc\u01ab\u01e5\u01a6\u01ab\u01a4\u01ad\u01e5\u0199\u01be\u01b8\u01a3\u01a4\u01ad\u01f1\u01e3\u0186\u01a0\u01ab\u01bc\u01ab\u01e5\u01a6\u01ab\u01a4\u01ad\u01e5\u0199\u01be\u01b8\u01a3\u01a4\u01ad\u01f1", "\u025e\u0272\u024c\u2235\u0207\u0205\u0213\u0277\u0251\u025a\u024d\u025a\u0214\u0257\u025a\u0255\u025c\u0214\u0268\u024f\u0249\u0252\u0255\u025c\u0200\u0212\u0277\u0251\u025a\u024d\u025a\u0214\u0257\u025a\u0255\u025c\u0214\u0268\u024f\u0249\u0252\u0255\u025c\u0200", "\u060c\u0620\u0611\u2667\u0655\u0657\u0641\u0625\u0603\u0608\u061f\u0608\u0646\u0605\u0608\u0607\u060e\u0646\u063a\u061d\u061b\u0600\u0607\u060e\u0652\u0640\u0625\u0603\u0608\u061f\u0608\u0646\u0605\u0608\u0607\u060e\u0646\u063a\u061d\u061b\u0600\u0607\u060e\u0652", "\u0545\u0569\u0559\u252e\u051c\u051e\u0508\u056c\u054a\u0541\u0556\u0541\u050f\u054c\u0541\u054e\u0547\u050f\u0573\u0554\u0552\u0549\u054e\u0547\u051b\u0509\u056c\u054a\u0541\u0556\u0541\u050f\u054c\u0541\u054e\u0547\u050f\u0573\u0554\u0552\u0549\u054e\u0547\u051b", "\u0246\u026a\u0259\u222d\u021f\u021d\u020b\u026f\u0249\u0242\u0255\u0242\u020c\u024f\u0242\u024d\u0244\u020c\u0270\u0257\u0251\u024a\u024d\u0244\u0218\u020a\u026f\u0249\u0242\u0255\u0242\u020c\u024f\u0242\u024d\u0244\u020c\u0270\u0257\u0251\u024a\u024d\u0244\u0218", "\u07a9\u0785\u078d\u27c2\u07f0\u07f2\u07e4\u0780\u07a6\u07ad\u07ba\u07ad\u07e3\u07a0\u07ad\u07a2\u07ab\u07e3\u079f\u07b8\u07be\u07a5\u07a2\u07ab\u07f7\u07e5\u0780\u07a6\u07ad\u07ba\u07ad\u07e3\u07a0\u07ad\u07a2\u07ab\u07e3\u079f\u07b8\u07be\u07a5\u07a2\u07ab\u07f7", "\u049f\u04b3\u04b8\u24f4\u04c6\u04c4\u04d2\u04b6\u0490\u049b\u048c\u049b\u04d5\u0496\u049b\u0494\u049d\u04d5\u04a9\u048e\u0488\u0493\u0494\u049d\u04c1\u04d3\u04b6\u0490\u049b\u048c\u049b\u04d5\u0496\u049b\u0494\u049d\u04d5\u04a9\u048e\u0488\u0493\u0494\u049d\u04c1", "\u0516\u0549\u0546\u0543\u0544\u0543\u055e\u0514\u0516\u0514\u0502\u0503\u057c", "\u010f\u015a\u015d\u015a\u0147\u010d\u010f\u010d\u011b\u011a\u0165", "\u05e2\u05e0\u05f1\u05c6\u05e9\u05e4\u05f6\u05f6\u05b9\u05bb\u05ad\u05ac\u05c9\u05ef\u05e4\u05f3\u05e4\u05aa\u05e9\u05e4\u05eb\u05e2\u05aa\u05c6\u05e9\u05e4\u05f6\u05f6\u05be", "\u075a\u0753\u0741\u075a\u0771\u075d\u0756\u0757\u070e\u070c\u071a\u071b\u077b", "\u04a2\u04b6\u04b2\u04a6\u04ab\u04b4\u04fb\u04f9\u04ef\u048b\u04ad\u04a6\u04b1\u04a6\u04e8\u04ab\u04a6\u04a9\u04a0\u04e8\u0488\u04a5\u04ad\u04a2\u04a4\u04b3\u04fc\u04ee\u049d", "\u0655\u065a\u0659\u0658\u0653\u060a\u0608\u061e\u061f\u067a\u065c\u0657\u0640\u0657\u0619\u065a\u0657\u0658\u0651\u0619\u0679\u0654\u065c\u0653\u0655\u0642\u060d", "\u03ec\u03f7\u03cb\u03ec\u03ea\u03f1\u03f6\u03ff\u03a4\u03a6\u03b0\u03b1\u03d4\u03f2\u03f9\u03ee\u03f9\u03b7\u03f4\u03f9\u03f6\u03ff\u03b7\u03cb\u03ec\u03ea\u03f1\u03f6\u03ff\u03a3", "\u04f9\u04f8\u04e3\u04fe\u04f1\u04ee\u04ab\u04a9\u04bf\u04be\u04c1", "\u03ca\u03cb\u03d0\u03cd\u03c2\u03dd\u03e5\u03c8\u03c8\u0398\u039a\u038c\u038d\u03f2", "\u06b4\u06a2\u06aa\u06b7\u06ff\u06fd\u06eb\u06ea\u0695", "\u01a2\u01b4\u01bc\u01a1\u01e9\u01eb\u01fd\u019f\u01fc\u0183", "\u0267\u0271\u0279\u0264\u0220\u022c\u022e\u0238\u025a\u0239\u0246", "\u0119\u010f\u0107\u011a\u0152\u0150\u0146\u0124\u0127\u0147\u0138", "\u075b\u0754\u0753\u075c\u0751\u0754\u0747\u0758\u0701\u0703\u0715\u0714\u076b"})
public final class Class4050 {
    public static double field9338 = 0.12969238332435518;
    public static int field9339 = 666471402;
    public static double field9340;
    public static float field9341;
    public static double field9342;
    public static long field9343 = 0xFFFFFFFFL;
    public static int field9344 = 1774611289;
    public static double field9345;
    public static float field9346;
    public static double field9347;

    /*
     * WARNING - void declaration
     */
    private static CallSite zLkv2uPOVg3v9I(MethodHandles.Lookup h2, String i2, MethodType j2, String k2, Integer l2, Integer m2, Integer n2) {
        MethodHandle v2;
        Class<?> o2 = Class.forName(Class4050.O77Ivmq4INjn47XY(k2, -677483915));
        HACHIMI_CLIENT p2 = o2.getAnnotation(HACHIMI_CLIENT.class);
        if (p2.mv() < 100) {
            throw new Exception("Outdated metadata version");
        }
        String[] q2 = p2.d1();
        String[] r2 = p2.d2();
        String s2 = "";
        String t2 = "";
        for (int f2 = 0; f2 < q2.length; ++f2) {
            void e2;
            try {
                int a2 = Integer.parseInt(Class4050.O77Ivmq4INjn47XY(q2[f2], m2));
            }
            catch (NumberFormatException b2) {
                continue;
            }
            if (e2 % 59557 != m2.intValue()) continue;
            String c2 = Class4050.O77Ivmq4INjn47XY(r2[f2], l2);
            String[] d2 = c2.split("<>");
            s2 = d2[0];
            t2 = d2[1];
            break;
        }
        if (s2.isEmpty()) {
            throw new Exception("Can't find method in " + Class4050.O77Ivmq4INjn47XY(k2, -677483915) + " " + l2 + " " + m2);
        }
        MethodType u2 = MethodType.fromMethodDescriptorString(t2, o2.getClassLoader());
        if (n2 == 1) {
            MethodHandle g2 = h2.findVirtual(o2, s2, u2);
        } else {
            v2 = h2.findStatic(o2, s2, u2);
        }
        return new ConstantCallSite(v2.asType(j2));
    }

    private static String O77Ivmq4INjn47XY(String a2, int b2) {
        StringBuilder c2 = new StringBuilder();
        for (int d2 = 0; d2 < a2.length(); ++d2) {
            c2.append((char)(a2.charAt(d2) ^ b2));
        }
        return c2.toString();
    }

    static {
        l\u200e = "";
        D\u200e = "ClosestAngle";
        field9342 = Double.longBitsToDouble(4605847889805165035L);
        M\u200e = "SELECTOR";
        field9340 = Double.longBitsToDouble(4600682160364936888L);
        field9346 = Float.intBitsToFloat(1056818494);
        field9341 = Float.intBitsToFloat(1060751378);
        aN\u200e = "Limit";
        aO\u200e = "Fireworks";
        field9345 = Double.longBitsToDouble(4602678819172646912L);
        bv\u200e = "Press to throw out the Strength potion";
        field9347 = Double.longBitsToDouble(4604882096471898186L);
        bU\u200e = "Width";
        bW\u200e = "AttackDelay";
    }
}

