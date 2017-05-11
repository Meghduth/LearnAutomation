package src;

import java.lang.reflect.Method;

class A
{
	int a =5;
	A()
	{
		System.out.println("This is number "+5);
	}
	
	public void method1(int a)
	{
		System.out.println("This is number "+a);
	}
	public void method2(int a,int b)
	{
		System.out.println("Addition of two number is "+ a+b);
	}
}

public class Reflection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A objA= new A();
	Class objClass = objA.getClass();
	objClass.getName();
	}

}
