package src;

import java.util.ArrayList;
import java.util.Stack;

public class FindANumberWhenItisASequesnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {9,8,7,6,7,6,5,4,3,4,5,6,5,4,3,2};
		int element=5;
//		int step=Math.abs(element-arr);
		int flag=0;
		for(int i=0; i<arr.length;i+=Math.abs(element-arr[i]))
		{
			if(arr[i]==element)
			{
				System.out.println("Element found in "+i+" position");
				break;
			}
//			else
//				System.out.println("Element not found");
		}
		matchingParanthesis();
	}
	
	public static void matchingParanthesis()
	{
		String str="{}}";
		int n=0;
		Stack<Integer> stk= new Stack<Integer>();
		int i=0;
		for(char c:str.toCharArray())
		{
			if(c=='{')
				stk.push(i);
			else if(c=='}')
			{
				try
				{
					int p=stk.pop()+1;
//					System.out.println("Matched");
				}catch(Exception e)
				{}
			}
			i++;
			
		}
		while(!stk.isEmpty())
		System.out.println("invalid");
	}
	
}
