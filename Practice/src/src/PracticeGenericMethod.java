package src;

public class PracticeGenericMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			Integer[] i= {1,2,3,4,5,6,7,8,9};
			Character[] c= {'a','b','c','d'};
			String[] s={"Mrinal","Ravi","Rahul"};
			print(c);
			print(i);
			print(s);
	}
	public static <T>void print(T[] i)
	{
		for(T j: i)
		{
			System.out.println(j);
		}
	}
	

}
