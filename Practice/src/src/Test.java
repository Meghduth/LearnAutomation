package src;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Test {
	public static void main(String[] args) 
    {
    	try
    	{
    		
     	String str="Hello";
    	char[] charArray = str.toCharArray();
//    	int count =1;
    	LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (char c : charArray) {
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c) + 1);
			}
//			
		}
		
		StringBuilder sb = new StringBuilder();
		for(Entry<Character, Integer> objEntry : map.entrySet())
		{
//		for (Entry<Character, Integer> entry : map.entrySet()) {
			sb.append(objEntry.getKey());
			sb.append(objEntry.getValue());
		}
		System.out.println(sb.toString());
//	}
    }catch(Exception e)
    {
    	System.out.println(e);
    }
    	
    }


}
