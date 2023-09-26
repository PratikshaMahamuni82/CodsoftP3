import java.util.Scanner;
public class ATM_Interface {

	public static void main(String[] args) {

int bal= 5000,withdraw,deposit;
Scanner sc=new Scanner(System.in);
while(true)
{
	System.out.println("Choose 1 for withdraw from your XXXX current amount");
	System.out.println("Choose 2 for deposit from your XXXX current amount");
	System.out.println("Choose 3 for Check bank balance of XXXX in your account");
	System.out.println("Choose 4 for EXIT");
	System.out.println("Choose among the following operation you want to perform:");
	int n =sc.nextInt();
	switch(n)
	{
	case 1:
		System.out.println("Enter Amount to be Withdrawn:");
		withdraw = sc.nextInt();
		if(bal >=withdraw)
		{
			bal = bal - withdraw;
			System.out.println("Please collect your money");
			
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
		System.out.println("");
		break;
		
		
	case 2:
		System.out.println("Enter amount you want to deposit:");
		deposit = sc.nextInt();
		bal = bal + deposit;
		System.out.println("Your money has been successfully deposited.");
		System.out.println("");
		break;
		
	case 3:
		System.out.println("Balance : "+bal);
		System.out.println("");
		break;
		
		
	case 4:
		System.exit( 0);
		
				}
}
	}

}
