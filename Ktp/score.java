import java.util.Scanner;

public class score {
          public static void main(String[] args) {
                    int score;
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter score: ");
                    score=sc.nextInt();

                    if (score < 60) {
                              System.out.println("Grade is F");
                    }
                    else if (score < 70) {
                              System.out.println("Grade is D");
                    }
                    else if (score < 80) {
                              System.out.println("Grade is C");
                    }
                    else if (score < 90) {
                              System.out.println("Grade is B");
                    }
                    else if (score <= 100) {
                              System.out.println("Grade is A");
                    }
                    else {
                              System.out.println("idk.");
                    }
          }
}
