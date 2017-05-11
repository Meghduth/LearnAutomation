package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WaveArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			ArrayList<Integer> a= new ArrayList<Integer> ();
			a.add(5);
			a.add(2);
			a.add(1);
			a.add(4);
			a.add(3);
				Collections.sort(a);
			
			    for(int i=1;i<a.size();i+=2)
			    {
			        int temp = a.get(i-1);
			        a.set(i-1,a.get(i));
			        a.set(i,temp);
			    }
			    System.out.println(a);
			}
//		}
	}

//}
