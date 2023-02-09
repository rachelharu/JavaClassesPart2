public class EmployeeProgram {
  public static void main(String[] args){
    Employee empl = new Employee("Jack", "Krichen", 1000, "Manager", 75000);
    System.out.println("First Name: " + empl.getFirstName());
    System.out.println("Last Name: " + empl.getLastName());
    System.out.println("EmplId: " + empl.getEmplId());
    System.out.println("Job Title: " + empl.getJobTitle());
    System.out.println("Salary: " + empl.getSalaryAsString());
  }
}