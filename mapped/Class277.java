/*
 * Decompiled with CFR 0.152.
 */
package mapped;

import java.text.DecimalFormat;
import mapped.Class1365;
import mapped.Class244;
import mapped.Class556;

public class Class277
extends Class244 {
    private final Class556 field392;
    private final String field393;
    public static final String field394 = "%s-module";
    protected static final DecimalFormat field395;
    private static long[] field396;

    public Class277(String a2, String b2, Class556 c2) {
        super(a2);
        this.field393 = b2;
        this.field392 = c2;
    }

    public Class556 method1247() {
        return this.field392;
    }

    public String method1248() {
        return "ARRAYLIST_INFO";
    }

    @Override
    public String method472() {
        Object[] objectArray = new Object[(int)field396[0]];
        objectArray[(int)Class277.field396[1]] = this.field291.toLowerCase();
        return String.format("%s-module", objectArray);
    }

    protected void method1249(String a2, Object ... b2) {
        Class277.method1255(this, String.format(a2, b2));
    }

    protected void method1250(String a2) {
        Object[] objectArray = new Object[(int)field396[2]];
        objectArray[(int)Class277.field396[1]] = this.field291;
        objectArray[(int)Class277.field396[0]] = a2;
        Class1365.method13947("\u00a7s[%s]\u00a7f %s", objectArray);
    }

    protected void method1251(String a2) {
        Object[] objectArray = new Object[(int)field396[2]];
        objectArray[(int)Class277.field396[1]] = this.field291;
        objectArray[(int)Class277.field396[0]] = a2;
        Class1365.method13947("\u00a7s[%s]\u00a7c %s", objectArray);
    }

    private static void method1252(long l2) {
        Class277.field396[0] = l2 ^ 0xE633C144C9293496L;
        Class277.field396[2] = l2 ^ 0xE633C144C9293495L;
        Class277.field396[1] = l2 ^ 0xE633C144C9293497L;
    }

    static {
        field396 = new long[3];
        Class277.method1252(-1858929719997025129L);
        field395 = new DecimalFormat("0.0");
    }

    public String method1253() {
        return this.field393;
    }

    protected void method1254(String a2, Object ... b2) {
        this.method1250(String.format(a2, b2));
    }

    private static void method1255(Class277 class277, String string) {
        class277.method1251(string);
    }
}

