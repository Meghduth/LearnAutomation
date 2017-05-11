package src;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;

public class Max3ProductInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,4,5,6,7,8,9,-10};
//		Stack<Integer> objStack=new Stack<Integer>();
		Arrays.sort(arr);
		int i=arr.length-1;
		
			System.out.println(arr[i]*arr[i-1]*arr[i-2]);
				
	}

}
