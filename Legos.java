
import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;
public class Legos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Variables created//
	double Flight; 
	double Total;
	int HotelCost = 177;
	int NumberOfNights;
	double nairaRate = 416.49;
	double USD;
    double exchangePer = .08;
	double moneyexc;
	double fee = .03;
	double penelty = .05;
	//instructions for input and input storage//
	System.out.println("Enter Last name:");
	String Name = scan.next();
	System.out.println("Enter Air fare expenses: ");
	Flight = scan.nextDouble();
	System.out.println("Enter number of Hotel nights");
	NumberOfNights = scan.nextInt();
	System.out.println("Enter desired USD to convert:");
	USD = scan.nextDouble();
	moneyexc =((USD*nairaRate)*exchangePer);
	//expense report//
	System.out.println("Expense Report:\n\n"+"Last Name: "+Name.substring(0,1).toUpperCase()+ Name.substring(1));
Total = (NumberOfNights*HotelCost)+ Flight;
System.out.println("Airline Fare: "+NumberFormat.getCurrencyInstance(Locale.US).format(Flight));
System.out.println("Hotel Cost: "+NumberFormat.getCurrencyInstance(Locale.US).format(NumberOfNights*HotelCost)+"\nTotal: "+NumberFormat.getCurrencyInstance(Locale.US).format(Total));
System.out.println("\nCurrency Converter:\n"+NumberFormat.getCurrencyInstance(Locale.US).format(USD)+" is "+(USD*nairaRate-moneyexc)+"NGN");
System.out.println("Processing Fee 3%:"+((USD*nairaRate)*fee)+"NGN");
System.out.println("penalty fee 5%:"+((USD*nairaRate)*penelty)+"NGN");


	}

}
