

import java.util.*;

public class CompanyTest {

    public static void main(String[] args) {

        Company ums = new Company("UMS");
        Spouse kate = new Spouse("Kate", 37);
        Employee john = new Employee("John", 5, 2500, 'M', kate);

        ums.addEmployee(john);   
        System.out.printf("Total salary(before): %.2f\n\n", ums.getAllEmployeesSalary());

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID:");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter name:");
        String name = sc.nextLine();

        System.out.print("Enter salary:");
        double salary = sc.nextFloat();

        System.out.print("Enter gender:");
        char gender = sc.next().charAt(0);
        
        Employee newEmployee = new Employee(name, id, salary, gender);
        ums.addEmployee(newEmployee);

        System.out.printf("Total salary(after addition): %.2f\n", ums.getAllEmployeesSalary());
        System.out.printf("\nName: %s, Salary: $%.2f, Status: %s\n",ums.getEmployee(4).getName(),ums.getEmployee(4).getSalary( ), ums.getEmployee(4).getSpouse() != null ? "Married" : "Single" ) ;
        System.out.printf("Name: %s, Salary: $%.2f, Status: %s\n",ums.getEmployee(5).getName(),ums.getEmployee(5).getSalary( ), ums.getEmployee(5).getSpouse() != null ? "Married" : "Single" ) ;
        if (ums.getEmployee(5).getSpouse() != null) {
            System.out.printf("Spouse's name: %s \n",ums.getEmployee(5).getSpouse().getName()) ;
        }


       // System.out.println(name);



        
        


    }
}
