import java.util.Scanner;

public class loope {
          public static void main(String[] args) {
                    int number;

                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter number of multiply: ");
                    number=scanner.nextInt();
                    int count=1;
                    while (count<=12) {
                              System.out.println(count+"x"+number+" = "+ (count*number));
                              ++count;
                    }

                    /* for (int count =1; count <=12; count ++) {
                              System.out.println(count+"x"+number+" ="+ (count*number));
                    } */

          }
}
