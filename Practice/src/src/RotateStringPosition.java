package src;

import java.util.ArrayList;

public class RotateStringPosition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> A= new ArrayList<Integer>();
		for(int i=1;i<=6;i++)
			A.add(i);
		int B=11;
//		ArrayList<Integer> ret = new ArrayList<Integer>();
//		if(B>A.size())
//			B=A.size()-1;
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (int i = 0; i <A.size(); i++) {
			ret.add(A.get((i+B) % A.size()));
			
		}
//		for(int i=0;i<B;i++)
//			ret.add(A.get(i));
////		}
		System.out.println(ret);
	
	}

}
