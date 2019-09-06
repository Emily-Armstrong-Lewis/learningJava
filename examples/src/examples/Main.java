package examples;

import java.util.Scanner;

public class Main {

	  public static void main(String[] args) {
	    System.out.println("Hello world!");
	    Scanner scanning = new Scanner(System.in);
	    System.out.println("Please enter a string.....");
	    String scanThis = scanning.next();
	    String scannedWords = scanThis;
	    System.out.println(scannedWords);
	    int i = 0;
	    while (i<=scanThis.length()){
	      scannedWords = scannedWords + " " + scanning.next();
	      System.out.println(scannedWords);
	      i++;
	    }
	    /*System.out.println(scanThis);
	    scanThis = scanThis + " " + scanning.next();
	    System.out.println(scanThis);
	    scanThis = scanThis + " " + scanning.next();
	    System.out.println(scanThis);*/
	    System.out.println("fin");
	  }
	}
