import java.util.Scanner;


public class DemoAdd {
	
	public static void main(String args[])
	{
		int value1,value2,sum;
		
		System.out.println("Enter Two numbers");
		
		Scanner scan=new Scanner(System.in);
		value1=scan.nextInt();
		value2=scan.nextInt();
		
		sum=value1+value2;
		
		System.out.println("Sum is :  "+sum);
		
	}

}
