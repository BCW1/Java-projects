import java.util.Scanner;
public class AirlineDriver {public static void main (String[] args)
{
char [][] layout = { {'A', 'B','C','D'},
					 {'A', 'B','C','D'}, 
					 {'A', 'B','C','D'},
					 {'A', 'B','C','D'}};

	displaySeats(layout);
	
}
public static void displaySeats(char [][] plane)
{Scanner scan = new Scanner(System.in);

	for (int row = 0; row < plane.length; row++)
    {	System.out.print("   " + (row + 1) + "  ");}
	//	add for loop to display one row
    //     display row
    for (int i= 0; i < 4; i++)
    {	System.out.print("\n   " + (plane[i][i]) + "  ");
    }for (int i= 0; i < 4; i++)
    {	System.out.print("\t   " + (plane[i][i]) + "  ");
    }
}


}
