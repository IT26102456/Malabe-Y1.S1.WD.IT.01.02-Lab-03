import java.util.Scanner;

public class IT26102456Lab3Q1B {
	
    public static void main (String[]args){
		
		double priceperkg, quantity, totalprice;
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter the price of 1kg of rice:");
	priceperkg = input.nextDouble();
	
	System.out.print("Enter the number of kilograms you want to buy:");
	quantity = input.nextDouble();
	
	totalprice = priceperkg * quantity;
	double discount = totalprice * 0.10; 
	double finalamount = totalprice - discount;
	
	System.out.println("\nThe total amount with 10% discount is:" + finalamount);
	input.close();
	}
}