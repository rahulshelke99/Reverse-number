import java.util.Scanner;
class ReverseNumber
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
