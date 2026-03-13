package com.example.main;
import com.example.dao.StudentDAO;
import com.example.entity.Student;
import java.util.List;
import java.util.Scanner;
public class MainApp 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();
        int choice;
        do 
        {
            System.out.println("\n CRUD USING HIBERNATE MENU ");
            System.out.println("1. Insert Student");
            System.out.println("2. Get Student Details  by ID");
            System.out.println("3. Get All Students Details ");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer
            switch (choice) 
            {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    
           
                  Student s = new Student();
                    dao.saveStudent(s);
                    break;
                case 2:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    Student st = dao.getStudent(id);
                    if (st != null) 
                    {
                        System.out.println("ID: " + st.getId());
                        System.out.println("Name: " + st.getName());
                        
                    } 
                    else 
                    {
                        System.out.println("Student not found.");
                    }
                    break;
             
               
                   
                case 5:
                    System.out.print("Enter Student ID to Delete: ");
                    int did = sc.nextInt();
                    dao.deleteStudent(did);
                    break;

                case 6:
                    System.out.println("Exiting Application");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}
