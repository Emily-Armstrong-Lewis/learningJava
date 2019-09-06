import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Scanner scanning = new Scanner(System.in);
    System.out.println("Please enter a string.....");
    //by doing .nextLine from the beginning, I can use the created scanner (scanning) multiple times for input
    String scanThis3 = scanning.nextLine();
    System.out.println(scanThis3);


    System.out.println("Please enter another string.....");
    
    // counts number of characters in first word and uses that to dictate the number of iterations to loop through which is incorrect.
    // need to find a way to count words in the string and use that for the loop instead of .length.
    //maybe put each word into an array and than loop through the array? are arrays even a thing in Java?
    String scanThis = scanning.next();
    System.out.println("length is..." + scanThis.length());
    System.out.println(scanThis);
    String scannedWords = scanThis;
    System.out.println("1 scannedWords = " + scannedWords);
    int i = 2;
    while (i<=scanThis.length()){
      System.out.println("2 scannedWords = " + scannedWords);
      scannedWords = scannedWords + " " + scanning.next();
      System.out.println("3 scannedWords = " + scannedWords);
      System.out.println("i = " + i);
      i++;
    }
    
    //after using .next(), I have to create a new scanner since .nextLine will by default return the remaining words from the first string. if there are no words remaining in the string, the program skips this step.
    Scanner scanning2 = new Scanner(System.in);
    System.out.println("Please enter another string.....");
    String scanThis2 = scanning2.nextLine();
    System.out.println(scanThis2);

    System.out.println("fin");
  }
}
