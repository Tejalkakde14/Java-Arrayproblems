//1. Write a program to print the name, salary and date of joining of 10 employees in a //company. Use array of objects.


public class Array1Employee {
 private String name;
 private int salary; 
private String joiningDate; 

public Employee(String name, int salary, String joiningDate)
 { super(); 

this.name = name; 
this.salary = salary;
 this.joiningDate = joiningDate; 
} 
public String getName() 
{ return name;
 }
 public void setName(String name) 
{ this.name = name;
 }
 public int getSalary()
 { return salary; } 
public void setSalary(int salary)
 { this.salary = salary; } 
public String getJoiningDate() 
{ return joiningDate; }
 public void setJoiningDate(String joiningDate)
 { this.joiningDate = joiningDate; }
 @Override public String toString()
 { return "Employee [name=" + name + ", salary=" + salary + ", joiningDate=" + joiningDate + "]"; } }



import java.util.Scanner;
 public class Main { 
public static void main(String[] args)
 { 
 Scanner input=new Scanner(System.in);
 Array1Employee[] obj= new Array1Employee[10];
 String name ; 
int salary ;
 String joiningDate; 
for(int i = 0; i < obj.length; i++)
 { 
System.out.print("Enter name of Employee "+(i+1)+" :");
 name=input.next();
 System.out.print("Enter salary : ");
 salary=input.nextInt();
 System.out.print("Enter joiningDate: ");
 joiningDate=input.next();
 obj[i]= new Employee(name, salary, joiningDate);
 }
 for(int i = 0; i < obj.length; i++) 
{ 
System.out.println(obj[i]);
 
} 
}
 } 

