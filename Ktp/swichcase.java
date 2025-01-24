import java.util.Scanner;

public class swichcase {
          public static void main(String[] args) {
                    int floor;
                    Scanner scanner=new Scanner(System.in);
                    System.out.println("Enter to go.");
                    floor=scanner.nextInt();

                    switch (floor) {
                              case 1:
                                    System.out.println("You in level 1.");    
                                        break;
                              case 2:
                                        System.out.println("You in level 2.");
                                        break;
                              case 3:
                                        System.out.println("You in level 3.");

                              case 4:
                                        System.out.println("You in level 4.");
                                        break;        
                              default:
                                        System.out.println("Welcome to the blackroom.");
                                        break;
                    }
          }
}
