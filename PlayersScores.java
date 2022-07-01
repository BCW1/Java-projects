import java.util.ArrayList;
import java.util.Scanner;

public class PlayersScores {

	public static void main(String[] args) {
		//variables and arrays//
		Scanner user = new Scanner(System.in);
		int quarterH = 1;
		int quarterA = 1;
		int TotalA = 0;
		int TotalH =0;
		int[][]pointsAway = new int [4][4];
		int[][]pointsHome = new int [4][4];
		String[]playersHome = new String [4];
		String[]playersAway = new String [4];
		String[]playersLHome = new String [4];
		String[]playersLAway = new String [4];
		//entering name home team//
		System.out.println("Enter 4 players first Name");
		playersHome[0] = user.next();
	    playersHome[1]= user.next();
	    playersHome[2]= user.next();
	    playersHome[3]= user.next();
	    System.out.println("Enter 4 players last Name");
	    playersLHome[0]= user.next();
	    playersLHome[1]= user.next();
	    playersLHome[2]= user.next();
	    playersLHome[3]= user.next();
	  //entering name away team//
		System.out.println("Enter 4 oppsing players first Name");
		playersAway[0]= user.next();
	    playersAway[1]= user.next();
	    playersAway[2]= user.next();
	    playersAway[3]= user.next();
	    System.out.println("Enter 4 oppsing players last Name");
	    playersLAway[0]= user.next();
	    playersLAway[1]= user.next();
	    playersLAway[2]= user.next();
	    playersLAway[3]= user.next(); 
	    //entering point for each player by quarter//
		System.out.println("Enter quarter 1 Home Team PTS in the same order of player");
		pointsHome[0][0]=user.nextInt();
		pointsHome[0][1]=user.nextInt();
		pointsHome[0][2]=user.nextInt();
		pointsHome[0][3]=user.nextInt();
		System.out.println("Enter quarter 1 Away Team PTS in the same order of player");
		pointsAway[0][0]=user.nextInt();
		pointsAway[0][1]=user.nextInt();
		pointsAway[0][2]=user.nextInt();
		pointsAway[0][3]=user.nextInt();
		System.out.println("Enter quarter 2 Home Team PTS in the same order of player");
		pointsHome[1][0]=user.nextInt();
		pointsHome[1][1]=user.nextInt();
		pointsHome[1][2]=user.nextInt();
		pointsHome[1][3]=user.nextInt();
		System.out.println("Enter quarter 2 Away Team PTS in the same order of player");
		pointsAway[1][0]=user.nextInt();
		pointsAway[1][1]=user.nextInt();
		pointsAway[1][2]=user.nextInt();
		pointsAway[1][3]=user.nextInt();
		System.out.println("Enter quarter 3 Home Team PTS in the same order of player");
		pointsHome[2][0]=user.nextInt();
		pointsHome[2][1]=user.nextInt();
		pointsHome[2][2]=user.nextInt();
		pointsHome[2][3]=user.nextInt();
		System.out.println("Enter quarter 3 Away Team PTS in the same order of player");
		pointsAway[2][0]=user.nextInt();
		pointsAway[2][1]=user.nextInt();
		pointsAway[2][2]=user.nextInt();
		pointsAway[2][3]=user.nextInt();
		System.out.println("Enter quarter 4 Home Team PTS in the same order of player");
		pointsHome[3][0]=user.nextInt();
		pointsHome[3][1]=user.nextInt();
		pointsHome[3][2]=user.nextInt();
		pointsHome[3][3]=user.nextInt();
		System.out.println("Enter quarter 4 Away Team PTS in the same order of player");
		pointsAway[3][0]=user.nextInt();
		pointsAway[3][1]=user.nextInt();
		pointsAway[3][2]=user.nextInt();
		pointsAway[3][3]=user.nextInt();
		//Prints of points and names for each player//
		System.out.println("Home Team Points:");
		System.out.println(playersHome[0].toUpperCase()+" "+playersLHome[0].substring(0,1).toUpperCase()+playersLHome[0].substring(1)+"\t"+playersHome[1].toUpperCase()+" "+
		playersLHome[1].substring(0,1).toUpperCase()+playersLHome[1].substring(1)+"\t"+playersHome[2].toUpperCase()+" "+playersLHome[2].substring(0,1).toUpperCase()+playersLHome[2].substring(1)+"\t"+playersHome[3].toUpperCase()+" "
		+playersLHome[3].substring(0,1).toUpperCase()+playersLHome[3].substring(1));
		for  (int r=0; r < pointsHome.length; r++) {System.out.println("Quarter"+(quarterH++)+"\n");

			for (int c=0; c < pointsHome[r].length; c++) {TotalH+=pointsHome[r][c];

			System.out.print(pointsHome[r][c]+ "\t\t" );
			}
			System.out.println ("Home: "+ TotalH) ; 
	}
	System.out.println("Away Team Points:");
	System.out.println(playersAway[0].toUpperCase()+" "+playersLAway[0].substring(0,1).toUpperCase()+playersLAway[0].substring(1)+"\t"+playersAway[1].toUpperCase()+" "+
			playersLAway[1].substring(0,1).toUpperCase()+playersLAway[1].substring(1)+"\t"+playersAway[2].toUpperCase()+" "+playersLAway[2].substring(0,1).toUpperCase()+playersLAway[2].substring(1)+"\t"+playersAway[3].toUpperCase()+" "
			+playersLAway[3].substring(0,1).toUpperCase()+playersLAway[3].substring(1));
	for  (int rr=0; rr < pointsAway.length; rr++) {System.out.println("Quarter"+(quarterA++)+"\n");

	for (int cc=0; cc < pointsAway[rr].length; cc++) {TotalA+=pointsAway[rr][cc];

	System.out.print(pointsAway[rr][cc]+ "\t\t" );
	}
	System.out.println ("Away: "+TotalA) ; 
	}
	System.out.println("Home: "+TotalH+" Away: "+TotalA);
		
		
	}

}
