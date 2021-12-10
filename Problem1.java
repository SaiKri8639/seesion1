package checkingCodeAssignment;
public class Problem 
{
		String s;
		
		static class Inner
		{
			Problem p = new Problem();
			void testMethod()
			{
				
			   p.s = "Set from Inner";
			   System.out.println(p.s);
			}
		
		public static void main(String[] args)
		{
			Inner i = new Inner();
		  	
			i.testMethod();
		}
	}
		}
