package src;

public class MinDistanceBwTwoWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="the brown qucik frog quick the";
		String firstWord="the";
		String SecondWord="quick";
		int firstIndex=0;
		int SecondIndex=0;
		String[] str1=str.split(" ");
		for(int i=0;i<str1.length;i++)
		{
			if(firstWord.equals(str1[i]))
				firstIndex=i;
			else
				System.out.println("not present");
			
			if(SecondWord.equals(str1[i]))
				SecondIndex=i;
			else
				System.out.println("not present");
		}
		System.out.println("Distance is "+Math.abs(SecondIndex-firstIndex));
	}

}
