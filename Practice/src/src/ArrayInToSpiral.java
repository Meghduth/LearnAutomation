package src;

public class ArrayInToSpiral {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[][]={
		                	{1,2,3},
						  {4,5,6},
						  {7,8,9}
	};
		int top=0,left=0, right=2,buttom=2;
		int dir=0;
		while(left<=right && top<=buttom)
		{
		if(dir==0)
		{
			for(int i=left;i<=right;i++)
			{
				System.out.println(intArray[top][i]);

			}
			top++;
			dir=1;
		}
		if(dir==1)
		{
			for(int i=top;i<=buttom;i++)
			{
				System.out.println(intArray[i][right]);

			}
			right--;
			dir=2;
		}
		if(dir==2)
		{
			for(int i=right;i>=left;i--)
			{
				System.out.println(intArray[buttom][i]);

			}
			buttom--;
			dir=3;
		}
		if(dir==3)
		{
			for(int i=buttom;i>=top;i--)
			{
				System.out.println(intArray[i][left]);

			}
			left++;
			dir=0;
		}
	}
	}

}
