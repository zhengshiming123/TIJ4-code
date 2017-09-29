import java.io.Serializable;
import java.util.*;

/**
 * Created by h on 2017/9/20.
 */
public class Test01 {



    private String name;

    public Test01(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        List list = new ArrayList();
        List<? extends Serializable> a = Arrays.asList(1, 2, "23");

        Stack<String> s = new Stack<String>();
        String[] string = new String[]{"A", "B", "C"};
        for (String s1 : string) {
            s.push(s1);
        }
        System.out.println(s);
        while (!s.isEmpty())
            System.out.println(s.pop());

        Random rand = new Random(47);
        Set<Integer> intset = new HashSet<Integer>();
        for(int i = 0; i < 10000; i++)
            intset.add(rand.nextInt(30));
        System.out.println(intset);
//        TreeMap
//        TreeSet
    }


}
