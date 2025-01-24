package packing;

public class Rectangle extends twoDshap {
          Rectangle(double w, double h) {

                    width = w;
                    height = h;
          }
          public boolean isSquare() {

                    if (width == height)
                              return true;

                    else
                              return false;
          }

          public double area() {

                    return width * height;
          }
}
