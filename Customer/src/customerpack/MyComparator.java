package customerpack;

import java.util.Comparator;

public class MyComparator implements Comparator{

		@Override
		public int compare(Object o1, Object o2) {
			Project p1=(Project) o1;
			Project p2=(Project) o2;
			String dom1=p1.getDomain();
			String dom2=p2.getDomain();
			return dom1.compareTo(dom2);
			
		}

		
	}


