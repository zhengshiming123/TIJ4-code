package Jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * VM Args：-Xms20m-Xmx20m-XX：+HeapDumpOnOutOfMemoryError
 *  Java堆内存溢出异常测试
 * @author zzm
 */
public class HeapOOM {
    static class OOMObject {
    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();
        while (true) {
            list.add(new OOMObject());
        }
    }
}
