package dataStructuresAssignmnet;
import java.util.*;

public class IterateHashMap
{
	public static void main(String[] args)
	{	
    HashMap<Integer, Project> h1 = new HashMap();
    h1.put(1, new Project( 123,"Mize","SoftServices",20 ));
    h1.put(2, new Project( 124,"Persistent","SoftServices",7 ));
    h1.put(3, new Project( 125,"Kafka","IntegrationServices",5 ));
 
   //System.out.println(h1.get(2));
   // h1.put(1, new Project( 126,"Mize","SoftServices",21 ));
   // System.out.println(h1.get(1));
    h1.forEach((k,v)->System.out.println(k+"  "+v));
//     h1.getOrDefault(6, null);
     //h1.get)
 // Project p1 = new Project(123,"Mize","SoftServices",20);
//     p1.getNumOfEmp();
//     System.out.println(p1);
//     if(h1.containsValue(123))
//     {
//    	Project  p1 = h1.get(123);
//    	 p1.getProjectId();
//    	 System.out.println(p1);
//     }
//     else
//     {
//    	 System.out.println("no data found : ");
//     }
    System.out.println(h1.keySet());
    System.out.println(h1.values());
    System.out.println(h1.entrySet());
	}
}