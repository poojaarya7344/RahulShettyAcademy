package InterviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		
		        String str = "java selenium";
		        char [] str2 = str.toCharArray();
		   
		        //output - e = 2

		Map<Character,Integer> map = new HashMap<Character,Integer> ();

		for(char ch :str2)
		{
		    int count = map.getOrDefault(ch,0);
		    map.put(ch,count+1);
		}

		//char target='e';
		for(Map.Entry<Character,Integer> entry : map.entrySet())
		{
		    if(entry.getValue()>1)
		   // if(entry.getKey()==target)
		   
                System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		
	}}

