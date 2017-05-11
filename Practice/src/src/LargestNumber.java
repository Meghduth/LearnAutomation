package src;

import java.util.ArrayList;
import java.util.Collections;

public class LargestNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ArrayList<Integer> a= new ArrayList<Integer> ();
		a.add(3);
		a.add(30);
		a.add(34);
		a.add(5);
		a.add(9);
			Collections.sort(a);
			
			StringBuilder br = new StringBuilder();
//			br.append(a);
			System.out.println(br.append(a));
	}

}
