import java.util.*;

class Solution{
    public static void main(String[] args) {
         PriorityQueue<Student> students = new PriorityQueue<>(new Comparator<Student>() {

             @Override
             public int compare(Student s1, Student s2) {
                 if(s2.getCGPA() > s1.getCGPA()) return (1);
                 else if(s2.getCGPA() < s1.getCGPA()) return (-1);
                 else
                 {
                     int secondCompare = s1.getName().compareTo(s2.getName());
                     if(secondCompare != 0)
                         return (secondCompare);
                     int thirdCompare = s1.getId() - s2.getId();
                     return (thirdCompare);
                 }

             }
         });

         Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int counter = input.nextInt();
        while (counter-->0) {

            String event = input.next();

            if (event.equals("ENTER")) {
                String name = input.next();
                double cgpa = input.nextDouble();
                int id = input.nextInt();
                students.offer(new Student(name, cgpa, id));
                if (input.hasNextLine()){
                    input.nextLine();
                }
            } else if (event.equals("SERVED")) {
                students.poll();
            }
        }

        if (students.isEmpty()){
            System.out.println("EMPTY");
        }else {
            while (!students.isEmpty()){
                System.out.println(students.poll().getName());
            }
        }


    }
}

class Student {
    private String name;
    private double CGPA;
    private int id;



    public Student(String name, double CGPA , int id) {
        this.id = id;
        this.name = name;
        this.CGPA = CGPA;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getCGPA() {
        return CGPA;
    }

}


