/* public class chaptertwo {
          public static void main(String[] args) {

                    System.out.println("This is message from main method");
                    for (int i=0; i<5; i++){
                              displayMessage();
                    }
                    System.out.println("Back in main method.");

          }
          public static void displayMessage() {
                    System.out.println("This is Message from displayMessage Method");
          }
} */
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* public class chaptertwo {
          public static void main(String[] args) {

                    System.out.println("This is main.");
                    deep();
                    System.out.println("back in main.");
          }
          public static void deep() {
                    System.out.println("This is from deep.");
                    deeper();
                    System.out.println("back to the deep.");
          }
          public static void deeper() {
                    System.out.println("this is from deeper.");
          }
} */
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* public class chaptertwo {

          public static void main(String[] args) {
                    saySometing("java");
          }
          public static void saySometing(String something) {
                    System.out.println("say" + something);
          }
} */
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/* public class chaptertwo {

          // **return 

          public static void main(String[] args) {
                    double x = 4.5;
                    double y = 5.4;
                    double sum;  

                    sum = sumValue(x, y);
                    System.out.println("Sum is" + sum);
          }

          public static double sumValue(double num1, double num2) {
                    double sum;
                    sum = num1 + num2;
                    return sum;
          }

} */
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////*******
/* public class chaptertwo {

          public static void main(String[] args) {
                    int a = 6;
                    int b = 6;
                    //***********************************
                    chaptertwo app = new chaptertwo();
                    app.areaRec(a, b);
                    //***********************************
          }

          public void areaRec(int w, int h) {
                    int sum;
                    sum = w * h;
                    System.out.println("output = " + sum);
          }

} */
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////*******
/* public class chaptertwo {

          // **return 

          public static void main(String[] args) {
                    int a = 6;
                    int b = 6;

                    chaptertwo app = new chaptertwo();
                    int c = app.areaRec(a, b);

                    System.out.println("out put = " + c);

          }

          public int areaRec(int w, int h) {
                    int sum;
                    sum = w * h;
                    return sum;
          }

} */
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// *******
/* public class chaptertwo {

          public static int add(){
                    return 0;
          }
          public static int add(int x){
                    return x;
          }
          public static int add(int x, int y){
                    return x + y;
          }
          public static int add(int x, int y, int z){
                    return x + y + z;
          }

          public static void main(String[] args) {
                    System.out.println("Sum = " + add());
                    System.out.println("Sum = " + add(2));
                    System.out.println("Sum = " + add(2,3));
                    System.out.println("Sum = " + add(2,3, 4));
          }
} */
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// *******
/* public class chaptertwo {

          // overload แบบจำนวณ paramiter ต่างกัน

          public static int multiply(int a, int b) {
                    int prod = a * b;
                    return prod;
          }

          public static int multiply(int a, int b, int c) {
                    int prod = a * b * c;
                    return prod;
          }

          public static void main(String[] args) {
                    int prod1 = multiply(5, 10);
                    System.out.println("" + prod1);
          }
} */
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// *******
/* public class chaptertwo {

          // 

          public static int multiply(int a, int b) {
                    int prod = a * b;
                    return prod;
          }

          public static double multiply(double a, double b, double c) {
                    double prod = a * b * c;
                    return prod;
          }

          public static void main(String[] args) {
                    double prod1 = multiply(5, 10, 45.5);
                    System.out.println("" + prod1);
          }
} */
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// *******

