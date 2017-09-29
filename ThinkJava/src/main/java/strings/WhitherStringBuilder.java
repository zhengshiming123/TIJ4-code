package strings;//: strings/WhitherStringBuilder.java


import java.util.ArrayList;
import java.util.List;

public class WhitherStringBuilder {
    public String implicit(String[] fields) {
        long start = System.currentTimeMillis();
        String result = "";
        for (int i = 0; i < fields.length; i++)
            result += fields[i];
        long end = System.currentTimeMillis();
//        return result;
        return String.valueOf((end-start));
    }

    public String explicit(String[] fields) {
        long start = System.currentTimeMillis();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < fields.length; i++)
            result.append(fields[i]);
        long end = System.currentTimeMillis();
//        return result.toString();
        return String.valueOf((end-start));
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList();
        String[] strings = new String[]{"a","b","c","d","e"};
        for (int i = 0; i <100000 ; i++) {
            String a = new String("aa");
            list.add(a);
        }
        String[] toBeStored = list.toArray(new String[list.size()]);
        WhitherStringBuilder w = new WhitherStringBuilder();
        System.out.println(w.explicit(toBeStored));
        System.out.println(w.implicit(toBeStored));

    }
} ///:~
