package Jvm;

import java.util.Random;

/**
 * Created by h on 2017/9/26.
 */
public class StringIn {

    static final int MAX = 100000;
    static final String[] arr = new String[MAX];

    public static void main(String[] args) throws Exception {
        //为长度为10的Integer数组随机赋值
        Integer[] sample = new Integer[10];
        Random random = new Random(1000);
        for (int i = 0; i < sample.length; i++) {
            sample[i] = random.nextInt();
        }
        //记录程序开始时间
        long t = System.currentTimeMillis();
        //使用/不使用intern方法为10万个String赋值，值来自于Integer数组的10个数
        for (int i = 0; i < MAX; i++) {
            //arr[i] = new String(String.valueOf(sample[i % sample.length]));
            arr[i] = new String(String.valueOf(sample[i % sample.length])).intern();
        }
        System.out.println((System.currentTimeMillis() - t) + "ms");

        String str1 = new String("SEU") + new String("Calvin");
        String str2 = "SEUCalvin";
        System.out.println(str1.intern() == str1);
        System.out.println(str1 == "SEUCalvin");

    }
}
