package containers.ThisTest;

import java.util.*;

/**
 * Created by h on 2017/9/28.
 */
public class Test01 {

    public static void main(String[] args) {

//        List<>
//        Collections.nCopies()
//        Collections.fill();
        Map map = new HashMap();

        map.put("a","ac");
        map.put("b","bc");
        Iterator iterator = map.entrySet().iterator();
        Set set = map.keySet();
        Iterator iterator1 = set.iterator();
        while(iterator.hasNext()) {

            Map.Entry entry = (Map.Entry) iterator.next();

//            Object key = entry.getKey();

            System.out.println(entry);
            //

        }

        while(iterator1.hasNext()) {
            Object next = iterator1.next();
            Object o = map.get(next);
            System.out.println(o);
        }
    }
}
