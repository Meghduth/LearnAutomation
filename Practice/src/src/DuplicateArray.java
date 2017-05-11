package src;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicateArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		int array1[]={1,2,-3,4,5,6,7};
		int array2[]={1,3,4,5,6,7};
		int result=0;
		for(int i=0;i<array1.length-1;i++)
		{
			for(int j=0;j<array2.length;j++)
			{	
				result = array1[i]^array2[j];
				if (result==0)
					break;

			}
			if (result!=0)
					System.out.println(array1[i]);
		}

		int aarray1[]={1,2,3,4,5,6,7};
		int aarray2[]={1,3,4,5,6,7};
		
		Set<Integer> set1= new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		for(int num:aarray1)
		{
			set1.add(num);
			set2.add(num);
		}
		for(int num:aarray2)
		{
//			set1.add(array1[num]);
			set2.add(num);
		}
		set1.removeAll(set2);
		System.out.println("==========================");
		System.out.println(set1);
		
		
	}
	
	

}
