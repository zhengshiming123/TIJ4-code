package polymorphism;//: polymorphism/Shapes.java
// Polymorphism in Java.
import polymorphism.shape.*;

public class Shapes {
  private static RandomShapeGenerator gen =
    new RandomShapeGenerator();
  public static void main(String[] args) {
    Shape[] s = new Shape[9];
    // Fill up the array with shapes:
    System.out.println("====="+s);
    for(int i = 0; i < s.length; i++){

      s[i] = gen.next();
      System.out.println(s[i].toString());
    }
    // Make polymorphic method calls:
    for(Shape shp : s){

      System.out.println(shp.toString());
      shp.draw();
    }
  }
} /* Output:
Triangle.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Circle.draw()
*///:~
