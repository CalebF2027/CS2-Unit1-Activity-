// 1. IMPORT Scanner CLASS
import java.util.Scanner;

public class Main {

   public static void main(String []args) {
      System.out.println("Let's play MadLibs!");

    // 2. Set up a Scanner OBJECT
      Scanner input = new Scanner(System.in);
      // System.in refers to the physical keyboard!

      // 3. Use the Scanner to take input
      System.out.println("Type your name then press enter: ");
      String player = input.nextLine();
      System.out.println("Welcome, " + player);

      System.out.print("Enter an adjective: ");
     String adjective1 = input.nextLine();
       System.out.print("Enter a place: ");
      String place1 = input.nextLine();
       System.out.print("Enter a noun: ");
      String noun1 = input.nextLine();
       System.out.print("Enter a verb: ");
      String verb1 = input.nextLine();
       System.out.print("Enter an adverb: ");
      String adverb1 = input.nextLine();
        System.out.print("Enter an adjective: ");
      String adjective2 = input.nextLine();
           System.out.print("Enter a place: ");
      String place2 = input.nextLine();
        System.out.print("Enter a noun: ");
      String noun2 = input.nextLine();
        System.out.print("Enter an adverb: ");
      String adverb2 = input.nextLine();
        System.out.print("Enter a verb: ");
      String verb2 = input.nextLine();

      String sentence1 = " Today I was " + adjective1 + " because I had to go to " + place1 + " I saw a " + noun1 + " I was scared so I deicded to " + verb1 + " I ran to school " + adverb1 + " I was not " + adjective2 + " After school I went to my " + place2 + " I scrolled on my " + noun2 + " I did my homework from " + adverb2 + " I went on a " + verb2;

      System.out.println(sentence1);
   }
}
