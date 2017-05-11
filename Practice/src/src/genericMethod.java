package src;

public class genericMethod {
	public static void main(String[] args)
	{
		if(args[0].equalsIgnoreCase("car"))
			generic(new Car());
		else if(args[0].equalsIgnoreCase("van"))
			generic(new Van());
		else
			System.out.println("Ops!! Wrong entry");
	}
	
	private static <T> void generic(T obj) {
			Vehicle v= (Vehicle) obj;
			v.run();
	}
	


}
