import java.util.Scanner;

public class AreaCalculators {

          public static double calculateArea(double r) {
                    double rrr = Math.PI*(r*r);
                    return rrr;
          }

          public static double calculateArea(double t, double tt) {
                    double ttt = 0.5 * t * tt;
                    return ttt;
          } // 0.5 * t * tt

          public static void main(String[] args) {

                    Scanner scanner = new Scanner(System.in);

                    System.out.println("รับค่า ตัวแปร r เพื่อใช้ใน method ตัวที่ 1");
                    double r = scanner.nextDouble();     

                    System.out.println("ผลลัพธ์" + calculateArea(r));

                    System.out.println("รับค่า ตัวแปร t เพื่อใช้ใน method ตัวที่ 2 ");
                    double t = scanner.nextDouble();

                    System.out.println("รับค่า ตัวแปร tt เพื่อใช้ใน method ตัวที่ 2 ");
                    double tt = scanner.nextDouble();

                    System.out.println("ผลลัพธ์ของ method ตัวที่ 2 คือ " + calculateArea(t, tt));
          }
}
