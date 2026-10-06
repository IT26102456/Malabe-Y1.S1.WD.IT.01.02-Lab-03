import java.util.Scanner;

public class IT26102456Lab3Q2A {
	
    public static void main (String[]args) {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter mountly Salary:");
		double monthlySalary = obj.nextDouble();
		
		System.out.print("Enter OT rate:");
		double OTrate = obj.nextDouble();
		
		System.out.print("Enter OT hours:");
		double OThours = obj.nextDouble();
		
		double Totalsalary = monthlySalary +(OThours * OTrate);
		System.out.print("Total Salary:"+ Totalsalary );
	}
}

		
		
		 