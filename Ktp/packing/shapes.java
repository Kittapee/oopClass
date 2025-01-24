package packing;

public class shapes {
          public static void main(String[] args) {
                    tringle t1 = new tringle("GG", 3, 5);
                    tringle t2 = new tringle("GGWP", 7, 4);

/*                     t1.width = 5.00;
                    t1.height = 5.00;
                    t1.style = "isosceles";
                    
                    t2.width = 7.00;
                    t2.height = 3.00;
                    t2.style = "right"; */
                    
                    System.out.println("********** info.T1 **********");
                    
                    t1.showDim();
                    t1.showStyle();

                    System.out.println("Area is " + t1.area());
                    
                    System.out.println("********** info.T2**********");

                    t2.showDim();
                    t2.showStyle();

                    System.out.println("Area is " + t2.area());
          }
}
