package src;

public class ValidParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="()()";
		boolean  a= parenthesisMatching(str);
		System.out.println(a);
	}
	public static boolean parenthesisMatching(String str)
	{
		int i=0;
		int n=0;
		char[] c= str.toCharArray();
		while(i<str.length())
		{
			if(c[i]=='(')
			{
				n++;
			}
			else if (c[i]==')')
			{
				if(n==0)
					return false;
//					break;
				//System.out.println("false");
				n--;
				
			}
		}
		return(n==0);
	}

}
