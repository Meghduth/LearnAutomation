package src;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str1="This is a test";
//		String str2= new String("This is a test");
//		System.out.println("Before converting str1==str2 ? "+(str1==str2));
//		str2=str2.intern();
//		System.out.println("After converting str1==str2 ? "+(str1==str2));
//		
//		int b=1;
//	    String bitsVal=Integer.toBinaryString(b);
//	    int count=0;
//	    for(int i=0;i<bitsVal.length();i++)
//	    {
//	        if (('1')==(bitsVal.charAt(i)))
//	        count++;
//	    }
//	    System.out.println(count);
		
//		int b=(int)a;
	    String rev="";
	    String bitsVal=Long.toBinaryString(3);
	    System.out.println("Bits value = "+bitsVal);
	    for(int i=bitsVal.length()-1;i>=0;i--)
	    {
	        rev=rev+""+bitsVal.charAt(i);
	    }
	    System.out.println("Reverse bits = "+rev);
	    long val=Long.parseLong(rev,2);
	    System.out.println(val);
	    
	}

}
