import java.rmi.*;
public class Client
{
	public static void main(String a[]) throws Exception
	{
	AddI obj=(AddI)Naming.lookup("ADD");
	int n = obj.add(12,30);
	System.out.println("Sum is:"+n);
	}
}