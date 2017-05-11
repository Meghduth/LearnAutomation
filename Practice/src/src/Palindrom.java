package src;

import java.util.Arrays;

public class Palindrom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String str="A man, a plan, a canal: Panama";
	    String rev="";
	    for(int i=str.length()-1;i>0-1;i--)
	    {
	    	rev=rev+str.charAt(i);
	    }
	    if (str.equals(rev))
	    System.out.println(1);
	    else
	    	System.out.println(0);
	}

}
