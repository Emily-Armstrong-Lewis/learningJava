	package examples;

	import java.util.Scanner;

	public class Application {
	
		public static void main(String[] args) {

    Scanner takeNumber = new Scanner(System.in);
//This is some test code I wrote for a homework assignment.
//I will upload the finished copy once the assignment has been graded.
System.out.println("Please enter the number of pennies that you need change for: ");
    int changeToReturn = takeNumber.nextInt();
    int dollarsReturned = changeToReturn / 100;
    int coinsToReturn = changeToReturn % 100;
     System.out.println("dollars returned: " + dollarsReturned);
    System.out.println("remaining change due: " + coinsToReturn);
    int quartersReturned = coinsToReturn / 25;
    coinsToReturn = coinsToReturn-(quartersReturned*25);
    System.out.println("quarters returned: " + quartersReturned);
    System.out.println("remaining change due: " + coinsToReturn);
    int dimesReturned = coinsToReturn / 10;
    coinsToReturn = coinsToReturn-(dimesReturned*10);
    System.out.println("dimes returned: " + dimesReturned);
    System.out.println("remaining change due: " + coinsToReturn);
    int nickelsReturned = coinsToReturn / 5;
    coinsToReturn = coinsToReturn-(nickelsReturned*5);
    System.out.println("nickels returned: " + nickelsReturned);
    System.out.println("remaining change due: " + coinsToReturn);
    System.out.println("pennies returned: " + coinsToReturn);
    coinsToReturn -= coinsToReturn;
    System.out.println("remaining change due: " + coinsToReturn);
  }
}
		}
	
	}
