import java.util.*;

public class StudentRecordManagementSystem {
    private static Scanner input = new Scanner(System.in);
    private static List<Student> dataBase = new ArrayList<>();

    private static void addStudent()
    {
        System.out.print("enter student id : ");
        String id = input.nextLine();
        System.out.print("enter student name : ");
        String name = input.nextLine();
        System.out.print("enter student GPA : ");
        float gpa = input.nextFloat();
        input.nextLine();//to read the /n character that doesnot read by next(),nextInt(),nextFloat().
        System.out.print("enter student department : ");
        String department = input.nextLine();
        System.out.print("enter student section : ");
        String section = input.nextLine();

        Student student = new Student(id, name, gpa, department, section);
        dataBase.add(student);
    }

    private static void viewStudent()
    {
        if(dataBase.size() == 0)
        {
            System.out.println("!!!!No Student Recors Exists!!!!");
            return;
        }
        System.out.println("=============Students Record==============");
        for(Student s : dataBase)
        {
            System.out.println(s);
        }
        System.out.println();
    }

    private static void updateStudent()
    {
        System.out.print("enter student id that need to be updated : ");
        String id = input.next();
        input.nextLine();
        for(Student s : dataBase)
        {
            if(id.equals(s.getId()))
            {
                System.out.print("enter new id: ");
                String new_id = input.nextLine();
                s.setId(new_id);
                System.out.print("enter new name: ");
                String name = input.nextLine();
                s.setName(name);
                System.out.print("enter new gpa: ");
                float gpa = input.nextFloat();
                input.nextLine();
                s.setGpa(gpa);
                System.out.print("enter new department name: ");
                String dep = input.nextLine();
                s.setDepartment(dep);
                System.out.print("enter new section: ");
                String section = input.next();
                input.nextLine();
                s.setSection(section);
                return;
            }
        }
        System.out.println("Student id : "+id+" Not Found");
         
    }

    private static void deleteStudent()
    {
        System.out.print("enter student id that need to be deleted : ");
        String id = input.next();
        input.nextLine();
        for(Student s : dataBase)
        {
            if(id.equals(s.getId()))
            {
                dataBase.remove(s);
                return ;
            }
        }
        System.out.println("Student id : "+id+" Not Found");
    }
    public static void main(String args[])
    {
        while(true)
        {
            
            System.out.println("===========Student Record Management Syatem=============");
            System.out.println("***MENU***");
            System.out.println("1. Add Student Details");
            System.out.println("2. view Student Details");
            System.out.println("3. Update Student Details");
            System.out.println("4. Delete Student Details");
            System.out.println("5. EXIT");
            System.out.println("***END OF THE MENU***");
            System.out.print("choose any option from above by entering the respective number : ");
            int choice = input.nextInt();
            input.nextLine();
            switch(choice)
            {
                case 1 : addStudent();
                System.out.println("!!!successfully Added!!!");
                break;
                case 2 : viewStudent();
                break;
                case 3 : updateStudent();
                System.out.println("!!!successfully updated!!!");
                break;
                case 4 : deleteStudent();
                System.out.println("!!!successfully deleted!!!");
                break;
                default : System.out.println("------------your successfully exited-------------------");
                System.exit(0);
                break;
            }

        }
    }
}
