package packing;

public class tringle extends twoDshap {
          public String style;

          tringle(String s, double w, double h) {

                    style = s;
                    width = w;
                    height = h;
          }

          public double area() {
                    return width * height;
          }

          public void showStyle() {
                    System.out.println("Triangle is : " + style);
          }
}
