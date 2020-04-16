package customerpack;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class MapTask 
{
	static Comparator<Project> projComparator = new Comparator<Project>() 
	   {

		@Override
		public int compare(Project o1, Project o2) {
			String dom1=o1.getDomain();
			String dom2=o2.getDomain();
			return dom1.compareTo(dom2);
				
		}
	   };   
	public static void main(String[] args) {
		Empployee e1 = new Empployee(101, "pratibha", 20000.00, "pr@gmail.com");
		Empployee e2 = new Empployee(102, "geetha", 30000.00, "pr@gmail.com");
		Empployee e3 = new Empployee(103, "kamal", 40000.00, "pr@gmail.com");
		Empployee e4 = new Empployee(104, "kethaki", 50000.00, "pr@gmail.com");
		Empployee e5 = new Empployee(105, "komal", 60000.00, "pr@gmail.com");
		Empployee e6 = new Empployee(106, "pratibhac", 70000.00, "pr@gmail.com");
		Empployee e7 = new Empployee(107, "geethap", 80000.00, "pr@gmail.com");
		Empployee e8 = new Empployee(108, "kamalm", 10000.00, "pr@gmail.com");
		Empployee e9 = new Empployee(109, "kethakim", 50000.00, "pr@gmail.com");
		Empployee e10 = new Empployee(110, "komalk", 60000.00, "pr@gmail.com");
		
		SimpleDateFormat d=new SimpleDateFormat("dd/mm/yyyy");
		Date d1=new Date("22/12/2019");
		Date d2=new Date("22/02/2020");
		Project p1=new Project(201,"java",d1,d2);
		Project p2=new Project(202,"php",d1,d2);
		Project p3=new Project(203,"iot",d1,d2);
		Project p4=new Project(204,"aaa",d1,d2);
		Project p5=new Project(205,"bbbb",d1,d2);
		Project p6=new Project(206,"ccc",d1,d2);
		Project p7=new Project(207,"ddd",d1,d2);
		Project p8=new Project(208,"eee",d1,d2);
		Project p9=new Project(209,"fff",d1,d2);
		Project p10=new Project(210,"ggg",d1,d2);
		
		
		Map<Project,Empployee > empMap = new TreeMap<Project,Empployee>((projComparator));
		empMap.put(p1, e1);
		empMap.put(p2, e2);
		empMap.put(p3, e3);
		empMap.put(p4, e4);
		empMap.put(p5, e5);
		empMap.put(p6, e6);
		empMap.put(p7, e7);
		empMap.put(p8, e8);
		empMap.put(p9, e9);
		empMap.put(p10, e10); 
		displayByProjectID(empMap);
		displayByProjectDomain(empMap);
		
		
	}
	public static void displayByProjectID(Map<Project,Empployee> empMap)
	{
		TreeMap<Project,Empployee > empMap1 = new TreeMap<Project, Empployee>(empMap);
		//System.out.println(empMap1);
		 empMap1.entrySet().stream().forEach(t->System.out.println(t));
	}
	public static void displayByProjectDomain(Map<Project,Empployee> empMap) 
	{
      System.out.println("-------------------------------");	
	//System.out.println(empMap);
	 empMap.entrySet().stream().forEach(t->System.out.println(t));
	}
}
