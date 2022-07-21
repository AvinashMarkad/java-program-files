import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

class LoanManagementSystem
{	
	static double PercentRatePerAnum = 12;
	
	public static void input(double principalAmount, int loanTenure)
	{
		Date currentDate = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
		System.out.println(" Loan creation date : "+dateFormat.format(currentDate));
		

		System.out.println(" Principal Amount : "+principalAmount);
		System.out.println(" No Of EMI’s	: "+loanTenure);

		double totalAmount = principalAmount + (principalAmount * (PercentRatePerAnum/100));
		System.out.println(" Total payable amount : "+totalAmount);

		emi(principalAmount, loanTenure, totalAmount);
		
	}

	public static void emi(double principalAmount, int loanTenure, double totalAmount)
	{

		double ratePerMonth = PercentRatePerAnum/(12*100) ;
		double rPlusOne = ratePerMonth +1;
		double ratePow = 1.0;

		for(int i = 0; i<=loanTenure; i++)
		{
			ratePow = ratePow * rPlusOne;
		}
		
		double principalEMI = (principalAmount * ratePerMonth * ratePow)/(ratePow - 1);
		
		double totalEMI = (totalAmount * ratePerMonth * ratePow)/(ratePow - 1);
		
		double interestEMI = totalEMI - principalEMI;

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
		Calendar c = Calendar.getInstance();
		
		System.out.println( "<-------EMI Details-------->");
		for(int i= 1; i<=loanTenure; i++)
		{

			System.out.println(" EMI No : "+i);
			System.out.println(" Principal EMI : "+principalEMI);
			System.out.println(" Total EMI :"+totalEMI);
			System.out.println(" Interest EMI : "+interestEMI);
		
			c.add(Calendar.DATE, 30);  
			
			String newDate = dateFormat.format(c.getTime());  
			System.out.println(" EMI Date: "+newDate); 
			
		    totalAmount = totalAmount - totalEMI;
			System.out.println( " Principal Remaining : "+totalAmount);
			
		}

	}
}

public class Main1{
	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name of Employee");
		String name=sc.next();

		System.out.println("Enter the Principal Amount");
		double principalAmount = sc.nextDouble();

		System.out.println("Enter the loan tenure(No of EMI’s) in month");
		int loanTenure = sc.nextInt();

		input(principalAmount,loanTenure);

	}
}