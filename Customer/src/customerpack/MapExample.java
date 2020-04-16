package customerpack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample 
{
	public static void main(String [] args) throws IOException
	{
		int i=1;
		Map<Integer,String> m=new HashMap<Integer, String>();
	File f=new File("F:\\hashmap\\rivisionhandson\\vehicle.txt");
	BufferedReader br=new BufferedReader(new FileReader(f));
	String data=br.readLine();
	while(data!=null) 
	{
		data=br.readLine();
		m.put(i, data);
		i++;
	}
	 Set<Map.Entry<Integer, String>> entrySet = m.entrySet();
	    
	    Iterator<Map.Entry<Integer, String>> itr = entrySet.iterator();
	    
	    while(itr.hasNext())
	    {
	   Map.Entry<Integer, String> entry = itr.next();	
	   
	         System.out.println(entry +" :"+entry.getKey() +" =>"+entry.getValue());
	         
	         
	    }
	System.out.println(m);


}
}

/*
 * static Integer countAnimal(String animal, Map<Integer, String> map)
{
    int cnt = 0;
    for (String val : map.values()) {
        if (val.equals(animal)) {
            ++cnt;
        }
    }

    return new Integer(cnt);
}

public static void main(String[] args)
{
    String[] animals = new String[] { "cat", "dog", "pig", "goat", "donkey", "horse", "cow" };

    Map<Integer, String> map = new HashMap<>();

    // load map for test
    Random rnd = new Random();
    for (int i = 0; i < 100; ++i) {
        String animal = animals[rnd.nextInt(animals.length)];
        map.put(new Integer(i), animal);
    }

    // count how many there are
    Map<String, Integer> numAnimals = new HashMap<>();

    for (String animal : animals) {
        numAnimals.put(animal, countAnimal(animal, map));
    }

    System.out.println(numAnimals);

    // show the cool Collections.frequency approach
    Integer count = Collections.frequency(map.values(), "dog");
    System.out.println("dog: " + count);
}
 */
 

