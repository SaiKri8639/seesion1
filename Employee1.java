public class Employee1
{
	 /* int empId =345;
	  String empName="Sai Krishna";
	  double empSal =25000.00;
	  String empDept;
	 */
	private int empId;
	private String empName;
	private double empSal;
	private Department empDept;
	
	public Employee1(int empId,String empName,double empSal,Department empDept)
	{
		this.empId=empId;
		this.empName=empName;
		this.empSal=empSal;
		this.empDept=empDept;
	}
	public String toString()
	{
		return  "Id : "+empId+
				"\nName: "+empName+
				"\nSalary Rs: "+empSal+
				"\n"+empDept;
	}
	


}
