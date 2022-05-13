/**
*imported a scanner package. 
*/
import java.util.Scanner;
class ReverseNumber
{
	public static void main(String[] args) 
	{
		/**
		*called scanner object to get user value.
		*/
		Scanner s = new Scanner(System.in);
		/**
		*The value should be integer type.
		*/
		System.out.println("Enter the number to be reversed: ");
		int num = s.nextInt();
		int ans = 0;
		while (num>0)
		{
			int rem = num%10;	// extract the last number from given value.
			ans = ans*10+rem;	//stored that value in variable call ans.
			num /= 10;		//every type update the value dividing by 10. 
		}
		/**
		*@return the reverese value of given number.
		*/
		System.out.println(ans);
	}
}
