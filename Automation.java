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

			}}

