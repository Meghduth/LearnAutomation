package src;

import java.util.ArrayList;
import java.util.Collections;

public class AddTwoArraysAndReturnThirdArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] firstArray={1,2,3,4,5,6,7,8,10,11,12,23};
		int[] SecondArray={2,3,4,5,6};
		ArrayList<Integer> resultArray= new ArrayList<Integer>();
		int sum=0,firstVal=0,SecondVal=0;
//		int flag=0;
		int total=Math.min(SecondArray.length, firstArray.length);
		int lengthdiffer=Math.abs(SecondArray.length-firstArray.length);
			
 		for(int i=0;i<total;i++)
 		{
 			sum=firstArray[i]+SecondArray[i];
 			if(sum>9 && sum<100)
 			{
 				firstVal=sum/10;
 				resultArray.add(firstVal);
 				SecondVal=sum%10;
 				resultArray.add(SecondVal);
 			}
 			else
 				resultArray.add(sum);
 		}
 		if(firstArray.length<SecondArray.length)
 		{
 			for(int i=SecondArray.length-lengthdiffer;i<SecondArray.length;i++)
 			{
 				resultArray.add(SecondArray[i]);
 			}
 		}
 		else
 		{
 			for(int i=firstArray.length-lengthdiffer;i<firstArray.length;i++)
 			{
 				resultArray.add(firstArray[i]);
 			}
 		}
 		System.out.println(resultArray);
 		
		
	}

	}
