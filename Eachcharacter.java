package Baggies;

import java.util.HashMap;

public class Eachcharacter {

	public static void main(String[] args) {
		String a="neeliah";
		char ch[]=a.toCharArray();
		HashMap<Character, Integer> hs= new HashMap<Character,Integer>();
		for(char e:ch)
			
		{
			if(hs.containsKey(e))
			{
				hs.put(e, hs.get(e)+1);
			}
			else
			{
				hs.put(e, 1);
			}
		}
		System.out.println(hs);
	}

}
