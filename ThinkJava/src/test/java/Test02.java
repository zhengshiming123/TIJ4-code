import java.util.HashMap;
import java.util.Map;

/**
 * Created by h on 2017/9/20.
 */
public class Test02 {

    public Test02(String s) {

    }

    public static void main(String[] args) {
        /*Map<Test01, String> map = new HashMap<Test01, String>();
        map.put(new Test01("001"), "002");
        System.out.println(map.keySet());*/
        Map<Integer, Integer> a = new HashMap<Integer, Integer>();

        for (int i = 0; i < 200000; i++) {

            a.put((int) (Math.random()*20), i);
        }
        System.gc();
        System.out.println(a);
    }
}
