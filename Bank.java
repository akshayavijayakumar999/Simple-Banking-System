package bankpkg;

public class Bank extends User implements BankingInterface{ // inheritance

	String name;
	Address address; //  Has-A relationship with class Address:aggregation
	double  balance;


	void info(String na,long no,long pn,String h,String d,String st,int p,int n)// doing read and update in same function
	{
		name=na;
		address= new Address(h,d,st,p);
		super.setAccno(no); // Using super Keyword
		setPh(pn);

		if(n==1)
		{
			System.out.println(".....Successfully Registered.......");		
		}
		else if (n==3)
		{

			System.out.println(".....Successfully Updated.......");	
		}
		else
		{

		}
	}

	void deposit(double amount)
	{

		balance=balance+amount;
		System.out.println("Successful Deposit!!....");
		System.out.println();
		System.out.println("Deposited Amount : Rs "+amount+" /only");
		System.out.println("Current Balance : Rs "+balance+" /only");
	}

	void withdraw(double amount)
	{

		balance=balance-amount;

		System.out.println("Successful Withdrawal!!....");
		System.out.println();
		System.out.println("Withdrawn Amount : Rs "+amount+" /only");
		System.out.println("Current Balance : Rs "+balance+" /only");

	}
	@Override
	public
	void display()
	{
		System.out.println("******************************");
		System.out.println("DETAILS");
		System.out.println();
		System.out.println("Hi "+name);
		System.out.println();
		System.out.println("Account Number :"+getAccno());
		System.out.println("Phone Number :"+getPh());
		System.out.println("Address ");
		System.out.println("	House :"+address.gethouse());
		System.out.println("	District :"+address.getDistrict());
		System.out.println("	State :"+address.getState());
		System.out.println("	PIN :"+address.getPin());
		System.out.println("Current Balance : Rs "+balance+" /only");
		System.out.println("******************************");

	}

}
