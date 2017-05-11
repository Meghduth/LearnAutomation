package src;
import java.io.IOException;
import java.util.LinkedHashMap;
 
//iText imports

 
public class TextReadDemo {
 
    /**
     * @param args
     */
    public static void main(String[] args) 
    {
    	int arr[][]={{1,  2,  3,  4,  5,  6},
	        	{7,  8,  9,  10, 11, 12},
	        	{13, 14, 15, 16, 17, 18},
	        	{19, 20, 21, 22, 23, 24},
	        	{25, 26, 27, 28, 29, 30},
	        	{31, 32, 33, 34, 35, 36}};
	
	int Row = 6;
	int col = 6;
	
	SpiralPrint(arr,Row,col);

}
    private static void SpiralPrint(int[][] arr, int Row, int col) {
		int top=0, button= Row-1, left=0, right=col-1;
		int direction =0;
		while((top<= button) && (left<=right) )
		{
			if (direction==0)
			{
				for(int i=left; i<=right;i++)
				{
					System.out.print(arr[top][i]);
					
				}
				System.out.println("\n");
				direction=1;
				top++;
			}
			if (direction==1)
			{
				for(int i=top; i<=button;i++)
				{
					System.out.print(arr[i][right]);

				}
				System.out.println("\n");
				direction=2;
				right--;
			}
			if (direction==2)
			{
				for(int i=right; i>=left;i--)
				{
					System.out.print(arr[button][i]);

				}
				System.out.println("\n");
				direction=3;
				button--;
			}
			if (direction==3)
			{
				for(int i=button; i>=top;i--)
				{
					System.out.print(arr[i][left]);
				}
				System.out.println("\n");
				direction=0; 
				left++;
			}
		}
		
    }
}
    
        