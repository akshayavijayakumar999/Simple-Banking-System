package bankpkg;

import java.util.Scanner;

public class Implementation {
	public static void main(String[] args) {

		String na,h,d,st;
		int p;
		double amount;
		int n1,n2;
		char c1,c2;
		long num=1234;
		long accno,pn;


		Scanner s = new Scanner(System.in);
		Bank b =new Bank();
		b.info("Athira",5678,8086565047L,"Pariyathukunnel","Kottayam","Kerala",686502,0);
		b.balance=3000;

		do {

			System.out.println("//****** Welcome to SBI ******//");
			System.out.println();
			System.out.println("1. New Registration");
			System.out.println("2. Login User");

			System.out.println("Please Enter Your Choice : ");
			n1 = s.nextInt();

			switch(n1)
			{
			case 1:
			{
				System.out.println("Enter your Name:");
				na = s.next();
				System.out.println("Enter your Phone Number:");
				pn = s.nextLong();
				System.out.println("Enter your House Name:");
				h = s.next();
				System.out.println("Enter your District:");
				d = s.next();
				System.out.println("Enter your State:");
				st = s.next();
				System.out.println("Enter your PIN:");
				p = s.nextInt();	
				b.info(na,num ,pn, h, d, st, p,n1);
				b.balance=0;
				System.out.println();
				System.out.println("PLease Note,Your Account Number: "+b.getAccno());
				System.out.println();
				break;
			}
			case 2:

				System.out.println("Enter your Account number:");
				accno=s.nextLong();
				if(accno==1234||accno==5678)
				{   // opening if else loop

					do {
						System.out.println("//***** Welcome to SBI,ACCOUNT NUMBER : "+b.getAccno()+"//");// nested cases
						System.out.println("1. Deposit");
						System.out.println("2. Withdrawal");
						System.out.println("3. Update Personal Details");
						System.out.println("4. View Details/ Balance ");
						System.out.println("5. Delete Account");

						System.out.println("Please Enter Your Choice : ");

						n2 = s.nextInt();

						switch(n2)
						{

						default:System.out.println("Invalid Choice");
						break;
						case 1:
							System.out.println("Please Enter Your Amount : ");
							amount=s.nextDouble();
							b.deposit(amount);
							break;

						case 2:
							System.out.println("Please Enter Your Amount : ");
							amount=s.nextDouble();
							if(b.balance>amount)
							{
								b.withdraw(amount);
							}
							else
							{
								System.out.println("Sorry ..Insufficient Balance...");
								System.out.println("Current Balance : Rs "+b.balance+" /only");
							}

							break;	

						case 3:
							System.out.println("Enter your Name");
							na = s.next();
							System.out.println("Enter your Phone Number:");
							pn = s.nextLong();
							System.out.println("Enter your House Name:");
							h = s.next();
							System.out.println("Enter your District:");
							d = s.next();
							System.out.println("Enter your State:");
							st = s.next();
							System.out.println("Enter your PIN:");
							p = s.nextInt();
							b.info(na,accno ,pn, h, d, st, p,n2);


							break;
						case 4:

							b.display();

							break;
						case 5:
							b=null;
							System.out.println("Account have got deleted...");

						}// closing inner Switch

						System.out.println("Do you want to continue?(Y/N): ");	
						c2=s.next().charAt(0); 
					}// closing inner do	

					while(c2=='y'||c2=='Y');
				} // closing if
				else {
					System.out.println("Please Enter A valid Account Number!!!");
				}

				break;

			default:System.out.println("Invalid Choice");
			break;
			}// closing outer Switch

			System.out.println("Do you want to Logout?(Y/N): ");	
			c1=s.next().charAt(0); 
		}// closing outer do

		while(c1=='n'||c1=='N');
		s.close();	


	}

}
