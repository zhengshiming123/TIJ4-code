package holding;//: holding/StackTest.java
import net.mindview.util.*;

public class StackTest {
  public static void main(String[] args) {
    Stack<String> stack = new Stack<String>();
    for(String s : "My dog has fleas".split(" "))
      stack.push(s);
    System.out.println(stack);
    while(!stack.empty())
      System.out.println(stack.pop() + " ");
  }
} /* Output:
fleas has dog My
*///:~
