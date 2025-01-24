
public class Students {

          private String id;
          private String name;
          private Double gpa;

          public void setDetail(String stdid, String stdname, Double stdgpa) {

                    id = stdid;
                    name = stdname;
                    gpa = stdgpa;

          }

          public void getDetail() {

                    System.out.println("id = " + id);
                    System.out.println("name = " + name);
                    System.out.println("gpa = " + gpa);
          }
}
