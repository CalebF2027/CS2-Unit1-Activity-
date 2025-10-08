// 1. IMPORT Scanner CLASS
import java.util.Scanner;

public class Main {

   public static void main(String []args) {
      System.out.println("Let's play MadLibs!");

    // 2. Set up a Scanner OBJECT
      Scanner scan = new Scanner(System.in);
      // System.in refers to the physical keyboard!

      // 3. Use the Scanner to take input
      System.out.println("Type your name then press enter: ");
      String player = scan.nextLine();
      System.out.println("Welcome, " + player);

     String adjective1 = "angry";
     System.out.print("Enter an adjective: ");
      String place1 = "school";
      System.out.print("Enter a place: ");
      String noun1 = "plant";
      System.out.print("Enter a noun: ");
      String verb1 = "jump";
      System.out.print("Enter a verb: ");
      String adverb1 = "quickly";
      System.out.print("Enter an adverb: ");
      String adjective2 = "happy";
      System.out.print("Enter an adjective: ");
      String place2 = "house";
      System.out.print("Enter a place: ");
      String noun2 = "phone";
      System.out.ptint("Enter a noun: ");
      String adverb2 = "yesterday";
      System.out.print("Enter an adverb: ");
      String verb2 = "run";
      System.out.print("Enter a verb: ");

      String sentence1 = " Today I was " + adjective1 + " because I had to go to " + place1 + " I saw a " + noun1 + " I was scared so I deicded to " + verb1 + " I ran to school " + adverb1 + " I was not " + adjective2 + " After school I went to my " + place2 + " I scrolled on my " + noun2 + " I did my homework from " + adverb2 + " I went on a " + verb2;

      System.out.println(sentence1);
   }
}
