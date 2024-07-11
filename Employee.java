public class Employee {
  int Id,age;
  String gender;
  int year_of_joining;
  String name;
  double Salary;


  public Employee(int id, int age, String gender, int year_of_joining, String name, double salary) {
    Id = id;
    this.age = age;
    this.gender = gender;
    this.year_of_joining = year_of_joining;
    this.name = name;
    Salary = salary;              
  }

    @Override
    public String toString() {
      return "Employee [Id=" + Id + ", age=" + age + ", gender=" + gender + ", year_of_joining=" + year_of_joining
          + ", name=" + name + ", Salary=" + Salary + "]";
  }

    public int getId() {
      return Id;
    }

    public void setId(int id) {
      Id = id;
    }

    public int getAge() {
      return age;
    }

    public void setAge(int age) {
      this.age = age;
    }

    public String getGender() {
      return gender;
    }

    public void setGender(String gender) {
      this.gender = gender;
    }

    public int getYear_of_joining() {
      return year_of_joining;
    }

    public void setYear_of_joining(int year_of_joining) {
      this.year_of_joining = year_of_joining;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public double getSalary() {
      return Salary;
    }

    public void setSalary(double salary) {
      Salary = salary;
    }



}
