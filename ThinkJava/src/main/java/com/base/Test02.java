package com.base;

import typeinfo.interfacea.A;

/**
 * Created by h on 2017/10/11.
 */
public class Test02 extends Test01 {

    public static void main(String[] args) {
        float f = 3.4343f;
        AutoUnboxingTest a = new AutoUnboxingTest();

    }
}

class AutoUnboxingTest {

    public static void main(String[] args) {
        Integer a = new Integer(3);
        Integer b = 3;                  // 将3自动装箱成Integer类型
        int c = 3;
        System.out.println(a == b);     // false 两个引用没有引用同一对象
        System.out.println(a == c);     // true a自动拆箱成int类型再和c比较
    }
}

class Test002 {

    public static void main(String[] args) {
        Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;

        System.out.println(f1 == f2);
        System.out.println(f3 == f4);
    }
}

class Test021 {

    private static int a = 0;

    public static void main(String[] args) {
        A:
        for (int i = 0; i < 3; i++) {
            ok:
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    a++;
                    if (a == 3) {
                        break A;
                    }

                }
            }
            a = 10;
        }
        System.out.println(a);


    }
}

class StringEqualTest {
    public static void main(String[] args) {
        String s1 = "Programming";
        String s2 = new String("Programming");
        String s3 = "Program" + "ming";
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s1.intern());
    }
}