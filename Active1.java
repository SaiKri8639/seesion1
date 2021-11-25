package betterWayPrep;
 
/*
 * This class represents employee entity.
 */
public class Employee implements Comparable
{
  private String empName;
  private String empId;
  private int joinYear;
  private double salary;
  private boolean isActiveInProject;
  
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmpId() {
	return empId;
}
public void setEmpId(String empId) {
	this.empId = empId;
}
public int getJoinYear() {
	return joinYear;
}
public void setJoinYear(int joinYear) {
	this.joinYear = joinYear;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public boolean isActiveInProject() {
	return isActiveInProject;
}
public void setActiveInProject(boolean isActiveInProject) {
	this.isActiveInProject = isActiveInProject;
}
@Override
public String toString() {
	return "Employee [empName=" + empName + ", empId=" + empId + ", joinYear=" + joinYear + ", salary=" + salary
			+ ", isActiveInProject=" + isActiveInProject + "]";
}
@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	return ((Employee) o).joinYear- this.joinYear;
}

  
  
   
}
public class Krishna
{
  public static vooid main(Stirng[] args)
{
  System.out.println("Active in project");

}
}
