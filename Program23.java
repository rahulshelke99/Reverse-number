// WAJP to reverse print the given number?
import java.util.Scanner;
class Program23 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to be reversed: ");
		int num = s.nextInt();
		int ans = 0;
		while (num>0)
		{
			int rem = num%10;
				ans = ans*10+rem;
				num /= 10;
		}
		System.out.println(ans);
	}
}
