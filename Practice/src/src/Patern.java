package src;

public class Patern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		for(int i=n;i>=0;i--)
		{
			for(int j=n-i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int k=n;k>=i;k--)
			{
			System.out.print("#");
			}
			System.out.println(" ");
		}
	}

}
