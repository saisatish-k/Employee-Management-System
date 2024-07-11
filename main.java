import java.util.ArrayList;
import java.util.List;

public class main{

  public static void main(String[] args) {
    Employee emp1 = new Employee(123,26,"female",2024,"sayandri",67000);
    Employee emp2 = new Employee(124,28,"male",2023,"rudra",70000);
    Employee emp3 = new Employee(125,30,"male",2022,"ayan",52000);
    Employee emp4 = new Employee(126,25,"male",2023,"james",27000);
    Employee emp5 = new Employee(127,24,"female",2024,"anjani",16500);
    Employee emp6 = new Employee(128,22,"male",2020,"sayanth",48600);
  
      List<Employee> empList=new ArrayList<Employee>();
    empList.add(emp1);
    empList.add(emp2);
    empList.add(emp3);
    empList.add(emp4);
    empList.add(emp5);
    empList.add(emp6);
  
    
    long totalEmp=empList.stream().count();
    List<Employee> femaleEmp=empList.stream().filter(f->f.getGender().equalsIgnoreCase("female")).toList();
    List<Employee> maleEmp=empList.stream().filter(m->m.getGender().equalsIgnoreCase("male")).toList();
    List<Employee> dojA2020=empList.stream().filter(e->e.year_of_joining>2020).toList();
    double avg =empList.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
    double max=empList.stream().mapToDouble(Employee::getSalary).max().orElse(0.0);
    double min=empList.stream().mapToDouble((Employee::getSalary)).min().orElse(0.0);
    System.out.printf("total employees:%d \n Average Salary: %.2f \n Max Salary: %.2f \n Min salary: %.2f",totalEmp,avg,max,min);
    System.out.println("female Employess:");
    System.out.println(femaleEmp);
    System.out.println("male Employess:");
    System.out.println(maleEmp);
    System.out.println("Employess joined after 2020:");
    System.out.println(dojA2020);

  }


}