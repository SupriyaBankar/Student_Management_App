


import com.student.manage.Student;
import com.student.manage.StudentDao;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student_Management_App {

    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to Student Management App");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("Press 1 to Add student");
            System.out.println("Press 2 to Display student");
            System.out.println("Press 3 to Delete student");
            System.out.println("Press 4 to Update student");
            System.out.println("Press 5 to Exit");
            System.out.print("Enter your choice: ");
            
            int c = Integer.parseInt(br.readLine());

            switch (c) {
                case 1:
                    // Add student
                    System.out.println("Adding student...");
                    // Add logic here
                    System.out.println("enter username");
                    String name=br.readLine();
                     System.out.println("enter user phone");
                    String phone=br.readLine();
                     System.out.println("enter user city");
                    String city=br.readLine();
                    
                    //create object of student to store student
                    Student st=new Student(name,phone,city);
                    boolean res=StudentDao.inserStudentToDB(st);
                    if(res){
                        System.out.println("student added ");
                    }
                    break;

                case 2:
                    // Display student
                    System.out.println("Displaying student...");
                    
                    StudentDao.displayStudent();
                    // Add logic here
                    break;

                case 3:
                    // Delete student
                    System.out.println("Deleting student...");
                    System.out.println("Enter student id you want to delte");
                    // Add logic here
                    int userId=Integer.parseInt(br.readLine());
                    boolean result =StudentDao.deleteById(userId);
                    if(result){
                        System.out.println("Delete Successfully....");
                    }
                    break;

                case 4:
                    // Update student
                    System.out.println("Updating student...");
                    System.out.println("enter student id to update");
                    int userid=Integer.parseInt(br.readLine());
                    System.out.println("enter student name");
                    name= br.readLine();
                    System.out.println("enter student phone");
                    phone =br.readLine();
                    System.out.println("enter student city");
                    city =br.readLine();
                    Student st1=new Student(name,phone,city);
                    boolean r =StudentDao.updateStudent(userid, st1);
                    if(r){
                        System.out.println("update successfully");
                    }
                    // Add logic here
                    break;

                case 5:
                    // Exit
                    System.out.println("Exiting program...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
