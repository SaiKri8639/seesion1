public class Manager
{
 public static void main(String[] args)
 {
   //Employee1 emp = new Employee1();
   
   Department dept = new Department(1,"Soft ware dev","Anand");
   Employee1 emp = new Employee1(345,"Sai Krishna",25000.50d,dept);
   System.out.println(emp);
}
}