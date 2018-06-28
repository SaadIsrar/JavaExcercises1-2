import java.util.*;


    public class people1 {


        public int age;

        public String name;

        public String job_title;

        public people1(int age, String name, String job_title) {

            super();

            this.age = age;

            this.name = name;

            this.job_title = job_title;

        }

        public String toString() {


            return "Age: " + age + ", Name: " + name + ", Job title: " + job_title;


        }


        public static void main(String[] args) {


            people1 p1 = new people1(33, "Peter", "ITConsultant");

            people1 p2 = new people1(24, "Jack", "SoftwareDeveloper");

            people1 p3 = new people1(35, "Daniel", "Doctor");

            people1 p4 = new people1(28, "Martin", "Engineer");


            ArrayList people1list = new ArrayList();


            people1list.add(p1);

            people1list.add(p2);

            people1list.add(p3);

            people1list.add(p4);


            System.out.println("Contents of people1list: " + people1list);


            int i;

            for(i = 0; i < people1list.size();i++) {

                System.out.println(people1list.get(i) + " ");

            }

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a name:");

            String N;

            N = sc.next();

            if(N.equals("A")) {System.out.println(p1);}

            else if(N.equals("C")) {System.out.println(p2);}

            else if(N.equals("H")) {System.out.println(p3);}

            else if(N.equals("M")) {System.out.println(p4);}

            else { System.out.println("none");}


        }



    }

