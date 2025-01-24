import java.util.Scanner;

public class BMI {
          public static void main(String[] args) {
                    double w;
                    double h;
                    double bmi;

                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter weight: ");
                    w=scanner.nextDouble();

                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Enter high: ");
                    h=scanner2.nextDouble();

                    bmi = w/(h*h);

                    

                    if (bmi < 18.5) {
                              System.out.println("Underweight.");
                    }
                    else if ((bmi>=18.5) && (bmi<=22.9)) {
                              System.out.println("Proper weight.");
                    }
                    else if ((bmi>=23.0) && (bmi<=24.9)) {
                              System.out.println("Over weight");
                    }
                    else if ((bmi>=25.0) && (bmi<=29.9)) {
                              System.out.println("Fat.");
                    }
                    else {
                              System.out.println("So fat.");
                    }
          }
}