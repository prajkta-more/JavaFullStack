package Tyif;
import java.util.Scanner;
public class ATM_Functions 
{
	static int bal,debit,credit,total;
	static Scanner sc=new Scanner(System.in);
	void bal()
	{
		System.out.println("\nEnter Your Balance:");
		bal=sc.nextInt();
		System.out.println("Balance:"+bal);
	}
	
	void debit()
	{
		System.out.println("Enter amount to debit:");
	debit=sc.nextInt();
	bal=bal-debit;
	System.out.println("Debited"+debit+"Successfully");
	 System.out.println("Aftre Debit"+debit+" Available Balance:"+bal);
	}
	void show()
	{
		System.out.println("Enter Total Balance:");
		total=sc.nextInt();
	System.out.println("Total balance:"+total);
	}
	 void credit()
	 {
		 System.out.println("Enter amount to credit:");
		 credit=sc.nextInt();
	 bal=bal+credit;
	 System.out.println("After Credit "+credit+" Available Balance:"+bal);
	 }
	 
	public static void main(String[] args) 
	{
		System.out.println("****ATM Functionality(Credit,Debit,Balance.)****");
		MiniProject o=new MiniProject();
		int n1;
		o.bal();
		System.out.println("\nEnter Your Choice:");
		n1=sc.nextInt();
		switch(n1)
		{
		case 1:
			o.show();
			break;
		case 2:
			o.credit();
			break;
		case 3:
			o.debit();
			break;
			default:
				System.out.println("Invalid Choice..");
			break;
		}//switch end
	}//main end.

}//class end.
