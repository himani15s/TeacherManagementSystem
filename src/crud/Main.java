package crud;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TeacherInterface t1=new ImpleIntTeacher();
        System.out.println("Welcome to Teacher Management System");
        do {
            {
                System.out.println("1. Add Teacher\n" +
                        "2. View All Teachers\n" +
                        "3. View All Teachers Based on Id\n" +
                        "4. Update Teacher \n" +
                        "5. Delete Teacher \n" +
                        "6. Exit");

                Scanner scanner=new Scanner(System.in);
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                int tid;
                String  tname;
                switch (choice) {
                    case 1:
                        // Add Teacher logic
                        System.out.println("Selected option: Add Teacher");
                        Teacher t=new Teacher();
                        System.out.println("Enter  Id");
                        int id=scanner.nextInt();
                        System.out.println("Enter  Name");
                        String name=scanner.next();
                        System.out.println("Enter Salary");
                        double salary=scanner.nextDouble();
                        System.out.println("Enter  Age");
                        int age=scanner.nextInt();
                        t.setId(id);
                        t.setName(name);
                        t.setSalary(salary);
                        t.setAge(age);



                        t1.createTeacher(t);
                        break;

                    case 2:
                        // View All Teacher logic
                        System.out.println("Selected option: View All Teachers");
                        t1.showAllTeacher();
                        break;

                    case 3:
                        // View All Teachers Based on Id logic
                        System.out.println("Selected option: View All Teachers Based on Id");
                        System.out.print("Enter  id ");
                        tid = scanner.nextInt();
                        t1.showTeacherBasedOnId(tid);
                        break;

                    case 4:
                        // Update Teacher logic
                        System.out.println("Selected option: Update Teacher");
                        System.out.print("Enter  id ");
                       tid = scanner.nextInt();
                        System.out.print("Enter  Name ");
                         tname= scanner.next();
                        t1.updateTeacher(tid,tname);
                        break;

                    case 5:
                        // Delete Teacher logic
                        System.out.println("Selected option: Delete Teacher");
                        System.out.print("Enter  id ");
                        tid = scanner.nextInt();
                        t1.deleteTeacher(tid);
                        break;

                    case 6:
                        System.out.println("Exiting the system. Goodbye!");
                        System.exit(0);

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } while (true);
    }
}
